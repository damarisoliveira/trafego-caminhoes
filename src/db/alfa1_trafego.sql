-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: alfa1
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `trafego`
--

DROP TABLE IF EXISTS `trafego`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trafego` (
  `id` int NOT NULL AUTO_INCREMENT,
  `movimento` varchar(45) DEFAULT NULL,
  `nomeCaminhao` varchar(45) DEFAULT NULL,
  `placaCaminhao` varchar(45) DEFAULT NULL,
  `odometroCaminhao` int DEFAULT NULL,
  `nomeMotorista` varchar(45) DEFAULT NULL,
  `destinoOrigem` varchar(45) DEFAULT NULL,
  `lacre1` int DEFAULT NULL,
  `lacre2` int DEFAULT NULL,
  `lacre3` int DEFAULT NULL,
  `nomeFiscal` varchar(45) DEFAULT NULL,
  `data` datetime DEFAULT NULL,
  `empresa` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trafego`
--

LOCK TABLES `trafego` WRITE;
/*!40000 ALTER TABLE `trafego` DISABLE KEYS */;
INSERT INTO `trafego` VALUES (17,'ENTRADA','C1','C1C1C1',1200,'JOAO','DEP1',20,19,18,'MARCIO','2022-03-19 10:26:46','MAT'),(18,'SAIDA','C1','C1C1C1',1200,'LUIS','DEP2',21,31,41,'MARCIO','2022-03-19 10:28:11','MAT'),(19,'ENTRADA','C2','C2C2C2',1300,'MARCOS','DEP2',22,32,42,'MARCIO','2022-03-19 10:29:00','MAT');
/*!40000 ALTER TABLE `trafego` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-19 10:33:45
