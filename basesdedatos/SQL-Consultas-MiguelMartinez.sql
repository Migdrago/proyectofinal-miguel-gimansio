-- 1 --
SELECT * FROM cliente;
-- Muestra todos los clientes

-- 2 --
SELECT * FROM entrenador;
-- Muestra todos los entrenadores

-- 3 --
SELECT * FROM clase;
-- Muestra todas las clases

-- 4 --
SELECT * FROM cliente
WHERE nombre = 'Juan Pérez';
-- Busca un cliente concreto por nombre

-- 5 --
SELECT * FROM cliente
WHERE nombre LIKE '%a%';
-- Busca clientes que contengan la letra "a"

-- 6 --
SELECT * FROM clase
WHERE id_entrenador = 1;
-- Muestra las clases de un entrenador

-- 7 --
SELECT c.nombre, cl.nombre
FROM cliente c
JOIN inscripcion i ON c.id_cliente = i.id_cliente
JOIN clase cl ON i.id_clase = cl.id_clase;
-- Muestra clientes con sus clases

-- 8 --
SELECT cl.nombre, e.nombre
FROM clase cl
JOIN entrenador e ON cl.id_entrenador = e.id_entrenador;
-- Muestra clases con su entrenador

-- 9 --
SELECT * FROM cliente
ORDER BY nombre;
-- Ordena los clientes por nombre

-- 10 --
SELECT COUNT(*) FROM cliente;
-- Cuenta el número total de clientes

-- 11 --
INSERT INTO cliente (nombre, email, telefono)
VALUES ('Nuevo Cliente', 'nuevo@email.com', '000000000');
-- Inserta un nuevo cliente

-- 12 --
UPDATE cliente
SET telefono = '999999999'
WHERE id_cliente = 1;
-- Modifica el teléfono de un cliente

-- 13 --
DELETE FROM cliente
WHERE id_cliente = 6;
-- Elimina un cliente concreto