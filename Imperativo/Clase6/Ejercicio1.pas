
Program ejercicio1;

Uses 
sysutils;

Type 
  str10 = string[10];
  jugador = Record
    dni: longint;
    nombreApellido: string;
    posicion: str10;
    puntaje: integer;
  End;

  lista = ^nodoLista;
  nodoLista = Record
    dato: jugador;
    sig: lista;
  End;

  partido = Record
    estadio: string;
    equipoLocal: string;
    equipoVisitante: string;
    fecha: str10;
    jugadores: lista;
  End;

  listaPartidos = ^nodoPartido;
  nodoPartido = Record
    dato: partido;
    sig: listaPartidos;
  End;

  //codigo nuestro

  PartidoJugador = Record
    Fecha: str10;
    Puntaje: integer;
  End;

  ListaJugador = ^nodo;
  nodo = Record
    dato: PartidoJugador;
    sig: ListaJugador;
  End;

  infoA = Record
    Dni: longint;
    nombreApellido: string;
    posicion: str10;
    lista: ListaJugador;
  End;

  Arbol = ^NodoA;
  NodoA = Record
    dato: infoA;
    HD: Arbol;
    HI: Arbol;
  End;


Procedure cargarFecha(Var s: str10);

Var 
  dia, mes: integer;
Begin
  dia := random(30)+1;
  mes := random(12)+1;
  If (mes = 2) And (dia > 28)Then
    dia := 31;
  If ((mes = 4) Or (mes = 6) Or (mes =9) Or (mes = 11)) And (dia = 31)Then
    dia := 30;
  s := Concat('2022/',IntToStr(mes),'/',IntToStr(dia));
End;

Procedure agregar(Var l: listaPartidos; p: partido);

Var 
  aux: listaPartidos;
Begin
  new(aux);
  aux^.dato := p;
  aux^.sig := l;
  l := aux;
End;

Procedure agregarJugador(Var l: lista; j: jugador);

Var 
  aux: lista;
Begin
  new(aux);
  aux^.dato := j;
  aux^.sig := l;
  l := aux;
End;

Procedure cargarJugadores(Var l: lista);

Var 
  j: jugador;
  cant, i, pos: integer;
Begin
  cant := random(10)+22;
  For i:=1 To cant Do
    Begin
      With (j) Do
        Begin
          dni := random(36000000)+20000000;
          nombreApellido := Concat('Jugador-', IntToStr(dni));
          pos := random(4)+1;
          Case pos Of 
            1: posicion := 'arquero';
            2: posicion := 'defensa';
            3: posicion := 'mediocampo';
            4: posicion := 'delantero';
          End;
          puntaje := random(10)+1;
        End;
      agregarJugador(l, j);
    End;
End;

Procedure crearLista(Var l: listaPartidos);

Var 
  p: partido;
  cant, i: integer;
Begin
  cant := random(10);
  For i:=1 To cant Do
    Begin
      With (p) Do
        Begin
          estadio := Concat('Estadio-', IntToStr(random (500)+1));
          equipoLocal := Concat('Equipo-', IntToStr(random (200)+1));
          equipoVisitante := Concat('Equipo-', IntToStr(random (200)+1));
          cargarFecha(fecha);
          jugadores := Nil;
          cargarJugadores(jugadores);
        End;
      agregar(l, p);
    End;
End;



Procedure imprimirJugador(j: jugador);
Begin
  With (j) Do
    Begin
      writeln('Jugador: ', nombreApellido, ' con dni ',dni, ' en posicion: ', posicion, ' y puntaje: ', puntaje);
    End;
End;

Procedure imprimirJugadores(l: lista);
Begin
  While (l <> Nil) Do
    Begin
      imprimirJugador(l^.dato);
      l := l^.sig;
    End;
End;

Procedure imprimir(p: partido);
Begin
  With (p) Do
    Begin
      writeln('');
      writeln('Partido en el ', estadio, ' entre ',equipoLocal, ' y ', equipoVisitante, ' jugado el: ', fecha, ' por los siguientes jugadores: ');
      imprimirJugadores(jugadores);
    End;
End;

Procedure imprimirLista(l: listaPartidos);
Begin
  While (l <> Nil) Do
    Begin
      imprimir(l^.dato);
      l := l^.sig;
    End;
End;


{AgregarAdelante - agrega un nuevo a una lista}
Procedure AgregarAdelante(Var l: ListaJugador; p:integer; f:str10);

Var nue: ListaJugador;
Begin
  new(nue);
  nue^.dato.puntaje := p;
  nue^.dato.fecha := f;
  nue^.sig := l;
  l := nue;
End;


{InsertarArbol - inserta ordenado el jugador en el arbol, si es repetido agrega el partido}
Procedure InsertarArbol(Var a: arbol; i: jugador; fecha: str10);
Begin
  If (a = Nil) Then
    Begin
      new(a);
      a^.dato.dni := i.dni;
      a^.dato.nombreApellido := i.nombreApellido;
      a^.dato.posicion := i.posicion;
      a^.dato.lista := Nil;
      AgregarAdelante(a^.dato.lista,i.puntaje, fecha);
    End
  Else
    If (a^.dato.dni > i.dni ) Then InsertarArbol(a^.HI, i, fecha)
  Else If ( a^.dato.dni < i.dni) Then InsertarArbol(a^.HD, i, fecha)
  Else AgregarAdelante(a^.dato.lista,i.puntaje, fecha);
End;

Procedure GenerarArbol(Var a: arbol; l:listaPartidos);
Begin
  While (l <> Nil) Do
    Begin
      While (l^.dato.jugadores <> Nil) Do
        Begin
          InsertarArbol(a,l^.dato.jugadores^.dato, l^.dato.fecha);
          l^.dato.jugadores := l^.dato.jugadores^.sig;
        End;
      l := l^.sig;
    End;
End;

Procedure imprimirdatos(a: arbol);

Var 
  p: integer;
Begin
  p := 0;
  writeln('Datos del Jugador: ');
  writeln('DNI: ', a^.dato.Dni);
  writeln('Nombre y apellido: ', a^.dato.nombreApellido);
  writeln('Posicion: ', a^.dato.posicion);
  While (a^.dato.lista <> Nil) Do
    Begin
      p := p + a^.dato.lista^.dato.puntaje;
      a^.dato.lista := a^.dato.lista^.sig;
    End;
  writeln('Total de puntos acumulados: ', p);

End;

Procedure Enorden(a: arbol);
Begin
  If (a <> Nil) Then
    Begin
      Enorden(a^.HD);
      imprimirdatos(a);
      Enorden(a^.HI);
    End;
End;

{ProgramaPrincipal}

Var 
  l: listaPartidos;
  a: arbol;
Begin
  Randomize;
  a := Nil;
  l := Nil;

     {carga automática de la estructura disponible}
  crearLista(l);
  writeln('--------------------------------------');

  writeln ('Lista generada: ');
  imprimirLista(l);
  writeln('------------------------------------');
  GenerarArbol(a,l);
  Enorden(a);


     {Fin del programa}
  writeln('Fin del programa');
  readln;
End.
