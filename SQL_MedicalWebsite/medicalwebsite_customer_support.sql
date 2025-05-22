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
-- Table structure for table `customer_support`
--

DROP TABLE IF EXISTS `customer_support`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_support` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `image_path` varchar(255) DEFAULT NULL,
  `id_client` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7gnx5faxjtuhmxvm8sqt4x2we` (`id_client`),
  CONSTRAINT `FK7gnx5faxjtuhmxvm8sqt4x2we` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_support`
--

LOCK TABLES `customer_support` WRITE;
/*!40000 ALTER TABLE `customer_support` DISABLE KEYS */;
INSERT INTO `customer_support` VALUES (2,'https://thumbs.dreamstime.com/b/portrait-no-sign-young-man-head-shake-portrait-no-sign-man-glasses-head-shake-219839183.jpg',18),(3,'https://thumbs.dreamstime.com/z/portrait-young-business-man-suit-glasses-57988617.jpg',19),(4,'https://th.bing.com/th/id/OIP.mnSZ6eZII-fijn30fIVzbgHaLu?cb=iwp2&w=1068&h=1690&rs=1&pid=ImgDetMain',24),(5,'https://th.bing.com/th/id/OIP.bmNx4HcklMqp-k11aTDbkQHaE8?cb=iwp2&rs=1&pid=ImgDetMain',32),(6,'https://th.bing.com/th/id/OIP.bmNx4HcklMqp-k11aTDbkQHaE8?cb=iwp2&rs=1&pid=ImgDetMain',27),(11,'blob:http://localhost:5173/411f2075-7403-4817-9c8a-2f7fa803b7f0',60),(12,'blob:http://localhost:5173/332b10d2-b3c1-4ca3-b76a-e0657ad388e7',44);
/*!40000 ALTER TABLE `customer_support` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-22 21:33:04
