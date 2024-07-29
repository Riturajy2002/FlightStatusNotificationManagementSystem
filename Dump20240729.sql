-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: flightdb
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `flight_details`
--

DROP TABLE IF EXISTS `flight_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight_details` (
  `flight_number` varchar(255) NOT NULL,
  `capacity` int DEFAULT NULL,
  `class_name` varchar(255) DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `flight_name` varchar(255) DEFAULT NULL,
  `price` int DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`flight_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_details`
--

LOCK TABLES `flight_details` WRITE;
/*!40000 ALTER TABLE `flight_details` DISABLE KEYS */;
INSERT INTO `flight_details` VALUES ('F_001',180,'Economy','Mumbai','Air India 101',5000,'New Delhi'),('F_002',200,'Business','Kolkata','Air India 102',12000,'Bangalore'),('F_003',220,'Economy','Hyderabad','Air India 103',4500,'Chennai'),('F_004',150,'Economy','Jaipur','Air India 104',6000,'Pune'),('F_005',180,'Business','Goa','Air India 105',15000,'Ahmedabad');
/*!40000 ALTER TABLE `flight_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_status`
--

DROP TABLE IF EXISTS `flight_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight_status` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `arrival_time` datetime(6) DEFAULT NULL,
  `departure_time` datetime(6) DEFAULT NULL,
  `gate` int DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `flight_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9gtrakro8hgn41obabyep4ref` (`flight_number`),
  CONSTRAINT `FK9gtrakro8hgn41obabyep4ref` FOREIGN KEY (`flight_number`) REFERENCES `flight_details` (`flight_number`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_status`
--

LOCK TABLES `flight_status` WRITE;
/*!40000 ALTER TABLE `flight_status` DISABLE KEYS */;
INSERT INTO `flight_status` VALUES (1,'2024-07-28 10:00:00.000000','2024-07-28 08:00:00.000000',5,'On Time','F_001'),(2,'2024-07-28 12:30:00.000000','2024-07-28 09:30:00.000000',10,'Delayed','F_002'),(3,'2024-07-28 13:00:00.000000','2024-07-28 11:00:00.000000',2,'On Time','F_003'),(4,'2024-07-28 16:00:00.000000','2024-07-28 14:00:00.000000',4,'Cancelled','F_004'),(5,'2024-07-28 18:30:00.000000','2024-07-28 16:30:00.000000',7,'On Time','F_005');
/*!40000 ALTER TABLE `flight_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notification_details`
--

DROP TABLE IF EXISTS `notification_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notification_details` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `message` varchar(1000) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `flight_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK64dh9uh8el285d5aix3eo0cu3` (`flight_number`),
  CONSTRAINT `FK64dh9uh8el285d5aix3eo0cu3` FOREIGN KEY (`flight_number`) REFERENCES `flight_details` (`flight_number`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notification_details`
--

LOCK TABLES `notification_details` WRITE;
/*!40000 ALTER TABLE `notification_details` DISABLE KEYS */;
INSERT INTO `notification_details` VALUES (1,'Flight Number: F_004, Flight Name: Air India 104, Source: Pune, Destination: Jaipur, Capacity: 150, Class Name: Economy, Price: 6000, Arrival Time: 2024-07-28T10:30:00.000+00:00, Departure Time: 2024-07-28T08:30:00.000+00:00, Gate: 4, Status: Cancelled','SMS','F_004'),(2,'Flight Number: F_004, Flight Name: Air India 104, Source: Pune, Destination: Jaipur, Capacity: 150, Class Name: Economy, Price: 6000, Arrival Time: 2024-07-28T10:30:00.000+00:00, Departure Time: 2024-07-28T08:30:00.000+00:00, Gate: 4, Status: Cancelled','SMS','F_004'),(3,'Flight Number: F_002, Flight Name: Air India 102, Source: Bangalore, Destination: Kolkata, Capacity: 200, Class Name: Business, Price: 12000, Arrival Time: 2024-07-28T07:00:00.000+00:00, Departure Time: 2024-07-28T04:00:00.000+00:00, Gate: 10, Status: Delayed','SMS','F_002'),(4,'Flight Number: F_005, Flight Name: Air India 105, Source: Ahmedabad, Destination: Goa, Capacity: 180, Class Name: Business, Price: 15000, Arrival Time: 2024-07-28T13:00:00.000+00:00, Departure Time: 2024-07-28T11:00:00.000+00:00, Gate: 7, Status: On Time','SMS','F_005');
/*!40000 ALTER TABLE `notification_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-29  1:35:33
