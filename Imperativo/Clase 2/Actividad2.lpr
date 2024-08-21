program Actividad2;

function potencia(x,n: integer): real;
begin
     if (n = 0) then
        potencia:= 1
     else
         potencia:= x* potencia(x,n-1);
end;

var
  x,n: integer;
begin
  Writeln('Elija un numero y elevado a que');
  readln(x);
  readln(n);
  writeln(potencia(x,n));
  readln();
end.

