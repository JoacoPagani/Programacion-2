






{Se leen desde teclado los datos correspondientes a pacientes que dieron positivo al examen de
COVID-19 en Argentina. De cada uno de ellos se conoce: DNI, Código postal y nombre de la
ciudad donde vive.
Ejercicio 1: Con la información anterior, se quiere armar un mapa en el que aparezca por cada
            ciudad, la cantidad total de habitantes infectados. Este mapa debe estar ordenado
            por código postal para que la búsqueda por dicho criterio sea eficiente.
            a) Implementen el mapa de información.
            b) Implementen un módulo que informe la cantidad de infectados de aquellas
            localidades que tienen código postal entre 1800 y 1900.
Ejercicio 2: Con la información leída, se pide recopilar por cada ciudad, los
            DNIs de los habitantes infectados. Esta estructura debe estar ordenada por código postal
            para que la búsqueda por dicho criterio sea eficiente.
            a) Implementen y completen a partir de la lectura de la información la nueva estructura de datos.
            b) Implementen un módulo que informe la cantidad de infectados de 
            aquellas localidades que tienen código postal entre 1800 y 1900.
Ejercicio 3: Comparen lo realizado en los ejercicios anteriores y debatan. ¿Qué diferencias
            existen entre la estructura de datos del Ejercicio 1 respecto de la utilizada en el Ejercicio 2?
            ¿Cómo procesaron la información leída desde teclado para cada una de ellas?
            ¿Cambió algo en el recorrido b) entre las soluciones?}

Program ActividadColaborativaParte2;

Type 

  infoArbol1 = Record
    CodigoPostal: integer;
    CantidadInfetados: integer;
  End;

  Arbol1 = ^NodoA1;
  NodoA1 = Record
    Dato: infoArbol1;
    HI: Arbol1;
    HD: Arbol1;
  End;

  infoLista = Record
    Dni: longint;
    CodigoPostal: integer;
    Ciudad: string;

  End;
  Lista = ^NodoL;
  NodoL = Record
    dato: infoLista;
    Sig: Lista;
  End;

  Arbol2 = ^NodoA2;
  NodoA2 = Record
    Dato: lista;
    HI: Arbol2;
    HD: Arbol2;
  End;



{LeerPacientes - Lee un paciente con el dni diferente de 0}
Procedure LeerPacientes(Var i: infoLista);
Begin
  write('Ingrese el Dni del paciente: ');
  readln(i.dni);
  If (i.dni <> 0) Then
    Begin
      write('Ingrese el Codigo postal: ');
      readln(i.CodigoPostal);
      write('Ingrese La ciudad:');
      readln(i.Ciudad);
    End;
End;


{InsertarArbol1 - inserta un elemento al arbol1, si es repetido agrega uno a la cantidad de infestados}
Procedure InsertarArbol1(Var a: arbol1; CP: Integer);
Begin
  If (a = Nil) Then
    Begin
      new(a);
      a^.dato.CodigoPostal := CP;
      a^.dato.CantidadInfetados := 1;
    End
  Else
    If (a^.dato.CodigoPostal > CP ) Then InsertarArbol1(a^.HI, CP)
  Else If ( a^.dato.CodigoPostal < CP ) Then InsertarArbol1(a^.HD, CP)
  Else a^.dato.CantidadInfetados := a^.dato.CantidadInfetados + 1;
End;


{AgregarAdelante - Agrega un elemento a una lista}
Procedure AgregarAdelante(Var l: Lista; i: infoLista);

Var nuevoNodo: Lista;
Begin
  new(nuevoNodo);
  nuevoNodo^.dato := i;
  nuevoNodo^.sig := l;
  l := nuevoNodo;
End;


{InsertarArbol2 - inserta una lista al arbol2}
Procedure InsertarArbol2(Var a: Arbol2; i: infoLista);
Begin
  If (a = Nil) Then
    Begin
      new(a);
      a^.dato := Nil;
      AgregarAdelante(a^.dato,i);
    End
  Else
    If (a^.dato^.dato.CodigoPostal > i.CodigoPostal ) Then InsertarArbol2(a^.HI, i)
  Else If ( a^.dato^.dato.CodigoPostal < i.CodigoPostal ) Then InsertarArbol2(a^.HD, i)
  Else AgregarAdelante(a^.dato,i);
  //Agrega adelante en una lista 
End;


{GenerarArboles - Lee la informacion y la inserta en los arboles respectivamente}
Procedure GenerarArboles(Var a1: arbol1;Var a2: arbol2);

Var i: infoLista;
Begin
  LeerPacientes(i);
  While (i.dni <> 0) Do
    Begin
      InsertarArbol1(a1,i.CodigoPostal);
      InsertarArbol2(a2,i);
      LeerPacientes(i);
    End;
End;


{EnOrden1Acotado - Imprime los datos que se encuentran dentro de los limites en orden}
Procedure EnOrden1Acotado(a: arbol1; inf, sup: integer);
Begin
  If (a <> Nil) Then
    Begin
      If (a^.dato.CodigoPostal <= sup) Then
        If (a^.dato.codigoPostal >= inf) Then
          Begin
            EnOrden1Acotado(a^.HI, inf, sup);
            Writeln('CP: ', a^.dato.CodigoPostal, ' / CantInfestados: ', a^.dato.CantidadInfetados);
            EnOrden1Acotado(a^.HD, inf,sup);
          End
      Else
        EnOrden1Acotado(a^.HD,inf,sup)
      Else
        EnOrden1Acotado(a^.HI,inf,sup);
    End;
End;

{LeerLista - Imprime los DNI de los habitantes infectados en una lista}
Procedure LeerLista(l: lista);
Begin
  If (l <> Nil) Then
    Begin
      Writeln('DNI: ', l^.dato.Dni);
      LeerLista(l^.sig);
    End;
End;


Procedure EnOrden2Acotado(a: arbol2; inf, sup: integer);
Begin
  If (a <> Nil) Then
    Begin
      If (a^.dato^.dato.CodigoPostal <= sup) Then
        If (a^.dato^.dato.CodigoPostal >= inf) Then
          Begin
            EnOrden2Acotado(a^.HI, inf, sup);
            LeerLista(a^.dato);
            EnOrden2Acotado(a^.HD, inf,sup);
          End
      Else
        EnOrden2Acotado(a^.HD,inf,sup)
      Else
        EnOrden2Acotado(a^.HI,inf,sup);
    End;
End;



{Programa Principal}

Var 

  a1: arbol1;
  a2: arbol2;

Begin
  a1 := Nil;
  a2 := Nil;
  GenerarArboles(a1, a2);
  EnOrden1Acotado(a1, 1800, 1900);
  EnOrden2Acotado(a2, 1800, 1900);

End.
