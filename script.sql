	-- phpMyAdmin SQL Dump
	-- version 4.4.10
	-- http://www.phpmyadmin.net
	--
	-- Host: localhost:3306
	-- Generation Time: Nov 20, 2015 at 10:49 AM
	-- Server version: 5.5.42
	-- PHP Version: 5.6.10

	SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
	SET time_zone = "+00:00";

	--
	-- Database: `lekol`
	--

	-- --------------------------------------------------------

	--
	-- Table structure for table `activity`
	--

	CREATE TABLE `activity` (
	  `id` int(11) NOT NULL,
	  `roomId` int(11) NOT NULL,
	  `classId` int(11) NOT NULL,
	  `name` varchar(100) NOT NULL,
	  `teacherId` int(11) NOT NULL,
	  `startDate` DATETIME NOT NULL,
	  `endDate` DATETIME NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `activity`
	--

	-- --------------------------------------------------------

	--
	-- Table structure for table `cheque`
	--

	CREATE TABLE `cheque` (
	  `id` int(11) NOT NULL,
	  `bankName` varchar(100) NOT NULL,
	  `tutorName` varchar(100) NOT NULL,
	  `number` varchar(100) NOT NULL,
	  `amount` int(11) NOT NULL,
	  `collactionDate` date NOT NULL,
	  `paymentId` int(11) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `cheque`
	--

	INSERT INTO `cheque` (`id`, `bankName`, `tutorName`, `number`, `amount`, `collactionDate`, `paymentId`) VALUES
	(1, 'Yolo', 'John Doe', '123456789', 2000, '2012-12-12', 6),
	(2, 'Swag', 'Marcel Dupont', '93821938459', 2, '1992-04-02',9),
	(3, 'Bisous', 'Pierre Affeu', '3213123', 23094, '2015-02-04',11),
	(4, 'Banque', 'Isaac Asimov', '3243488934', 3214, '2014-07-02',14),
	(5, 'Yolo', 'John Doe', '123456789', 2000, '2012-12-12', 6),
	(6, 'Swag', 'Marcel Dupont', '93821938459', 2, '1992-04-02', 9),
	(7, 'Bisous', 'Pierre Affeu', '3213123', 23094, '2015-02-04', 11),
	(8, 'Banque', 'Isaac Asimov', '3243488934', 3214, '2014-07-02', 14);

	-- --------------------------------------------------------

	--
	-- Table structure for table `child`
	--

	CREATE TABLE `child` (
	  `id` int(11) NOT NULL,
	  `lastName` varchar(100) NOT NULL,
	  `firstName` varchar(100) NOT NULL,
	  `gender` varchar(100) NOT NULL,
	  `birthDate` date NOT NULL,
	  `schoolId` int(11) NOT NULL,
	  `classId` int(11) NOT NULL,
      `familyId` int(11) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `child`
	--

	INSERT INTO `child` (`id`, `lastName`, `firstName`, `gender`, `birthDate`, `schoolId`, `classId`, `familyId`) VALUES
	(1, 'Fox', 'Renardaux', 'Garcon', '2015-11-19', 1, 1,1),
	(2, 'Bay', 'Baie', 'Fille', '2015-04-22', 4, 15,1),
	(3, 'Fox', 'Renardaux', 'Garcon', '2015-11-19', 1, 1,1),
	(4, 'Bay', 'Baie', 'Fille', '2015-04-22', 4, 15,1);

	-- --------------------------------------------------------

	--
	-- Table structure for table `class`
	--

	CREATE TABLE `class` (
	  `id` int(11) NOT NULL,
	  `name` varchar(15) NOT NULL,
	  `teacherId` int(11) NOT NULL,
	  `roomId` int(11) NOT NULL,
	  `levelId` int(11) NOT NULL,
	  `schoolId` int(11) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `class`
	--

	INSERT INTO `class` (`id`, `name`, `teacherId`, `roomId`, `levelId`, `schoolId`) VALUES
	(1,'1', 4, 3, 1, 1),
	(2,'2', 7, 1, 1, 4),
	(3,'3', 11, 11, 4, 3),
	(4,'4', 2, 2, 2, 2),
	(5,'5', 10, 5, 5, 5),
	(6,'6', 14, 15, 1, 1),
	(7,'7', 4, 6, 3, 4),
	(8,'8', 12, 10, 4, 4),
	(9,'9', 5, 5, 5, 6),
	(10,'10', 4, 3, 1, 1),
	(11,'11', 7, 1, 1, 4),
	(12,'12', 11, 11, 4, 3),
	(13,'13', 2, 2, 2, 2),
	(14,'14', 10, 5, 5, 5),
	(15,'15', 14, 15, 1, 1),
	(16,'16', 4, 6, 3, 4),
	(17,'17', 12, 10, 4, 4),
	(18,'18', 5, 5, 5, 6),
	(19,'19', 4, 3, 1, 1),
	(20,'20', 7, 1, 1, 4),
	(21,'21', 11, 11, 4, 3),
	(22,'22', 2, 2, 2, 2),
	(23,'23', 10, 5, 5, 5),
	(24,'24', 14, 15, 1, 1),
	(25,'25', 4, 6, 3, 4),
	(26,'26', 12, 10, 4, 4),
	(27,'27', 5, 5, 5, 6),
	(28,'28', 4, 3, 1, 1),
	(29,'29', 7, 1, 1, 4),
	(30,'30', 11, 11, 4, 3),
	(31,'31', 2, 2, 2, 2),
	(32,'32', 10, 5, 5, 5),
	(33,'33', 14, 15, 1, 1),
	(34,'34', 4, 6, 3, 4),
	(35,'35', 12, 10, 4, 4),
	(36,'36', 5, 5, 5, 6);

	-- --------------------------------------------------------

	--
	-- Table structure for table `cycle`
	--

	CREATE TABLE `cycle` (
	  `id` int(11) NOT NULL,
	  `name` varchar(100) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `cycle`
	--

	INSERT INTO `cycle` (`id`, `name`) VALUES
	(1, '1'),
	(2, '2'),
	(3, '3'),
	(4, '1'),
	(5, '2'),
	(6, '3'),
	(7, 'Yeah'),
	(8, 'Yeah2'),
	(9, 'Cycle 32'),
	(10, 'Cool'),
	(11, 'Yeahhhhh');

	-- --------------------------------------------------------

	--
	-- Table structure for table `family`
	--

	CREATE TABLE `family` (
	  `id` int(11) NOT NULL,
	  `inChargeLastName` varchar(100) NOT NULL,
	  `inChargeFirstName` varchar(100) NOT NULL,
	  `inChargeAddress` varchar(100) NOT NULL,
	  `inChargePhone` varchar(15) NOT NULL,
	  `parent1LastName` varchar(100) NOT NULL,
	  `parent1FirstName` varchar(100) NOT NULL,
	  `parent1Address` varchar(100) NOT NULL,
	  `parent1HomePhone` varchar(15) NOT NULL,
	  `parent1MobilePhone` varchar(15) NOT NULL,
	  `parent1SocialSecurityNumber` varchar(100) NOT NULL,
	  `parent1FamilySituation` varchar(100) NOT NULL,
	  `parent1Mail` varchar(100) NOT NULL,
	  `parent2LastName` varchar(100) NOT NULL,
	  `parent2FirstName` varchar(100) NOT NULL,
	  `parent2Address` varchar(100) NOT NULL,
	  `parent2HomePhone` varchar(15) NOT NULL,
	  `parent2MobilePhone` varchar(15) NOT NULL,
	  `parent2SocialSecurityNumber` varchar(15) NOT NULL,
	  `parent2FamilySituation` varchar(100) NOT NULL,
	  `parent2Mail` varchar(100) NOT NULL,
	  `paymentId` int(11) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `family`
	--

	INSERT INTO `family` (`id`, `inChargeLastName`, `inChargeFirstName`, `inChargeAddress`, `inChargePhone`, `parent1LastName`, `parent1FirstName`, `parent1Address`, `parent1HomePhone`, `parent1MobilePhone`, `parent1SocialSecurityNumber`, `parent1FamilySituation`, `parent1Mail`, `parent2LastName`, `parent2FirstName`, `parent2Address`, `parent2HomePhone`, `parent2MobilePhone`, `parent2SocialSecurityNumber`, `parent2FamilySituation`, `parent2Mail`, `paymentId`) VALUES
	(1, 'Fox', 'Renard', '2 rue du lapin', '0314234312', 'Fox', 'Megan', '2 rue du lapin', '0214128482', '0694321343', '21312312312312', 'Marie', 'magan.fox@animaux.com', 'Fox', 'Renard', '2 rue du lapin', '0214128482', '0694312332', '3434423243', 'Marie', 'RFox@animaux.com', 6),
	(2, 'Yolo', 'Swag', '22 rue du style', '3213', 'Lol', 'Humour', '31 rue de la blague', '12', '17', '2313', 'Celibataire', '', '', '', '', '', '', '', '', '', 7),
	(3, 'Fox', 'Renard', '2 rue du lapin', '0314234312', 'Fox', 'Megan', '2 rue du lapin', '0214128482', '0694321343', '21312312312312', 'Marie', 'magan.fox@animaux.com', 'Fox', 'Renard', '2 rue du lapin', '0214128482', '0694312332', '3434423243', 'Marie', 'RFox@animaux.com', 6),
	(4, 'Yolo', 'Swag', '22 rue du style', '3213', 'Lol', 'Humour', '31 rue de la blague', '12', '17', '2313', 'Celibataire', '', '', '', '', '', '', '', '', '', 7);

	-- --------------------------------------------------------

	--
	-- Table structure for table `level`
	--

	CREATE TABLE `level` (
	  `id` int(11) NOT NULL,
	  `name` varchar(100) NOT NULL,
	  `cycleId` int(11) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `level`
	--

	INSERT INTO `level` (`id`, `name`, `cycleId`) VALUES
	(1, 'petite section', 1),
	(2, 'moyenne section', 1),
	(3, 'grande section', 1),
	(4, 'CP', 2),
	(5, 'CE1', 2),
	(6, 'CE2', 2),
	(7, 'CM1', 3),
	(8, 'CM2', 3),
	(9, 'petite section', 1),
	(10, 'moyenne section', 1),
	(11, 'grande section', 1),
	(12, 'CP', 2),
	(13, 'CE1', 2),
	(14, 'CE2', 2),
	(15, 'CM1', 3),
	(16, 'CM2', 3);

	-- --------------------------------------------------------

	--
	-- Table structure for table `payment`
	--

	CREATE TABLE `payment` (
	  `id` int(11) NOT NULL,
	  `mode` varchar(100) NOT NULL,
	  `frequency` int(11) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `payment`
	--

	INSERT INTO `payment` (`id`, `mode`, `frequency`) VALUES
	(6, 'Cheque', 2),
	(7, 'CB', 1),
	(8, 'Espece', 10),
	(9, 'Cheque', 4),
	(10, 'CB', 2),
	(11, 'Cheque', 2),
	(12, 'CB', 1),
	(13, 'Espece', 10),
	(14, 'Cheque', 4),
	(15, 'CB', 2);

	-- --------------------------------------------------------

	--
	-- Table structure for table `role`
	--

	CREATE TABLE `role` (
	  `id` int(11) NOT NULL,
	  `name` varchar(100) NOT NULL
	) ENGINE=InnoDB DEFAULT CHARSET=latin1;


	INSERT INTO `role` (`id`, `name`) VALUES
	(1, 'Administrateur'),
	(2, 'Professeur');
	-- --------------------------------------------------------

	--
	-- Table structure for table `room`
	--

	CREATE TABLE `room` (
	  `id` int(11) NOT NULL,
	  `name` varchar(100) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `room`
	--

	INSERT INTO `room` (`id`, `name`) VALUES
	(1, 'C325'),
	(2, 'G108'),
	(3, 'Salle Bleu'),
	(4, 'Salle des poney'),
	(5, 'E321'),
	(6, '1.A.3'),
	(7, 'Salle Opette'),
	(8, 'Salle Timbanque'),
	(9, 'A203'),
	(10, 'V222'),
	(11, 'Salle commune'),
	(12, 'Salle Petriere'),
	(13, 'Salle Jaune'),
	(14, 'Salle Ameche'),
	(15, 'Salle Aux'),
	(16, 'C325'),
	(17, 'G108'),
	(18, 'Salle Bleu'),
	(19, 'Salle des poney'),
	(20, 'E321'),
	(21, '1.A.3'),
	(22, 'Salle Opette'),
	(23, 'Salle Timbanque'),
	(24, 'A203'),
	(25, 'V222'),
	(26, 'Salle commune'),
	(27, 'Salle Petriere'),
	(28, 'Salle Jaune'),
	(29, 'Salle Ameche'),
	(30, 'Salle Aux');

	-- --------------------------------------------------------

	--
	-- Table structure for table `school`
	--

	CREATE TABLE `school` (
	  `id` int(11) NOT NULL,
	  `name` varchar(100) NOT NULL,
	  `address` varchar(100) NOT NULL,
	  `phone` varchar(15) NOT NULL,
	  `fax` varchar(15) NOT NULL,
	  `directorName` varchar(100) NOT NULL,
	  `directorMail` varchar(100) NOT NULL,
	  `directPhone` varchar(15) NOT NULL,
	  `typeId` int(11) NOT NULL,
	  `surface` int(11) NOT NULL,
	  `numberRoom` int(11) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `school`
	--

	INSERT INTO `school` (`id`, `name`, `address`, `phone`, `fax`, `directorName`, `directorMail`, `directPhone`, `typeId`, `surface`, `numberRoom`) VALUES
	(1, 'Marc Dutroux', '33 impasses des fleurs', '0123234123', '0112312312', 'Bart Abac', 'b.abac@dutroux.com', '0612312313', 1, 100, 2),
	(2, 'Pedobear', '12 rue du nounours', '0321312312', '0321321312', 'Anne Acconda', 'aacconda@bear.com', '0213131334', 1, 4000, 15),
	(3, 'Jean Moulin', '8 rue de la resistance', '0912312323', '0413231253', 'Klaus Barbie', 'barbie@ken.fr', '0312421232', 2, 2000, 40),
	(4, 'Iale', '12 rue du bon chemin', '0312453254', '0241542563', 'Pierre Poljak', 'ppoljak@iale.com', '0231425364', 2, 0, 0),
	(5, 'Jean Moulin', '8 rue de la resistance', '0912312323', '0413231253', 'Klaus Barbie', 'barbie@ken.fr', '0312421232', 2, 2000, 40),
	(6, 'Iale', '12 rue du bon chemin', '0312453254', '0241542563', 'Pierre Poljak', 'ppoljak@iale.com', '0231425364', 2, 200, 3),
	(7, 'Marc Dutroux', '33 impasses des fleurs', '0123234123', '0112312312', 'Bart Abac', 'b.abac@dutroux.com', '0612312313', 1, 100, 2),
	(8, 'Pedobear', '12 rue du nounours', '0321312312', '0321321312', 'Anne Acconda', 'aacconda@bear.com', '0213131334', 1, 4000, 15),
	(9, 'Jean Moulin', '8 rue de la resistance', '0912312323', '0413231253', 'Klaus Barbie', 'barbie@ken.fr', '0312421232', 2, 2000, 40),
	(10, 'Iale', '12 rue du bon chemin', '0312453254', '0241542563', 'Pierre Poljak', 'ppoljak@iale.com', '0231425364', 2, 0, 0),
	(11, 'Jean Moulin', '8 rue de la resistance', '0912312323', '0413231253', 'Klaus Barbie', 'barbie@ken.fr', '0312421232', 2, 2000, 40),
	(12, 'Iale', '12 rue du bon chemin', '0312453254', '0241542563', 'Pierre Poljak', 'ppoljak@iale.com', '0231425364', 2, 200, 3);

	-- --------------------------------------------------------

	--
	-- Table structure for table `teacher`
	--

	CREATE TABLE `teacher` (
	  `id` int(11) NOT NULL,
	  `lastName` varchar(100) NOT NULL,
	  `firstName` varchar(100) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `teacher`
	--

	INSERT INTO `teacher` (`id`, `lastName`, `firstName`) VALUES
	(1, 'Parker', 'Peter'),
	(2, 'Wayne', 'Bruce'),
	(3, 'Kent', 'Clark'),
	(4, 'Luke', 'Lucky'),
	(5, 'Hollande', 'Francois'),
	(6, 'Sarkozy', 'Nicolas'),
	(7, 'Sagon', 'Nicolas'),
	(8, 'Lacroix', 'Benjamin'),
	(9, 'Boxbailde', 'Tibo'),
	(10, 'Masdieu', 'Melvin'),
	(11, 'de Fournas', 'Tristan'),
	(12, 'Perrin', 'Francoise'),
	(13, 'Blanc', 'Mireille'),
	(14, 'Snow', 'John'),
	(15, 'Astier', 'Alexandre'),
	(16, 'Parker', 'Peter'),
	(17, 'Wayne', 'Bruce'),
	(18, 'Kent', 'Clark'),
	(19, 'Luke', 'Lucky'),
	(20, 'Hollande', 'Francois'),
	(21, 'Sarkozy', 'Nicolas'),
	(22, 'Sagon', 'Nicolas'),
	(23, 'Lacroix', 'Benjamin'),
	(24, 'Boxbailde', 'Tibo'),
	(25, 'Masdieu', 'Melvin'),
	(26, 'de Fournas', 'Tristan'),
	(27, 'Perrin', 'Francoise'),
	(28, 'Blanc', 'Mireille'),
	(29, 'Snow', 'John'),
	(30, 'Astier', 'Alexandre'),
	(31, 'Lacroix', 'Ben'),
	(32, 'De Fournas De La Brosse', 'Tristan ')

	-- --------------------------------------------------------

	--
	-- Table structure for table `type_school`
	--

	CREATE TABLE `type_school` (
	  `id` int(11) NOT NULL,
	  `name` varchar(100) NOT NULL
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

	--
	-- Dumping data for table `type_school`
	--

	INSERT INTO `type_school` (`id`, `name`) VALUES
	(1, 'maternelle'),
	(2, 'primaire'),
	(3, 'maternelle'),
	(4, 'primaire');

	-- --------------------------------------------------------

	--
	-- Table structure for table `user`
	--

	CREATE TABLE `user` (
	  `id` int(11) NOT NULL,
	  `name` varchar(100) NOT NULL,
	  `roleId` int(11) NOT NULL,
	  `mail` varchar(100) NOT NULL,
	  `password` varchar(100) NOT NULL
	) ENGINE=InnoDB DEFAULT CHARSET=latin1;

	--
	-- Indexes for dumped tables
	--
	INSERT INTO `user` (`id`, `name`, `roleId`, `mail`, `password`) VALUES
	(1, 'admin', 1, 'admin@admin.com', 'admin'),
    (2, 'teacher', 2, 'teacher@teacher.com', 'teacher');
    
	-- Indexes for table `activity`
	--
	ALTER TABLE `activity`
	  ADD PRIMARY KEY (`id`),
	  ADD KEY `fk_activity_room` (`roomId`),
	  ADD KEY `fk_activity_class` (`classId`),
	  ADD KEY `fk_activity_teacher` (`teacherId`);

	--
	-- Indexes for table `cheque`
	--
	ALTER TABLE `cheque`
	  ADD PRIMARY KEY (`id`),
	  ADD KEY `fk_cheque_payment` (`paymentId`);

	--
	-- Indexes for table `child`
	--
	ALTER TABLE `child`
	  ADD PRIMARY KEY (`id`),
	  ADD KEY `fk_child_school` (`schoolId`),
	  ADD KEY `fk_chilld_class` (`classId`);

	--
	-- Indexes for table `class`
	--
	ALTER TABLE `class`
	  ADD PRIMARY KEY (`id`),
	  ADD KEY `fk_class_teacher` (`teacherId`),
	  ADD KEY `fk_class_room` (`roomId`),
	  ADD KEY `fk_class_level` (`levelId`),
	  ADD KEY `fk_class_school` (`schoolId`);

	--
	-- Indexes for table `cycle`
	--
	ALTER TABLE `cycle`
	  ADD PRIMARY KEY (`id`);

	--
	-- Indexes for table `family`
	--
	ALTER TABLE `family`
	  ADD PRIMARY KEY (`id`),
	  ADD KEY `fk_family_payment` (`paymentId`);

	--
	-- Indexes for table `level`
	--
	ALTER TABLE `level`
	  ADD PRIMARY KEY (`id`),
	  ADD KEY `fk_level_cycle` (`cycleId`);

	--
	-- Indexes for table `payment`
	--
	ALTER TABLE `payment`
	  ADD PRIMARY KEY (`id`);

	--
	-- Indexes for table `role`
	--
	ALTER TABLE `role`
	  ADD PRIMARY KEY (`id`);

	--
	-- Indexes for table `room`
	--
	ALTER TABLE `room`
	  ADD PRIMARY KEY (`id`);

	--
	-- Indexes for table `school`
	--
	ALTER TABLE `school`
	  ADD PRIMARY KEY (`id`),
	  ADD KEY `fk_school_type` (`typeId`);

	--
	-- Indexes for table `teacher`
	--
	ALTER TABLE `teacher`
	  ADD PRIMARY KEY (`id`);

	--
	-- Indexes for table `type_school`
	--
	ALTER TABLE `type_school`
	  ADD PRIMARY KEY (`id`);

	--
	-- Indexes for table `user`
	--
	ALTER TABLE `user`
	  ADD PRIMARY KEY (`id`),
	  ADD KEY `fk_user_role` (`roleId`);

	--
	-- AUTO_INCREMENT for dumped tables
	--

	--
	-- AUTO_INCREMENT for table `activity`
	--
	ALTER TABLE `activity`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
	--
	-- AUTO_INCREMENT for table `cheque`
	--
	ALTER TABLE `cheque`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
	--
	-- AUTO_INCREMENT for table `child`
	--
	ALTER TABLE `child`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
	--
	-- AUTO_INCREMENT for table `class`
	--
	ALTER TABLE `class`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=37;
	--
	-- AUTO_INCREMENT for table `cycle`
	--
	ALTER TABLE `cycle`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
	--
	-- AUTO_INCREMENT for table `family`
	--
	ALTER TABLE `family`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
	--
	-- AUTO_INCREMENT for table `level`
	--
	ALTER TABLE `level`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
	--
	-- AUTO_INCREMENT for table `payment`
	--
	ALTER TABLE `payment`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=16;
	--
	-- AUTO_INCREMENT for table `role`
	--
	ALTER TABLE `role`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
	--
	-- AUTO_INCREMENT for table `room`
	--
	ALTER TABLE `room`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=31;
	--
	-- AUTO_INCREMENT for table `school`
	--
	ALTER TABLE `school`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=13;
	--
	-- AUTO_INCREMENT for table `teacher`
	--
	ALTER TABLE `teacher`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=38;
	--
	-- AUTO_INCREMENT for table `type_school`
	--
	ALTER TABLE `type_school`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
	--
	-- AUTO_INCREMENT for table `user`
	--
	ALTER TABLE `user`
	  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
	--
	-- Constraints for dumped tables
	--

	--
	-- Constraints for table `activity`
	--
	ALTER TABLE `activity`
	  ADD CONSTRAINT `fk_activity_class` FOREIGN KEY (`classId`) REFERENCES `class` (`id`),
	  ADD CONSTRAINT `fk_activity_room` FOREIGN KEY (`roomId`) REFERENCES `room` (`id`),
	  ADD CONSTRAINT `fk_activity_teacher` FOREIGN KEY (`teacherId`) REFERENCES `teacher` (`id`);

	--
	-- Constraints for table `child`
	--
	ALTER TABLE `child`
	  ADD CONSTRAINT `fk_child_school` FOREIGN KEY (`schoolId`) REFERENCES `school` (`id`),
	  ADD CONSTRAINT `fk_chilld_class` FOREIGN KEY (`classId`) REFERENCES `class` (`id`),
      ADD CONSTRAINT `fk_chilld_family` FOREIGN KEY (`familyId`) REFERENCES `family` (`id`);
      

	--
	-- Constraints for table `class`
	--
	ALTER TABLE `class`
	  ADD CONSTRAINT `fk_class_level` FOREIGN KEY (`levelId`) REFERENCES `level` (`id`),
	  ADD CONSTRAINT `fk_class_room` FOREIGN KEY (`roomId`) REFERENCES `room` (`id`),
	  ADD CONSTRAINT `fk_class_school` FOREIGN KEY (`schoolId`) REFERENCES `school` (`id`),
	  ADD CONSTRAINT `fk_class_teacher` FOREIGN KEY (`teacherId`) REFERENCES `teacher` (`id`);

	--
	-- Constraints for table `family`
	--
	ALTER TABLE `family`
	  ADD CONSTRAINT `fk_family_payment` FOREIGN KEY (`paymentId`) REFERENCES `payment` (`id`);

	--
	-- Constraints for table `level`
	--
	ALTER TABLE `level`
	  ADD CONSTRAINT `fk_level_cycle` FOREIGN KEY (`cycleId`) REFERENCES `cycle` (`id`);

	--
	-- Constraints for table `cheque`
	--
	ALTER TABLE `cheque`
	  ADD CONSTRAINT `fk_cheque_payment` FOREIGN KEY (`paymentId`) REFERENCES `payment` (`id`);

	--
	-- Constraints for table `school`
	--
	ALTER TABLE `school`
	  ADD CONSTRAINT `fk_school_type` FOREIGN KEY (`typeId`) REFERENCES `type_school` (`id`);

	--
	-- Constraints for table `user`
	--
	ALTER TABLE `user`
	  ADD CONSTRAINT `fk_user_role` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`);
