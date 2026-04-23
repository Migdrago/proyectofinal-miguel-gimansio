INSERT INTO cliente (nombre, email, telefono) VALUES
('Juan Pérez', 'juan@email.com', '123456789'),
('Ana López', 'ana@email.com', '987654321'),
('Luis García', 'luis@email.com', '654987321'),
('Marta Sánchez', 'marta@email.com', '111222333'),
('Pedro Torres', 'pedro@email.com', '444555666'),
('Lucía Fernández', 'lucia@email.com', '777888999');

INSERT INTO entrenador (nombre, especialidad) VALUES
('Carlos Ruiz', 'Fitness'),
('Laura Gómez', 'Yoga'),
('David Martín', 'Crossfit');

INSERT INTO clase (nombre, horario, id_entrenador) VALUES
('Spinning', '10:00', 1),
('Yoga', '18:00', 2),
('Crossfit', '12:00', 3),
('Pilates', '09:00', 2),
('Zumba', '17:00', 1),
('HIIT', '19:00', 3);

INSERT INTO inscripcion (id_cliente, id_clase, fecha_inscripcion) VALUES
(1, 1, '2026-04-20'),
(2, 2, '2026-04-20'),
(3, 3, '2026-04-21'),
(4, 4, '2026-04-21'),
(5, 5, '2026-04-22'),
(6, 6, '2026-04-22'),
(1, 3, '2026-04-23'),
(2, 5, '2026-04-23'),
(3, 1, '2026-04-24'),
(4, 2, '2026-04-24');