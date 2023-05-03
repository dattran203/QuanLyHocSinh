-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: db_qlhs
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `tb_student`
--

DROP TABLE IF EXISTS `tb_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_student` (
  `ID` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `Name` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `ClassID` varchar(45) DEFAULT NULL,
  `Mark` double DEFAULT NULL,
  `Khoi` int DEFAULT NULL,
  `HanhKiem` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_student`
--

LOCK TABLES `tb_student` WRITE;
/*!40000 ALTER TABLE `tb_student` DISABLE KEYS */;
INSERT INTO `tb_student` VALUES ('HS04','Nguyễn Hoàng Minh','12A',3.4,12,'Trung Bình'),('HS06','Hoàng Thị Mai','12A',5,12,'Khá'),('HS07','Vũ Đình Ba','12A',9,12,'Tốt'),('HS09','Trần Công Minh','12A',9.2,12,'Tốt'),('HS101','Nguyễn Văn Trường','10A',7.2,10,'Khá'),('HS102','Đỗ Nhật Quang','10A',10,10,'Trung Bình'),('HS103','Nguyễn Văn Tình','10A',5,10,'Trung Bình'),('HS104','Vũ Thị Nhung','10A',10,10,'Tốt'),('HS105','Vũ Thị Hồng','10A',9.5,10,'Khá'),('HS106','Vũ Văn Thiện','10A',8,10,'Tốt'),('HS107','Mai Văn Tài','10A',10,10,'Tốt'),('HS108','Lê Anh Bốn','10A',5.1,10,'Khá'),('HS109','Mai Xuân Tuân','10A',7.3,10,'Tốt'),('HS11','Đỗ Văn Vương','12B',6,12,'Trung Bình'),('HS110','Nguyễn Bá Cấp','10A',6.9,10,'Khá'),('HS111','Trần Thị Ngọc','10B',5.4,10,'Khá'),('HS112','Trần Thị Thắm','10B',6,10,'Tốt'),('HS113','Nguyễn Ngọc Thắng','10B',7,10,'Tốt'),('HS114','Trần Văn Thanh','10B',5,10,'Khá'),('HS115','Cao Thị Ánh Tuyết','10B',3.1,10,'Tốt'),('HS116','Lê Văn Ba','10B',8.1,10,'Khá'),('HS117','Ngô Văn Vũ','10B',6.7,10,'Trung Bình'),('HS118','Đào Minh Trung','10B',6.9,10,'Trung Bình'),('HS119','Nguyễn Thị Lệ','10B',5.4,10,'Khá'),('HS12','Nguyễn Hồng Mai','10B',6,10,'Khá'),('HS120','Nguyễn Hồng Mai','10B',6,10,'Khá'),('HS13','Nguyễn Thị Hoa','12B',8.4,12,'Khá'),('HS134','Vũ Thị Hồng','10A',9.5,10,'Khá'),('HS14','Mai Văn Việt','12B',8.6,12,'Tốt'),('HS15','Mai Thị Hoa','12B',8.4,12,'Tốt'),('HS16','Nguyễn Văn Công','12B',4.9,12,'Trung Bình'),('HS166','Vũ Thị Hồng','10A',7,10,'Khá'),('HS168','Vũ Thị Hồng','10A',9,10,'Khá'),('HS17','Đinh Văn Hoàng','12B',6.1,12,'Khá'),('HS18','Đỗ Công Danh','12B',6.3,12,'Khá'),('HS187','Vũ Thị Trang','10A',9,10,'Tốt'),('HS189','Đỗ Văn Bình','12B',9.4,12,'Trung Bình'),('HS19','Mai Thị Huệ','12B',6.2,12,'Tốt'),('HS198','Lê Anh Bốn','10A',5.1,10,'Khá'),('HS20','Trần Thị Xuân','12B',5.4,12,'Trung Bình'),('HS345','Lê Minh Hoàn','11A',9,11,'Tốt'),('HS51','Lê Xuân Tuân','11A',6.4,11,'Khá'),('HS52','Lưu Thị Huệ','11A',6.4,11,'Tốt'),('HS53','Lê Minh Đức','11A',6.4,11,'Khá'),('HS54','Đỗ Thị Ánh Tuyết','11A',6.4,11,'Khá'),('HS55','Hoàng Minh Trung','11A',6.4,11,'Tốt'),('HS555','Vũ Đức Lân','12B',7,12,'Tốt'),('HS56','Hứa Văn Vũ','11A',6.4,11,'Khá'),('HS57','Ngô Thị Hoa','11A',6.4,11,'Trung Bình'),('HS58','Hòng Văn Bình','11A',6.4,11,'Khá'),('HS59','Lưu Thị Mai','11A',6.4,11,'Trung Bình'),('HS60','Lê Văn Vương','11A',6.4,11,'Khá'),('HS61','Lê Văn Thắng','11B',6.4,11,'Khá'),('HS62','Ngô Thanh Tùng','11B',6.4,11,'Trung Bình'),('HS63','Hứa Hồng Mai','11B',6.4,11,'Trung Bình'),('HS64','Trần Thị Lệ','11B',6.4,11,'Trung Bình'),('HS65','Hoàng Bình Anh','11B',6.4,11,'Khá'),('HS66','Lưu Văn Sơn','11B',6.4,11,'Khá'),('HS666','Nguyễn Tất Hùng','12B',9,12,'Tốt'),('HS67','Nguyễn Đình Ba','11B',6.4,11,'Tốt'),('HS678','Trương Thái Dương','12B',9,12,'Tốt'),('HS68','Trần Thị Ánh','11B',6.4,11,'Khá'),('HS69','Nguyễn Văn Thiện','11B',6.4,11,'Tốt'),('HS70','Nguyễn Công Danh','11B',6.4,11,'Tốt'),('HS777','Trương Thái Dương','12A',6,12,'Tốt'),('HS999','Trần Văn Đạt','10B',10,10,'Tốt'),('KH998','Trần Thị Mơ','10A',9.9,11,'Tốt');
/*!40000 ALTER TABLE `tb_student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-03 12:00:12
