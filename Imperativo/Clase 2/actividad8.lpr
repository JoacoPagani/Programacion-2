program actividad8;

const
    dimF = 8;  {Dimensión física del vector}

type

    vector = array [1..dimF] of integer;

    dim = 0..dimF;

{-----------------------------------------------------------------------------
CARGARVECTORORDENADO - Carga ordenadamente nros aleatorios entre 0 y 100 en el
vector hasta que llegue el nro 99 o hasta que se complete el vector}

Procedure cargarVectorOrdenado ( var vec: vector; var dimL: dim);
var
   d, pos, j: integer;
begin
    Randomize;  { Inicializa la secuencia de random a partir de una semilla}
    dimL := 0;
    d:= random(100);
    while (d <> 99)  and ( dimL < dimF ) do begin
       pos:= 1;
       while (pos <= dimL) and (vec[pos]< d) do pos:= pos + 1;
       for  j:= dimL downto pos do vec[j+1]:= vec[j] ;
       vec[pos]:= d;
       dimL := dimL + 1;
       d:= random(100)
     end;
end;

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


procedure BusquedaDicotomica(v:vector; num:integer; dimL:dim; var pri:dim; var ult:dim; var pos:dim);
var
    medio:dim;
begin
     if (v[ult]<num)then
        writeln('No se encontró el elemento ')
     else begin
          medio:= (pri + ult) div 2;
          if num = v[medio] then
             pos:=medio
          else begin
               if (num < v[medio]) then begin
                  ult:=medio-1;
                  BusquedaDicotomica(v,num,dimL,pri,ult,pos);
               end
               else begin
                    pri:=medio+1;
                    BusquedaDicotomica(v,num,dimL,pri,ult,pos);
               end;
          end;
     end;
end;

{PROGRAMA PRINCIPAL}
var
   v: vector;
   dimL,pri, ult, pos : dim;
   num: integer;

begin

     cargarVectorOrdenado(v,dimL);

     writeln('Nros almacenados: ');
     imprimirVector(v, dimL);

     pri:=1;
     ult:=dimL;

     
     writeln('Ingrese el dato a buscar ');
     readln(num);

     BusquedaDicotomica(v,num,dimL,pri,ult,pos);
     if (pos <> 0) then
        writeln('La posicion del numero es ', pos);




     readln();
end.

