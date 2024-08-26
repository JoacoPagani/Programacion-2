







{Una empresa de micros de larga distancia gestiona sus ventas. Necesita almacenarla siguiente
información para sus destinos de viaje: nombre del destino, distancia en kilómetros y la cantidad de pasajes vendidos para dicho destino.
Dicha información se procesa hasta que se lee el destino “Fin”.
    a. Se nos pide diseñar una estructura eficiente de manera tal que por cada destino se almacene su distancia y la cantidad de
    pasajes vendidos para el mismo. La estructura generada debe ser la más eficiente en  cuanto a la búsqueda de un destino.
    b. Creen un programa que muestre un menú de opciones para:
        - Inicializar las estructuras de datos a utilizar en su funcionamiento.
        - Cargar un destino a la estructura utilizada.
        - Imprimir la información contenida en la estructura de datos utilizada.
        - Buscar un destino dentro de la estructura de datos utilizada y mostrar toda su información.
        - Buscar e informar el destino más cercano.
        - Sumar una cantidad X de pasajes a un destino.}


Program ActividadColaborativa

Type 

  //Definimos la estructura de datos que vamos a utilizar
  info = Record
    nombre : string;
    distancia : integer;
    pasajesVendidos : integer;
  End;

  //Definimos el arbol de info
  arbol = ^nodoA;

  nodoA = Record
    dato : info;
    HI : arbol;
    HD : arbol;
  End;










//el arbol es la estructura mas eficiente a la hora de realizar busquedas, el tiempo medio es O(log n)








{-----------------------------------------------------------------------------
Insertar Arbol - Inserta un arbol en un arbol binario de busqueda}
Procedure insertar(Var a: arbol; i: info);
Begin
  If (a = Nil) Then
    Begin
      new (a);
      a^.dato := i;
      a^.HI := Nil;
      a^.HD := Nil;
    End
  Else
    If a^.dato.nombre > info.nombre Then
      insertar(a^.HI, i)
  Else
    If  a^.dato.mombre < info.nombre Then
      insertar(a^.HD, i);
  Else
    writeln('El destino ya fue ingresado');
End;









{-------------------------------------------------------------------------------
Leer Info - Carga la informacion}
Procedure LeerInfo(Var i: info);
Begin
  Write('Nombre del destino: ');
  readln(i.nombre);
  If (i.destino <> 'Fin') Then
    Begin
      Write('Distancia: ');
      readln(i.distancia);
      Write('Pasajes vendidos: ');
      readln(i.pasajesVendidos)
    End;
End;

Procedure cargarEstructura(Var a:arbol);
Begin
  LeerInfo(i);
  While (i.destion <> 'Fin') Do
    Begin
      insertar(a, info)
      LeerInfo(i);
    End;
End;

Procedure CargarDestino(Var a:arbol);

Var i: info;
Begin
  LeerInfo(i);
  insertar(a,i)
End;

Procedure ImprimirInfo(i);
Begin
  writeln('Destino: 'i.nombre, ' - Dist ', i.distancia, ' - Pasajes vendidos: ',
          i.pasajesVendidos);
End;

Procedure EnOrden(a:arbol);
Begin
  If (a <> Nil) Then
    Begin
      EnOrden(a^.HI);
      ImprimirInfo(a^.dato);
      EnOrden(a^.HD);
    End;
End;

Function Buscar(a: arbol; d: String): arbol;
Begin
  Buscar := Nil;
  If (a <> Nil) Then
    Begin
      If (a^.dato.nombre < d ) Then
        Buscar(a^.HD, d)
      Else
        If (a^.dato.nombre > d ) Then
          Buscar(a^.HI, d)
      Else
        buscar := a;
    End;
End;



Procedure BuscarDestino(a:arbol);

Var d: string;
  p: arbol;
Begin
  write('Ingrese el destino a buscar: ');
  readln(d);
  p := Buscar(a,d);
  If (p <> Nil) Then ImprimirInfo(a^.dato);
  Else writeln('No se encontro el destino')
End;

Procedure minimo( a: arbol; Var pmin:arbol);
Begin
  If ( a <> Nil ) Then
    Begin
      If (a^.info.canttw < pmin^.dato.distancia) Then
        Begin
          pmin := a;
        End;
      Minimo(a^.HI,pmin);
      Minimo(a^.HD,pmin);
    End;
End;


Procedure sumarPasajes(a:arbol);

Var d: string;
  sum: integer;
  punta: arbol;
Begin
  write('Ingrese el destino para agregar los pasajes: ');
  readln(d);
  write('Ingrese la Cantidad de pasajes que quiere sumar: ');
  readln(sum)
  punta := buscar(a,d);
  punta^.dato.pasajesVendidos := punta^.dato.pasajesVendidos + sum;
End;


// Programa Principal

Var 
  i: info;
