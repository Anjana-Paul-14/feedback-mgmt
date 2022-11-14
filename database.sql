-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2021 at 08:55 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `feedback`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminpage`
--

CREATE TABLE `adminpage` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminpage`
--

INSERT INTO `adminpage` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `form_ad`
--

CREATE TABLE `form_ad` (
  `stname` varchar(50) NOT NULL,
  `dpt` varchar(50) NOT NULL,
  `cour` varchar(50) NOT NULL,
  `seme` varchar(20) NOT NULL,
  `a1` int(10) NOT NULL,
  `a2` int(10) NOT NULL,
  `a3` int(10) NOT NULL,
  `a4` int(10) NOT NULL,
  `a5` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form_ad`
--

INSERT INTO `form_ad` (`stname`, `dpt`, `cour`, `seme`, `a1`, `a2`, `a3`, `a4`, `a5`) VALUES
('anjana', 'bvoc', 'BVoc.Software Development', '4', 1, 2, 3, 3, 2),
('amru', 'bvoc', 'BVoc.Software Development', '4', 1, 2, 5, 4, 3),
('abhirami', 'bvoc', 'BVoc.Banking and Finance', '1', 3, 3, 3, 3, 3),
('athira', 'bvoc', 'BVoc.Accounting and Taxation', '2', 5, 5, 5, 5, 5),
('silpa', 'bvoc', 'BVoc.Accounting and Taxation', '3', 4, 4, 4, 4, 4),
('arya', 'bvoc', 'BVoc.Banking and Finance', '2', 5, 4, 5, 4, 5),
('dhishna', 'maths', 'BSc.Maths', '4', 4, 4, 4, 4, 4),
('amritha', 'bvoc', 'BVoc.Software Development', '4', 3, 3, 3, 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `form_col`
--

CREATE TABLE `form_col` (
  `cname` varchar(50) NOT NULL,
  `cdep` varchar(50) NOT NULL,
  `ccor` varchar(50) NOT NULL,
  `csem` int(10) NOT NULL,
  `c1` int(10) NOT NULL,
  `c2` int(10) NOT NULL,
  `c3` int(10) NOT NULL,
  `c4` int(10) NOT NULL,
  `c5` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form_col`
--

INSERT INTO `form_col` (`cname`, `cdep`, `ccor`, `csem`, `c1`, `c2`, `c3`, `c4`, `c5`) VALUES
('anjana', 'Vocational Studies', 'BVoc.Software Development', 4, 5, 4, 3, 2, 1),
('amru', 'Vocational Studies', 'BVoc.Software Development', 3, 1, 2, 3, 4, 5),
('anjana', 'Vocational Studies', 'BVoc.Software Development', 3, 5, 5, 4, 5, 5),
('anjana', 'Vocational Studies', 'BVoc.Software Development', 3, 5, 5, 4, 5, 5),
('arya', 'Vocational Studies', 'BVoc.Banking and Finance', 2, 5, 5, 5, 5, 5);

-- --------------------------------------------------------

--
-- Table structure for table `form_staff`
--

CREATE TABLE `form_staff` (
  `tname` varchar(50) NOT NULL,
  `sname` varchar(50) NOT NULL,
  `dep` varchar(50) NOT NULL,
  `cor` varchar(50) NOT NULL,
  `sem` int(10) NOT NULL,
  `Q1` int(10) NOT NULL,
  `Q2` int(10) NOT NULL,
  `Q3` int(10) NOT NULL,
  `Q4` int(10) NOT NULL,
  `Q5` int(10) NOT NULL,
  `Q6` int(10) NOT NULL,
  `Q7` int(10) NOT NULL,
  `Q8` int(10) NOT NULL,
  `Q9` int(10) NOT NULL,
  `Q10` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form_staff`
--

INSERT INTO `form_staff` (`tname`, `sname`, `dep`, `cor`, `sem`, `Q1`, `Q2`, `Q3`, `Q4`, `Q5`, `Q6`, `Q7`, `Q8`, `Q9`, `Q10`) VALUES
('sreelakshmi', 'anjana', 'Vocational Studies', 'BVoc.Software Development', 4, 2, 3, 2, 3, 2, 3, 4, 3, 3, 1),
('sinisha', 'anjana', 'Vocational Studies', 'BVoc.Software Development', 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
('sreelakshmi', 'amritha', 'Vocational Studies', 'BVoc.Software Development', 4, 5, 4, 4, 3, 4, 3, 4, 3, 4, 3),
('sreelakshmi', 'amritha', 'Vocational Studies', 'BVoc.Software Development', 4, 5, 4, 4, 3, 4, 3, 4, 3, 4, 3),
('sinisha', 'amritha', 'Vocational Studies', 'BVoc.Software Development', 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4);

-- --------------------------------------------------------

--
-- Table structure for table `for_lib`
--

CREATE TABLE `for_lib` (
  `sttname` varchar(50) NOT NULL,
  `dept` varchar(50) NOT NULL,
  `course` varchar(50) NOT NULL,
  `semester` int(10) NOT NULL,
  `fl1` int(10) NOT NULL,
  `fl2` int(10) NOT NULL,
  `fl3` int(10) NOT NULL,
  `fl4` int(10) NOT NULL,
  `fl5` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `for_lib`
--

INSERT INTO `for_lib` (`sttname`, `dept`, `course`, `semester`, `fl1`, `fl2`, `fl3`, `fl4`, `fl5`) VALUES
('anjana', 'Vocational Studies', 'BVoc.Software Development', 3, 5, 4, 5, 4, 5),
('ann', 'Vocational Studies', 'BVoc.Software Development', 4, 3, 3, 3, 3, 3),
('amritha', 'Vocational Studies', 'BVoc.Software Development', 4, 4, 4, 4, 4, 4),
('amritha', 'Vocational Studies', 'BVoc.Software Development', 4, 3, 3, 3, 3, 3),
('anjana', 'Vocational Studies', 'BVoc.Software Development', 4, 3, 3, 3, 3, 3),
('anjana', 'Vocational Studies', 'BVoc.Software Development', 6, 3, 3, 3, 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `staff_reg`
--

CREATE TABLE `staff_reg` (
  `staff_id` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `dept` varchar(50) NOT NULL,
  `course` varchar(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `qualification` varchar(100) NOT NULL,
  `phone_number` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff_reg`
--

INSERT INTO `staff_reg` (`staff_id`, `name`, `address`, `dept`, `course`, `gender`, `qualification`, `phone_number`, `email`, `username`, `password`) VALUES
(1, 'sreelakshmi', 'xyz', 'Vocational Studies', 'BVoc.Software Development', 'female', 'mca', '1234567890', 'asd@gmail.com', 'sree', 'sree123'),
(2, 'sinisha', 'thekoot', 'Vocational Studies', 'BVoc.Software Development', 'female', 'mtech', '0987654321', 'sinisha@gmail.com', 'sinisha', 'sin123'),
(3, 'bency', 'thailapily', 'English', 'BA.English', 'female', 'ma', '2316748910', 'bency@gmail.com', 'bency', 'bency123'),
(4, 'keerti', 'vadakot', 'English', 'BA.English', 'female', 'mphil', '8796564534', 'keerti@gmail.com', 'keerti', 'kee123'),
(5, 'anusha', 'kizhak', 'Zoology', 'BSc.Zoology', 'female', 'phd', '5643219870', 'anu@gmail.com', 'anu', 'anu123'),
(6, 'sindhu', 'koolam', 'Zoology', 'BSc.Zoology', 'female', 'phd', '8668523296', 'sindhu@gmail.com', 'sindhu', 'sin321'),
(7, 'sunitha', 'wer', 'botany', 'botany', 'female', 'phd', '1122334455', 'sun@gmail.com', 'sunitha', 's1234'),
(8, 'bindhu', 'ghjk', 'botany', 'botany', 'female', 'phd', '9496124867', 'bindhu@gmail.com', 'bindhu', 'bin123'),
(9, 'Deepak', 'erty', 'Vocational Studies', 'BVoc.Multimedia', 'male', 'mfa', '9496138015', 'deepak123@gmail.com', 'deepak', 'dee000'),
(10, 'kajal', 'asdfghj', 'Vocational Studies', 'BVoc.Multimedia', 'female', ' ma.multimedia', '9633395295', 'kajalpr1@gmail.com', 'kajal', 'kaj999'),
(11, 'gopika', 'ertyu', 'Vocational Studies', 'BVoc.Fashion Technology', 'female', 'Msc fashion designing', '7736076664', 'gopikagirish7@gmail.com', 'gopika', 'gopi12'),
(12, 'rincy', 'sdfgh', 'Vocational Studies', 'BVoc.Fashion Technology', 'female', 'Msc. apparel technology and development', '9900391057', 'rincy.jdfashion@gmail.com', 'rincy', 'rin135'),
(13, 'beena', 'cft', 'Vocational Studies', 'BVoc.Accounting and Taxation', 'female', 'Mcom', '9745904353', 'beenaantu81@gmail.com', 'beena', 'bee123'),
(14, 'stefy', 'asdfg', 'Vocational Studies', 'BVoc.Accounting and Taxation', 'female', 'mcom', '9497570689', 'stefy29@gmail.com', 'stefy', 'stefy123'),
(15, 'justin thomas', 'kapithanparambil', 'Maths', 'BSc.Maths', 'male', 'msc', '9847632110', 'justin@gmail.com', 'justin', 'jus123'),
(16, 'sura', 'vellithinkal', 'Maths', 'BSc.Maths', 'male', 'phd', '9860006823', 'sura@gmail.com', 'sura', 'sura123'),
(17, 'maneesha', 'qwert', 'Vocational Studies', 'BVoc.Banking and Finance', 'female', 'mcom', '8497570684', 'maneesha1@gmail.com', 'maneesha', 'maneesha123'),
(18, 'minu maria', 'qwertqwe', 'Vocational Studies', 'BVoc.Banking and Finance', 'female', 'mcom', '8959672356', 'minumaria@gmail.com', 'minumaria', 'minu123'),
(19, 'aiswarya', 'xcvnnbv', 'Vocational Studies', 'BVoc.Agriculture', 'female', 'Msc Agriculture', '5678943211', 'aiswarya@gmail.com', 'aiswarya', 'ais123'),
(20, 'asangeetha', 'sdftrew', 'Vocational Studies', 'BVoc.Agriculture', 'female', 'Msc Agriculture', '8567985423', 'sangeetha@gmail.com', 'sangeetha', 'sangeetha123'),
(21, 'nithya', 'xdrtyu', 'Physics', 'BSc.Applied Physics', 'female', 'Msc ', '9562452528', 'nithyyya@gmail.com', 'nithya', 'nithya123'),
(22, 'maria', 'zawert', 'Physics', 'BSc.Applied Physics', 'female', 'Msc ,M.Ed', '9562452528', 'maarus@gmail.com', 'maria', 'maria123'),
(23, 'princy', 'sdftrew', 'Chemistry', 'BSc.Chemistry', 'female', 'Ph.d', '8086412364', 'princykg@gmail.com', 'princy', 'princy123'),
(24, 'vidhya', 'qsdvcxz', 'Chemistry', 'BSc.Chemistry', 'female', 'Ph.d', '8547558972', 'vidhyakf@gmail.com', 'vidhya', 'vidhya123'),
(25, 'Dr.SR.Lizy', 'alappat', 'Sociology', 'BA.Sociology', 'female', 'Ph.D', '9497630247', 'catherinecmc@gmail.com', 'lizy', 'lizy123'),
(26, 'jisha', 'palakal', 'Sociology', 'BA.Sociology', 'female', 'MA,B.ED', '949583420', 'jisha@gmail.com', 'jisha', 'jisha123'),
(27, 'vinitha', 'pouy', 'HIstory', 'BA.History', 'female', 'Ph.D', '9866799911', 'vinitha@gmail.com', 'vinitha', 'vinitha123'),
(28, 'swathy', 'thadayil', 'HIstory', 'BA.History', 'female', 'MA,B.Ed', '9866799911', 'swathy213@gmail.com', 'swathy', 'swathy123'),
(29, 'mary', 'kjhg', 'Political Science', 'BA.Political Science', 'female', 'MA,', '9995083995', 'maryphilip@gmail.com', 'mary', 'mary123'),
(30, 'navya', 'vgytfd', 'Political Science', 'BA.Political Science', 'female', 'MA, B.Ed', '9499804642', 'navyagh@gmail.com', 'navya', 'navya123'),
(31, 'reshma', 'njhgfd', 'Buisness Administration', 'BBA', 'female', 'Mcom', '9539840616', 'reshmaraju@gmail.com', 'reshma', 'reshma123'),
(32, 'nayana', 'bhgftyuuv', 'Buisness Administration', 'BBA', 'female', 'MBA', '8281579798', 'nayanap@gmail.com', 'nayana', 'nayana123'),
(33, 'greeshma', 'bgfhkljh', 'Computer Application', 'BCA', 'female', 'MCA', '9846294964', 'greeshmakv@gmail.com', 'greeshma', 'greeshma123'),
(34, 'aswathy', 'sdfress', 'Computer Application', 'BCA', 'female', 'mca', '8943145595', 'aswathypm@gmail.com', 'aswathy', 'aswathy123'),
(35, 'revathy', 'sdfressresd', 'Commerce', 'BCOM.Finance', 'female', 'mcom', '974565938', 'revathy11@gmail.com', 'revathy', 'revathy123'),
(36, 'soorya', 'wefdsrt', 'Commerce', 'BCOM.Finance', 'female', 'mcom,mba', '5612348975', '123soorya@gmail.com', 'soorya', 'soorya123'),
(37, 'anitha', 'bghtfd', 'Commerce', 'BCOM.Computer Application', 'female', 'mcom,mba', '9632587412', 'anith10@gmail.com', 'anitha', 'anitha123'),
(38, 'jipsy', 'vhgddft', 'Commerce', 'BCOM.Computer Application', 'female', 'mcom,net', '7412589636', 'jipsy24@gmail.com', 'jipsy', 'jipsy123'),
(91, 'bindhu', 'thaniyath', 'Vocational Studies', 'BVoc.Software Development', 'female', 'sf', '8547189287', 'amruth@gmail.com', 'bindhu', 'bin123'),
(111, 'ssss', 'ddddd', 'Buisness Administration', 'BBA', 'female', 'dddd', '', 'ww@gmail.com', 'aa', 'aaa'),
(222, 'aaaaa', 'bbb', 'Botany', 'BA.History', 'female', 'ggg', '0987896754', 'aaa@gmail.com', 'aaa', 'aaa');

-- --------------------------------------------------------

--
-- Table structure for table `std_reg`
--

CREATE TABLE `std_reg` (
  `std_id` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `dept` varchar(50) NOT NULL,
  `course` varchar(50) NOT NULL,
  `sem` int(10) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `std_reg`
--

INSERT INTO `std_reg` (`std_id`, `name`, `dept`, `course`, `sem`, `username`, `password`) VALUES
(9, 'anjana', 'bvoc', 'bvoc software development', 4, 'anjana', 'anj123'),
(10, 'amrita', 'bvoc', 'bvoc software development', 4, 'amru', 'amr123'),
(11, 'ashwini', 'bvoc', 'bvoc multimedia', 4, 'ashwini', 'as123'),
(12, 'annmariya', 'bvoc', 'bvoc multimedia', 4, 'ann', 'an123'),
(13, 'afeefa', 'zoology', 'bsc zoology', 4, 'afee', 'af123'),
(14, 'anncrizz', 'zoology', 'bsc zoology', 4, 'ann', 'ac123'),
(15, 'dhishna', 'maths', 'bsc maths', 4, 'dhishna', 'dh123'),
(16, 'silpa', 'maths', 'bsc maths', 4, 'santha', 'sha123'),
(17, 'sneha', 'english', 'ba english', 4, 'sneha', 'sn123'),
(18, 'baby', 'english', 'ba english', 4, 'baby', 'ba123'),
(19, 'abhirami', 'botany', 'bsc botany', 3, 'abhirami', 'abhi123'),
(20, 'adheena', 'botany', 'bsc botany', 4, 'adheena', 'ad123'),
(21, 'anagha', 'bvoc', 'bvoc fashion technology', 1, 'anagha', 'anagha1'),
(22, 'annmaria', 'bvoc', 'bvoc fashion technology', 2, 'annmaria', 'ann123'),
(23, 'athira', 'bvoc', 'bvoc accounting&taxation', 2, 'athira', 'athi123'),
(24, 'silpa', 'bvoc', 'bvoc accounting&taxation', 3, 'silpa', 'silpa12'),
(25, 'abhirami', 'bvoc', 'bvoc banking&finance', 1, 'abhirami', 'abhi123'),
(26, 'arya', 'bvoc', 'bvoc banking&finance', 2, 'arya', 'arya123'),
(27, '', 'bvoc', 'bvoc accounting&taxation', 3, 'q', 'q'),
(28, '', 'bvoc', 'bvoc software development', 1, 'a', 'a'),
(29, 'w', 'sociology', 'ba sociology', 3, 'w', 'w'),
(30, 'sneha johnson', 'bba', 'bba', 2, 'sneha', 'sneha123'),
(31, 'amritha', 'bba', 'bba', 4, 'amritha', 'amritha'),
(32, 'aiswarya', 'bca', 'bca', 2, 'aiswarya', 'aiswarya'),
(33, 'arsha', 'bca', 'bca', 2, 'arsha', 'arsha'),
(34, 'Ashwini', 'bca', 'bca', 4, 'ashwini', 'ash123'),
(35, 'Ashwini', 'bca', 'bca', 4, 'ashwini', 'ash123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `staff_reg`
--
ALTER TABLE `staff_reg`
  ADD PRIMARY KEY (`staff_id`);

--
-- Indexes for table `std_reg`
--
ALTER TABLE `std_reg`
  ADD PRIMARY KEY (`std_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `std_reg`
--
ALTER TABLE `std_reg`
  MODIFY `std_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
