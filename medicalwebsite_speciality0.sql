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
-- Table structure for table `speciality`
--

DROP TABLE IF EXISTS `speciality`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `speciality` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `create_at` datetime(6) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `speciality`
--

LOCK TABLES `speciality` WRITE;
/*!40000 ALTER TABLE `speciality` DISABLE KEYS */;
INSERT INTO `speciality` VALUES (1,'2025-04-12 10:44:02.821143','Nerve','https://medpro.vn/_next/image?url=https%3A%2F%2Fcdn-pkh.longvan.net%2Fmedpro-production%2Fdefault%2Favatar%2Fsubjects%2Ftam_than_kinh.png&w=256&q=75'),(2,'2025-04-12 10:49:26.775788','Musculoskeletal','https://medpro.vn/_next/image?url=https%3A%2F%2Fcdn-pkh.longvan.net%2Fmedpro-production%2Fdefault%2Favatar%2Fsubjects%2Fxuong_khop_chinh_hinh.png&w=256&q=75'),(3,'2025-04-12 10:50:10.853875','Digestion','https://medpro.vn/_next/image?url=https%3A%2F%2Fcdn-pkh.longvan.net%2Fmedpro-production%2Fdefault%2Favatar%2Fsubjects%2Ftieu_hoa.png&w=256&q=7'),(6,'2025-04-12 10:51:02.914985','Dermatology','https://medpro.vn/_next/image?url=https%3A%2F%2Fcdn-pkh.longvan.net%2Fmedpro-production%2Fdefault%2Favatar%2Fsubjects%2Fda_lieu.png&w=256&q=75'),(7,'2025-04-12 10:51:14.623630','Pediatrics','https://medpro.vn/_next/image?url=https%3A%2F%2Fcdn-pkh.longvan.net%2Fmedpro-production%2Fumc%2Fsubjects%2FKBTS%2F1651820887681-SAN_KHOA_CHAN_DOAN_TRUOC_SINH.png&w=256&q=75'),(8,'2025-04-12 10:51:31.637515','Fetal ultrasound','https://medpro.vn/_next/image?url=https%3A%2F%2Fcdn-pkh.longvan.net%2Fmedpro-production%2Fumc%2Fsubjects%2FKBTS%2F1651820887681-SAN_KHOA_CHAN_DOAN_TRUOC_SINH.png&w=256&q=75'),(9,'2025-04-12 10:56:37.647369','Internal medicine','https://medpro.vn/_next/image?url=https%3A%2F%2Fcdn-pkh.longvan.net%2Fmedpro-production%2Fumc%2Fsubjects%2FKBTS%2F1651820887681-SAN_KHOA_CHAN_DOAN_TRUOC_SINH.png&w=256&q=75'),(10,'2025-04-12 10:58:09.978517','Kidney','https://medpro.vn/_next/image?url=https%3A%2F%2Fcdn-pkh.longvan.net%2Fmedpro-production%2Fumc%2Fsubjects%2FKBTS%2F1651820887681-SAN_KHOA_CHAN_DOAN_TRUOC_SINH.png&w=256&q=75');
/*!40000 ALTER TABLE `speciality` ENABLE KEYS */;
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
