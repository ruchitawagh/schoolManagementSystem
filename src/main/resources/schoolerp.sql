/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 5.6.23-log : Database - schoolerp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`schoolerp` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `schoolerp`;

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `registration_no` int(10) NOT NULL,
  `role` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `login` */

insert  into `login`(`id`,`user_name`,`password`,`registration_no`,`role`) values (1,'pranav','pranav123',0,'student'),(5,'MyFirstName.MyLastName8','123456',8,'teacher'),(6,'Teacher\'s First Name 1.null1','123456',1,'TeachingRole1');

/*Table structure for table `section` */

DROP TABLE IF EXISTS `section`;

CREATE TABLE `section` (
  `section_id` int(11) NOT NULL,
  `section_name` varchar(15) NOT NULL,
  PRIMARY KEY (`section_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `section` */

/*Table structure for table `student_details` */

DROP TABLE IF EXISTS `student_details`;

CREATE TABLE `student_details` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `middle_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `mother_name` varchar(50) DEFAULT NULL,
  `section_id` int(10) DEFAULT NULL,
  `academic_year` int(4) DEFAULT NULL,
  `phone_number` varchar(10) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `parents_email_address` varchar(50) DEFAULT NULL,
  `religion` varchar(15) DEFAULT NULL,
  `caste` varchar(15) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `type_of_job` varchar(20) DEFAULT NULL,
  `nationality` varchar(30) DEFAULT NULL,
  `role` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `student_details` */

insert  into `student_details`(`id`,`first_name`,`middle_name`,`last_name`,`mother_name`,`section_id`,`academic_year`,`phone_number`,`age`,`date_of_birth`,`parents_email_address`,`religion`,`caste`,`address`,`city`,`state`,`gender`,`type_of_job`,`nationality`,`role`) values (8,'MyFirstName',NULL,'MyLastName','MyMotherName',NULL,NULL,'9876543210',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'teacher');

/*Table structure for table `teacher_details` */

DROP TABLE IF EXISTS `teacher_details`;

CREATE TABLE `teacher_details` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `middle_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `date_of_birth` datetime DEFAULT NULL,
  `email_id` varchar(50) DEFAULT NULL,
  `qualification` varchar(50) DEFAULT NULL,
  `previous_school` varchar(100) DEFAULT NULL,
  `marital_status` varchar(10) DEFAULT NULL,
  `religion` varchar(20) DEFAULT NULL,
  `date_of_joining` datetime DEFAULT NULL,
  `primary_address` varchar(100) DEFAULT NULL,
  `secondary_address` varchar(100) DEFAULT NULL,
  `primary_city` varchar(100) DEFAULT NULL,
  `secondary_city` varchar(30) DEFAULT NULL,
  `primary_state` varchar(30) DEFAULT NULL,
  `secondary_state` varchar(30) DEFAULT NULL,
  `type_of_job` varchar(30) DEFAULT NULL,
  `pan_no` varchar(20) DEFAULT NULL,
  `aadhar_no` varchar(30) DEFAULT NULL,
  `driving_license_no` varchar(30) DEFAULT NULL,
  `bank_acc_no` varchar(15) DEFAULT NULL,
  `bank_acc_name` varchar(50) DEFAULT NULL,
  `role` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `teacher_details` */

insert  into `teacher_details`(`id`,`first_name`,`middle_name`,`last_name`,`age`,`date_of_birth`,`email_id`,`qualification`,`previous_school`,`marital_status`,`religion`,`date_of_joining`,`primary_address`,`secondary_address`,`primary_city`,`secondary_city`,`primary_state`,`secondary_state`,`type_of_job`,`pan_no`,`aadhar_no`,`driving_license_no`,`bank_acc_no`,`bank_acc_name`,`role`) values (1,'Teacher\'s First Name 1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'TeachingRole1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
