-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 21-Nov-2017 às 22:17
-- Versão do servidor: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `voos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aeroportos`
--

CREATE TABLE `aeroportos` (
  `id_aeroporto` int(10) UNSIGNED NOT NULL,
  `nome` varchar(255) NOT NULL DEFAULT '',
  `link_localizacao` varchar(255) NOT NULL DEFAULT '',
  `id_cidade` int(10) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `avioes`
--

CREATE TABLE `avioes` (
  `id_aviao` int(10) UNSIGNED NOT NULL,
  `modelo` varchar(50) NOT NULL DEFAULT '',
  `qtde_poltronas` int(10) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cidades`
--

CREATE TABLE `cidades` (
  `id_cidade` int(10) UNSIGNED NOT NULL,
  `uf` varchar(2) NOT NULL DEFAULT '',
  `nome` varchar(255) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `passagens`
--

CREATE TABLE `passagens` (
  `id_passagem` int(11) NOT NULL,
  `portao_embarque` varchar(4) NOT NULL DEFAULT '',
  `status` varchar(20) NOT NULL DEFAULT '',
  `classe` varchar(20) NOT NULL DEFAULT '',
  `hr_embarque` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `data_ida` date NOT NULL DEFAULT '0000-00-00',
  `data_volta` date NOT NULL DEFAULT '0000-00-00',
  `id_voo` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `id_reserva` int(10) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `poltronas`
--

CREATE TABLE `poltronas` (
  `id_poltrona` int(10) UNSIGNED NOT NULL,
  `status` varchar(20) NOT NULL DEFAULT '',
  `tipo` varchar(30) NOT NULL DEFAULT '',
  `nome` varchar(50) NOT NULL DEFAULT '',
  `id_aviao` int(10) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `reservas`
--

CREATE TABLE `reservas` (
  `id_reserva` int(10) UNSIGNED NOT NULL,
  `classe` varchar(50) NOT NULL DEFAULT '',
  `valor` double UNSIGNED NOT NULL DEFAULT '0',
  `status` varchar(50) NOT NULL DEFAULT '',
  `data_ida` date NOT NULL DEFAULT '0000-00-00',
  `data_volta` date NOT NULL DEFAULT '0000-00-00',
  `qtde` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `id_usuario` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `id_aeroporto` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `id_poltrona` int(10) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(10) UNSIGNED NOT NULL,
  `email` varchar(50) NOT NULL DEFAULT '',
  `nome` varchar(50) NOT NULL DEFAULT '',
  `senha` varchar(10) NOT NULL DEFAULT '',
  `tipo` varchar(10) NOT NULL DEFAULT '',
  `data_nascimento` date NOT NULL DEFAULT '0000-00-00',
  `telefone` varchar(15) NOT NULL DEFAULT '',
  `cpf` varchar(15) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `voos`
--

CREATE TABLE `voos` (
  `id_voo` int(10) UNSIGNED NOT NULL,
  `status` varchar(50) NOT NULL DEFAULT '',
  `id_aviao` int(10) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aeroportos`
--
ALTER TABLE `aeroportos`
  ADD PRIMARY KEY (`id_aeroporto`),
  ADD KEY `id_cidade` (`id_cidade`) USING BTREE;

--
-- Indexes for table `avioes`
--
ALTER TABLE `avioes`
  ADD PRIMARY KEY (`id_aviao`);

--
-- Indexes for table `cidades`
--
ALTER TABLE `cidades`
  ADD PRIMARY KEY (`id_cidade`);

--
-- Indexes for table `passagens`
--
ALTER TABLE `passagens`
  ADD PRIMARY KEY (`id_passagem`),
  ADD KEY `fk_reserva` (`id_reserva`),
  ADD KEY `fk_voo` (`id_voo`);

--
-- Indexes for table `poltronas`
--
ALTER TABLE `poltronas`
  ADD PRIMARY KEY (`id_poltrona`),
  ADD KEY `fk_aviao` (`id_aviao`);

--
-- Indexes for table `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `fk_aeroporto` (`id_aeroporto`),
  ADD KEY `fk_poltrona` (`id_poltrona`),
  ADD KEY `fk_usuario` (`id_usuario`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indexes for table `voos`
--
ALTER TABLE `voos`
  ADD PRIMARY KEY (`id_voo`),
  ADD KEY `fk_aviao_voo` (`id_aviao`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aeroportos`
--
ALTER TABLE `aeroportos`
  MODIFY `id_aeroporto` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `avioes`
--
ALTER TABLE `avioes`
  MODIFY `id_aviao` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `cidades`
--
ALTER TABLE `cidades`
  MODIFY `id_cidade` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `passagens`
--
ALTER TABLE `passagens`
  MODIFY `id_passagem` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `poltronas`
--
ALTER TABLE `poltronas`
  MODIFY `id_poltrona` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `reservas`
--
ALTER TABLE `reservas`
  MODIFY `id_reserva` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `voos`
--
ALTER TABLE `voos`
  MODIFY `id_voo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `aeroportos`
--
ALTER TABLE `aeroportos`
  ADD CONSTRAINT `fk_cidades` FOREIGN KEY (`id_cidade`) REFERENCES `cidades` (`id_cidade`);

--
-- Limitadores para a tabela `passagens`
--
ALTER TABLE `passagens`
  ADD CONSTRAINT `fk_reserva` FOREIGN KEY (`id_reserva`) REFERENCES `reservas` (`id_reserva`),
  ADD CONSTRAINT `fk_voo` FOREIGN KEY (`id_voo`) REFERENCES `voos` (`id_voo`);

--
-- Limitadores para a tabela `poltronas`
--
ALTER TABLE `poltronas`
  ADD CONSTRAINT `fk_aviao` FOREIGN KEY (`id_aviao`) REFERENCES `avioes` (`id_aviao`);

--
-- Limitadores para a tabela `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `fk_aeroporto` FOREIGN KEY (`id_aeroporto`) REFERENCES `aeroportos` (`id_aeroporto`),
  ADD CONSTRAINT `fk_poltrona` FOREIGN KEY (`id_poltrona`) REFERENCES `poltronas` (`id_poltrona`),
  ADD CONSTRAINT `fk_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`);

--
-- Limitadores para a tabela `voos`
--
ALTER TABLE `voos`
  ADD CONSTRAINT `fk_aviao_voo` FOREIGN KEY (`id_aviao`) REFERENCES `avioes` (`id_aviao`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
