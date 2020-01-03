-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 03 jan. 2020 à 14:12
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `dev18tpbinome`
--
CREATE DATABASE IF NOT EXISTS `dev18tpbinome` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `dev18tpbinome`;

-- --------------------------------------------------------

--
-- Structure de la table `histopoids`
--

DROP TABLE IF EXISTS `histopoids`;
CREATE TABLE IF NOT EXISTS `histopoids` (
  `idhp` int(11) NOT NULL,
  `poids` decimal(10,0) NOT NULL,
  `idPerson` int(11) NOT NULL,
  `date` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idhp`),
  UNIQUE KEY `idhp_UNIQUE` (`idhp`),
  KEY `fk_histoPoids_Person_idx` (`idPerson`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `objhebdo`
--

DROP TABLE IF EXISTS `objhebdo`;
CREATE TABLE IF NOT EXISTS `objhebdo` (
  `idobjhebdo` int(11) NOT NULL,
  `datedebut` datetime DEFAULT CURRENT_TIMESTAMP,
  `objectif` decimal(10,0) DEFAULT NULL,
  `idPerson` int(11) NOT NULL,
  PRIMARY KEY (`idobjhebdo`),
  KEY `fk_ObjHebdo_Person1_idx` (`idPerson`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `person`
--

DROP TABLE IF EXISTS `person`;
CREATE TABLE IF NOT EXISTS `person` (
  `idPerson` int(11) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `mdp` varchar(45) NOT NULL,
  `poids` double DEFAULT NULL,
  `taille` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `sexe` tinyint(4) DEFAULT NULL,
  `lastconnection` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idPerson`),
  UNIQUE KEY `idPerson_UNIQUE` (`idPerson`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `person`
--

INSERT INTO `person` (`idPerson`, `nom`, `prenom`, `mail`, `login`, `mdp`, `poids`, `taille`, `age`, `sexe`, `lastconnection`) VALUES
(1, 'flo', 'celia', 'truc@lapost.com', 'log1', 'mdp1', 50, '150', '25', 1, '2020-01-03 15:10:56');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `histopoids`
--
ALTER TABLE `histopoids`
  ADD CONSTRAINT `fk_histoPoids_Person` FOREIGN KEY (`idPerson`) REFERENCES `person` (`idPerson`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `objhebdo`
--
ALTER TABLE `objhebdo`
  ADD CONSTRAINT `fk_ObjHebdo_Person1` FOREIGN KEY (`idPerson`) REFERENCES `person` (`idPerson`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
