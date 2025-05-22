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
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `issue_description` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `id_consulation_schedule` bigint DEFAULT NULL,
  `birth_date` varchar(255) DEFAULT NULL,
  `date_appointment` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpigpadw7k2f3b2xpdyevbb9uq` (`id_consulation_schedule`),
  CONSTRAINT `FKpigpadw7k2f3b2xpdyevbb9uq` FOREIGN KEY (`id_consulation_schedule`) REFERENCES `consultation_schedule` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` VALUES (93,'Le Huu Tho k7/38','thanhnam23@gmail.com','ThanhNam','Nam','Tôi hay bị ho và chóng mặt','0123456789','COMPLETED',2313,'14-05-2006','2025-05-16 23:46:59.681194'),(95,'Liên chiểu','hung789@gmail.com','Nguyen Duc Hung','Nam','Đau lưng\n','0918890797','COMPLETED',4321,'2004-12-12','2025-05-17 23:38:24.847477'),(96,'Liên chiểu','hung789@gmail.com','Nguyen Duc Hung','Nam','Đau lưng','0918890797','CONFIRMED',4401,'2004-12-12','2025-05-17 23:40:08.828016'),(97,'Sơn Trà','hung789@gmail.com','Nguyễn Trúc thùy tiên','Nữ','Đau lưng','0918890797','PENDING',4337,'2004-12-12','2025-05-18 18:33:45.053552'),(98,'Cẩm Lệ','hung789@gmail.com','Nguyễn Mạnh dũng','Nam','Đau Lưng','0918890797','PENDING',3981,'2004-12-12','2025-05-18 18:34:16.710355'),(99,'Thanh Khê','hung789@gmail.com','Nguyen Duc Hung','Nam','Đau lưng','0918890797','CONFIRMED',4086,'2004-12-12','2025-05-18 18:34:47.459577'),(100,'Liên chiểu','hung789@gmail.com','Nguyen Duc Hung','Nam','Đau lưng','0918890797','PENDING',4342,'2004-12-12','2025-05-18 19:45:11.055853'),(102,'Sơn Trà','le123@gmail.com','Lê Huỳnh','Nam','Đau lưng','0123456789','CONFIRMED',4403,'2004-12-12','2025-05-19 11:39:07.273541');
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-22 21:33:05
