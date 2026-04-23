CREATE DATABASE gimnasio;
USE gimnasio;

CREATE TABLE cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100),
    telefono VARCHAR(20)
);

CREATE TABLE entrenador (
    id_entrenador INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    especialidad VARCHAR(100)
);

CREATE TABLE clase (
    id_clase INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    horario VARCHAR(50),
    id_entrenador INT,
    FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador)
);

CREATE TABLE inscripcion (
    id_inscripcion INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    id_clase INT,
    fecha_inscripcion DATE,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
    FOREIGN KEY (id_clase) REFERENCES clase(id_clase)
);