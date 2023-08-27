-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-08-2023 a las 15:25:00
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registrousuario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `estu_codigo` int(11) NOT NULL,
  `estu_nombre` varchar(40) NOT NULL,
  `estu_apellido` varchar(40) NOT NULL,
  `estu_asignatura` varchar(40) NOT NULL,
  `estu_promedio` double NOT NULL,
  `estu_estado` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`estu_codigo`, `estu_nombre`, `estu_apellido`, `estu_asignatura`, `estu_promedio`, `estu_estado`) VALUES
(1234, 'kelvin', 'quezada', 'POO', 13, 'Reprueba'),
(12394, 'yoza', 'daniel', 'POO', 16, 'Aprobado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `ho_codigo` int(11) NOT NULL,
  `ho_dia` varchar(10) NOT NULL,
  `ho_hora` varchar(10) NOT NULL,
  `ho_materia` varchar(30) NOT NULL,
  `ho_estado` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `horario`
--

INSERT INTO `horario` (`ho_codigo`, `ho_dia`, `ho_hora`, `ho_materia`, `ho_estado`) VALUES
(1, 'martes', '9:00', 'POO', 'Entrada'),
(3, 'jueves', '7:00', 'CALCULO', 'Entrada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `pro_codigo` int(11) NOT NULL,
  `pro_nombre` varchar(33) NOT NULL,
  `pro_apellido` varchar(33) NOT NULL,
  `pro_celular` int(10) NOT NULL,
  `pro_mail` varchar(30) NOT NULL,
  `pro_titulo` varchar(33) NOT NULL,
  `pro_estado` varchar(33) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`pro_codigo`, `pro_nombre`, `pro_apellido`, `pro_celular`, `pro_mail`, `pro_titulo`, `pro_estado`) VALUES
(4, 'peter', 'baque', 311644, 'kelvin1ecua@', 'Contador', 'Activo'),
(10123456, 'Jenifer', 'Baque', 10213646, 'jennifer@espe', 'Contador', 'Activo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`estu_codigo`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`ho_codigo`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`pro_codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `estu_codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12395;

--
-- AUTO_INCREMENT de la tabla `horario`
--
ALTER TABLE `horario`
  MODIFY `ho_codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `pro_codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10123457;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
