-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 29, 2013 at 04:20 AM
-- Server version: 5.5.24-log
-- PHP Version: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hreserve`
--

-- --------------------------------------------------------

--
-- Table structure for table `guestlist`
--

CREATE TABLE IF NOT EXISTS `guestlist` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Gender` varchar(15) DEFAULT NULL,
  `Date` varchar(20) DEFAULT NULL,
  `Age` varchar(5) DEFAULT NULL,
  `Contacts` varchar(20) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `RoomType` varchar(30) DEFAULT NULL,
  `RoomNum` varchar(5) DEFAULT NULL,
  `CheckIn` varchar(20) DEFAULT NULL,
  `CheckOut` varchar(20) DEFAULT NULL,
  `OccupyNum` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `guestlist`
--

INSERT INTO `guestlist` (`ID`, `Name`, `Address`, `Gender`, `Date`, `Age`, `Contacts`, `Email`, `RoomType`, `RoomNum`, `CheckIn`, `CheckOut`, `OccupyNum`) VALUES
(9, 'KIM', 'TAC', 'FEMALE', '3/13/13', '18', '123456', 'KIMHOTMAIL.COM', 'DELUXE', '12', '3/13/13', '3/13/13', '2');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
