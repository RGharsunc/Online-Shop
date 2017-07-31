/*
SQLyog Ultimate v11.5 (32 bit)
MySQL - 5.7.18-log : Database - online_shop1.2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`online_shop1.2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `online_shop1.2`;

/*Table structure for table `brand` */

DROP TABLE IF EXISTS `brand`;

CREATE TABLE `brand` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `brand` */

insert  into `brand`(`id`,`name`) values (1,'acne'),(2,'albiro'),(3,'ronhill'),(4,'oddmolly'),(5,'boudestijn'),(6,'Rosch creative culture'),(8,'ARMOS'),(9,'POLO'),(10,'REY BAN'),(11,'POLICE');

/*Table structure for table `carousel` */

DROP TABLE IF EXISTS `carousel`;

CREATE TABLE `carousel` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `position` int(10) unsigned NOT NULL,
  `image1` varchar(255) NOT NULL,
  `image2` varchar(255) NOT NULL,
  `logo_text1` varchar(255) NOT NULL,
  `logo_text2` varchar(255) NOT NULL,
  `header` varchar(255) NOT NULL,
  `description` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `carousel` */

insert  into `carousel`(`id`,`position`,`image1`,`image2`,`logo_text1`,`logo_text2`,`header`,`description`) values (4,2,'1501493329297_girl3.jpg','1501493329298_pricing.png','e','shoper','some header','Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, '),(6,3,'1501496407718_red_shirt.jpg','1501496407718_pricing.png','e','shoper','some header','Благодаря оперативно- розыскным мерам сотрудников полиции выяснилось, что в тот же день приблизительно в 18.50 на пляже завязалась драка между Ашотом Ованнисяном, его двумя сыновьями и Давидом Аракеляном /1989 г.р./ и его друзьями, в результате Ашот Ованнисян был уже мертвым доставлен в больницу.'),(7,5,'1501497230157_293141_main.jpg','1501497230157_pricing.png','e','shoper','some header','hhhhhhhhhhhhhhhhhhhh'),(8,4,'1501497306264_men-blazer2.jpg','1501497306264_pricing.png','e','shoper','some header','erbe'),(9,1,'1501497333691_polo-men-collection.jpg','1501497333691_pricing.png','e ','shoper','some header','В центр оперативного управления полиции Еревана поступил сигнал относительно драки, завязавшейся на одном из пляжей озера Севан 30 июля приблизительно в 19:00.');

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `category` */

insert  into `category`(`id`,`name`) values (3,'sportswear'),(4,'mens'),(5,'womens'),(6,'kids'),(7,'fashion'),(8,'households'),(9,'interiors'),(10,'clothing'),(11,'bags'),(12,'shoes');

/*Table structure for table `manufacturer` */

DROP TABLE IF EXISTS `manufacturer`;

CREATE TABLE `manufacturer` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manufacturer` */

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `pic` varchar(255) NOT NULL,
  `price` double unsigned NOT NULL,
  `quantity` int(10) unsigned NOT NULL,
  `condit` varchar(20) NOT NULL,
  `view` int(10) unsigned NOT NULL,
  `availability` varchar(255) NOT NULL,
  `category_id` int(10) unsigned NOT NULL,
  `brand_id` int(10) unsigned NOT NULL,
  `purpose_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  KEY `brand_id` (`brand_id`),
  KEY `purposesId` (`purpose_id`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
  CONSTRAINT `product_ibfk_2` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`id`),
  CONSTRAINT `product_ibfk_3` FOREIGN KEY (`purpose_id`) REFERENCES `purposes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`id`,`name`,`pic`,`price`,`quantity`,`condit`,`view`,`availability`,`category_id`,`brand_id`,`purpose_id`) values (9,'shirt blac edition','1501321888720_293141_main.jpg',20,2,'new',23,'in stok',3,1,1),(10,'sunglass','1501322222457_sunglass.jpg',10,10,'new',2,'in stok',3,1,2),(11,'shirt red edition','1501322722246_red_shirt.jpg',15,15,'new',12,'in stok',3,1,1),(13,'Bags Collection Black Edition','1501364038568_bags-collection.jpg',200,10,'new',1,'in stok',5,3,5),(14,'Stilish Bag Brown Edition','1501364132338_bag-women1.jpg',85,15,'sale',1,'in stok',5,4,5),(15,'Men Blazer Black ','1501364187573_men-blazer.jpg',25,32,'sale',0,'in stok',4,6,1),(16,'Men Blazer Grey','1501364279200_men-blazer2.jpg',35,0,'new',1,'order',4,6,1),(17,'Men Blazer Black Light edition','1501364354099_men-blazerblack.jpg',15,2,'new',0,'order',7,6,1),(18,'Polo Shirt from Collor Colection','1501364467600_polo-men-collection.jpg',18,35,'sale',0,'in stok',3,9,4),(19,'Rey Ban Shining Blue','1501364597041_rey-bann-blue.jpg',98,20,'new',0,'in stok',4,10,2),(20,'Sacvoyage Brown','1501364688320_sacvoyage1.jpeg',230,15,'sale',1,'in stok',4,2,5),(21,'Sacvoyage Brown Womens Trip','1501364739475_sacvoyage2.jpeg',235,15,'new',6,'in stok',5,3,5),(22,'Bag Brown Stylish Lady','1501364807673_sacvoyage3.jpeg',256,15,'new',0,'in stok',5,3,5),(23,'Unisex Shoes Areni Retro Edition','1501364871917_shoes-areniEdition.jpg',255,1,'new',1,'order',7,8,5),(24,'Mens Shoes Brown Style','1501364913860_shoes-classic.jpg',120,15,'new',0,'in stok',4,8,5),(25,'Black Shoes Finger\'s Day ','1501364994049_shoes-fingers.jpg',87,20,'new',0,'order',3,5,5),(26,'Sneakers Red Edition','1501365103961_shoes-red.jpg',56,15,'new',0,'in stok',4,4,5),(27,'Sneakers Lightning Night','1501365155300_shoes-sport-lights.jpg',64,15,'sale',0,'in stok',3,1,5),(28,'Police Black Glass','1501365255222_sunglass.jpg',15,90,'new',0,'in stok',4,11,2);

/*Table structure for table `purposes` */

DROP TABLE IF EXISTS `purposes`;

CREATE TABLE `purposes` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `purposes` */

insert  into `purposes`(`id`,`name`) values (1,'Blazers'),(2,'Sunglass'),(3,'Kids'),(4,'Polo Shirt'),(5,'other');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `role` enum('USER','ADMIN') NOT NULL DEFAULT 'USER',
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`role`,`email`,`password`) values (8,'asdrf','ADMIN','asdf@asdf.com','$2a$10$4aLtzRTOdn1jM22IQvjxwuKYOa.IBD00.kKRFTekbiWLa656bZTWe');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
