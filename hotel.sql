-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-06-2021 a las 18:04:50
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `nombre` varchar(60) NOT NULL,
  `ciudadOrigen` varchar(40) NOT NULL,
  `numHabitacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `costos`
--

CREATE TABLE `costos` (
  `habSencilla` float NOT NULL,
  `habDoble` float NOT NULL,
  `habSuite` float NOT NULL,
  `costoPersonExtra` float NOT NULL,
  `servicioHabitacion` float NOT NULL,
  `servicioBar` float NOT NULL,
  `servicioNinera` float NOT NULL,
  `servicioSPA` float NOT NULL,
  `servicioTintoreria` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `costos`
--

INSERT INTO `costos` (`habSencilla`, `habDoble`, `habSuite`, `costoPersonExtra`, `servicioHabitacion`, `servicioBar`, `servicioNinera`, `servicioSPA`, `servicioTintoreria`) VALUES
(569.88, 787.22, 1400.5, 300.5, 100.25, 150.99, 130.45, 140.25, 70.35);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `galeria`
--

CREATE TABLE `galeria` (
  `nombre` varchar(100) NOT NULL,
  `ubicacion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `galeria`
--

INSERT INTO `galeria` (`nombre`, `ubicacion`) VALUES
('bar', '/galeria/bar.png'),
('GYM', '/galeria/gym.png'),
('Habitación doble', '/galeria/habDoble.png'),
('habitación sencilla', '/galeria/habSencilla.png'),
('Habitación suite', '/galeria/habSuite.png'),
('lavanderia', '/galeria/lavanderia.png'),
('NUESTRO LOGO', '/galeria/logo.jpg'),
('piscina', '/galeria/piscina.png'),
('recepción', '/galeria/recepcion.png'),
('restaurant', '/galeria/restaurant.png'),
('restaurant playa', '/galeria/restaurant2.png'),
('sala de conferencias', '/galeria/salaConferencias.png'),
('servicio al cuarto', '/galeria/servicioCuarto.png'),
('servicios', '/galeria/servicios.jpg'),
('SPA', '/galeria/spa.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `numero` int(11) NOT NULL,
  `tipo` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `imagenRuta` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`numero`, `tipo`, `piso`, `estado`, `imagenRuta`) VALUES
(100, 1, 1, 1, '/images/habitacion.png'),
(101, 1, 1, 1, '/images/habitacion.png'),
(104, 1, 1, 1, '/images/habitacion.png'),
(105, 1, 1, 0, '/images/habitacion.png'),
(122, 1, 1, 0, '/images/habitacion.png'),
(173, 1, 2, 1, '/images/habitacion.png'),
(200, 2, 1, 1, '/images/habitacionDoble.png'),
(201, 2, 1, 0, '/images/habitacionDoble.png'),
(202, 2, 1, 0, '/images/habitacionDoble.png'),
(203, 2, 1, 0, '/images/habitacionDoble.png'),
(204, 2, 1, 0, '/images/habitacionDoble.png'),
(205, 2, 2, 0, '/images/habitacionDoble.png'),
(206, 2, 2, 0, '/images/habitacionDoble.png'),
(207, 2, 2, 0, '/images/habitacionDoble.png'),
(208, 2, 2, 0, '/images/habitacionDoble.png'),
(209, 2, 2, 1, '/images/habitacionDoble.png'),
(222, 1, 2, 0, '/images/habitacion.png'),
(300, 1, 1, 0, '/images/habitacion.png'),
(301, 1, 1, 0, '/images/habitacion.png'),
(302, 1, 1, 0, '/images/habitacion.png'),
(303, 1, 2, 0, '/images/habitacion.png'),
(304, 1, 2, 0, '/images/habitacion.png'),
(501, 3, 1, 0, '/images/habitacionTriple.png'),
(502, 3, 1, 0, '/images/habitacionTriple.png'),
(503, 3, 2, 0, '/images/habitacionTriple.png'),
(504, 3, 2, 0, '/images/habitacionTriple.png'),
(505, 3, 2, 0, '/images/habitacionTriple.png'),
(506, 3, 2, 0, '/images/habitacionTriple.png'),
(507, 3, 2, 0, '/images/habitacionTriple.png'),
(508, 3, 2, 0, '/images/habitacionTriple.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresos`
--

CREATE TABLE `ingresos` (
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ingresos`
--

INSERT INTO `ingresos` (`total`) VALUES
(94106.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `nomCliente` varchar(60) NOT NULL,
  `numHabitacion` int(11) NOT NULL,
  `fechaIn` date NOT NULL,
  `fechaOut` date NOT NULL,
  `personasExtra` int(11) NOT NULL,
  `CiudadCliente` varchar(50) NOT NULL,
  `tipoHabitacion` int(11) NOT NULL,
  `ocupantes` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`nomCliente`, `numHabitacion`, `fechaIn`, `fechaOut`, `personasExtra`, `CiudadCliente`, `tipoHabitacion`, `ocupantes`) VALUES
('Juan Carlos Acosta Azuara', 100, '2021-06-19', '2021-06-22', 1, 'Zapopan, Jalisco', 1, 2),
('Virgina Alvarez Valenzuela', 101, '2021-06-05', '2021-06-09', 0, 'Aguascalientes, Aguascalientes', 1, 1),
('Ximena Pedroza', 104, '2021-06-12', '2021-06-13', 0, 'Montana', 1, 1),
('Miley Cyrus', 173, '2021-06-05', '2021-06-06', 0, 'Tanesse', 1, 1),
('Karen Liera Muro', 200, '2021-06-26', '2021-06-28', 0, 'Aguascalientes, Aguascalientes', 2, 2),
('Karol Ferreira', 209, '2021-06-10', '2021-06-11', 0, 'Tijuana', 2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(25) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `password`) VALUES
('Gina', '442641423a279d9ed536739cdb4469ed'),
('Jacob', 'ccee5504c9d889922b101124e9e43b71');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `costos`
--
ALTER TABLE `costos`
  ADD PRIMARY KEY (`servicioNinera`);

--
-- Indices de la tabla `galeria`
--
ALTER TABLE `galeria`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`numero`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`numHabitacion`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
