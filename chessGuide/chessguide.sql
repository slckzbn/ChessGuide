-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 03 Mar 2019, 00:50:57
-- Sunucu sürümü: 10.1.37-MariaDB
-- PHP Sürümü: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `chessguide`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `acilis`
--

CREATE TABLE `acilis` (
  `ID` int(11) NOT NULL,
  `Ad` text NOT NULL,
  `Hamle` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `acilis`
--

INSERT INTO `acilis` (`ID`, `Ad`, `Hamle`) VALUES
(1, 'Italyan Acilisi', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbag1-baf3-\r\nsab8-sac6-\r\nbff1-bfc4-\r\nsff8-sfc5-\r\nbpc2-bpc3-\r\nsag8-saf6-\r\nbpd2-bpd4-\r\nspe5-spd4-\r\nbpc3-bpd4-\r\nsfc5-sfb4-\r\nbfc1-bfd2-\r\nsfb4-sfd2-\r\nbab1-bad2-\r\nspd7-spd5-\r\nbpe4-bpd5-\r\nsaf6-sad5'),
(2, 'Ingiliz Acilisi', 'bpc2-bpc4-\r\nspd7-spd5-\r\nbab1-bac3-\r\nsag8-saf6-\r\nbpg2-bpg3-\r\nsab8-sac6-\r\nbff1-bfg2'),
(3, 'Sah Gambiti', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbpf2-bpf4-\r\nspe5-spf4-\r\nbag1-baf3-\r\nspg7-spg5-\r\nbff1-bfc4-\r\nsab8-sac6-\r\nbkh1-bkf1-\r\nbse1-bsg1'),
(4, 'Iskoc Acilisi', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbag1-baf3-\r\nsab8-sac6-\r\nbpd2-bpd4-\r\nspe5-spd4-\r\nbaf3-bad4-\r\nsac6-sad4-\r\nbvd1-bvd4'),
(5, 'Evans Gambiti', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbag1-baf3-\r\nsab8-sac6-\r\nbff1-bfc4-\r\nsff8-sfc5-\r\nbpb2-bpb4'),
(6, 'Caro-Kann', 'bpe2-bpe4-\r\nspc7-spc6-\r\nbpd2-bpd4-\r\nspd7-spd5-\r\nbab1-bac3-\r\nspd5-spe4-\r\nbac3-bae4-\r\nsfc8-sff5-\r\nbae4-bag3-\r\nsff5-sfg6-\r\nbph2-bph4-\r\nsph7-sph6-\r\nbph4-bph5-\r\nsfg6-sfh7-\r\nbag1-baf3-\r\nsab8-sad7-\r\nbff1-bfd3-\r\nsfh7-sfd3-\r\nbvd1-bvd3-\r\nsag8-saf6-\r\nbfc1-bff4-\r\nsvd8-sva5-\r\nbff4-bfd2-\r\nsva5-svc7-\r\nbse1-bsc1-\r\nbka1-bkd1-\r\nsse8-ssc8-\r\nska8-skd8-\r\nbag3-bae4-\r\nspe7-spe6'),
(7, 'Sicilya Savunmasi', 'bpe2-bpe4-\r\nspc7-spc5-\r\nbag1-baf3-\r\nspd7-spd6-\r\nbpd2-bpd4-\r\nspc5-spd4-\r\nbaf3-bad4-\r\nsag8-saf6-\r\nbab1-bac3-\r\nspg7-spg6'),
(8, 'Dort At Acilisi', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbag1-baf3-\r\nsab8-sac6-\r\nbab1-bac3-\r\nsag8-saf6'),
(9, 'Kuzey (Danimarka)  Gambiti', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbpd2-bpd4-\r\nspe5-spd4-\r\nbpc2-bpc3-\r\nspd4-spc3-\r\nbab1-bac3'),
(10, 'Nimzo Hint Acilisi', 'bpd2-bpd4-\r\nsag8-saf6-\r\nbpc2-bpc4-\r\nspe7-spe6-\r\nbab1-bac3-\r\nsff8-sfb4'),
(11, 'Alekhine Savunmasi', 'bpe2-bpe4-\r\nsag8-saf6-\r\nbpe4-bpe5-\r\nsaf6-sad5-\r\nbpd2-bpd4-\r\nspd7-spd6-\r\nbag1-baf3');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `matlar`
--

CREATE TABLE `matlar` (
  `ID` int(11) NOT NULL,
  `Ad` text NOT NULL,
  `Hamle` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `matlar`
--

INSERT INTO `matlar` (`ID`, `Ad`, `Hamle`) VALUES
(1, 'Arka Yatay (Koridor) Mati', 'bpe2-bpe4-\r\nspc7-spc5-\r\nbag1-baf3-\r\nspe7-spe6-\r\nbpd2-bpd4-\r\nspc5-spd4-\r\nbaf3-bad4-\r\nspa7-spa6-\r\nbab1-bac3-\r\nsvd8-svc7-\r\nbff1-bfd3-\r\nsff8-sfc5-\r\nbad4-bab3-\r\nsfc5-sfe7-\r\nbpf2-bpf4-\r\nspb7-spb5-\r\nbpa2-bpa3-\r\nsfc8-sfb7-\r\nbse1-bsg1-\r\nbkh1-bkf1-\r\nspd7-spd6-\r\nbsg1-bsh1-\r\nsab8-sad7-\r\nbfc1-bfd2-\r\nsag8-saf6-\r\nbvd1-bve2-\r\nsse8-ssg8-\r\nskh8-skf8-\r\nbab3-bad4-\r\nska8-skc8-\r\nbka1-bke1-\r\nsad7-sac5-\r\nbpb2-bpb4-\r\nsac5-sad3-\r\nbpc2-bpd3-\r\nsvc7-svd7-\r\nbke1-bkc1-\r\nskf8-ske8-\r\nbad4-bab3-\r\nspg7-spg6-\r\nbfd2-bfe3-\r\nsfe7-sff8-\r\nbkc1-bkc2-\r\nsaf6-sah5-\r\nbkf1-bkc1-\r\nspd6-spd5-\r\nbpe4-bpd5-\r\nspe6-spd5-\r\nbve2-bvf2-\r\nspd5-spd4-\r\nbab3-bad4-\r\nskc8-skd8-\r\nbac3-bae4-\r\nsfb7-sfe4-\r\nbpd3-bpe4-\r\nske8-ske4-\r\nbad4-bab3-\r\nsvd7-sve6-\r\nbkc2-bkc3-\r\nskd8-ske8-\r\nbfe3-bfd2-\r\nsah5-saf4-\r\nbab3-bad4-\r\nske4-skd4-\r\nbfd2-bff4-\r\nskd4-skf4-\r\nbvf2-bvf4-\r\nsff8-sfh6-\r\nbvf4-bvh6-\r\nsve6-sve1-\r\nbkc1-bke1-\r\nske8-ske1'),
(2, 'Anastasia Mati', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbag1-baf3-\r\nsab8-sac6-\r\nbff1-bfb5-\r\nspf7-spf5-\r\nbpd2-bpd3-\r\nsff8-sfc5-\r\nbse1-bsg1-\r\nbkh1-bkf1-\r\nspd7-spd6-\r\nbpa2-bpa3-\r\nsag8-saf6-\r\nbab1-bac3-\r\nsse8-ssg8-\r\nskh8-skf8-\r\nbfb5-bfc4-\r\nssg8-ssh8-\r\nbaf3-bag5-\r\nsvd8-sve7-\r\nbac3-bad5-\r\nsaf6-sad5-\r\nbfc4-bfd5-\r\nspf5-spf4-\r\nbag5-bah7-\r\nskf8-skd8-\r\nbvd1-bvh5-\r\nspg7-spg6-\r\nbvh5-bvg6-\r\nsve7-svg7-\r\nbvg6-bvg7-\r\nssh8-ssg7-\r\nbah7-bag5-\r\nssg7-ssf6-\r\nbag5-baf3-\r\nsfc8-sfg4-\r\nbaf3-bad2-\r\nsac6-sad4-\r\nbpc2-bpc3-\r\nsad4-sae2-\r\nbsg1-bsh1-\r\nskd8-skh8-\r\nbad2-bab3-\r\nskh8-skh2-\r\nbsh1-bsh2-\r\nska8-skh8'),
(3, 'Arap Mati', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbag1-baf3-\r\nsab8-sac6-\r\nbpd2-bpd4-\r\nspe5-spd4-\r\nbff1-bfc4-\r\nsff8-sfc5-\r\nbse1-bsg1-\r\nbkh1-bkf1-\r\nspd7-spd6-\r\nbpc2-bpc3-\r\nsfc8-sfg4-\r\nbvd1-bvb3-\r\nsfg4-sff3-\r\nbfc4-bff7-\r\nsse8-ssf8-\r\nbff7-bfg8-\r\nskh8-skg8-\r\nbpg2-bpf3-\r\nspg7-spg5-\r\nbvb3-bve6-\r\nsac6-sae5-\r\nbve6-bvf5-\r\nssf8-ssg7-\r\nbsg1-bsh1-\r\nssg7-ssh8-\r\nbkf1-bkg1-\r\nspg5-spg4-\r\nbpf3-bpf4-\r\nsae5-saf3-\r\nbkg1-bkg4-\r\nsvd8-svh4-\r\nbkg4-bkg2-\r\nsvh4-svh2-\r\nbkg2-bkh2-\r\nskg8-skg1-'),
(4, 'Boden Mati', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbag1-baf3-\r\nspd7-spd6-\r\nbpc2-bpc3-\r\nspf7-spf5-\r\nbff1-bfc4-\r\nsag8-saf6-\r\nbpd2-bpd4-\r\nspf5-spe4-\r\nbpd4-bpe5-\r\nspe4-spf3-\r\nbpe5-bpf6-\r\nsvd8-svf6-\r\nbpg2-bpf3-\r\nsab8-sac6-\r\nbpf3-bpf4-\r\nsfc8-sfd7-\r\nbfc1-bfe3-\r\nsse8-ssc8-\r\nska8-skd8-\r\nbab1-bad2-\r\nskd8-ske8-\r\nbvd1-bvf3-\r\nsfd7-sff5-\r\nbse1-bsc1-\r\nbka1-bkd1-\r\nspd6-spd5-\r\nbfc4-bfd5-\r\nsvf6-svc3-\r\nbpb2-bpc3-\r\nsff8-sfa3-'),
(5, 'Iki Fil Mati', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbab1-bac3-\r\nsag8-saf6-\r\nbpf2-bpf4-\r\nspd7-spd5-\r\nbpf4-bpe5-\r\nsaf6-sae4-\r\nbvd1-bvf3-\r\nspf7-spf5-\r\nbpd2-bpd3-\r\nsae4-sac3-\r\nbpb2-bpc3-\r\nspd5-spd4-\r\nbfc1-bfd2-\r\nspc7-spc5-\r\nbvf3-bvg3-\r\nsab8-sac6-\r\nbpc3-bpc4-\r\nspg7-spg6-\r\nbag1-baf3-\r\nsff8-sfg7-\r\nbff1-bfe2-\r\nsvd8-sve7-\r\nbfd2-bff4-\r\nsse8-ssg8-\r\nskh8-skf8-\r\nbse1-bsg1-\r\nbkh1-bkf1-\r\nskf8-ske8-\r\nbka1-bke1-\r\nsac6-sae5-\r\nbfe2-bfd1-\r\nsae5-saf3-\r\nbfd1-bff3-\r\nsve7-svf7-\r\nbke1-bke8-\r\nsvf7-sve8-\r\nbkf1-bke1-\r\nsve8-svd7-\r\nbff3-bfd5-\r\nssg8-ssh8-\r\nbff4-bfd6-\r\nsfg7-sff6-\r\nbke1-bke7-\r\nsvd7-svd8-\r\nbvg3-bve5-\r\nsff6-sfe5-\r\nbfd6-bfe5'),
(6, 'Apolet Mati', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbag1-baf3-\r\nsab8-sac6-\r\nbff1-bfc4-\r\nsff8-sfc5-\r\nbpb2-bpb4-\r\nsfc5-sfb4-\r\nbpc2-bpc3-\r\nsfb4-sfc5-\r\nbpd2-bpd4-\r\nspe5-spd4-\r\nbse1-bsg1-\r\nbkh1-bkf1-\r\nspd7-spd6-\r\nbpc3-bpd4-\r\nsfc5-sfb6-\r\nbab1-bac3-\r\nsac6-saa5-\r\nbfc1-bfg5-\r\nspf7-spf6-\r\nbfc4-bfg8-\r\nskh8-skg8-\r\nbfg5-bfh4-\r\nsfc8-sfg4-\r\nbpe4-bpe5-\r\nspd6-spe5-\r\nbkf1-bke1-\r\nsfg4-sff3-\r\nbvd1-bvf3-\r\nsvd8-svd4-\r\nbke1-bke4-\r\nsvd4-svd7-\r\nbka1-bkd1-\r\nsvd7-svf7-\r\nbvf3-bvg4-\r\nsph7-sph5-\r\nbvg4-bvf5-\r\nsaa5-sac4-\r\nbke4-bkc4-\r\nsvf7-svc4-\r\nbac3-bad5-\r\nsvc4-svc5-\r\nbvf5-bve6-\r\nsse8-ssf8-\r\nbfh4-bff6-\r\nska8-ske8-\r\nbad5-bae7-\r\nsvc5-svf2-\r\nbsg1-bsh1-\r\nsvf2-svf6-\r\nbae7-bag6-\r\nsvf6-svg6-\r\nbkd1-bkf1-\r\nsfb6-sff2-\r\nbkf1-bkf2-\r\nsvg6-svf6-\r\nbkf2-bkf6-\r\nspg7-spf6-\r\nbve6-bvf6'),
(7, 'Coban Mati', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbff1-bfc4-\r\nsab8-sac6-\r\nbvd1-bvh5-\r\nsag8-saf6-\r\nbvh5-bvf7'),
(8, 'Tembel Mati', 'bpe2-bpe4-\r\nspf7-spf6-\r\nbpd2-bpd4-\r\nspg7-spg5-\r\nbvd1-bvh5'),
(9, 'Legal Mati', 'bpe2-bpe4-\r\nspe7-spe5-\r\nbag1-baf3-\r\nspd7-spd6-\r\nbff1-bfc4-\r\nsfc8-sfg4-\r\nbab1-bac3-\r\nspg7-spg6-\r\nbaf3-bae5-\r\nsfg4-sfd1-\r\nbfc4-bff7-\r\nsse8-sse7-\r\nbac3-bad5'),
(10, 'Bes Hamle Mati', 'bpf2-bpf4-\r\nspe7-spe5-\r\nbpf4-bpe5-\r\nspd7-spd6-\r\nbpe5-bpd6-\r\nsff8-sfd6-\r\nbag1-baf3-\r\nspg7-spg5-\r\nbph2-bph3-\r\nsfd6-sfg3');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `temel`
--

CREATE TABLE `temel` (
  `ID` int(11) NOT NULL,
  `Ad` text NOT NULL,
  `Hamle` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `temel`
--

INSERT INTO `temel` (`ID`, `Ad`, `Hamle`) VALUES
(1, 'Kale', 'skd5-skd5-\r\nskd2-skd2-\r\nske2-ske2-\r\nske8-ske8-\r\nska8-ska8-\r\nska1-ska1-\r\nskh1'),
(2, 'At', 'sad5-sad5-\r\nsac3-sac3-\r\nsae2-sae2-\r\nsaf4-saf4-\r\nsad5-sad5-\r\nsae7-sae7-\r\nsag6'),
(3, 'Fil', 'sfd5-sfd5-\r\nsfb3-sfb3-\r\nsfc2-sfc2-\r\nsfg6-sfg6-\r\nsfe8-sfe8-\r\nsfd7'),
(4, 'Sah', 'ssd5-ssd5-\r\nssd6-ssd6-\r\nsse6-sse6-\r\nssd5-ssd5-\r\nssc4-ssc4-\r\nssc5-ssc5-\r\nssd4'),
(5, 'Vezir', 'svd5-svd5-\r\nsvd1-svd1-\r\nsvd8-svd8-\r\nsva5-sva5-\r\nsvg5-svg5-\r\nsvd2-svd2-\r\nsva5'),
(6, 'Piyon', 'spd2-bpe6-\r\nspd2-spd4-\r\nspd4-spd5-\r\nspd5-spe6-\r\nspe6-spe7-\r\nspe7-sve8');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `acilis`
--
ALTER TABLE `acilis`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `matlar`
--
ALTER TABLE `matlar`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `temel`
--
ALTER TABLE `temel`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
