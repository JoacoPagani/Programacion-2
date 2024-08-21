program actividad4;
var
  num, maximo: integer;

function digitoMaximo(n: integer; var max: integer): integer;
var
  dig: integer;
begin
  dig:= n mod 10;
  if ( dig > max ) then
    max:= dig;
  n:= n div 10;
  if (n <> 0) then
    max:= digitoMaximo(n, max);
  digitoMaximo:= max;
end;

Begin
  maximo := -1;
  writeln( 'Ingrese un entero no negativo:');
  readln (num);
  writeln ( 'El digito maximo del numero ', num, ' es: ', digitoMaximo (num, maximo));
  readln;
End.


