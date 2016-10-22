-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 13-10-2015 a las 15:58:27
-- Versión del servidor: 5.5.8
-- Versión de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `pintureria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen`
--

CREATE TABLE IF NOT EXISTS `almacen` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ALERTA` varchar(255) DEFAULT NULL,
  `CANTIDAD` varchar(255) DEFAULT NULL,
  `LOCALIZACION` varchar(255) DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ALMACEN_PRODUCTO_ID` (`PRODUCTO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=617 ;

--
-- Volcar la base de datos para la tabla `almacen`
--

INSERT INTO `almacen` (`ID`, `ALERTA`, `CANTIDAD`, `LOCALIZACION`, `PRODUCTO_ID`) VALUES
(1, '10', '21', 'SIN ASIGNAR', 1),
(2, '10', '16', 'SIN ASIGNAR', 2),
(3, '10', '10', ' SIN ASIGNAR', 3),
(4, '10', '20', 'SIN ASIGNAR', 4),
(5, '10', '10', 'SIN ASIGNAR', 5),
(6, '10', '8', 'SIN ASIGNAR', 6),
(7, '10', '16', 'SIN ASIGNAR', 7),
(8, '10', '31', 'SIN ASIGNAR', 8),
(9, '10', '18', 'SIN ASIGNAR', 9),
(10, '10', '3', 'SIN ASIGNAR', 10),
(11, '10', '1', 'SIN ASIGNAR', 11),
(12, '10', '1', 'SIN ASIGNAR', 12),
(13, '10', '6', 'SIN ASIGNAR', 13),
(14, '10', '2', 'SIN ASIGNAR', 14),
(15, '10', '2', 'SIN ASIGNAR', 15),
(16, '10', '2', 'SIN ASIGNAR', 16),
(17, '10', '1', 'SIN ASIGNAR', 17),
(18, '10', '2', 'SIN ASIGNAR', 18),
(19, '10', '14', 'SIN ASIGNAR', 19),
(20, '10', '10', 'SIN ASIGNAR', 20),
(21, '10', '3', 'SIN ASIGNAR', 21),
(22, '10', '3', 'SIN ASIGNAR', 22),
(23, '10', '3', 'SIN ASIGNAR', 23),
(24, '10', '0', 'SIN ASIGNAR', 24),
(25, '10', '20', 'SIN ASIGNAR', 25),
(26, '10', '23', 'SIN ASIGNAR', 26),
(27, '10', '13', 'SIN ASIGNAR', 27),
(28, '10', '16', 'SIN ASIGNAR', 28),
(29, '10', '17', 'SIN ASIGNAR', 29),
(30, '10', '6', 'SIN ASIGNAR', 30),
(31, '10', '24', 'SIN ASIGNAR', 31),
(32, '10', '25', 'SIN ASIGNAR', 32),
(33, '10', '12', 'SIN ASIGNAR', 33),
(34, '10', '0', 'SIN ASIGNAR', 34),
(35, '10', '2', 'SIN ASIGNAR', 35),
(36, '10', '26', 'SIN ASIGNAR', 36),
(37, '10', '30', 'SIN ASIGNAR', 37),
(38, '10', '33', 'SIN ASIGNAR', 38),
(39, '10', '15', 'SIN ASIGNAR', 39),
(40, '10', '6', 'SIN ASIGNAR', 40),
(41, '10', '23', 'SIN ASIGNAR', 41),
(42, '10', '9', 'SIN ASIGNAR', 42),
(43, '10', '6', 'SIN ASIGNAR', 43),
(44, '10', '5', 'SIN ASIGNAR', 44),
(45, '10', '21', 'SIN ASIGNAR', 45),
(46, '10', '20', 'SIN ASIGNAR', 46),
(47, '10', '33', 'SIN ASIGNAR', 47),
(48, '10', '4', 'SIN ASIGNAR', 48),
(49, '10', '2', 'SIN ASIGNAR', 49),
(50, '10', '2', 'SIN ASIGNAR', 50),
(51, '10', '1337', 'SIN ASIGNAR', 51),
(52, '10', '4', 'SIN ASIGNAR', 52),
(53, '10', '0', 'SIN ASIGNAR', 53),
(54, '10', '1', 'SIN ASIGNAR', 54),
(55, '10', '1', 'SIN ASIGNAR', 55),
(56, '10', '0', 'SIN ASIGNAR', 56),
(57, '10', '0', 'SIN ASIGNAR', 57),
(58, '10', '1', 'SIN ASIGNAR', 58),
(59, '10', '1', 'SIN ASIGNAR', 59),
(60, '10', '4', 'SIN ASIGNAR', 60),
(61, '10', '3', 'SIN ASIGNAR', 61),
(62, '10', '3', 'SIN ASIGNAR', 62),
(63, '10', '3', 'SIN ASIGNAR', 63),
(64, '10', '1', 'SIN ASIGNAR', 64),
(65, '10', '3', 'SIN ASIGNAR', 65),
(66, '10', '3', 'SIN ASIGNAR', 66),
(67, '10', '6', 'SIN ASIGNAR', 67),
(68, '10', '2', 'SIN ASIGNAR', 68),
(69, '10', '3', 'SIN ASIGNAR', 69),
(70, '10', '5', 'SIN ASIGNAR', 70),
(71, '10', '3', 'SIN ASIGNAR', 71),
(72, '10', '1', 'SIN ASIGNAR', 72),
(73, '10', '4', 'SIN ASIGNAR', 73),
(74, '10', '4', 'SIN ASIGNAR', 74),
(75, '10', '1', 'SIN ASIGNAR', 75),
(76, '10', '2', 'SIN ASIGNAR', 76),
(77, '10', '21', 'SIN ASIGNAR', 77),
(78, '10', '18', 'SIN ASIGNAR', 78),
(79, '10', '0', 'SIN ASIGNAR', 79),
(80, '10', '18', 'SIN ASIGNAR', 80),
(81, '10', '2', 'SIN ASIGNAR', 81),
(82, '10', '4', 'SIN ASIGNAR', 82),
(83, '10', '0', 'SIN ASIGNAR', 83),
(84, '10', '0', 'SIN ASIGNAR', 84),
(85, '10', '3', 'SIN ASIGNAR', 85),
(86, '10', '2', 'SIN ASIGNAR', 86),
(87, '10', '1', 'SIN ASIGNAR', 87),
(88, '10', '3', 'SIN ASIGNAR', 88),
(89, '10', '1', 'SIN ASIGNAR', 89),
(90, '10', '1', 'SIN ASIGNAR', 90),
(91, '10', '7', 'SIN ASIGNAR', 91),
(92, '10', '58', 'SIN ASIGNAR', 92),
(93, '10', '752', 'SIN ASIGNAR', 93),
(94, '10', '271', 'SIN ASIGNAR', 94),
(95, '10', '92', 'SIN ASIGNAR', 95),
(96, '10', '284', 'SIN ASIGNAR', 96),
(97, '10', '5', 'SIN ASIGNAR', 97),
(98, '5', '40', 'SIN ASIGNAR', 98),
(99, '5', '6', 'SIN ASIGNAR', 99),
(100, '5', '6', 'SIN ASIGNAR', 100),
(101, '5', '6', 'SIN ASIGNAR', 101),
(102, '5', '6', 'SIN ASIGNAR', 102),
(103, '5', '6', 'SIN ASIGNAR', 103),
(104, '5', '6', 'SIN ASIGNAR', 104),
(105, '5', '26', 'SIN ASIGNAR', 105),
(106, '5', '2', 'SIN ASIGNAR', 106),
(107, '10', '5', 'SIN ASIGNAR', 107),
(108, '10', '9', 'SIN ASIGNAR', 108),
(109, '10', '22', 'SIN ASIGNAR', 109),
(110, '10', '2', 'SIN ASIGNAR', 110),
(111, '10', '4', 'SIN ASIGNAR', 111),
(112, '20', '7', 'SIN ASIGNAR', 112),
(113, '10', '20', 'SIN ASIGNAR', 113),
(114, '10', '33', 'SIN ASIGNAR', 114),
(115, '10', '23', 'SIN ASIGNAR', 115),
(116, '10', '4', 'SIN ASIGNAR', 116),
(117, '10', '18', 'SIN ASIGNAR', 117),
(118, '10', '32', 'SIN ASIGNAR', 118),
(119, '10', '6', 'SIN ASIGNAR', 119),
(120, '10', '6', 'SIN ASIGNAR', 120),
(121, '10', '4', 'SIN ASIGNAR', 121),
(122, '10', '70', 'SIN ASIGNAR', 122),
(123, '10', '67', 'SIN ASIGNAR', 123),
(124, '10', '65', 'SIN ASIGNAR', 124),
(125, '10', '47', 'SIN ASIGNAR', 125),
(126, '10', '67', 'SIN ASIGNAR', 126),
(127, '10', '64', 'SIN ASIGNAR', 127),
(128, '10', '66', 'SIN ASIGNAR', 128),
(129, '10', '49', 'SIN ASIGNAR', 129),
(130, '10', '0', 'SIN ASIGNAR', 130),
(131, '10', '16', 'SIN ASIGNAR', 131),
(132, '10', '0', 'SIN ASIGNAR', 132),
(133, '10', '24', 'SIN ASIGNAR', 133),
(134, '10', '30', 'SIN ASIGNAR', 134),
(135, '10', '49', 'SIN ASIGNAR', 135),
(136, '10', '2', 'SIN ASIGNAR', 136),
(137, '10', '5', 'SIN ASIGNAR', 137),
(138, '10', '46', 'SIN ASIGNAR', 138),
(139, '10', '50', 'SIN ASIGNAR', 139),
(140, '10', '44', 'SIN ASIGNAR', 140),
(141, '10', '19', 'SIN ASIGNAR', 141),
(142, '10', '61', 'SIN ASIGNAR', 142),
(143, '10', '61', 'SIN ASIGNAR', 143),
(144, '10', '63', 'SIN ASIGNAR', 144),
(145, '10', '56', 'SIN ASIGNAR', 145),
(146, '10', '59', 'SIN ASIGNAR', 146),
(147, '10', '11', 'SIN ASIGNAR', 147),
(148, '10', '7', 'SIN ASIGNAR', 148),
(149, '10', '54', 'SIN ASIGNAR', 149),
(150, '10', '8', 'SIN ASIGNAR', 150),
(151, '10', '25', 'SIN ASIGNAR', 151),
(152, '10', '2', 'SIN ASIGNAR', 152),
(153, '10', '3', 'SIN ASIGNAR', 153),
(154, '10', '10', 'SIN ASIGNAR', 154),
(155, '10', '7', 'SIN ASIGNAR', 155),
(156, '10', '98', 'SIN ASIGNAR', 156),
(157, '10', '544', 'SIN ASIGNAR', 157),
(158, '10', '10', 'SIN ASIGNAR', 158),
(159, '10', '30', 'SIN ASIGNAR', 159),
(160, '10', '17', 'SIN ASIGNAR', 160),
(161, '10', '41', 'SIN ASIGNAR', 161),
(162, '10', '44', 'SIN ASIGNAR', 162),
(163, '10', '0', 'SIN ASIGNAR', 163),
(164, '10', '0', 'SIN ASIGNAR', 164),
(165, '10', '22', 'SIN ASIGNAR', 165),
(166, '10', '1', 'SIN ASIGNAR', 166),
(167, '10', '14', 'SIN ASIGNAR', 167),
(168, '10', '90', 'SIN ASIGNAR', 168),
(169, '10', '9', 'SIN ASIGNAR', 169),
(170, '10', '40', 'SIN ASIGNAR', 170),
(171, '10', '6', 'SIN ASIGNAR', 171),
(172, '10', '4', 'SIN ASIGNAR', 172),
(173, '10', '8', 'SIN ASIGNAR', 173),
(174, '10', '8', 'SIN ASIGNAR', 174),
(175, '10', '84', 'SIN ASIGNAR', 175),
(176, '10', '21', 'SIN ASIGNAR', 176),
(177, '10', '7', 'SIN ASIGNAR', 177),
(178, '10', '7', 'SIN ASIGNAR', 178),
(179, '10', '25', 'SIN ASIGNAR', 179),
(180, '10', '56', 'SIN ASIGNAR', 180),
(181, '10', '12', 'SIN ASIGNAR', 181),
(182, '10', '5', 'SIN ASIGNAR', 182),
(183, '10', '0', 'SIN ASIGNAR', 183),
(184, '10', '8', 'SIN ASIGNAR', 184),
(185, '10', '7', 'SIN ASIGNAR', 185),
(186, '10', '0', 'SIN ASIGNAR', 186),
(187, '10', '0', 'SIN ASIGNAR', 187),
(188, '10', '4', 'SIN ASIGNAR', 188),
(189, '36', '150', 'SIN ASIGNAR', 189),
(190, '20', '4', 'SIN ASIGNAR', 190),
(191, '10', '4', 'SIN ASIGNAR', 191),
(192, '10', '6', 'SIN ASIGNAR', 192),
(193, '10', '25', 'SIN ASIGNAR', 193),
(194, '12', '47', 'SIN ASIGNAR', 194),
(195, '10', '11', 'SIN ASIGNAR', 195),
(196, '10', '53', 'SIN ASIGNAR', 196),
(197, '10', '204', 'SIN ASIGNAR', 197),
(198, '10', '6', 'SIN ASIGNAR', 198),
(199, '10', '33', 'SIN ASIGNAR', 199),
(200, '10', '7', 'SIN ASIGNAR', 200),
(201, '10', '33', 'SIN ASIGNAR', 201),
(202, '10', '21', 'SIN ASIGNAR', 202),
(203, '10', '7', 'SIN ASIGNAR', 203),
(204, '10', '4', 'SIN ASIGNAR', 204),
(205, '10', '6', 'SIN ASIGNAR', 205),
(206, '10', '29', 'SIN ASIGNAR', 206),
(207, '10', '32', 'SIN ASIGNAR', 207),
(208, '10', '17', 'SIN ASIGNAR', 208),
(209, '10', '1', 'SIN ASIGNAR', 209),
(210, '10', '4', 'SIN ASIGNAR', 210),
(211, '10', '30', 'SIN ASIGNAR', 211),
(212, '10', '211', 'SIN ASIGNAR', 212),
(213, '10', '97', 'SIN ASIGNAR', 213),
(214, '10', '2', 'SIN ASIGNAR', 214),
(215, '10', '31', 'SIN ASIGNAR', 215),
(216, '10', '110', 'SIN ASIGNAR', 216),
(217, '10', '240', 'SIN ASIGNAR', 217),
(218, '10', '148', 'SIN ASIGNAR', 218),
(219, '10', '49', 'SIN ASIGNAR', 219),
(220, '10', '40', 'SIN ASIGNAR', 220),
(221, '10', '37', 'SIN ASIGNAR', 221),
(222, '10', '28', 'SIN ASIGNAR', 222),
(223, '10', '17', 'SIN ASIGNAR', 223),
(224, '10', '112', 'SIN ASIGNAR', 224),
(225, '10', '35', 'SIN ASIGNAR', 225),
(226, '10', '12', 'SIN ASIGNAR', 226),
(227, '10', '2', 'SIN ASIGNAR', 227),
(228, '10', '33', 'SIN ASIGNAR', 228),
(229, '10', '3', 'SIN ASIGNAR', 229),
(230, '10', '15', 'SIN ASIGNAR', 230),
(231, '10', '43', 'SIN ASIGNAR', 231),
(232, '10', '7', 'SIN ASIGNAR', 232),
(233, '10', '22', 'SIN ASIGNAR', 233),
(234, '10', '2', 'SIN ASIGNAR', 234),
(235, '10', '2', 'SIN ASIGNAR', 235),
(236, '10', '114', 'SIN ASIGNAR', 236),
(237, '10', '120', 'SIN ASIGNAR', 237),
(238, '10', '87', 'SIN ASIGNAR', 238),
(239, '10', '19', 'SIN ASIGNAR', 239),
(240, '10', '20', 'SIN ASIGNAR', 240),
(241, '10', '5', 'SIN ASIGNAR', 241),
(242, '10', '1', 'SIN ASIGNAR', 242),
(243, '10', '1', 'SIN ASIGNAR', 243),
(244, '10', '2', 'SIN ASIGNAR', 244),
(245, '10', '1', 'SIN ASIGNAR', 245),
(246, '10', '1', 'SIN ASIGNAR', 246),
(247, '10', '1', 'SIN ASIGNAR', 247),
(248, '10', '1', 'SIN ASIGNAR', 248),
(249, '10', '1', 'SIN ASIGNAR', 249),
(250, '10', '1', 'SIN ASIGNAR', 250),
(251, '10', '1', 'SIN ASIGNAR', 251),
(252, '10', '1', 'SIN ASIGNAR', 252),
(253, '10', '1', 'SIN ASIGNAR', 253),
(254, '10', '1', 'SIN ASIGNAR', 254),
(255, '10', '1', 'SIN ASIGNAR', 255),
(256, '10', '1', 'SIN ASIGNAR', 256),
(257, '10', '1', 'SIN ASIGNAR', 257),
(258, '10', '1', 'SIN ASIGNAR', 258),
(259, '10', '1', 'SIN ASIGNAR', 259),
(260, '10', '1', 'SIN ASIGNAR', 260),
(261, '10', '1', 'SIN ASIGNAR', 261),
(262, '10', '7', 'SIN ASIGNAR', 262),
(263, '10', '5', 'SIN ASIGNAR', 263),
(264, '10', '14', 'SIN ASIGNAR', 264),
(265, '10', '1', 'SIN ASIGNAR', 265),
(266, '10', '2', 'SIN ASIGNAR', 266),
(267, '5', '156', 'SIN ASIGNAR', 267),
(268, '5', '47', 'SIN ASIGNAR', 268),
(269, '10', '5', 'SIN ASIGNAR', 269),
(270, '10', '0', 'SIN ASIGNAR', 270),
(271, '10', '82', 'SIN ASIGNAR', 271),
(272, '10', '0', 'SIN ASIGNAR', 272),
(273, '10', '140', 'SIN ASIGNAR', 273),
(274, '10', '55', 'SIN ASIGNAR', 274),
(275, '10', '119', 'SIN ASIGNAR', 275),
(276, '50', '180', 'SIN ASIGNAR', 276),
(277, '50', '533', 'SIN ASIGNAR', 277),
(278, '10', '15', 'SIN ASIGNAR', 278),
(279, '10', '30', 'SIN ASIGNAR', 279),
(280, '5', '24', 'SIN ASIGNAR', 280),
(281, '5', '9', 'SIN ASIGNAR', 281),
(282, '5', '22', 'SIN ASIGNAR', 282),
(283, '5', '41', 'SIN ASIGNAR', 283),
(284, '5', '2', 'SIN ASIGNAR', 284),
(285, '10', '23', 'SIN ASIGNAR', 285),
(286, '5', '22', 'SIN ASIGNAR', 286),
(287, '5', '18', 'SIN ASIGNAR', 287),
(288, '5', '5', 'SIN ASIGNAR', 288),
(289, '5', '12', 'SIN ASIGNAR', 289),
(290, '5', '1', 'SIN ASIGNAR', 290),
(291, '5', '11', 'SIN ASIGNAR', 291),
(292, '5', '13', 'SIN ASIGNAR', 292),
(293, '5', '31', 'SIN ASIGNAR', 293),
(294, '5', '9', 'SIN ASIGNAR', 294),
(295, '5', '1', 'SIN ASIGNAR', 295),
(296, '10', '4', 'SIN ASIGNAR', 296),
(297, '10', '4', 'SIN ASIGNAR', 297),
(298, '10', '10', 'SIN ASIGNAR', 298),
(299, '10', '4', 'SIN ASIGNAR', 299),
(300, '10', '1', 'SIN ASIGNAR', 300),
(301, '5', '1', 'SIN ASIGNAR', 301),
(302, '5', '12', 'SIN ASIGNAR', 302),
(303, '5', '11', 'SIN ASIGNAR', 303),
(304, '5', '11', 'SIN ASIGNAR', 304),
(305, '5', '11', 'SIN ASIGNAR', 305),
(306, '5', '12', 'SIN ASIGNAR', 306),
(307, '10', '183', 'SIN ASIGNAR', 307),
(308, '10', '95', 'SIN ASIGNAR', 308),
(309, '10', '29', 'SIN ASIGNAR', 309),
(310, '10', '30', 'SIN ASIGNAR', 310),
(311, '10', '60', 'SIN ASIGNAR', 311),
(312, '10', '52', 'SIN ASIGNAR', 312),
(313, '10', '124', 'SIN ASIGNAR', 313),
(314, '10', '16', 'SIN ASIGNAR', 314),
(315, '10', '16', 'SIN ASIGNAR', 315),
(316, '10', '20', 'SIN ASIGNAR', 316),
(317, '10', '25', 'SIN ASIGNAR', 317),
(318, '10', '25', 'SIN ASIGNAR', 318),
(319, '10', '51', 'SIN ASIGNAR', 319),
(320, '10', '22', 'SIN ASIGNAR', 320),
(321, '10', '48', 'SIN ASIGNAR', 321),
(322, '10', '43', 'SIN ASIGNAR', 322),
(323, '10', '84', 'SIN ASIGNAR', 323),
(324, '10', '82', 'SIN ASIGNAR', 324),
(325, '10', '83', 'SIN ASIGNAR', 325),
(326, '10', '21', 'SIN ASIGNAR', 326),
(327, '10', '4', 'SIN ASIGNAR', 327),
(328, '10', '2', 'SIN ASIGNAR', 328),
(329, '10', '0', 'SIN ASIGNAR', 329),
(330, '10', '0', 'SIN ASIGNAR', 330),
(331, '10', '0', 'SIN ASIGNAR', 331),
(332, '10', '0', 'SIN ASIGNAR', 332),
(333, '10', '0', 'SIN ASIGNAR', 333),
(334, '10', '24', 'SIN ASIGNAR', 334),
(335, '10', '26', 'SIN ASIGNAR', 335),
(336, '10', '33', 'SIN ASIGNAR', 336),
(337, '10', '34', 'SIN ASIGNAR', 337),
(338, '5', '19', 'SIN ASIGNAR', 338),
(339, '5', '68', 'SIN ASIGNAR', 339),
(340, '5', '26', 'SIN ASIGNAR', 340),
(341, '5', '87', 'SIN ASIGNAR', 341),
(342, '10', '28', 'SIN ASIGNAR', 342),
(343, '5', '27', 'SIN ASIGNAR', 343),
(344, '10', '22', 'SIN ASIGNAR', 344),
(345, '10', '0', 'SIN ASIGNAR', 345),
(346, '10', '0', 'SIN ASIGNAR', 346),
(347, '10', '0', 'SIN ASIGNAR', 347),
(348, '10', '0', 'SIN ASIGNAR', 348),
(349, '10', '0', 'SIN ASIGNAR', 349),
(350, '10', '0', 'SIN ASIGNAR', 350),
(351, '10', '0', 'SIN ASIGNAR', 351),
(352, '10', '0', 'SIN ASIGNAR', 352),
(353, '10', '0', 'SIN ASIGNAR', 353),
(354, '10', '0', 'SIN ASIGNAR', 354),
(355, '10', '0', 'SIN ASIGNAR', 355),
(356, '10', '24', 'SIN ASIGNAR', 356),
(357, '10', '20', 'SIN ASIGNAR', 357),
(358, '10', '0', 'SIN ASIGNAR', 358),
(359, '10', '0', 'SIN ASIGNAR', 359),
(360, '10', '0', 'SIN ASIGNAR', 360),
(361, '10', '0', 'SIN ASIGNAR', 361),
(362, '10', '0', 'SIN ASIGNAR', 362),
(363, '10', '0', 'SIN ASIGNAR', 363),
(364, '10', '0', 'SIN ASIGNAR', 364),
(365, '10', '0', 'SIN ASIGNAR', 365),
(366, '10', '0', 'SIN ASIGNAR', 366),
(367, '10', '0', 'SIN ASIGNAR', 367),
(368, '10', '0', 'SIN ASIGNAR', 368),
(369, '10', '0', 'SIN ASIGNAR', 369),
(370, '10', '0', 'SIN ASIGNAR', 370),
(371, '10', '0', 'SIN ASIGNAR', 371),
(372, '10', '0', 'SIN ASIGNAR', 372),
(373, '10', '0', 'SIN ASIGNAR', 373),
(374, '10', '0', 'SIN ASIGNAR', 374),
(375, '10', '0', 'SIN ASIGNAR', 375),
(376, '10', '0', 'SIN ASIGNAR', 376),
(377, '10', '0', 'SIN ASIGNAR', 377),
(378, '10', '0', 'SIN ASIGNAR', 378),
(379, '10', '0', 'SIN ASIGNAR', 379),
(380, '10', '0', 'SIN ASIGNAR', 380),
(381, '10', '0', 'SIN ASIGNAR', 381),
(382, '10', '3', 'SIN ASIGNAR', 382),
(383, '10', '5', 'SIN ASIGNAR', 383),
(384, '10', '0', 'SIN ASIGNAR', 384),
(385, '10', '1', 'SIN ASIGNAR', 385),
(386, '10', '0', 'SIN ASIGNAR', 386),
(387, '0', '99999974', 'FOTOCOPIADORA', 387),
(388, '0', '1', 'GENERAL', 388),
(389, '5', '19', 'DEPO.1 ESTANTE 3 ', 389),
(390, '0', '20', 'GENERAL', 390),
(391, '100', '1013', 'SIN ASIGNAR', 391),
(392, '5', '14', 'ESTANTE', 392),
(393, '5', '29', 'ESTANTE MADERA', 393),
(394, '5', '78', 'ESTANTE MADERA', 394),
(395, '5', '40', 'ESTANTE MADERA', 395),
(396, '5', '75', 'ESTANTE MADERA', 396),
(397, '10', '90', 'ESTANTE PISO', 397),
(398, '5', '30', 'ESTANTE', 398),
(399, '5', '27', 'ESTANTE ', 399),
(400, '5', '60', 'ESTANTE ', 400),
(401, '0', '2', 'ESTANTE ', 401),
(402, '0', '5', 'ESTANTE ', 402),
(403, '0', '5', 'ESTANTE ', 403),
(404, '5', '40', 'ESTANTE ', 404),
(405, '5', '100', 'ESTANTE', 405),
(406, '5', '10', 'ESTANTE ', 406),
(407, '0', '5', 'ESTANTE', 407),
(408, '0', '5', 'ESTANTE', 408),
(409, '0', '5', 'ESTANTE ', 409),
(410, '5', '10', 'ESTANTE ', 410),
(411, '0', '5', 'ESTANTE ', 411),
(412, '0', '5', 'ESTANTE ', 412),
(413, '0', '5', 'ESTANTE ', 413),
(414, '0', '4', 'ESTANTE ', 414),
(415, '0', '3', 'ESTANTE ', 415),
(416, '0', '2', 'ESTANTE ', 416),
(417, '0', '2', 'ESTANTE ', 417),
(418, '0', '2', 'ESTANTE ', 418),
(419, '0', '3', 'ESTANTE ', 419),
(420, '5', '1', 'SIN ASIGNAR', 420),
(421, '5', '3', 'SIN ASIGNAR', 421),
(422, '5', '3', 'SIN ASIGNACION', 422),
(423, '5', '4', 'SIN ASIGNAR', 423),
(424, '5', '9', 'SIN ASIGNAR', 424),
(425, '5', '1', 'SIN ASIGNAR', 425),
(426, '5', '2', 'SIN ASIGNAR', 426),
(427, '5', '1', 'SIN ASIGNAR', 427),
(428, '5', '5', 'SIN ASIGNAR', 428),
(429, '5', '1', 'SIN ASIGNAR', 429),
(430, '5', '30', 'SIN ASIGNAR', 430),
(431, '5', '6', 'SIN ASIGNAR', 431),
(432, '5', '3', 'SIN ASIGNAR', 432),
(433, '5', '5', 'SIN ASIGNAR', 433),
(434, '5', '2', 'SIN ASIGNAR', 434),
(435, '5', '7', 'SIN ASIGNAR', 435),
(436, '5', '12', 'SIN ASIGNAR', 436),
(437, '5', '8', 'SIN ASIGNAR', 437),
(438, '5', '17', 'SIN ASIGNAR', 438),
(439, '5', '4', 'SIN ASIGNAR', 439),
(440, '5', '8', 'SIN ASIGNAR', 440),
(441, '5', '4', 'SIN ASIGNAR', 441),
(442, '5', '2', 'SIN ASIGNAR', 442),
(443, '5', '2', 'SIN ASIGNAR', 443),
(444, '5', '32', 'SIN ASIGNAR', 444),
(445, '5', '6', 'SIN ASIGNAR', 445),
(446, '5', '5', 'SIN ASIGNAR', 446),
(447, '5', '5', 'SIN ASIGNAR', 447),
(448, '5', '3', 'SIN ASIGNAR', 448),
(449, '5', '15', 'SIN ASIGNAR', 449),
(450, '5', '2', 'SIN ASIGNAR', 450),
(451, '5', '1', 'SIN ASIGNAR', 451),
(452, '5', '1', 'SIN ASIGNAR', 452),
(453, '5', '2', 'SIN ASIGNAR', 453),
(454, '5', '1', 'SIN REGISTRAR', 454),
(455, '5', '1', 'SIN ASIGNAR', 455),
(456, '5', '1', 'SIN ASIGNAR', 456),
(457, '5', '1', 'SIN ASIGNAR', 457),
(458, '5', '54', 'SIN ASIGNAR', 458),
(459, '5', '145', 'SIN ASIGNAR', 459),
(460, '5', '23', 'SIN ASIGNAR', 460),
(461, '5', '31', 'SIN ASIGNAR', 461),
(462, '5', '36', 'SIN ASIGNAR', 462),
(463, '5', '136', 'SIN ASIGNAR', 463),
(464, '5', '106', 'SIN ASIGNAR', 464),
(465, '5', '39', 'SIN ASIGNAR', 465),
(466, '5', '4', 'SIN ASIGNAR', 466),
(467, '5', '13', 'SIN ASIGNAR', 467),
(468, '5', '14', 'SIN ASIGNAR', 468),
(469, '5', '14', 'SIN ASIGNAR', 469),
(470, '5', '10', 'SIN ASIGNAR', 470),
(471, '5', '6', 'SIN ASIGNAR', 471),
(472, '5', '5', 'SIN ASIGNAR', 472),
(473, '5', '2', 'SIN ASIGNAR', 473),
(474, '5', '2', 'SIN ASIGNAR', 474),
(475, '5', '4', 'SIN ASIGNAR', 475),
(476, '5', '2', 'SIN ASIGNAR', 476),
(477, '5', '6', 'SIN ASIGNAR', 477),
(478, '5', '1', 'SIN ASIGNAR', 478),
(479, '5', '315', 'SIN ASIGNAR', 479),
(480, '5', '2', 'SIN ASIGNAR', 480),
(481, '5', '2', 'SIN ASIGNAR', 481),
(482, '5', '2', 'SIN ASIGNAR', 482),
(483, '5', '2', 'SIN ASIGNAR', 483),
(484, '5', '2', 'SIN ASIGNAR', 484),
(485, '5', '3', 'SIN ASIGNAR', 485),
(486, '5', '1', 'SIN ASIGNAR', 486),
(487, '5', '1', 'SIN ASIGNAR', 487),
(488, '5', '2', 'SIN ASIGNAR', 488),
(489, '5', '1', 'SIN ASIGNAR', 489),
(490, '5', '1', 'SIN ASIGNAR', 490),
(491, '5', '2', 'SIN ASIGNAR', 491),
(492, '5', '2', 'SIN ASIGNAR', 492),
(493, '5', '2', 'SIN ASIGNAR', 493),
(494, '5', '63', 'SIN ASIGNAR', 494),
(495, '5', '194', 'SIN ASIGNAR', 495),
(496, '5', '37', 'SIN ASIGNAR', 496),
(497, '5', '17', 'SIN ASIGNAR', 497),
(498, '5', '72', 'SON ASIGNAR', 498),
(499, '5', '136', 'SIN ASIGNAR', 499),
(500, '5', '24', 'SIN ASIGNAR', 500),
(501, '5', '18', 'SIN ASIGNAR', 501),
(502, '5', '59', 'SIN ASIGNAR', 502),
(503, '50', '1480', 'SIN ASIGNAR', 503),
(504, '50', '550', 'SIN ASIGNAR', 504),
(505, '50', '440', 'SIN ASIGNAR', 505),
(506, '50', '530', 'SIN ASIGNAR', 506),
(507, '50', '550', 'SIN ASIGNACION', 507),
(508, '50', '47', 'SIN ASIGNAR', 508),
(509, '100', '285', 'SIN ASIGNAR', 509),
(510, '100', '453', 'SIN ASIGNAR', 510),
(511, '100', '148', 'SIN ASIGNAR', 511),
(512, '100', '1659', 'SIN ASIGNAR', 512),
(513, '100', '275', 'SIN ASIGNAR', 513),
(514, '100', '184', 'SIN ASIGNAR', 514),
(515, '100', '209', 'SIN ASIGNAR', 515),
(516, '50', '278', 'SIN ASIGNAR', 516),
(517, '50', '321', 'SIN ASIGNAR', 517),
(518, '50', '191', 'SIN ASIGNAR', 518),
(519, '50', '242', 'SIN ASIGNAR', 519),
(520, '24', '127', 'SIN ASIGNAR', 520),
(521, '24', '104', 'SIN ASIGNAR', 521),
(522, '24', '112', 'SIN ASIGNAR', 522),
(523, '24', '95', 'SIN ASIGNAR', 523),
(524, '24', '60', 'SIN ASIGNAR', 524),
(525, '24', '124', 'SIN ASIGNAR', 525),
(526, '24', '111', 'SIN ASIGNAR', 526),
(527, '24', '148', 'SIN ASIGNAR', 527),
(528, '24', '132', 'SIN ASIGNAR', 528),
(529, '24', '113', 'SIN ASIGNAR', 529),
(530, '24', '118', 'SIN ASIGNAR', 530),
(531, '24', '131', 'SIN ASIGNAR', 531),
(532, '24', '131', 'SIN ASIGNAR', 532),
(533, '24', '189', 'SIN ASIGNAR', 533),
(534, '24', '108', 'SIN ASIGNAR', 534),
(535, '24', '14', 'SIN ASIGNAR', 535),
(536, '24', '61', 'SIN ASIGNAR', 536),
(537, '24', '25', 'SIN ASIGNAR', 537),
(538, '50', '30', 'SIN ASIGNACION', 538),
(539, '50', '174', 'SIN ASIGNAR', 539),
(540, '50', '497', 'SIN ASIGNACION', 540),
(541, '50', '110', 'SIN ASIGNAR', 541),
(542, '50', '218', 'SIN ASIGNAR', 542),
(543, '50', '500', 'SIN ASIGNAR', 543),
(544, '50', '420', 'SIN ASIGNAR', 544),
(545, '50', '118', 'SIN ASIGNAR', 545),
(546, '50', '10', 'SIN ASIGNAR', 546),
(547, '50', '10', 'SIN ASIGNAR', 547),
(548, '50', '10', 'SIN ASIGNAR', 548),
(549, '50', '20', 'SIN ASIGNAR', 549),
(550, '20', '4', 'SIN ASIGNAR', 550),
(551, '20', '13', 'SIN ASIGNAR', 551),
(552, '20', '27', 'SIN ASIGNAR', 552),
(553, '20', '1', 'SIN ASIGNAR', 553),
(554, '24', '37', 'SIN ASIGNAR', 554),
(555, '24', '28', 'SIN ASIGNAR', 555),
(556, '24', '42', 'SIN ASIGNAR', 556),
(557, '10', '4', 'SIN ASIGNAR', 557),
(558, '20', '2', 'SIN ASIGNAR', 558),
(559, '20', '3', 'SIN ASIGNAR', 559),
(560, '20', '1', 'SIN ASIGNAR', 560),
(561, '10', '7', 'SIN ASIGNAR', 561),
(562, '10', '10', 'SIN ASIGNAR', 562),
(563, '10', '10', 'SIN ASIGNAR', 563),
(564, '20', '11', 'SIN ASIGNAR', 564),
(565, '20', '7', 'SIN ASIGNAR', 565),
(566, '20', '5', 'SIN ASIGNAR', 566),
(567, '20', '3', 'SIN ASIGNAR', 567),
(568, '20', '4', 'SIN ASIGNAR', 568),
(569, '20', '5', 'SIN ASIGNAR', 569),
(570, '20', '7', 'SIN ASIGNAR', 570),
(571, '20', '8', 'SIN ASIGNAR', 571),
(572, '20', '2', 'SIN ASIGNAR', 572),
(573, '20', '3', 'SIN ASIGNAR', 573),
(574, '10', '5', 'SIN ASIGNAR', 574),
(575, '10', '3', 'SIN ASIGNAR', 575),
(576, '10', '4', 'SIN ASIGNAR', 576),
(577, '10', '2', 'SIN ASIGNAR', 577),
(578, '10', '9', 'SIN ASIGNAR', 578),
(579, '10', '14', 'SIN ASIGNAR', 579),
(580, '10', '8', 'SIN ASIGNAR', 580),
(581, '10', '11', 'SIN ASIGNAR', 581),
(582, '10', '68', 'SIN ASIGNAR', 582),
(583, '10', '0', 'SIN ASIGNAR', 583),
(584, '10', '15', 'SIN ASIGNAR', 584),
(585, '10', '13', 'SIN ASIGNAR', 585),
(586, '10', '4', 'SIN ASIGNAR', 586),
(587, '10', '15', 'SIN ASIGNAR', 587),
(588, '10', '8', 'SIN ASIGNAR', 588),
(589, '10', '27', 'SIN ASIGNAR', 589),
(590, '10', '6', 'SIN ASIGNAR', 590),
(591, '5', '25', 'SIN ASIGNAR', 591),
(592, '5', '37', 'SIN ASIGNAR', 592),
(593, '12', '72', 'SIN ASIGNAR', 593),
(594, '10', '24', 'SIN ASIGNAR', 594),
(595, '50', '205', 'SIN ASIGNAR', 595),
(596, '50', '50', 'SIN ASIGNAR', 596),
(597, '50', '106', 'SIN ASIGNAR', 597),
(598, '50', '59', 'SIN ASIGNAR', 598),
(599, '25', '86', 'SIN ASIGNAR', 599),
(600, '20', '49', 'SIN ASIGNAR', 600),
(602, '10', '24', 'SIN ASIGNAR', 602),
(603, '20', '64', 'SIN ASIGNAR', 603),
(604, '10', '3', 'SIN ASIGNAR', 604),
(605, '20', '5', 'SIN ASIGNAR', 605),
(606, '75', '370', 'SIN ASIGNAR', 606),
(607, '01', '01', 'ESTANTE BIC', 607),
(608, '01', '02', 'ESTANTE BIC ', 608),
(609, '01', '01', 'ESTANTE- LIBRERIA', 609),
(610, '0', '1', 'SALON DE VENTAS', 610),
(611, '0', '3', 'SALON DE VENTAS', 611),
(612, '0', '1', 'SALON DE VENTAS', 612),
(613, '0', '4', 'SALON DE VENTAS', 613),
(614, '0', '3', 'SALON DE VENTAS', 614),
(615, '0', '2', 'SALON DE VENTAS', 615),
(616, '0', '1', 'SALON DE VENTAS', 616);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `APELLIDO` varchar(255) DEFAULT NULL,
  `DOC` varchar(255) DEFAULT NULL,
  `DOMICILIO` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `TEL` varchar(255) DEFAULT NULL,
  `CUENTA_ID` bigint(20) DEFAULT NULL,
  `DESCRIPCION_ID` bigint(20) DEFAULT NULL,
  `TIPO_DOC_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CLIENTE_CUENTA_ID` (`CUENTA_ID`),
  KEY `FK_CLIENTE_DESCRIPCION_ID` (`DESCRIPCION_ID`),
  KEY `FK_CLIENTE_TIPO_DOC_ID` (`TIPO_DOC_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcar la base de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`ID`, `APELLIDO`, `DOC`, `DOMICILIO`, `EMAIL`, `NOMBRE`, `TEL`, `CUENTA_ID`, `DESCRIPCION_ID`, `TIPO_DOC_ID`) VALUES
(1, 'CLIENTE', '0', 'SIN ASIGNAR', 'SIN ASIGNAR', 'GENERAL', 'SIN ASIGNAR', 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE IF NOT EXISTS `compras` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ANULACION` varchar(255) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `PRECIO_TOTOL` float DEFAULT NULL,
  `PROVEEDOR_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_COMPRAS_PROVEEDOR_ID` (`PROVEEDOR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `compras`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras_detalle_compra`
--

CREATE TABLE IF NOT EXISTS `compras_detalle_compra` (
  `Compras_ID` bigint(20) NOT NULL,
  `detalle_compra_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Compras_ID`,`detalle_compra_ID`),
  KEY `FK_COMPRAS_DETALLE_COMPRA_detalle_compra_ID` (`detalle_compra_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `compras_detalle_compra`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `control`
--

CREATE TABLE IF NOT EXISTS `control` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ACCION` varchar(255) DEFAULT NULL,
  `ALMACEN_ID` bigint(20) DEFAULT NULL,
  `COMPRA_ID` bigint(20) DEFAULT NULL,
  `DEVOLUCION_ID` bigint(20) DEFAULT NULL,
  `VENTA_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CONTROL_VENTA_ID` (`VENTA_ID`),
  KEY `FK_CONTROL_COMPRA_ID` (`COMPRA_ID`),
  KEY `FK_CONTROL_ALMACEN_ID` (`ALMACEN_ID`),
  KEY `FK_CONTROL_DEVOLUCION_ID` (`DEVOLUCION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `control`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta_cliente`
--

CREATE TABLE IF NOT EXISTS `cuenta_cliente` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ESTADO` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcar la base de datos para la tabla `cuenta_cliente`
--

INSERT INTO `cuenta_cliente` (`ID`, `ESTADO`, `NOMBRE`) VALUES
(1, 'SIN DEUDA', 'DNI0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta_cliente_detalle_cuenta_cliente`
--

CREATE TABLE IF NOT EXISTS `cuenta_cliente_detalle_cuenta_cliente` (
  `Cuenta_Cliente_ID` bigint(20) NOT NULL,
  `detalle_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Cuenta_Cliente_ID`,`detalle_ID`),
  KEY `CUENTA_CLIENTE_DETALLE_CUENTA_CLIENTE_detalle_ID` (`detalle_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `cuenta_cliente_detalle_cuenta_cliente`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta_proveedor`
--

CREATE TABLE IF NOT EXISTS `cuenta_proveedor` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ESTADO` varchar(255) DEFAULT NULL,
  `TOTAL_CUENTA` float DEFAULT NULL,
  `PROVEEDOR_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CUENTA_PROVEEDOR_PROVEEDOR_ID` (`PROVEEDOR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `cuenta_proveedor`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta_proveedor_compras`
--

CREATE TABLE IF NOT EXISTS `cuenta_proveedor_compras` (
  `Cuenta_Proveedor_ID` bigint(20) NOT NULL,
  `compra_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Cuenta_Proveedor_ID`,`compra_ID`),
  KEY `FK_CUENTA_PROVEEDOR_COMPRAS_compra_ID` (`compra_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `cuenta_proveedor_compras`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta_proveedor_detalle_cuenta_proveedor`
--

CREATE TABLE IF NOT EXISTS `cuenta_proveedor_detalle_cuenta_proveedor` (
  `Cuenta_Proveedor_ID` bigint(20) NOT NULL,
  `detalle_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Cuenta_Proveedor_ID`,`detalle_ID`),
  KEY `CUENTAPROVEEDOR_DETALLE_CUENTA_PROVEEDORdetalle_ID` (`detalle_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `cuenta_proveedor_detalle_cuenta_proveedor`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_cheque`
--

CREATE TABLE IF NOT EXISTS `datos_cheque` (
  `ID` bigint(20) NOT NULL,
  `BANCO` varchar(255) DEFAULT NULL,
  `DESCRIP` varchar(255) DEFAULT NULL,
  `DESCRIP_DEUDA` varchar(255) DEFAULT NULL,
  `FECHA_VENCIMIENTO` date DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `NRO_CHEQUE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `datos_cheque`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_contado`
--

CREATE TABLE IF NOT EXISTS `datos_contado` (
  `ID` bigint(20) NOT NULL,
  `DESCRIP` varchar(255) DEFAULT NULL,
  `DESCRIP_DEUDA` varchar(255) DEFAULT NULL,
  `DESCUENTO` int(11) DEFAULT NULL,
  `ENTREGA` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `datos_contado`
--

INSERT INTO `datos_contado` (`ID`, `DESCRIP`, `DESCRIP_DEUDA`, `DESCUENTO`, `ENTREGA`) VALUES
(553, NULL, NULL, 0, 0),
(603, NULL, NULL, 0, 0),
(606, NULL, NULL, 0, 0),
(653, NULL, NULL, 0, 19.5),
(1504, NULL, NULL, 0, 105);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_cuenta_corriente`
--

CREATE TABLE IF NOT EXISTS `datos_cuenta_corriente` (
  `ID` bigint(20) NOT NULL,
  `CANTIDAD_CUOTAS` int(11) DEFAULT NULL,
  `DESCRIP` varchar(255) DEFAULT NULL,
  `DESCRIP_DEUDA` varchar(255) DEFAULT NULL,
  `ENTREGA` float DEFAULT NULL,
  `ESTADO` varchar(255) DEFAULT NULL,
  `FECHA_PAGO` date DEFAULT NULL,
  `MONTO_CUOTA` float DEFAULT NULL,
  `NRO_CUOTA` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `datos_cuenta_corriente`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_tarjeta`
--

CREATE TABLE IF NOT EXISTS `datos_tarjeta` (
  `ID` bigint(20) NOT NULL,
  `CODIGO_SEGURIDAD` int(11) DEFAULT NULL,
  `DESCRIP` varchar(255) DEFAULT NULL,
  `DESCRIP_DEUDA` varchar(255) DEFAULT NULL,
  `FECHA_VENCIMIENTO` date DEFAULT NULL,
  `MONTO_CUOTA` float DEFAULT NULL,
  `NRO_CUOTAS` int(11) DEFAULT NULL,
  `NRO_DOC` varchar(255) DEFAULT NULL,
  `NRO_TARJETA` int(11) DEFAULT NULL,
  `TIPO_DOC` varchar(255) DEFAULT NULL,
  `TITULAR` varchar(255) DEFAULT NULL,
  `TOTAL` float DEFAULT NULL,
  `TARJETA_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DATOS_TARJETA_TARJETA_ID` (`TARJETA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `datos_tarjeta`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compra`
--

CREATE TABLE IF NOT EXISTS `detalle_compra` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CANTIDAD` int(11) DEFAULT NULL,
  `PRECIO` float DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_COMPRA_PRODUCTO_ID` (`PRODUCTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `detalle_compra`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_cuenta_cliente`
--

CREATE TABLE IF NOT EXISTS `detalle_cuenta_cliente` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ANULACION` varchar(255) DEFAULT NULL,
  `CANTIDAD_CUOTA` int(11) DEFAULT NULL,
  `ESTADO` varchar(255) DEFAULT NULL,
  `FECHA_PAGO` date DEFAULT NULL,
  `FECHA_VENCIMIENTO` date DEFAULT NULL,
  `IVA` int(11) DEFAULT NULL,
  `MONTO_CONINTERES` float DEFAULT NULL,
  `MONTO_CUOTA` float DEFAULT NULL,
  `NRO_CUOTA` int(11) DEFAULT NULL,
  `TIPO_PAGO` varchar(255) DEFAULT NULL,
  `TOTAL_CUENTA` float DEFAULT NULL,
  `VENTA_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_CUENTA_CLIENTE_VENTA_ID` (`VENTA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `detalle_cuenta_cliente`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_cuenta_proveedor`
--

CREATE TABLE IF NOT EXISTS `detalle_cuenta_proveedor` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CANTIDAD_CUOTA` int(11) DEFAULT NULL,
  `ESTADO` varchar(255) DEFAULT NULL,
  `IVA` int(11) DEFAULT NULL,
  `MONTO_CUOTA` float DEFAULT NULL,
  `NRO_CUOTA` int(11) DEFAULT NULL,
  `TIPO_PAGO` varchar(255) DEFAULT NULL,
  `COMPRA_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_CUENTA_PROVEEDOR_COMPRA_ID` (`COMPRA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `detalle_cuenta_proveedor`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_devolucion`
--

CREATE TABLE IF NOT EXISTS `detalle_devolucion` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CANTIDAD` int(11) DEFAULT NULL,
  `REINTEGRO` float DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_DEVOLUCION_PRODUCTO_ID` (`PRODUCTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `detalle_devolucion`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_factura`
--

CREATE TABLE IF NOT EXISTS `detalle_factura` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CANTIDAD` int(11) DEFAULT NULL,
  `ID_FACTURA` bigint(20) DEFAULT NULL,
  `PDESCRIPCION` varchar(255) DEFAULT NULL,
  `PRECIO` float DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_FACTURA_PRODUCTO_ID` (`PRODUCTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `detalle_factura`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_remito`
--

CREATE TABLE IF NOT EXISTS `detalle_remito` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CANTIDAD` int(11) DEFAULT NULL,
  `PRECIO` float DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_REMITO_PRODUCTO_ID` (`PRODUCTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `detalle_remito`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_tipo_venta`
--

CREATE TABLE IF NOT EXISTS `detalle_tipo_venta` (
  `ID` bigint(20) NOT NULL,
  `ESTADO` varchar(255) DEFAULT NULL,
  `FECHA_PAGO` date DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `NRO_CUOTA` int(11) DEFAULT NULL,
  `PAGO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_TIPO_VENTA_PAGO_ID` (`PAGO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `detalle_tipo_venta`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE IF NOT EXISTS `detalle_venta` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CANTIDAD` int(11) DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_VENTA_PRODUCTO_ID` (`PRODUCTO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcar la base de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`ID`, `CANTIDAD`, `MONTO`, `PRODUCTO_ID`) VALUES
(1, 1, 0, 195),
(2, 1, 0, 195),
(3, 10, 0, 195),
(4, 26, 0.75, 387),
(5, 1, 105, 610);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devolucion`
--

CREATE TABLE IF NOT EXISTS `devolucion` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `FECHA` date DEFAULT NULL,
  `MOTIVO` varchar(255) DEFAULT NULL,
  `COMPRA_ID` bigint(20) DEFAULT NULL,
  `PROVEEDOR_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DEVOLUCION_COMPRA_ID` (`COMPRA_ID`),
  KEY `FK_DEVOLUCION_PROVEEDOR_ID` (`PROVEEDOR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `devolucion`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devolucion_detalle_devolucion`
--

CREATE TABLE IF NOT EXISTS `devolucion_detalle_devolucion` (
  `Devolucion_ID` bigint(20) NOT NULL,
  `detalle_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Devolucion_ID`,`detalle_ID`),
  KEY `FK_DEVOLUCION_DETALLE_DEVOLUCION_detalle_ID` (`detalle_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `devolucion_detalle_devolucion`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CANTIDADCUOTA` int(11) DEFAULT NULL,
  `ESTADO` varchar(255) DEFAULT NULL,
  `FECHA_EMISION` date DEFAULT NULL,
  `FECHA_VENCIMIENTO` date DEFAULT NULL,
  `MONTO_CUOTA` float DEFAULT NULL,
  `NRO_CUOTA` int(11) DEFAULT NULL,
  `NRO_FACTURA` varchar(255) DEFAULT NULL,
  `TIPO_FACTURA` varchar(255) DEFAULT NULL,
  `TOTAL` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `factura`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura_detalle_factura`
--

CREATE TABLE IF NOT EXISTS `factura_detalle_factura` (
  `Factura_ID` bigint(20) NOT NULL,
  `detalle_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Factura_ID`,`detalle_ID`),
  KEY `FK_FACTURA_DETALLE_FACTURA_detalle_ID` (`detalle_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `factura_detalle_factura`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localizacion`
--

CREATE TABLE IF NOT EXISTS `localizacion` (
  `ID` bigint(20) NOT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `ID_ALMACEN` varchar(255) DEFAULT NULL,
  `ID_PRODUCTO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `localizacion`
--

INSERT INTO `localizacion` (`ID`, `DESCRIPCION`, `CANTIDAD`, `ID_ALMACEN`, `ID_PRODUCTO`) VALUES
(701, 'DEPOSITO', 11, '1', '1'),
(702, 'DEPOSITO', 16, '2', '2'),
(703, 'DEPOSITO', 10, '3', '3'),
(704, 'DEPOSITO', 20, '4', '4'),
(705, 'DEPOSITO', 10, '5', '5'),
(706, 'DEPOSITO', 8, '6', '6'),
(707, 'DEPOSITO', 16, '7', '7'),
(708, 'DEPOSITO', 11, '8', '8'),
(709, 'DEPOSITO', 18, '9', '9'),
(710, 'DEPOSITO', 3, '10', '10'),
(711, 'DEPOSITO', 1, '11', '11'),
(712, 'DEPOSITO', 1, '12', '12'),
(713, 'DEPOSITO', 6, '13', '13'),
(714, 'DEPOSITO', 2, '14', '14'),
(715, 'DEPOSITO', 2, '15', '15'),
(716, 'DEPOSITO', 2, '16', '16'),
(717, 'DEPOSITO', 1, '17', '17'),
(718, 'DEPOSITO', 2, '18', '18'),
(719, 'DEPOSITO', 14, '19', '19'),
(720, 'DEPOSITO', 10, '20', '20'),
(721, 'DEPOSITO', 3, '21', '21'),
(722, 'DEPOSITO', 3, '22', '22'),
(723, 'DEPOSITO', 3, '23', '23'),
(724, 'DEPOSITO', 0, '24', '24'),
(725, 'DEPOSITO', 20, '25', '25'),
(726, 'DEPOSITO', 23, '26', '26'),
(727, 'DEPOSITO', 13, '27', '27'),
(728, 'DEPOSITO', 16, '28', '28'),
(729, 'DEPOSITO', 17, '29', '29'),
(730, 'DEPOSITO', 6, '30', '30'),
(731, 'DEPOSITO', 24, '31', '31'),
(732, 'DEPOSITO', 25, '32', '32'),
(733, 'DEPOSITO', 12, '33', '33'),
(734, 'DEPOSITO', 0, '34', '34'),
(735, 'DEPOSITO', 2, '35', '35'),
(736, 'DEPOSITO', 26, '36', '36'),
(737, 'DEPOSITO', 30, '37', '37'),
(738, 'DEPOSITO', 33, '38', '38'),
(739, 'DEPOSITO', 15, '39', '39'),
(740, 'DEPOSITO', 6, '40', '40'),
(741, 'DEPOSITO', 23, '41', '41'),
(742, 'DEPOSITO', 9, '42', '42'),
(743, 'DEPOSITO', 6, '43', '43'),
(744, 'DEPOSITO', 5, '44', '44'),
(745, 'DEPOSITO', 21, '45', '45'),
(746, 'DEPOSITO', 20, '46', '46'),
(747, 'DEPOSITO', 33, '47', '47'),
(748, 'DEPOSITO', 4, '48', '48'),
(749, 'DEPOSITO', 2, '49', '49'),
(750, 'DEPOSITO', 2, '50', '50'),
(751, 'DEPOSITO', 1337, '51', '51'),
(752, 'DEPOSITO', 4, '52', '52'),
(753, 'DEPOSITO', 0, '53', '53'),
(754, 'DEPOSITO', 1, '54', '54'),
(755, 'DEPOSITO', 1, '55', '55'),
(756, 'DEPOSITO', 0, '56', '56'),
(757, 'DEPOSITO', 0, '57', '57'),
(758, 'DEPOSITO', 1, '58', '58'),
(759, 'DEPOSITO', 1, '59', '59'),
(760, 'DEPOSITO', 4, '60', '60'),
(761, 'DEPOSITO', 3, '61', '61'),
(762, 'DEPOSITO', 3, '62', '62'),
(763, 'DEPOSITO', 3, '63', '63'),
(764, 'DEPOSITO', 1, '64', '64'),
(765, 'DEPOSITO', 3, '65', '65'),
(766, 'DEPOSITO', 3, '66', '66'),
(767, 'DEPOSITO', 6, '67', '67'),
(768, 'DEPOSITO', 2, '68', '68'),
(769, 'DEPOSITO', 3, '69', '69'),
(770, 'DEPOSITO', 5, '70', '70'),
(771, 'DEPOSITO', 3, '71', '71'),
(772, 'DEPOSITO', 1, '72', '72'),
(773, 'DEPOSITO', 4, '73', '73'),
(774, 'DEPOSITO', 4, '74', '74'),
(775, 'DEPOSITO', 1, '75', '75'),
(776, 'DEPOSITO', 2, '76', '76'),
(777, 'DEPOSITO', 21, '77', '77'),
(778, 'DEPOSITO', 18, '78', '78'),
(779, 'DEPOSITO', 0, '79', '79'),
(780, 'DEPOSITO', 18, '80', '80'),
(781, 'DEPOSITO', 2, '81', '81'),
(782, 'DEPOSITO', 4, '82', '82'),
(783, 'DEPOSITO', 0, '83', '83'),
(784, 'DEPOSITO', 0, '84', '84'),
(785, 'DEPOSITO', 3, '85', '85'),
(786, 'DEPOSITO', 2, '86', '86'),
(787, 'DEPOSITO', 1, '87', '87'),
(788, 'DEPOSITO', 3, '88', '88'),
(789, 'DEPOSITO', 1, '89', '89'),
(790, 'DEPOSITO', 1, '90', '90'),
(791, 'DEPOSITO', 7, '91', '91'),
(792, 'DEPOSITO', 58, '92', '92'),
(793, 'DEPOSITO', 752, '93', '93'),
(794, 'DEPOSITO', 271, '94', '94'),
(795, 'DEPOSITO', 92, '95', '95'),
(796, 'DEPOSITO', 284, '96', '96'),
(797, 'DEPOSITO', 5, '97', '97'),
(798, 'DEPOSITO', 40, '98', '98'),
(799, 'DEPOSITO', 6, '99', '99'),
(800, 'DEPOSITO', 6, '100', '100'),
(801, 'DEPOSITO', 6, '101', '101'),
(802, 'DEPOSITO', 6, '102', '102'),
(803, 'DEPOSITO', 6, '103', '103'),
(804, 'DEPOSITO', 6, '104', '104'),
(805, 'DEPOSITO', 26, '105', '105'),
(806, 'DEPOSITO', 2, '106', '106'),
(807, 'DEPOSITO', 5, '107', '107'),
(808, 'DEPOSITO', 9, '108', '108'),
(809, 'DEPOSITO', 22, '109', '109'),
(810, 'DEPOSITO', 2, '110', '110'),
(811, 'DEPOSITO', 4, '111', '111'),
(812, 'DEPOSITO', 7, '112', '112'),
(813, 'DEPOSITO', 20, '113', '113'),
(814, 'DEPOSITO', 33, '114', '114'),
(815, 'DEPOSITO', 23, '115', '115'),
(816, 'DEPOSITO', 4, '116', '116'),
(817, 'DEPOSITO', 18, '117', '117'),
(818, 'DEPOSITO', 32, '118', '118'),
(819, 'DEPOSITO', 6, '119', '119'),
(820, 'DEPOSITO', 6, '120', '120'),
(821, 'DEPOSITO', 4, '121', '121'),
(822, 'DEPOSITO', 70, '122', '122'),
(823, 'DEPOSITO', 67, '123', '123'),
(824, 'DEPOSITO', 65, '124', '124'),
(825, 'DEPOSITO', 47, '125', '125'),
(826, 'DEPOSITO', 67, '126', '126'),
(827, 'DEPOSITO', 64, '127', '127'),
(828, 'DEPOSITO', 66, '128', '128'),
(829, 'DEPOSITO', 49, '129', '129'),
(830, 'DEPOSITO', 0, '130', '130'),
(831, 'DEPOSITO', 16, '131', '131'),
(832, 'DEPOSITO', 0, '132', '132'),
(833, 'DEPOSITO', 24, '133', '133'),
(834, 'DEPOSITO', 30, '134', '134'),
(835, 'DEPOSITO', 49, '135', '135'),
(836, 'DEPOSITO', 2, '136', '136'),
(837, 'DEPOSITO', 5, '137', '137'),
(838, 'DEPOSITO', 46, '138', '138'),
(839, 'DEPOSITO', 50, '139', '139'),
(840, 'DEPOSITO', 44, '140', '140'),
(841, 'DEPOSITO', 19, '141', '141'),
(842, 'DEPOSITO', 61, '142', '142'),
(843, 'DEPOSITO', 61, '143', '143'),
(844, 'DEPOSITO', 63, '144', '144'),
(845, 'DEPOSITO', 56, '145', '145'),
(846, 'DEPOSITO', 59, '146', '146'),
(847, 'DEPOSITO', 11, '147', '147'),
(848, 'DEPOSITO', 7, '148', '148'),
(849, 'DEPOSITO', 54, '149', '149'),
(850, 'DEPOSITO', 8, '150', '150'),
(851, 'DEPOSITO', 25, '151', '151'),
(852, 'DEPOSITO', 2, '152', '152'),
(853, 'DEPOSITO', 3, '153', '153'),
(854, 'DEPOSITO', 10, '154', '154'),
(855, 'DEPOSITO', 7, '155', '155'),
(856, 'DEPOSITO', 98, '156', '156'),
(857, 'DEPOSITO', 544, '157', '157'),
(858, 'DEPOSITO', 10, '158', '158'),
(859, 'DEPOSITO', 30, '159', '159'),
(860, 'DEPOSITO', 17, '160', '160'),
(861, 'DEPOSITO', 41, '161', '161'),
(862, 'DEPOSITO', 44, '162', '162'),
(863, 'DEPOSITO', 0, '163', '163'),
(864, 'DEPOSITO', 0, '164', '164'),
(865, 'DEPOSITO', 22, '165', '165'),
(866, 'DEPOSITO', 1, '166', '166'),
(867, 'DEPOSITO', 14, '167', '167'),
(868, 'DEPOSITO', 90, '168', '168'),
(869, 'DEPOSITO', 9, '169', '169'),
(870, 'DEPOSITO', 40, '170', '170'),
(871, 'DEPOSITO', 6, '171', '171'),
(872, 'DEPOSITO', 4, '172', '172'),
(873, 'DEPOSITO', 8, '173', '173'),
(874, 'DEPOSITO', 8, '174', '174'),
(875, 'DEPOSITO', 84, '175', '175'),
(876, 'DEPOSITO', 21, '176', '176'),
(877, 'DEPOSITO', 7, '177', '177'),
(878, 'DEPOSITO', 7, '178', '178'),
(879, 'DEPOSITO', 25, '179', '179'),
(880, 'DEPOSITO', 56, '180', '180'),
(881, 'DEPOSITO', 12, '181', '181'),
(882, 'DEPOSITO', 5, '182', '182'),
(883, 'DEPOSITO', 0, '183', '183'),
(884, 'DEPOSITO', 8, '184', '184'),
(885, 'DEPOSITO', 7, '185', '185'),
(886, 'DEPOSITO', 0, '186', '186'),
(887, 'DEPOSITO', 0, '187', '187'),
(888, 'DEPOSITO', 4, '188', '188'),
(889, 'DEPOSITO', 150, '189', '189'),
(890, 'DEPOSITO', 4, '190', '190'),
(891, 'DEPOSITO', 4, '191', '191'),
(892, 'DEPOSITO', 6, '192', '192'),
(893, 'DEPOSITO', 25, '193', '193'),
(894, 'DEPOSITO', 47, '194', '194'),
(895, 'DEPOSITO', 11, '195', '195'),
(896, 'DEPOSITO', 53, '196', '196'),
(897, 'DEPOSITO', 204, '197', '197'),
(898, 'DEPOSITO', 6, '198', '198'),
(899, 'DEPOSITO', 33, '199', '199'),
(900, 'DEPOSITO', 7, '200', '200'),
(901, 'DEPOSITO', 33, '201', '201'),
(902, 'DEPOSITO', 21, '202', '202'),
(903, 'DEPOSITO', 7, '203', '203'),
(904, 'DEPOSITO', 4, '204', '204'),
(905, 'DEPOSITO', 6, '205', '205'),
(906, 'DEPOSITO', 29, '206', '206'),
(907, 'DEPOSITO', 32, '207', '207'),
(908, 'DEPOSITO', 17, '208', '208'),
(909, 'DEPOSITO', 1, '209', '209'),
(910, 'DEPOSITO', 4, '210', '210'),
(911, 'DEPOSITO', 30, '211', '211'),
(912, 'DEPOSITO', 211, '212', '212'),
(913, 'DEPOSITO', 97, '213', '213'),
(914, 'DEPOSITO', 2, '214', '214'),
(915, 'DEPOSITO', 31, '215', '215'),
(916, 'DEPOSITO', 110, '216', '216'),
(917, 'DEPOSITO', 240, '217', '217'),
(918, 'DEPOSITO', 148, '218', '218'),
(919, 'DEPOSITO', 49, '219', '219'),
(920, 'DEPOSITO', 40, '220', '220'),
(921, 'DEPOSITO', 37, '221', '221'),
(922, 'DEPOSITO', 28, '222', '222'),
(923, 'DEPOSITO', 17, '223', '223'),
(924, 'DEPOSITO', 112, '224', '224'),
(925, 'DEPOSITO', 35, '225', '225'),
(926, 'DEPOSITO', 12, '226', '226'),
(927, 'DEPOSITO', 2, '227', '227'),
(928, 'DEPOSITO', 33, '228', '228'),
(929, 'DEPOSITO', 3, '229', '229'),
(930, 'DEPOSITO', 15, '230', '230'),
(931, 'DEPOSITO', 43, '231', '231'),
(932, 'DEPOSITO', 7, '232', '232'),
(933, 'DEPOSITO', 22, '233', '233'),
(934, 'DEPOSITO', 2, '234', '234'),
(935, 'DEPOSITO', 2, '235', '235'),
(936, 'DEPOSITO', 114, '236', '236'),
(937, 'DEPOSITO', 120, '237', '237'),
(938, 'DEPOSITO', 87, '238', '238'),
(939, 'DEPOSITO', 19, '239', '239'),
(940, 'DEPOSITO', 20, '240', '240'),
(941, 'DEPOSITO', 5, '241', '241'),
(942, 'DEPOSITO', 1, '242', '242'),
(943, 'DEPOSITO', 1, '243', '243'),
(944, 'DEPOSITO', 2, '244', '244'),
(945, 'DEPOSITO', 1, '245', '245'),
(946, 'DEPOSITO', 1, '246', '246'),
(947, 'DEPOSITO', 1, '247', '247'),
(948, 'DEPOSITO', 1, '248', '248'),
(949, 'DEPOSITO', 1, '249', '249'),
(950, 'DEPOSITO', 1, '250', '250'),
(951, 'DEPOSITO', 1, '251', '251'),
(952, 'DEPOSITO', 1, '252', '252'),
(953, 'DEPOSITO', 1, '253', '253'),
(954, 'DEPOSITO', 1, '254', '254'),
(955, 'DEPOSITO', 1, '255', '255'),
(956, 'DEPOSITO', 1, '256', '256'),
(957, 'DEPOSITO', 1, '257', '257'),
(958, 'DEPOSITO', 1, '258', '258'),
(959, 'DEPOSITO', 1, '259', '259'),
(960, 'DEPOSITO', 1, '260', '260'),
(961, 'DEPOSITO', 1, '261', '261'),
(962, 'DEPOSITO', 7, '262', '262'),
(963, 'DEPOSITO', 5, '263', '263'),
(964, 'DEPOSITO', 14, '264', '264'),
(965, 'DEPOSITO', 1, '265', '265'),
(966, 'DEPOSITO', 2, '266', '266'),
(967, 'DEPOSITO', 156, '267', '267'),
(968, 'DEPOSITO', 47, '268', '268'),
(969, 'DEPOSITO', 5, '269', '269'),
(970, 'DEPOSITO', 0, '270', '270'),
(971, 'DEPOSITO', 82, '271', '271'),
(972, 'DEPOSITO', 0, '272', '272'),
(973, 'DEPOSITO', 140, '273', '273'),
(974, 'DEPOSITO', 55, '274', '274'),
(975, 'DEPOSITO', 119, '275', '275'),
(976, 'DEPOSITO', 180, '276', '276'),
(977, 'DEPOSITO', 533, '277', '277'),
(978, 'DEPOSITO', 15, '278', '278'),
(979, 'DEPOSITO', 30, '279', '279'),
(980, 'DEPOSITO', 24, '280', '280'),
(981, 'DEPOSITO', 9, '281', '281'),
(982, 'DEPOSITO', 22, '282', '282'),
(983, 'DEPOSITO', 41, '283', '283'),
(984, 'DEPOSITO', 2, '284', '284'),
(985, 'DEPOSITO', 23, '285', '285'),
(986, 'DEPOSITO', 22, '286', '286'),
(987, 'DEPOSITO', 18, '287', '287'),
(988, 'DEPOSITO', 5, '288', '288'),
(989, 'DEPOSITO', 12, '289', '289'),
(990, 'DEPOSITO', 1, '290', '290'),
(991, 'DEPOSITO', 11, '291', '291'),
(992, 'DEPOSITO', 13, '292', '292'),
(993, 'DEPOSITO', 31, '293', '293'),
(994, 'DEPOSITO', 9, '294', '294'),
(995, 'DEPOSITO', 1, '295', '295'),
(996, 'DEPOSITO', 4, '296', '296'),
(997, 'DEPOSITO', 4, '297', '297'),
(998, 'DEPOSITO', 10, '298', '298'),
(999, 'DEPOSITO', 4, '299', '299'),
(1000, 'DEPOSITO', 1, '300', '300'),
(1001, 'DEPOSITO', 1, '301', '301'),
(1002, 'DEPOSITO', 12, '302', '302'),
(1003, 'DEPOSITO', 11, '303', '303'),
(1004, 'DEPOSITO', 11, '304', '304'),
(1005, 'DEPOSITO', 11, '305', '305'),
(1006, 'DEPOSITO', 12, '306', '306'),
(1007, 'DEPOSITO', 183, '307', '307'),
(1008, 'DEPOSITO', 95, '308', '308'),
(1009, 'DEPOSITO', 29, '309', '309'),
(1010, 'DEPOSITO', 30, '310', '310'),
(1011, 'DEPOSITO', 60, '311', '311'),
(1012, 'DEPOSITO', 52, '312', '312'),
(1013, 'DEPOSITO', 124, '313', '313'),
(1014, 'DEPOSITO', 16, '314', '314'),
(1015, 'DEPOSITO', 16, '315', '315'),
(1016, 'DEPOSITO', 20, '316', '316'),
(1017, 'DEPOSITO', 25, '317', '317'),
(1018, 'DEPOSITO', 25, '318', '318'),
(1019, 'DEPOSITO', 51, '319', '319'),
(1020, 'DEPOSITO', 22, '320', '320'),
(1021, 'DEPOSITO', 48, '321', '321'),
(1022, 'DEPOSITO', 43, '322', '322'),
(1023, 'DEPOSITO', 84, '323', '323'),
(1024, 'DEPOSITO', 82, '324', '324'),
(1025, 'DEPOSITO', 83, '325', '325'),
(1026, 'DEPOSITO', 21, '326', '326'),
(1027, 'DEPOSITO', 4, '327', '327'),
(1028, 'DEPOSITO', 2, '328', '328'),
(1029, 'DEPOSITO', 0, '329', '329'),
(1030, 'DEPOSITO', 0, '330', '330'),
(1031, 'DEPOSITO', 0, '331', '331'),
(1032, 'DEPOSITO', 0, '332', '332'),
(1033, 'DEPOSITO', 0, '333', '333'),
(1034, 'DEPOSITO', 24, '334', '334'),
(1035, 'DEPOSITO', 26, '335', '335'),
(1036, 'DEPOSITO', 33, '336', '336'),
(1037, 'DEPOSITO', 34, '337', '337'),
(1038, 'DEPOSITO', 19, '338', '338'),
(1039, 'DEPOSITO', 68, '339', '339'),
(1040, 'DEPOSITO', 26, '340', '340'),
(1041, 'DEPOSITO', 87, '341', '341'),
(1042, 'DEPOSITO', 28, '342', '342'),
(1043, 'DEPOSITO', 27, '343', '343'),
(1044, 'DEPOSITO', 22, '344', '344'),
(1045, 'DEPOSITO', 0, '345', '345'),
(1046, 'DEPOSITO', 0, '346', '346'),
(1047, 'DEPOSITO', 0, '347', '347'),
(1048, 'DEPOSITO', 0, '348', '348'),
(1049, 'DEPOSITO', 0, '349', '349'),
(1050, 'DEPOSITO', 0, '350', '350'),
(1051, 'DEPOSITO', 0, '351', '351'),
(1052, 'DEPOSITO', 0, '352', '352'),
(1053, 'DEPOSITO', 0, '353', '353'),
(1054, 'DEPOSITO', 0, '354', '354'),
(1055, 'DEPOSITO', 0, '355', '355'),
(1056, 'DEPOSITO', 24, '356', '356'),
(1057, 'DEPOSITO', 20, '357', '357'),
(1058, 'DEPOSITO', 0, '358', '358'),
(1059, 'DEPOSITO', 0, '359', '359'),
(1060, 'DEPOSITO', 0, '360', '360'),
(1061, 'DEPOSITO', 0, '361', '361'),
(1062, 'DEPOSITO', 0, '362', '362'),
(1063, 'DEPOSITO', 0, '363', '363'),
(1064, 'DEPOSITO', 0, '364', '364'),
(1065, 'DEPOSITO', 0, '365', '365'),
(1066, 'DEPOSITO', 0, '366', '366'),
(1067, 'DEPOSITO', 0, '367', '367'),
(1068, 'DEPOSITO', 0, '368', '368'),
(1069, 'DEPOSITO', 0, '369', '369'),
(1070, 'DEPOSITO', 0, '370', '370'),
(1071, 'DEPOSITO', 0, '371', '371'),
(1072, 'DEPOSITO', 0, '372', '372'),
(1073, 'DEPOSITO', 0, '373', '373'),
(1074, 'DEPOSITO', 0, '374', '374'),
(1075, 'DEPOSITO', 0, '375', '375'),
(1076, 'DEPOSITO', 0, '376', '376'),
(1077, 'DEPOSITO', 0, '377', '377'),
(1078, 'DEPOSITO', 0, '378', '378'),
(1079, 'DEPOSITO', 0, '379', '379'),
(1080, 'DEPOSITO', 0, '380', '380'),
(1081, 'DEPOSITO', 0, '381', '381'),
(1082, 'DEPOSITO', 3, '382', '382'),
(1083, 'DEPOSITO', 5, '383', '383'),
(1084, 'DEPOSITO', 0, '384', '384'),
(1085, 'DEPOSITO', 1, '385', '385'),
(1086, 'DEPOSITO', 0, '386', '386'),
(1087, 'DEPOSITO', 99999974, '387', '387'),
(1088, 'DEPOSITO', 1, '388', '388'),
(1089, 'DEPOSITO', 19, '389', '389'),
(1090, 'DEPOSITO', 20, '390', '390'),
(1091, 'DEPOSITO', 1013, '391', '391'),
(1092, 'DEPOSITO', 14, '392', '392'),
(1093, 'DEPOSITO', 29, '393', '393'),
(1094, 'DEPOSITO', 78, '394', '394'),
(1095, 'DEPOSITO', 40, '395', '395'),
(1096, 'DEPOSITO', 75, '396', '396'),
(1097, 'DEPOSITO', 90, '397', '397'),
(1098, 'DEPOSITO', 30, '398', '398'),
(1099, 'DEPOSITO', 27, '399', '399'),
(1100, 'DEPOSITO', 60, '400', '400'),
(1101, 'DEPOSITO', 2, '401', '401'),
(1102, 'DEPOSITO', 5, '402', '402'),
(1103, 'DEPOSITO', 5, '403', '403'),
(1104, 'DEPOSITO', 40, '404', '404'),
(1105, 'DEPOSITO', 100, '405', '405'),
(1106, 'DEPOSITO', 10, '406', '406'),
(1107, 'DEPOSITO', 5, '407', '407'),
(1108, 'DEPOSITO', 5, '408', '408'),
(1109, 'DEPOSITO', 5, '409', '409'),
(1110, 'DEPOSITO', 10, '410', '410'),
(1111, 'DEPOSITO', 5, '411', '411'),
(1112, 'DEPOSITO', 5, '412', '412'),
(1113, 'DEPOSITO', 5, '413', '413'),
(1114, 'DEPOSITO', 4, '414', '414'),
(1115, 'DEPOSITO', 3, '415', '415'),
(1116, 'DEPOSITO', 2, '416', '416'),
(1117, 'DEPOSITO', 2, '417', '417'),
(1118, 'DEPOSITO', 2, '418', '418'),
(1119, 'DEPOSITO', 3, '419', '419'),
(1120, 'DEPOSITO', 1, '420', '420'),
(1121, 'DEPOSITO', 3, '421', '421'),
(1122, 'DEPOSITO', 3, '422', '422'),
(1123, 'DEPOSITO', 4, '423', '423'),
(1124, 'DEPOSITO', 9, '424', '424'),
(1125, 'DEPOSITO', 1, '425', '425'),
(1126, 'DEPOSITO', 2, '426', '426'),
(1127, 'DEPOSITO', 1, '427', '427'),
(1128, 'DEPOSITO', 5, '428', '428'),
(1129, 'DEPOSITO', 1, '429', '429'),
(1130, 'DEPOSITO', 30, '430', '430'),
(1131, 'DEPOSITO', 6, '431', '431'),
(1132, 'DEPOSITO', 3, '432', '432'),
(1133, 'DEPOSITO', 5, '433', '433'),
(1134, 'DEPOSITO', 2, '434', '434'),
(1135, 'DEPOSITO', 7, '435', '435'),
(1136, 'DEPOSITO', 12, '436', '436'),
(1137, 'DEPOSITO', 8, '437', '437'),
(1138, 'DEPOSITO', 17, '438', '438'),
(1139, 'DEPOSITO', 4, '439', '439'),
(1140, 'DEPOSITO', 8, '440', '440'),
(1141, 'DEPOSITO', 4, '441', '441'),
(1142, 'DEPOSITO', 2, '442', '442'),
(1143, 'DEPOSITO', 2, '443', '443'),
(1144, 'DEPOSITO', 32, '444', '444'),
(1145, 'DEPOSITO', 6, '445', '445'),
(1146, 'DEPOSITO', 5, '446', '446'),
(1147, 'DEPOSITO', 5, '447', '447'),
(1148, 'DEPOSITO', 3, '448', '448'),
(1149, 'DEPOSITO', 15, '449', '449'),
(1150, 'DEPOSITO', 2, '450', '450'),
(1151, 'DEPOSITO', 1, '451', '451'),
(1152, 'DEPOSITO', 1, '452', '452'),
(1153, 'DEPOSITO', 2, '453', '453'),
(1154, 'DEPOSITO', 1, '454', '454'),
(1155, 'DEPOSITO', 1, '455', '455'),
(1156, 'DEPOSITO', 1, '456', '456'),
(1157, 'DEPOSITO', 1, '457', '457'),
(1158, 'DEPOSITO', 54, '458', '458'),
(1159, 'DEPOSITO', 145, '459', '459'),
(1160, 'DEPOSITO', 23, '460', '460'),
(1161, 'DEPOSITO', 31, '461', '461'),
(1162, 'DEPOSITO', 36, '462', '462'),
(1163, 'DEPOSITO', 136, '463', '463'),
(1164, 'DEPOSITO', 106, '464', '464'),
(1165, 'DEPOSITO', 39, '465', '465'),
(1166, 'DEPOSITO', 4, '466', '466'),
(1167, 'DEPOSITO', 13, '467', '467'),
(1168, 'DEPOSITO', 14, '468', '468'),
(1169, 'DEPOSITO', 14, '469', '469'),
(1170, 'DEPOSITO', 10, '470', '470'),
(1171, 'DEPOSITO', 6, '471', '471'),
(1172, 'DEPOSITO', 5, '472', '472'),
(1173, 'DEPOSITO', 2, '473', '473'),
(1174, 'DEPOSITO', 2, '474', '474'),
(1175, 'DEPOSITO', 4, '475', '475'),
(1176, 'DEPOSITO', 2, '476', '476'),
(1177, 'DEPOSITO', 6, '477', '477'),
(1178, 'DEPOSITO', 1, '478', '478'),
(1179, 'DEPOSITO', 315, '479', '479'),
(1180, 'DEPOSITO', 2, '480', '480'),
(1181, 'DEPOSITO', 2, '481', '481'),
(1182, 'DEPOSITO', 2, '482', '482'),
(1183, 'DEPOSITO', 2, '483', '483'),
(1184, 'DEPOSITO', 2, '484', '484'),
(1185, 'DEPOSITO', 3, '485', '485'),
(1186, 'DEPOSITO', 1, '486', '486'),
(1187, 'DEPOSITO', 1, '487', '487'),
(1188, 'DEPOSITO', 2, '488', '488'),
(1189, 'DEPOSITO', 1, '489', '489'),
(1190, 'DEPOSITO', 1, '490', '490'),
(1191, 'DEPOSITO', 2, '491', '491'),
(1192, 'DEPOSITO', 2, '492', '492'),
(1193, 'DEPOSITO', 2, '493', '493'),
(1194, 'DEPOSITO', 63, '494', '494'),
(1195, 'DEPOSITO', 194, '495', '495'),
(1196, 'DEPOSITO', 37, '496', '496'),
(1197, 'DEPOSITO', 17, '497', '497'),
(1198, 'DEPOSITO', 72, '498', '498'),
(1199, 'DEPOSITO', 136, '499', '499'),
(1200, 'DEPOSITO', 24, '500', '500'),
(1201, 'DEPOSITO', 18, '501', '501'),
(1202, 'DEPOSITO', 59, '502', '502'),
(1203, 'DEPOSITO', 1480, '503', '503'),
(1204, 'DEPOSITO', 550, '504', '504'),
(1205, 'DEPOSITO', 440, '505', '505'),
(1206, 'DEPOSITO', 530, '506', '506'),
(1207, 'DEPOSITO', 550, '507', '507'),
(1208, 'DEPOSITO', 47, '508', '508'),
(1209, 'DEPOSITO', 285, '509', '509'),
(1210, 'DEPOSITO', 453, '510', '510'),
(1211, 'DEPOSITO', 148, '511', '511'),
(1212, 'DEPOSITO', 1659, '512', '512'),
(1213, 'DEPOSITO', 275, '513', '513'),
(1214, 'DEPOSITO', 184, '514', '514'),
(1215, 'DEPOSITO', 209, '515', '515'),
(1216, 'DEPOSITO', 278, '516', '516'),
(1217, 'DEPOSITO', 321, '517', '517'),
(1218, 'DEPOSITO', 191, '518', '518'),
(1219, 'DEPOSITO', 242, '519', '519'),
(1220, 'DEPOSITO', 127, '520', '520'),
(1221, 'DEPOSITO', 104, '521', '521'),
(1222, 'DEPOSITO', 112, '522', '522'),
(1223, 'DEPOSITO', 95, '523', '523'),
(1224, 'DEPOSITO', 60, '524', '524'),
(1225, 'DEPOSITO', 124, '525', '525'),
(1226, 'DEPOSITO', 111, '526', '526'),
(1227, 'DEPOSITO', 148, '527', '527'),
(1228, 'DEPOSITO', 132, '528', '528'),
(1229, 'DEPOSITO', 113, '529', '529'),
(1230, 'DEPOSITO', 118, '530', '530'),
(1231, 'DEPOSITO', 131, '531', '531'),
(1232, 'DEPOSITO', 131, '532', '532'),
(1233, 'DEPOSITO', 189, '533', '533'),
(1234, 'DEPOSITO', 108, '534', '534'),
(1235, 'DEPOSITO', 14, '535', '535'),
(1236, 'DEPOSITO', 61, '536', '536'),
(1237, 'DEPOSITO', 25, '537', '537'),
(1238, 'DEPOSITO', 30, '538', '538'),
(1239, 'DEPOSITO', 174, '539', '539'),
(1240, 'DEPOSITO', 497, '540', '540'),
(1241, 'DEPOSITO', 110, '541', '541'),
(1242, 'DEPOSITO', 218, '542', '542'),
(1243, 'DEPOSITO', 500, '543', '543'),
(1244, 'DEPOSITO', 420, '544', '544'),
(1245, 'DEPOSITO', 118, '545', '545'),
(1246, 'DEPOSITO', 10, '546', '546'),
(1247, 'DEPOSITO', 10, '547', '547'),
(1248, 'DEPOSITO', 10, '548', '548'),
(1249, 'DEPOSITO', 20, '549', '549'),
(1250, 'DEPOSITO', 4, '550', '550'),
(1251, 'DEPOSITO', 13, '551', '551'),
(1252, 'DEPOSITO', 27, '552', '552'),
(1253, 'DEPOSITO', 1, '553', '553'),
(1254, 'DEPOSITO', 37, '554', '554'),
(1255, 'DEPOSITO', 28, '555', '555'),
(1256, 'DEPOSITO', 42, '556', '556'),
(1257, 'DEPOSITO', 4, '557', '557'),
(1258, 'DEPOSITO', 2, '558', '558'),
(1259, 'DEPOSITO', 3, '559', '559'),
(1260, 'DEPOSITO', 1, '560', '560'),
(1261, 'DEPOSITO', 7, '561', '561'),
(1262, 'DEPOSITO', 10, '562', '562'),
(1263, 'DEPOSITO', 10, '563', '563'),
(1264, 'DEPOSITO', 11, '564', '564'),
(1265, 'DEPOSITO', 7, '565', '565'),
(1266, 'DEPOSITO', 5, '566', '566'),
(1267, 'DEPOSITO', 3, '567', '567'),
(1268, 'DEPOSITO', 4, '568', '568'),
(1269, 'DEPOSITO', 5, '569', '569'),
(1270, 'DEPOSITO', 7, '570', '570'),
(1271, 'DEPOSITO', 8, '571', '571'),
(1272, 'DEPOSITO', 2, '572', '572'),
(1273, 'DEPOSITO', 3, '573', '573'),
(1274, 'DEPOSITO', 5, '574', '574'),
(1275, 'DEPOSITO', 3, '575', '575'),
(1276, 'DEPOSITO', 4, '576', '576'),
(1277, 'DEPOSITO', 2, '577', '577'),
(1278, 'DEPOSITO', 9, '578', '578'),
(1279, 'DEPOSITO', 14, '579', '579'),
(1280, 'DEPOSITO', 8, '580', '580'),
(1281, 'DEPOSITO', 11, '581', '581'),
(1282, 'DEPOSITO', 68, '582', '582'),
(1283, 'DEPOSITO', 0, '583', '583'),
(1284, 'DEPOSITO', 15, '584', '584'),
(1285, 'DEPOSITO', 13, '585', '585'),
(1286, 'DEPOSITO', 4, '586', '586'),
(1287, 'DEPOSITO', 15, '587', '587'),
(1288, 'DEPOSITO', 8, '588', '588'),
(1289, 'DEPOSITO', 27, '589', '589'),
(1290, 'DEPOSITO', 6, '590', '590'),
(1291, 'DEPOSITO', 25, '591', '591'),
(1292, 'DEPOSITO', 37, '592', '592'),
(1293, 'DEPOSITO', 72, '593', '593'),
(1294, 'DEPOSITO', 24, '594', '594'),
(1295, 'DEPOSITO', 205, '595', '595'),
(1296, 'DEPOSITO', 50, '596', '596'),
(1297, 'DEPOSITO', 106, '597', '597'),
(1298, 'DEPOSITO', 59, '598', '598'),
(1299, 'DEPOSITO', 86, '599', '599'),
(1300, 'DEPOSITO', 49, '600', '600'),
(1301, 'DEPOSITO', 24, '602', '602'),
(1302, 'DEPOSITO', 64, '603', '603'),
(1303, 'DEPOSITO', 3, '604', '604'),
(1304, 'DEPOSITO', 5, '605', '605'),
(1305, 'DEPOSITO', 370, '606', '606'),
(1306, 'DEPOSITO', 1, '607', '607'),
(1307, 'DEPOSITO', 2, '608', '608'),
(1308, 'DEPOSITO', 1, '609', '609'),
(1351, 'DEPOSITO', 20, '8', '8'),
(1401, 'DEPOSITO', 0, NULL, NULL),
(1451, 'SALON DE VENTAS', 10, '1', '1'),
(1501, 'SALON DE VENTAS', 2, '610', '610'),
(1505, 'SALON DE VENTAS', 3, '611', '611'),
(1506, 'SALON DE VENTAS', 1, '612', '612'),
(1551, 'SALON DE VENTAS', 4, '613', '613'),
(1552, 'SALON DE VENTAS', 3, '614', '614'),
(1553, 'SALON DE VENTAS', 2, '615', '615'),
(1554, 'SALON DE VENTAS', 1, '616', '616');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden_pago`
--

CREATE TABLE IF NOT EXISTS `orden_pago` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `CUENTA_PROVEEDOR_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ORDEN_PAGO_CUENTA_PROVEEDOR_ID` (`CUENTA_PROVEEDOR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `orden_pago`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagocliente`
--

CREATE TABLE IF NOT EXISTS `pagocliente` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ANULACION` varchar(255) DEFAULT NULL,
  `FECHAPAGO` date DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `TIPO_PAGO` varchar(255) DEFAULT NULL,
  `CUENTA_ID` bigint(20) DEFAULT NULL,
  `FACTURA_ID` bigint(20) DEFAULT NULL,
  `VENTA_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PAGOCLIENTE_CUENTA_ID` (`CUENTA_ID`),
  KEY `FK_PAGOCLIENTE_VENTA_ID` (`VENTA_ID`),
  KEY `FK_PAGOCLIENTE_FACTURA_ID` (`FACTURA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcar la base de datos para la tabla `pagocliente`
--

INSERT INTO `pagocliente` (`ID`, `ANULACION`, `FECHAPAGO`, `MONTO`, `TIPO_PAGO`, `CUENTA_ID`, `FACTURA_ID`, `VENTA_ID`) VALUES
(1, 'NO', '2015-07-22', 0, NULL, NULL, NULL, 1),
(2, 'NO', '2015-07-22', 0, NULL, NULL, NULL, 2),
(3, 'NO', '2015-07-22', 0, NULL, NULL, NULL, 3),
(4, 'NO', '2015-07-22', 19.5, NULL, NULL, NULL, 4),
(5, 'NO', '2015-10-07', 105, NULL, NULL, NULL, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precio`
--

CREATE TABLE IF NOT EXISTS `precio` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `PRECIO_CONTADO` float DEFAULT NULL,
  `PRECIO_REAL` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=617 ;

--
-- Volcar la base de datos para la tabla `precio`
--

INSERT INTO `precio` (`ID`, `PRECIO_CONTADO`, `PRECIO_REAL`) VALUES
(1, 38, 0),
(2, 38, 0),
(3, 21, 0),
(4, 21, 0),
(5, 21, 0),
(6, 21, 0),
(7, 21, 0),
(8, 0, 0),
(9, 0, 0),
(10, 0, 0),
(11, 0, 0),
(12, 0, 0),
(13, 0, 0),
(14, 0, 0),
(15, 0, 0),
(16, 0, 0),
(17, 0, 0),
(18, 0, 0),
(19, 0, 0),
(20, 0, 0),
(21, 0, 0),
(22, 0, 0),
(23, 0, 0),
(24, 0, 0),
(25, 0, 0),
(26, 0, 0),
(27, 0, 0),
(28, 0, 0),
(29, 0, 0),
(30, 0, 0),
(31, 0, 0),
(32, 0, 0),
(33, 0, 0),
(34, 0, 0),
(35, 0, 0),
(36, 0, 0),
(37, 0, 0),
(38, 0, 0),
(39, 0, 0),
(40, 0, 0),
(41, 0, 0),
(42, 0, 0),
(43, 0, 0),
(44, 0, 0),
(45, 0, 0),
(46, 0, 0),
(47, 0, 0),
(48, 0, 0),
(49, 0, 0),
(50, 11, 0),
(51, 0, 0),
(52, 0, 0),
(53, 0, 0),
(54, 0, 0),
(55, 0, 0),
(56, 0, 0),
(57, 0, 0),
(58, 0, 0),
(59, 0, 0),
(60, 0, 0),
(61, 0, 0),
(62, 0, 0),
(63, 0, 0),
(64, 0, 0),
(65, 0, 0),
(66, 0, 0),
(67, 0, 0),
(68, 0, 0),
(69, 0, 0),
(70, 0, 0),
(71, 0, 0),
(72, 0, 0),
(73, 0, 0),
(74, 0, 0),
(75, 0, 0),
(76, 0, 0),
(77, 0, 0),
(78, 0, 0),
(79, 0, 0),
(80, 0, 0),
(81, 0, 0),
(82, 0, 0),
(83, 0, 0),
(84, 0, 0),
(85, 0, 0),
(86, 0, 0),
(87, 0, 0),
(88, 0, 0),
(89, 0, 0),
(90, 0, 0),
(91, 0, 0),
(92, 0, 0),
(93, 0, 0),
(94, 0, 0),
(95, 0, 0),
(96, 0, 0),
(97, 0, 0),
(98, 5, 0),
(99, 31, 0),
(100, 31, 0),
(101, 31, 0),
(102, 31, 0),
(103, 31, 0),
(104, 31, 0),
(105, 17, 0),
(106, 40, 0),
(107, 15, 0),
(108, 10, 0),
(109, 0, 0),
(110, 0, 0),
(111, 25, 0),
(112, 6, 0),
(113, 0, 0),
(114, 0, 0),
(115, 0, 0),
(116, 0, 0),
(117, 0, 0),
(118, 0, 0),
(119, 30, 0),
(120, 30, 0),
(121, 0, 0),
(122, 0, 0),
(123, 0, 0),
(124, 0, 0),
(125, 0, 0),
(126, 0, 0),
(127, 0, 0),
(128, 0, 0),
(129, 0, 0),
(130, 0, 0),
(131, 0, 0),
(132, 0, 0),
(133, 0, 0),
(134, 0, 0),
(135, 0, 0),
(136, 0, 0),
(137, 0, 0),
(138, 0, 0),
(139, 0, 0),
(140, 0, 0),
(141, 0, 0),
(142, 0, 0),
(143, 0, 0),
(144, 0, 0),
(145, 0, 0),
(146, 0, 0),
(147, 0, 0),
(148, 0, 0),
(149, 0, 0),
(150, 0, 0),
(151, 0, 0),
(152, 0, 0),
(153, 0, 0),
(154, 0, 0),
(155, 0, 0),
(156, 0, 0),
(157, 0, 0),
(158, 0, 0),
(159, 0, 0),
(160, 0, 0),
(161, 0, 0),
(162, 0, 0),
(163, 0, 0),
(164, 0, 0),
(165, 0, 0),
(166, 0, 0),
(167, 0, 0),
(168, 0, 0),
(169, 0, 0),
(170, 0, 0),
(171, 0, 0),
(172, 0, 0),
(173, 0, 0),
(174, 0, 0),
(175, 0, 0),
(176, 0, 0),
(177, 0, 0),
(178, 0, 0),
(179, 0, 0),
(180, 0, 0),
(181, 0, 0),
(182, 0, 0),
(183, 0, 0),
(184, 0, 0),
(185, 0, 0),
(186, 0, 0),
(187, 0, 0),
(188, 15, 0),
(189, 18, 0),
(190, 15, 0),
(191, 15, 0),
(192, 10, 0),
(193, 55, 0),
(194, 23, 0),
(195, 0, 0),
(196, 0, 0),
(197, 0, 0),
(198, 0, 0),
(199, 0, 0),
(200, 0, 0),
(201, 0, 0),
(202, 0, 0),
(203, 0, 0),
(204, 0, 0),
(205, 0, 0),
(206, 0, 0),
(207, 0, 0),
(208, 0, 0),
(209, 0, 0),
(210, 0, 0),
(211, 0, 0),
(212, 0, 0),
(213, 0, 0),
(214, 0, 0),
(215, 0, 0),
(216, 0, 0),
(217, 0, 0),
(218, 0, 0),
(219, 0, 0),
(220, 0, 0),
(221, 0, 0),
(222, 0, 0),
(223, 0, 0),
(224, 0, 0),
(225, 0, 0),
(226, 0, 0),
(227, 0, 0),
(228, 0, 0),
(229, 0, 0),
(230, 0, 0),
(231, 0, 0),
(232, 0, 0),
(233, 0, 0),
(234, 0, 0),
(235, 0, 0),
(236, 0, 0),
(237, 0, 0),
(238, 0, 0),
(239, 0, 0),
(240, 0, 0),
(241, 0, 0),
(242, 0, 0),
(243, 0, 0),
(244, 0, 0),
(245, 0, 0),
(246, 0, 0),
(247, 0, 0),
(248, 0, 0),
(249, 0, 0),
(250, 0, 0),
(251, 0, 0),
(252, 0, 0),
(253, 0, 0),
(254, 0, 0),
(255, 0, 0),
(256, 0, 0),
(257, 0, 0),
(258, 0, 0),
(259, 0, 0),
(260, 0, 0),
(261, 0, 0),
(262, 0, 0),
(263, 0, 0),
(264, 0, 0),
(265, 0, 0),
(266, 0, 0),
(267, 18, 0),
(268, 0, 0),
(269, 0, 0),
(270, 0, 0),
(271, 0, 0),
(272, 0, 0),
(273, 0, 0),
(274, 0, 0),
(275, 0, 0),
(276, 3, 0),
(277, 3, 0),
(278, 0, 0),
(279, 0, 0),
(280, 20, 0),
(281, 20, 0),
(282, 20, 0),
(283, 20, 0),
(284, 20, 0),
(285, 20, 0),
(286, 20, 0),
(287, 0, 0),
(288, 20, 0),
(289, 20, 0),
(290, 20, 0),
(291, 20, 0),
(292, 20, 0),
(293, 20, 0),
(294, 20, 0),
(295, 20, 0),
(296, 0, 0),
(297, 0, 0),
(298, 0, 0),
(299, 0, 0),
(300, 0, 0),
(301, 17, 0),
(302, 17, 0),
(303, 17, 0),
(304, 17, 0),
(305, 17, 0),
(306, 17, 0),
(307, 0, 0),
(308, 0, 0),
(309, 0, 0),
(310, 0, 0),
(311, 0, 0),
(312, 0, 0),
(313, 0, 0),
(314, 0, 0),
(315, 0, 0),
(316, 0, 0),
(317, 0, 0),
(318, 0, 0),
(319, 0, 0),
(320, 0, 0),
(321, 0, 0),
(322, 0, 0),
(323, 0, 0),
(324, 0, 0),
(325, 0, 0),
(326, 0, 0),
(327, 0, 0),
(328, 0, 0),
(329, 0, 0),
(330, 0, 0),
(331, 0, 0),
(332, 0, 0),
(333, 0, 0),
(334, 30, 0),
(335, 30, 0),
(336, 30, 0),
(337, 30, 0),
(338, 30, 0),
(339, 30, 0),
(340, 30, 0),
(341, 30, 0),
(342, 30, 0),
(343, 30, 0),
(344, 30, 0),
(345, 0, 0),
(346, 0, 0),
(347, 0, 0),
(348, 0, 0),
(349, 0, 0),
(350, 0, 0),
(351, 0, 0),
(352, 0, 0),
(353, 0, 0),
(354, 0, 0),
(355, 0, 0),
(356, 16, 0),
(357, 0, 0),
(358, 0, 0),
(359, 0, 0),
(360, 0, 0),
(361, 0, 0),
(362, 0, 0),
(363, 0, 0),
(364, 0, 0),
(365, 0, 0),
(366, 0, 0),
(367, 0, 0),
(368, 0, 0),
(369, 0, 0),
(370, 0, 0),
(371, 0, 0),
(372, 0, 0),
(373, 0, 0),
(374, 0, 0),
(375, 0, 0),
(376, 0, 0),
(377, 0, 0),
(378, 0, 0),
(379, 0, 0),
(380, 0, 0),
(381, 0, 0),
(382, 15, 0),
(383, 15, 0),
(384, 0, 0),
(385, 15, 0),
(386, 0, 0),
(387, 0, 0),
(388, 0.5, 0.5),
(389, 19.53, 19.53),
(390, 0, 0),
(391, 6, 0),
(392, 0, 0),
(393, 0, 0),
(394, 0, 0),
(395, 0, 0),
(396, 0, 0),
(397, 0, 0),
(398, 4.44, 4.44),
(399, 6.1, 6.1),
(400, 3.75, 3.75),
(401, 3.67, 3.67),
(402, 5.3066, 5.3066),
(403, 15.27, 15.27),
(404, 1, 1),
(405, 9, 9),
(406, 2.08, 2.08),
(407, 3.45, 3.45),
(408, 2.08, 2.08),
(409, 2.07, 2.07),
(410, 2.07, 2.07),
(411, 2.07, 2.07),
(412, 2.07, 2.07),
(413, 2.07, 2.07),
(414, 18.02, 18.02),
(415, 127.56, 127.56),
(416, 108.68, 108.68),
(417, 11.46, 11.46),
(418, 12.61, 12.61),
(419, 14.39, 14.39),
(420, 21, 0),
(421, 21, 0),
(422, 21, 0),
(423, 21, 0),
(424, 21, 0),
(425, 21, 0),
(426, 21, 0),
(427, 21, 0),
(428, 21, 0),
(429, 21, 0),
(430, 21, 0),
(431, 21, 0),
(432, 21, 0),
(433, 21, 0),
(434, 21, 0),
(435, 21, 0),
(436, 21, 0),
(437, 21, 0),
(438, 21, 0),
(439, 21, 0),
(440, 21, 0),
(441, 21, 0),
(442, 21, 0),
(443, 21, 0),
(444, 21, 0),
(445, 21, 0),
(446, 30, 0),
(447, 30, 0),
(448, 30, 0),
(449, 30, 0),
(450, 18, 0),
(451, 18, 0),
(452, 18, 0),
(453, 18, 0),
(454, 16, 0),
(455, 16, 0),
(456, 16, 0),
(457, 16, 0),
(458, 20, 0),
(459, 20, 0),
(460, 0, 0),
(461, 13, 0),
(462, 25, 0),
(463, 16, 0),
(464, 10, 0),
(465, 3, 0),
(466, 14, 0),
(467, 14, 0),
(468, 14, 0),
(469, 14, 0),
(470, 14, 0),
(471, 14, 0),
(472, 14, 0),
(473, 14, 0),
(474, 14, 0),
(475, 14, 0),
(476, 14, 0),
(477, 14, 0),
(478, 14, 0),
(479, 14, 0),
(480, 17, 0),
(481, 17, 0),
(482, 17, 0),
(483, 35, 0),
(484, 35, 0),
(485, 35, 0),
(486, 35, 0),
(487, 35, 0),
(488, 35, 0),
(489, 35, 0),
(490, 35, 0),
(491, 35, 0),
(492, 35, 0),
(493, 35, 0),
(494, 25, 0),
(495, 25, 0),
(496, 34, 0),
(497, 34, 0),
(498, 68, 0),
(499, 20, 0),
(500, 13, 0),
(501, 17, 0),
(502, 8, 0),
(503, 2, 0),
(504, 2, 0),
(505, 2, 0),
(506, 2, 0),
(507, 2, 0),
(508, 2, 0),
(509, 6, 0),
(510, 6, 0),
(511, 6, 0),
(512, 6, 0),
(513, 6, 0),
(514, 6, 0),
(515, 6, 0),
(516, 6, 0),
(517, 6, 0),
(518, 6, 0),
(519, 6, 0),
(520, 5, 0),
(521, 5, 0),
(522, 5, 0),
(523, 5, 0),
(524, 5, 0),
(525, 5, 0),
(526, 5, 0),
(527, 8, 0),
(528, 8, 0),
(529, 8, 0),
(530, 8, 0),
(531, 8, 0),
(532, 8, 0),
(533, 8, 0),
(534, 108, 0),
(535, 8, 0),
(536, 20, 0),
(537, 20, 0),
(538, 2, 0),
(539, 2, 0),
(540, 2, 0),
(541, 2, 0),
(542, 2, 0),
(543, 2, 0),
(544, 2, 0),
(545, 2, 0),
(546, 2, 0),
(547, 2, 0),
(548, 2, 0),
(549, 2, 0),
(550, 8, 0),
(551, 8, 0),
(552, 27, 0),
(553, 32, 0),
(554, 27, 0),
(555, 27, 0),
(556, 27, 0),
(557, 8, 0),
(558, 8, 0),
(559, 8, 0),
(560, 8, 0),
(561, 38, 0),
(562, 38, 0),
(563, 38, 0),
(564, 15, 0),
(565, 15, 0),
(566, 15, 0),
(567, 15, 0),
(568, 15, 0),
(569, 15, 0),
(570, 15, 0),
(571, 15, 0),
(572, 15, 0),
(573, 15, 0),
(574, 15, 0),
(575, 15, 0),
(576, 15, 0),
(577, 15, 0),
(578, 6, 0),
(579, 6, 0),
(580, 32, 0),
(581, 32, 0),
(582, 6, 0),
(583, 5, 0),
(584, 6, 0),
(585, 27, 0),
(586, 27, 0),
(587, 27, 0),
(588, 27, 0),
(589, 2, 0),
(590, 11, 0),
(591, 25, 0),
(592, 19, 0),
(593, 35, 0),
(594, 18, 0),
(595, 6, 0),
(596, 6, 0),
(597, 3, 0),
(598, 5, 0),
(599, 8, 0),
(600, 6, 0),
(602, 5, 0),
(603, 6, 0),
(604, 6, 0),
(605, 6, 0),
(606, 3, 0),
(607, 390, 228.81),
(608, 134, 78.2342),
(609, 5, 2.6322),
(610, 105, 47.7735),
(611, 90, 66.399),
(612, 90, 50.6761),
(613, 90, 22.375),
(614, 90, 31.3248),
(615, 40, 18.0209),
(616, 40, 14.3925);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precio_tarjeta`
--

CREATE TABLE IF NOT EXISTS `precio_tarjeta` (
  `Precio_ID` bigint(20) NOT NULL,
  `tarjeta_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Precio_ID`,`tarjeta_ID`),
  KEY `FK_PRECIO_TARJETA_tarjeta_ID` (`tarjeta_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `precio_tarjeta`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `COD` varchar(255) DEFAULT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `PROVEEDOR_ID` bigint(20) DEFAULT NULL,
  `PRECIO_ID` bigint(20) DEFAULT NULL,
  `UNIDAD_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PRODUCTO_PRECIO_ID` (`PRECIO_ID`),
  KEY `FK_PRODUCTO_PROVEEDOR_ID` (`PROVEEDOR_ID`),
  KEY `FK_PRODUCTO_UNIDAD_ID` (`UNIDAD_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=617 ;

--
-- Volcar la base de datos para la tabla `producto`
--

INSERT INTO `producto` (`ID`, `COD`, `DESCRIPCION`, `PROVEEDOR_ID`, `PRECIO_ID`, `UNIDAD_ID`) VALUES
(1, '7792216200130', '2K12 ARTE CUADRICULADO X 70HOJAS  ', 1, 1, 1),
(2, '7792216200123', '2K12 ARTE RAYADO X 70HOJAS  ', 1, 2, 1),
(3, '7792451122051', 'ACRILICO DELARTE AMARILLO NAPOLES X50CC N°05', 1, 3, 1),
(4, '7792451122181', 'ACRILICO DELARTE ROJO NAVIDEÑO X50CC  N°18', 1, 4, 1),
(5, '7792451122259', 'ACRILICO DELARTE ROSA X50CC N°25', 1, 5, 1),
(6, '7792451122365', 'ACRILICO DELARTE TURQUESA X50CC N°36', 1, 6, 1),
(7, '7792451122426', 'ACRILICO DELARTE VERDE FTALO X50CC N°42', 1, 7, 1),
(8, '4.666664040088E12', 'ACUARELA EZCO *12 COLORES CON PINCEL ', 1, 8, 1),
(9, '7.792833260548E12', 'ACUARELAS ALBA SETX12COLORES C/PINCEL', 1, 9, 1),
(10, '7.79270099699E12', 'ALMOAHADILLA METALICA N 1 ', 1, 10, 1),
(11, '6933796880263E12', 'ALMOHADON CARA ', 1, 11, 1),
(12, '6.9337968643E12', 'ALMOHADON CORAZON ', 1, 12, 1),
(13, '7.7981383855092E13', 'BIBLIORATO A4 ', 1, 13, 1),
(14, '4.006093463254E12', 'BIBLIORATO A4 AMARILLA ', 1, 14, 1),
(15, '4.006093463216E12', 'BIBLIORATO A4 AZUL ', 1, 15, 1),
(16, '4.006093463278E12', 'BIBLIORATO A4 NEGRO ', 1, 16, 1),
(17, '4.00609346323E12', 'BIBLIORATO A4 ROJA ', 1, 17, 1),
(18, '4.006093463247E12', 'BIBLIORATO A4 VERDE ', 1, 18, 1),
(19, '7.798180880132E12', 'BIBLIORATO N3', 1, 19, 1),
(20, '7.79823835685E11', 'BIBLIORATO OFFICIO ', 1, 20, 1),
(21, '4.0060934630035E13', 'BIBLIORATO OFICIO NEGRO ', 1, 21, 1),
(22, '4.006093463032E12', 'BIBLIORATO OFICIO ROJO ', 1, 22, 1),
(23, '4.006093463049E12', 'BIBLIORATO OFICIO VERDE', 1, 23, 1),
(24, '4.006093463116E12', 'BIBLIORATO OFICIO VIOLETA ', 1, 24, 1),
(25, '7.794718424502E12', 'BLOCK A4 COLLAGUE XXI CUADRICULADO ', 1, 25, 1),
(26, '7.794788111005E12', 'BLOCK A5 LISO ', 1, 26, 1),
(27, '7.798152011687E12', 'BLOCK CAMPEON A4 LISO ', 1, 27, 1),
(28, '7.807210004971E12', 'BLOCK DIBUJO INFANTIL A4', 1, 28, 1),
(29, '7.792216156284E12', 'BLOCK DIBUJO NENE A4', 1, 29, 1),
(30, '7.798026120279E12', 'BLOCK ESQUELA NOR PAC ', 1, 30, 1),
(31, '7.791762486333E12', 'BLOCK ÉXITO *24 HOJAS CUADRICULADO ', 1, 31, 1),
(32, '7.791762486036E12', 'BLOCK ÉXITO *24 HOJAS RAYADO ', 1, 32, 1),
(33, '7.791762486371E12', 'BLOCK ÉXITO *48 HOJAS CUADRICULADO ', 1, 33, 1),
(34, '0.0', 'BLOCK ÉXITO *48 HOJAS RAYADO', 1, 34, 1),
(35, '7.791762486487E12', 'BLOCK ÉXITO *480 HOJAS CUADRICULADO ', 1, 35, 1),
(36, '7.791762400377E12', 'BLOCK EXITO A4 *48 HOJAS CUADRICULADO ', 1, 36, 1),
(37, '7.791762181375E12', 'BLOCK GLORIA *48 CUADRICULADO ', 1, 37, 1),
(38, '7.791762181078E12', 'BLOCK GLORIA *48 RAYADO ', 1, 38, 1),
(39, '7.791762181122E12', 'BLOCK GLORIA *96 RAYADO ', 1, 39, 1),
(40, '7.792216041603E12', 'BLOCK RIVADAVIA *24 HOJAS RAYADO ', 1, 40, 1),
(41, '7.792216041771E12', 'BLOCK RIVADAVIA *48 HOJAS CUADRICULADO ', 1, 41, 1),
(42, '7.792216041764E12', 'BLOCK RIVADAVIA *48HOJAS RAYADAS ', 1, 42, 1),
(43, '7.792216041795E12', 'BLOCK RIVADAVIA *96 HOJAS CUADRICULADO ', 1, 43, 1),
(44, '7.792216041788E12', 'BLOCK RIVADAVIA *96 HOJAS RAYADAS ', 1, 44, 1),
(45, '7.7922160419E12', 'BLOCK RIVADAVIA *A4 CUADRICULADO', 1, 45, 1),
(46, '7.792216041894E12', 'BLOCK RIVADAVIA *A4 RAYADO', 1, 46, 1),
(47, '7.792216041849E12', 'BLOCK RIVADAVIA 480 HOJAS RAYADAS ', 1, 47, 1),
(48, '2.666662010078E12', 'BOLIGRAFO GEL METALIC EZCO', 1, 48, 1),
(49, '2.666662010054E12', 'BOLIGRAFOS GEL CON GLITTER  EZCO BLISTER X 10 ', 1, 49, 1),
(50, '25', 'LAPICERA NEON GEL A PLUS TURQUESA', 1, 50, 1),
(51, '7.798109600049E12', 'BOLSA GLOBO BLANCO X 50 ', 1, 51, 1),
(52, '6.923794464022E12', 'CAJA  ARCHIVO POLIPROPILENO A4 2CM TRANSPARENTE', 1, 52, 1),
(53, '5.993102118092E12', 'CAJA DE REGALO X 4 PZA.ROJO LUNARES CUADRADO', 1, 53, 1),
(54, '5.993102114254E12', 'CAJA DE REGALO X 4 PZA.ROSA LUNARES REDONDO', 1, 54, 1),
(55, '5.993102105641E12', 'CAJA DE REGALOS X 2 PZA CORAZON ', 1, 55, 1),
(56, '5.993102116791E12', 'CAJA DE REGALOS X 3 PZA BUHO ', 1, 56, 1),
(57, '5.993102114247E12', 'CAJA DE REGALOS X 4 PZA . LILA RAYADO REDONDO ', 1, 57, 1),
(58, '5.993102101438E12', 'CAJA DE REGALOS X3 PZA MANDALAS ', 1, 58, 1),
(59, '4.971850137931E12', 'CALCULADORA CASIO FX-82MS', 1, 59, 1),
(60, '6.92562543358E12', 'CALCULADORA ECAL TC 44', 1, 60, 1),
(61, '6.932177467666E12', 'CALCULADORA ECAL TC 46', 1, 61, 1),
(62, '6.925625440236E12', 'CALCULADORA ECAL TC 49', 1, 62, 1),
(63, '6.925625430411E12', 'CALCULADORA ECAL TC28', 1, 63, 1),
(64, '6.925625430435E12', 'CALCULADORA ECAL TC30', 1, 64, 1),
(65, '6.925625431111E12', 'CALCULADORA ECAL TC32', 1, 65, 1),
(66, '6.93217746742E12', 'CALCULADORA ECAL TC35', 1, 66, 1),
(67, '6.932177465037E12', 'CALCULADORA ECAL TC36', 1, 67, 1),
(68, '6.926950223143E12', 'CALCULADORA ECAL TC37', 1, 68, 1),
(69, '6.932177472875E12', 'CALCULADORA ECAL TC40', 1, 69, 1),
(70, '6.932177467017E12', 'CALCULADORA ECAL TC82 CIENTIFICA', 1, 70, 1),
(71, '6.932177467598E12', 'CALCULADORA ECLA TC34', 1, 71, 1),
(72, '7.797456030684E12', 'CANOPLA COCACOLA', 1, 72, 1),
(73, '6.190094030053E12', 'CANOPLA COLLEGE', 1, 73, 1),
(74, '7.797456032992E12', 'CANOPLA LONA MUAA VARIOS COLORES', 1, 74, 1),
(75, '7.798174181023E12', 'CANOPLA SOBRE LISO', 1, 75, 1),
(76, '7.807265015069E12', 'CARPETA CON ELASTICO N° 5', 1, 76, 1),
(77, '7.794765001756E12', 'CARPETA ESPIRAL, ROSA', 1, 77, 1),
(78, '7.794765000124E12', 'CARPETA FIBRA NEGRA C/CORDON N° 6', 1, 78, 1),
(79, '7.798138387393E12', 'CARPETA LEGAJO A4', 1, 79, 1),
(80, '7.794765000117E12', 'CARPETA N° 5 F/N ', 1, 80, 1),
(81, '6.190098014011E12', 'CARPETA N3 TELA VARIOS MOTIVOS', 1, 81, 1),
(82, '6.923794403106E12', 'CARPETA PVC A4 LAMA OFICCE', 1, 82, 1),
(83, '6.9237944644022E13', 'CARPETA PVC GUARDA ARCHIVOS A4', 1, 83, 1),
(84, '7.798138385184E12', 'CARPETA PVC OFICIO GENERAL OFICCE', 1, 84, 1),
(85, '6.923794472027E12', 'CARPETA SEPARA ARCHIVOS A4', 1, 85, 1),
(86, '6.923794492025E12', 'CARPETA SEPARA ARCHIVOS OF', 1, 86, 1),
(87, '6.923794410104E12', 'CARPETAS CON FOLIOS A4 X10', 1, 87, 1),
(88, '6.923794410203E12', 'CARPETAS CON FOLIOS A4 X20', 1, 88, 1),
(89, '6.923794410401E12', 'CARPETAS CON FOLIOS A4 X40', 1, 89, 1),
(90, '6.923794410609E12', 'CARPETAS CON FOLIOS A4 X60', 1, 90, 1),
(91, '6.923794430102E12', 'CARPETAS CON FOLIOS OFICIO X10', 1, 91, 1),
(92, '2.000074587146E12', 'CARTON CORRUGADO COLORES VARIOS ', 1, 92, 1),
(93, '7.792564003018E12', 'CARTULINA COLORES VARIOS ', 1, 93, 1),
(94, '7.791911266014E12', 'CARTULINA FANTASIA ', 1, 94, 1),
(95, '1.7796893021863E13', 'CARTULINA METALIZADA', 1, 95, 1),
(96, '7.792700995023E12', 'CD ', 1, 96, 1),
(97, '7.50101521013E12', 'CERA PARA CONTAR', 1, 97, 1),
(98, '707610078031212', 'CINTA ADHESIVA TRANSPARENTE COLLEGE XXI 12MMX10MTS', 1, 98, 1),
(99, '2000761077639', 'CINTA EMPAQUE AUPACK AMARILLO 48MM X50MTS', 1, 99, 1),
(100, '2000761077622', 'CINTA EMPAQUE AUPACK AZUL 48MM X 50MT. ', 1, 100, 1),
(101, '2000761077646', 'CINTA EMPAQUE AUPACK NARANJA 48MM X 50MT.', 1, 101, 1),
(102, '2000761077653', 'CINTA EMPAQUE AUPACK ROJO 48MM X 50MT. ', 1, 102, 1),
(103, '2000761077660', 'CINTA EMPAQUE AUPACK VERDE 48MM X 50MT.', 1, 103, 1),
(104, '2000761077615', 'CINTA EMPAQUE AUPACK BLANCO 48MM X50MTS', 1, 104, 1),
(105, '7792971000105', 'CINTA ADHESIVA DE PAPEL STIKO 12MMX50MTS', 1, 105, 1),
(106, '2000761077510', 'CINTA EMPAQUE FRAGIL 48MM X50MTS', 1, 106, 1),
(107, '4006381333887', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 BORDO', 1, 107, 1),
(108, '6', 'MICROFIBRA PAPER MATE FLAIR UF ROJA', 1, 108, 1),
(109, '3.154145369557E12', 'COMPAS METAL OPEN  MAPED ', 1, 109, 1),
(110, '3.154141194504E12', 'COMPAS STUDY  MAPED ', 1, 110, 1),
(111, '7795245153026', 'CINTA CORRECTORA MICRO PAPER MATE 5MMX8.5MTS', 1, 111, 1),
(112, '29', 'TRANSPORTADOR MAPED', 1, 112, 1),
(113, '7.790066700057E12', 'CRAYONES JOVI X 12|', 1, 113, 1),
(114, '3.154148620112E12', 'CRAYONES MAPED X 12|', 1, 114, 1),
(115, '7.798112830112E12', 'CRAYONES NX 6 SEÑORITA', 1, 115, 1),
(116, '7.792216050414E12', 'CUADERNO A4 (ABC) RIV. *100 CUADRICULADO ', 1, 116, 1),
(117, '7.792216050407E12', 'CUADERNO A4 (ABC) RIV. *100 RAYADO ', 1, 117, 1),
(118, '7.794788126276E12', 'CUADERNO A4 CUADRICULADO *80 COLLEGUE ', 1, 118, 1),
(119, '7794153771865', 'CUADERNO A4 LIDER CUADRICULADO ', 1, 119, 1),
(120, '7794153771834', 'CUADERNO A4 LIDER RAYADO ', 1, 120, 1),
(121, '7.794788116277E12', 'CUADERNO A4 RAYADO *80 COLLEGUE ', 1, 121, 1),
(122, '7.79221635752E12', 'CUADERNO ABC 19*23,5 AMARILLO ', 1, 122, 1),
(123, '7.792216357988E12', 'CUADERNO ABC 19*23,5 AZUL ', 1, 123, 1),
(124, '7.792216357537E12', 'CUADERNO ABC 19*23,5 CELESTE', 1, 124, 1),
(125, '7.792216357452E12', 'CUADERNO ABC 19*23,5 LILA ', 1, 125, 1),
(126, '7.792216357506E12', 'CUADERNO ABC 19*23,5 NARANJA ', 1, 126, 1),
(127, '7.792216357971E12', 'CUADERNO ABC 19*23,5 ROJO ', 1, 127, 1),
(128, '7.792216357629E12', 'CUADERNO ABC 19*23,5 ROSA ', 1, 128, 1),
(129, '7.792216357407E12', 'CUADERNO ABC CALIGRAFIA ', 1, 129, 1),
(130, '7.798138388215E12', 'CUADERNO COLLEGUE XXI 16*21 40 HOJAS', 1, 130, 1),
(131, '7.794788126283E12', 'CUADERNO COLLEGUE XXI 16*21 80 HOJAS', 1, 131, 1),
(132, '7.791762433504E12', 'CUADERNO CUADRICULADO LEDESMA CLASSIC 120', 1, 132, 1),
(133, '7.791762427671E12', 'CUADERNO ÉXITO 48 HOJAS 160 X 210', 1, 133, 1),
(134, '7.791762110375E12', 'CUADERNO GLORIA X48H', 1, 134, 1),
(135, '7.79478811105E12', 'CUADERNO MONITOR X24H ', 1, 135, 1),
(136, '7.798166462284E12', 'CUADERNO RAYADO 80 HJ A4 AFA', 1, 136, 1),
(137, '7.798124645469E12', 'CUADERNO RAYADO 80 HJ A4 KEVINGSOTON/DAKAR/', 1, 137, 1),
(138, '7.792216155362E12', 'CUADERNO RIV. *98 RAYADO AZUL ', 1, 138, 1),
(139, '7.792216155379E12', 'CUADERNO RIV. *98 RAYADO ROJO ', 1, 139, 1),
(140, '7.792216155386E12', 'CUADERNO RIV. *98 RAYADO VERDE ', 1, 140, 1),
(141, '7.792216359081E12', 'CUADERNO RIV. CUADRICULADO A4 POR 60', 1, 141, 1),
(142, '7.792216367048E12', 'CUADERNO RIV. LUNARES AMARILLO ', 1, 142, 1),
(143, '7.792216367062E12', 'CUADERNO RIV. LUNARES CELESTE ', 1, 143, 1),
(144, '7.792216367079E12', 'CUADERNO RIV. LUNARES LILA ', 1, 144, 1),
(145, '7.792216367031E12', 'CUADERNO RIV. LUNARES NARANJA ', 1, 145, 1),
(146, '7.792216367024E12', 'CUADERNO RIV. LUNARES VERDE', 1, 146, 1),
(147, '7.792216155591E12', 'CUADERNO RIVADAVIA EDUC.INICIAL T/CARTON 42 HJ.', 1, 147, 1),
(148, '7.794153786029E12', 'CUADERNO VIOLETA 48 HOJAS', 1, 148, 1),
(149, '2.005057106017E12', 'CUTER CHICOS', 1, 149, 1),
(150, '3.154140922115E12', 'CUTTER MAPED ', 1, 150, 1),
(151, '7.501015222898E12', 'DETECTOR BILLETES ', 1, 151, 1),
(152, '9.789706070104E12', 'DICCIONARIO BASICO ESCOLAR LAROUSSE', 1, 152, 1),
(153, '9.789706070098E12', 'DICCIONARIO BASICO ESCOLAR LENGUA ESPAÑOLA LAROUSSE', 1, 153, 1),
(154, '9.78970607399E12', 'DICCIONARIO INGLES LAROUSSE', 1, 154, 1),
(155, '9.789702200277E12', 'DICCIONARIO SINONIMOS Y ANTONIMO LAROUSSE', 1, 155, 1),
(156, '7.792700004251E12', 'DVDS VIRGEN ', 1, 156, 1),
(157, '7.798039620087E12', 'ETIQ.PEGASOLA VARIOS MM (TAMAÑOS)', 1, 157, 1),
(158, '7.94360016711E11', 'FIBRAS FABERCITO', 1, 158, 1),
(159, '7.798143390456E12', 'FUNDA P/CUADERNO C/ESPIRAL PAQ.X12', 1, 159, 1),
(160, '7.798143391514E12', 'FUNDA P/CUADERNO VARIOS COLORES', 1, 160, 1),
(161, '9.556089882309E12', 'GOMA DE LAPIZ & LAPICERA -FABER CASTELL ', 1, 161, 1),
(162, '3.154145112405E12', 'GOMA DE LAPIZ DOMINO -MAPED ', 1, 162, 1),
(163, '7.798061841511E12', 'GOMA EVA CORCHO ', 1, 163, 1),
(164, '7.898448312051E12', 'GOMA EVA DISTINTOS COLORES ', 1, 164, 1),
(165, '9.556089886307E12', 'GOMA -FABER CASTEL ', 1, 165, 1),
(166, '3.154141194184E12', 'SET GEOMETRIA MAPED 8 PIEZAS', 1, 166, 1),
(167, '7.792700665223E12', 'GOMA PARA LAPIZ -PELIKAN', 1, 167, 1),
(168, '1.3154145015E13', 'GOMATIP TOP -MAPED ', 1, 168, 1),
(169, '7.798140900122E12', 'GOMILLAS - BANDUN', 1, 169, 1),
(170, '7.798031959079E12', 'LAMINAS N° 5 MUNDO CARTOGRAFICO VARIOS', 1, 170, 1),
(171, '7.793198143125E12', 'LAPICES MECANICOS PIZZINI 1431F 0,5', 1, 171, 1),
(172, '7.793198147727E12', 'LAPICES MECANICOS PIZZINI 1477F 0,5', 1, 172, 1),
(173, '7.793198143828E12', 'LAPICES MECANICOS PIZZINI 1438F 0,7', 1, 173, 1),
(174, '7.793198143514E12', 'LAPICES MECANICOS PIZZINI 1435R 0,5', 1, 174, 1),
(175, '7.792700000857E12', 'LAPICES DE MARCAR PELIKAN', 1, 175, 1),
(176, '7.891360545637E12', 'LAPIZ COLOR ACUARELABLES X12', 1, 176, 1),
(177, '7.798138385405E12', 'LAPIZ COLOR COLLEGUE XXI X24', 1, 177, 1),
(178, '7.798138385245E12', 'LAPIZ COLOR CORTOS RAZOS ', 1, 178, 1),
(179, '6.921560067965E12', 'LAPIZ COLOR EZCO X12', 1, 179, 1),
(180, '7.891360577713E12', 'LAPIZ COLOR FABER CASTEL ', 1, 180, 1),
(181, '7.891360533016E12', 'LAPIZ COLOR FABER CASTEL X12', 1, 181, 1),
(182, '7.891360545675E12', 'LAPIZ COLOR FABER CASTEL X24', 1, 182, 1),
(183, '6.94203645683E12', 'LAPICERA EASYCLICKER RETRACTABLE', 1, 183, 1),
(184, '3.154148360117E12', 'LAPIZ COLOR MAPED COLOR PEPS ', 1, 184, 1),
(185, '7.792700002714E12', 'LAPIZ COLOR PELIKAN JUMBO ANCHO ', 1, 185, 1),
(186, '9.2626394052E10', 'LAPICERA GLITZY PEN CHICA', 1, 186, 1),
(187, '6.924934711044E12', 'LAPIZ EZCO  C/GOMA', 1, 187, 1),
(188, '9', 'MICROFIBRA EDDING OFFICE LINER 39 AMARILLO', 1, 188, 1),
(189, '4715709320231', 'LAPIZ CORRECTOR  COLLEGE 10 ML', 1, 189, 1),
(190, '4006381333801', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 TURQUESA', 1, 190, 1),
(191, '5', 'LAPICERA GENERAL OFFICE L5 FINO AZUL', 1, 191, 1),
(192, '7', 'MICROFIBRA PAPER MATE FLAIR UF VERDE ', 1, 192, 1),
(193, '7795245153019', 'CINTA CORRECTORA PAPER MATE DRYLINE EXTRA LONG', 1, 193, 1),
(194, '4716493732323', 'LAPIZ CORRECTOR FABER CASTELL 8ML', 1, 194, 1),
(195, '7.891360326786E12', 'LAPIZ FABER CASTEL CORTOS X6', 1, 195, 1),
(196, '3.154148500216E12', 'LAPIZ MAPED CASCARA NARANJA ', 1, 196, 1),
(197, '11209.0', 'LAPIZ NEGRO BIC EVOLUCION ', 1, 197, 1),
(198, '4.00540112502E12', 'LAPIZ NEGRO GOLD FABER 2B', 1, 198, 1),
(199, '4.005401125129E12', 'LAPIZ NEGRO GOLD FABER 2H', 1, 199, 1),
(200, '4.005401125037E12', 'LAPIZ NEGRO GOLD FABER 3B', 1, 200, 1),
(201, '4.005401125136E12', 'LAPIZ NEGRO GOLD FABER 3H', 1, 201, 1),
(202, '4.005401125044E12', 'LAPIZ NEGRO GOLD FABER 4B', 1, 202, 1),
(203, '4.005401125143E12', 'LAPIZ NEGRO GOLD FABER 4H', 1, 203, 1),
(204, '4.005401125051E12', 'LAPIZ NEGRO GOLD FABER 5B', 1, 204, 1),
(205, '4.005401125068E12', 'LAPIZ NEGRO GOLD FABER 6B', 1, 205, 1),
(206, '4.005401125013E12', 'LAPIZ NEGRO GOLD FABER B', 1, 206, 1),
(207, '4.005401125112E12', 'LAPIZ NEGRO GOLD FABER H ', 1, 207, 1),
(208, '4.005404125006E12', 'LAPIZ NEGRO GOLD FABER HB', 1, 208, 1),
(209, '6.951572903548E12', 'LAPIZ PAPER MATE CORTOS X12', 1, 209, 1),
(210, '7.795245104059E12', 'LAPIZ PAPER MATE NEON ', 1, 210, 1),
(211, '7.798126040477E12', 'MAPA ALFA CATAMARCA P N°3', 1, 211, 1),
(212, '2.000296224027E12', 'MAPA ALFA PLANISFERIO N°3', 1, 212, 1),
(213, '7.798126040279E12', 'MAPA COLLAGE AMERICA DEL NORTE N°3', 1, 213, 1),
(214, '7.798126040231E12', 'MAPA COLLAGE AMERICA DEL SUR N°3', 1, 214, 1),
(215, '7.798126040323E12', 'MAPA COLLAGE OCEANIA P N° 3 ', 1, 215, 1),
(216, '7.798126040262E12', 'MAPA COLLAGE XXI N° 3 AFRICA', 1, 216, 1),
(217, '7.798126040108E12', 'MAPA COLLAGE XXI N° 3 AMERICA CONTORNO', 1, 217, 1),
(218, '7.798126040194E12', 'MAPA COLLAGE XXI N° 3 ARGENTINA', 1, 218, 1),
(219, '7.798126040545E12', 'MAPA COLLAGE XXI N° 3 ARGENTINA FP', 1, 219, 1),
(220, '7.798126040248E12', 'MAPA COLLAGE XXI N° 3 ASIA', 1, 220, 1),
(221, '7.798126040316E12', 'MAPA COLLAGE XXI N° 3 CORDOBA P', 1, 221, 1),
(222, '7.798126040576E12', 'MAPA COLLAGE XXI N° 3 EUROPA FP', 1, 222, 1),
(223, '7.798126040224E12', 'MAPA COLLAGE XXI N° 3 EUROPA P', 1, 223, 1),
(224, '7.798126040552E12', 'MAPA COLLAGE XXI N° 3 PLANISFERIO FP', 1, 224, 1),
(225, '7.798126040023E12', 'MAPA COLLAGE XXI N° 3 REGION MESOPOTANICA', 1, 225, 1),
(226, '7.798126040811E12', 'MAPA COLLAGE XXI N° 5 AMERICA FP', 1, 226, 1),
(227, '7.798126040804E12', 'MAPA COLLAGE XXI N° 5 ARGENTINA FP', 1, 227, 1),
(228, '7.798126040651E12', 'MAPA COLLAGE XXI N° 5 PLANISFERIO P', 1, 228, 1),
(229, '9.557007170003E12', 'MARCADOR BICOLOR FABER CASTELL ', 1, 229, 1),
(230, '7.798000084146E12', 'MARCADOR DE COLOR SIMBALL ', 1, 230, 1),
(231, '7.796568961015E12', 'MARCADOR EDDING 160 AZUL', 1, 231, 1),
(232, '7.796568961008E12', 'MARCADOR EDDING 160 ROJA ', 1, 232, 1),
(233, '7.796568961022E12', 'MARCADOR EDDING 160 VERDE ', 1, 233, 1),
(234, '7.501015215203E12', 'MARCADOR PELIKAN  X 12', 1, 234, 1),
(235, '7.501015213735E12', 'MARCADOR PELIKAN 440 NEGRO ', 1, 235, 1),
(236, '4.012700995179E12', 'MARCADOR PELIKAN P/PIZARRA AZUL 442', 1, 236, 1),
(237, '4.012700995162E12', 'MARCADOR PELIKAN P/PIZARRA NEGRO 442', 1, 237, 1),
(238, '4.012700995186E12', 'MARCADOR PELIKAN P/PIZARRA VERDE 442', 1, 238, 1),
(239, '4.012700995193E12', 'MARCADOR PELIKAN P/POZARRA ROJO 442', 1, 239, 1),
(240, '7.790578665222E12', 'MARCADOR TRABI 411 PERMANENT.P.RED.NEGRO', 1, 240, 1),
(241, '7.754111649308E12', 'MICROFIBRA GRIP FABER CASTELL X10', 1, 241, 1),
(242, '9.2626425565E10', 'MOCHILA AVENGERS', 1, 242, 1),
(243, '6.190010012019E12', 'MOCHILA COLLEGUE XXI A CUADROS ', 1, 243, 1),
(244, '6.190010012002E12', 'MOCHILA COLLEGUE XXI AZUL ', 1, 244, 1),
(245, '9.2626416518E10', 'MOCHILA DE VIOLETTA NEGRA CON ROSA ', 1, 245, 1),
(246, '7.453002791453E12', 'MOCHILA FROZEN NENA ', 1, 246, 1),
(247, '6.190091263027E12', 'MOCHILA FUN CAMUFLADA MUJER ', 1, 247, 1),
(248, '6.190091263065E12', 'MOCHILA FUN NARANJA CON AZUL ', 1, 248, 1),
(249, '6.190091263072E12', 'MOCHILA FUN NARANJA CON AZUL ', 1, 249, 1),
(250, '6.48335955727E11', 'MOCHILA JANSPORT AZUL ', 1, 250, 1),
(251, '7.66182156354E11', 'MOCHILA JANSPORT CELESTE Y GRIS', 1, 251, 1),
(252, '5.3329261256E10', 'MOCHILA JANSPORT ROJA ', 1, 252, 1),
(253, '7.792621046392E12', 'MOCHILA KITTY 3D ', 1, 253, 1),
(254, '7.792621046569E12', 'MOCHILA KITTY CARRITO', 1, 254, 1),
(255, '6.190094253025E12', 'MOCHILA LSD CARRO ', 1, 255, 1),
(256, '6.190010017014E12', 'MOCHILA LSD GRIS A CUADROS', 1, 256, 1),
(257, '7.453002791606E12', 'MOCHILA MI VILLANO FAVORITO CARRO GRANDE ', 1, 257, 1),
(258, '9.2626435854E10', 'MOCHILA MOSTER HINGH ', 1, 258, 1),
(259, '4.008110471082E12', 'MOCHILA TURBO SPEED AZUL TIPO BALIJA ', 1, 259, 1),
(260, '9.2626416556E10', 'MOCHILA VIOLETTA ROSA GRANDE ', 1, 260, 1),
(261, '7.506235525552E12', 'MOCHILA WILSON AZUL ', 1, 261, 1),
(262, '2.120052077E9', 'NOTAS AUTOADHESIVAS NOTE FIX', 1, 262, 1),
(263, '7.501015215302E12', 'NOTAS AUTOADHESIVAS PELIKAN ', 1, 263, 1),
(264, '7.793198125756E12', 'NOTAS AUTOADHESIVAS PIZZINI ', 1, 264, 1),
(265, '7.796893000021E12', 'NOTAS LUMA', 1, 265, 1),
(266, '4.012700200211E12', 'NOTES PELIKAN ', 1, 266, 1),
(267, '7807265980442', 'PALITOS HELADO COLORES PROARTE PAQ.X50', 1, 267, 1),
(268, '4004764286386', 'PALITOS HELADO NATURAL PROARTE PAQ.X50', 1, 268, 1),
(269, '2.001045505749E12', 'PAÑUELOS HOMBRE ', 1, 269, 1),
(270, '2.000237252195E12', 'PAPEL BARRILETE COLORES VARIOS ', 1, 270, 1),
(271, '7.798006801198E12', 'PAPEL CREPPE FANTASIA ', 1, 271, 1),
(272, '7.000072255134E12', 'PAPEL CREPPE VARIOS COLORES ', 1, 272, 1),
(273, '7.792216001973E12', 'PAPEL DE CALCAR N3 MIGUEL ANGEL ', 1, 273, 1),
(274, '7.792216041498E12', 'PAPEL DE CALCAR N5 MIGUEL ANGEL ', 1, 274, 1),
(275, '2.000035258245E12', 'PAPEL FELPINA VARIOS COLORES ', 1, 275, 1),
(276, '7796893000076', 'PAPEL GLACÉ LIMA - LUSTRE', 1, 276, 1),
(277, '7796893000113', 'PAPEL GLASCÉ LUMA - METALIZADO  ', 1, 277, 1),
(278, '2.000231292982E12', 'PAPEL VEGETAL 35 X 50/ 145GS', 1, 278, 1),
(279, '2.000231292357E12', 'PAPEL VEGETAL 50 X 70 /90GS', 1, 279, 1),
(280, '7501015224892', 'COLA GLITTER PELIKAN X60 ML AZUL REY ', 1, 280, 1),
(281, '7501015225011', 'COLA GLITTER PELIKAN X60ML AZUL PASTEL ', 1, 281, 1),
(282, '7501015224953', 'COLA GLITTER PELIKAN X60 ML AMARILLO CLARO', 1, 282, 1),
(283, '7501015224984', 'COLA GLITTER PELIKAN X60 ML LILA', 1, 283, 1),
(284, '7501015224946', 'COLA GLITTER PELIKAN X60 ML MORADO', 1, 284, 1),
(285, '7501015225042', 'COLA GLITTER PELIKAN X60 ML MULTICOLOR', 1, 285, 1),
(286, '7501015224960', 'COLA GLITTER PELIKAN X60 ML NARANJA', 1, 286, 1),
(287, '7501015225028', 'COLA GLITTER PELIKAN X60 ML NEGRO ', 1, 287, 1),
(288, '7501015224885', 'COLA GLITTER PELIKAN X60 ML ORO', 1, 288, 1),
(289, '7501015224878', 'COLA GLITTER PELIKAN X60 ML PERLA ', 1, 289, 1),
(290, '7501015224854', 'COLA GLITTER PELIKAN X60 ML PLATA ', 1, 290, 1),
(291, '7501015224847', 'COLA GLITTER PELIKAN X60 ML ROJO ', 1, 291, 1),
(292, '7501015224977', 'COLA GLITTER PELIKAN X60 ML ROSA MEXICANO', 1, 292, 1),
(293, '7501015224991', 'COLA GLITTER PELIKAN X60 ML TURQUESA', 1, 293, 1),
(294, '7501015224861', 'COLA GLITTER PELIKAN X60 ML VERDE BANDERA ', 1, 294, 1),
(295, '7501015224939', 'COLA GLITTER PELIKAN X60 ML VERDE LIMON ', 1, 295, 1),
(296, '2.3942440505E10', 'PENDRIVE 16 GB', 1, 296, 1),
(297, '2.3942974086E10', 'PENDRIVE 32GB', 1, 297, 1),
(298, '2.3942970873E10', 'PENDRIVE 4GB', 1, 298, 1),
(299, '7.896292293045E12', 'PLACA ACRILICO ACRIMET  T/OFICIO', 1, 299, 1),
(300, '7.896292292031E12', 'PLACA ACRILICO ACRIMET ESQUELA', 1, 300, 1),
(301, '7794851003015', 'PINTURA LAVABLE PLASTICOLA CONFETTI - MULTICOLOR X38G', 1, 301, 1),
(302, '7794851001752', 'PINTURA LAVABLE PLASTICOLA GLITTER - AZUL X38G', 1, 302, 1),
(303, '7794851001806', 'PINTURA LAVABLE PLASTICOLA GLITTER - VERDE X38G', 1, 303, 1),
(304, '7794851002957', 'PINTURA LAVABLE PLASTICOLA GLITTER - MORADO X38G', 1, 304, 1),
(305, '7794851001783', 'PINTURA LAVABLE PLASTICOLA GLITTER - PLATA X38G', 1, 305, 1),
(306, '7794851002995', 'PINTURA LAVABLE PLASTICOLA GLITTER - LADRILLO X38G', 1, 306, 1),
(307, '7.794757276605E12', 'PLASTILINA COLLAGE COLORES VARIOS', 1, 307, 1),
(308, '7.794757273208E12', 'PLASTILINA MAPED COLORES VARIOS', 1, 308, 1),
(309, '7.807265022234E12', 'REPUESTO CUCHILLO CHICO  X 10', 1, 309, 1),
(310, '7.807265980152E12', 'REPUESTO CUCHILLO GRANDE  X 10', 1, 310, 1),
(311, '7.000337352035E12', 'REPUESTO DE DIBUJO N° 3 BLANCO', 1, 311, 1),
(312, '7.000337352066E12', 'REPUESTO DE DIBUJO N° 5 BLANCO', 1, 312, 1),
(313, '7.791762480614E12', 'REPUESTO DE DIBUJO N° 5 SURTIDO', 1, 313, 1),
(314, '7.79689300111E12', 'REPUESTO DE DIBUJO N° 6 BLANCO LUMA', 1, 314, 1),
(315, '7.792216002079E12', 'REPUESTO DE DIBUJO N° 6 SURTIDO MIGUEL ANGEL', 1, 315, 1),
(316, '7.792216002017E12', 'REPUESTO MIGUEL ANGEL NEGRO ', 1, 316, 1),
(317, '7.792216042112E12', 'REPUESTO RIVADAVIA DE CALIGRAFIA INCLINACIÓN 11', 1, 317, 1),
(318, '7.792216531012E12', 'REPUESTO RIVADAVIA DE CALIGRAFIA INCLINACIÓN 12', 1, 318, 1),
(319, '7.79221604244E12', 'REPUESTO RIVADAVIA DE MUSICA ', 1, 319, 1),
(320, '7.792216041955E12', 'REPUESTO RIVADAVIA RAYADO N5', 1, 320, 1),
(321, '7.501015213568E12', 'RESALTADOR 414 AMARILLO ', 1, 321, 1),
(322, '7.501015213551E12', 'RESALTADOR 414 NARANJA ', 1, 322, 1),
(323, '7.501015213582E12', 'RESALTADOR 414 TURQUESA', 1, 323, 1),
(324, '7.501015213575E12', 'RESALTADOR 414 VERDE', 1, 324, 1),
(325, '7.792540230841E12', 'RESMA A4 AUTOR 80GS', 1, 325, 1),
(326, '7.792540231213E12', 'RESMA OFICIO AUTOR 75GS', 1, 326, 1),
(327, '7.793198125022E12', 'SEÑALADORES MULTICOLOR -PIZZINI ', 1, 327, 1),
(328, '2.000354626701E12', 'SEPARADORES DE MATERIA N° 5 GLASS', 1, 328, 1),
(329, '7.798006802591E12', 'SEPARADORES DE MATERIAS NARANJA', 1, 329, 1),
(330, '7.798006808609E12', 'SEPARADORES DE MATERIAS SURTIDO', 1, 330, 1),
(331, '7.798107220218E12', 'TABLA PERIODICA DE LOS ELEMENTOS-PAQ.X10', 1, 331, 1),
(332, '7.794765003439E12', 'TAPA CARPETA CARTON N3 FANTASIA ', 1, 332, 1),
(333, '7.798026122396E12', 'TARJETAS N3', 1, 333, 1),
(334, '7798138386143', 'TEMPERA COLLEGE  NEGRO 250 G', 1, 334, 1),
(335, '2000099451750', 'TEMPERA COLLEGE AMARILLO 250 G', 1, 335, 1),
(336, '7798138386259', 'TEMPERA COLLEGE AZUL 250G ', 1, 336, 1),
(337, '2000099451156', 'TEMPERA COLLEGE BLANCO 250G ', 1, 337, 1),
(338, '7798138386242', 'TEMPERA COLLEGE CELESTE 250G', 1, 338, 1),
(339, '2000099451187', 'TEMPERA COLLEGE MARRON 250G ', 1, 339, 1),
(340, '7798138386204', 'TEMPERA COLLEGE NARANJA 250G ', 1, 340, 1),
(341, '7798138386211', 'TEMPERA COLLEGE ROJO 250G', 1, 341, 1),
(342, '2000099451866', 'TEMPERA COLLEGE ROSA 250 G', 1, 342, 1),
(343, '2000099451521', 'TEMPERA COLLEGE VERDE  250G ', 1, 343, 1),
(344, '7798138386273', 'TEMPERA COLLEGE VIOLETA  250G', 1, 344, 1),
(345, '7.792700062008E12', 'TINTA CHINA ALA PERLA NEGRO ', 1, 345, 1),
(346, '7.796568103996E12', 'TINTA ECOLOGICA -EDDING VERDE ', 1, 346, 1),
(347, '7.792700640077E12', 'TINTA P / DIBUJO CARMIN ', 1, 347, 1),
(348, '7.792700996396E12', 'TINTA P /MARCADOR PELIKAN NEGRO AL AGUA', 1, 348, 1),
(349, '7.792700640046E12', 'TINTA P/ DIBUJO AZUL  MARINO ', 1, 349, 1),
(350, '7.7792700640121E13', 'TINTA P/ DIBUJO SEPIA ', 1, 350, 1),
(351, '7.0330809703E10', 'TINTA P/MARCADOR P/PIZARRA MARKING  BIC AZUL', 1, 351, 1),
(352, '7.792700996389E12', 'TINTA P/MARCADOR PELIKAN AZUL AL SOLVENTE', 1, 352, 1),
(353, '7.792700996372E12', 'TINTA P/MARCADOR PELIKAN VERDE AL AGUA ', 1, 353, 1),
(354, '7.790578034202E12', 'TINTA P/MARCADOR TRABI PARA PIZARRA BLANCA ', 1, 354, 1),
(355, '2.000296427053E12', 'TRANSPORTADOR PARA PIZARRON ', 1, 355, 1),
(356, '8887013702228', 'CINTA CORRECTORA CONSUL 5MMX6MTS', 1, 356, 1),
(357, '7.793198373263E12', 'ESCUADRA 30 CM', 1, 357, 1),
(358, '3.154142427939E12', 'KIT 3 PIEZAS GEOMETRICO', 1, 358, 1),
(359, '3.154140182113E12', 'CUTTER 18 MM MAPED', 1, 359, 1),
(360, '7.792533000796E12', 'CLIP NEGRO N° 1 SIFAP', 1, 360, 1),
(361, '7.792533145305E12', 'SET DE OFICINA CLIP PLASTICO Y METAL', 1, 361, 1),
(362, '7.798135148959E12', 'CUTTER KATANA 18MM', 1, 362, 1),
(363, '3.154140693008E12', 'TIJERA MAPED 3D -13 CM ', 1, 363, 1),
(364, '4.895054390179E12', 'TIJERA LOTUS 18CM', 1, 364, 1),
(365, '2.00510931366E12', 'SACABOCADO CON FORMAS  MEDIANO ', 1, 365, 1),
(366, '7.796568107352E12', 'ROTULADOR MARCADOR AL AGUA - EDDING 1200', 1, 366, 1),
(367, '7.798137697547E12', 'JOYSTICK NOGA NET C/ANALOGIO', 1, 367, 1),
(368, '2.0120426016E10', 'JOYSTICK SARK NET C/ANALOGIO', 1, 368, 1),
(369, '7.805500010121E12', 'ADHESIVO DE CONTACTO 60 AGOREX', 1, 369, 1),
(370, '7.7917188E7', 'ADHESIVO LA GOTITA', 1, 370, 1),
(371, '4.026700424256E12', 'ADHESIVO UHU', 1, 371, 1),
(372, '7.790400018585E12', 'ADHESIVO UNIPOX ', 1, 372, 1),
(373, '7.790400014525E12', 'ADHESIVO POXIPOL 10 MIN.', 1, 373, 1),
(374, '2.000097590352E12', 'MAQUILLAJE ARTISTICO', 1, 374, 1),
(375, '2.001647188548E12', 'BOLIGRAFO FSIA C/COLGANTE', 1, 375, 1),
(376, '6.401564922601E12', 'LAPICERA 10 COLORES', 1, 376, 1),
(377, '7.793198202051E12', 'MINAS PIZZINI 2 MM ', 1, 377, 1),
(378, '7.891360472407E12', 'MINAS FABER CASTELL  0,5 H', 1, 378, 1),
(379, '7.891360472742E12', 'MINAS FABER CASTELL 0,7  2B ', 1, 379, 1),
(380, '7.891360472728E12', 'MINAS FABER CASTELL 0,7 HB ', 1, 380, 1),
(381, '7.798138382923E12', 'BOLIGRAFO NEON EZCO X 5', 1, 381, 1),
(382, '8', 'MICROFIBRA EDDING OFFICE LINER 39 NEGRO', 1, 382, 1),
(383, '10', 'MICROFIBRA EDDING OFFICE LINER 39 VERDE', 1, 383, 1),
(384, '4.004764810819E12', 'EDDING 791 PAINT MARKER ', 1, 384, 1),
(385, '11', 'MICROFIBRA EDDING OFFICE LINER 39 CELESTE', 1, 385, 1),
(386, '3.086123264496E12', 'MARCADOR BIC MARKING ', 1, 386, 1),
(387, '00000001', 'FOTOCOPIAS', 1, 387, 1),
(388, '7796568108700', 'PRUEBA 01', 1, 388, 1),
(389, '3154142792105', 'REGLA FLEXIBLE', 1, 389, 1),
(390, '7792216002123', 'CUADERNO LAPRIDA 24 HOJAS CALIGRAFIA', 1, 390, 1),
(391, '070330183575', 'LAPICERA BIC CRISTAL FINA AZUL', 1, 391, 1),
(392, '2000296225017', 'MAPA N°5 AMERICA POLITICO ALFA ', 1, 392, 1),
(393, '7798126040668', 'MAPA COLLAGE XXI -ARGENTINA- POLITICO', 1, 393, 1),
(394, '7798126040200', 'MAPAS COLLAGE XXI PLANISFERIO -POLITICO', 1, 394, 1),
(395, '7798126040477', 'MAPAS COLLAGE XXI-CATAMARCA POLITICO N°3', 1, 395, 1),
(396, '7798126040248', 'MAPA COLLAGE XXI-ASIA-POLITICO N° 3', 1, 396, 1),
(397, '7798043560836', 'RESMA BOREAL A4 75G.', 1, 397, 2),
(398, '17792533002825', 'APRIETA PAPEL 50', 1, 398, 1),
(399, '17792533001042', 'APRIETA PAPEL 75', 1, 399, 1),
(400, '17792533002582', 'APRIETA PAPEL 40', 1, 400, 1),
(401, '7798138383272', 'BROCHES CLIPS 50MM ', 1, 401, 1),
(402, '7792533000710', 'CLIPS PLASTICO X20 UNID', 1, 402, 1),
(403, '7792533000727', 'CLIPS PLSTICOS X100 UNID ', 1, 403, 1),
(404, '7793876100143', 'SOBRE COLOR PLATA ', 1, 404, 1),
(405, '7793876100136', 'SOBRES DORADOS ', 1, 405, 1),
(406, '7798165262304', 'STICKERS MUNDO GATURRO', 1, 406, 1),
(407, '7798032572093', 'STICKERS CAMPANITA ', 1, 407, 1),
(408, '7798032572345', 'STICKERS OSITOS CARIÑOSOS', 1, 408, 1),
(409, '7798032570044', 'STICKERS SPIDERMAN ', 1, 409, 1),
(410, '7798032578316', 'STICKERS ESTRELAS ', 1, 410, 1),
(411, '2000422507147', 'STICKERS MINIE', 1, 411, 1),
(412, '7798032576510', 'STICKERS PRINCESAS ', 1, 412, 1),
(413, '7798032578248', 'STICKERS WINNIE POOH', 1, 413, 1),
(414, '7796907872989', 'MONEDERO CHENSON ', 1, 414, 1),
(415, '6190061006050', 'BILLETERA DAMA P/CARDIN ', 1, 415, 1),
(416, '6190095020015', 'CANDADO CHECK', 1, 416, 1),
(417, '6908312511303', 'VELA VERDE LUNARES BLANCOS ', 1, 417, 1),
(418, '6908312029471', 'VELA CON GLITTER ROJA ', 1, 418, 1),
(419, '7798156486214', 'BOLSA MULTICOLOR ', 1, 419, 1),
(420, '7792451122242', 'ACRILICO DELARTE MAGENTA X50CC N°24', 1, 420, 1),
(421, '7792451122228', 'ACRILICO DELARTE CIRUELA X50CC N°22', 1, 421, 1),
(422, '7792451122594', 'ACRILICO DELARTE GRIS PAYNE X50CC N°59', 1, 422, 1),
(423, '7792451122389', 'ACRILICO DELARTE MORA X50CC N°38', 1, 423, 1),
(424, '7792451122334', 'ACRILICO DELARTE AZUL PROFUNDO X50CC N°33', 1, 424, 1),
(425, '7792451122327', 'ACRILICO DELARTE AZUL ULTRAMAR X50CC N°32', 1, 425, 1),
(426, '7792451122174', 'ACRILICO DELARTE BERMELLON X50CC N°17', 1, 426, 1),
(427, '7792451122563', 'ACRILICO DELARTE MARRON MADERA X50CC N°56', 1, 427, 1),
(428, '7792451122600', 'ACRILICO DELARTE NEGRO X50CC N°60', 1, 428, 1),
(429, '7792451122518', 'ACRILICO DELARTE SIENA NATURAL X50CC N°51', 1, 429, 1),
(430, '7798100570013', 'ACRILICO AD BLANCO TITANIO X50ML N°010', 1, 430, 1),
(431, '7798100570150', 'ACRILICO AD MAIZ X50ML N°046', 1, 431, 1),
(432, '7798100570136', 'ACRILICO AD AMARILLO DE CADMIO CLARO X50ML N°042', 1, 432, 1),
(433, '7798100570143', 'ACRILICO AD AMARILLO CADMIO X50ML N°043', 1, 433, 1),
(434, '7798100570129', 'ACRILICO AD AMARILLO CLARO X50ML N°040', 1, 434, 1),
(435, '7798100570174', 'ACRILICO AD AMARILLO ORO X50ML N°056', 1, 435, 1),
(436, '7798100570334', 'ACRILICO AD SIENA NATURAL X50ML N°114', 1, 436, 1),
(437, '7798100570389', 'ACRILICO AD VERDE DE CADMIO X50ML N°131', 1, 437, 1),
(438, '7798100570235', 'ACRILICO AD ROJO CEIBO X50ML N°076', 1, 438, 1),
(439, '7798100570242', 'ACRILICO AD ROJO FUEGO X50ML N°078', 1, 439, 1),
(440, '7798100570204', 'ACRILICO AD ROJO DE CADMIO CLARO X50ML N°070', 1, 440, 1),
(441, '7798100570099', 'ACRILICO AD ROSA X50ML N°032', 1, 441, 1),
(442, '7798100570112', 'ACRILICO AD ROSA VIEJO X50ML N°038', 1, 442, 1),
(443, '7798100570273', 'ACRILICO AD MAGENTA X50ML N°086', 1, 443, 1),
(444, '7798100570594', 'ACRILICO AD NEGRO X50ML N°200', 1, 444, 1),
(445, '7798128944049', 'ACRILICO AD BLANCO DE ZINC X50ML N°011', 1, 445, 1),
(446, '7794757265104', 'TEMPERA MAPED BLANCO NIEVE 250G', 1, 446, 1),
(447, '7794757265418', 'TEMPERA MODEL NEGRO 250G', 1, 447, 1),
(448, '7794758265400', 'TEMPERA MODEL BLANCO 250G', 1, 448, 1),
(449, '7794757265159', 'TEMPERA MAPED NEGRO OSCURO 250G', 1, 449, 1),
(450, '7798093917567', 'TEMPERA ALBAMAGIC ROJO N°184 X170G', 1, 450, 1),
(451, '7798093917505', 'TEMPERA ALBAMAGIC MAX CELESTE CIELO N° 140 X170G', 1, 451, 1),
(452, '7798093917512', 'TEMPERA ALBAMAGIC AZUL N° 145 X170G', 1, 452, 1),
(453, '7798093917543', 'TEMPERA ALBAMAGIC NEGRO NOCHE N° 180 X170G', 1, 453, 1),
(454, '7796374223079', 'ACRILICO DECORATIVO ALBA TERRACOTA N°465 X40ML', 1, 454, 1),
(455, '7796374222898', 'ACRILICO DECORATIVO ALBA ROSA PIEL N°420 X40ML', 1, 455, 1),
(456, '7798093919844', 'ACRILICO DECORATIVO ALBA VAINILLA N°423 X40ML', 1, 456, 1),
(457, '7796374223277', 'ACRILICO DECORATIVO ALBA SOLFERINO N°495 X40ML', 1, 457, 1),
(458, '7798112712111', 'ADHESIVO VINILICO STA X250G', 1, 458, 1),
(459, '7792700002950', 'ADHESIVO VINILICO PELIKAN X300G', 1, 459, 1),
(460, '40127392', 'LAPIZ ADHESIVO PELICAN X40G', 1, 460, 1),
(461, '40127378', 'LAPIZ ADHESIVO PELIKAN X10G', 1, 461, 1),
(462, '40127385', 'LAPIZ ADHESIVO PELIKAN X20G', 1, 462, 1),
(463, '7790400010510', 'ADHESIVO SINTETICO VOLIGOMA X50ML', 1, 463, 1),
(464, '7790400010503', 'ADHESIVO SINTETICO VOLIGOMA X30ML', 1, 464, 1),
(465, '7798112830365', 'ADHESIVO VINILICO STA X30G', 1, 465, 1),
(466, '7794851001561', 'PINTURA LAVABLE PLASTICOLA COLOR - VERDE X40G', 1, 466, 1),
(467, '7794851001509', 'PINTURA LAVABLE PLASTICOLA COLOR - AZUL X40G', 1, 467, 1),
(468, '7794851001493', 'PINTURA LAVABLE PLASTICOLA COLOR - AMARILLO X40G', 1, 468, 1),
(469, '7794851001554', 'PINTURA LAVABLE PLASTICOLA COLOR - ROJO X40G', 1, 469, 1),
(470, '7794851002148', 'PINTURA LAVABLE PLASTICOLA METAL - MARRON X38G', 1, 470, 1),
(471, '7794851002124', 'PINTURA LAVABLE PLASTICOLA METAL - ROSA X38G', 1, 471, 1),
(472, '7794851002100', 'PINTURA LAVABLE PLASTICOLA METAL - AMARILLO X38G', 1, 472, 1),
(473, '7794851002131', 'PINTURA LAVABLE PLASTICOLA METAL - VERDE X38G', 1, 473, 1),
(474, '7794851001691', 'PINTURA LAVABLE PLASTICOLA FLUO - VERDE X40G', 1, 474, 1),
(475, '7794851001677', 'PINTURA LAVABLE PLASTICOLA FLUO - AMARILLO X40G', 1, 475, 1),
(476, '7794851001684', 'PINTURA LAVABLE PLASTICOLA FLUO - NARANJA X40G', 1, 476, 1),
(477, '7794851003121', 'PINTURA LAVABLE PLASTICOLA FLUO - ROSA X40G', 1, 477, 1),
(478, '7794851003138', 'PINTURA LAVABLE PLASTICOLA FLUO - AZUL X40G', 1, 478, 1),
(479, '7798112551802', 'ADHESIVO COLOR SEÑORITA - COLORES PRIMARIOS X30G', 1, 479, 1),
(480, '7794851003039', 'PINTURA LAVABLE PLASTICOLA CONFETTI - ROSA X38G', 1, 480, 1),
(481, '7794851003022', 'PINTURA LAVABLE PLASTICOLA CONFETTI - AZUL X38G', 1, 481, 1),
(482, '7794851003053', 'PINTURA LAVABLE PLASTICOLA CONFETTI - DORADO X38G', 1, 482, 1),
(483, '7796374186824', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - ANARANJADO PERMANENTE N°682', 1, 483, 1),
(484, '7796374186725', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - AMARILLO CLARO N°672', 1, 484, 1),
(485, '7796374186442', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - AZUL DE COBALTO N°644', 1, 485, 1),
(486, '7796374186992', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - AZUL DE COBALTO N°699', 1, 486, 1),
(487, '7796374186671', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - TIERRA SOMBRA NATURAL N°667', 1, 487, 1),
(488, '7796374186343', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - ROJO DE CADMIO N°634', 1, 488, 1),
(489, '7796374186237', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - AMARILLO DE CADMIO N°623', 1, 489, 1),
(490, '7796374186145', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - BLANCO DE ZINC N°614', 1, 490, 1),
(491, '7796374186985', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - VERDE VERONES N°698', 1, 491, 1),
(492, '7796374186510', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - VERDE DE CADMIO N°651', 1, 492, 1),
(493, '7796374186336', 'COLOR AL OLEO EXTRA FINO ALBA X18ML - BERMELLON DE CADMIO N°633', 1, 493, 1),
(494, '7798138385016', 'CINTA ADHESIVA DE PAPEL GENERAL OFFICE 18MMX50MTS', 1, 494, 1),
(495, '7792971000099', 'CINTA ADHESIVA DE PAPEL STIKO 18MMX50MTS', 1, 495, 1),
(496, '7792971000082', 'CINTA ADHESIVA DE PAPEL STIKO 24MMX50MTS', 1, 496, 1),
(497, '7798138385023', 'CINTA ADHESIVA DE PAPEL GENERAL OFFICE 24MMX50MTS', 1, 497, 1),
(498, '7792971620952', 'CINTA ADHESIVA DE PAPEL STIKO 48MMX50MTS', 1, 498, 1),
(499, '7798047120524', 'CINTA ADHESIVA TRANSPARENTE AUCA  45MMX40MTS', 1, 499, 1),
(500, '7798138384996', 'CINTA ADHESIVA TRANSPARENTE GENERAL OFFICE 12MMX60MTS', 1, 500, 1),
(501, '7798047120241', 'CINTA ADHESIVA DOBLE FAZ AUCA  12MMX10MTS', 1, 501, 1),
(502, '7076100780329', 'CINTA ADHESIVA TRANSPARENTE COLLEGE XXI  12MMX30MTS', 1, 502, 1),
(503, '7798138386068', 'TEMPERA COLLEGE ROJO X8CM3', 1, 503, 1),
(504, '7798138386006', 'TEMPERA COLLEGE MARRON X8CM3', 1, 504, 1),
(505, '7798138385986', 'TEMPERA COLLEGE BLANCO X8CM3', 1, 505, 1),
(506, '7798138386099', 'TEMPERA COLLEGE CELESTE X8CM3', 1, 506, 1),
(507, '7798138386129', 'TEMPERA COLLEGE VIOLETA X8CM3', 1, 507, 1),
(508, '7794757260215', 'TEMPERA MAPED VIOLETA X8ML', 1, 508, 1),
(509, '070330126268', 'LAPICERA BIC OPACO VERDE', 1, 509, 1),
(510, '070330125292', 'LAPICERA BIC OPACO ROJO', 1, 510, 1),
(511, '070330125285', 'LAPICERA BIC OPACO AZUL', 1, 511, 1),
(512, '070330125308', 'LAPICERA BIC OPACO NEGRO', 1, 512, 1),
(513, '070330183599', 'LAPICERA BIC CRISTAL FINA ROJO', 1, 513, 1),
(514, '070330183582', 'LAPICERA BIC CRISTAL FINA NEGRO', 1, 514, 1),
(515, '070330129665', 'LAPICERA BIC CRISTAL NEGRO', 1, 515, 1),
(516, '070330159716', 'LAPICERA BIC SHIMMERS LILA', 1, 516, 1),
(517, '070330159686', 'LAPICERA BIC SHIMMERS VERDE LIMON', 1, 517, 1),
(518, '070330159709', 'LAPICERA BIC SHIMMERS TURQUESA', 1, 518, 1),
(519, '070330159693', 'LAPICERA BIC SHIMMERS ROSA', 1, 519, 1),
(520, '7703486035650', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM MAGENTA', 1, 520, 1),
(521, '7703486035636', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM MORADA', 1, 521, 1),
(522, '7795245090536', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM NARANJA', 1, 522, 1),
(523, '7795245090567', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM VERDE', 1, 523, 1),
(524, '7703486035339', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM NEGRO', 1, 524, 1),
(525, '7703486035667', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM TURQUESA', 1, 525, 1),
(526, '7703486035322', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM ROJO', 1, 526, 1),
(527, '7703486037401', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM RETRACTIL MAGENTA', 1, 527, 1),
(528, '7703486035674', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM RETRACTIL AZUL', 1, 528, 1),
(529, '7703486037388', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM RETRACTIL LIMA', 1, 529, 1),
(530, '7703486037395', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM RETRACTIL TURQUESA', 1, 530, 1),
(531, '7703486037371', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM RETRACTIL MORADA', 1, 531, 1),
(532, '7703486037425', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM RETRACTIL NARANJA', 1, 532, 1),
(533, '7703486035698', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM RETRACTIL ROJO', 1, 533, 1),
(534, '7703486035681', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM RETRACTIL NEGRO', 1, 534, 1),
(535, '1', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM RETRACTIL VERDE OSCURO', 1, 535, 1),
(536, '7795245821987', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM ERASERMATE NEGRO', 1, 536, 1),
(537, '2', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM ERASERMATE AZUL', 1, 537, 1),
(538, '3', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM PLUS ROJO', 1, 538, 1),
(539, '7795245070507', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM PLUS AZUL', 1, 539, 1),
(540, '7798138386051', 'TEMPERA COLLEGE NARANJA X8CM3', 1, 540, 1),
(541, '7798138386020', 'TEMPERA COLLEGE AMARILLO X8CM3', 1, 541, 1),
(542, '7798138386082', 'TEMPERA COLLEGE ROSA X8CM3', 1, 542, 1),
(543, '7798138385993', 'TEMPERA COLLEGE NEGRO X8CM3', 1, 543, 1),
(544, '77981383386044', 'TEMPERA COLLEGE VERDE X8CM3', 1, 544, 1),
(545, '7798138386105', 'TEMPERA COLLEGE AZUL X8CM3', 1, 545, 1),
(546, '7794757260116', 'TEMPERA MAPED NEGRO X8CM3', 1, 546, 1),
(547, '7794757260413', 'TEMPERA MODEL NEGRO X8CM3', 1, 547, 1),
(548, '7794757260161', 'TEMPERA MAPED NARANJA X8CM3', 1, 548, 1),
(549, '7794757260185', 'TEMPERA MAPED ROSA X8CM3', 1, 549, 1),
(550, '7612532014009', 'RESALTADOR EZCO NARANJA', 1, 550, 1),
(551, '7612532014108', 'RESALTADOR EZCO TURQUESA', 1, 551, 1),
(552, '5401177766792', 'MARCADOR PERMANENTE SHARPIE ULTRA FINE POINT NEGRO', 1, 552, 1),
(553, '5401178324311', 'MARCADOR PERMANENTE SHARPIE TWIN TIP NEGRO', 1, 553, 1),
(554, '7501015218006', 'LAPICERA PELIKAN MINI NEGRO', 1, 554, 1),
(555, '7501015218013', 'LAPICERA PELIKAN MINI AZUL', 1, 555, 1),
(556, '7501015218020', 'LAPICERA PELIKAN MINI ROJO', 1, 556, 1),
(557, '3154142251329', 'LAPICERA MAPED FREEWRITER ROJO', 1, 557, 1),
(558, '3154142251312', 'LAPICERA MAPED FREEWRITER NEGRO', 1, 558, 1),
(559, '9556091127344', 'LAPICERA STABILO MARATHON 318 5.5 KM NEGRO', 1, 559, 1),
(560, '4', 'LAPICERA BIC BU3 GRIP 1.0MM NEGRO', 1, 560, 1),
(561, '7793198412047', 'MICROFIBRA PIZZINI NEGRO 0.4', 1, 561, 1),
(562, '7793198412061', 'MICROFIBRA PIZZINI NEGRO 0.6', 1, 562, 1),
(563, '7793198412023', 'MICROFIBRA PIZZINI NEGRO 0.2', 1, 563, 1),
(564, '4006381105262', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 ROJO', 1, 564, 1),
(565, '4006381186452', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 PIEL', 1, 565, 1),
(566, '4006381105309', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 MARRON', 1, 566, 1),
(567, '4006381105255', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 VERDE', 1, 567, 1),
(568, '4006381186483', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 LILA', 1, 568, 1),
(569, '4006381105330', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 MORADO', 1, 569, 1),
(570, '4006381333979', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 GRIS', 1, 570, 1),
(571, '4006381105293', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 AMARILLO', 1, 571, 1),
(572, '4006381105279', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 AZUL', 1, 572, 1),
(573, '4006381105323', 'MICROFIBRA STABILO POINT 88 - FINE 0.4 NARANJA', 1, 573, 1),
(574, '12', 'MICROFIBRA EDDING SUPERIOR QUALITY 1200 GRIS', 1, 574, 1),
(575, '13', 'MICROFIBRA EDDING SUPERIOR QUALITY 1200 MARRON', 1, 575, 1),
(576, '14', 'MICROFIBRA EDDING SUPERIOR QUALITY 1200 AMARILLO', 1, 576, 1),
(577, '15', 'MICROFIBRA EDDING SUPERIOR QUALITY 1200 AZUL', 1, 577, 1),
(578, '16', 'LAPICERA PAPER MATE ALLEGRO VERDE', 1, 578, 1),
(579, '17', 'LAPICERA PAPER MATE STICK 2020 NEGRO', 1, 579, 1),
(580, '5401178324335', 'MARCADOR PERMANENTE SHARPIE TWIN TIP ROJO', 1, 580, 1),
(581, '18', 'MARCADOR PERMANENTE SHARPIE TWIN TIP AZUL', 1, 581, 1),
(582, '7754111532037', 'LAPICERA FABER CASTELL TRILUX 032 MEDIUM NEGRO', 1, 582, 1),
(583, '7754111532013', 'LAPICERA FABER CASTELL TRILUX 032 MEDIUM AZUL', 1, 583, 1),
(584, '19', 'LAPICERA PAPER MATE KILOMETRICO 100 1.0M NEGRO ', 1, 584, 1),
(585, '071641371132', 'MARCADOR PERMANENTE SHARPIE ULTRA FINE POINT AZUL', 1, 585, 1),
(586, '20', 'MARCADOR PERMANENTE SHARPIE ULTRA FINE POINT VERDE', 1, 586, 1),
(587, '21', 'MARCADOR PERMANENTE SHARPIE ULTRA FINE POINT ROJO', 1, 587, 1),
(588, '22', 'MARCADOR PERMANENTE SHARPIE ULTRA FINE POINT CELESTE', 1, 588, 1),
(589, '23', 'LAPICERA PAPER MATE KILOMETRICO 1.0MM PLUS NEGRO', 1, 589, 1),
(590, '4902778577271', 'LAPICERA UNI-BALL SIGNO 0.8 SILVER', 1, 590, 1),
(591, '0007798108007535', 'PORCELANA FRIA EQ ARTE', 1, 591, 1),
(592, '7797608000350', 'CREALINA', 1, 592, 1),
(593, '793600128006', 'PLUMIN REVERSIBLE NC', 1, 593, 1),
(594, '7798112421129', 'TEMPERAS SEÑORITA X10UNID. - COLORES SURTIDOS', 1, 594, 1),
(595, '6926341895638', 'AROS PARA CARPETA OTA 63 MM', 1, 595, 1),
(596, '7792538120451', 'AROS PARA CARPETA SIFAP 60 MM', 1, 596, 1),
(597, '26', 'AROS PARA CARPETA CHICOS', 1, 597, 1),
(598, '27', 'AROS PARA CARPETA MEDIANOS', 1, 598, 1),
(599, '7793198170275', 'REGLA PIZZINI 30 CM', 1, 599, 1),
(600, '3154141468070', 'REGLA START MAPED15 CM', 1, 600, 1),
(602, '30', 'PUNZON MADERA', 1, 602, 1),
(603, '31', 'SACAPUNTAS METAL', 1, 603, 1),
(604, '3154145066005', 'SACAPUNTAS METAL MAPED', 1, 604, 1),
(605, '32', 'SACAPUNTAS METAL PROARTE COLORES', 1, 605, 1),
(606, '3154140632113', 'SACAPUNTAS MAPED PLASTICO', 1, 606, 1),
(607, '7793058115361', 'AGENDA CENTENARIO PLAST.GOMA C/ABROJO', 1, 607, 1),
(608, '6936860723862', 'AGENDA KATANA MEDIANA.', 1, 608, 1),
(609, '7754111000642', 'BOLIGRAFO FABER CASTELL TRILUX 1MM TURQUEZA', 1, 609, 1),
(610, '+C1412059', 'COLLAR 50 CM ACERO QUIRORGICO', 1, 610, 1),
(611, '+C1412155', 'PULSERA 29 CM ACERO QUIRUIGICO', 1, 611, 1),
(612, '+C1412187', 'PULSERA DE ACERO CON DIJES', 1, 612, 1),
(613, '+C1412139', 'PULSERA ACERO QUIRUGICO 19 CM', 1, 613, 1),
(614, '+C1412141', 'PULSERA DE ACERO QUIRURGICO 19 CM', 1, 614, 1),
(615, '411568', 'DIJE DE ACERO DISTINTAS FORMAS', 1, 615, 1),
(616, '2001045507446', 'DIJE NENES', 1, 616, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CUIT` varchar(255) DEFAULT NULL,
  `DIRECCION` varchar(255) DEFAULT NULL,
  `DOC` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `REPRESENTANTE` varchar(255) DEFAULT NULL,
  `TEL` varchar(255) DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  `TIPODOC_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PROVEEDOR_PRODUCTO_ID` (`PRODUCTO_ID`),
  KEY `FK_PROVEEDOR_TIPODOC_ID` (`TIPODOC_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcar la base de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`ID`, `CUIT`, `DIRECCION`, `DOC`, `EMAIL`, `NOMBRE`, `REPRESENTANTE`, `TEL`, `PRODUCTO_ID`, `TIPODOC_ID`) VALUES
(1, '0', 'SIN ASIGNAR', '0', 'SIN ASIGNAR', 'GENERAL', 'GENERAL', 'SIN ASIGNAR', NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `remito`
--

CREATE TABLE IF NOT EXISTS `remito` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `FECHA_EMICION` date DEFAULT NULL,
  `FECHA_VENCIMIENTO` date DEFAULT NULL,
  `NRO_REMITO` int(11) DEFAULT NULL,
  `TOTAL` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `remito`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `remito_detalle_remito`
--

CREATE TABLE IF NOT EXISTS `remito_detalle_remito` (
  `Remito_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Remito_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `remito_detalle_remito`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sequence`
--

CREATE TABLE IF NOT EXISTS `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `sequence`
--

INSERT INTO `sequence` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
('SEQ_GEN', 1600);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stocktemp`
--

CREATE TABLE IF NOT EXISTS `stocktemp` (
  `ID` bigint(20) NOT NULL,
  `CODIGO` double DEFAULT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `stocktemp`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjeta`
--

CREATE TABLE IF NOT EXISTS `tarjeta` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CANT_CUOTAS` int(11) DEFAULT NULL,
  `CUOTA_INTERES` int(11) DEFAULT NULL,
  `DESCUENTO` int(11) DEFAULT NULL,
  `INTERES` int(11) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tarjeta`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipounidades`
--

CREATE TABLE IF NOT EXISTS `tipounidades` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcar la base de datos para la tabla `tipounidades`
--

INSERT INTO `tipounidades` (`ID`, `DESCRIPCION`) VALUES
(1, 'UNIDAD'),
(2, 'RESMA BOREAL 75 G. A4'),
(3, 'CUADERNO(ABC) 60 HJ.CUADRICULADO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_cliente`
--

CREATE TABLE IF NOT EXISTS `tipo_cliente` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `PORCENTAJE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcar la base de datos para la tabla `tipo_cliente`
--

INSERT INTO `tipo_cliente` (`ID`, `DESCRIPCION`, `PORCENTAJE`) VALUES
(1, 'COMUN', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_doc`
--

CREATE TABLE IF NOT EXISTS `tipo_doc` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcar la base de datos para la tabla `tipo_doc`
--

INSERT INTO `tipo_doc` (`ID`, `DESCRIPCION`) VALUES
(1, 'DNI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_factura`
--

CREATE TABLE IF NOT EXISTS `tipo_factura` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tipo_factura`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_pago`
--

CREATE TABLE IF NOT EXISTS `tipo_pago` (
  `ID` bigint(20) NOT NULL,
  `CONTADO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_TIPO_PAGO_CONTADO_ID` (`CONTADO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_pago`
--

INSERT INTO `tipo_pago` (`ID`, `CONTADO_ID`) VALUES
(552, 553),
(602, 603),
(605, 606),
(652, 653),
(1503, 1504);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_pago_datos_cheque`
--

CREATE TABLE IF NOT EXISTS `tipo_pago_datos_cheque` (
  `Tipo_Pago_ID` bigint(20) NOT NULL,
  `cheques_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Tipo_Pago_ID`,`cheques_ID`),
  KEY `FK_TIPO_PAGO_DATOS_CHEQUE_cheques_ID` (`cheques_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_pago_datos_cheque`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_pago_datos_cuenta_corriente`
--

CREATE TABLE IF NOT EXISTS `tipo_pago_datos_cuenta_corriente` (
  `Tipo_Pago_ID` bigint(20) NOT NULL,
  `cuentacorrientes_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Tipo_Pago_ID`,`cuentacorrientes_ID`),
  KEY `TIPOPAGO_DATOS_CUENTA_CORRIENTEcuentacorrientes_ID` (`cuentacorrientes_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_pago_datos_cuenta_corriente`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_pago_datos_tarjeta`
--

CREATE TABLE IF NOT EXISTS `tipo_pago_datos_tarjeta` (
  `Tipo_Pago_ID` bigint(20) NOT NULL,
  `tarjetas_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Tipo_Pago_ID`,`tarjetas_ID`),
  KEY `FK_TIPO_PAGO_DATOS_TARJETA_tarjetas_ID` (`tarjetas_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_pago_datos_tarjeta`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_venta`
--

CREATE TABLE IF NOT EXISTS `tipo_venta` (
  `ID` bigint(20) NOT NULL,
  `ANTICIPO` float DEFAULT NULL,
  `CANT_CUOTAS` int(11) DEFAULT NULL,
  `DESCUENTO` int(11) DEFAULT NULL,
  `TIPO` varchar(255) DEFAULT NULL,
  `TAJETA_ID` bigint(20) DEFAULT NULL,
  `TIPO_PAGO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_TIPO_VENTA_TAJETA_ID` (`TAJETA_ID`),
  KEY `FK_TIPO_VENTA_TIPO_PAGO_ID` (`TIPO_PAGO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_venta`
--

INSERT INTO `tipo_venta` (`ID`, `ANTICIPO`, `CANT_CUOTAS`, `DESCUENTO`, `TIPO`, `TAJETA_ID`, `TIPO_PAGO_ID`) VALUES
(551, 0, 0, 0, NULL, NULL, 552),
(601, 0, 0, 0, NULL, NULL, 602),
(604, 0, 0, 0, NULL, NULL, 605),
(651, 0, 0, 0, NULL, NULL, 652),
(1502, 0, 0, 0, NULL, NULL, 1503);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_venta_detalle_tipo_venta`
--

CREATE TABLE IF NOT EXISTS `tipo_venta_detalle_tipo_venta` (
  `Tipo_Venta_ID` bigint(20) NOT NULL,
  `detalleTipoVenta_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Tipo_Venta_ID`,`detalleTipoVenta_ID`),
  KEY `TIPO_VENTA_DETALLE_TIPO_VENTA_detalleTipoVenta_ID` (`detalleTipoVenta_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_venta_detalle_tipo_venta`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `PASS` varchar(255) DEFAULT NULL,
  `TIPO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID`, `NOMBRE`, `PASS`, `TIPO`) VALUES
(1, 'ADMIN', '123', 'ADMINISTRADOR'),
(2, 'timo', '1957', 'ADMINISTRADOR'),
(4, 'caco', '1234', 'VENDEDOR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ANULACION` varchar(255) DEFAULT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `PAGOREGISTRADO` varchar(255) DEFAULT NULL,
  `CLIENTE_ID` bigint(20) DEFAULT NULL,
  `TIPOVENTA_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_VENTA_CLIENTE_ID` (`CLIENTE_ID`),
  KEY `FK_VENTA_TIPOVENTA_ID` (`TIPOVENTA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcar la base de datos para la tabla `venta`
--

INSERT INTO `venta` (`ID`, `ANULACION`, `DESCRIPCION`, `FECHA`, `MONTO`, `PAGOREGISTRADO`, `CLIENTE_ID`, `TIPOVENTA_ID`) VALUES
(1, 'NO', 'CONTADO', '2015-07-22', 0, 'SI', 1, 551),
(2, 'NO', 'CONTADO', '2015-07-22', 0, 'SI', 1, 601),
(3, 'NO', 'TARJETA', '2015-07-22', 0, 'SI', 1, 604),
(4, 'NO', 'CONTADO', '2015-07-22', 19.5, 'SI', 1, 651),
(5, 'NO', 'CONTADO', '2015-10-07', 105, 'SI', 1, 1502);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_detalle_venta`
--

CREATE TABLE IF NOT EXISTS `venta_detalle_venta` (
  `Venta_ID` bigint(20) NOT NULL,
  `detalle_venta_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Venta_ID`,`detalle_venta_ID`),
  KEY `FK_VENTA_DETALLE_VENTA_detalle_venta_ID` (`detalle_venta_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `venta_detalle_venta`
--

INSERT INTO `venta_detalle_venta` (`Venta_ID`, `detalle_venta_ID`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD CONSTRAINT `FK_ALMACEN_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `FK_CLIENTE_CUENTA_ID` FOREIGN KEY (`CUENTA_ID`) REFERENCES `cuenta_cliente` (`ID`),
  ADD CONSTRAINT `FK_CLIENTE_DESCRIPCION_ID` FOREIGN KEY (`DESCRIPCION_ID`) REFERENCES `tipo_cliente` (`ID`),
  ADD CONSTRAINT `FK_CLIENTE_TIPO_DOC_ID` FOREIGN KEY (`TIPO_DOC_ID`) REFERENCES `tipo_doc` (`ID`);

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `FK_COMPRAS_PROVEEDOR_ID` FOREIGN KEY (`PROVEEDOR_ID`) REFERENCES `proveedor` (`ID`);

--
-- Filtros para la tabla `compras_detalle_compra`
--
ALTER TABLE `compras_detalle_compra`
  ADD CONSTRAINT `FK_COMPRAS_DETALLE_COMPRA_Compras_ID` FOREIGN KEY (`Compras_ID`) REFERENCES `compras` (`ID`),
  ADD CONSTRAINT `FK_COMPRAS_DETALLE_COMPRA_detalle_compra_ID` FOREIGN KEY (`detalle_compra_ID`) REFERENCES `detalle_compra` (`ID`);

--
-- Filtros para la tabla `control`
--
ALTER TABLE `control`
  ADD CONSTRAINT `FK_CONTROL_ALMACEN_ID` FOREIGN KEY (`ALMACEN_ID`) REFERENCES `almacen` (`ID`),
  ADD CONSTRAINT `FK_CONTROL_COMPRA_ID` FOREIGN KEY (`COMPRA_ID`) REFERENCES `compras` (`ID`),
  ADD CONSTRAINT `FK_CONTROL_DEVOLUCION_ID` FOREIGN KEY (`DEVOLUCION_ID`) REFERENCES `devolucion` (`ID`),
  ADD CONSTRAINT `FK_CONTROL_VENTA_ID` FOREIGN KEY (`VENTA_ID`) REFERENCES `venta` (`ID`);

--
-- Filtros para la tabla `cuenta_cliente_detalle_cuenta_cliente`
--
ALTER TABLE `cuenta_cliente_detalle_cuenta_cliente`
  ADD CONSTRAINT `CUENTACLIENTEDETALLECUENTACLIENTECuenta_Cliente_ID` FOREIGN KEY (`Cuenta_Cliente_ID`) REFERENCES `cuenta_cliente` (`ID`),
  ADD CONSTRAINT `CUENTA_CLIENTE_DETALLE_CUENTA_CLIENTE_detalle_ID` FOREIGN KEY (`detalle_ID`) REFERENCES `detalle_cuenta_cliente` (`ID`);

--
-- Filtros para la tabla `cuenta_proveedor`
--
ALTER TABLE `cuenta_proveedor`
  ADD CONSTRAINT `FK_CUENTA_PROVEEDOR_PROVEEDOR_ID` FOREIGN KEY (`PROVEEDOR_ID`) REFERENCES `proveedor` (`ID`);

--
-- Filtros para la tabla `cuenta_proveedor_compras`
--
ALTER TABLE `cuenta_proveedor_compras`
  ADD CONSTRAINT `FK_CUENTA_PROVEEDOR_COMPRAS_compra_ID` FOREIGN KEY (`compra_ID`) REFERENCES `compras` (`ID`),
  ADD CONSTRAINT `FK_CUENTA_PROVEEDOR_COMPRAS_Cuenta_Proveedor_ID` FOREIGN KEY (`Cuenta_Proveedor_ID`) REFERENCES `cuenta_proveedor` (`ID`);

--
-- Filtros para la tabla `cuenta_proveedor_detalle_cuenta_proveedor`
--
ALTER TABLE `cuenta_proveedor_detalle_cuenta_proveedor`
  ADD CONSTRAINT `CNTAPROVEEDORDETALLECUENTAPROVEEDORCntaProveedorID` FOREIGN KEY (`Cuenta_Proveedor_ID`) REFERENCES `cuenta_proveedor` (`ID`),
  ADD CONSTRAINT `CUENTAPROVEEDOR_DETALLE_CUENTA_PROVEEDORdetalle_ID` FOREIGN KEY (`detalle_ID`) REFERENCES `detalle_cuenta_proveedor` (`ID`);

--
-- Filtros para la tabla `datos_tarjeta`
--
ALTER TABLE `datos_tarjeta`
  ADD CONSTRAINT `FK_DATOS_TARJETA_TARJETA_ID` FOREIGN KEY (`TARJETA_ID`) REFERENCES `tarjeta` (`ID`);

--
-- Filtros para la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD CONSTRAINT `FK_DETALLE_COMPRA_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

--
-- Filtros para la tabla `detalle_cuenta_cliente`
--
ALTER TABLE `detalle_cuenta_cliente`
  ADD CONSTRAINT `FK_DETALLE_CUENTA_CLIENTE_VENTA_ID` FOREIGN KEY (`VENTA_ID`) REFERENCES `venta` (`ID`);

--
-- Filtros para la tabla `detalle_cuenta_proveedor`
--
ALTER TABLE `detalle_cuenta_proveedor`
  ADD CONSTRAINT `FK_DETALLE_CUENTA_PROVEEDOR_COMPRA_ID` FOREIGN KEY (`COMPRA_ID`) REFERENCES `compras` (`ID`);

--
-- Filtros para la tabla `detalle_devolucion`
--
ALTER TABLE `detalle_devolucion`
  ADD CONSTRAINT `FK_DETALLE_DEVOLUCION_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

--
-- Filtros para la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
  ADD CONSTRAINT `FK_DETALLE_FACTURA_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

--
-- Filtros para la tabla `detalle_remito`
--
ALTER TABLE `detalle_remito`
  ADD CONSTRAINT `FK_DETALLE_REMITO_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

--
-- Filtros para la tabla `detalle_tipo_venta`
--
ALTER TABLE `detalle_tipo_venta`
  ADD CONSTRAINT `FK_DETALLE_TIPO_VENTA_PAGO_ID` FOREIGN KEY (`PAGO_ID`) REFERENCES `pagocliente` (`ID`);

--
-- Filtros para la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD CONSTRAINT `FK_DETALLE_VENTA_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

--
-- Filtros para la tabla `devolucion`
--
ALTER TABLE `devolucion`
  ADD CONSTRAINT `FK_DEVOLUCION_COMPRA_ID` FOREIGN KEY (`COMPRA_ID`) REFERENCES `compras` (`ID`),
  ADD CONSTRAINT `FK_DEVOLUCION_PROVEEDOR_ID` FOREIGN KEY (`PROVEEDOR_ID`) REFERENCES `proveedor` (`ID`);

--
-- Filtros para la tabla `devolucion_detalle_devolucion`
--
ALTER TABLE `devolucion_detalle_devolucion`
  ADD CONSTRAINT `FK_DEVOLUCION_DETALLE_DEVOLUCION_detalle_ID` FOREIGN KEY (`detalle_ID`) REFERENCES `detalle_devolucion` (`ID`),
  ADD CONSTRAINT `FK_DEVOLUCION_DETALLE_DEVOLUCION_Devolucion_ID` FOREIGN KEY (`Devolucion_ID`) REFERENCES `devolucion` (`ID`);

--
-- Filtros para la tabla `factura_detalle_factura`
--
ALTER TABLE `factura_detalle_factura`
  ADD CONSTRAINT `FK_FACTURA_DETALLE_FACTURA_detalle_ID` FOREIGN KEY (`detalle_ID`) REFERENCES `detalle_factura` (`ID`),
  ADD CONSTRAINT `FK_FACTURA_DETALLE_FACTURA_Factura_ID` FOREIGN KEY (`Factura_ID`) REFERENCES `factura` (`ID`);

--
-- Filtros para la tabla `orden_pago`
--
ALTER TABLE `orden_pago`
  ADD CONSTRAINT `FK_ORDEN_PAGO_CUENTA_PROVEEDOR_ID` FOREIGN KEY (`CUENTA_PROVEEDOR_ID`) REFERENCES `cuenta_proveedor` (`ID`);

--
-- Filtros para la tabla `pagocliente`
--
ALTER TABLE `pagocliente`
  ADD CONSTRAINT `FK_PAGOCLIENTE_CUENTA_ID` FOREIGN KEY (`CUENTA_ID`) REFERENCES `cuenta_cliente` (`ID`),
  ADD CONSTRAINT `FK_PAGOCLIENTE_FACTURA_ID` FOREIGN KEY (`FACTURA_ID`) REFERENCES `factura` (`ID`),
  ADD CONSTRAINT `FK_PAGOCLIENTE_VENTA_ID` FOREIGN KEY (`VENTA_ID`) REFERENCES `venta` (`ID`);

--
-- Filtros para la tabla `precio_tarjeta`
--
ALTER TABLE `precio_tarjeta`
  ADD CONSTRAINT `FK_PRECIO_TARJETA_Precio_ID` FOREIGN KEY (`Precio_ID`) REFERENCES `precio` (`ID`),
  ADD CONSTRAINT `FK_PRECIO_TARJETA_tarjeta_ID` FOREIGN KEY (`tarjeta_ID`) REFERENCES `tarjeta` (`ID`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `FK_PRODUCTO_PRECIO_ID` FOREIGN KEY (`PRECIO_ID`) REFERENCES `precio` (`ID`),
  ADD CONSTRAINT `FK_PRODUCTO_PROVEEDOR_ID` FOREIGN KEY (`PROVEEDOR_ID`) REFERENCES `proveedor` (`ID`),
  ADD CONSTRAINT `FK_PRODUCTO_UNIDAD_ID` FOREIGN KEY (`UNIDAD_ID`) REFERENCES `tipounidades` (`ID`);

--
-- Filtros para la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD CONSTRAINT `FK_PROVEEDOR_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`),
  ADD CONSTRAINT `FK_PROVEEDOR_TIPODOC_ID` FOREIGN KEY (`TIPODOC_ID`) REFERENCES `tipo_doc` (`ID`);

--
-- Filtros para la tabla `remito_detalle_remito`
--
ALTER TABLE `remito_detalle_remito`
  ADD CONSTRAINT `FK_REMITO_DETALLE_REMITO_Remito_ID` FOREIGN KEY (`Remito_ID`) REFERENCES `remito` (`ID`);

--
-- Filtros para la tabla `tipo_pago`
--
ALTER TABLE `tipo_pago`
  ADD CONSTRAINT `FK_TIPO_PAGO_CONTADO_ID` FOREIGN KEY (`CONTADO_ID`) REFERENCES `datos_contado` (`ID`);

--
-- Filtros para la tabla `tipo_pago_datos_cheque`
--
ALTER TABLE `tipo_pago_datos_cheque`
  ADD CONSTRAINT `FK_TIPO_PAGO_DATOS_CHEQUE_cheques_ID` FOREIGN KEY (`cheques_ID`) REFERENCES `datos_cheque` (`ID`),
  ADD CONSTRAINT `FK_TIPO_PAGO_DATOS_CHEQUE_Tipo_Pago_ID` FOREIGN KEY (`Tipo_Pago_ID`) REFERENCES `tipo_pago` (`ID`);

--
-- Filtros para la tabla `tipo_pago_datos_cuenta_corriente`
--
ALTER TABLE `tipo_pago_datos_cuenta_corriente`
  ADD CONSTRAINT `FK_TIPO_PAGO_DATOS_CUENTA_CORRIENTE_Tipo_Pago_ID` FOREIGN KEY (`Tipo_Pago_ID`) REFERENCES `tipo_pago` (`ID`),
  ADD CONSTRAINT `TIPOPAGO_DATOS_CUENTA_CORRIENTEcuentacorrientes_ID` FOREIGN KEY (`cuentacorrientes_ID`) REFERENCES `datos_cuenta_corriente` (`ID`);

--
-- Filtros para la tabla `tipo_pago_datos_tarjeta`
--
ALTER TABLE `tipo_pago_datos_tarjeta`
  ADD CONSTRAINT `FK_TIPO_PAGO_DATOS_TARJETA_tarjetas_ID` FOREIGN KEY (`tarjetas_ID`) REFERENCES `datos_tarjeta` (`ID`),
  ADD CONSTRAINT `FK_TIPO_PAGO_DATOS_TARJETA_Tipo_Pago_ID` FOREIGN KEY (`Tipo_Pago_ID`) REFERENCES `tipo_pago` (`ID`);

--
-- Filtros para la tabla `tipo_venta`
--
ALTER TABLE `tipo_venta`
  ADD CONSTRAINT `FK_TIPO_VENTA_TAJETA_ID` FOREIGN KEY (`TAJETA_ID`) REFERENCES `tarjeta` (`ID`),
  ADD CONSTRAINT `FK_TIPO_VENTA_TIPO_PAGO_ID` FOREIGN KEY (`TIPO_PAGO_ID`) REFERENCES `tipo_pago` (`ID`);

--
-- Filtros para la tabla `tipo_venta_detalle_tipo_venta`
--
ALTER TABLE `tipo_venta_detalle_tipo_venta`
  ADD CONSTRAINT `FK_TIPO_VENTA_DETALLE_TIPO_VENTA_Tipo_Venta_ID` FOREIGN KEY (`Tipo_Venta_ID`) REFERENCES `tipo_venta` (`ID`),
  ADD CONSTRAINT `TIPO_VENTA_DETALLE_TIPO_VENTA_detalleTipoVenta_ID` FOREIGN KEY (`detalleTipoVenta_ID`) REFERENCES `detalle_tipo_venta` (`ID`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `FK_VENTA_CLIENTE_ID` FOREIGN KEY (`CLIENTE_ID`) REFERENCES `cliente` (`ID`),
  ADD CONSTRAINT `FK_VENTA_TIPOVENTA_ID` FOREIGN KEY (`TIPOVENTA_ID`) REFERENCES `tipo_venta` (`ID`);

--
-- Filtros para la tabla `venta_detalle_venta`
--
ALTER TABLE `venta_detalle_venta`
  ADD CONSTRAINT `FK_VENTA_DETALLE_VENTA_detalle_venta_ID` FOREIGN KEY (`detalle_venta_ID`) REFERENCES `detalle_venta` (`ID`),
  ADD CONSTRAINT `FK_VENTA_DETALLE_VENTA_Venta_ID` FOREIGN KEY (`Venta_ID`) REFERENCES `venta` (`ID`);
