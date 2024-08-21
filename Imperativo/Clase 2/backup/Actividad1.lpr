program Actividad1;x
function Factorial(x:integer): Real;
begin
  if (x <= 1) then
     factorial:= 1
  else
    factorial:= x * factorial(x-1)
end;

{PROGRAMA PRINCIPAL}
var
  num: integer;
Begin

  writeln( 'Ingrese un entero no negativo:');
  readln (num);

  writeln ( num, '! = ', factorial(num));
  readln();
End.


