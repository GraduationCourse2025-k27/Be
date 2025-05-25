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
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` VALUES (109,'Sơn Trà','le123@gmail.com','Lê Huỳnh','Nam','Đau lưng','0123456789','PENDING',5206,'2004-12-12','2025-05-24 13:02:13.729880'),(110,'Sơn Trà','le123@gmail.com','Lê Huỳnh','Nam','Đau lưng','0123456789','PENDING',5207,'2004-12-12','2025-05-24 13:02:29.898340'),(111,'Sơn Trà','le123@gmail.com','Lê Huỳnh','Nam','Đau lưng','0123456789','PENDING',5208,'2004-12-12','2025-05-24 13:02:46.610102'),(112,'Sơn Trà','le123@gmail.com','Lê Huỳnh','Nam','Đau lưng','0123456789','PENDING',5209,'2004-12-12','2025-05-24 13:03:04.224679'),(126,'Sơn trà','hophuctam7112003@gmail.com','Hồ Phúc Tâm','Nam','Đau lưng','0984427846','PENDING',891,'2004-12-12','2025-05-25 14:56:31.029638'),(127,'Sơn trà','hophuctam7112003@gmail.com','Hồ Phúc Tâm','Nam','Đau lưng','0984427846','CONFIRMED',771,'2004-12-12','2025-05-25 14:57:07.790587'),(128,'Liên Chiểu','kieutrang03@gmail.com','Nguyễn thị Kiều trang','Nam','Đau lưng','0236541789','CANCELLED',886,'2004-12-12','2025-05-25 14:59:07.471680'),(129,'Liên Chiểu','kieutrang03@gmail.com','Nguyễn thị Kiều trang','Nữ','Đau lưng','0236541789','CANCELLED',887,'2004-12-12','2025-05-25 14:59:26.700659'),(130,'Liên Chiểu','kieutrang03@gmail.com','Nguyễn thị Kiều trang','Nam','Đau lưng','0236541789','COMPLETED',831,'2004-12-12','2025-05-25 15:02:48.965974'),(133,'Thanh Khê','minhhoang03@gmail.com','Lê Hoàng                                 ','Nam','Đau lưng','0213654789','PENDING',366,'2004-12-12','2025-05-25 15:25:14.100283'),(134,'Đà nẵng','KieuMy2000h@gmail.com','Nguyễn Thanh Kiều Mỹ','Nam','Đau lưng','0875694231','CONFIRMED',936,'2004-12-12','2025-05-25 16:24:50.380987'),(135,'Sơn Trà','PhanMinh123@gmail.com','Lê Phan','Nam','Đau lưng','0213654789','CANCELLED',381,'2004-12-12','2025-05-25 17:02:10.218796'),(136,'Sơn Trà','PhanMinh123@gmail.com','Lê Phan','Nam','Đau lưng','0984427846','CANCELLED',892,'2004-12-12','2025-05-25 17:10:47.577089'),(137,'Sơn Trà','PhanMinh123@gmail.com','Lê Phan','Nam','Đau lưng','0984427846','CANCELLED',1036,'2004-12-12','2025-05-25 17:11:21.103448'),(138,'Sơn Trà','PhanMinh123@gmail.com','Lê Phan','Nam','Đau lưng','0984427846','CANCELLED',816,'2004-12-12','2025-05-25 17:12:07.750092'),(139,'Sơn Trà','PhanMinh123@gmail.com','Lê Phan','Nam','Đau lưng','0984427846','CANCELLED',801,'2004-12-12','2025-05-25 17:12:45.109705'),(140,'Sơn Trà','PhanMinh123@gmail.com','Lê Phan','Nam','','0984427846','CANCELLED',893,'2004-12-12','2025-05-25 17:13:29.712199'),(141,'Sơn Trà','PhanMinh123@gmail.com','Lê Phan','Nam','','0984427846','CANCELLED',892,'2004-12-12','2025-05-25 17:15:43.401484'),(142,'Sơn Trà','PhanMinh123@gmail.com','Lê Phan','Nam','Đau lưng','0984427846','CANCELLED',906,'2004-12-12','2025-05-25 17:19:47.349982'),(143,'hai chau','tantai123@gmail.com','Tan Tai','Nam','bi sot','0323332121','PENDING',976,'2000-02-01','2025-05-25 17:26:15.052607'),(144,'hai chau','tantai123@gmail.com','Tan Tai','Nam','dau dau\n','0323332121','CONFIRMED',978,'2000-12-12','2025-05-25 17:26:59.324316'),(148,'Sơn Trà','PhanMinh123@gmail.com','Lê Phan','Nam','','0984427846','CANCELLED',977,'2004-12-12','2025-05-25 17:44:13.536013'),(149,'Sơn Trà','PhanMinh123@gmail.com','Lê Phan','Nam','','0984427846','CANCELLED',977,'2000-12-02','2025-05-25 17:45:49.457565'),(153,'Đà nẵng','kimmy58585@gmail.com','Nguyễn Thanh Kiều Mỹ','Nam','Đau lưng','0125879643','PENDING',877,'2004-12-12','2025-05-25 20:38:43.240765'),(154,'Đà nẵng','adminC03@gmail.com','anymousMedical','Nam','Đau lưng','0123456789','PENDING',36,'2004-12-12','2025-05-25 21:19:20.552756'),(155,'Đà nẵng','huuhung04@gmail.com','nguyen huu hung','Nam','Đau lưng','0236541789','PENDING',906,'2004-12-12','2025-05-25 21:34:29.061129'),(156,'Đà nẵng','huuhung04@gmail.com','nguyen huu hung','Nam','','0236541789','CONFIRMED',892,'2004-12-12','2025-05-25 21:34:51.638424'),(157,'Liên Chiểu','kieutrang03@gmail.com','Nguyễn thị Kiều trang','Nam','Đau lưng','0236541789','PENDING',786,'2004-12-12','2025-05-25 21:39:00.863132'),(158,'Đà nẵng','KieuMy2000h@gmail.com','Nguyễn Thanh Kiều Mỹ','Nam','','0875694231','CONFIRMED',472,'2004-12-12','2025-05-25 23:35:42.804263'),(159,'hai chau','hung123@gmail.com','Hung Nguyen','Nữ','','0984427840','PENDING',346,'2000-12-20','2025-05-26 00:57:30.785456'),(160,'hai chau','hung123@gmail.com','Hung Nguyen','Nữ','','0984427840','CANCELLED',871,'2000-12-12','2025-05-26 01:00:04.216560'),(161,'hai chau','hung123@gmail.com','Hung Nguyen','Nam','','0984427840','CONFIRMED',871,'2000-12-12','2025-05-26 01:03:25.625268'),(162,'hai chau','hung123@gmail.com','Hung Nguyen','Nữ','','0984427840','CANCELLED',886,'2000-12-12','2025-05-26 01:16:41.886032'),(163,'hai chau','hung123@gmail.com','Hung Nguyen','Nữ','','0984427840','CANCELLED',886,'2000-12-12','2025-05-26 01:18:36.253468'),(164,'hai chau','tantai12123@gmail.com','Tai Nguyen','Nam','','0123456789','COMPLETED',873,'2000-12-12','2025-05-26 01:38:11.837759'),(165,'Le Huu Tho k7/38','jun03@gmail.com','Lee Min Jun','Nam','','0987456123','CONFIRMED',979,'2000-12-12','2025-05-26 01:44:32.019468'),(166,'Le Huu Tho k7/38','jun03@gmail.com','Lee Min Jun','Nam','','0987456123','CONFIRMED',887,'2000-12-12','2025-05-26 01:49:16.606537');
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

-- Dump completed on 2025-05-26  1:53:08
