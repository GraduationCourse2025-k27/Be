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
-- Table structure for table `new`
--

DROP TABLE IF EXISTS `new`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `new` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `content` text,
  `publisher_at` datetime(6) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `id_customersupport` bigint DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsdbhdak5l3qmbe5k2p3qfgsm3` (`id_customersupport`),
  CONSTRAINT `FKsdbhdak5l3qmbe5k2p3qfgsm3` FOREIGN KEY (`id_customersupport`) REFERENCES `customer_support` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `new`
--

LOCK TABLES `new` WRITE;
/*!40000 ALTER TABLE `new` DISABLE KEYS */;
INSERT INTO `new` VALUES (7,'SKĐS - Sở Y tế Hà Nội công bố danh sách 65 cơ sở khám, chữa bệnh liên thông thành công dữ liệu giấy khám sức khỏe lái xe lên Cổng Thông tin giám định BHYT để thực hiện dịch vụ công trực tuyến.','2025-05-18 19:31:58.794638','Tăng sức đề kháng, bảo vệ túi tiền và sức khỏe trước quảng cáo từ người nổi tiếng',3,'https://suckhoedoisong.qltns.mediacdn.vn/zoom/260_156/324455921873985536/2025/4/18/kham-suc-khoe-lai-xe-1744950288614973871854-7-0-507-800-crop-17449502967261283918675.jpg'),(8,'SKĐS - Đó là nhận định của Giám đốc Bệnh viện Đa khoa (BVĐK) Ninh Thuận Lê Huy Thạch tại hội thảo khoa học Cập nhật các phương pháp điều trị thay thế thận ở bệnh nhân bệnh thận mạn giai đoạn cuối vừa được bệnh viện tổ chức.','2025-05-18 18:23:14.359322','Vụ nghi ngộ độc thực phẩm tại Trường tiểu học Võ Thị Sáu TP.HCM',5,'https://suckhoedoisong.qltns.mediacdn.vn/324455921873985536/2024/11/5/tiem-chung-17307937543341046014806.jpg'),(9,'SKĐS - Đó là nhận định của Giám đốc Bệnh viện Đa khoa (BVĐK) Ninh Thuận Lê Huy Thạch tại hội thảo khoa học Cập nhật các phương pháp điều trị thay thế thận ở bệnh nhân bệnh thận mạn giai đoạn cuối vừa được bệnh viện tổ chức.','2025-05-18 18:23:23.188486','Vụ nghi ngộ độc thực phẩm tại Trường tiểu học Võ Thị Sáu TP.HCM',3,'https://suckhoedoisong.qltns.mediacdn.vn/324455921873985536/2024/11/5/tiem-chung-17307937543341046014806.jpg'),(10,'SKĐS - Đó là nhận định của Giám đốc Bệnh viện Đa khoa (BVĐK) Ninh Thuận Lê Huy Thạch tại hội thảo khoa học Cập nhật các phương pháp điều trị thay thế thận ở bệnh nhân bệnh thận mạn giai đoạn cuối vừa được bệnh viện tổ chức.','2025-05-18 18:23:26.743461','Vụ nghi ngộ độc thực phẩm tại Trường tiểu học Võ Thị Sáu TP.HCM',3,'https://suckhoedoisong.qltns.mediacdn.vn/324455921873985536/2024/11/5/tiem-chung-17307937543341046014806.jpg'),(11,'SKĐS - Đó là nhận định của Giám đốc Bệnh viện Đa khoa (BVĐK) Ninh Thuận Lê Huy Thạch tại hội thảo khoa học Cập nhật các phương pháp điều trị thay thế thận ở bệnh nhân bệnh thận mạn giai đoạn cuối vừa được bệnh viện tổ chức.','2025-05-22 17:50:36.693334','Vụ nghi ngộ độc thực phẩm tại Trường tiểu học Võ Thị Sáu TP.HCM',3,'https://suckhoedoisong.qltns.mediacdn.vn/324455921873985536/2024/11/5/tiem-chung-17307937543341046014806.jpg'),(12,'SKĐS - Đó là nhận định của Giám đốc Bệnh viện Đa khoa (BVĐK) Ninh Thuận Lê Huy Thạch tại hội thảo khoa học Cập nhật các phương pháp điều trị thay thế thận ở bệnh nhân bệnh thận mạn giai đoạn cuối vừa được bệnh viện tổ chức.','2025-05-18 19:29:46.984197','Vụ nghi ngộ độc thực phẩm tại Trường tiểu học Võ Thị Sáu TP.HCM',3,'https://suckhoedoisong.qltns.mediacdn.vn/324455921873985536/2024/11/5/tiem-chung-17307937543341046014806.jpg'),(13,'SKĐS - Đó là nhận định của Giám đốc Bệnh viện Đa khoa (BVĐK) Ninh Thuận Lê Huy Thạch tại hội thảo khoa học Cập nhật các phương pháp điều trị thay thế thận ở bệnh nhân bệnh thận mạn giai đoạn cuối vừa được bệnh viện tổ chức.','2025-05-22 21:25:39.739747','Vụ nghi ngộ độc thực phẩm tại Trường tiểu học Võ Thị Sáu TP.HCM',3,'https://suckhoedoisong.qltns.mediacdn.vn/324455921873985536/2024/11/5/tiem-chung-17307937543341046014806.jpg');
/*!40000 ALTER TABLE `new` ENABLE KEYS */;
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
