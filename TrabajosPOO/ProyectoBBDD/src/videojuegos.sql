-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 28, 2019 at 05:29 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `videojuegos`
--

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `Nombre` varchar(30) COLLATE latin1_spanish_ci DEFAULT NULL,
  `Usuario` varchar(12) COLLATE latin1_spanish_ci NOT NULL,
  `Contrasena` varchar(12) COLLATE latin1_spanish_ci NOT NULL,
  `Admin` bit(1) DEFAULT b'0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`Nombre`, `Usuario`, `Contrasena`, `Admin`) VALUES
('Ismael', 'Ichi', '1234', b'0'),
('Miguel', 'RyuOmega', '1234', b'1');

-- --------------------------------------------------------

--
-- Table structure for table `videojuegos`
--

CREATE TABLE `videojuegos` (
  `ID` int(3) NOT NULL,
  `NOMBRE` varchar(45) COLLATE latin1_spanish_ci NOT NULL,
  `DESARROLLADORA` varchar(25) COLLATE latin1_spanish_ci NOT NULL,
  `AÑO_DE_PUBLICACIÓN` varchar(4) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `videojuegos`
--

INSERT INTO `videojuegos` (`ID`, `NOMBRE`, `DESARROLLADORA`, `AÑO_DE_PUBLICACIÓN`) VALUES
(1, 'Dark Souls 3', 'From Software', '2016'),
(2, 'Final Fantasy VII', 'Square-Enix', '1997'),
(3, 'Kingdom Hearts', 'Square-Enix', '2002'),
(5, 'Black Desert Online', 'PearlAbyss', '2015');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Usuario`),
  ADD KEY `Contrasena` (`Contrasena`),
  ADD KEY `Contrasena_2` (`Contrasena`);

--
-- Indexes for table `videojuegos`
--
ALTER TABLE `videojuegos`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `videojuegos`
--
ALTER TABLE `videojuegos`
  MODIFY `ID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
