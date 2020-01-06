-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 06 jan. 2020 à 09:29
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de données :  `dev18tpbinome`
--
CREATE SCHEMA IF NOT EXISTS `dev18tpbinome`;
USE `dev18tpbinome`;
-- --------------------------------------------------------

--
-- Structure de la table `histopoids`
--

DROP TABLE IF EXISTS `histopoids`;
CREATE TABLE IF NOT EXISTS `histopoids` (
  `idhp` int(11) NOT NULL AUTO_INCREMENT,
  `poids` decimal(10,0) NOT NULL,
  `idPerson` int(11) NOT NULL,
  `date` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idhp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `objhebdo`
--

DROP TABLE IF EXISTS `objhebdo`;
CREATE TABLE IF NOT EXISTS `objhebdo` (
  `idobjhebdo` int(11) NOT NULL AUTO_INCREMENT,
  `datedebut` datetime DEFAULT CURRENT_TIMESTAMP,
  `objectif` decimal(10,0) DEFAULT NULL,
  `idPerson` int(11) NOT NULL,
  PRIMARY KEY (`idobjhebdo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------
--
-- Structure de la table `person`
--

DROP TABLE IF EXISTS `person`;
CREATE TABLE IF NOT EXISTS `person` (
  `idPerson` int(11) NOT NULL AUTO_INCREMENT,
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
  PRIMARY KEY (`idPerson`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
COMMIT;
