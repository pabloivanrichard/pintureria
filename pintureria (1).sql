-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 07-03-2016 a las 20:59:17
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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=492 ;

--
-- Volcar la base de datos para la tabla `almacen`
--

INSERT INTO `almacen` (`ID`, `ALERTA`, `CANTIDAD`, `LOCALIZACION`, `PRODUCTO_ID`) VALUES
(1, '0', '0', 'NEGOCIO', 1),
(2, '0', '4.0', 'NEGOCIO', 2),
(3, '0', '3.0', 'NEGOCIO', 3),
(4, '0', '0', 'NEGOCIO', 4),
(5, '0', '3.0', 'NEGOCIO', 5),
(6, '0', '14.0', 'NEGOCIO', 6),
(7, '0', '15.0', 'NEGOCIO', 7),
(8, '0', '15.0', 'NEGOCIO', 8),
(9, '0', '0', 'NEGOCIO', 9),
(10, '0', '0', 'NEGOCIO', 10),
(11, '0', '0', 'NEGOCIO', 11),
(12, '0', '0', 'NEGOCIO', 12),
(13, '0', '0', 'NEGOCIO', 13),
(14, '0', '14.0', 'NEGOCIO', 14),
(15, '0', '15.0', 'NEGOCIO', 15),
(16, '0', '14.0', 'NEGOCIO', 16),
(17, '0', '0', 'NEGOCIO', 17),
(18, '0', '0', 'NEGOCIO', 18),
(19, '0', '0', 'NEGOCIO', 19),
(20, '0', '0', 'NEGOCIO', 20),
(21, '0', '0', 'NEGOCIO', 21),
(22, '0', '0', 'NEGOCIO', 22),
(23, '0', '3.0', 'NEGOCIO', 23),
(24, '0', '1.0', 'NEGOCIO', 24),
(25, '0', '2.0', 'NEGOCIO', 25),
(26, '0', '4.0', 'NEGOCIO', 26),
(27, '0', '3.0', 'NEGOCIO', 27),
(28, '0', '7.0', 'NEGOCIO', 28),
(29, '0', '1.0', 'NEGOCIO', 29),
(30, '0', '0', 'NEGOCIO', 30),
(31, '0', '0', 'NEGOCIO', 31),
(32, '0', '0', 'NEGOCIO', 32),
(33, '0', '0', 'NEGOCIO', 33),
(34, '0', '0', 'NEGOCIO', 34),
(35, '0', '0', 'NEGOCIO', 35),
(36, '0', '0', 'NEGOCIO', 36),
(37, '0', '0', 'NEGOCIO', 37),
(38, '0', '0', 'NEGOCIO', 38),
(39, '0', '0', 'NEGOCIO', 39),
(40, '0', '0', 'NEGOCIO', 40),
(41, '0', '0', 'NEGOCIO', 41),
(42, '0', '0', 'NEGOCIO', 42),
(43, '0', '0', 'NEGOCIO', 43),
(44, '0', '0', 'NEGOCIO', 44),
(45, '0', '0', 'NEGOCIO', 45),
(46, '0', '0', 'NEGOCIO', 46),
(47, '0', '0', 'NEGOCIO', 47),
(48, '0', '0', 'NEGOCIO', 48),
(49, '0', '0', 'NEGOCIO', 49),
(50, '0', '0', 'NEGOCIO', 50),
(51, '0', '0', 'NEGOCIO', 51),
(52, '0', '0', 'NEGOCIO', 52),
(53, '0', '0', 'NEGOCIO', 53),
(54, '0', '0', 'NEGOCIO', 54),
(55, '0', '0', 'NEGOCIO', 55),
(56, '0', '7.0', 'NEGOCIO', 56),
(57, '0', '7.0', 'NEGOCIO', 57),
(58, '0', '4.0', 'NEGOCIO', 58),
(59, '0', '0', 'NEGOCIO', 59),
(60, '0', '0', 'NEGOCIO', 60),
(61, '0', '0', 'NEGOCIO', 61),
(62, '0', '0', 'NEGOCIO', 62),
(63, '0', '0', 'NEGOCIO', 63),
(64, '0', '0', 'NEGOCIO', 64),
(65, '0', '0', 'NEGOCIO', 65),
(66, '0', '4.0', 'NEGOCIO', 66),
(67, '0', '0', 'NEGOCIO', 67),
(68, '0', '0', 'NEGOCIO', 68),
(69, '0', '0', 'NEGOCIO', 69),
(70, '0', '0', 'NEGOCIO', 70),
(71, '0', '0', 'NEGOCIO', 71),
(72, '0', '0', 'NEGOCIO', 72),
(73, '0', '0', 'NEGOCIO', 73),
(74, '0', '4.0', 'NEGOCIO', 74),
(75, '0', '0', 'NEGOCIO', 75),
(76, '0', '0', 'NEGOCIO', 76),
(77, '0', '4.0', 'NEGOCIO', 77),
(78, '0', '0', 'NEGOCIO', 78),
(79, '0', '2.0', 'NEGOCIO', 79),
(80, '0', '2.0', 'NEGOCIO', 80),
(81, '0', '0', 'NEGOCIO', 81),
(82, '0', '0', 'NEGOCIO', 82),
(83, '0', '1.0', 'NEGOCIO', 83),
(84, '0', '3.0', 'NEGOCIO', 84),
(85, '0', '0', 'NEGOCIO', 85),
(86, '0', '0', 'NEGOCIO', 86),
(87, '0', '0', 'NEGOCIO', 87),
(88, '0', '5.0', 'NEGOCIO', 88),
(89, '0', '1.0', 'NEGOCIO', 89),
(90, '0', '0', 'NEGOCIO', 90),
(91, '0', '0', 'NEGOCIO', 91),
(92, '0', '0', 'NEGOCIO', 92),
(93, '0', '2.0', 'NEGOCIO', 93),
(94, '0', '0', 'NEGOCIO', 94),
(95, '0', '1.0', 'NEGOCIO', 95),
(96, '0', '0', 'NEGOCIO', 96),
(97, '0', '4.0', 'NEGOCIO', 97),
(98, '0', '1.0', 'NEGOCIO', 98),
(99, '0', '4.0', 'NEGOCIO', 99),
(100, '0', '7.0', 'NEGOCIO', 100),
(101, '0', '1.0', 'NEGOCIO', 101),
(102, '0', '6.0', 'NEGOCIO', 102),
(103, '0', '2.0', 'NEGOCIO', 103),
(104, '0', '0', 'NEGOCIO', 104),
(105, '0', '0', 'NEGOCIO', 105),
(106, '0', '0', 'NEGOCIO', 106),
(107, '0', '0', 'NEGOCIO', 107),
(108, '0', '1.0', 'NEGOCIO', 108),
(109, '0', '2.0', 'NEGOCIO', 109),
(110, '0', '2.0', 'NEGOCIO', 110),
(111, '0', '0', 'NEGOCIO', 111),
(112, '0', '0', 'NEGOCIO', 112),
(113, '0', '0', 'NEGOCIO', 113),
(114, '0', '4.0', 'NEGOCIO', 114),
(115, '0', '6.0', 'NEGOCIO', 115),
(116, '0', '0', 'NEGOCIO', 116),
(117, '0', '0', 'NEGOCIO', 117),
(118, '0', '0', 'NEGOCIO', 118),
(119, '0', '0', 'NEGOCIO', 119),
(120, '0', '0', 'NEGOCIO', 120),
(121, '0', '0', 'NEGOCIO', 121),
(122, '0', '0', 'NEGOCIO', 122),
(123, '0', '0', 'NEGOCIO', 123),
(124, '0', '0', 'NEGOCIO', 124),
(125, '0', '0', 'NEGOCIO', 125),
(126, '0', '0', 'NEGOCIO', 126),
(127, '0', '0', 'NEGOCIO', 127),
(128, '0', '0', 'NEGOCIO', 128),
(129, '0', '0', 'NEGOCIO', 129),
(130, '0', '0', 'NEGOCIO', 130),
(131, '0', '0', 'NEGOCIO', 131),
(132, '0', '0', 'NEGOCIO', 132),
(133, '0', '0', 'NEGOCIO', 133),
(134, '0', '0', 'NEGOCIO', 134),
(135, '0', '0', 'NEGOCIO', 135),
(136, '0', '0', 'NEGOCIO', 136),
(137, '0', '0', 'NEGOCIO', 137),
(138, '0', '0', 'NEGOCIO', 138),
(139, '0', '0', 'NEGOCIO', 139),
(140, '0', '0', 'NEGOCIO', 140),
(141, '0', '0', 'NEGOCIO', 141),
(142, '0', '0', 'NEGOCIO', 142),
(143, '0', '0', 'NEGOCIO', 143),
(144, '0', '0', 'NEGOCIO', 144),
(145, '0', '0', 'NEGOCIO', 145),
(146, '0', '0', 'NEGOCIO', 146),
(147, '0', '0', 'NEGOCIO', 147),
(148, '0', '0', 'NEGOCIO', 148),
(149, '0', '0', 'NEGOCIO', 149),
(150, '0', '0', 'NEGOCIO', 150),
(151, '0', '0', 'NEGOCIO', 151),
(152, '0', '0', 'NEGOCIO', 152),
(153, '0', '0', 'NEGOCIO', 153),
(154, '0', '0', 'NEGOCIO', 154),
(155, '0', '0', 'NEGOCIO', 155),
(156, '0', '0', 'NEGOCIO', 156),
(157, '0', '0', 'NEGOCIO', 157),
(158, '0', '0', 'NEGOCIO', 158),
(159, '0', '0', 'NEGOCIO', 159),
(160, '0', '0', 'NEGOCIO', 160),
(161, '0', '0', 'NEGOCIO', 161),
(162, '0', '0', 'NEGOCIO', 162),
(163, '0', '0', 'NEGOCIO', 163),
(164, '0', '0', 'NEGOCIO', 164),
(165, '0', '0', 'NEGOCIO', 165),
(166, '0', '0', 'NEGOCIO', 166),
(167, '0', '0', 'NEGOCIO', 167),
(168, '0', '0', 'NEGOCIO', 168),
(169, '0', '0', 'NEGOCIO', 169),
(170, '0', '0', 'NEGOCIO', 170),
(171, '0', '0', 'NEGOCIO', 171),
(172, '0', '0', 'NEGOCIO', 172),
(173, '0', '0', 'NEGOCIO', 173),
(174, '0', '0', 'NEGOCIO', 174),
(175, '0', '0', 'NEGOCIO', 175),
(176, '0', '0', 'NEGOCIO', 176),
(177, '0', '0', 'NEGOCIO', 177),
(178, '0', '0', 'NEGOCIO', 178),
(179, '0', '11.0', 'NEGOCIO', 179),
(180, '0', '22.0', 'NEGOCIO', 180),
(181, '0', '20.0', 'NEGOCIO', 181),
(182, '0', '4.0', 'NEGOCIO', 182),
(183, '0', '3.0', 'NEGOCIO', 183),
(184, '0', '5.0', 'NEGOCIO', 184),
(185, '0', '14.0', 'NEGOCIO', 185),
(186, '0', '0', 'NEGOCIO', 186),
(187, '0', '0', 'NEGOCIO', 187),
(188, '0', '19.0', 'NEGOCIO', 188),
(189, '0', '10.0', 'NEGOCIO', 189),
(190, '0', '9.0', 'NEGOCIO', 190),
(191, '0', '18.0', 'NEGOCIO', 191),
(192, '0', '4.0', 'NEGOCIO', 192),
(193, '0', '6.0', 'NEGOCIO', 193),
(194, '0', '2.0', 'NEGOCIO', 194),
(195, '0', '3.0', 'NEGOCIO', 195),
(196, '0', '8.0', 'NEGOCIO', 196),
(197, '0', '12.0', 'NEGOCIO', 197),
(198, '0', '21.0', 'NEGOCIO', 198),
(199, '0', '12.0', 'NEGOCIO', 199),
(200, '0', '15.0', 'NEGOCIO', 200),
(201, '0', '11.0', 'NEGOCIO', 201),
(202, '0', '3.0', 'NEGOCIO', 202),
(203, '0', '15', 'NEGOCIO', 203),
(204, '0', '5', 'NEGOCIO', 204),
(205, '0', '7.0', 'NEGOCIO', 205),
(206, '0', '5', 'NEGOCIO', 206),
(207, '0', '9.0', 'NEGOCIO', 207),
(208, '0', '0', 'NEGOCIO', 208),
(209, '0', '0', 'NEGOCIO', 209),
(210, '0', '0', 'NEGOCIO', 210),
(211, '0', '0', 'NEGOCIO', 211),
(212, '0', '0', 'NEGOCIO', 212),
(213, '0', '16.0', 'NEGOCIO', 213),
(214, '0', '11.0', 'NEGOCIO', 214),
(215, '0', '12.0', 'NEGOCIO', 215),
(216, '0', '17.0', 'NEGOCIO', 216),
(217, '0', '6.0', 'NEGOCIO', 217),
(218, '0', '0', 'NEGOCIO', 218),
(219, '0', '0', 'NEGOCIO', 219),
(220, '0', '0', 'NEGOCIO', 220),
(221, '0', '0', 'NEGOCIO', 221),
(222, '0', '1.0', 'NEGOCIO', 222),
(223, '0', '0', 'NEGOCIO', 223),
(224, '0', '0', 'NEGOCIO', 224),
(225, '0', '14.0', 'NEGOCIO', 225),
(226, '0', '26.0', 'NEGOCIO', 226),
(227, '0', '20.0', 'NEGOCIO', 227),
(228, '0', '0', 'NEGOCIO', 228),
(229, '0', '0', 'NEGOCIO', 229),
(230, '0', '0', 'NEGOCIO', 230),
(231, '0', '0', 'NEGOCIO', 231),
(232, '0', '0', 'NEGOCIO', 232),
(233, '0', '0', 'NEGOCIO', 233),
(234, '0', '0', 'NEGOCIO', 234),
(235, '0', '2.0', 'NEGOCIO', 235),
(236, '0', '4.0', 'NEGOCIO', 236),
(237, '0', '0', 'NEGOCIO', 237),
(238, '0', '1.0', 'NEGOCIO', 238),
(239, '0', '0', 'NEGOCIO', 239),
(240, '0', '0', 'NEGOCIO', 240),
(241, '0', '16.0', 'NEGOCIO', 241),
(242, '0', '0', 'NEGOCIO', 242),
(243, '0', '0', 'NEGOCIO', 243),
(244, '0', '0', 'NEGOCIO', 244),
(245, '0', '24.0', 'NEGOCIO', 245),
(246, '0', '18.0', 'NEGOCIO', 246),
(247, '0', '26.0', 'NEGOCIO', 247),
(248, '0', '6.0', 'NEGOCIO', 248),
(249, '0', '1.0', 'NEGOCIO', 249),
(250, '0', '2.0', 'NEGOCIO', 250),
(251, '0', '3.0', 'NEGOCIO', 251),
(252, '0', '2.0', 'NEGOCIO', 252),
(253, '0', '0', 'NEGOCIO', 253),
(254, '0', '0', 'NEGOCIO', 254),
(255, '0', '2.0', 'NEGOCIO', 255),
(256, '0', '0', 'NEGOCIO', 256),
(257, '0', '0', 'NEGOCIO', 257),
(258, '0', '0', 'NEGOCIO', 258),
(259, '0', '2.0', 'NEGOCIO', 259),
(260, '0', '1.0', 'NEGOCIO', 260),
(261, '0', '0', 'NEGOCIO', 261),
(262, '0', '0', 'NEGOCIO', 262),
(263, '0', '1.0', 'NEGOCIO', 263),
(264, '0', '0', 'NEGOCIO', 264),
(265, '0', '1.0', 'NEGOCIO', 265),
(266, '0', '0', 'NEGOCIO', 266),
(267, '0', '0', 'NEGOCIO', 267),
(268, '0', '0', 'NEGOCIO', 268),
(269, '0', '0', 'NEGOCIO', 269),
(270, '0', '0', 'NEGOCIO', 270),
(271, '0', '1.0', 'NEGOCIO', 271),
(272, '0', '3.0', 'NEGOCIO', 272),
(273, '0', '0', 'NEGOCIO', 273),
(274, '0', '0', 'NEGOCIO', 274),
(275, '0', '0', 'NEGOCIO', 275),
(276, '0', '0', 'NEGOCIO', 276),
(277, '0', '1.0', 'NEGOCIO', 277),
(278, '0', '0', 'NEGOCIO', 278),
(279, '0', '1.0', 'NEGOCIO', 279),
(280, '0', '0', 'NEGOCIO', 280),
(281, '0', '0', 'NEGOCIO', 281),
(282, '0', '0', 'NEGOCIO', 282),
(283, '0', '0', 'NEGOCIO', 283),
(284, '0', '2.0', 'NEGOCIO', 284),
(285, '0', '6.0', 'NEGOCIO', 285),
(286, '0', '4.0', 'NEGOCIO', 286),
(287, '0', '0', 'NEGOCIO', 287),
(288, '0', '0', 'NEGOCIO', 288),
(289, '0', '0', 'NEGOCIO', 289),
(290, '0', '0', 'NEGOCIO', 290),
(291, '0', '4.0', 'NEGOCIO', 291),
(292, '0', '0', 'NEGOCIO', 292),
(293, '0', '0', 'NEGOCIO', 293),
(294, '0', '0', 'NEGOCIO', 294),
(295, '0', '0', 'NEGOCIO', 295),
(296, '0', '0', 'NEGOCIO', 296),
(297, '0', '0', 'NEGOCIO', 297),
(298, '0', '0', 'NEGOCIO', 298),
(299, '0', '0', 'NEGOCIO', 299),
(300, '0', '4.0', 'NEGOCIO', 300),
(301, '0', '0', 'NEGOCIO', 301),
(302, '0', '0', 'NEGOCIO', 302),
(303, '0', '0', 'NEGOCIO', 303),
(304, '0', '0', 'NEGOCIO', 304),
(305, '0', '5.0', 'NEGOCIO', 305),
(306, '0', '0', 'NEGOCIO', 306),
(307, '0', '0', 'NEGOCIO', 307),
(308, '0', '0', 'NEGOCIO', 308),
(309, '0', '0', 'NEGOCIO', 309),
(310, '0', '0', 'NEGOCIO', 310),
(311, '0', '0', 'NEGOCIO', 311),
(312, '0', '2.0', 'NEGOCIO', 312),
(313, '0', '0', 'NEGOCIO', 313),
(314, '0', '0', 'NEGOCIO', 314),
(315, '0', '0', 'NEGOCIO', 315),
(316, '0', '0', 'NEGOCIO', 316),
(317, '0', '0', 'NEGOCIO', 317),
(318, '0', '0', 'NEGOCIO', 318),
(319, '0', '3.0', 'NEGOCIO', 319),
(320, '0', '0', 'NEGOCIO', 320),
(321, '0', '0', 'NEGOCIO', 321),
(322, '0', '0', 'NEGOCIO', 322),
(323, '0', '0', 'NEGOCIO', 323),
(324, '0', '0', 'NEGOCIO', 324),
(325, '0', '0', 'NEGOCIO', 325),
(326, '0', '10.0', 'NEGOCIO', 326),
(327, '0', '0', 'NEGOCIO', 327),
(328, '0', '0', 'NEGOCIO', 328),
(329, '0', '0', 'NEGOCIO', 329),
(330, '0', '9.0', 'NEGOCIO', 330),
(331, '0', '13.0', 'NEGOCIO', 331),
(332, '0', '8.0', 'NEGOCIO', 332),
(333, '0', '0', 'NEGOCIO', 333),
(334, '0', '0', 'NEGOCIO', 334),
(335, '0', '0', 'NEGOCIO', 335),
(336, '0', '0', 'NEGOCIO', 336),
(337, '0', '0', 'NEGOCIO', 337),
(338, '0', '0', 'NEGOCIO', 338),
(339, '0', '0', 'NEGOCIO', 339),
(340, '0', '0', 'NEGOCIO', 340),
(341, '0', '0', 'NEGOCIO', 341),
(342, '0', '0', 'NEGOCIO', 342),
(343, '0', '0', 'NEGOCIO', 343),
(344, '0', '0', 'NEGOCIO', 344),
(345, '0', '0', 'NEGOCIO', 345),
(346, '0', '0', 'NEGOCIO', 346),
(347, '0', '0', 'NEGOCIO', 347),
(348, '0', '0', 'NEGOCIO', 348),
(349, '0', '0', 'NEGOCIO', 349),
(350, '0', '0', 'NEGOCIO', 350),
(351, '0', '0', 'NEGOCIO', 351),
(352, '0', '0', 'NEGOCIO', 352),
(353, '0', '0', 'NEGOCIO', 353),
(354, '0', '0', 'NEGOCIO', 354),
(355, '0', '0', 'NEGOCIO', 355),
(356, '0', '0', 'NEGOCIO', 356),
(357, '0', '0', 'NEGOCIO', 357),
(358, '0', '0', 'NEGOCIO', 358),
(359, '0', '0', 'NEGOCIO', 359),
(360, '0', '0', 'NEGOCIO', 360),
(361, '0', '0', 'NEGOCIO', 361),
(362, '0', '1.0', 'NEGOCIO', 362),
(363, '0', '10', 'NEGOCIO', 363),
(364, '0', '10', 'NEGOCIO', 364),
(365, '0', '10', 'NEGOCIO', 365),
(366, '0', '5', 'NEGOCIO', 366),
(367, '0', '0', 'NEGOCIO', 367),
(368, '0', '20', 'NEGOCIO', 368),
(369, '0', '10', 'NEGOCIO', 369),
(370, '0', '5', 'NEGOCIO', 370),
(371, '0', '9', 'NEGOCIO', 371),
(372, '0', '4', 'NEGOCIO', 372),
(373, '0', '2', 'NEGOCIO', 373),
(374, '0', '3', 'NEGOCIO', 374),
(375, '0', '2', 'NEGOCIO', 375),
(376, '0', '1', 'NEGOCIO', 376),
(377, '0', '4', 'NEGOCIO', 377),
(378, '0', '0', 'NEGOCIO', 378),
(379, '0', '2', 'NEGOCIO', 379),
(380, '0', '9', 'NEGOCIO', 380),
(381, '0', '3', 'NEGOCIO', 381),
(382, '0', '0', 'NEGOCIO', 382),
(383, '0', '0', 'NEGOCIO', 383),
(384, '0', '3', 'NEGOCIO', 384),
(385, '0', '3', 'NEGOCIO', 385),
(386, '0', '2', 'NEGOCIO', 386),
(387, '0', '6', 'NEGOCIO', 387),
(388, '0', '2', 'NEGOCIO', 388),
(389, '0', '4', 'NEGOCIO', 389),
(390, '0', '0', 'NEGOCIO', 390),
(391, '0', '0', 'NEGOCIO', 391),
(392, '0', '0', 'NEGOCIO', 392),
(393, '0', '2', 'NEGOCIO', 393),
(394, '0', '2', 'NEGOCIO', 394),
(395, '0', '1', 'NEGOCIO', 395),
(396, '0', '0', 'NEGOCIO', 396),
(397, '0', '1', 'NEGOCIO', 397),
(398, '0', '1', 'NEGOCIO', 398),
(399, '0', '2', 'NEGOCIO', 399),
(400, '0', '2', 'NEGOCIO', 400),
(401, '0', '3', 'NEGOCIO', 401),
(402, '0', '6', 'NEGOCIO', 402),
(403, '0', '0', 'NEGOCIO', 403),
(404, '0', '0', 'NEGOCIO', 404),
(405, '0', '19', 'NEGOCIO', 405),
(406, '0', '8', 'NEGOCIO', 406),
(407, '0', '0', 'NEGOCIO', 407),
(408, '0', '6', 'NEGOCIO', 408),
(409, '0', '0', 'NEGOCIO', 409),
(410, '0', '1', 'NEGOCIO', 410),
(411, '0', '1', 'NEGOCIO', 411),
(412, '0', '2', 'NEGOCIO', 412),
(413, '0', '2', 'NEGOCIO', 413),
(414, '0', '3', 'NEGOCIO', 414),
(415, '0', '1', 'NEGOCIO', 415),
(416, '0', '0', 'NEGOCIO', 416),
(417, '0', '1', 'NEGOCIO', 417),
(418, '0', '1', 'NEGOCIO', 418),
(419, '0', '2', 'NEGOCIO', 419),
(420, '0', '8', 'NEGOCIO', 420),
(421, '0', '6', 'NEGOCIO', 421),
(422, '0', '1', 'NEGOCIO', 422),
(423, '0', '2', 'NEGOCIO', 423),
(424, '0', '2', 'NEGOCIO', 424),
(425, '0', '1', 'NEGOCIO', 425),
(426, '0', '2', 'NEGOCIO', 426),
(427, '0', '1', 'NEGOCIO', 427),
(428, '0', '1', 'NEGOCIO', 428),
(429, '0', '4', 'NEGOCIO', 429),
(430, '0', '2', 'NEGOCIO', 430),
(431, '0', '1', 'NEGOCIO', 431),
(432, '0', '3', 'NEGOCIO', 432),
(433, '0', '3', 'NEGOCIO', 433),
(434, '0', '0', 'NEGOCIO', 434),
(435, '0', '2', 'NEGOCIO', 435),
(436, '0', '2', 'NEGOCIO', 436),
(437, '0', '2', 'NEGOCIO', 437),
(438, '0', '2.0', 'NEGOCIO', 438),
(439, '0', '2', 'NEGOCIO', 439),
(440, '0', '1', 'NEGOCIO', 440),
(441, '0', '1', 'NEGOCIO', 441),
(442, '0', '17', 'NEGOCIO', 442),
(443, '0', '8', 'NEGOCIO', 443),
(444, '0', '0', 'NEGOCIO', 444),
(445, '0', '8', 'NEGOCIO', 445),
(446, '0', '7', 'NEGOCIO', 446),
(447, '0', '2', 'NEGOCIO', 447),
(448, '0', '14', 'NEGOCIO', 448),
(449, '0', '2', 'NEGOCIO', 449),
(450, '0', '2', 'NEGOCIO', 450),
(451, '0', '2', 'NEGOCIO', 451),
(452, '0', '3', 'NEGOCIO', 452),
(453, '0', '2', 'NEGOCIO', 453),
(454, '0', '4', 'NEGOCIO', 454),
(455, '0', '11.0', 'NEGOCIO', 455),
(456, '0', '5', 'NEGOCIO', 456),
(457, '0', '4', 'NEGOCIO', 457),
(458, '0', '2', 'NEGOCIO', 458),
(459, '0', '3', 'NEGOCIO', 459),
(460, '0', '2', 'NEGOCIO', 460),
(461, '0', '2', 'NEGOCIO', 461),
(462, '0', '2', 'NEGOCIO', 462),
(463, '0', '3', 'NEGOCIO', 463),
(464, '0', '1', 'NEGOCIO', 464),
(465, '0', '2', 'NEGOCIO', 465),
(466, '0', '4', 'NEGOCIO', 466),
(467, '0', '1', 'NEGOCIO', 467),
(468, '0', '1', 'NEGOCIO', 468),
(469, '0', '3', 'NEGOCIO', 469),
(470, '0', '3', 'NEGOCIO', 470),
(471, '0', '12', 'NEGOCIO', 471),
(472, '0', '4', 'NEGOCIO', 472),
(473, '0', '6', 'NEGOCIO', 473),
(474, '0', '2', 'NEGOCIO', 474),
(475, '0', '4', 'NEGOCIO', 475),
(476, '0', '4', 'NEGOCIO', 476),
(477, '0', '6', 'NEGOCIO', 477),
(478, '0', '4.0', 'NEGOCIO', 478),
(479, '0', '2', 'NEGOCIO', 479),
(480, '0', '18', 'NEGOCIO', 480),
(481, '0', '16.0', 'NEGOCIO', 481),
(482, '0', '2', 'NEGOCIO', 482),
(483, '0', '1', 'NEGOCIO', 483),
(484, '0', '3', 'NEGOCIO', 484),
(485, '0', '2', 'NEGOCIO', 485),
(486, '0', '3', 'NEGOCIO', 486),
(487, '0', '5', 'NEGOCIO', 487),
(488, '0', '5', 'NEGOCIO', 488),
(489, '0', '10', 'NEGOCIO', 489),
(490, '0', '10', 'NEGOCIO', 490),
(491, '5', '10', 'NEGOCIO', 491);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE IF NOT EXISTS `alumno` (
  `ID` bigint(20) NOT NULL,
  `APELLIDO` varchar(255) DEFAULT NULL,
  `DNI` varchar(255) DEFAULT NULL,
  `DOMICILIO` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `PROMOCION` varchar(255) DEFAULT NULL,
  `TALLE` varchar(255) DEFAULT NULL,
  `TEL` varchar(255) DEFAULT NULL,
  `TIPODOC` varchar(255) DEFAULT NULL,
  `ORG_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ALUMNO_ORG_ID` (`ORG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `alumno`
--


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
-- Estructura de tabla para la tabla `codigobarra`
--

CREATE TABLE IF NOT EXISTS `codigobarra` (
  `ID` bigint(20) NOT NULL,
  `COD` varchar(255) DEFAULT NULL,
  `NUM` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `codigobarra`
--

INSERT INTO `codigobarra` (`ID`, `COD`, `NUM`) VALUES
(2, '4242', 1),
(4, '4242', 2),
(6, '4242', 3),
(8, '4242', 4),
(10, '4242', 5),
(52, '4242', 6),
(54, '4242', 7),
(56, '4242', 8),
(58, '4242', 9),
(102, '4242', 10),
(104, '4242', 11),
(152, '4242', 12),
(202, '4242', 13),
(252, '4242', 14),
(254, '4242', 15),
(302, '4242', 16),
(352, '4242', 17),
(402, '4242', 18),
(452, '4242', 19),
(502, '4242', 20),
(552, '4242', 21),
(554, '4242', 22),
(602, '4242', 23),
(652, '4242', 24),
(702, '4242', 25),
(704, '4242', 26),
(752, '4242', 27),
(754, '4242', 28),
(802, '4242', 29),
(852, '4242', 30),
(854, '4242', 31),
(856, '4242', 32),
(902, '4242', 33),
(952, '4242', 34),
(954, '4242', 35),
(956, '4242', 36),
(958, '4242', 37),
(1002, '4242', 38),
(1004, '4242', 39),
(1006, '4242', 40),
(1008, '4242', 41),
(1010, '4242', 42),
(1012, '4242', 43),
(1052, '4242', 44),
(1054, '4242', 45),
(1056, '4242', 46),
(1058, '4242', 47),
(1060, '4242', 48),
(1062, '4242', 49),
(1064, '4242', 50),
(1066, '4242', 51),
(1068, '4242', 52),
(1070, '4242', 53),
(1072, '4242', 54),
(1074, '4242', 55),
(1076, '4242', 56),
(1078, '4242', 57),
(1080, '4242', 58),
(1082, '4242', 59),
(1101, '4242', 60),
(1102, '4242', 61),
(1103, '4242', 62),
(1104, '4242', 63),
(1152, '4242', 64),
(1154, '4242', 65),
(1156, '4242', 66),
(1158, '4242', 67),
(1160, '4242', 68),
(1162, '4242', 69),
(1164, '4242', 70),
(1166, '4242', 71),
(1168, '4242', 72),
(1170, '4242', 73),
(1172, '4242', 74),
(1174, '4242', 75),
(1176, '4242', 76),
(1178, '4242', 77),
(1180, '4242', 78),
(1182, '4242', 79),
(1184, '4242', 80),
(1186, '4242', 81),
(1188, '4242', 82),
(1190, '4242', 83),
(1192, '4242', 84),
(1194, '4242', 85),
(1196, '4242', 86),
(1198, '4242', 87),
(1200, '4242', 88),
(1202, '4242', 89),
(1204, '4242', 90),
(1206, '4242', 91),
(1208, '4242', 92),
(1210, '4242', 93),
(1212, '4242', 94),
(1214, '4242', 95),
(1216, '4242', 96),
(1218, '4242', 97),
(1220, '4242', 98),
(1222, '4242', 99),
(1224, '4242', 100),
(1226, '4242', 101),
(1228, '4242', 102),
(1230, '4242', 103),
(1232, '4242', 104),
(1234, '4242', 105),
(1236, '4242', 106),
(1238, '4242', 107),
(1240, '4242', 108),
(1242, '4242', 109),
(1244, '4242', 110),
(1246, '4242', 111),
(1248, '4242', 112),
(1250, '4242', 113),
(1252, '4242', 114),
(1254, '4242', 115),
(1256, '4242', 116),
(1258, '4242', 117),
(1260, '4242', 118),
(1262, '4242', 119),
(1264, '4242', 120),
(1266, '4242', 121),
(1268, '4242', 122),
(1270, '4242', 123),
(1272, '4242', 124),
(1274, '4242', 125),
(1276, '4242', 126),
(1278, '4242', 127),
(1280, '4242', 128),
(1282, '4242', 129),
(1284, '4242', 130),
(1286, '4242', 131),
(1288, '4242', 132),
(1290, '4242', 133),
(1292, '4242', 134),
(1294, '4242', 135),
(1296, '4242', 136),
(1298, '4242', 137),
(1300, '4242', 138),
(1302, '4242', 139),
(1304, '4242', 140),
(1306, '4242', 141),
(1308, '4242', 142),
(1310, '4242', 143),
(1312, '4242', 144),
(1314, '4242', 145),
(1316, '4242', 146),
(1318, '4242', 147),
(1320, '4242', 148),
(1322, '4242', 149),
(1324, '4242', 150),
(1326, '4242', 151),
(1328, '4242', 152),
(1330, '4242', 153),
(1332, '4242', 154),
(1334, '4242', 155),
(1336, '4242', 156),
(1338, '4242', 157),
(1340, '4242', 158),
(1342, '4242', 159),
(1344, '4242', 160),
(1346, '4242', 161),
(1348, '4242', 162),
(1350, '4242', 163),
(1352, '4242', 164),
(1354, '4242', 165),
(1356, '4242', 166),
(1358, '4242', 167),
(1360, '4242', 168),
(1362, '4242', 169),
(1364, '4242', 170),
(1366, '4242', 171),
(1368, '4242', 172),
(1370, '4242', 173),
(1372, '4242', 174),
(1374, '4242', 175),
(1376, '4242', 176),
(1378, '4242', 177),
(1380, '4242', 178),
(1382, '4242', 179),
(1384, '4242', 180),
(1386, '4242', 181),
(1388, '4242', 182),
(1390, '4242', 183),
(1392, '4242', 184),
(1394, '4242', 185),
(1396, '4242', 186),
(1398, '4242', 187),
(1400, '4242', 188),
(1402, '4242', 189),
(1404, '4242', 190),
(1406, '4242', 191),
(1408, '4242', 192),
(1410, '4242', 193),
(1412, '4242', 194),
(1414, '4242', 195),
(1416, '4242', 196),
(1418, '4242', 197),
(1420, '4242', 198),
(1422, '4242', 199),
(1424, '4242', 200),
(1426, '4242', 201),
(1428, '4242', 202),
(1430, '4242', 203),
(1432, '4242', 204),
(1434, '4242', 205),
(1436, '4242', 206),
(1438, '4242', 207),
(1440, '4242', 208),
(1442, '4242', 209),
(1444, '4242', 210),
(1446, '4242', 211),
(1448, '4242', 212),
(1450, '4242', 213),
(1452, '4242', 214),
(1454, '4242', 215),
(1456, '4242', 216),
(1458, '4242', 217),
(1460, '4242', 218),
(1462, '4242', 219),
(1464, '4242', 220),
(1466, '4242', 221),
(1502, '4242', 222),
(1504, '4242', 223),
(1506, '4242', 224),
(1508, '4242', 225),
(1510, '4242', 226),
(1512, '4242', 227),
(1514, '4242', 228),
(1516, '4242', 229),
(1518, '4242', 230),
(1520, '4242', 231),
(1522, '4242', 232),
(1524, '4242', 233),
(1526, '4242', 234),
(1528, '4242', 235),
(1530, '4242', 236),
(1532, '4242', 237),
(1534, '4242', 238),
(1536, '4242', 239),
(1538, '4242', 240),
(1540, '4242', 241),
(1542, '4242', 242),
(1544, '4242', 243),
(1546, '4242', 244),
(1548, '4242', 245),
(1550, '4242', 246),
(1552, '4242', 247),
(1554, '4242', 248),
(1556, '4242', 249),
(1558, '4242', 250),
(1560, '4242', 251),
(1562, '4242', 252),
(1564, '4242', 253),
(1566, '4242', 254),
(1568, '4242', 255),
(1570, '4242', 256),
(1572, '4242', 257),
(1574, '4242', 258),
(1576, '4242', 259),
(1578, '4242', 260),
(1580, '4242', 261),
(1582, '4242', 262),
(1584, '4242', 263),
(1586, '4242', 264),
(1588, '4242', 265),
(1590, '4242', 266),
(1592, '4242', 267),
(1594, '4242', 268),
(1596, '4242', 269),
(1598, '4242', 270),
(1600, '4242', 271),
(1602, '4242', 272),
(1604, '4242', 273),
(1606, '4242', 274),
(1608, '4242', 275),
(1610, '4242', 276),
(1612, '4242', 277),
(1614, '4242', 278),
(1616, '4242', 279),
(1618, '4242', 280),
(1620, '4242', 281),
(1622, '4242', 282),
(1624, '4242', 283),
(1626, '4242', 284),
(1628, '4242', 285),
(1630, '4242', 286),
(1632, '4242', 287),
(1634, '4242', 288),
(1636, '4242', 289),
(1638, '4242', 290),
(1640, '4242', 291),
(1642, '4242', 292),
(1644, '4242', 293),
(1646, '4242', 294),
(1648, '4242', 295),
(1650, '4242', 296),
(1652, '4242', 297),
(1654, '4242', 298),
(1656, '4242', 299),
(1658, '4242', 300),
(1660, '4242', 301),
(1662, '4242', 302),
(1664, '4242', 303),
(1666, '4242', 304),
(1668, '4242', 305),
(1670, '4242', 306),
(1672, '4242', 307),
(1674, '4242', 308),
(1676, '4242', 309),
(1678, '4242', 310),
(1680, '4242', 311),
(1682, '4242', 312),
(1684, '4242', 313),
(1686, '4242', 314),
(1688, '4242', 315),
(1690, '4242', 316),
(1692, '4242', 317),
(1694, '4242', 318),
(1696, '4242', 319),
(1698, '4242', 320),
(1700, '4242', 321),
(1702, '4242', 322),
(1704, '4242', 323),
(1706, '4242', 324),
(1708, '4242', 325),
(1710, '4242', 326),
(1712, '4242', 327),
(1714, '4242', 328),
(1716, '4242', 329),
(1718, '4242', 330),
(1720, '4242', 331),
(1722, '4242', 332),
(1724, '4242', 333),
(1726, '4242', 334),
(1728, '4242', 335),
(1730, '4242', 336),
(1732, '4242', 337),
(1734, '4242', 338),
(1736, '4242', 339),
(1738, '4242', 340),
(1740, '4242', 341),
(1742, '4242', 342),
(1744, '4242', 343),
(1746, '4242', 344),
(1748, '4242', 345),
(1750, '4242', 346),
(1752, '4242', 347),
(1754, '4242', 348),
(1756, '4242', 349),
(1758, '4242', 350),
(1760, '4242', 351),
(1762, '4242', 352),
(1764, '4242', 353),
(1766, '4242', 354),
(1768, '4242', 355),
(1770, '4242', 356),
(1772, '4242', 357),
(1774, '4242', 358),
(1776, '4242', 359),
(1778, '4242', 360),
(1780, '4242', 361),
(1782, '4242', 362),
(1802, '4242', 363),
(1804, '4242', 364),
(1806, '4242', 365),
(1852, '4242', 366),
(1854, '4242', 367),
(1856, '4242', 368),
(1858, '4242', 369),
(1860, '4242', 370),
(1862, '4242', 371),
(1864, '4242', 372),
(1866, '4242', 373),
(1868, '4242', 374),
(1870, '4242', 375),
(1872, '4242', 376),
(1874, '4242', 377),
(1876, '4242', 378),
(1878, '4242', 379),
(1880, '4242', 380),
(1882, '4242', 381),
(1884, '4242', 382),
(1886, '4242', 383),
(1888, '4242', 384),
(1890, '4242', 385),
(1892, '4242', 386),
(1894, '4242', 387),
(1896, '4242', 388),
(1898, '4242', 389),
(1900, '4242', 390),
(1902, '4242', 391),
(1904, '4242', 392),
(1906, '4242', 393),
(1908, '4242', 394),
(1910, '4242', 395),
(1912, '4242', 396),
(1914, '4242', 397),
(1916, '4242', 398),
(1918, '4242', 399),
(1920, '4242', 400),
(1922, '4242', 401),
(1924, '4242', 402),
(1926, '4242', 403),
(1928, '4242', 404),
(1930, '4242', 405),
(1932, '4242', 406),
(1934, '4242', 407),
(1936, '4242', 408),
(1938, '4242', 409),
(1940, '4242', 410),
(1942, '4242', 411),
(1944, '4242', 412),
(1946, '4242', 413),
(1948, '4242', 414),
(1950, '4242', 415),
(1952, '4242', 416),
(1954, '4242', 417),
(1956, '4242', 418),
(1958, '4242', 419),
(1960, '4242', 420),
(1962, '4242', 421),
(1964, '4242', 422),
(1966, '4242', 423),
(1968, '4242', 424),
(1970, '4242', 425),
(1972, '4242', 426),
(1974, '4242', 427),
(1976, '4242', 428),
(1978, '4242', 429),
(1980, '4242', 430),
(1982, '4242', 431),
(1984, '4242', 432),
(1986, '4242', 433),
(1988, '4242', 434),
(1990, '4242', 435),
(1992, '4242', 436),
(1994, '4242', 437),
(1996, '4242', 438),
(1998, '4242', 439),
(2000, '4242', 440),
(2002, '4242', 441),
(2004, '4242', 442),
(2006, '4242', 443),
(2008, '4242', 444),
(2010, '4242', 445),
(2012, '4242', 446),
(2014, '4242', 447),
(2016, '4242', 448),
(2018, '4242', 449),
(2020, '4242', 450),
(2022, '4242', 451),
(2024, '4242', 452),
(2026, '4242', 453),
(2028, '4242', 454),
(2030, '4242', 455),
(2032, '4242', 456),
(2034, '4242', 457),
(2036, '4242', 458),
(2038, '4242', 459),
(2040, '4242', 460),
(2042, '4242', 461),
(2044, '4242', 462),
(2046, '4242', 463),
(2048, '4242', 464),
(2050, '4242', 465),
(2052, '4242', 466),
(2054, '4242', 467),
(2056, '4242', 468),
(2058, '4242', 469),
(2060, '4242', 470),
(2062, '4242', 471),
(2064, '4242', 472),
(2066, '4242', 473),
(2068, '4242', 474),
(2070, '4242', 475),
(2072, '4242', 476),
(2074, '4242', 477),
(2076, '4242', 478),
(2078, '4242', 479),
(2080, '4242', 480),
(2082, '4242', 481),
(2084, '4242', 482),
(2086, '4242', 483),
(2102, '4242', 484),
(2104, '4242', 485),
(2352, '4242', 486),
(2354, '4242', 487),
(2402, '4242', 488),
(2404, '4242', 489),
(2406, '4242', 490),
(2408, '4242', 491),
(2410, '4242', 492),
(2412, '4242', 493),
(2414, '4242', 494),
(2452, '4242', 495);

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
  `USU_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_COMPRAS_PROVEEDOR_ID` (`PROVEEDOR_ID`),
  KEY `FK_COMPRAS_USU_ID` (`USU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `compras`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comprasinstock`
--

CREATE TABLE IF NOT EXISTS `comprasinstock` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ANULACION` varchar(255) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `PRECIO_TOTOL` float DEFAULT NULL,
  `CUENTA_ID` bigint(20) DEFAULT NULL,
  `PROVEEDOR_ID` bigint(20) DEFAULT NULL,
  `USU_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_COMPRASINSTOCK_USU_ID` (`USU_ID`),
  KEY `FK_COMPRASINSTOCK_PROVEEDOR_ID` (`PROVEEDOR_ID`),
  KEY `FK_COMPRASINSTOCK_CUENTA_ID` (`CUENTA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `comprasinstock`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comprasinstock_detalledecomprasinstock`
--

CREATE TABLE IF NOT EXISTS `comprasinstock_detalledecomprasinstock` (
  `ComprasinStock_ID` bigint(20) NOT NULL,
  `detallecompra_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`ComprasinStock_ID`,`detallecompra_ID`),
  KEY `CMPRASINSTOCKDETALLEDECOMPRASINSTOCKdtallecompraID` (`detallecompra_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `comprasinstock_detalledecomprasinstock`
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
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE IF NOT EXISTS `contrato` (
  `ID` bigint(20) NOT NULL,
  `ANULADO` varchar(255) DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `DIASHABILES` int(11) DEFAULT NULL,
  `ESTADO` varchar(255) DEFAULT NULL,
  `FEC_FIN` date DEFAULT NULL,
  `FEC_INICIO` date DEFAULT NULL,
  `NROCONTRATO` varchar(255) DEFAULT NULL,
  `PROMO` varchar(255) DEFAULT NULL,
  `TOTAL` float DEFAULT NULL,
  `CUENTA_CONTRATO_ID` bigint(20) DEFAULT NULL,
  `ENTREGA_ID` bigint(20) DEFAULT NULL,
  `ORGANIZACION_ID` bigint(20) DEFAULT NULL,
  `USU_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CONTRATO_ENTREGA_ID` (`ENTREGA_ID`),
  KEY `FK_CONTRATO_ORGANIZACION_ID` (`ORGANIZACION_ID`),
  KEY `FK_CONTRATO_USU_ID` (`USU_ID`),
  KEY `FK_CONTRATO_CUENTA_CONTRATO_ID` (`CUENTA_CONTRATO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `contrato`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato_alumno`
--

CREATE TABLE IF NOT EXISTS `contrato_alumno` (
  `Contrato_ID` bigint(20) NOT NULL,
  `alumnos_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Contrato_ID`,`alumnos_ID`),
  KEY `FK_CONTRATO_ALUMNO_alumnos_ID` (`alumnos_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `contrato_alumno`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato_detalle_contrato`
--

CREATE TABLE IF NOT EXISTS `contrato_detalle_contrato` (
  `Contrato_ID` bigint(20) NOT NULL,
  `detalle_contrato_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Contrato_ID`,`detalle_contrato_ID`),
  KEY `FK_CONTRATO_DETALLE_CONTRATO_detalle_contrato_ID` (`detalle_contrato_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `contrato_detalle_contrato`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato_personalizarcontrato`
--

CREATE TABLE IF NOT EXISTS `contrato_personalizarcontrato` (
  `Contrato_ID` bigint(20) NOT NULL,
  `Comprapersonalizada_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Contrato_ID`,`Comprapersonalizada_ID`),
  KEY `CONTRATOPERSONALIZARCONTRATOComprapersonalizada_ID` (`Comprapersonalizada_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `contrato_personalizarcontrato`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato_responsable_contrato`
--

CREATE TABLE IF NOT EXISTS `contrato_responsable_contrato` (
  `Contrato_ID` bigint(20) NOT NULL,
  `responsables_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Contrato_ID`,`responsables_ID`),
  KEY `FK_CONTRATO_RESPONSABLE_CONTRATO_responsables_ID` (`responsables_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `contrato_responsable_contrato`
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
-- Estructura de tabla para la tabla `cuentafiado`
--

CREATE TABLE IF NOT EXISTS `cuentafiado` (
  `ID` bigint(20) NOT NULL,
  `ANTICIPO` float DEFAULT NULL,
  `SALDO` float DEFAULT NULL,
  `TOTAL` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `cuentafiado`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentafiado_detallecuentafiado`
--

CREATE TABLE IF NOT EXISTS `cuentafiado_detallecuentafiado` (
  `CuentaFiado_ID` bigint(20) NOT NULL,
  `listadetallecuentafiado_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`CuentaFiado_ID`,`listadetallecuentafiado_ID`),
  KEY `CNTAFIADODETALLECUENTAFIADOlstdetallecuentafiadoID` (`listadetallecuentafiado_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `cuentafiado_detallecuentafiado`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentaproveedorsinstock`
--

CREATE TABLE IF NOT EXISTS `cuentaproveedorsinstock` (
  `ID` bigint(20) NOT NULL,
  `ANTICIPO` float DEFAULT NULL,
  `ESTADO` varchar(255) DEFAULT NULL,
  `SALDO` float DEFAULT NULL,
  `TOTAL` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `cuentaproveedorsinstock`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentaproveedorsinstock_detallecuentaprovedorsinstock`
--

CREATE TABLE IF NOT EXISTS `cuentaproveedorsinstock_detallecuentaprovedorsinstock` (
  `CuentaProveedorSinStock_ID` bigint(20) NOT NULL,
  `detalle_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`CuentaProveedorSinStock_ID`,`detalle_ID`),
  KEY `CNTPRVDRSINSTOCKDETALLECUENTAPROVEDORSINSTOCKdtllD` (`detalle_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `cuentaproveedorsinstock_detallecuentaprovedorsinstock`
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
-- Estructura de tabla para la tabla `cuenta_contrato`
--

CREATE TABLE IF NOT EXISTS `cuenta_contrato` (
  `ID` bigint(20) NOT NULL,
  `ANTICIPO` float DEFAULT NULL,
  `SALDO` float DEFAULT NULL,
  `TOTAL` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `cuenta_contrato`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta_contrato_detalle_cuenta_contrato`
--

CREATE TABLE IF NOT EXISTS `cuenta_contrato_detalle_cuenta_contrato` (
  `cuenta_contrato_ID` bigint(20) NOT NULL,
  `listadetallecuenta_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`cuenta_contrato_ID`,`listadetallecuenta_ID`),
  KEY `CNTCONTRATODETALLECUENTACONTRATOlstdetallecuentaID` (`listadetallecuenta_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `cuenta_contrato_detalle_cuenta_contrato`
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
(2153, NULL, NULL, 0, 0),
(2203, NULL, NULL, 0, 0),
(2253, NULL, NULL, 0, 0),
(2303, NULL, NULL, 0, 0);

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
-- Estructura de tabla para la tabla `deposito`
--

CREATE TABLE IF NOT EXISTS `deposito` (
  `ID` bigint(20) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `NRO_CUENTA` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `deposito`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecuentafiado`
--

CREATE TABLE IF NOT EXISTS `detallecuentafiado` (
  `ID` bigint(20) NOT NULL,
  `ANULADO` varchar(255) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `MONTO_PAGO` float DEFAULT NULL,
  `USUARIO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLECUENTAFIADO_USUARIO_ID` (`USUARIO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `detallecuentafiado`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecuentaprovedorsinstock`
--

CREATE TABLE IF NOT EXISTS `detallecuentaprovedorsinstock` (
  `ID` bigint(20) NOT NULL,
  `MONTO` float DEFAULT NULL,
  `TIPO` varchar(255) DEFAULT NULL,
  `ANULADO` varchar(255) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `DEPOSITO_ID` bigint(20) DEFAULT NULL,
  `PAGO_ID` bigint(20) DEFAULT NULL,
  `USU_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLECUENTAPROVEDORSINSTOCK_DEPOSITO_ID` (`DEPOSITO_ID`),
  KEY `FK_DETALLECUENTAPROVEDORSINSTOCK_PAGO_ID` (`PAGO_ID`),
  KEY `FK_DETALLECUENTAPROVEDORSINSTOCK_USU_ID` (`USU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `detallecuentaprovedorsinstock`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalledecomprasinstock`
--

CREATE TABLE IF NOT EXISTS `detalledecomprasinstock` (
  `ID` bigint(20) NOT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `PRECIO` float DEFAULT NULL,
  `PRODUCTO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `detalledecomprasinstock`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallefiado`
--

CREATE TABLE IF NOT EXISTS `detallefiado` (
  `ID` bigint(20) NOT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLEFIADO_PRODUCTO_ID` (`PRODUCTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `detallefiado`
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
-- Estructura de tabla para la tabla `detalle_contrato`
--

CREATE TABLE IF NOT EXISTS `detalle_contrato` (
  `ID` bigint(20) NOT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_CONTRATO_PRODUCTO_ID` (`PRODUCTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `detalle_contrato`
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
-- Estructura de tabla para la tabla `detalle_cuenta_contrato`
--

CREATE TABLE IF NOT EXISTS `detalle_cuenta_contrato` (
  `ID` bigint(20) NOT NULL,
  `ANULADO` varchar(255) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `MONTO_PAGO` float DEFAULT NULL,
  `ALUMNO_ID` bigint(20) DEFAULT NULL,
  `USU_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_CUENTA_CONTRATO_ALUMNO_ID` (`ALUMNO_ID`),
  KEY `FK_DETALLE_CUENTA_CONTRATO_USU_ID` (`USU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `detalle_cuenta_contrato`
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
  `CANTIDAD` float DEFAULT NULL,
  `ID_FACTURA` bigint(20) DEFAULT NULL,
  `PDESCRIPCION` varchar(255) DEFAULT NULL,
  `PRECIO` float DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_FACTURA_PRODUCTO_ID` (`PRODUCTO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcar la base de datos para la tabla `detalle_factura`
--

INSERT INTO `detalle_factura` (`ID`, `CANTIDAD`, `ID_FACTURA`, `PDESCRIPCION`, `PRECIO`, `PRODUCTO_ID`) VALUES
(1, 1, 1, 'REMERA NEGRA LISA', 0, 203);

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
  `CANTIDAD` float DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DETALLE_VENTA_PRODUCTO_ID` (`PRODUCTO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcar la base de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`ID`, `CANTIDAD`, `MONTO`, `PRODUCTO_ID`) VALUES
(1, 1, 0, 203),
(2, 1, 0, 203),
(3, 2, 0, 203),
(4, 2, 0, 203),
(5, 1, 0, 203),
(6, 1, 0, 203),
(7, 1, 0, 203),
(8, 1, 0, 203);

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
-- Estructura de tabla para la tabla `entrega_producto_contrato`
--

CREATE TABLE IF NOT EXISTS `entrega_producto_contrato` (
  `ID` bigint(20) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `RETIRADOR` varchar(255) DEFAULT NULL,
  `USU_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ENTREGA_PRODUCTO_CONTRATO_USU_ID` (`USU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `entrega_producto_contrato`
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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcar la base de datos para la tabla `factura`
--

INSERT INTO `factura` (`ID`, `CANTIDADCUOTA`, `ESTADO`, `FECHA_EMISION`, `FECHA_VENCIMIENTO`, `MONTO_CUOTA`, `NRO_CUOTA`, `NRO_FACTURA`, `TIPO_FACTURA`, `TOTAL`) VALUES
(1, 1, NULL, '2016-02-15', '2016-02-15', 0, 1, '00001', 'TICKET', 0);

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

INSERT INTO `factura_detalle_factura` (`Factura_ID`, `detalle_ID`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fiado`
--

CREATE TABLE IF NOT EXISTS `fiado` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ANTICIPO` float DEFAULT NULL,
  `ANULADO` varchar(255) DEFAULT NULL,
  `ESTADO` varchar(255) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `NOMBREFIADOR` varchar(255) DEFAULT NULL,
  `SALDO` float DEFAULT NULL,
  `CUENTA_ID` bigint(20) DEFAULT NULL,
  `USU_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_FIADO_CUENTA_ID` (`CUENTA_ID`),
  KEY `FK_FIADO_USU_ID` (`USU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `fiado`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fiado_detallefiado`
--

CREATE TABLE IF NOT EXISTS `fiado_detallefiado` (
  `Fiado_ID` bigint(20) NOT NULL,
  `detalle_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Fiado_ID`,`detalle_ID`),
  KEY `FK_FIADO_DETALLEFIADO_detalle_ID` (`detalle_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `fiado_detallefiado`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localizacion`
--

CREATE TABLE IF NOT EXISTS `localizacion` (
  `ID` bigint(20) NOT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `CANTIDAD` float DEFAULT NULL,
  `ID_ALMACEN` varchar(255) DEFAULT NULL,
  `ID_PRODUCTO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `localizacion`
--

INSERT INTO `localizacion` (`ID`, `DESCRIPCION`, `CANTIDAD`, `ID_ALMACEN`, `ID_PRODUCTO`) VALUES
(1, 'NEGOCIO', 0, '1', '1'),
(3, 'NEGOCIO', 4, '2', '2'),
(5, 'NEGOCIO', 3, '3', '3'),
(7, 'NEGOCIO', 0, '4', '4'),
(9, 'NEGOCIO', 3, '5', '5'),
(51, 'NEGOCIO', 14, '6', '6'),
(53, 'NEGOCIO', 15, '7', '7'),
(55, 'NEGOCIO', 15, '8', '8'),
(57, 'NEGOCIO', 0, '9', '9'),
(101, 'NEGOCIO', 0, '10', '10'),
(103, 'NEGOCIO', 0, '11', '11'),
(151, 'NEGOCIO', 0, '12', '12'),
(201, 'NEGOCIO', 0, '13', '13'),
(251, 'NEGOCIO', 14, '14', '14'),
(253, 'NEGOCIO', 15, '15', '15'),
(301, 'NEGOCIO', 14, '16', '16'),
(351, 'NEGOCIO', 0, '17', '17'),
(401, 'NEGOCIO', 0, '18', '18'),
(451, 'NEGOCIO', 0, '19', '19'),
(501, 'NEGOCIO', 0, '20', '20'),
(551, 'NEGOCIO', 0, '21', '21'),
(553, 'NEGOCIO', 0, '22', '22'),
(601, 'NEGOCIO', 3, '23', '23'),
(651, 'NEGOCIO', 1, '24', '24'),
(701, 'NEGOCIO', 2, '25', '25'),
(703, 'NEGOCIO', 4, '26', '26'),
(751, 'NEGOCIO', 3, '27', '27'),
(753, 'NEGOCIO', 7, '28', '28'),
(801, 'NEGOCIO', 1, '29', '29'),
(851, 'NEGOCIO', 0, '30', '30'),
(853, 'NEGOCIO', 0, '31', '31'),
(855, 'NEGOCIO', 0, '32', '32'),
(901, 'NEGOCIO', 0, '33', '33'),
(951, 'NEGOCIO', 0, '34', '34'),
(953, 'NEGOCIO', 0, '35', '35'),
(955, 'NEGOCIO', 0, '36', '36'),
(957, 'NEGOCIO', 0, '37', '37'),
(1001, 'NEGOCIO', 0, '38', '38'),
(1003, 'NEGOCIO', 0, '39', '39'),
(1005, 'NEGOCIO', 0, '40', '40'),
(1007, 'NEGOCIO', 0, '41', '41'),
(1009, 'NEGOCIO', 0, '42', '42'),
(1011, 'NEGOCIO', 0, '43', '43'),
(1051, 'NEGOCIO', 0, '44', '44'),
(1053, 'NEGOCIO', 0, '45', '45'),
(1055, 'NEGOCIO', 0, '46', '46'),
(1057, 'NEGOCIO', 0, '47', '47'),
(1059, 'NEGOCIO', 0, '48', '48'),
(1061, 'NEGOCIO', 0, '49', '49'),
(1063, 'NEGOCIO', 0, '50', '50'),
(1065, 'NEGOCIO', 0, '51', '51'),
(1067, 'NEGOCIO', 0, '52', '52'),
(1069, 'NEGOCIO', 0, '53', '53'),
(1071, 'NEGOCIO', 0, '54', '54'),
(1073, 'NEGOCIO', 0, '55', '55'),
(1075, 'NEGOCIO', 7, '56', '56'),
(1077, 'NEGOCIO', 7, '57', '57'),
(1079, 'NEGOCIO', 4, '58', '58'),
(1081, 'NEGOCIO', 0, '59', '59'),
(1151, 'NEGOCIO', 0, '60', '60'),
(1153, 'NEGOCIO', 0, '61', '61'),
(1155, 'NEGOCIO', 0, '62', '62'),
(1157, 'NEGOCIO', 0, '63', '63'),
(1159, 'NEGOCIO', 0, '64', '64'),
(1161, 'NEGOCIO', 0, '65', '65'),
(1163, 'NEGOCIO', 4, '66', '66'),
(1165, 'NEGOCIO', 0, '67', '67'),
(1167, 'NEGOCIO', 0, '68', '68'),
(1169, 'NEGOCIO', 0, '69', '69'),
(1171, 'NEGOCIO', 0, '70', '70'),
(1173, 'NEGOCIO', 0, '71', '71'),
(1175, 'NEGOCIO', 0, '72', '72'),
(1177, 'NEGOCIO', 0, '73', '73'),
(1179, 'NEGOCIO', 4, '74', '74'),
(1181, 'NEGOCIO', 0, '75', '75'),
(1183, 'NEGOCIO', 0, '76', '76'),
(1185, 'NEGOCIO', 4, '77', '77'),
(1187, 'NEGOCIO', 0, '78', '78'),
(1189, 'NEGOCIO', 2, '79', '79'),
(1191, 'NEGOCIO', 2, '80', '80'),
(1193, 'NEGOCIO', 0, '81', '81'),
(1195, 'NEGOCIO', 0, '82', '82'),
(1197, 'NEGOCIO', 1, '83', '83'),
(1199, 'NEGOCIO', 3, '84', '84'),
(1201, 'NEGOCIO', 0, '85', '85'),
(1203, 'NEGOCIO', 0, '86', '86'),
(1205, 'NEGOCIO', 0, '87', '87'),
(1207, 'NEGOCIO', 5, '88', '88'),
(1209, 'NEGOCIO', 1, '89', '89'),
(1211, 'NEGOCIO', 0, '90', '90'),
(1213, 'NEGOCIO', 0, '91', '91'),
(1215, 'NEGOCIO', 0, '92', '92'),
(1217, 'NEGOCIO', 2, '93', '93'),
(1219, 'NEGOCIO', 0, '94', '94'),
(1221, 'NEGOCIO', 1, '95', '95'),
(1223, 'NEGOCIO', 0, '96', '96'),
(1225, 'NEGOCIO', 4, '97', '97'),
(1227, 'NEGOCIO', 1, '98', '98'),
(1229, 'NEGOCIO', 4, '99', '99'),
(1231, 'NEGOCIO', 7, '100', '100'),
(1233, 'NEGOCIO', 1, '101', '101'),
(1235, 'NEGOCIO', 6, '102', '102'),
(1237, 'NEGOCIO', 2, '103', '103'),
(1239, 'NEGOCIO', 0, '104', '104'),
(1241, 'NEGOCIO', 0, '105', '105'),
(1243, 'NEGOCIO', 0, '106', '106'),
(1245, 'NEGOCIO', 0, '107', '107'),
(1247, 'NEGOCIO', 1, '108', '108'),
(1249, 'NEGOCIO', 2, '109', '109'),
(1251, 'NEGOCIO', 2, '110', '110'),
(1253, 'NEGOCIO', 0, '111', '111'),
(1255, 'NEGOCIO', 0, '112', '112'),
(1257, 'NEGOCIO', 0, '113', '113'),
(1259, 'NEGOCIO', 4, '114', '114'),
(1261, 'NEGOCIO', 6, '115', '115'),
(1263, 'NEGOCIO', 0, '116', '116'),
(1265, 'NEGOCIO', 0, '117', '117'),
(1267, 'NEGOCIO', 0, '118', '118'),
(1269, 'NEGOCIO', 0, '119', '119'),
(1271, 'NEGOCIO', 0, '120', '120'),
(1273, 'NEGOCIO', 0, '121', '121'),
(1275, 'NEGOCIO', 0, '122', '122'),
(1277, 'NEGOCIO', 0, '123', '123'),
(1279, 'NEGOCIO', 0, '124', '124'),
(1281, 'NEGOCIO', 0, '125', '125'),
(1283, 'NEGOCIO', 0, '126', '126'),
(1285, 'NEGOCIO', 0, '127', '127'),
(1287, 'NEGOCIO', 0, '128', '128'),
(1289, 'NEGOCIO', 0, '129', '129'),
(1291, 'NEGOCIO', 0, '130', '130'),
(1293, 'NEGOCIO', 0, '131', '131'),
(1295, 'NEGOCIO', 0, '132', '132'),
(1297, 'NEGOCIO', 0, '133', '133'),
(1299, 'NEGOCIO', 0, '134', '134'),
(1301, 'NEGOCIO', 0, '135', '135'),
(1303, 'NEGOCIO', 0, '136', '136'),
(1305, 'NEGOCIO', 0, '137', '137'),
(1307, 'NEGOCIO', 0, '138', '138'),
(1309, 'NEGOCIO', 0, '139', '139'),
(1311, 'NEGOCIO', 0, '140', '140'),
(1313, 'NEGOCIO', 0, '141', '141'),
(1315, 'NEGOCIO', 0, '142', '142'),
(1317, 'NEGOCIO', 0, '143', '143'),
(1319, 'NEGOCIO', 0, '144', '144'),
(1321, 'NEGOCIO', 0, '145', '145'),
(1323, 'NEGOCIO', 0, '146', '146'),
(1325, 'NEGOCIO', 0, '147', '147'),
(1327, 'NEGOCIO', 0, '148', '148'),
(1329, 'NEGOCIO', 0, '149', '149'),
(1331, 'NEGOCIO', 0, '150', '150'),
(1333, 'NEGOCIO', 0, '151', '151'),
(1335, 'NEGOCIO', 0, '152', '152'),
(1337, 'NEGOCIO', 0, '153', '153'),
(1339, 'NEGOCIO', 0, '154', '154'),
(1341, 'NEGOCIO', 0, '155', '155'),
(1343, 'NEGOCIO', 0, '156', '156'),
(1345, 'NEGOCIO', 0, '157', '157'),
(1347, 'NEGOCIO', 0, '158', '158'),
(1349, 'NEGOCIO', 0, '159', '159'),
(1351, 'NEGOCIO', 0, '160', '160'),
(1353, 'NEGOCIO', 0, '161', '161'),
(1355, 'NEGOCIO', 0, '162', '162'),
(1357, 'NEGOCIO', 0, '163', '163'),
(1359, 'NEGOCIO', 0, '164', '164'),
(1361, 'NEGOCIO', 0, '165', '165'),
(1363, 'NEGOCIO', 0, '166', '166'),
(1365, 'NEGOCIO', 0, '167', '167'),
(1367, 'NEGOCIO', 0, '168', '168'),
(1369, 'NEGOCIO', 0, '169', '169'),
(1371, 'NEGOCIO', 0, '170', '170'),
(1373, 'NEGOCIO', 0, '171', '171'),
(1375, 'NEGOCIO', 0, '172', '172'),
(1377, 'NEGOCIO', 0, '173', '173'),
(1379, 'NEGOCIO', 0, '174', '174'),
(1381, 'NEGOCIO', 0, '175', '175'),
(1383, 'NEGOCIO', 0, '176', '176'),
(1385, 'NEGOCIO', 0, '177', '177'),
(1387, 'NEGOCIO', 0, '178', '178'),
(1389, 'NEGOCIO', 11, '179', '179'),
(1391, 'NEGOCIO', 22, '180', '180'),
(1393, 'NEGOCIO', 20, '181', '181'),
(1395, 'NEGOCIO', 4, '182', '182'),
(1397, 'NEGOCIO', 3, '183', '183'),
(1399, 'NEGOCIO', 5, '184', '184'),
(1401, 'NEGOCIO', 14, '185', '185'),
(1403, 'NEGOCIO', 0, '186', '186'),
(1405, 'NEGOCIO', 0, '187', '187'),
(1407, 'NEGOCIO', 19, '188', '188'),
(1409, 'NEGOCIO', 10, '189', '189'),
(1411, 'NEGOCIO', 9, '190', '190'),
(1413, 'NEGOCIO', 18, '191', '191'),
(1415, 'NEGOCIO', 4, '192', '192'),
(1417, 'NEGOCIO', 6, '193', '193'),
(1419, 'NEGOCIO', 2, '194', '194'),
(1421, 'NEGOCIO', 3, '195', '195'),
(1423, 'NEGOCIO', 8, '196', '196'),
(1425, 'NEGOCIO', 12, '197', '197'),
(1427, 'NEGOCIO', 21, '198', '198'),
(1429, 'NEGOCIO', 12, '199', '199'),
(1431, 'NEGOCIO', 15, '200', '200'),
(1433, 'NEGOCIO', 11, '201', '201'),
(1435, 'NEGOCIO', 3, '202', '202'),
(1437, 'NEGOCIO', 15, '203', '203'),
(1439, 'NEGOCIO', 5, '204', '204'),
(1441, 'NEGOCIO', 7, '205', '205'),
(1443, 'NEGOCIO', 5, '206', '206'),
(1445, 'NEGOCIO', 9, '207', '207'),
(1447, 'NEGOCIO', 0, '208', '208'),
(1449, 'NEGOCIO', 0, '209', '209'),
(1451, 'NEGOCIO', 0, '210', '210'),
(1453, 'NEGOCIO', 0, '211', '211'),
(1455, 'NEGOCIO', 0, '212', '212'),
(1457, 'NEGOCIO', 16, '213', '213'),
(1459, 'NEGOCIO', 11, '214', '214'),
(1461, 'NEGOCIO', 12, '215', '215'),
(1463, 'NEGOCIO', 17, '216', '216'),
(1465, 'NEGOCIO', 6, '217', '217'),
(1501, 'NEGOCIO', 0, '218', '218'),
(1503, 'NEGOCIO', 0, '219', '219'),
(1505, 'NEGOCIO', 0, '220', '220'),
(1507, 'NEGOCIO', 0, '221', '221'),
(1509, 'NEGOCIO', 1, '222', '222'),
(1511, 'NEGOCIO', 0, '223', '223'),
(1513, 'NEGOCIO', 0, '224', '224'),
(1515, 'NEGOCIO', 14, '225', '225'),
(1517, 'NEGOCIO', 26, '226', '226'),
(1519, 'NEGOCIO', 20, '227', '227'),
(1521, 'NEGOCIO', 0, '228', '228'),
(1523, 'NEGOCIO', 0, '229', '229'),
(1525, 'NEGOCIO', 0, '230', '230'),
(1527, 'NEGOCIO', 0, '231', '231'),
(1529, 'NEGOCIO', 0, '232', '232'),
(1531, 'NEGOCIO', 0, '233', '233'),
(1533, 'NEGOCIO', 0, '234', '234'),
(1535, 'NEGOCIO', 2, '235', '235'),
(1537, 'NEGOCIO', 4, '236', '236'),
(1539, 'NEGOCIO', 0, '237', '237'),
(1541, 'NEGOCIO', 1, '238', '238'),
(1543, 'NEGOCIO', 0, '239', '239'),
(1545, 'NEGOCIO', 0, '240', '240'),
(1547, 'NEGOCIO', 16, '241', '241'),
(1549, 'NEGOCIO', 0, '242', '242'),
(1551, 'NEGOCIO', 0, '243', '243'),
(1553, 'NEGOCIO', 0, '244', '244'),
(1555, 'NEGOCIO', 24, '245', '245'),
(1557, 'NEGOCIO', 18, '246', '246'),
(1559, 'NEGOCIO', 26, '247', '247'),
(1561, 'NEGOCIO', 6, '248', '248'),
(1563, 'NEGOCIO', 1, '249', '249'),
(1565, 'NEGOCIO', 2, '250', '250'),
(1567, 'NEGOCIO', 3, '251', '251'),
(1569, 'NEGOCIO', 2, '252', '252'),
(1571, 'NEGOCIO', 0, '253', '253'),
(1573, 'NEGOCIO', 0, '254', '254'),
(1575, 'NEGOCIO', 2, '255', '255'),
(1577, 'NEGOCIO', 0, '256', '256'),
(1579, 'NEGOCIO', 0, '257', '257'),
(1581, 'NEGOCIO', 0, '258', '258'),
(1583, 'NEGOCIO', 2, '259', '259'),
(1585, 'NEGOCIO', 1, '260', '260'),
(1587, 'NEGOCIO', 0, '261', '261'),
(1589, 'NEGOCIO', 0, '262', '262'),
(1591, 'NEGOCIO', 1, '263', '263'),
(1593, 'NEGOCIO', 0, '264', '264'),
(1595, 'NEGOCIO', 1, '265', '265'),
(1597, 'NEGOCIO', 0, '266', '266'),
(1599, 'NEGOCIO', 0, '267', '267'),
(1601, 'NEGOCIO', 0, '268', '268'),
(1603, 'NEGOCIO', 0, '269', '269'),
(1605, 'NEGOCIO', 0, '270', '270'),
(1607, 'NEGOCIO', 1, '271', '271'),
(1609, 'NEGOCIO', 3, '272', '272'),
(1611, 'NEGOCIO', 0, '273', '273'),
(1613, 'NEGOCIO', 0, '274', '274'),
(1615, 'NEGOCIO', 0, '275', '275'),
(1617, 'NEGOCIO', 0, '276', '276'),
(1619, 'NEGOCIO', 1, '277', '277'),
(1621, 'NEGOCIO', 0, '278', '278'),
(1623, 'NEGOCIO', 1, '279', '279'),
(1625, 'NEGOCIO', 0, '280', '280'),
(1627, 'NEGOCIO', 0, '281', '281'),
(1629, 'NEGOCIO', 0, '282', '282'),
(1631, 'NEGOCIO', 0, '283', '283'),
(1633, 'NEGOCIO', 2, '284', '284'),
(1635, 'NEGOCIO', 6, '285', '285'),
(1637, 'NEGOCIO', 4, '286', '286'),
(1639, 'NEGOCIO', 0, '287', '287'),
(1641, 'NEGOCIO', 0, '288', '288'),
(1643, 'NEGOCIO', 0, '289', '289'),
(1645, 'NEGOCIO', 0, '290', '290'),
(1647, 'NEGOCIO', 4, '291', '291'),
(1649, 'NEGOCIO', 0, '292', '292'),
(1651, 'NEGOCIO', 0, '293', '293'),
(1653, 'NEGOCIO', 0, '294', '294'),
(1655, 'NEGOCIO', 0, '295', '295'),
(1657, 'NEGOCIO', 0, '296', '296'),
(1659, 'NEGOCIO', 0, '297', '297'),
(1661, 'NEGOCIO', 0, '298', '298'),
(1663, 'NEGOCIO', 0, '299', '299'),
(1665, 'NEGOCIO', 4, '300', '300'),
(1667, 'NEGOCIO', 0, '301', '301'),
(1669, 'NEGOCIO', 0, '302', '302'),
(1671, 'NEGOCIO', 0, '303', '303'),
(1673, 'NEGOCIO', 0, '304', '304'),
(1675, 'NEGOCIO', 5, '305', '305'),
(1677, 'NEGOCIO', 0, '306', '306'),
(1679, 'NEGOCIO', 0, '307', '307'),
(1681, 'NEGOCIO', 0, '308', '308'),
(1683, 'NEGOCIO', 0, '309', '309'),
(1685, 'NEGOCIO', 0, '310', '310'),
(1687, 'NEGOCIO', 0, '311', '311'),
(1689, 'NEGOCIO', 2, '312', '312'),
(1691, 'NEGOCIO', 0, '313', '313'),
(1693, 'NEGOCIO', 0, '314', '314'),
(1695, 'NEGOCIO', 0, '315', '315'),
(1697, 'NEGOCIO', 0, '316', '316'),
(1699, 'NEGOCIO', 0, '317', '317'),
(1701, 'NEGOCIO', 0, '318', '318'),
(1703, 'NEGOCIO', 3, '319', '319'),
(1705, 'NEGOCIO', 0, '320', '320'),
(1707, 'NEGOCIO', 0, '321', '321'),
(1709, 'NEGOCIO', 0, '322', '322'),
(1711, 'NEGOCIO', 0, '323', '323'),
(1713, 'NEGOCIO', 0, '324', '324'),
(1715, 'NEGOCIO', 0, '325', '325'),
(1717, 'NEGOCIO', 10, '326', '326'),
(1719, 'NEGOCIO', 0, '327', '327'),
(1721, 'NEGOCIO', 0, '328', '328'),
(1723, 'NEGOCIO', 0, '329', '329'),
(1725, 'NEGOCIO', 9, '330', '330'),
(1727, 'NEGOCIO', 13, '331', '331'),
(1729, 'NEGOCIO', 8, '332', '332'),
(1731, 'NEGOCIO', 0, '333', '333'),
(1733, 'NEGOCIO', 0, '334', '334'),
(1735, 'NEGOCIO', 0, '335', '335'),
(1737, 'NEGOCIO', 0, '336', '336'),
(1739, 'NEGOCIO', 0, '337', '337'),
(1741, 'NEGOCIO', 0, '338', '338'),
(1743, 'NEGOCIO', 0, '339', '339'),
(1745, 'NEGOCIO', 0, '340', '340'),
(1747, 'NEGOCIO', 0, '341', '341'),
(1749, 'NEGOCIO', 0, '342', '342'),
(1751, 'NEGOCIO', 0, '343', '343'),
(1753, 'NEGOCIO', 0, '344', '344'),
(1755, 'NEGOCIO', 0, '345', '345'),
(1757, 'NEGOCIO', 0, '346', '346'),
(1759, 'NEGOCIO', 0, '347', '347'),
(1761, 'NEGOCIO', 0, '348', '348'),
(1763, 'NEGOCIO', 0, '349', '349'),
(1765, 'NEGOCIO', 0, '350', '350'),
(1767, 'NEGOCIO', 0, '351', '351'),
(1769, 'NEGOCIO', 0, '352', '352'),
(1771, 'NEGOCIO', 0, '353', '353'),
(1773, 'NEGOCIO', 0, '354', '354'),
(1775, 'NEGOCIO', 0, '355', '355'),
(1777, 'NEGOCIO', 0, '356', '356'),
(1779, 'NEGOCIO', 0, '357', '357'),
(1781, 'NEGOCIO', 0, '358', '358'),
(1801, 'NEGOCIO', 0, '359', '359'),
(1803, 'NEGOCIO', 0, '360', '360'),
(1805, 'NEGOCIO', 0, '361', '361'),
(1851, 'NEGOCIO', 1, '362', '362'),
(1853, 'NEGOCIO', 10, '363', '363'),
(1855, 'NEGOCIO', 10, '364', '364'),
(1857, 'NEGOCIO', 10, '365', '365'),
(1859, 'NEGOCIO', 5, '366', '366'),
(1861, 'NEGOCIO', 0, '367', '367'),
(1863, 'NEGOCIO', 20, '368', '368'),
(1865, 'NEGOCIO', 10, '369', '369'),
(1867, 'NEGOCIO', 5, '370', '370'),
(1869, 'NEGOCIO', 9, '371', '371'),
(1871, 'NEGOCIO', 4, '372', '372'),
(1873, 'NEGOCIO', 2, '373', '373'),
(1875, 'NEGOCIO', 3, '374', '374'),
(1877, 'NEGOCIO', 2, '375', '375'),
(1879, 'NEGOCIO', 1, '376', '376'),
(1881, 'NEGOCIO', 4, '377', '377'),
(1883, 'NEGOCIO', 0, '378', '378'),
(1885, 'NEGOCIO', 2, '379', '379'),
(1887, 'NEGOCIO', 9, '380', '380'),
(1889, 'NEGOCIO', 3, '381', '381'),
(1891, 'NEGOCIO', 0, '382', '382'),
(1893, 'NEGOCIO', 0, '383', '383'),
(1895, 'NEGOCIO', 3, '384', '384'),
(1897, 'NEGOCIO', 3, '385', '385'),
(1899, 'NEGOCIO', 2, '386', '386'),
(1901, 'NEGOCIO', 6, '387', '387'),
(1903, 'NEGOCIO', 2, '388', '388'),
(1905, 'NEGOCIO', 4, '389', '389'),
(1907, 'NEGOCIO', 0, '390', '390'),
(1909, 'NEGOCIO', 0, '391', '391'),
(1911, 'NEGOCIO', 0, '392', '392'),
(1913, 'NEGOCIO', 2, '393', '393'),
(1915, 'NEGOCIO', 2, '394', '394'),
(1917, 'NEGOCIO', 1, '395', '395'),
(1919, 'NEGOCIO', 0, '396', '396'),
(1921, 'NEGOCIO', 1, '397', '397'),
(1923, 'NEGOCIO', 1, '398', '398'),
(1925, 'NEGOCIO', 2, '399', '399'),
(1927, 'NEGOCIO', 2, '400', '400'),
(1929, 'NEGOCIO', 3, '401', '401'),
(1931, 'NEGOCIO', 6, '402', '402'),
(1933, 'NEGOCIO', 0, '403', '403'),
(1935, 'NEGOCIO', 0, '404', '404'),
(1937, 'NEGOCIO', 19, '405', '405'),
(1939, 'NEGOCIO', 8, '406', '406'),
(1941, 'NEGOCIO', 0, '407', '407'),
(1943, 'NEGOCIO', 6, '408', '408'),
(1945, 'NEGOCIO', 0, '409', '409'),
(1947, 'NEGOCIO', 1, '410', '410'),
(1949, 'NEGOCIO', 1, '411', '411'),
(1951, 'NEGOCIO', 2, '412', '412'),
(1953, 'NEGOCIO', 2, '413', '413'),
(1955, 'NEGOCIO', 3, '414', '414'),
(1957, 'NEGOCIO', 1, '415', '415'),
(1959, 'NEGOCIO', 0, '416', '416'),
(1961, 'NEGOCIO', 1, '417', '417'),
(1963, 'NEGOCIO', 1, '418', '418'),
(1965, 'NEGOCIO', 2, '419', '419'),
(1967, 'NEGOCIO', 8, '420', '420'),
(1969, 'NEGOCIO', 6, '421', '421'),
(1971, 'NEGOCIO', 1, '422', '422'),
(1973, 'NEGOCIO', 2, '423', '423'),
(1975, 'NEGOCIO', 2, '424', '424'),
(1977, 'NEGOCIO', 1, '425', '425'),
(1979, 'NEGOCIO', 2, '426', '426'),
(1981, 'NEGOCIO', 1, '427', '427'),
(1983, 'NEGOCIO', 1, '428', '428'),
(1985, 'NEGOCIO', 4, '429', '429'),
(1987, 'NEGOCIO', 2, '430', '430'),
(1989, 'NEGOCIO', 1, '431', '431'),
(1991, 'NEGOCIO', 3, '432', '432'),
(1993, 'NEGOCIO', 3, '433', '433'),
(1995, 'NEGOCIO', 0, '434', '434'),
(1997, 'NEGOCIO', 2, '435', '435'),
(1999, 'NEGOCIO', 2, '436', '436'),
(2001, 'NEGOCIO', 2, '437', '437'),
(2003, 'NEGOCIO', 2, '438', '438'),
(2005, 'NEGOCIO', 2, '439', '439'),
(2007, 'NEGOCIO', 1, '440', '440'),
(2009, 'NEGOCIO', 1, '441', '441'),
(2011, 'NEGOCIO', 17, '442', '442'),
(2013, 'NEGOCIO', 8, '443', '443'),
(2015, 'NEGOCIO', 0, '444', '444'),
(2017, 'NEGOCIO', 8, '445', '445'),
(2019, 'NEGOCIO', 7, '446', '446'),
(2021, 'NEGOCIO', 2, '447', '447'),
(2023, 'NEGOCIO', 14, '448', '448'),
(2025, 'NEGOCIO', 2, '449', '449'),
(2027, 'NEGOCIO', 2, '450', '450'),
(2029, 'NEGOCIO', 2, '451', '451'),
(2031, 'NEGOCIO', 3, '452', '452'),
(2033, 'NEGOCIO', 2, '453', '453'),
(2035, 'NEGOCIO', 4, '454', '454'),
(2037, 'NEGOCIO', 11, '455', '455'),
(2039, 'NEGOCIO', 5, '456', '456'),
(2041, 'NEGOCIO', 4, '457', '457'),
(2043, 'NEGOCIO', 2, '458', '458'),
(2045, 'NEGOCIO', 3, '459', '459'),
(2047, 'NEGOCIO', 2, '460', '460'),
(2049, 'NEGOCIO', 2, '461', '461'),
(2051, 'NEGOCIO', 2, '462', '462'),
(2053, 'NEGOCIO', 3, '463', '463'),
(2055, 'NEGOCIO', 1, '464', '464'),
(2057, 'NEGOCIO', 2, '465', '465'),
(2059, 'NEGOCIO', 4, '466', '466'),
(2061, 'NEGOCIO', 1, '467', '467'),
(2063, 'NEGOCIO', 1, '468', '468'),
(2065, 'NEGOCIO', 3, '469', '469'),
(2067, 'NEGOCIO', 3, '470', '470'),
(2069, 'NEGOCIO', 12, '471', '471'),
(2071, 'NEGOCIO', 4, '472', '472'),
(2073, 'NEGOCIO', 6, '473', '473'),
(2075, 'NEGOCIO', 2, '474', '474'),
(2077, 'NEGOCIO', 4, '475', '475'),
(2079, 'NEGOCIO', 4, '476', '476'),
(2081, 'NEGOCIO', 6, '477', '477'),
(2083, 'NEGOCIO', 4, '478', '478'),
(2085, 'NEGOCIO', 2, '479', '479'),
(2101, 'NEGOCIO', 18, '480', '480'),
(2103, 'NEGOCIO', 16, '481', '481'),
(2351, 'NEGOCIO', 2, '482', '482'),
(2353, 'NEGOCIO', 1, '483', '483'),
(2401, 'NEGOCIO', 3, '484', '484'),
(2403, 'NEGOCIO', 2, '485', '485'),
(2405, 'NEGOCIO', 3, '486', '486'),
(2407, 'NEGOCIO', 5, '487', '487'),
(2409, 'NEGOCIO', 5, '488', '488'),
(2411, 'NEGOCIO', 10, '489', '489'),
(2413, 'NEGOCIO', 10, '490', '490'),
(2451, 'NEGOCIO', 10, '491', '491');

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
-- Estructura de tabla para la tabla `organizacion`
--

CREATE TABLE IF NOT EXISTS `organizacion` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ANIO` varchar(255) DEFAULT NULL,
  `DIVISION` varchar(255) DEFAULT NULL,
  `DOMICILIO` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `TEL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `organizacion`
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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `pagocliente`
--

INSERT INTO `pagocliente` (`ID`, `ANULACION`, `FECHAPAGO`, `MONTO`, `TIPO_PAGO`, `CUENTA_ID`, `FACTURA_ID`, `VENTA_ID`) VALUES
(1, 'NO', '2016-02-15', 0, NULL, NULL, NULL, 1),
(2, 'NO', '2016-02-15', 0, NULL, NULL, NULL, 2),
(3, 'NO', '2016-02-15', 0, NULL, NULL, NULL, 3),
(4, 'NO', '2016-02-16', 0, NULL, NULL, NULL, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagocomprasinstock`
--

CREATE TABLE IF NOT EXISTS `pagocomprasinstock` (
  `ID` bigint(20) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  `USU_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PAGOCOMPRASINSTOCK_USU_ID` (`USU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `pagocomprasinstock`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personalizarcontrato`
--

CREATE TABLE IF NOT EXISTS `personalizarcontrato` (
  `ID` bigint(20) NOT NULL,
  `OBSERVACION` varchar(255) DEFAULT NULL,
  `TALLE` varchar(255) DEFAULT NULL,
  `ALUMNO_ID` bigint(20) DEFAULT NULL,
  `PRODUCTO_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PERSONALIZARCONTRATO_PRODUCTO_ID` (`PRODUCTO_ID`),
  KEY `FK_PERSONALIZARCONTRATO_ALUMNO_ID` (`ALUMNO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `personalizarcontrato`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precio`
--

CREATE TABLE IF NOT EXISTS `precio` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `PRECIO_CONTADO` float DEFAULT NULL,
  `PRECIO_REAL` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=492 ;

--
-- Volcar la base de datos para la tabla `precio`
--

INSERT INTO `precio` (`ID`, `PRECIO_CONTADO`, `PRECIO_REAL`) VALUES
(1, 120, 0),
(2, 120, 0),
(3, 120, 0),
(4, 120, 0),
(5, 120, 0),
(6, 120, 0),
(7, 120, 0),
(8, 120, 0),
(9, 120, 0),
(10, 120, 0),
(11, 120, 0),
(12, 120, 0),
(13, 120, 0),
(14, 120, 0),
(15, 120, 0),
(16, 120, 0),
(17, 400, 0),
(18, 400, 0),
(19, 400, 0),
(20, 400, 0),
(21, 400, 0),
(22, 400, 0),
(23, 180, 0),
(24, 180, 0),
(25, 180, 0),
(26, 180, 0),
(27, 180, 0),
(28, 180, 0),
(29, 180, 0),
(30, 180, 0),
(31, 0, 0),
(32, 180, 0),
(33, 180, 0),
(34, 180, 0),
(35, 180, 0),
(36, 180, 0),
(37, 180, 0),
(38, 180, 0),
(39, 180, 0),
(40, 180, 0),
(41, 180, 0),
(42, 180, 0),
(43, 180, 0),
(44, 180, 0),
(45, 180, 0),
(46, 180, 0),
(47, 180, 0),
(48, 180, 0),
(49, 180, 0),
(50, 180, 0),
(51, 180, 0),
(52, 180, 0),
(53, 180, 0),
(54, 180, 0),
(55, 150, 0),
(56, 150, 0),
(57, 150, 0),
(58, 150, 0),
(59, 400, 0),
(60, 400, 0),
(61, 400, 0),
(62, 400, 0),
(63, 400, 0),
(64, 400, 0),
(65, 400, 0),
(66, 400, 0),
(67, 400, 0),
(68, 400, 0),
(69, 400, 0),
(70, 400, 0),
(71, 400, 0),
(72, 400, 0),
(73, 400, 0),
(74, 400, 0),
(75, 400, 0),
(76, 400, 0),
(77, 400, 0),
(78, 400, 0),
(79, 400, 0),
(80, 400, 0),
(81, 400, 0),
(82, 400, 0),
(83, 400, 0),
(84, 400, 0),
(85, 400, 0),
(86, 400, 0),
(87, 400, 0),
(88, 400, 0),
(89, 400, 0),
(90, 400, 0),
(91, 400, 0),
(92, 400, 0),
(93, 400, 0),
(94, 400, 0),
(95, 400, 0),
(96, 400, 0),
(97, 400, 0),
(98, 400, 0),
(99, 400, 0),
(100, 400, 0),
(101, 400, 0),
(102, 400, 0),
(103, 400, 0),
(104, 400, 0),
(105, 400, 0),
(106, 400, 0),
(107, 400, 0),
(108, 400, 0),
(109, 400, 0),
(110, 400, 0),
(111, 400, 0),
(112, 400, 0),
(113, 400, 0),
(114, 400, 0),
(115, 400, 0),
(116, 400, 0),
(117, 400, 0),
(118, 400, 0),
(119, 400, 0),
(120, 400, 0),
(121, 400, 0),
(122, 400, 0),
(123, 400, 0),
(124, 400, 0),
(125, 400, 0),
(126, 400, 0),
(127, 400, 0),
(128, 400, 0),
(129, 400, 0),
(130, 400, 0),
(131, 400, 0),
(132, 400, 0),
(133, 400, 0),
(134, 400, 0),
(135, 400, 0),
(136, 400, 0),
(137, 400, 0),
(138, 400, 0),
(139, 400, 0),
(140, 400, 0),
(141, 400, 0),
(142, 400, 0),
(143, 150, 0),
(144, 150, 0),
(145, 150, 0),
(146, 150, 0),
(147, 150, 0),
(148, 120, 0),
(149, 120, 0),
(150, 120, 0),
(151, 120, 0),
(152, 120, 0),
(153, 120, 0),
(154, 120, 0),
(155, 120, 0),
(156, 120, 0),
(157, 120, 0),
(158, 150, 0),
(159, 150, 0),
(160, 150, 0),
(161, 150, 0),
(162, 150, 0),
(163, 150, 0),
(164, 150, 0),
(165, 150, 0),
(166, 150, 0),
(167, 150, 0),
(168, 150, 0),
(169, 150, 0),
(170, 150, 0),
(171, 150, 0),
(172, 150, 0),
(173, 150, 0),
(174, 150, 0),
(175, 150, 0),
(176, 150, 0),
(177, 150, 0),
(178, 120, 0),
(179, 120, 0),
(180, 120, 0),
(181, 120, 0),
(182, 120, 0),
(183, 120, 0),
(184, 120, 0),
(185, 120, 0),
(186, 120, 0),
(187, 120, 0),
(188, 120, 0),
(189, 120, 0),
(190, 120, 0),
(191, 120, 0),
(192, 120, 0),
(193, 120, 0),
(194, 120, 0),
(195, 120, 0),
(196, 120, 0),
(197, 120, 0),
(198, 120, 0),
(199, 120, 0),
(200, 120, 0),
(201, 120, 0),
(202, 120, 0),
(203, 120, 0),
(204, 120, 0),
(205, 120, 0),
(206, 120, 0),
(207, 120, 0),
(208, 120, 0),
(209, 120, 0),
(210, 120, 0),
(211, 120, 0),
(212, 120, 0),
(213, 120, 0),
(214, 120, 0),
(215, 120, 0),
(216, 120, 0),
(217, 120, 0),
(218, 120, 0),
(219, 120, 0),
(220, 200, 0),
(221, 120, 0),
(222, 120, 0),
(223, 120, 0),
(224, 120, 0),
(225, 120, 0),
(226, 120, 0),
(227, 120, 0),
(228, 120, 0),
(229, 135, 0),
(230, 120, 0),
(231, 0, 0),
(232, 0, 0),
(233, 0, 0),
(234, 0, 0),
(235, 180, 0),
(236, 180, 0),
(237, 180, 0),
(238, 180, 0),
(239, 180, 0),
(240, 180, 0),
(241, 180, 0),
(242, 180, 0),
(243, 180, 0),
(244, 180, 0),
(245, 120, 0),
(246, 120, 0),
(247, 120, 0),
(248, 120, 0),
(249, 120, 0),
(250, 150, 0),
(251, 180, 0),
(252, 150, 0),
(253, 150, 0),
(254, 180, 0),
(255, 150, 0),
(256, 120, 0),
(257, 120, 0),
(258, 120, 0),
(259, 120, 0),
(260, 120, 0),
(261, 120, 0),
(262, 120, 0),
(263, 0, 0),
(264, 290, 0),
(265, 290, 0),
(266, 290, 0),
(267, 290, 0),
(268, 290, 0),
(269, 290, 0),
(270, 290, 0),
(271, 290, 0),
(272, 290, 0),
(273, 290, 0),
(274, 290, 0),
(275, 290, 0),
(276, 290, 0),
(277, 290, 0),
(278, 290, 0),
(279, 290, 0),
(280, 290, 0),
(281, 290, 0),
(282, 290, 0),
(283, 290, 0),
(284, 150, 0),
(285, 150, 0),
(286, 150, 0),
(287, 150, 0),
(288, 150, 0),
(289, 150, 0),
(290, 150, 0),
(291, 150, 0),
(292, 150, 0),
(293, 150, 0),
(294, 150, 0),
(295, 150, 0),
(296, 150, 0),
(297, 150, 0),
(298, 150, 0),
(299, 150, 0),
(300, 150, 0),
(301, 150, 0),
(302, 150, 0),
(303, 150, 0),
(304, 150, 0),
(305, 150, 0),
(306, 150, 0),
(307, 150, 0),
(308, 150, 0),
(309, 150, 0),
(310, 150, 0),
(311, 150, 0),
(312, 150, 0),
(313, 120, 0),
(314, 120, 0),
(315, 120, 0),
(316, 120, 0),
(317, 120, 0),
(318, 120, 0),
(319, 120, 0),
(320, 120, 0),
(321, 120, 0),
(322, 120, 0),
(323, 120, 0),
(324, 120, 0),
(325, 120, 0),
(326, 120, 0),
(327, 120, 0),
(328, 120, 0),
(329, 120, 0),
(330, 0, 0),
(331, 0, 0),
(332, 0, 0),
(333, 0, 0),
(334, 0, 0),
(335, 0, 0),
(336, 120, 0),
(337, 120, 0),
(338, 120, 0),
(339, 120, 0),
(340, 120, 0),
(341, 120, 0),
(342, 120, 0),
(343, 120, 0),
(344, 120, 0),
(345, 120, 0),
(346, 120, 0),
(347, 120, 0),
(348, 120, 0),
(349, 0, 0),
(350, 0, 0),
(351, 0, 0),
(352, 0, 0),
(353, 0, 0),
(354, 0, 0),
(355, 0, 0),
(356, 0, 0),
(357, 0, 0),
(358, 0, 0),
(359, 100, 0),
(360, 120, 0),
(361, 135, 0),
(362, 120, 0),
(363, 120, 0),
(364, 120, 0),
(365, 120, 0),
(366, 120, 0),
(367, 120, 0),
(368, 120, 0),
(369, 120, 0),
(370, 120, 0),
(371, 120, 0),
(372, 120, 0),
(373, 120, 0),
(374, 120, 0),
(375, 120, 0),
(376, 120, 0),
(377, 120, 0),
(378, 120, 0),
(379, 120, 0),
(380, 120, 0),
(381, 120, 0),
(382, 120, 0),
(383, 120, 0),
(384, 120, 0),
(385, 120, 0),
(386, 120, 0),
(387, 120, 0),
(388, 120, 0),
(389, 120, 0),
(390, 120, 0),
(391, 120, 0),
(392, 120, 0),
(393, 120, 0),
(394, 120, 0),
(395, 120, 0),
(396, 120, 0),
(397, 120, 0),
(398, 120, 0),
(399, 120, 0),
(400, 120, 0),
(401, 120, 0),
(402, 140, 0),
(403, 140, 0),
(404, 140, 0),
(405, 140, 0),
(406, 140, 0),
(407, 140, 0),
(408, 140, 0),
(409, 140, 0),
(410, 140, 0),
(411, 140, 0),
(412, 140, 0),
(413, 140, 0),
(414, 140, 0),
(415, 140, 0),
(416, 140, 0),
(417, 140, 0),
(418, 140, 0),
(419, 140, 0),
(420, 140, 0),
(421, 140, 0),
(422, 290, 0),
(423, 290, 0),
(424, 290, 0),
(425, 290, 0),
(426, 290, 0),
(427, 290, 0),
(428, 290, 0),
(429, 150, 0),
(430, 150, 0),
(431, 150, 0),
(432, 400, 0),
(433, 400, 0),
(434, 400, 0),
(435, 400, 0),
(436, 400, 0),
(437, 0, 0),
(438, 0, 0),
(439, 0, 0),
(440, 0, 0),
(441, 0, 0),
(442, 120, 0),
(443, 0, 0),
(444, 180, 0),
(445, 180, 0),
(446, 180, 0),
(447, 180, 0),
(448, 120, 0),
(449, 120, 0),
(450, 120, 0),
(451, 120, 0),
(452, 180, 0),
(453, 180, 0),
(454, 180, 0),
(455, 180, 0),
(456, 180, 0),
(457, 180, 0),
(458, 400, 0),
(459, 400, 0),
(460, 400, 0),
(461, 400, 0),
(462, 400, 0),
(463, 400, 0),
(464, 400, 0),
(465, 400, 0),
(466, 400, 0),
(467, 120, 0),
(468, 120, 0),
(469, 120, 0),
(470, 120, 0),
(471, 100, 0),
(472, 120, 0),
(473, 120, 0),
(474, 100, 0),
(475, 0, 0),
(476, 0, 0),
(477, 120, 0),
(478, 145, 0),
(479, 135, 0),
(480, 100, 0),
(481, 100, 0),
(482, 400, 0),
(483, 0, 0),
(484, 120, 0),
(485, 170, 0),
(486, 0, 0),
(487, 0, 0),
(488, 0, 0),
(489, 0, 0),
(490, 0, 0),
(491, 0, 0);

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
  `DETALLER` int(11) DEFAULT NULL,
  `TALLE` varchar(255) DEFAULT NULL,
  `PROVEEDOR_ID` bigint(20) DEFAULT NULL,
  `PRECIO_ID` bigint(20) DEFAULT NULL,
  `UNIDAD_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PRODUCTO_PRECIO_ID` (`PRECIO_ID`),
  KEY `FK_PRODUCTO_PROVEEDOR_ID` (`PROVEEDOR_ID`),
  KEY `FK_PRODUCTO_UNIDAD_ID` (`UNIDAD_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=492 ;

--
-- Volcar la base de datos para la tabla `producto`
--

INSERT INTO `producto` (`ID`, `COD`, `DESCRIPCION`, `DETALLER`, `TALLE`, `PROVEEDOR_ID`, `PRECIO_ID`, `UNIDAD_ID`) VALUES
(1, '4242-1', 'REMERA BLANCA P/SUBLIMAR', 0, 'S', 1, 1, 1),
(2, '4242-2', 'REMERA BLANCA P/SUBLIMAR ', 0, 'M', 1, 2, 1),
(3, '4242-3', 'REMERA BLANCA P/SUBLIMAR ', 0, 'L', 1, 3, 1),
(4, '4242-4', 'REMERA BLANCA P/SUBLIMAR ', 0, 'XL', 1, 4, 1),
(5, '4242-5', 'REMERA CELESTE LISA ', 0, 'S', 1, 5, 1),
(6, '4242-6', 'REMERA CELESTE LISA ', 0, 'M', 1, 6, 1),
(7, '4242-7', 'REMERA CELESTE LISA ', 0, 'L', 1, 7, 1),
(8, '4242-8', 'REMERA CELESTE LISA ', 0, 'XL', 1, 8, 1),
(9, '4242-9', 'REMERA MORADA LISA', 0, 'S', 1, 9, 1),
(10, '4242-10', 'REMERA MORADA LISA', 0, 'M', 1, 10, 1),
(11, '4242-11', 'REMERA MORADA LISA', 0, 'L', 1, 11, 1),
(12, '4242-12', 'REMERA MORADA LISA', 0, 'XL', 1, 12, 1),
(13, '4242-13', 'REMERA BORDO LISA', 0, 'S', 1, 13, 1),
(14, '4242-14', 'REMERA BORDO LISA', 0, 'M', 1, 14, 1),
(15, '4242-15', 'REMERA BORDO LISA', 0, 'L', 1, 15, 1),
(16, '4242-16', 'REMERA BORDO LISA', 0, 'XL', 1, 16, 1),
(17, '4242-17', 'CHOMBA BLANCA CON CUELLO PIQUE', 0, 'XS', 1, 17, 1),
(18, '4242-18', 'CHOMBA BLANCA CON CUELLO PIQUE', 0, 'S', 1, 18, 1),
(19, '4242-19', 'CHOMBA BLANCA CON CUELLO PIQUE', 0, 'M', 1, 19, 1),
(20, '4242-20', 'CHOMBA BLANCA CON CUELLO PIQUE', 0, 'L', 1, 20, 1),
(21, '4242-21', 'CHOMBA BLANCA CON CUELLO PIQUE', 0, 'XL', 1, 21, 1),
(22, '4242-22', 'CHOMBA BLANCA CON CUELLO PIQUE', 0, 'XXL', 1, 22, 1),
(23, '4242-23', 'REMERA DAKAR NEGRA', 0, 'M', 1, 23, 1),
(24, '4242-24', 'REMERA DAKAR NEGRA', 0, 'L', 1, 24, 1),
(25, '4242-25', 'REMERA DAKAR NEGRA', 0, 'XL', 1, 25, 1),
(26, '4242-26', 'REMERA DAKAR NEGRA', 0, 'XXL', 1, 26, 1),
(27, '4242-27', 'REMERA DAKAR ROJA', 0, 'XS', 1, 27, 1),
(28, '4242-28', 'REMERA DAKAR ROJA', 0, 'S', 1, 28, 1),
(29, '4242-29', 'REMERA DAKAR ROJA', 0, 'M', 1, 29, 1),
(30, '4242-30', 'REMERA RUTA 40 BLANCA ', 0, 'S', 1, 30, 1),
(31, '4242-31', 'REMERA RUTA 40 BLANCA ', 0, 'M', 1, 31, 1),
(32, '4242-32', 'REMERA RUTA 40 BLANCA ', 0, 'L', 1, 32, 1),
(33, '4242-33', 'REMERA RUTA 40 BLANCA ', 0, 'XL', 1, 33, 1),
(34, '4242-34', 'REMERA RUTA 40 BLANCA ', 0, 'XXL', 1, 34, 1),
(35, '4242-35', 'REMERA RUTA 40 BEIG', 0, 'S', 1, 35, 1),
(36, '4242-36', 'REMERA RUTA 40 BEIG', 0, 'M', 1, 36, 1),
(37, '4242-37', 'REMERA RUTA 40 BEIG', 0, 'L', 1, 37, 1),
(38, '4242-38', 'REMERA RUTA 40 BEIG', 0, 'XL', 1, 38, 1),
(39, '4242-39', 'REMERA RUTA 40 BEIG', 0, 'XXL', 1, 39, 1),
(40, '4242-40', 'REMERA TIERRA MORENA', 0, 'S', 1, 40, 1),
(41, '4242-41', 'REMERA TIERRA MORENA', 0, 'M', 1, 41, 1),
(42, '4242-42', 'REMERA TIERRA MORENA', 0, 'L', 1, 42, 1),
(43, '4242-43', 'REMERA TIERRA MORENA', 0, 'XL', 1, 43, 1),
(44, '4242-44', 'REMERA TIERRA MORENA', 0, 'XXL', 1, 44, 1),
(45, '4242-45', 'REMERA PAJARRACO', 0, 'S', 1, 45, 1),
(46, '4242-46', 'REMERA PAJARRACO', 0, 'M', 1, 46, 1),
(47, '4242-47', 'REMERA PAJARRACO', 0, 'L', 1, 47, 1),
(48, '4242-48', 'REMERA PAJARRACO', 0, 'XL', 1, 48, 1),
(49, '4242-49', 'REMERA PAJARRACO', 0, 'XXL', 1, 49, 1),
(50, '4242-50', 'REMERA SERPIENTE', 0, 'S', 1, 50, 1),
(51, '4242-51', 'REMERA SERPIENTE', 0, 'M', 1, 51, 1),
(52, '4242-52', 'REMERA SERPIENTE', 0, 'L', 1, 52, 1),
(53, '4242-53', 'REMERA SERPIENTE', 0, 'XL', 1, 53, 1),
(54, '4242-54', 'REMERA SERPIENTE', 0, 'XXL', 1, 54, 1),
(55, '4242-55', 'REMERA CABALLO PERUANO BLANCA', 0, 'S', 1, 55, 1),
(56, '4242-56', 'REMERA CABALLO PERUANO BLANCA', 0, 'M', 1, 56, 1),
(57, '4242-57', 'REMERA CABALLO PERUANO BLANCA', 0, 'L', 1, 57, 1),
(58, '4242-58', 'REMERA CABALLO PERUANO BLANCA', 0, 'XL', 1, 58, 1),
(59, '4242-63', 'CHOMBA NEGRA PIQUE', 0, 'L', 1, 59, 1),
(60, '4242-64', 'CHOMBA NEGRA PIQUE', 0, 'S', 1, 60, 1),
(61, '4242-65', 'CHOMBA NEGRA PIQUE', 0, 'M', 1, 61, 1),
(62, '4242-66', 'CHOMBA NEGRA PIQUE', 0, 'XL', 1, 62, 1),
(63, '4242-67', 'CHOMBA NEGRA PIQUE', 0, 'XXL', 1, 63, 1),
(64, '4242-68', 'CHOMBA NEGRA PIQUE CON CUELLO BANDERA', 0, 'S', 1, 64, 1),
(65, '4242-69', 'CHOMBA NEGRA PIQUE CON CUELLO BANDERA', 0, 'M', 1, 65, 1),
(66, '4242-70', 'CHOMBA NEGRA PIQUE CON CUELLO BANDERA', 0, 'L', 1, 66, 1),
(67, '4242-71', 'CHOMBA NEGRA PIQUE CON CUELLO BANDERA', 0, 'XL', 1, 67, 1),
(68, '4242-72', 'CHOMBA NEGRA PIQUE CON CUELLO BANDERA', 0, 'XXL', 1, 68, 1),
(69, '4242-73', 'CHOMBA MARRON PIQUE CON CUELLO AZUL', 0, 'S', 1, 69, 1),
(70, '4242-74', 'CHOMBA MARRON PIQUE CON CUELLO AZUL', 0, 'M', 1, 70, 1),
(71, '4242-75', 'CHOMBA MARRON PIQUE CON CUELLO AZUL', 0, 'L', 1, 71, 1),
(72, '4242-76', 'CHOMBA MARRON PIQUE CON CUELLO AZUL', 0, 'XL', 1, 72, 1),
(73, '4242-77', 'CHOMBA MARRON PIQUE CON CUELLO AZUL', 0, 'XXL', 1, 73, 1),
(74, '4242-78', 'CHOMBA CELESTE PIQUE ', 0, 'S', 1, 74, 1),
(75, '4242-79', 'CHOMBA CELESTE PIQUE', 0, 'M', 1, 75, 1),
(76, '4242-80', 'CHOMBA CELESTE PIQUE', 0, 'L', 1, 76, 1),
(77, '4242-81', 'CHOMBA CELESTE PIQUE', 0, 'XL', 1, 77, 1),
(78, '4242-82', 'CHOMBA NARANJA PIQUE', 0, 'S', 1, 78, 1),
(79, '4242-83', 'CHOMBA NARANJA PIQUE', 0, 'M', 1, 79, 1),
(80, '4242-84', 'CHOMBA NARANJA PIQUE', 0, 'L', 1, 80, 1),
(81, '4242-85', 'CHOMBA NARANJA PIQUE', 0, 'XL', 1, 81, 1),
(82, '4242-86', 'CHOMBA NARANJA PIQUE', 0, 'XXL', 1, 82, 1),
(83, '4242-87', 'CHOMBA AMARILLA PIQUE', 0, 'S', 1, 83, 1),
(84, '4242-88', 'CHOMBA AMARILLA PIQUE', 0, 'M', 1, 84, 1),
(85, '4242-89', 'CHOMBA AMARRILLA PIQUE', 0, 'L', 1, 85, 1),
(86, '4242-90', 'CHOMBA AMARILLA PIQUE', 0, 'XL', 1, 86, 1),
(87, '4242-91', 'CHOMBA AMARILLA PIQUE', 0, 'XXL', 1, 87, 1),
(88, '4242-92', 'CHOMBA GRIS PIQUE CON CUELLO BANDERA', 0, 'S', 1, 88, 1),
(89, '4242-93', 'CHOMBA GRIS PIQUE CON CUELLO BANDERA', 0, 'M', 1, 89, 1),
(90, '4242-94', 'CHOMBA GRIS PIQUE CON CUELLO BANDERA', 0, 'L', 1, 90, 1),
(91, '4242-95', 'CHOMBA GRIS PIQUE CON CUELLO BANDERA', 0, 'XL', 1, 91, 1),
(92, '4242-96', 'CHOMBA GRIS PIQUE CON CUELLO BANDERA', 0, 'XXL', 1, 92, 1),
(93, '4242-97', 'CHOMBA BLANCA PIQUE CON CUELLO BANDERA AZUL', 0, 'S', 1, 93, 1),
(94, '4242-98', 'CHOMBA BLANCA PIQUE CON CUELLO BANDERA AZUL', 0, 'M', 1, 94, 1),
(95, '4242-99', 'CHOMBA BLANCA PIQUE CON CUELLO BANDERA AZUL', 0, 'L', 1, 95, 1),
(96, '4242-100', 'CHOMBA BLANCA PIQUE CON CUELLO BANDERA AZUL', 0, 'XL', 1, 96, 1),
(97, '4242-101', 'CHOMBA BLANCA PIQUE', 0, 'S', 1, 97, 1),
(98, '4242-102', 'CHOMBA BLANCA PIQUE', 0, 'M', 1, 98, 1),
(99, '4242-103', 'CHOMBA BLANCA PIQUE', 0, 'L', 1, 99, 1),
(100, '4242-104', 'CHOMBA BLANCA PIQUE', 0, 'XL', 1, 100, 1),
(101, '4242-105', 'CHOMBA BLANCA PIQUE', 0, 'XXL', 1, 101, 1),
(102, '4242-106', 'CHOMBA NEGRA CON SALMON ALGODON', 0, 'S', 1, 102, 1),
(103, '4242-107', 'CHOMBA NEGRA CON SALMON ALGODON', 0, 'M', 1, 103, 1),
(104, '4242-108', 'CHOMBA NEGRA CON SALMON ALGODON', 0, '14', 1, 104, 1),
(105, '4242-109', 'CHOMBA NEGRA CON SALMON ALGODON', 0, 'L', 1, 105, 1),
(106, '4242-110', 'CHOMBA NEGRA CON SALMON ALGODON', 0, 'XL', 1, 106, 1),
(107, '4242-111', 'CHOMBA NEGRA CON SALMON ALGODON', 0, 'XXL', 1, 107, 1),
(108, '4242-112', 'CHOMBA ROSADA CON CUELLO NEGRO ALGODON', 0, 'S', 1, 108, 1),
(109, '4242-113', 'CHOMBA ROSADA CON CUELLO NEGRO ALGODON', 0, 'M', 1, 109, 1),
(110, '4242-114', 'CHOMBA ROSADA CON CUELLO NEGRO ALGODON', 0, 'L', 1, 110, 1),
(111, '4242-115', 'CHOMBA ROSADA CON CUELLO NEGRO ALGODON', 0, 'XL', 1, 111, 1),
(112, '4242-116', 'CHOMBA ROSADA CON CUELLO NEGRO ALGODON', 0, 'XXL', 1, 112, 1),
(113, '4242-117', 'CHOMBA COMBINADA(VERDE,AZUL Y ROJO)', 0, 'S', 1, 113, 1),
(114, '4242-118', 'CHOMBA COMBINADA(VERDE,AZUL Y ROJO)', 0, 'L', 1, 114, 1),
(115, '4242-119', 'CHOMBA COMBINADA(VERDE,AZUL Y ROJO)', 0, 'M', 1, 115, 1),
(116, '4242-120', 'CHOMBA COMBINADA(VERDE,AZUL Y ROJO)', 0, 'XL', 1, 116, 1),
(117, '4242-121', 'CHOMBA COMBINADA(VERDE,AZUL Y ROJO)', 0, 'XXL', 1, 117, 1),
(118, '4242-122', 'CHOMBA GRIS CON CUELLO GRIS Y ZUL', 0, 'S', 1, 118, 1),
(119, '4242-123', 'CHOMBA GRIS CON CUELLO GRIS Y ZUL', 0, 'M', 1, 119, 1),
(120, '4242-124', 'CHOMBA GRIS CON CUELLO GRIS Y ZUL', 0, 'L', 1, 120, 1),
(121, '4242-125', 'CHOMBA GRIS CON CUELLO GRIS Y ZUL', 0, 'XL', 1, 121, 1),
(122, '4242-126', 'CHOMBA GRIS CON CUELLO GRIS Y ZUL', 0, 'XXL', 1, 122, 1),
(123, '4242-127', 'CHOMBA AZUL CON CUELLO AZUL Y GRIS', 0, 'S', 1, 123, 1),
(124, '4242-128', 'CHOMBA AZUL CON CUELLO AZUL Y GRIS', 0, 'M', 1, 124, 1),
(125, '4242-129', 'CHOMBA AZUL CON CUELLO AZUL Y GRIS', 0, 'L', 1, 125, 1),
(126, '4242-130', 'CHOMBA AZUL CON CUELLO AZUL Y GRIS', 0, 'XL', 1, 126, 1),
(127, '4242-131', 'CHOMBA AZUL CON CUELLO AZUL Y GRIS', 0, 'XXL', 1, 127, 1),
(128, '4242-132', 'CHOMBA AZUL CON CUELLO GRIS Y AZUL', 0, 'S', 1, 128, 1),
(129, '4242-133', 'CHOMBA AZUL CON CUELLO GRIS Y AZUL', 0, 'M', 1, 129, 1),
(130, '4242-134', 'CHOMBA AZUL CON CUELLO GRIS Y AZUL', 0, 'L', 1, 130, 1),
(131, '4242-135', 'CHOMBA AZUL CON CUELLO GRIS Y AZUL', 0, 'XL', 1, 131, 1),
(132, '4242-136', 'CHOMBA AZUL CON CUELLO GRIS Y AZUL', 0, 'XXL', 1, 132, 1),
(133, '4242-137', 'CHOMBA AZUL CON CUELLO BLANCO CON AZUL', 0, 'S', 1, 133, 1),
(134, '4242-138', 'CHOMBA AZUL CON CUELLO BLANCO CON AZUL', 0, 'M', 1, 134, 1),
(135, '4242-139', 'CHOMBA AZUL CON CUELLO BLANCO CON AZUL', 0, 'L', 1, 135, 1),
(136, '4242-140', 'CHOMBA AZUL CON CUELLO BLANCO CON AZUL', 0, 'XL', 1, 136, 1),
(137, '4242-141', 'CHOMBA AZUL CON CUELLO BLANCO CON AZUL', 0, 'XXL', 1, 137, 1),
(138, '4242-142', 'CHOMBA AZUL MARINO CON CUELLO AZUL CON BLANCO', 0, 'S', 1, 138, 1),
(139, '4242-143', 'CHOMBA AZUL MARINO CON CUELLO AZUL CON BLANCO', 0, 'M', 1, 139, 1),
(140, '4242-144', 'CHOMBA AZUL MARINO CON CUELLO AZUL CON BLANCO', 0, 'L', 1, 140, 1),
(141, '4242-145', 'CHOMBA AZUL MARINO CON CUELLO AZUL CON BLANCO', 0, 'XL', 1, 141, 1),
(142, '4242-146', 'CHOMBA AZUL MARINO CON CUELLO AZUL CON BLANCO', 0, 'XXL', 1, 142, 1),
(143, '4242-147', 'REMERA VIRGEN', 0, 'S', 1, 143, 1),
(144, '4242-148', 'REMERA VIRGEN', 0, 'M', 1, 144, 1),
(145, '4242-149', 'REMERA VIRGEN', 0, 'L', 1, 145, 1),
(146, '4242-150', 'REMERA VIRGEN', 0, 'XL', 1, 146, 1),
(147, '4242-151', 'REMERA VIRGEN', 0, 'XXL', 1, 147, 1),
(148, '4242-152', 'REMERA COSQUIN ROCK BLANCA', 0, 'S', 1, 148, 1),
(149, '4242-153', 'REMERA COSQUIN ROCK BLANCA', 0, 'M', 1, 149, 1),
(150, '4242-154', 'REMERA COSQUIN ROCK BLANCA', 0, 'L', 1, 150, 1),
(151, '4242-155', 'REMERA COSQUIN ROCK BLANCA', 0, 'XL', 1, 151, 1),
(152, '4242-156', 'REMERA COSQUIN ROCK BLANCA', 0, 'XXL', 1, 152, 1),
(153, '4242-157', 'REMERA COSQUIN ROCK NEGRA', 0, 'S', 1, 153, 1),
(154, '4242-158', 'REMERA COSQUIN ROCK NEGRA', 0, 'M', 1, 154, 1),
(155, '4242-159', 'REMERA COSQUIN ROCK NEGRA', 0, 'L', 1, 155, 1),
(156, '4242-160', 'REMERA COSQUIN ROCK NEGRA', 0, 'XL', 1, 156, 1),
(157, '4242-161', 'REMERA COSQUIN ROCK NEGRA', 0, 'XXL', 1, 157, 1),
(158, '4242-162', 'MUSCULOSA GRIS LISA', 0, 'S', 1, 158, 1),
(159, '4242-163', 'MUSCULOSA GRIS LISA', 0, 'M', 1, 159, 1),
(160, '4242-164', 'MUSCULOSA GRIS LISA', 0, 'L', 1, 160, 1),
(161, '4242-165', 'MUSCULOSA GRIS LISA', 0, 'XL', 1, 161, 1),
(162, '4242-166', 'MUSCULOSA GRIS LISA', 0, 'XXL', 1, 162, 1),
(163, '4242-167', 'MUSCULOSA AZUL LISA', 0, 'S', 1, 163, 1),
(164, '4242-168', 'MUSCULOSA AZUL LISA', 0, 'M', 1, 164, 1),
(165, '4242-169', 'MUSCULOSA AZUL LISA', 0, 'L', 1, 165, 1),
(166, '4242-170', 'MUSCULOSA AZUL LISA', 0, 'XL', 1, 166, 1),
(167, '4242-171', 'MUSCULOSA AZUL LISA', 0, 'XXL', 1, 167, 1),
(168, '4242-172', 'MUSCULOSA VERDE LISA', 0, 'S', 1, 168, 1),
(169, '4242-173', 'MUSCULOSA VERDE LISA', 0, 'M', 1, 169, 1),
(170, '4242-174', 'MUSCULOSA VERDE LISA', 0, 'L', 1, 170, 1),
(171, '4242-175', 'MUSCULOSA VERDE LISA', 0, 'XL', 1, 171, 1),
(172, '4242-176', 'MUSCULOSA VERDE LISA', 0, 'XXL', 1, 172, 1),
(173, '4242-177', 'MUSCULOSA NEGRA LISA', 0, 'S', 1, 173, 1),
(174, '4242-178', 'MUSCULOSA NEGRA LISA', 0, 'M', 1, 174, 1),
(175, '4242-179', 'MUSCULOSA NEGRA LISA', 0, 'L', 1, 175, 1),
(176, '4242-180', 'MUSCULOSA NEGRA LISA', 0, 'XXL', 1, 176, 1),
(177, '4242-181', 'MUSCULOSA NEGRA LISA', 0, 'XL', 1, 177, 1),
(178, '4242-182', 'REMERA NARANJA LISA', 0, 'S', 1, 178, 1),
(179, '4242-183', 'REMERA NARANJA LISA', 0, 'M', 1, 179, 1),
(180, '4242-184', 'REMERA NARANJA LISA', 0, 'L', 1, 180, 1),
(181, '4242-185', 'REMERA NARANJA LISA', 0, 'XL', 1, 181, 1),
(182, '4242-186', 'REMERA NARANJA LISA', 0, 'XXL', 1, 182, 1),
(183, '4242-187', 'REMERA AMARILLA LISA', 0, 'S', 1, 183, 1),
(184, '4242-188', 'REMERA AMARILLA LISA', 0, 'M', 1, 184, 1),
(185, '4242-189', 'REMERA AMARILLA LISA', 0, 'L', 1, 185, 1),
(186, '4242-190', 'REMERA AMARILLA LISA', 0, 'XL', 1, 186, 1),
(187, '4242-191', 'REMERA AMARILLA LISA', 0, 'XXL', 1, 187, 1),
(188, '4242-192', 'REMERA ROJA LISA', 0, 'S', 1, 188, 1),
(189, '4242-193', 'REMERA ROJA LISA', 0, 'M', 1, 189, 1),
(190, '4242-194', 'REMERA ROJA LISA', 0, 'L', 1, 190, 1),
(191, '4242-195', 'REMERA ROJA LISA', 0, 'XL', 1, 191, 1),
(192, '4242-196', 'REMERA ROJA LISA', 0, 'XXL', 1, 192, 1),
(193, '4242-197', 'REMERA AZUL FRANCIA LISA', 0, 'S', 1, 193, 1),
(194, '4242-198', 'REMERA AZUL FRANCIA LISA', 0, 'M', 1, 194, 1),
(195, '4242-199', 'REMERA AZUL FRANCIA LISA', 0, 'L', 1, 195, 1),
(196, '4242-200', 'REMERA AZUL FRANCIA LISA', 0, 'XL', 1, 196, 1),
(197, '4242-201', 'REMERA AZUL FRANCIA LISA', 0, 'XXL', 1, 197, 1),
(198, '4242-202', 'REMERA AZUL MARINO LISA', 0, 'S', 1, 198, 1),
(199, '4242-203', 'REMERA AZUL MARINO LISA', 0, 'M', 1, 199, 1),
(200, '4242-204', 'REMERA AZUL MARINO LISA', 0, 'L', 1, 200, 1),
(201, '4242-205', 'REMERA AZUL MARINO LISA', 0, 'XL', 1, 201, 1),
(202, '4242-206', 'REMERA AZUL MARINO LISA', 0, 'XXL', 1, 202, 1),
(203, '4242-207', 'REMERA NEGRA LISA', 0, 'S', 1, 203, 1),
(204, '4242-208', 'REMERA NEGRA LISA', 0, 'M', 1, 204, 1),
(205, '4242-209', 'REMERA NEGRA LISA', 0, 'L', 1, 205, 1),
(206, '4242-210', 'REMERA NEGRA LISA', 0, 'XL', 1, 206, 1),
(207, '4242-211', 'REMERA NEGRA LISA', 0, 'XXL', 1, 207, 1),
(208, '4242-212', 'REMERA AZUL FRANCIA CON BLANCO', 0, 'S', 1, 208, 1),
(209, '4242-213', 'REMERA AZUL FRANCIA CON BLANCO', 0, 'M', 1, 209, 1),
(210, '4242-214', 'REMERA AZUL FRANCIA CON BLANCO', 0, 'L', 1, 210, 1),
(211, '4242-215', 'REMERA AZUL FRANCIA CON BLANCO', 0, 'XL', 1, 211, 1),
(212, '4242-216', 'REMERA AZUL FRANCIA CON BLANCO', 0, 'XXL', 1, 212, 1),
(213, '4242-217', 'REMERA GRIS LISA', 0, 'S', 1, 213, 1),
(214, '4242-218', 'REMERA GRIS LISA', 0, 'M', 1, 214, 1),
(215, '4242-219', 'REMERA GRIS LISA', 0, 'L', 1, 215, 1),
(216, '4242-220', 'REMERA GRIS LISA', 0, 'XL', 1, 216, 1),
(217, '4242-221', 'REMERA GRIS LISA', 0, 'XXL', 1, 217, 1),
(218, '4242-222', 'GORRA NEGRA CON BORDE PLATEADO', 0, '', 1, 218, 1),
(219, '4242-223', 'GORRA GRIS CON BORDE PLATEADO', 0, '', 1, 219, 1),
(220, '4242-224', 'SOMBRERO DE PAJA DE BOCA', 0, '', 1, 220, 1),
(221, '4242-225', 'GORRA DE NIÑO', 0, '', 1, 221, 1),
(222, '4242-226', 'GORRA SAN LORENZO', 0, '', 1, 222, 1),
(223, '4242-227', 'GORRA DE RACING', 0, '', 1, 223, 1),
(224, '4242-228', 'REMERA MORADA LISA', 0, 'S', 1, 224, 1),
(225, '4242-229', 'REMERA MORADA LISA', 0, 'M', 1, 225, 1),
(226, '4242-230', 'REMERA MORADA LISA', 0, 'L', 1, 226, 1),
(227, '4242-231', 'REMERA MORADA LISA', 0, 'XL', 1, 227, 1),
(228, '4242-232', 'REMERA MORADA LISA', 0, 'XXL', 1, 228, 1),
(229, '4242-233', 'VASO TERMICO', 0, '', 1, 229, 1),
(230, '4242-234', 'GORRA TELA DE AVION', 0, '', 1, 230, 1),
(231, '4242-235', 'PARAGUA', 0, '', 1, 231, 1),
(232, '4242-236', 'EQUIPO NIÑO RIVER', 0, '10', 1, 232, 1),
(233, '4242-237', 'EQUIPO NIÑO DE BOCA', 0, '10', 1, 233, 1),
(234, '4242-238', 'EQUIIPO NIÑO BARSA', 0, '12', 1, 234, 1),
(235, '4242-239', 'REMERA BLANCA RUTA 40', 0, 'S', 1, 235, 1),
(236, '4242-240', 'REMERA BLANCA RUTA 40', 0, 'M', 1, 236, 1),
(237, '4242-241', 'REMERA BLANCA RUTA 40', 0, 'L', 1, 237, 1),
(238, '4242-242', 'REMERA BLANCA RUTA 40', 0, 'XL', 1, 238, 1),
(239, '4242-243', 'REMERA BLANCA RUTA 40', 0, 'XXL', 1, 239, 1),
(240, '4242-244', 'REMERA BEIGE RUTA 40', 0, 'S', 1, 240, 1),
(241, '4242-245', 'REMERA BEIGE RUTA 40', 0, 'M', 1, 241, 1),
(242, '4242-246', 'REMERA BEIGE RUTA 40', 0, 'L', 1, 242, 1),
(243, '4242-247', 'REMERA BEIGE RUTA 40', 0, 'XL', 1, 243, 1),
(244, '4242-248', 'REMERA BEIGE RUTA 40', 0, 'XXL', 1, 244, 1),
(245, '4242-249', 'REMERA BLANCA LISA', 0, 'S', 1, 245, 1),
(246, '4242-250', 'REMERA BLANCA LISA', 0, 'M', 1, 246, 1),
(247, '4242-251', 'REMERA BLANCA LISA', 0, 'L', 1, 247, 1),
(248, '4242-252', 'REMERA BLANCA LISA', 0, 'XL', 1, 248, 1),
(249, '4242-253', 'REMERA BLANCA LISA', 0, 'XXL', 1, 249, 1),
(250, '4242-254', 'GORRA DE BOCA', 0, '', 1, 250, 1),
(251, '4242-255', 'PILUFO DE BOCA', 0, '', 1, 251, 1),
(252, '4242-256', 'GORRA DE NIÑO DE BOCA', 0, '', 1, 252, 1),
(253, '4242-257', 'GORRA DE RIVER', 0, '', 1, 253, 1),
(254, '4242-258', 'PILUFO DE RIVER', 0, '', 1, 254, 1),
(255, '4242-259', 'GORRA DE INDEPENDIENTE', 0, '', 1, 255, 1),
(256, '4242-260', 'GORRA LISA BLANCA', 0, '', 1, 256, 1),
(257, '4242-261', 'GORRA LISA NEGRA', 0, '', 1, 257, 1),
(258, '4242-262', 'GORRA LISA GRIS TOPO', 0, '', 1, 258, 1),
(259, '4242-263', 'GORRA VERDE LISA', 0, '', 1, 259, 1),
(260, '4242-264', 'GORRA NARANJA LISA', 0, '', 1, 260, 1),
(261, '4242-265', 'GORRA AZUL CON BORDE PLATEADO', 0, '', 1, 261, 1),
(262, '4242-266', 'GORRA ROJA CON BORDES PLATEADO', 0, '', 1, 262, 1),
(263, '4242-267', 'CAMPERA CON CIERRE AZUL', 0, '10', 1, 263, 1),
(264, '4242-268', 'BUZO CON CUELLO REDONDO AZUL', 0, 'S', 1, 264, 1),
(265, '4242-269', 'BUZO CON CUELLO REDONDO AZUL', 0, 'M', 1, 265, 1),
(266, '4242-270', 'BUZO CON CUELLO REDONDO AZUL', 0, 'L', 1, 266, 1),
(267, '4242-271', 'BUZO CON CUELLO REDONDO AZUL', 0, 'XL', 1, 267, 1),
(268, '4242-272', 'BUZO CON CUELLO REDONDO AZUL', 0, 'XXL', 1, 268, 1),
(269, '4242-273', 'BUZOS BLANCO CON CAPUCHA', 0, 'S', 1, 269, 1),
(270, '4242-274', 'BUZO BLANCO CON CAPUCHA', 0, 'M', 1, 270, 1),
(271, '4242-275', 'BUZO BLANCO CON CAPUCHA', 0, 'L', 1, 271, 1),
(272, '4242-276', 'BUZO BLANCO CON CAPUCHA', 0, 'XL', 1, 272, 1),
(273, '4242-277', 'BUZO BLANCO CON CAPUCHA', 0, 'XXL', 1, 273, 1),
(274, '4242-278', 'BUZO NEGRO CON CAPUCHA', 0, 'S', 1, 274, 1),
(275, '4242-279', 'BUZO NEGRO CON CAPUCHA', 0, 'M', 1, 275, 1),
(276, '4242-280', 'BUZO NEGRO CON CAPUCHA', 0, 'L', 1, 276, 1),
(277, '4242-281', 'BUZO NEGRO CON CAPUCHA', 0, 'XL', 1, 277, 1),
(278, '4242-282', 'BUZO NEGRO CON CAPUCHA', 0, 'XXL', 1, 278, 1),
(279, '4242-283', 'BUZO GRIS CON CAPUCHA', 0, 'S', 1, 279, 1),
(280, '4242-284', 'BUZO GRIS CON CAPUCHA', 0, 'M', 1, 280, 1),
(281, '4242-285', 'BUZO GRIS CON CAPUCHA', 0, 'L', 1, 281, 1),
(282, '4242-286', 'BUZO GRIS CON CAPUCHA', 0, 'XL', 1, 282, 1),
(283, '4242-287', 'BUZO GRIS CON CAPUCHA', 0, 'XXL', 1, 283, 1),
(284, '4242-288', 'MUSCULOSA MUJER BLANCA', 0, 'S', 1, 284, 1),
(285, '4242-289', 'MUSCULOSA MUJER BLANCA', 0, 'M', 1, 285, 1),
(286, '4242-290', 'MUSCULOSA MUJER BLANCA', 0, 'L', 1, 286, 1),
(287, '4242-291', 'MUSCULOSA MUJER BLANCA', 0, 'XL', 1, 287, 1),
(288, '4242-292', 'MUSCULOSA MUJER BLANCA', 0, 'XXL', 1, 288, 1),
(289, '4242-293', 'MUSCULOSA MUJER AZUL OSCURO', 0, 'S', 1, 289, 1),
(290, '4242-294', 'MUSCULOSA MUJER AZUL OSCURO', 0, 'M', 1, 290, 1),
(291, '4242-295', 'MUSCULOSA MUJER AZUL OSCURO', 0, 'L', 1, 291, 1),
(292, '4242-296', 'MUSCULOSA MUJER AZUL OSCURO', 0, 'XL', 1, 292, 1),
(293, '4242-297', 'MUSCULOSA MUJER AZUL OSCURO', 0, 'XXL', 1, 293, 1),
(294, '4242-298', 'MUSCULOSA MUJER AMARRILLO', 0, 'S', 1, 294, 1),
(295, '4242-299', 'MUSCULOSA MUJER AMARRILLO', 0, 'M', 1, 295, 1),
(296, '4242-300', 'MUSCULOSA MUJER AMARRILLO', 0, 'L', 1, 296, 1),
(297, '4242-301', 'MUSCULOSA MUJER AMARRILLO', 0, 'XL', 1, 297, 1),
(298, '4242-302', 'MUSCULOSA MUJER NARANJA', 0, 'M', 1, 298, 1),
(299, '4242-303', 'MUSCULOSA MUJER NARANJA', 0, 'S', 1, 299, 1),
(300, '4242-304', 'MUSCULOSA MUJER NARANJA', 0, 'L', 1, 300, 1),
(301, '4242-305', 'MUSCULOSA MUJER NARANJA', 0, 'XL', 1, 301, 1),
(302, '4242-306', 'MUSCULOSA MUJER NARANJA', 0, 'XXL', 1, 302, 1),
(303, '4242-307', 'MUSCULOSA MUJER GRIS', 0, 'S', 1, 303, 1),
(304, '4242-308', 'MUSCULOSA MUJER GRIS', 0, 'M', 1, 304, 1),
(305, '4242-309', 'MUSCULOSA MUJER GRIS', 0, 'L', 1, 305, 1),
(306, '4242-310', 'MUSCULOSA MUJER GRIS', 0, 'XL', 1, 306, 1),
(307, '4242-311', 'MUSCULOSA MUJER GRIS', 0, 'XXL', 1, 307, 1),
(308, '4242-312', 'MUSCULOSA MUJER VERDE', 0, 'S', 1, 308, 1),
(309, '4242-313', 'MUSCULOSA MUJER VERDE', 0, 'M', 1, 309, 1),
(310, '4242-314', 'MUSCULOSA MUJER VERDE', 0, 'L', 1, 310, 1),
(311, '4242-315', 'MUSCULOSA MUJER VERDE', 0, 'XL', 1, 311, 1),
(312, '4242-316', 'MUSCULOSA MUJER VERDE', 0, 'XXL', 1, 312, 1),
(313, '4242-317', 'REMERA NIÑO VERDE', 0, '4', 1, 313, 1),
(314, '4242-318', 'REMERA NIÑO VERDE', 0, '6', 1, 314, 1),
(315, '4242-319', 'REMERA NIÑO VERDE', 0, '8', 1, 315, 1),
(316, '4242-320', 'REMERA NIÑO VERDE', 0, '10', 1, 316, 1),
(317, '4242-321', 'REMERA NIÑO VERDE', 0, '12', 1, 317, 1),
(318, '4242-322', 'REMERA NIÑO VERDE', 0, '14', 1, 318, 1),
(319, '4242-323', 'REMERA NIÑO AMARILLA', 0, '4', 1, 319, 1),
(320, '4242-324', 'REMERA NIÑO AMARILLA', 0, '6', 1, 320, 1),
(321, '4242-325', 'REMERA NIÑO AMARILLA', 0, '8', 1, 321, 1),
(322, '4242-326', 'REMERA NIÑO AMARILLA', 0, '10', 1, 322, 1),
(323, '4242-327', 'REMERA NIÑO AMARILLA', 0, '12', 1, 323, 1),
(324, '4242-328', 'REMERA NIÑO AMARILLA', 0, '14', 1, 324, 1),
(325, '4242-329', 'REMERA NIÑO NARANJA', 0, '6', 1, 325, 1),
(326, '4242-330', 'REMERA NIÑO NARANJA', 0, '4', 1, 326, 1),
(327, '4242-331', 'REMERA NIÑO NARANJA', 0, '10', 1, 327, 1),
(328, '4242-332', 'REMERA NIÑO NARANJA', 0, '12', 1, 328, 1),
(329, '4242-333', 'REMERA NIÑO NARANJA', 0, '14', 1, 329, 1),
(330, '4242-334', 'CAMISETA ACETATO ARGENTINA NIÑO', 0, '4', 1, 330, 1),
(331, '4242-335', 'CAMISETA ACETATO ARGENTINA NIÑO', 0, '6', 1, 331, 1),
(332, '4242-336', 'CAMISETA ACETATO ARGENTINA NIÑO', 0, '8', 1, 332, 1),
(333, '4242-337', 'CAMISETA ACETATO ARGENTINA NIÑO', 0, '10', 1, 333, 1),
(334, '4242-338', 'CAMISETA ACETATO ARGENTINA NIÑO', 0, '12', 1, 334, 1),
(335, '4242-339', 'CAMISETA ACETATO ARGENTINA NIÑO', 0, '14', 1, 335, 1),
(336, '4242-340', 'REMERA NIÑO ROJA', 0, '4', 1, 336, 1),
(337, '4242-341', 'REMERA NIÑO ROJA', 0, '6', 1, 337, 1),
(338, '4242-342', 'REMERA NIÑO ROJA', 0, '8', 1, 338, 1),
(339, '4242-343', 'REMERA NIÑO ROJA', 0, '10', 1, 339, 1),
(340, '4242-344', 'REMERA NIÑO ROJA', 0, '12', 1, 340, 1),
(341, '4242-345', 'REMERA NIÑO ROJA', 0, '12', 1, 341, 1),
(342, '4242-346', 'REMERA NIÑO ROJA', 0, '14', 1, 342, 1),
(343, '4242-347', 'REMERA MINIONS', 0, '4', 1, 343, 1),
(344, '4242-348', 'REMERA MINIONS', 0, '6', 1, 344, 1),
(345, '4242-349', 'REMERA MINIONS', 0, '8', 1, 345, 1),
(346, '4242-350', 'REMERA MINIONS', 0, '10', 1, 346, 1),
(347, '4242-351', 'REMERA MINIONS', 0, '12', 1, 347, 1),
(348, '4242-352', 'REMERA MINIONS', 0, '14', 1, 348, 1),
(349, '4242-353', 'CHALECO MICROFIBRA NEGRO', 0, 'S', 1, 349, 1),
(350, '4242-354', 'CHALECO MICROFIBRA NEGRO', 0, 'M', 1, 350, 1),
(351, '4242-355', 'CHALECO MICROFIBRA NEGRO', 0, 'L', 1, 351, 1),
(352, '4242-356', 'CHALECO MICROFIBRA NEGRO', 0, 'XL', 1, 352, 1),
(353, '4242-357', 'CHALECO MICROFIBRA NEGRO', 0, 'XXL', 1, 353, 1),
(354, '4242-358', 'CHALECO MICROFIBRA NEGRO CON AZUL', 0, 'S', 1, 354, 1),
(355, '4242-359', 'CHALECO MICROFIBRA NEGRO CON AZUL', 0, 'M', 1, 355, 1),
(356, '4242-360', 'CHALECO MICROFIBRA NEGRO CON AZUL', 0, 'L', 1, 356, 1),
(357, '4242-361', 'CHALECO MICROFIBRA NEGRO CON AZUL', 0, 'XL', 1, 357, 1),
(358, '4242-362', 'CHALECO MICROFIBRA NEGRO CON AZUL', 0, 'XXL', 1, 358, 1),
(359, '4242-363', 'TAZA PLASTICA', 0, '', 1, 359, 1),
(360, '4242-364', 'TAZA CERAMICA', 0, '', 1, 360, 1),
(361, '4242-365', 'JARRO TERMICO', 0, '', 1, 361, 1),
(362, '4242-366', 'REMERA NEGRA LISA', 0, 'XS', 1, 362, 1),
(363, '4242-367', 'REMERA LISA ROSADA', 0, '14', 1, 363, 1),
(364, '4242-368', 'REMERA LISA ROSA', 0, '16', 1, 364, 1),
(365, '4242-369', 'REMERA LISA VERDE', 0, 'XS', 1, 365, 1),
(366, '4242-370', 'REMERA LISA VERDE', 0, 'S', 1, 366, 1),
(367, '4242-371', 'REMERA LISA VERDE', 0, 'M', 1, 367, 1),
(368, '4242-372', 'REMERA LISA VERDE', 0, 'L', 1, 368, 1),
(369, '4242-373', 'REMERA LISA VERDE', 0, 'XL', 1, 369, 1),
(370, '4242-374', 'REMERA LISA VERDE', 0, 'XXL', 1, 370, 1),
(371, '4242-375', 'REMERA LISA ROJA', 0, '12', 1, 371, 1),
(372, '4242-376', 'REMERAS CELESTES LISA', 0, 'XS', 1, 372, 1),
(373, '4242-377', 'REMERA VERDE MANZANA ALE', 0, '14', 1, 373, 1),
(374, '4242-378', 'REMERA VERDE MANZANA ALE', 0, 'S', 1, 374, 1),
(375, '4242-379', 'REMERA VERDE MANZANA ALE', 0, 'L', 1, 375, 1),
(376, '4242-380', 'REMERA VERDE MANZANA', 0, 'XS', 1, 376, 1),
(377, '4242-381', 'REMERA VERDE MANZANA', 0, 'S', 1, 377, 1),
(378, '4242-382', 'REMERA VERDE MANZANA', 0, 'M', 1, 378, 1),
(379, '4242-383', 'REMERA VERDE MANZANA', 0, 'L', 1, 379, 1),
(380, '4242-384', 'REMERA VERDE MANZANA', 0, 'XL', 1, 380, 1),
(381, '4242-385', 'REMERA VERDE MANZANA', 0, 'XXL', 1, 381, 1),
(382, '4242-386', 'REMERA VERDE OSCURO', 0, 'S', 1, 382, 1),
(383, '4242-387', 'REMERA VERDE OSCURO', 0, 'M', 1, 383, 1),
(384, '4242-388', 'REMERA VERDE OSCURO', 0, 'L', 1, 384, 1),
(385, '4242-389', 'REMERA VERDE OSCURO', 0, 'XL', 1, 385, 1),
(386, '4242-390', 'REMERA NIÑO VERDE OLIVA', 0, '14', 1, 386, 1),
(387, '4242-391', 'REMERA NIÑO VERDE OLIVA', 0, '2', 1, 387, 1),
(388, '4242-392', 'REMERA LISA BEIGE', 0, 'XS', 1, 388, 1),
(389, '4242-393', 'REMERA LISA BEIGE', 0, 'S', 1, 389, 1),
(390, '4242-394', 'REMERA LISA BEIGE', 0, 'M', 1, 390, 1),
(391, '4242-395', 'REMERA LISA BEIGE', 0, 'L', 1, 391, 1),
(392, '4242-396', 'REMERA LISA BEIGE', 0, 'XL', 1, 392, 1),
(393, '4242-397', 'REMERA AZUL LISA ALE', 0, 'S', 1, 393, 1),
(394, '4242-398', 'REMERA AZUL LISA ALE', 0, 'M', 1, 394, 1),
(395, '4242-399', 'REMERA AZUL LISA ALE', 0, 'L', 1, 395, 1),
(396, '4242-400', 'REMERA AZUL LISA ALE', 0, 'XL', 1, 396, 1),
(397, '4242-401', 'REMERA AZUL LISA ALE', 0, 'XXL', 1, 397, 1),
(398, '4242-402', 'REMERA AZUL LISA ALE', 0, 'XXXL', 1, 398, 1),
(399, '4242-403', 'REMERA NARANJA LISA', 0, 'XS', 1, 399, 1),
(400, '4242-404', 'REMERA AMARILLA LISA', 0, '14', 1, 400, 1),
(401, '4242-405', 'REMERA AMARILLA LISA', 0, 'XS', 1, 401, 1),
(402, '4242-406', 'REMERA PARA SUBLIMAR HOMBRE', 0, '1', 1, 402, 1),
(403, '4242-407', 'REMERA PARA SUBLIMAR HOMBRE', 0, '2', 1, 403, 1),
(404, '4242-408', 'REMERA PARA SUBLIMAR HOMBRE', 0, '3', 1, 404, 1),
(405, '4242-409', 'REMERA PARA SUBLIMAR HOMBRE', 0, '4', 1, 405, 1),
(406, '4242-410', 'REMERA PARA SUBLIMAR HOMBRE', 0, '5', 1, 406, 1),
(407, '4242-411', 'REMERA PARA SUBLIMAR HOMBRE', 0, '6', 1, 407, 1),
(408, '4242-412', 'REMERA PARA SUBLIMAR MUJER', 0, '16', 1, 408, 1),
(409, '4242-413', 'REMERA PARA SUBLIMAR MUJER', 0, '1', 1, 409, 1),
(410, '4242-414', 'REMERA PARA SUBLIMAR MUJER', 0, '2', 1, 410, 1),
(411, '4242-415', 'REMERA PARA SUBLIMAR MUJER', 0, '3', 1, 411, 1),
(412, '4242-416', 'MUSCULOSA PARA SUBLIMAR MUJER', 0, '4', 1, 412, 1),
(413, '4242-417', 'REMERA PARA SUBLIMAR NIÑO', 0, '2', 1, 413, 1),
(414, '4242-418', 'REMERA PARA SUBLIMAR NIÑO', 0, '4', 1, 414, 1),
(415, '4242-419', 'REMERA PARA SUBLIMAR NIÑO', 0, '6', 1, 415, 1),
(416, '4242-420', 'REMERA PARA SUBLIMAR NIÑO', 0, '8', 1, 416, 1),
(417, '4242-421', 'REMERA PARA SUBLIMAR NIÑO', 0, '10', 1, 417, 1),
(418, '4242-422', 'REMERA PARA SUBLIMAR NIÑO', 0, '12', 1, 418, 1),
(419, '4242-423', 'REMERA PARA SUBLIMAR NIÑO', 0, '14', 1, 419, 1),
(420, '4242-424', 'REMERA PARA SUBLIMAR HOMBRE', 0, 'S', 1, 420, 1),
(421, '4242-425', 'REMERA PARA SUBLIMAR HOMBRE', 0, 'XL', 1, 421, 1),
(422, '4242-426', 'BUZO NARANJA CANGURITO', 0, 'XL', 1, 422, 1),
(423, '4242-427', 'BUZO CON CUELLO REDONDO GRIS', 0, 'S', 1, 423, 1),
(424, '4242-428', 'BUZO CON CUELLO REDONDO GRIS', 0, 'M', 1, 424, 1),
(425, '4242-429', 'BUZO CON CUELLO REDONDO GRIS', 0, 'L', 1, 425, 1),
(426, '4242-430', 'BUZO CON CUELLO REDONDO GRIS', 0, 'XL', 1, 426, 1),
(427, '4242-431', 'BUZO LILA CANGURITO', 0, '14', 1, 427, 1),
(428, '4242-432', 'BUZO CON CUELLO REDONDO ROJO', 0, 'XXL', 1, 428, 1),
(429, '4242-433', 'MUSCULOSA MUJER AMARILLA', 0, 'M', 1, 429, 1),
(430, '4242-434', 'MUSCULOSA MUJER AMARILLA', 0, 'L', 1, 430, 1),
(431, '4242-435', 'MUSCULOSA MUJER AMARILLA', 0, 'XL', 1, 431, 1),
(432, '4242-436', 'CHOMBA BLANCA PIQUE', 0, 'XS', 1, 432, 1),
(433, '4242-437', 'CHOMBA AZUL FRANCIA CON CUELLO BLANCO', 0, 'S', 1, 433, 1),
(434, '4242-438', 'CHOMBA AZUL FRANCIA CON CUELLO BLANCO', 0, 'M', 1, 434, 1),
(435, '4242-439', 'CHOMBA AZUL FRANCIA CON CUELLO BLANCO', 0, 'L', 1, 435, 1),
(436, '4242-440', 'CHOMBA AZUL FRANCIA CON CUELLO BLANCO', 0, 'XL', 1, 436, 1),
(437, '4242-441', 'CHAQUETILLA AZUL', 0, 'S', 1, 437, 1),
(438, '4242-442', 'CHAQUETILLA', 0, 'M', 1, 438, 1),
(439, '4242-443', 'CHAQUETILLA', 0, 'L', 1, 439, 1),
(440, '4242-444', 'CHAQUETILLA', 0, 'XL', 1, 440, 1),
(441, '4242-445', 'CHAQUETILLA', 0, 'XXL', 1, 441, 1),
(442, '4242-446', 'REMERA BLANCA LISA', 0, 'XS', 1, 442, 1),
(443, '4242-447', 'REMERA BLANCA LISA', 0, '16', 1, 443, 1),
(444, '4242-448', 'REMERA CABALLO PERUANO NEGRA', 0, 'S', 1, 444, 1),
(445, '4242-449', 'REMERA CABALLO PERUANO NEGRA', 0, 'M', 1, 445, 1),
(446, '4242-450', 'REMERA CABALLO PERUANO', 0, 'L', 1, 446, 1),
(447, '4242-451', 'REMERA CABALLO PERUANO NEGRA', 0, 'XL', 1, 447, 1),
(448, '4242-452', 'GORRA NEGRA', 0, '', 1, 448, 1),
(449, '4242-453', 'GORRA AZUL OSCURO CON BORDE PLATEADO', 0, '', 1, 449, 1),
(450, '4242-454', 'GORRA ROJA CON BORDE PLATEADO', 0, '', 1, 450, 1),
(451, '4242-455', 'GORRA BEIGE', 0, '', 1, 451, 1),
(452, '4242-456', 'REMERA BLANCA RUTA 40', 0, '10', 1, 452, 1),
(453, '4242-457', 'REMERA TIERRA NUESTRA', 0, 'S', 1, 453, 1),
(454, '4242-458', 'REMERA TIERRA NUESTRA', 0, 'M', 1, 454, 1),
(455, '4242-459', 'REMERA TIERRA NUESTRA', 0, 'L', 1, 455, 1),
(456, '4242-460', 'REMERA TIERRA NUESTRA', 0, 'XL', 1, 456, 1),
(457, '4242-461', 'REMERA TIERRA NUESTRA', 0, 'XXL', 1, 457, 1),
(458, '4242-462', 'CHOMBA BLANCA PIQUE CON CUELLO BANDERA AZUL', 0, 'XXL', 1, 458, 1),
(459, '4242-463', 'CHOMBA GRIS PIQUE CON CUELLO AZUL', 0, 'XXL', 1, 459, 1),
(460, '4242-464', 'CHOMBA GRIS PIQUE CON CUELLO AZUL', 0, 'XXXL', 1, 460, 1),
(461, '4242-465', 'CHOMBA PIQUE AZUL FRANCIA CON CUELLO GRIS', 0, 'XXL', 1, 461, 1),
(462, '4242-466', 'CHOMBA PIQUE AZUL FRANCIA CON CUELLO GRIS', 0, 'XXXL', 1, 462, 1),
(463, '4242-467', 'CHOMBA AMARILLA PIQUE', 0, 'L', 1, 463, 1),
(464, '4242-468', 'CHOMBA AZUL MARINO', 0, 'XXXL', 1, 464, 1),
(465, '4242-469', 'CHOMBA BEIGE CON CUELLO AZUL', 0, 'L', 1, 465, 1),
(466, '4242-470', 'CHOMBA BEIGE CON CUELLO AZUL', 0, 'XL', 1, 466, 1),
(467, '4242-471', 'REMERA ESCOTE EN V', 0, 'S', 1, 467, 1),
(468, '4242-472', 'REMERA ESCOTE EN V', 0, 'M', 1, 468, 1),
(469, '4242-473', 'MEDIAS PACK X3 HEAD', 0, '', 1, 469, 1),
(470, '4242-474', 'MEDIAS PACK X3 ADIDAS', 0, '', 1, 470, 1),
(471, '4242-475', 'MEDIAS FUTBOL', 0, '', 1, 471, 1),
(472, '4242-476', 'TAZA LISA CERAMICA', 0, '', 1, 472, 1),
(473, '4242-477', 'TAZA CON DISEÑO CERAMICA', 0, '', 1, 473, 1),
(474, '4242-478', 'TAZA PLASTICA CON DISEÑO', 0, '', 1, 474, 1),
(475, '4242-479', 'CHOPP', 0, '', 1, 475, 1),
(476, '4242-480', 'MATES ', 0, '', 1, 476, 1),
(477, '4242-481', 'CANTIMPLORA NIÑOS', 0, '', 1, 477, 1),
(478, '4242-482', 'JARRO TERMICO DE COLOR', 0, '', 1, 478, 1),
(479, '4242-483', 'JARRO TERMICO BLANCO', 0, '', 1, 479, 1),
(480, '4242-484', 'REMERA COSQUIN ROCK OUTLET', 0, '', 1, 480, 1),
(481, '4242-485', 'REMERA CURA BROCHERO OUTLET ', 0, '', 1, 481, 1),
(482, '4242-486', 'CHOMBA ALGODON RAYADA CELES Y AZUL', 0, 'S', 1, 482, 1),
(483, '4242-487', 'CONJUNTO COCINERO', 0, '', 1, 483, 1),
(484, '4242-488', 'MATE CERAMICO', 0, '', 1, 484, 1),
(485, '4242-489', 'JARRO TERMICO METAL', 0, '', 1, 485, 1),
(486, '4242-490', 'ROMPECABEZA PARA SUBLIMAR', 0, '', 1, 486, 1),
(487, '4242-491', 'CAJA PARA SUBLIMAR GRANDE', 0, '', 1, 487, 1),
(488, '4242-492', 'CAJA PARA SUBLIMAR CHICA', 0, '', 1, 488, 1),
(489, '4242-493', 'BOLSA DE RAZO BLANCO', 0, '', 1, 489, 1),
(490, '4242-494', 'BOLSA ECOLOGICA PARA SUBLIMAR', 0, '', 1, 490, 1),
(491, '4242-495', 'VINILO BLANCO', 1, '', 1, 491, 2);

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
-- Estructura de tabla para la tabla `responsable_contrato`
--

CREATE TABLE IF NOT EXISTS `responsable_contrato` (
  `ID` bigint(20) NOT NULL,
  `APELLIDO` varchar(255) DEFAULT NULL,
  `DNI` varchar(255) DEFAULT NULL,
  `DOMICILIO` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `TELEFONO` varchar(255) DEFAULT NULL,
  `TIPODOC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `responsable_contrato`
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
('SEQ_GEN', 2500);

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
(2, 'METROS'),
(3, 'CENTIMETROS');

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
(2152, 2153),
(2202, 2203),
(2252, 2253),
(2302, 2303);

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
(2151, 0, 0, 0, NULL, NULL, 2152),
(2201, 0, 0, 0, NULL, NULL, 2202),
(2251, 0, 0, 0, NULL, NULL, 2252),
(2301, 0, 0, 0, NULL, NULL, 2302);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcar la base de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID`, `NOMBRE`, `PASS`, `TIPO`) VALUES
(1, 'ADMIN', '123', 'ADMINISTRADOR'),
(2, 'fernando', '424148', 'ADMINISTRADOR'),
(3, 'cristina', '0211', 'ADMINISTRADOR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vale`
--

CREATE TABLE IF NOT EXISTS `vale` (
  `ID` bigint(20) NOT NULL,
  `OBSERVACION` varchar(255) DEFAULT NULL,
  `ANOMBRE` varchar(255) DEFAULT NULL,
  `ESTADO` varchar(255) DEFAULT NULL,
  `FEC` date DEFAULT NULL,
  `MONTO` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `vale`
--


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
  `USU_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_VENTA_USU_ID` (`USU_ID`),
  KEY `FK_VENTA_CLIENTE_ID` (`CLIENTE_ID`),
  KEY `FK_VENTA_TIPOVENTA_ID` (`TIPOVENTA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `venta`
--

INSERT INTO `venta` (`ID`, `ANULACION`, `DESCRIPCION`, `FECHA`, `MONTO`, `PAGOREGISTRADO`, `CLIENTE_ID`, `TIPOVENTA_ID`, `USU_ID`) VALUES
(1, 'NO', 'CONTADO', '2016-02-15', 0, 'SI', 1, 2151, 2),
(2, 'NO', 'CONTADO', '2016-02-15', 0, 'SI', 1, 2201, 2),
(3, 'NO', 'CONTADO', '2016-02-15', 0, 'SI', 1, 2251, 1),
(4, 'NO', 'CONTADO', '2016-02-16', 0, 'SI', 1, 2301, 1);

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
(1, 2),
(1, 3),
(2, 4),
(2, 5),
(2, 6),
(3, 7),
(4, 8);

--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD CONSTRAINT `FK_ALMACEN_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

--
-- Filtros para la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD CONSTRAINT `FK_ALUMNO_ORG_ID` FOREIGN KEY (`ORG_ID`) REFERENCES `organizacion` (`ID`);

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
  ADD CONSTRAINT `FK_COMPRAS_PROVEEDOR_ID` FOREIGN KEY (`PROVEEDOR_ID`) REFERENCES `proveedor` (`ID`),
  ADD CONSTRAINT `FK_COMPRAS_USU_ID` FOREIGN KEY (`USU_ID`) REFERENCES `usuario` (`ID`);

--
-- Filtros para la tabla `comprasinstock`
--
ALTER TABLE `comprasinstock`
  ADD CONSTRAINT `FK_COMPRASINSTOCK_CUENTA_ID` FOREIGN KEY (`CUENTA_ID`) REFERENCES `cuentaproveedorsinstock` (`ID`),
  ADD CONSTRAINT `FK_COMPRASINSTOCK_PROVEEDOR_ID` FOREIGN KEY (`PROVEEDOR_ID`) REFERENCES `proveedor` (`ID`),
  ADD CONSTRAINT `FK_COMPRASINSTOCK_USU_ID` FOREIGN KEY (`USU_ID`) REFERENCES `usuario` (`ID`);

--
-- Filtros para la tabla `comprasinstock_detalledecomprasinstock`
--
ALTER TABLE `comprasinstock_detalledecomprasinstock`
  ADD CONSTRAINT `CMPRASINSTOCKDETALLEDECOMPRASINSTOCKdtallecompraID` FOREIGN KEY (`detallecompra_ID`) REFERENCES `detalledecomprasinstock` (`ID`),
  ADD CONSTRAINT `CMPRSINSTOCKDETALLEDECOMPRASINSTOCKCmprasinStockID` FOREIGN KEY (`ComprasinStock_ID`) REFERENCES `comprasinstock` (`ID`);

--
-- Filtros para la tabla `compras_detalle_compra`
--
ALTER TABLE `compras_detalle_compra`
  ADD CONSTRAINT `FK_COMPRAS_DETALLE_COMPRA_Compras_ID` FOREIGN KEY (`Compras_ID`) REFERENCES `compras` (`ID`),
  ADD CONSTRAINT `FK_COMPRAS_DETALLE_COMPRA_detalle_compra_ID` FOREIGN KEY (`detalle_compra_ID`) REFERENCES `detalle_compra` (`ID`);

--
-- Filtros para la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD CONSTRAINT `FK_CONTRATO_CUENTA_CONTRATO_ID` FOREIGN KEY (`CUENTA_CONTRATO_ID`) REFERENCES `cuenta_contrato` (`ID`),
  ADD CONSTRAINT `FK_CONTRATO_ENTREGA_ID` FOREIGN KEY (`ENTREGA_ID`) REFERENCES `entrega_producto_contrato` (`ID`),
  ADD CONSTRAINT `FK_CONTRATO_ORGANIZACION_ID` FOREIGN KEY (`ORGANIZACION_ID`) REFERENCES `organizacion` (`ID`),
  ADD CONSTRAINT `FK_CONTRATO_USU_ID` FOREIGN KEY (`USU_ID`) REFERENCES `usuario` (`ID`);

--
-- Filtros para la tabla `contrato_alumno`
--
ALTER TABLE `contrato_alumno`
  ADD CONSTRAINT `FK_CONTRATO_ALUMNO_alumnos_ID` FOREIGN KEY (`alumnos_ID`) REFERENCES `alumno` (`ID`),
  ADD CONSTRAINT `FK_CONTRATO_ALUMNO_Contrato_ID` FOREIGN KEY (`Contrato_ID`) REFERENCES `contrato` (`ID`);

--
-- Filtros para la tabla `contrato_detalle_contrato`
--
ALTER TABLE `contrato_detalle_contrato`
  ADD CONSTRAINT `FK_CONTRATO_DETALLE_CONTRATO_Contrato_ID` FOREIGN KEY (`Contrato_ID`) REFERENCES `contrato` (`ID`),
  ADD CONSTRAINT `FK_CONTRATO_DETALLE_CONTRATO_detalle_contrato_ID` FOREIGN KEY (`detalle_contrato_ID`) REFERENCES `detalle_contrato` (`ID`);

--
-- Filtros para la tabla `contrato_personalizarcontrato`
--
ALTER TABLE `contrato_personalizarcontrato`
  ADD CONSTRAINT `CONTRATOPERSONALIZARCONTRATOComprapersonalizada_ID` FOREIGN KEY (`Comprapersonalizada_ID`) REFERENCES `personalizarcontrato` (`ID`),
  ADD CONSTRAINT `FK_CONTRATO_PERSONALIZARCONTRATO_Contrato_ID` FOREIGN KEY (`Contrato_ID`) REFERENCES `contrato` (`ID`);

--
-- Filtros para la tabla `contrato_responsable_contrato`
--
ALTER TABLE `contrato_responsable_contrato`
  ADD CONSTRAINT `FK_CONTRATO_RESPONSABLE_CONTRATO_Contrato_ID` FOREIGN KEY (`Contrato_ID`) REFERENCES `contrato` (`ID`),
  ADD CONSTRAINT `FK_CONTRATO_RESPONSABLE_CONTRATO_responsables_ID` FOREIGN KEY (`responsables_ID`) REFERENCES `responsable_contrato` (`ID`);

--
-- Filtros para la tabla `control`
--
ALTER TABLE `control`
  ADD CONSTRAINT `FK_CONTROL_ALMACEN_ID` FOREIGN KEY (`ALMACEN_ID`) REFERENCES `almacen` (`ID`),
  ADD CONSTRAINT `FK_CONTROL_COMPRA_ID` FOREIGN KEY (`COMPRA_ID`) REFERENCES `compras` (`ID`),
  ADD CONSTRAINT `FK_CONTROL_DEVOLUCION_ID` FOREIGN KEY (`DEVOLUCION_ID`) REFERENCES `devolucion` (`ID`),
  ADD CONSTRAINT `FK_CONTROL_VENTA_ID` FOREIGN KEY (`VENTA_ID`) REFERENCES `venta` (`ID`);

--
-- Filtros para la tabla `cuentafiado_detallecuentafiado`
--
ALTER TABLE `cuentafiado_detallecuentafiado`
  ADD CONSTRAINT `CNTAFIADODETALLECUENTAFIADOlstdetallecuentafiadoID` FOREIGN KEY (`listadetallecuentafiado_ID`) REFERENCES `detallecuentafiado` (`ID`),
  ADD CONSTRAINT `FK_CUENTAFIADO_DETALLECUENTAFIADO_CuentaFiado_ID` FOREIGN KEY (`CuentaFiado_ID`) REFERENCES `cuentafiado` (`ID`);

--
-- Filtros para la tabla `cuentaproveedorsinstock_detallecuentaprovedorsinstock`
--
ALTER TABLE `cuentaproveedorsinstock_detallecuentaprovedorsinstock`
  ADD CONSTRAINT `CNTPRVDRSINSTOCKDETALLECUENTAPROVEDORSINSTOCKdtllD` FOREIGN KEY (`detalle_ID`) REFERENCES `detallecuentaprovedorsinstock` (`ID`),
  ADD CONSTRAINT `CNTPRVDRSNSTCKDTLLCNTPRVDORSINSTOCKCntPrvdrSnStckD` FOREIGN KEY (`CuentaProveedorSinStock_ID`) REFERENCES `cuentaproveedorsinstock` (`ID`);

--
-- Filtros para la tabla `cuenta_cliente_detalle_cuenta_cliente`
--
ALTER TABLE `cuenta_cliente_detalle_cuenta_cliente`
  ADD CONSTRAINT `CUENTACLIENTEDETALLECUENTACLIENTECuenta_Cliente_ID` FOREIGN KEY (`Cuenta_Cliente_ID`) REFERENCES `cuenta_cliente` (`ID`),
  ADD CONSTRAINT `CUENTA_CLIENTE_DETALLE_CUENTA_CLIENTE_detalle_ID` FOREIGN KEY (`detalle_ID`) REFERENCES `detalle_cuenta_cliente` (`ID`);

--
-- Filtros para la tabla `cuenta_contrato_detalle_cuenta_contrato`
--
ALTER TABLE `cuenta_contrato_detalle_cuenta_contrato`
  ADD CONSTRAINT `CENTACONTRATODETALLECUENTACONTRATOcuentacontratoID` FOREIGN KEY (`cuenta_contrato_ID`) REFERENCES `cuenta_contrato` (`ID`),
  ADD CONSTRAINT `CNTCONTRATODETALLECUENTACONTRATOlstdetallecuentaID` FOREIGN KEY (`listadetallecuenta_ID`) REFERENCES `detalle_cuenta_contrato` (`ID`);

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
-- Filtros para la tabla `detallecuentafiado`
--
ALTER TABLE `detallecuentafiado`
  ADD CONSTRAINT `FK_DETALLECUENTAFIADO_USUARIO_ID` FOREIGN KEY (`USUARIO_ID`) REFERENCES `usuario` (`ID`);

--
-- Filtros para la tabla `detallecuentaprovedorsinstock`
--
ALTER TABLE `detallecuentaprovedorsinstock`
  ADD CONSTRAINT `FK_DETALLECUENTAPROVEDORSINSTOCK_DEPOSITO_ID` FOREIGN KEY (`DEPOSITO_ID`) REFERENCES `deposito` (`ID`),
  ADD CONSTRAINT `FK_DETALLECUENTAPROVEDORSINSTOCK_PAGO_ID` FOREIGN KEY (`PAGO_ID`) REFERENCES `pagocomprasinstock` (`ID`),
  ADD CONSTRAINT `FK_DETALLECUENTAPROVEDORSINSTOCK_USU_ID` FOREIGN KEY (`USU_ID`) REFERENCES `usuario` (`ID`);

--
-- Filtros para la tabla `detallefiado`
--
ALTER TABLE `detallefiado`
  ADD CONSTRAINT `FK_DETALLEFIADO_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

--
-- Filtros para la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD CONSTRAINT `FK_DETALLE_COMPRA_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

--
-- Filtros para la tabla `detalle_contrato`
--
ALTER TABLE `detalle_contrato`
  ADD CONSTRAINT `FK_DETALLE_CONTRATO_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

--
-- Filtros para la tabla `detalle_cuenta_cliente`
--
ALTER TABLE `detalle_cuenta_cliente`
  ADD CONSTRAINT `FK_DETALLE_CUENTA_CLIENTE_VENTA_ID` FOREIGN KEY (`VENTA_ID`) REFERENCES `venta` (`ID`);

--
-- Filtros para la tabla `detalle_cuenta_contrato`
--
ALTER TABLE `detalle_cuenta_contrato`
  ADD CONSTRAINT `FK_DETALLE_CUENTA_CONTRATO_ALUMNO_ID` FOREIGN KEY (`ALUMNO_ID`) REFERENCES `alumno` (`ID`),
  ADD CONSTRAINT `FK_DETALLE_CUENTA_CONTRATO_USU_ID` FOREIGN KEY (`USU_ID`) REFERENCES `usuario` (`ID`);

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
-- Filtros para la tabla `entrega_producto_contrato`
--
ALTER TABLE `entrega_producto_contrato`
  ADD CONSTRAINT `FK_ENTREGA_PRODUCTO_CONTRATO_USU_ID` FOREIGN KEY (`USU_ID`) REFERENCES `usuario` (`ID`);

--
-- Filtros para la tabla `factura_detalle_factura`
--
ALTER TABLE `factura_detalle_factura`
  ADD CONSTRAINT `FK_FACTURA_DETALLE_FACTURA_detalle_ID` FOREIGN KEY (`detalle_ID`) REFERENCES `detalle_factura` (`ID`),
  ADD CONSTRAINT `FK_FACTURA_DETALLE_FACTURA_Factura_ID` FOREIGN KEY (`Factura_ID`) REFERENCES `factura` (`ID`);

--
-- Filtros para la tabla `fiado`
--
ALTER TABLE `fiado`
  ADD CONSTRAINT `FK_FIADO_CUENTA_ID` FOREIGN KEY (`CUENTA_ID`) REFERENCES `cuentafiado` (`ID`),
  ADD CONSTRAINT `FK_FIADO_USU_ID` FOREIGN KEY (`USU_ID`) REFERENCES `usuario` (`ID`);

--
-- Filtros para la tabla `fiado_detallefiado`
--
ALTER TABLE `fiado_detallefiado`
  ADD CONSTRAINT `FK_FIADO_DETALLEFIADO_detalle_ID` FOREIGN KEY (`detalle_ID`) REFERENCES `detallefiado` (`ID`),
  ADD CONSTRAINT `FK_FIADO_DETALLEFIADO_Fiado_ID` FOREIGN KEY (`Fiado_ID`) REFERENCES `fiado` (`ID`);

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
-- Filtros para la tabla `pagocomprasinstock`
--
ALTER TABLE `pagocomprasinstock`
  ADD CONSTRAINT `FK_PAGOCOMPRASINSTOCK_USU_ID` FOREIGN KEY (`USU_ID`) REFERENCES `usuario` (`ID`);

--
-- Filtros para la tabla `personalizarcontrato`
--
ALTER TABLE `personalizarcontrato`
  ADD CONSTRAINT `FK_PERSONALIZARCONTRATO_ALUMNO_ID` FOREIGN KEY (`ALUMNO_ID`) REFERENCES `alumno` (`ID`),
  ADD CONSTRAINT `FK_PERSONALIZARCONTRATO_PRODUCTO_ID` FOREIGN KEY (`PRODUCTO_ID`) REFERENCES `producto` (`ID`);

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
  ADD CONSTRAINT `FK_VENTA_TIPOVENTA_ID` FOREIGN KEY (`TIPOVENTA_ID`) REFERENCES `tipo_venta` (`ID`),
  ADD CONSTRAINT `FK_VENTA_USU_ID` FOREIGN KEY (`USU_ID`) REFERENCES `usuario` (`ID`);

--
-- Filtros para la tabla `venta_detalle_venta`
--
ALTER TABLE `venta_detalle_venta`
  ADD CONSTRAINT `FK_VENTA_DETALLE_VENTA_detalle_venta_ID` FOREIGN KEY (`detalle_venta_ID`) REFERENCES `detalle_venta` (`ID`),
  ADD CONSTRAINT `FK_VENTA_DETALLE_VENTA_Venta_ID` FOREIGN KEY (`Venta_ID`) REFERENCES `venta` (`ID`);
