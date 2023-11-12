-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 12-11-2023 a las 16:23:38
-- Versión del servidor: 10.10.6-MariaDB
-- Versión de PHP: 8.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `provemax`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

DROP TABLE IF EXISTS `compra`;
CREATE TABLE IF NOT EXISTS `compra` (
  `idCompra` int(11) NOT NULL AUTO_INCREMENT,
  `idProveedor` int(11) NOT NULL,
  `idDetalle` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `estado` tinyint(4) NOT NULL,
  PRIMARY KEY (`idCompra`),
  KEY `idProveedor` (`idProveedor`),
  KEY `idDetalle` (`idDetalle`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `idProveedor`, `idDetalle`, `fecha`, `estado`) VALUES
(4, 1, 1, '2023-05-03', 1),
(5, 1, 2, '2023-10-10', 1),
(6, 1, 3, '2023-10-08', 1),
(7, 1, 4, '2023-10-07', 1),
(8, 3, 5, '2023-09-27', 1),
(9, 3, 6, '2023-09-29', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

DROP TABLE IF EXISTS `detallecompra`;
CREATE TABLE IF NOT EXISTS `detallecompra` (
  `idDetalle` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `idProducto` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  PRIMARY KEY (`idDetalle`),
  KEY `idProducto` (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallecompra`
--

INSERT INTO `detallecompra` (`idDetalle`, `cantidad`, `precioCosto`, `idProducto`, `estado`) VALUES
(1, 2, 950, 1, 1),
(2, 10, 950, 2, 1),
(3, 10, 880, 3, 1),
(4, 10, 790, 4, 1),
(5, 6, 880000, 6, 1),
(6, 2, 999999, 7, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `nombreProducto` varchar(30) NOT NULL,
  `descripcion` text NOT NULL,
  `precioActual` double NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `descripcion`, `precioActual`, `stock`, `estado`) VALUES
(1, 'Fanta', 'Gaseosa', 950, 550, 1),
(2, 'CocaCola', 'Gaseosa', 950, 100, 1),
(3, 'Sprite', 'Gaseosa', 880, 100, 1),
(4, 'QuatroPomelo', 'Gaseosa', 790, 100, 1),
(5, 'PcGamer', 'Informatica', 1999999, 8, 1),
(6, 'Lenovo I7', 'Informatica', 880000, 10, 1),
(7, 'Acer Tuf', 'Informatica', 999999, 7, 1),
(8, 'Acer Pro', 'Informatica', 790000, 12, 1),
(9, 'Magistral', 'Detergente', 500, 100, 1),
(10, 'Ayudin', 'Lavandina', 300, 100, 1),
(11, 'Cif', 'Limpiador', 600, 100, 1),
(12, 'Blem', 'Lustra Muebles', 1100, 100, 1),
(13, 'Copa', 'Copa Cristal', 330, 60, 1),
(14, 'Vasos', 'Vasos medianos', 220, 80, 1),
(15, 'Platos', 'Platos Porcelana', 700, 50, 1),
(16, 'Cacelora', 'Cacelora Acero Inoxidable', 7000, 10, 1),
(17, 'Test', 'Test de producto Nuevo', 100, 100, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
CREATE TABLE IF NOT EXISTS `proveedor` (
  `idProveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `razonSocial` varchar(60) NOT NULL,
  `domicilio` varchar(60) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `nombre`, `razonSocial`, `domicilio`, `telefono`, `estado`) VALUES
(1, 'Distribuidora', 'CocacolaAndina', 'España 223', '2664223344', 1),
(2, 'Bazar S.A.', 'Bazar S.A.', 'Colon 1800', '2664789789', 1),
(3, 'Informatica Rivadavia', 'Electro S.A.', 'Rivadavia 1942', '2664789888', 1),
(4, 'LimpiaLimpia', 'Quimicos S.R.L.', 'Maipu 222', '266123456', 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`),
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`idDetalle`) REFERENCES `detallecompra` (`idDetalle`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detallecompra_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
