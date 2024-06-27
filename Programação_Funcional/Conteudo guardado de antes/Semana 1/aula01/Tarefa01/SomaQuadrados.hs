--Soma x > z && y > z = sqrt(x^2 + y^2)
--Soma x > y && z > y = sqrt(x^2 + z^2)
--Soma y > x && z > x = sqrt(y^2 + z^2)
Soma :: int int int -> int
Soma x y z = if x > z && y > z sqrt(x^2 + y^2)
Soma x y z = if x > y && z > y sqrt(x^2 + z^2)
Soma x y z = if y > x && z > x sqrt(y^2 + z^2)