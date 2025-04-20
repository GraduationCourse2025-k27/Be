-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: medicalwebsite
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `consultation_schedule`
--

DROP TABLE IF EXISTS `consultation_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consultation_schedule` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_appointment` date DEFAULT NULL,
  `end_time` time(6) DEFAULT NULL,
  `is_booked` bit(1) DEFAULT NULL,
  `start_time` time(6) DEFAULT NULL,
  `id_doctor` bigint DEFAULT NULL,
  `id_medicalservice` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmn7jupjh0gqfxsk64cfq0v9wu` (`id_doctor`),
  KEY `FK25mbcy9q2anuqqdb17mloox32` (`id_medicalservice`),
  CONSTRAINT `FK25mbcy9q2anuqqdb17mloox32` FOREIGN KEY (`id_medicalservice`) REFERENCES `medical_type` (`id`),
  CONSTRAINT `FKmn7jupjh0gqfxsk64cfq0v9wu` FOREIGN KEY (`id_doctor`) REFERENCES `doctor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultation_schedule`
--

LOCK TABLES `consultation_schedule` WRITE;
/*!40000 ALTER TABLE `consultation_schedule` DISABLE KEYS */;
INSERT INTO `consultation_schedule` VALUES (1,'2025-04-14','08:00:00.000000',_binary '\0','07:30:00.000000',1,NULL),(2,'2025-04-14','09:00:00.000000',_binary '\0','08:30:00.000000',1,NULL),(3,'2025-04-14','10:00:00.000000',_binary '\0','09:30:00.000000',1,NULL),(4,'2025-04-14','11:00:00.000000',_binary '\0','10:30:00.000000',1,NULL),(5,'2025-04-15','08:30:00.000000',_binary '\0','08:00:00.000000',1,NULL),(6,'2025-04-14','14:00:00.000000',_binary '\0','13:30:00.000000',2,NULL),(7,'2025-04-14','15:00:00.000000',_binary '\0','14:30:00.000000',2,NULL),(8,'2025-04-14','16:00:00.000000',_binary '\0','15:30:00.000000',2,NULL),(9,'2025-04-14','17:00:00.000000',_binary '\0','16:30:00.000000',2,NULL),(10,'2025-04-14','18:00:00.000000',_binary '\0','17:30:00.000000',2,NULL),(11,'2025-04-15','14:00:00.000000',_binary '\0','13:30:00.000000',2,NULL),(12,'2025-04-15','15:00:00.000000',_binary '\0','14:30:00.000000',2,NULL),(13,'2025-04-15','16:00:00.000000',_binary '\0','15:30:00.000000',2,NULL),(14,'2025-04-15','17:00:00.000000',_binary '\0','16:30:00.000000',2,NULL),(15,'2025-04-15','18:00:00.000000',_binary '\0','17:30:00.000000',2,NULL),(16,'2025-04-16','14:00:00.000000',_binary '\0','13:30:00.000000',2,NULL),(17,'2025-04-16','15:00:00.000000',_binary '\0','14:30:00.000000',2,NULL),(18,'2025-04-16','16:00:00.000000',_binary '\0','15:30:00.000000',2,NULL),(19,'2025-04-16','17:00:00.000000',_binary '\0','16:30:00.000000',2,NULL),(20,'2025-04-16','18:00:00.000000',_binary '\0','17:30:00.000000',2,NULL);
/*!40000 ALTER TABLE `consultation_schedule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-19 17:05:07
