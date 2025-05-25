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
-- Table structure for table `medical_record`
--

DROP TABLE IF EXISTS `medical_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical_record` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `diagnosis` varchar(255) DEFAULT NULL,
  `prescription` text,
  `id_client` bigint DEFAULT NULL,
  `id_doctor` bigint DEFAULT NULL,
  `birth_date_patient` datetime(6) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `note` text,
  `name_patient` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfl8h2oohry0m11daf3xc7i7` (`id_client`),
  KEY `FK4slwna87hhxyl4pc2d86bcjj9` (`id_doctor`),
  CONSTRAINT `FK4slwna87hhxyl4pc2d86bcjj9` FOREIGN KEY (`id_doctor`) REFERENCES `doctor` (`id`),
  CONSTRAINT `FKfl8h2oohry0m11daf3xc7i7` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_record`
--

LOCK TABLES `medical_record` WRITE;
/*!40000 ALTER TABLE `medical_record` DISABLE KEYS */;
INSERT INTO `medical_record` VALUES (7,'2025-05-16 01:59:13.176141','Có vấn đề về não bộ và tứ chi ','Thuốc bổ não , Thuốc gia tăng dinh dưỡng ',32,14,'1999-06-12 01:59:13.176141','Nam','Cần nghỉ ngơi thêm','Nguyễn Hoài Nam'),(8,'2025-05-16 01:59:35.294408','Có vấn đề về não bộ và tứ chi ','Thuốc bổ não , Thuốc gia tăng dinh dưỡng ',24,14,'1999-06-12 01:59:35.294408','Nam','Cần nghỉ ngơi thêm','Nguyễn Thanh Khải'),(11,'2025-05-24 11:49:00.022557','Có vấn đề về não bộ và tứ chi ','Thuốc bổ não , Thuốc gia tăng dinh dưỡng ',24,14,'2003-06-23 11:49:00.022557','Nam','Nghỉ ngời nhiều','Trần quốc tuấn'),(22,'2025-05-25 22:52:23.761632','Chảy máu cam','Vitamin  B',57,14,'2003-09-19 22:52:23.761632','Nam','Nghỉ ngơi nhiều ','Lê Minh Dũng'),(23,'2025-05-25 22:51:29.758619','Có Dấu hiệu suy sụp','VItamin BHA,Vitamin C2',70,14,'2003-01-01 22:51:29.758619','Nam','Nghỉ ngơi nhiều','Nguyễn Đức Mạnh'),(24,'2025-05-25 23:31:26.944544','Có Dấu Hiệu suy dược','Vitamin A, Vitamin B',71,15,'2001-01-01 23:31:26.944544','Nam','Cần nghỉ ngơi nhiều','Nguyễn Đình Công'),(25,'2025-05-26 01:11:15.557782','Có Dấu Hiệu suy dược','Vitamin BHA,Vitamin CA',67,15,'2001-01-01 01:11:15.557782','Nam','áda','Nguyễn Đình Công'),(26,'2025-05-26 01:11:46.978850','Dau','abc',78,15,'2000-12-12 01:11:46.978850','Nam','abc','hung'),(27,'2025-05-26 01:41:43.099741','Có Dấu hiệu suy sụp','3 vien thuoc',79,29,'2001-01-01 01:41:43.099741','Nam','1 ngay ','Tai Nguyen'),(28,'2025-05-26 01:50:32.726483','Có Dấu hiệu suy sụp','1 vien thuoc vitamin',2,29,'2001-01-01 01:50:32.726483','Nam','1 ngay 1 vien','Lê Minh Dũng');
/*!40000 ALTER TABLE `medical_record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-26  1:53:08
