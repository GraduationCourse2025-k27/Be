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
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `full_name` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `is_clock` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (2,'Le Huu Tho k7/38','2025-05-25 03:56:57.560288','jun03@gmail.com','Lee Min Jun','$2a$10$/pBFHYypR9EStTTHgKKEA.sHh1TZttnlR0ESC3rI1Os8t67OWebg6','0987456123','ROLE_USER',_binary '\0'),(4,'Le Duan ','2025-04-12 14:48:46.004840','thanhnam23@gmail.com','Nguyen Thanh Nam','$2a$10$8n3.5/f5w3T0iOISKhhTQeOh.dXBUpemKDbwXzfUaaU/0kNN6gd/O','125478963','ROLE_DOCTOR',_binary '\0'),(8,'Son Tra','2025-04-19 13:33:42.208282','KieuMy123123123@gmail.com','Nguyen Thanh kieu my','$2a$10$aminzeHs7rjj5Jpv.wZYze1xHK4rvIRSctDlbMp9culrx846z.IDi','0123456789','ROLE_DOCTOR',_binary '\0'),(11,'Thanh Khê','2025-04-19 13:43:35.488235','thanhhung003@gmail.com','Nguyễn Thành Hưng','$2a$10$MMx7LORz0IJ5ojaJfRJkEOMK6/g6GbhKiODL6L5tLuCHU5zna5vxm','0123456789','ROLE_DOCTOR',_binary '\0'),(15,'Sơn Trà Đà Nẵng','2025-04-19 14:40:03.798139','nguyenPhan23@gmail.com','Nguyễn Phan','$2a$10$8vqLSmsSdBRDjyIjX9e/c.7Co1JSjPpDY1ML1U.2TCf/vXBInJOum','0213654789','ROLE_DOCTOR',_binary '\0'),(17,'Sơn Trà Đà Nẵng','2025-04-19 14:48:26.151966','PhanMinh12@gmail.com','Phan Minh','$2a$10$oC0Z7ZwKOJ4pRh36.q1Hzupyww3RjhEjMqGeMVh1wnSQIntvNsiUq','0213654789','ROLE_DOCTOR',_binary '\0'),(18,'Thanh Khê','2025-04-19 14:54:40.175562','tantai03@gmail.com','Tan tai','$2a$10$16.x3zMapgWOywp.jDmvCetJsUn1bLo/l9wxZid3rQIleIsHpjyWu','0213654789','ROLE_STAFF',_binary '\0'),(19,'Liên Chiểu','2025-04-19 14:56:30.222457','tantai032@gmail.com','Nguyễn Thanh Công','$2a$10$ZZ8whGpanjhtryCoyYXUyeMB4ATb7wG2G/6fSyeB/cbrMRypTfXMq','0563214789','ROLE_STAFF',_binary '\0'),(23,'Sơn Trà','2025-04-19 15:19:38.272442','KieuMy03@gmail.com','Nguyễn Phan Kiều My','$2a$10$eE04WlgRKBL/cQsDe00jzekNkaJstEtZCjYzrCV7nKkApH0hZKzxO','0123456789','ROLE_USER',_binary '\0'),(24,'Sơn Trà','2025-04-19 16:36:52.240030','PhanMinh123@gmail.com','Lê Phan','$2a$10$erK0PKeZ4V1sjue5C.9Huujb5uWrWxAlmV8P6/lvfviKM13E5skQO','+84984427846','ROLE_USER',_binary '\0'),(26,'Thanh Khê','2025-04-19 16:46:57.511078','minhhoang03@gmail.com','Lê Hoàng                                 ','$2a$10$JQOArEd6.fg9y4PFfAgaP.G90TzEhGuidLyCPC6nW2DTQTIWKu29.','0213654789','ROLE_USER',_binary '\0'),(27,'Liên Chiểu','2025-04-19 16:47:44.344510','minh789@gmail.com','Minh Lê','$2a$10$BIzCUp510PTGfuVaQD6CKe3t2klnW79Cf3eY8YU/SsSxoMziZSAUS','0213654789','ROLE_STAFF',_binary '\0'),(28,'Sơn trà','2025-04-19 16:50:52.163003','hophuctam7112003@gmail.com','Hồ Phúc Tâm','$2a$10$DyImX05w60NRBeFXPHJzXOWnOkgr/7X4DoKVfnXUO//YVKJlxXmly','0984427846','ROLE_DOCTOR',_binary '\0'),(31,'Sơn Trà Đà Nẵng','2025-04-19 16:57:30.564709','PhanMinh789654@gmail.com','Phan Minh','$2a$10$R678yuzk44EgutKFsS7EZuSWcNRfrKuliHgSQa9T0mLyPFDcRpahq','0984427846','ROLE_DOCTOR',_binary '\0'),(32,'Sơn Trà Đà Nẵng','2025-04-19 17:01:25.388359','PhanMinh65@gmail.com','Phan Minh','$2a$10$xd4RX4P.pvD/PBmneWOo3uATLVIIedV97jF4Wvu7/oya/y8MbjcaC','0984427846','ROLE_USER',_binary '\0'),(35,'Sơn trà','2025-04-20 22:47:04.809177','Minhkhanh03@gmail.com','Minh Khánh','$2a$10$E4IOGvC9pKRrW0WwkV6BxeQPYn50IIr8TvJPsc4xbLuTxpsdhaXSK','0984427846','ROLE_DOCTOR',_binary '\0'),(36,'Sơn trà','2025-04-20 22:56:50.604202','mang0321@gmail.com','Lê Mạng','$2a$10$h02O7eGazX5Za55f.yaeG.U9PUrgbc5vtJuYAe3DolZa424HLI1/W','0984427846','ROLE_USER',_binary '\0'),(37,'Sơn trà','2025-04-20 23:13:43.042447','mang032155@gmail.com','Lê Mạng','$2a$10$PsHHSm1RsKL/92WDtqVlx.jB4H14oSxyFmTqpRiVWXMVpSVm8uSCu','0984427846','ROLE_USER',_binary '\0'),(39,'Sơn trà','2025-04-24 22:49:54.349213','hungday03@gmail.com','Nguyen Duc Hung','$2a$10$eg6Mk7YUMBlPaJOvLRh6geoYBUX5TzPC8lF7Mc2OprJOZQy0d/Cj2','0918890797','ROLE_DOCTOR',_binary '\0'),(41,'Quảng trị','2025-04-30 23:50:45.314860','HungJQK@gmail.com','Nguyen Duc Hung','$2a$10$YX7SWzmSLbcZuQ22A053gOgI1gBL6.Btn0p0dxQ55mnQ5QqkijBJq','0918890797','ROLE_DOCTOR',_binary '\0'),(42,'Liên chiểu','2025-05-03 01:01:11.254987','hung789@gmail.com','Nguyen Duc Hung','$2a$10$.UMRgD.VSY/fe6D1HqgpC.S1I8kA6eqYgM2ZziWlug7gGin1iKQBy','0918890797','ROLE_USER',_binary '\0'),(45,'Liên Chiểu','2025-05-18 16:36:42.947429','khanhlinh1999h@gmail.com','Nguyễn Huyền Khánh Linh','$2a$10$9Ioh7FCtgKp5BvHAJ5iKA.Nc4xrJesEF/mtgOGHAQPfgWm7/dZcAK','0123456789','ROLE_USER',_binary '\0'),(48,'Liên Chiểu','2025-05-18 16:37:12.211880','khanhlinh2002h@gmail.com','Nguyễn Huyền Khánh Linh','$2a$10$l1tfz6EWPMs48OzC3X9SKeNvFQ4qfscPPwmn3jNrMT55xKdBTG1P6','0213654789','ROLE_USER',_binary '\0'),(49,'Liên Chiểu','2025-05-18 16:37:21.406567','khanhlinh2003h@gmail.com','Nguyễn Huyền Khánh Linh','$2a$10$VT9QSP7RYazK6Yh6qfVOnee058tYIyo0Myhl0pKD2xMhgW0idulga','0875694231','ROLE_USER',_binary '\0'),(50,'Liên Chiểu','2025-05-18 16:37:25.882992','khanhlinh2004h@gmail.com','Nguyễn Huyền Khánh Linh','$2a$10$xsYwfjjFcyO3pzTkAZZH7OOeTxJKjuvqTVA03Y4djC.EPji/44z/6','0875694231','ROLE_USER',_binary '\0'),(52,'Đà nẵng','2025-05-18 16:37:57.625937','khanhlinh2006h@gmail.com','Nguyễn Huyền Khánh Linh','$2a$10$Dn.Kr4Om8B8p8n3J3P77cuuaXj6jOxZBF0VH833vMwnp/tXX08qcO','0875694231','ROLE_USER',_binary '\0'),(54,'Đà nẵng','2025-05-18 16:38:04.153594','khanhlinh2008h@gmail.com','Nguyễn Huyền Khánh Linh','$2a$10$vUKXQg6xV9RZwylIye9OSew7Cj/kj8yYMu2HstPLafTH.CtJOsjo6','0875694231','ROLE_STAFF',_binary '\0'),(57,'Đà nẵng','2025-05-18 16:38:39.780381','KieuMy2000h@gmail.com','Nguyễn Thanh Kiều Mỹ','$2a$10$l8E5/A3H1X6Vj86bP3q/3.BTO/ZzC3isPnz/j.2pn82aEJ2i0e34G','0875694231','ROLE_USER',_binary '\0'),(60,'Đà nẵng','2025-05-18 16:39:08.895383','KieuMy2008@gmail.com','Nguyễn Thanh Kiều Mỹ','$2a$10$PcdQwIXN3ZtMjYoljbuNVOxTVRw7pcqOPfOP1yI4p06WAhpO2WoRy','0875694231','ROLE_STAFF',_binary '\0'),(64,'Sơn trà','2025-05-24 13:51:17.160524','hophuctam58763@gmail.com','Hồ Phúc Tâm','$2a$10$GnRDiNcNSIoYMTLMkh.x6uJgXO3qGjfvHI6bkXqYK.q.97guU2Q8C','0984427846','ROLE_USER',_binary '\0'),(65,'Đà nẵng','2025-05-24 19:41:12.813212','KieuMy1999@gmail.com','Nguyễn Thanh Kiều Mỹ','$2a$10$25qt/MR5XO9vybDNHpEB9eC22hvwTM2l5OVee/qbAUezBBjpnULAq','0875694231','ROLE_USER',_binary '\0'),(66,'Đà nẵng','2025-05-24 22:22:09.855936','kimmy2003@gmail.com','Nguyễn Thanh Kiều Mỹ','$2a$10$cvWFjsxG1tNWpE0T3XV3V.p6KIXNqvB8/T0aOQaBzRrbcJxHIuNxu','0875694231','ROLE_USER',_binary '\0'),(67,'Đà nẵng','2025-05-24 22:32:45.169129','kimmy58585@gmail.com','Nguyễn Thanh Kiều Mỹ','$2a$10$487glKdwb2G5kkwCbwMfSOnUiOxMAVUDbeX0ut02wr09yK8d0iVs2','0125879643','ROLE_USER',_binary '\0'),(68,'Đà nẵng','2025-05-25 00:37:06.980883','adminC03@gmail.com','anymousMedical','$2a$10$3kjkn2nJWEw3eD0YLJWVi.fTG5wm3Qn93E.RjoPHLp9gJneR79Byi','0123456789','ROLE_ADMIN',_binary '\0'),(69,'Đà nẵng','2025-05-25 01:23:45.719076','congthanh03@gmail.com','nguyen thi cong thanh','$2a$10$m7REZb3bn5phsKdh4hMGrOuNYxRXv/HNCiWS61dcK5dCea.qC/NH.','0123456789','ROLE_USER',_binary '\0'),(70,'Đà nẵng','2025-05-25 01:24:27.170088','huuhung04@gmail.com','nguyen huu hung','$2a$10$WghsHt/X/m2wfo2vocs51.sCkJtQ2HoxW3k3VbQqv3MCpUwJ6llWK','0236541789','ROLE_USER',_binary '\0'),(71,'Liên Chiểu','2025-05-25 02:18:04.798425','kieutrang03@gmail.com','Nguyễn thị Kiều trang','$2a$10$oDTj3oldy6O86AWjgZXJl.JqE16yQEnfKVGlhgDouQXagKSlxvn7q','0236541789','ROLE_USER',_binary '\0'),(76,'Liên Chiểu','2025-05-25 02:37:05.463767','kieutrang04@gmail.com','Nguyễn thị Kiều trang','$2a$10$SN7YLTCzceJq1Wcv2rb15e7E2Yh/11rYtXb4vJZWBiTiTxmdIJc2W','0236541789','ROLE_STAFF',_binary '\0'),(78,'hai chau','2025-05-26 00:52:56.591067','hung123@gmail.com','Hung Nguyen','$2a$10$4JWe1KqTYU0Q4RFt8Kdhrezniv40YWOiTvWZR2XFGuv5ztf9OmL2a','0984427840','ROLE_USER',_binary '\0'),(79,'hai chau','2025-05-26 01:22:48.461347','tantai12123@gmail.com','Tai Nguyen','$2a$10$SSNkX3MyT3JZcAQhacp5beIYHV6.Qo2NuW6q6kcA4pH7PaNFBAsSW','0123456789','ROLE_USER',_binary '\0');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
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
