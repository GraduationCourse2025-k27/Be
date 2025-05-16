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
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `datetime` datetime(6) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  `id_client` bigint DEFAULT NULL,
  `id_speciality` bigint DEFAULT NULL,
  `examination_price` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKn43q7dw2nkwrt0o4bwv7impu2` (`id_client`),
  KEY `FKth8nc9mtk2799h5iesj6xp19l` (`id_speciality`),
  CONSTRAINT `FKn43q7dw2nkwrt0o4bwv7impu2` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`),
  CONSTRAINT `FKth8nc9mtk2799h5iesj6xp19l` FOREIGN KEY (`id_speciality`) REFERENCES `speciality` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (10,'2025-05-14 21:11:04.895879','nhiet huyet, tan tam','https://benhvienphuongdong.vn/public/uploads/doi-ngu-bac-si/thumbs/500x0/bs-nguyen-trung-chinh_4.png',14,8,460000),(14,'2025-05-14 14:24:10.582704','Bác sĩ tận tâm và có tầm','https://www.publicdomainpictures.net/pictures/210000/velka/doctor-1490804643Rfi.jpg',28,9,4578901),(15,'2025-05-14 14:24:51.587351','Bác sĩ tận tâm và nhiệt tình','https://th.bing.com/th/id/OIP.uUAvdBlqLXVZ0KjzM2XqOQHaLG?cb=iwp2&w=1280&h=1919&rs=1&pid=ImgDetMain',17,6,750000),(19,'2025-05-14 14:36:35.892191','Tận Tâm','https://thumbs.dreamstime.com/b/medicine-doctor-22930037.jpg',35,7,203356),(22,'2025-05-14 17:46:58.047168','Bác sĩ tận tâm và có tầm','https://th.bing.com/th/id/OIP.qNSiJ7PqVb9R24N0D_4bewHaNK?cb=iwp2&rs=1&pid=ImgDetMain',4,2,50000),(23,'2025-05-14 18:13:08.804406','nhiet huyet tan tam','https://benhvienphuongdong.vn/public/uploads/doi-ngu-bac-si/thumbs/500x0/bs-nguyen-trung-chinh_4.png',15,6,203356),(25,'2025-05-14 21:11:28.350463','Bác sĩ tận tâm và có tầm','https://th.bing.com/th/id/OIP.zozvUUvD02QucYPrUlSnlgHaJP?cb=iwp2&rs=1&pid=ImgDetMain',11,3,750000),(26,'2025-05-14 22:16:57.522373','Bác sĩ tận tâm và có tầm','https://th.bing.com/th/id/OIP.YBVrGLcv7AmVtB4z_PmedwHaHa?cb=iwp2&w=2000&h=2000&rs=1&pid=ImgDetMain',31,13,750000),(28,'2025-05-15 23:35:21.436714','Bác sĩ tận tâm và có tầm','https://cdn.bookingcare.vn/fo/w256/2019/12/31/155650-gs-ha-van-quyet.jpg',41,13,500000),(29,'2025-05-16 04:46:45.231337','Bác sĩ tận tâm và có tầm','https://cdn.medpro.vn/prod-partner/3580f6dc-bc34-4624-ac47-b4add9138d39-aaoaa_n_thaaa_baach_vaacentn.png?w=3840&q=75',8,8,500000),(30,'2025-05-16 17:00:53.410316','Bác sĩ tận tâm và có tầm','https://cdn.medpro.vn/prod-partner/fed8b62f-6f24-46bf-bfd4-7378a6bee398-bs_vaa(c)_aaaanh_khaai.png?w=1920&q=75',38,8,500000);
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
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
