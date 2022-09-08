-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-09-2021 a las 23:36:40
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cajero`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

CREATE TABLE `registros` (
  `id` int(11) NOT NULL,
  `usuario` text NOT NULL,
  `saldo` int(15) NOT NULL,
  `password` text NOT NULL,
  `historialBancario` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registros`
--

INSERT INTO `registros` (`id`, `usuario`, `saldo`, `password`, `historialBancario`) VALUES
(1, 'Julian', 1940000, '123', '-Envio de 150000 para juank-Entrega de 100000 por parte de leonardo-Envio de 50000 para Anderson-Retiro de 100000 por cajero-Envio de 100000 para Anderson-Envio de 5000 para leonardo'),
(2, 'Anderson', 5090000, '123', '-Entrega de 50000 por parte de Julian-Entrega de 100000 por parte de Julian'),
(3, 'Leonardo', 3035000, '123', '-Entrega de 5000 por parte de juank-Envio de 100000 para Julian-Entrega de 5000 por parte de Julian-Retiro de 200000 por cajero-Retiro de 200000 por cajero-Retiro de 50000 por cajero'),
(12, 'Juank', 145000, '123', '-Retiro de 100000 por cajero-Retiro de 50000 por cajero-Retiro de 50000 por cajero-Retiro de 200000 por cajero-Retiro de 65000 por cajero-Retiro de 5000 por cajero-Entrega de 150000 por parte de Julian-Envio de 5000 para leonardo-Retiro de 1000000 por cajero'),
(13, 'Yeimi', 450000, 'abc', '-Entrega de 10000 por parte de Camilo-Envio de 200000 para Camilo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `registros`
--
ALTER TABLE `registros`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `registros`
--
ALTER TABLE `registros`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
