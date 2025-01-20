-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 14-01-2025 a las 01:17:57
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `usc`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `id_alumno` int(11) NOT NULL,
  `DNI` varchar(20) NOT NULL,
  `Nombres` varchar(100) NOT NULL,
  `Apellido_Paterno` varchar(100) NOT NULL,
  `Apellido_Materno` varchar(100) NOT NULL,
  `Departamento` varchar(100) DEFAULT NULL,
  `Provincia` varchar(100) DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL,
  `Correo` varchar(100) DEFAULT NULL,
  `Sexo` enum('M','F') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`id_alumno`, `DNI`, `Nombres`, `Apellido_Paterno`, `Apellido_Materno`, `Departamento`, `Provincia`, `Direccion`, `Correo`, `Sexo`) VALUES
(1, '12345678A', 'Laura', 'González', 'Martínez', 'Ingeniería', 'Madrid', 'Calle Falsa 123', 'laura.gonzalez@correo.com', 'F'),
(2, '23456789B', 'Carlos', 'Hernández', 'López', 'Derecho', 'Barcelona', 'Avenida Libertad 456', 'carlos.hernandez@correo.com', 'M'),
(3, '34567890C', 'Ana', 'Moreno', 'Pérez', 'Medicina', 'Valencia', 'Calle Real 789', 'ana.moreno@correo.com', 'F'),
(4, '45678901D', 'Juan', 'Sánchez', 'Díaz', 'Arquitectura', 'Sevilla', 'Calle Primavera 101', 'juan.sanchez@correo.com', 'M'),
(5, '56789012E', 'Luis', 'Rodríguez', 'Fernández', 'Informática', 'Zaragoza', 'Calle Sol 202', 'luis.rodriguez@correo.com', 'M');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carga_lectiva`
--

CREATE TABLE `carga_lectiva` (
  `id_carga` int(11) NOT NULL,
  `id_Docente` int(11) NOT NULL,
  `id_Curso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `carga_lectiva`
--

INSERT INTO `carga_lectiva` (`id_carga`, `id_Docente`, `id_Curso`) VALUES
(6, 7, 2),
(7, 10, 3),
(9, 8, 5),
(10, 10, 4),
(11, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

CREATE TABLE `cursos` (
  `id_curso` int(11) NOT NULL,
  `Codigo` varchar(20) NOT NULL,
  `nombre_curso` varchar(255) NOT NULL,
  `Duracion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cursos`
--

INSERT INTO `cursos` (`id_curso`, `Codigo`, `nombre_curso`, `Duracion`) VALUES
(1, 'C001', 'Matemáticas Avanzadas', 40),
(2, 'C002', 'Física Clásica', 45),
(3, 'C003', 'Historia Universal', 30),
(4, 'C004', 'Química Orgánica', 50),
(5, 'C005', 'Lengua y Literatura', 35);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docentes`
--

CREATE TABLE `docentes` (
  `id_docente` int(11) NOT NULL,
  `DNI` varchar(20) NOT NULL,
  `Nombres` varchar(100) NOT NULL,
  `Apellidos` varchar(200) NOT NULL,
  `Profesion` varchar(100) NOT NULL,
  `Departamento` varchar(100) DEFAULT NULL,
  `Provincia` varchar(100) DEFAULT NULL,
  `Correo` varchar(100) DEFAULT NULL,
  `Sexo` enum('M','F') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `docentes`
--

INSERT INTO `docentes` (`id_docente`, `DNI`, `Nombres`, `Apellidos`, `Profesion`, `Departamento`, `Provincia`, `Correo`, `Sexo`) VALUES
(1, '98765432X', 'Alejandro', 'Pérez Sánchez', 'Profesor de Matemáticas', 'Educación', 'Lima', 'alejandro.perez@correo.com', 'M'),
(7, '87654321Y', 'Camila', 'Gómez Rodríguez', 'Profesora de Lengua y Literatura', 'Educación', 'Buenos Aires', 'camila.gomez@correo.com', 'F'),
(8, '76543210Z', 'Sergio', 'Lopez Martínez', 'Profesor de Física', 'Educación', 'Madrid', 'sergio.lopez@correo.com', 'M'),
(9, '65432109W', 'Elena', 'Ruiz García', 'Profesora de Química', 'Educación', 'Barcelona', 'elena.ruiz@correo.com', 'F'),
(10, '54321098V', 'Luis', 'Torres Fernández', 'Profesor de Historia', 'Educación', 'Ciudad de México', 'luis.torres@correo.com', 'M');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matriculas`
--

CREATE TABLE `matriculas` (
  `id_matricula` int(11) NOT NULL,
  `id_alumno` int(11) NOT NULL,
  `id_curso` int(11) NOT NULL,
  `fecha_matricula` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `matriculas`
--

INSERT INTO `matriculas` (`id_matricula`, `id_alumno`, `id_curso`, `fecha_matricula`) VALUES
(1, 1, 1, '2012-12-12 05:00:00'),
(2, 2, 2, '2012-12-12 05:00:00'),
(3, 3, 3, '2012-12-12 05:00:00'),
(4, 5, 4, '2012-12-12 05:00:00'),
(5, 4, 5, '2012-12-12 05:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `DNI` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  `tipo_usuario` enum('admin','estudiante') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `DNI`, `contraseña`, `tipo_usuario`) VALUES
(0, '11111111', '1', 'admin'),
(1, '12345678A', 'password123', 'estudiante'),
(2, '23456789B', 'password123', 'estudiante'),
(3, '34567890C', 'password123', 'estudiante'),
(4, '56789012E', 'password123', 'estudiante'),
(5, '45678901D', 'password123', 'estudiante');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`id_alumno`);

--
-- Indices de la tabla `carga_lectiva`
--
ALTER TABLE `carga_lectiva`
  ADD PRIMARY KEY (`id_carga`),
  ADD KEY `id_Docente` (`id_Docente`),
  ADD KEY `id_Curso` (`id_Curso`);

--
-- Indices de la tabla `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`id_curso`);

--
-- Indices de la tabla `docentes`
--
ALTER TABLE `docentes`
  ADD PRIMARY KEY (`id_docente`);

--
-- Indices de la tabla `matriculas`
--
ALTER TABLE `matriculas`
  ADD PRIMARY KEY (`id_matricula`),
  ADD UNIQUE KEY `id_alumno` (`id_alumno`,`id_curso`),
  ADD KEY `id_curso` (`id_curso`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `id_alumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `carga_lectiva`
--
ALTER TABLE `carga_lectiva`
  MODIFY `id_carga` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `cursos`
--
ALTER TABLE `cursos`
  MODIFY `id_curso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `docentes`
--
ALTER TABLE `docentes`
  MODIFY `id_docente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `matriculas`
--
ALTER TABLE `matriculas`
  MODIFY `id_matricula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `carga_lectiva`
--
ALTER TABLE `carga_lectiva`
  ADD CONSTRAINT `carga_lectiva_ibfk_1` FOREIGN KEY (`id_Docente`) REFERENCES `docentes` (`id_docente`),
  ADD CONSTRAINT `carga_lectiva_ibfk_2` FOREIGN KEY (`id_Curso`) REFERENCES `cursos` (`id_curso`);

--
-- Filtros para la tabla `matriculas`
--
ALTER TABLE `matriculas`
  ADD CONSTRAINT `matriculas_ibfk_1` FOREIGN KEY (`id_alumno`) REFERENCES `alumnos` (`id_alumno`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `matriculas_ibfk_2` FOREIGN KEY (`id_curso`) REFERENCES `cursos` (`id_curso`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
