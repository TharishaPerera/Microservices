-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: supplier
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier` (
  `supplier_id` int NOT NULL AUTO_INCREMENT,
  `supplier_name` varchar(100) NOT NULL,
  `industry` varchar(50) DEFAULT NULL,
  `supplier_email` varchar(50) DEFAULT NULL,
  `supplier_telephone` int DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `postal_code` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'Apple','Electronics, telecommunications equipment','supplierX@apple.org',767763808,'Priory Rowans','California','United States','ZQG56T'),(2,'Toyota Group','Engineering, various','supplierY@toyota.jn',147931683,'Countess Lilias Road','Tokyo','Japan','VOHAO6'),(3,'Volkswagen Group','Automotive','supplierG@volkswagen.gy',872454550,'Cromwell Lawns','Berlin','Germany','VBT9R3'),(4,'Samsung Electronics','Electronics, various','supplier1@samsung.sk',256837183,'Stoneleigh Close','Seoul','South Korea','749XFJ'),(5,'Foxconn','Electronics','supplier2@foxconn.tw',128661158,'Johnson Limes','Chiayi County','Taiwan','Z7Y0SA'),(6,'Daimler','Automotive','supplier3@daimler.gy',488532618,'Heron Causeway','Munich','Germany','LRKET8'),(7,'Cardinal Health','Pharmaceuticals','supplierH@ch.us',705090523,'Broadlands Bottom','San Fransisco','United States','LH6KWP'),(8,'China Railway and Engineering Group','Engineering','chinCY@china_rails.com',535722121,'Montgomery Corner','Beijing','China','ICWSZZ'),(9,'Huawei','Telecommunications equipment, Electronics','hoihu@huwaei.com',120074890,'Longlands Promenade','Shanghai','China','4V6EM3'),(10,'Ford','Automotive','supplierspeed@ford.org',348741408,'Aintree Crest','Los Angeles','United States','L1T3TI'),(11,'Honda','Automotive','hon@honda.jn',831477565,'Coppice Leaze','Osaka','Japan','T3XUN1'),(12,'General Motors','Automotive','suppliers@gen_motors.us',955285589,'Heron Paddock','Washington D.C.','United States','X6EBV6'),(13,'Mitsubishi','Engineering, various','dealers@mitsubishi.com',533888166,'Clarke Green','Kyoto','Japan','ZGRWB8'),(14,'BMW','Automotive','fastdealers@bmw.gy',313346956,'Browns Royd','Hamburg','Germany','FQ3AB5'),(15,'SAIC Motor','Automotive','supplierA@saic.com',719376947,'Longfellow Brook','Xi An','China','CRVDG0'),(16,'China Minmetals','Metals','supplierB@cminmetals.com',842328324,'Heywood Drove','Guilin','China','BFUJBO'),(17,'FAW Group','Automotive','supplierC@faw.com',227750278,'Oakley Banks','Hong Kong','China','U1VHGA'),(18,'Hengli Group','Textiles','supplierD@hengli_group.com',925037659,'Ladywell Downs','Chengdu','China','JGXT0L'),(19,'China Baowu Steel Group','Steel','supplierE@chinaBao.com',425244169,'Wells Royd','Lhasa','China','PG0R17'),(20,'Dell','Electronics','dealers@dell.org',753165564,'Johnson South','New York','United States','4NN7YM');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-12 19:48:03
