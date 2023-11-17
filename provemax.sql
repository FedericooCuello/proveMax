-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-11-2023 a las 02:47:47
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
-- Base de datos: `provemax`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `idProveedor`, `fecha`, `estado`) VALUES
(1, 1, '2023-11-12', 1),
(2, 2, '2023-01-30', 1),
(3, 2, '2023-03-11', 1),
(4, 2, '2023-06-20', 1),
(5, 3, '2023-02-28', 1),
(6, 3, '2023-04-10', 1),
(7, 3, '2023-06-30', 1),
(8, 3, '2023-10-27', 1),
(9, 4, '2023-02-12', 1),
(10, 4, '2023-03-11', 1),
(11, 4, '2023-12-19', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `idCompra` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallecompra`
--

INSERT INTO `detallecompra` (`idDetalle`, `cantidad`, `precioCosto`, `idCompra`, `idProducto`, `estado`) VALUES
(1, 12, 950, 1, 1, 1),
(2, 18, 950, 1, 2, 1),
(3, 6, 880, 1, 3, 1),
(4, 6, 790, 1, 4, 1),
(5, 6, 330, 2, 13, 1),
(6, 6, 220, 2, 14, 1),
(7, 12, 700, 3, 15, 1),
(8, 12, 330, 3, 13, 1),
(9, 2, 7000, 4, 16, 1),
(10, 1, 1999999, 5, 5, 1),
(11, 1, 880000, 6, 6, 1),
(12, 1, 999999, 7, 7, 1),
(13, 1, 790000, 8, 8, 1),
(14, 30, 500, 9, 9, 1),
(15, 40, 300, 9, 10, 1),
(16, 30, 600, 10, 11, 1),
(17, 50, 1100, 10, 12, 1),
(18, 20, 500, 10, 9, 1),
(19, 20, 300, 11, 10, 1),
(20, 20, 600, 11, 11, 1),
(21, 10, 1100, 11, 12, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(30) NOT NULL,
  `descripcion` text NOT NULL,
  `precioActual` double NOT NULL,
  `stock` int(11) NOT NULL,
  `stockMinimo` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `descripcion`, `precioActual`, `stock`, `stockMinimo`, `estado`) VALUES
(1, 'Fanta', 'Gaseosa', 950, 550, 2, 1),
(2, 'CocaCola', 'Gaseosa', 950, 100, 10, 1),
(3, 'Sprite', 'Gaseosa', 880, 100, 3, 1),
(4, 'QuatroPomelo', 'Gaseosa', 790, 100, 10, 1),
(5, 'PcGamer', 'Informatica', 1999999, 8, 9, 1),
(6, 'Lenovo I7', 'Informatica', 880000, 10, 2, 1),
(7, 'Acer Tuf', 'Informatica', 999999, 7, 2, 1),
(8, 'Acer Pro', 'Informatica', 790000, 12, 2, 1),
(9, 'Magistral', 'Detergente', 500, 100, 10, 1),
(10, 'Ayudin', 'Lavandina', 300, 100, 10, 1),
(11, 'Cif', 'Limpiador', 600, 100, 10, 1),
(12, 'Blem', 'Lustra Muebles', 1100, 100, 2, 1),
(13, 'Copa', 'Copa Cristal', 330, 60, 5, 1),
(14, 'Vasos', 'Vasos medianos', 220, 80, 5, 1),
(15, 'Platos', 'Platos Porcelana', 700, 50, 5, 1),
(16, 'Cacelora', 'Cacelora Acero Inoxidable', 7000, 10, 1, 1),
(17, 'Test', 'Test de producto Nuevo', 100, 100, 10, 1),
(18, 'Resma de hoja', 'Papel reciclado', 2874, 2, 1, 1),
(19, ' Escritorio', ' Muebles de oficina', 45000, 2, 0, 1),
(20, 'TV Sony', 'Electrodomestico', 58000, 80, 20, 0),
(21, 'Moto E5', 'Celular', 25000, 70, 25, 0),
(22, 'Heladera Dream', 'Electrodomestico', 85000, 50, 20, 0),
(23, 'Cocina Dream', 'Electrodomestico', 65000, 60, 30, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `razonSocial` varchar(60) NOT NULL,
  `domicilio` varchar(60) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `nombre`, `razonSocial`, `domicilio`, `telefono`, `estado`) VALUES
(1, 'Distribuidora', 'CocacolaAndina', 'España 223', '2664223344', 1),
(2, 'Bazar S.A.', 'Bazar S.A.', 'Colon 1800', '2664789789', 1),
(3, 'Informatica Rivadavia', 'Electro S.A.', 'Rivadavia 1942', '2664789888', 1),
(4, 'LimpiaLimpia', 'Quimicos S.R.L.', 'Maipu 222', '266123456', 1),
(5, 'Garbarino', 'Garbarino e hijos', 'Don bosco 226', '2664726272', 1),
(6, 'Dash Deporte', 'Dash.s.a', 'Pringles 986', '2664889332', 1),
(7, 'Luanbeer', 'Luanbeer.s.r.l', 'Parque Norte', '2665527782', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedorproducto`
--

CREATE TABLE `proveedorproducto` (
  `idProveedorProducto` int(4) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedorproducto`
--

INSERT INTO `proveedorproducto` (`idProveedorProducto`, `idProveedor`, `idProducto`, `estado`) VALUES
(1, 1, 1, 1),
(2, 1, 2, 1),
(3, 1, 3, 1),
(4, 1, 4, 1),
(5, 2, 13, 1),
(6, 2, 14, 1),
(7, 2, 15, 1),
(8, 2, 16, 1),
(9, 3, 5, 1),
(10, 3, 6, 1),
(11, 3, 7, 1),
(12, 3, 8, 1),
(13, 4, 9, 1),
(14, 4, 10, 1),
(15, 4, 11, 1),
(16, 4, 12, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `idProveedor` (`idProveedor`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `idCompra` (`idCompra`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- Indices de la tabla `proveedorproducto`
--
ALTER TABLE `proveedorproducto`
  ADD PRIMARY KEY (`idProveedorProducto`),
  ADD KEY `idProveedor` (`idProveedor`),
  ADD KEY `idProducto` (`idProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `proveedorproducto`
--
ALTER TABLE `proveedorproducto`
  MODIFY `idProveedorProducto` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detallecompra_ibfk_1` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detallecompra_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `proveedorproducto`
--
ALTER TABLE `proveedorproducto`
  ADD CONSTRAINT `proveedorproducto_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`),
  ADD CONSTRAINT `proveedorproducto_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
