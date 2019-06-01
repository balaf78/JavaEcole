-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  sam. 01 juin 2019 à 11:03
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `etudiant`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

DROP TABLE IF EXISTS `Admin`;
CREATE TABLE IF NOT EXISTS `Admin` (
  `ID` int(11) NOT NULL,
  `Identifiant` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Prenom` varchar(255) NOT NULL,
  `Nom` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `admin`
--

INSERT INTO `Admin` (`ID`, `Identifiant`, `Password`, `Prenom`, `Nom`) VALUES
(1, 'ladmin', 'admin', 'Gerard', 'Christophe');

-- --------------------------------------------------------

--
-- Structure de la table `anneescolaire`
--

DROP TABLE IF EXISTS `AnneeScolaire`;
CREATE TABLE IF NOT EXISTS `AnneeScolaire` (
  `id_anneescolaire` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_anneescolaire`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `anneescolaire`
--

INSERT INTO `AnneeScolaire` (`id_anneescolaire`) VALUES
(12),
(16);

-- --------------------------------------------------------

--
-- Structure de la table `bulletin`
--

DROP TABLE IF EXISTS `Bulletin`;
CREATE TABLE IF NOT EXISTS `Bulletin` (
  `id_bulletin` int(11) NOT NULL AUTO_INCREMENT,
  `appreciation_bulletin` varchar(255) NOT NULL,
  `id_trimestre` int(11) NOT NULL,
  `id_inscription` int(11) NOT NULL,
  PRIMARY KEY (`id_bulletin`),
  KEY `id_trimestre` (`id_trimestre`),
  KEY `id_inscription` (`id_inscription`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

DROP TABLE IF EXISTS `Classe`;
CREATE TABLE IF NOT EXISTS `Classe` (
  `id_classe` int(11) NOT NULL AUTO_INCREMENT,
  `nom_classe` varchar(255) NOT NULL,
  `id_ecole` int(11) NOT NULL,
  `id_niveau` int(11) NOT NULL,
  `id_anneescolaire` int(11) NOT NULL,
  PRIMARY KEY (`id_classe`),
  KEY `id_anneescolaire` (`id_anneescolaire`),
  KEY `id_ecole` (`id_ecole`),
  KEY `id_niveau` (`id_niveau`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `detailbulletin`
--

DROP TABLE IF EXISTS `DetailBulletin`;
CREATE TABLE IF NOT EXISTS `DetailBulletin` (
  `id_detailbulletin` int(11) NOT NULL AUTO_INCREMENT,
  `appreciation_detailbulletin` varchar(255) NOT NULL,
  `id_bulletin` int(11) NOT NULL,
  `id_enseignement` int(11) NOT NULL,
  PRIMARY KEY (`id_detailbulletin`),
  KEY `id_bulletin` (`id_bulletin`),
  KEY `id_enseignement` (`id_enseignement`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `discipline`
--

DROP TABLE IF EXISTS `Discipline`;
CREATE TABLE IF NOT EXISTS `Discipline` (
  `id_discipline` int(11) NOT NULL AUTO_INCREMENT,
  `nom_discipline` varchar(255) NOT NULL,
  PRIMARY KEY (`id_discipline`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `ecole`
--

DROP TABLE IF EXISTS `Ecole`;
CREATE TABLE IF NOT EXISTS `Ecole` (
  `id_ecole` int(11) NOT NULL AUTO_INCREMENT,
  `nom_ecole` varchar(255) NOT NULL,
  PRIMARY KEY (`id_ecole`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `enseignement`
--

DROP TABLE IF EXISTS `Enseignement`;
CREATE TABLE IF NOT EXISTS `Enseignement` (
  `id_enseignement` int(11) NOT NULL AUTO_INCREMENT,
  `id_classe` int(11) NOT NULL,
  `id_discipline` int(11) NOT NULL,
  `id_personne` int(11) NOT NULL,
  PRIMARY KEY (`id_enseignement`),
  KEY `id_classe` (`id_classe`),
  KEY `id_discipline` (`id_discipline`),
  KEY `id_personne` (`id_personne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `Etudiant`;
CREATE TABLE IF NOT EXISTS `Etudiant` (
  `ID` int(11) NOT NULL,
  `Identifiant` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Nom` varchar(255) NOT NULL,
  `Prenom` varchar(255) NOT NULL,
  `Classe` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `Etudiant` (`ID`, `Identifiant`, `Password`, `Nom`, `Prenom`, `Classe`) VALUES
(1, 'julien93', 'julien', 'Mercier', 'Julien', '4eme');

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

DROP TABLE IF EXISTS `Evaluation`;
CREATE TABLE IF NOT EXISTS `Evaluation` (
  `id_evaluation` int(11) NOT NULL AUTO_INCREMENT,
  `note_evaluation` float NOT NULL,
  `appreciation_evaluation` varchar(255) DEFAULT NULL,
  `id_detailbulletin` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_evaluation`),
  KEY `id_detailbulletin` (`id_detailbulletin`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `evaluation`
--

INSERT INTO `Evaluation` (`id_evaluation`, `note_evaluation`, `appreciation_evaluation`, `id_detailbulletin`) VALUES
(1, 130, NULL, NULL),
(15, 5, NULL, NULL),
(17, 19, NULL, NULL),
(18, 15, NULL, NULL),
(19, 14, NULL, NULL),
(20, 15, NULL, NULL),
(21, 14, NULL, NULL),
(22, 0, NULL, NULL),
(23, 4, NULL, NULL),
(24, 2, NULL, NULL),
(25, 4, NULL, NULL),
(26, 5, NULL, NULL),
(27, 5, NULL, NULL),
(28, 2, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

DROP TABLE IF EXISTS `Inscription`;
CREATE TABLE IF NOT EXISTS `Inscription` (
  `id_inscription` int(11) NOT NULL AUTO_INCREMENT,
  `id_classe` int(11) NOT NULL,
  `id_personne` int(11) NOT NULL,
  PRIMARY KEY (`id_inscription`),
  KEY `id_classe` (`id_classe`),
  KEY `id_personne` (`id_personne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

DROP TABLE IF EXISTS `Niveau`;
CREATE TABLE IF NOT EXISTS `Niveau` (
  `id_niveau` int(11) NOT NULL AUTO_INCREMENT,
  `nom_niveau` varchar(255) NOT NULL,
  PRIMARY KEY (`id_niveau`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `Personne`;
CREATE TABLE IF NOT EXISTS `Personne` (
  `id_personne` int(11) NOT NULL AUTO_INCREMENT,
  `nom_personne` varchar(255) NOT NULL,
  `prenom_personne` varchar(255) NOT NULL,
  `type` int(11) NOT NULL,
  PRIMARY KEY (`id_personne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `prof`
--

DROP TABLE IF EXISTS `Prof`;
CREATE TABLE IF NOT EXISTS `Prof` (
  `Id` int(11) NOT NULL,
  `Identifiant` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `prof`
--

INSERT INTO `Prof` (`Id`, `Identifiant`, `Password`) VALUES
(1, 'lola', 'loli');

-- --------------------------------------------------------

--
-- Structure de la table `trimestre`
--

DROP TABLE IF EXISTS `Trimestre`;
CREATE TABLE IF NOT EXISTS `Trimestre` (
  `id_trimestre` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(11) NOT NULL,
  `debut` date NOT NULL,
  `fin` date NOT NULL,
  `id_anneescolaire` int(11) NOT NULL,
  PRIMARY KEY (`id_trimestre`),
  KEY `id_anneescolaire` (`id_anneescolaire`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `bulletin`
--
ALTER TABLE `Bulletin`
  ADD CONSTRAINT `bulletin_ibfk_1` FOREIGN KEY (`id_trimestre`) REFERENCES `Trimestre` (`id_trimestre`),
  ADD CONSTRAINT `bulletin_ibfk_2` FOREIGN KEY (`id_inscription`) REFERENCES `Inscription` (`id_inscription`);

--
-- Contraintes pour la table `classe`
--
ALTER TABLE `Classe`
  ADD CONSTRAINT `classe_ibfk_1` FOREIGN KEY (`id_anneescolaire`) REFERENCES `AnneeScolaire` (`id_anneescolaire`),
  ADD CONSTRAINT `classe_ibfk_2` FOREIGN KEY (`id_ecole`) REFERENCES `Ecole` (`id_ecole`),
  ADD CONSTRAINT `classe_ibfk_3` FOREIGN KEY (`id_niveau`) REFERENCES `Niveau` (`id_niveau`);

--
-- Contraintes pour la table `detailbulletin`
--
ALTER TABLE `DetailBulletin`
  ADD CONSTRAINT `detailbulletin_ibfk_1` FOREIGN KEY (`id_bulletin`) REFERENCES `Bulletin` (`id_bulletin`),
  ADD CONSTRAINT `detailbulletin_ibfk_2` FOREIGN KEY (`id_enseignement`) REFERENCES `Enseignement` (`id_enseignement`);

--
-- Contraintes pour la table `enseignement`
--
ALTER TABLE `Enseignement`
  ADD CONSTRAINT `enseignement_ibfk_1` FOREIGN KEY (`id_classe`) REFERENCES `Classe` (`id_classe`),
  ADD CONSTRAINT `enseignement_ibfk_2` FOREIGN KEY (`id_discipline`) REFERENCES `Discipline` (`id_discipline`),
  ADD CONSTRAINT `enseignement_ibfk_3` FOREIGN KEY (`id_personne`) REFERENCES `Ecole` (`id_ecole`);

--
-- Contraintes pour la table `evaluation`
--
ALTER TABLE `Evaluation`
  ADD CONSTRAINT `evaluation_ibfk_1` FOREIGN KEY (`id_detailbulletin`) REFERENCES `DetailBulletin` (`id_detailbulletin`);

--
-- Contraintes pour la table `inscription`
--
ALTER TABLE `Inscription`
  ADD CONSTRAINT `inscription_ibfk_1` FOREIGN KEY (`id_classe`) REFERENCES `Classe` (`id_classe`),
  ADD CONSTRAINT `inscription_ibfk_2` FOREIGN KEY (`id_personne`) REFERENCES `Personne` (`id_personne`);

--
-- Contraintes pour la table `trimestre`
--
ALTER TABLE `Trimestre`
  ADD CONSTRAINT `trimestre_ibfk_1` FOREIGN KEY (`id_anneescolaire`) REFERENCES `AnneeScolaire` (`id_anneescolaire`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
