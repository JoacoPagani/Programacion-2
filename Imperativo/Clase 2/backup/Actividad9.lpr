program Actividad9;

const
    dimF = 8;  {Dimensión física del vector}

type

    vector = array [1..dimF] of LongInt;

    dim = 0..dimF;


{-----------------------------------------------------------------------------
CARGARVECTOR  Carga nros aleatorios entre 0 y 100 en el vector hasta que
llegue el nro 99 o hasta que se complete el vector}
Procedure cargarVector ( var vec: vector; var dimL: dim);
var
   d: integer;
begin
     Randomize;  { Inicializa la secuencia de random a partir de una semilla}
     dimL := 0;
     d:= random(100);
     while (d <> 99)  and ( dimL < dimF ) do begin
           dimL := dimL + 1;
           vec[dimL] := d;
           d:= random(100);
     end;
End;



{-----------------------------------------------------------------------------
IMPRIMIRVECTOR - Imprime todos los nros del vector }
Procedure imprimirVector ( var vec: vector; var dimL: dim );
var
   i: dim;
begin
     for i:= 1 to dimL do
         write ('-----');
     writeln;
     write (' ');
     for i:= 1 to dimL do begin
        if(vec[i] < 9)then
            write ('0');
        write(vec[i], ' | ');
     end;
     writeln;
     for i:= 1 to dimL do
         write ('-----');
     writeln;
     writeln;
End;

function MaximoRecursion(v: vector; dimL: dim; var max, i: integer): integer;
begin
     if (v[i] > max) then
         max:= v[i];
     i:= i+1;
     if (i < DimL) then
         max:= MaximoRecursion(v, dimL, max, i);
     MaximoRecursion:= max;
end;


{PROGRAMA PRINCIPAL}
var
   v: vector;
   dimL : dim;
   max, i: integer;
begin

     cargarVector(v,dimL);

     writeln('Nros almacenados: ');
     imprimirVector(v, dimL);

     {--------------------------------------------------}
     max:= -1;
     i:= 1;
     writeln('El numero maximo es ', MaximoRecursion(v,dimL, max, i));


     readln;
end.