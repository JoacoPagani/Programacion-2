
Program ProgramaGenerarArbol;

Type 

  // Lista de enteros
  lista = ^nodoL;
  nodoL = Record
    dato: integer;
    sig: lista;
  End;

  // Arbol de enteros
  arbol = ^nodoA;
  nodoA = Record
    dato: integer;
    HI: arbol;
    HD: arbol;
  End;

  // Lista de Arboles
  listaNivel = ^nodoN;
  nodoN = Record
    info: arbol;
    sig: listaNivel;
  End;

Procedure InsertarArbol(Var a: arbol; n: integer);
Begin
  If (a = Nil) Then
    Begin
      new(a);
      a^.dato := n;
      a^.HI := Nil;
      a^.HD := Nil;
    End
  Else
    If (n < a^.dato) Then
      InsertarArbol(a^.HI, n)
  Else
    InsertarArbol(a^.HD, n);
End;
























{-----------------------------------------------------------------------------
Insertar Arbol - Inserta un arbol en un arbol binario de busqueda}
Procedure insertar(Var a: arbol; nro: integer);
Begin
  If (a = Nil) Then
    Begin
      new (a);
      a^.dato := nro;
      a^.HI := Nil;
      a^.HD := Nil;
    End
  Else
    If a^.dato > nro Then
      insertar(a^.HI, nro)
  Else
    insertar(a^.HD, nro);
End;

























{-----------------------------------------------------------------------------
AgregarAdelante - Agrega nro adelante de l}
Procedure agregarAdelante(Var l: Lista; nro: integer);

Var 
  aux: lista;
Begin
  new(aux);
  aux^.dato := nro;
  aux^.sig := l;
  l := aux;
End;





















{-------------------------------------------------------------------------------
AGREGARORDENADO - Agrega un elemento ordenado}















{Procedure agregarOrdenado(Var pri: Lista; nro: integer);

Var 
  nuevo, anterior, actual: Lista;
Begin
  new (nuevo);
  nuevo^.dato := nro;
  nuevo^.sig := Nil;
  If (pri = Nil) Then
    pri := nuevo
  Else
    Begin
      actual := pri;
      anterior := pri;
      While (actual<>Nil) And (actual^.dato < nuevo^.dato) Do
        Begin
          anterior := actual;
          actual := actual^.sig;
        End;
      If (anterior = actual) Then
        pri := nuevo
      Else
        anterior^.sig := nuevo;
      nuevo^.sig := actual;
    End;
End;
}


















{-----------------------------------------------------------------------------
CREARLISTA - Genera una lista con n�meros aleatorios }
Procedure crearLista(Var l: Lista);

Var 
  aux: lista;
  n: integer;
Begin
  aux := Nil;
  // Inicializar aux a nil
  n := random(20);
  While (n <> 0) Do
    Begin
      agregarAdelante(aux, n);

      n := random(20);
    End;
  l := aux;
End;

Procedure imprimirLista(l: Lista);
Begin
  While (l <> Nil) Do
    Begin
      write(l^.dato, ' - ');
      l := l^.sig;
    End;
  writeln;
  // Añadir una nueva línea al final de la impresión
End;



















{-----------------------------------------------------------------------------
CONTARELEMENTOS - Devuelve la cantidad de elementos de una lista l }

Function ContarElementos (l: listaNivel): integer;

Var c: integer;
Begin
  c := 0;
  While (l <> Nil) Do
    Begin
      c := c+1;
      l := l^.sig;
    End;
  contarElementos := c;
End;








{-----------------------------------------------------------------------------
AGREGARATRAS - Agrega un elemento atr�s en l}

Procedure AgregarAtras (Var l, ult: listaNivel; a:arbol);

Var nue: listaNivel;

Begin
  new (nue);
  nue^.info := a;
  nue^.sig := Nil;
  If l= Nil Then l := nue
  Else ult^.sig := nue;
  ult := nue;
End;

















{-----------------------------------------------------------------------------
IMPRIMIRPORNIVEL - Muestra los datos del �rbol a por niveles }

Procedure imprimirpornivel(a: arbol);

Var 
  l, aux, ult: listaNivel;
  nivel, cant, i: integer;
Begin
  l := Nil;
  If (a <> Nil)Then
    Begin
      nivel := 0;
      agregarAtras (l,ult,a);
      While (l<> Nil) Do
        Begin
          nivel := nivel + 1;
          cant := contarElementos(l);
          write ('Nivel ', nivel, ': ');
          For i:= 1 To cant Do
            Begin
              write (l^.info^.dato, ' - ');
              If (l^.info^.HI <> Nil) Then agregarAtras (l,ult,l^.info^.HI);
              If (l^.info^.HD <> Nil) Then agregarAtras (l,ult,l^.info^.HD);
              aux := l;
              l := l^.sig;
              dispose (aux);
            End;
          writeln;
        End;
    End;
End;

Procedure preOrden(a: arbol);
Begin
  If (a <> Nil) Then
    Begin
      writeln(a^.dato);
      preOrden(a^.HI);
      preOrden(a^.HD);
    End;
End;

Procedure enOrden(a: arbol);
Begin
  If (a <> Nil) Then
    Begin
      enOrden(a^.HI);
      writeln(a^.dato);
      enOrden(a^.HD);
    End;
End;

Procedure postOrden(a: arbol);
Begin
  If (a <> Nil) Then
    Begin
      postOrden(a^.HI);
      postOrden(a^.HD);
      writeln(a^.dato);
    End;
End;

Function buscar(a: arbol; n: integer; Var encontrado: boolean): arbol;
Begin
  If (a <> Nil) Then
    Begin
      If (a^.dato = n) Then
        encontrado := true
      Else
        Begin
          buscar(a^.HI, n, encontrado);
          If (encontrado = false) Then
            buscar(a^.HD, n, encontrado);
        End;
    End;
End;

Function verMin(a: arbol): integer;
Begin
  If (a <> Nil) Then
    Begin
      If (a^.HI = Nil) Then
        verMin := a^.dato
      Else
        verMin := verMin(a^.HI);
    End
  Else
    verMin := -1;
End;

Function verMax(a: arbol): integer;
Begin
  If (a <> Nil) Then
    Begin
      If (a^.Hd = Nil) Then
        verMax := a^.dato
      Else
        verMax := verMax(a^.Hd);
      1
    End;
End;

Var 
  l: lista;
  a: arbol;
  n: integer;
  encontrado: boolean;

Begin
  Randomize;

  crearLista(l);
  writeln ('Lista generada: ');
  imprimirLista(l);

  // Crear arbol con los elementos de la lista generada
  While l <> Nil Do
    Begin
      insertar(a, l^.dato);
      l := l^.sig;
    End;

  // Imprimir arbol por niveles
  imprimirpornivel(a);

  writeln(




       '-----------------------------------------------------------------------'
  );
  Writeln('Recorrido PreOrden ');
  preOrden(a);

  writeln(









       '-----------------------------------------------------------------------'
  );
  Writeln('Recorrido enOrden ');
  enOrden(a);

  writeln(









       '-----------------------------------------------------------------------'
  );
  Writeln('Recorrido PostOrden ');
  postOrden(a);

  writeln(



       '-----------------------------------------------------------------------'
  );
  Writeln('Ingrese el numero a buscar: ');
  Readln(n);
  buscar(a, n, encontrado);
  If (Not encontrado) Then
    writeln('El numero no se encuentra en el arbol')
  Else
    writeln('El numero se encuentra en el arbol');

  writeln('El minimo es: ', verMin(a));

  writeln('El maximo es: ', verMax(a));


  readln;
End.
