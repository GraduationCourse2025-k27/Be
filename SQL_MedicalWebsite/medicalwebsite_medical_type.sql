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
-- Table structure for table `medical_type`
--

DROP TABLE IF EXISTS `medical_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical_type` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `create_at` datetime(6) DEFAULT NULL,
  `name_service` varchar(120) DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_type`
--

LOCK TABLES `medical_type` WRITE;
/*!40000 ALTER TABLE `medical_type` DISABLE KEYS */;
INSERT INTO `medical_type` VALUES (4,'2025-04-22 10:49:37.475501',' Tổng quát ','https://th.bing.com/th/id/OIP.CkSM5kBhfDxzJrNydhEJCwHaE8?rs=1&pid=ImgDetMain',50000,'giúp bạn đánh giá toàn diện tình trạng sức khỏe hiện tại thông qua các xét nghiệm'),(6,'2025-05-16 17:05:46.451020',' Xét nghiệm ','https://th.bing.com/th/id/OIP.K50IY76qO58qnn0iaD5XPgHaE7?rs=1&pid=ImgDetMain',600000,'giúp bạn đánh giá toàn diện tình trạng sức khỏe hiện tại thông qua các xét nghiệm'),(9,'2025-04-22 10:52:23.145777',' Phẫu Thuật ','https://th.bing.com/th/id/OIP.geSd-IB9ly5BE---0BgHjQHaEK?rs=1&pid=ImgDetMain',50000,'giúp bạn đánh giá toàn diện tình trạng sức khỏe hiện tại thông qua các xét nghiệm'),(13,'2025-04-22 10:55:00.817555',' Siêu âm ','https://th.bing.com/th/id/OIP.T9Zbv5f6fRxe9XrgPXbmrQHaFW?w=1600&h=1157&rs=1&pid=ImgDetMain',50000,'giúp bạn đánh giá toàn diện tình trạng sức khỏe hiện tại thông qua các xét nghiệm'),(14,'2025-05-17 00:14:35.821592',' Ung thư ','https://th.bing.com/th/id/OIP.fGTe_eZxF2k96c-dxsZpngHaFz?rs=1&pid=ImgDetMain',50000,'giúp bạn đánh giá toàn diện tình trạng sức khỏe hiện tại thông qua các xét nghiệm');
/*!40000 ALTER TABLE `medical_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-17  0:26:22
