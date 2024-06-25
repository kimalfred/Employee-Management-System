-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 25, 2024 at 04:34 PM
-- Server version: 8.0.37
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javadb`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `id` int NOT NULL,
  `employee_id` int DEFAULT NULL,
  `name` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `position` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `department` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `date` date DEFAULT NULL,
  `timein` time DEFAULT NULL,
  `timeout` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`id`, `employee_id`, `name`, `position`, `department`, `date`, `timein`, `timeout`) VALUES
(7, 1224, 'John Cook', 'Systems Administrator', 'Quality Assurance (QA) Department', '2024-01-02', '14:12:39', '18:57:18'),
(8, 2131, 'Ken', 'Manager', 'IT', '2024-01-02', '14:13:23', '18:56:16'),
(9, 1231534, 'Kim Alfred Molina', 'Junior Software Engineer', 'Security Department', '2024-01-02', '16:35:08', '20:21:01'),
(10, 1224, 'John Cook', 'IT Project Manager', '(UX) And (UI) Design Department', '2024-01-03', '15:43:46', '18:57:18'),
(11, 9277, 'Jonh Smith', 'Intern', 'Sales and Marketing Department', '2024-01-03', '15:50:24', '15:50:56'),
(12, 1224, 'John Cook', 'IT Project Manager', '(UX) And (UI) Design Department', '2024-01-05', '15:43:22', '18:57:18'),
(13, 1224, 'John Cook', 'IT Project Manager', '(UX) And (UI) Design Department', '2024-01-06', '15:50:36', '18:57:18'),
(14, 1224, 'John Cook', 'IT Project Manager', '(UX) And (UI) Design Department', '2024-03-07', '08:24:53', '18:57:18'),
(15, 1224, 'John Cook', 'IT Project Manager', '(UX) And (UI) Design Department', '2024-03-07', '08:33:18', '18:57:18'),
(16, 2131, 'Kendrick Molina', 'DevOps Engineer', 'Infrastructure Department', '2024-04-29', '13:42:06', '18:56:16'),
(17, 1231534, 'Kim Alfred Molina', 'Junior Software Engineer', 'Security Department', '2024-05-21', '20:20:44', '20:21:01'),
(18, 2131, 'Kendrick Molina', 'DevOps Engineer', 'Infrastructure Department', '2024-06-07', '22:28:32', '18:56:16'),
(19, 2131, 'Kendrick Molina', 'DevOps Engineer', 'Infrastructure Department', '2024-06-09', '15:26:18', '18:56:16'),
(20, 2131, 'Kendrick Molina', 'DevOps Engineer', 'Infrastructure Department', '2024-06-16', '19:47:59', '18:56:16'),
(21, 2131, 'Kendrick Molina', 'DevOps Engineer', 'Infrastructure Department', '2024-06-16', '19:48:01', '18:56:16'),
(22, 2131, 'Kendrick Molina', 'DevOps Engineer', 'Infrastructure Department', '2024-06-25', '14:34:59', '18:56:16'),
(23, 1224, 'Kim Alfred Molina', 'Junior Software Engineer', 'Security Department', '2024-06-25', '14:39:19', '18:57:18'),
(24, 2131, 'Kendrick Molina', 'DevOps Engineer', 'Infrastructure Department', '2024-06-25', '18:56:15', '18:56:16'),
(25, 1224, 'Kim Alfred Molina', 'Junior Software Engineer', 'Security Department', '2024-06-25', '18:57:16', '18:57:18');

-- --------------------------------------------------------

--
-- Table structure for table `emptb`
--

CREATE TABLE `emptb` (
  `id` int NOT NULL,
  `employee_id` int NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `number` int NOT NULL,
  `position` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `department` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `usertype` varchar(50) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emptb`
--

INSERT INTO `emptb` (`id`, `employee_id`, `name`, `email`, `number`, `position`, `department`, `password`, `usertype`) VALUES
(3, 41231, 'James Tan', 'admin@gmail.com', 9328131, 'Systems Administrator', 'Training and Development Department', 'admin', 'Admin'),
(4, 2131, 'Kendrick Molina', 'ken@gmail.com', 8127490, 'DevOps Engineer', 'Infrastructure Department', 'ken', 'Manager'),
(14, 1224, 'Kim Alfred Molina', 'kim@gmail.com', 92131, 'Junior Software Engineer', 'Security Department', 'kim', 'Employee'),
(15, 12345, 'John Cook', 'cook@gmail.com', 12312, 'IT Project Manager', '(UX) And (UI) Design Department', 'cook', 'Manager'),
(16, 9277, 'Jonh Smith', 'smith@gmail.com', 9321831, 'Intern', 'Sales and Marketing Department', 'smith', 'Employee'),
(17, 5096, 'Joseph', 'karl@gmail.com', 315123, 'Intern', 'Sales and Marketing Department', 'karl', 'Employee'),
(18, 1111, 'Kendal Jenny', 'jenny@gmail.com', 23123, 'IT Project Manager', 'Project Management Office (PMO)', 'jenny', 'Manager'),
(19, 1, 'Fred Mercury', 'fred@gmail.com', 183131, 'Senior Software Engineer', 'Data Science and Analytics Department', 'fred12', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `emp_leave`
--

CREATE TABLE `emp_leave` (
  `id` int NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `employee_id` int DEFAULT NULL,
  `start` date DEFAULT NULL,
  `end` date DEFAULT NULL,
  `reason` char(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `status` char(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emp_leave`
--

INSERT INTO `emp_leave` (`id`, `name`, `employee_id`, `start`, `end`, `reason`, `status`, `email`) VALUES
(11, 'Kim Alfred Molina', 1224, '2024-06-10', '2024-06-14', 'Vacation Leave', 'Approved', 'kim@gmail.com'),
(12, 'Kendrick Molina', 2131, '2024-06-26', '2024-06-27', 'sick leave', 'Approved', 'ken@gmail.com'),
(13, 'Kim Alfred Molina', 1224, '2024-06-26', '2024-06-27', 'sick leave', 'Pending', 'kim@gmail.com'),
(14, 'Kendrick Molina', 2131, '2024-06-25', '2024-06-27', 'sick leave', 'Pending', 'ken@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `payslip_tb`
--

CREATE TABLE `payslip_tb` (
  `id` int NOT NULL,
  `emp_id` int NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `position` varchar(50) NOT NULL,
  `payrec` date NOT NULL,
  `ot_pay` int NOT NULL,
  `deduction` int NOT NULL,
  `salary` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `payslip_tb`
--

INSERT INTO `payslip_tb` (`id`, `emp_id`, `name`, `email`, `position`, `payrec`, `ot_pay`, `deduction`, `salary`) VALUES
(1, 1224, 'Kim Alfred Molina', 'kim@gmail.com', 'Junior Software Engineer', '2024-06-25', 5123, 1415, 41242),
(2, 2131, 'Kendrick Molina', 'ken@gmail.com', 'DevOps Engineer', '2024-06-26', 5313, 912, 42132),
(3, 12345, 'John Cook', 'cook@gmail.com', 'IT Project Manager', '2024-06-25', 5123, 1221, 45121),
(4, 9277, 'Jonh Smith', 'smith@gmail.com', 'Intern', '2024-06-26', 0, 0, 10000),
(5, 5096, 'Joseph', 'karl@gmail.com', 'Intern', '2024-06-25', 0, 0, 10000),
(6, 1111, 'Kendal Jenny', 'jenny@gmail.com', 'IT Project Manager', '2024-06-26', 3132, 511, 41231);

-- --------------------------------------------------------

--
-- Table structure for table `project_db`
--

CREATE TABLE `project_db` (
  `id` int NOT NULL,
  `employee_id` int NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `position` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `department` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `picture` longblob,
  `assigndate` date DEFAULT NULL,
  `duedate` date DEFAULT NULL,
  `mark` char(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `status` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `proj_desc` char(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `submitted` date DEFAULT NULL,
  `proj_msg` char(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `project_db`
--

INSERT INTO `project_db` (`id`, `employee_id`, `name`, `email`, `position`, `department`, `picture`, `assigndate`, `duedate`, `mark`, `status`, `proj_desc`, `submitted`, `proj_msg`) VALUES
(3, 1224, 'Kim Alfred Molina', 'kim@gmail.com', 'Junior Software Engineer', 'Security Department', 0x89504e470d0a1a0a0000000d494844520000007a0000007a080000000055321838000000206348524d00007a26000080840000fa00000080e8000075300000ea6000003a98000017709cba513c00000002624b474400ff878fccbf0000000774494d4507e70c110a1634da7b98d5000009c74944415468dec5da7b5c13471e00f04902123040784bc18a0f2c2a52aa223e5ac5dad372a205697d14ed55cf56141fc5b62aca0952bdaac557ad56f463afa01e6a9556af05af14b51e8af43ca4722a8a6fc483882841219064b79b279bcd24fb9b24f6e6bfecfc76bfd9cdeccc6f6682e8ff5b41f69c4c51945a4d51bf334da9958a27b23bd7aaaede6978a250aa6df06da3d51d0f7ecd5d981813d1cb3f3062f4e4c5799532a5faf7a0d52de56b877848c4ce4e420112089d9cc512f7a84d954f0871729a6afd29dec74d844c8bc82d705ac953a2c74e4a5354799ca40bc214411749ecbf496e9c946e58dedd09592a4e2199cdcf8c2e8fed2240968bc025eebfcf882e1c2144d68be8959267421f88e493111246173e03fa4084805766eca1450ea77f1a0680353ff82b671d4c5f8f83dcb3d68ebbef50ba6da60828336d6d8643e9af43c03242bd0f3990be319e404682d8078ea3d7fb93d02868a7c3e81b63896484c6f1df3690de1e4448f7cc27a6cf54b463a29ae208652498d8414653bbc27b6d786c1e55fa22298d5eba4442cb29f52084626e9b47657811d3c1bbe1f4e30f87e4c87b325fb7ba2e7bfd5d937c4331857fd8e016e952beb4c148ab0b82d0735742101a58911ae49df5901d747714b18cd0ab0fa1b42adb1d09be1fe6847afc188ed0eb77d841bf0cb2811e7c034c6ff440c2fd8962e4f58f8108455e61071d0bb3811e50067ee03b3c9170df027724fa668408f5ae6207edee6e03ddeb0884569f1c37e3e6dfbd9070cb2a29420712c4485ac10e5ae36b03dd230f40530fa290dbe6a3be48b8fa730639385b8290c9d35a21b5810ede05a1ef489168e13ffd9030253700a1dc54463249345691bfd6cc08f22584bee78344538efb21c1cc838108edd63cdf5276d0e6405b1ef85e085de78384a37ef0673a5e0dbd359b19204bd81d427e6f1be8177e04d282e0a3cc5d471e780ea1d51b99a77e94ddfb9f1c68031d5905a1eb7d1012178709915bb42bd3938e659ad9be365650e5101be8a83a08ddd05d8044999a3c4493743ab9323df68e165650e36872d925e92980a61b07899020c824e3dca499b7156fa8506aa3667721a6fdd6d010fae128b3d9634613d3b50ef29b5cad8dca0d21a6fbf2ce7fb474f32467ee998b657431338c0cd5b595cbd1c4f4d07a10ddf6ae0bf7ccf7ebdb1398ef33ebae364a35574c287ba5f3c93aba3dc5eccaefd597681ef2174f7461c75e20a4c3f9c62d3dddf11737eea9ef34647923e47f5a1ff628c99948769dad00d26bba72cf4daa7e8d79c5126f19e28e8412d1fd7ee695f5f43a337ada46cd189d637c375b52ba12c81e4b94405ab95dc23db96f28d3f202cf75069e27499206d5f0cb7a7aaf07f7646dff3287d517aa73e0a94a702e40d6d1aaef3db197f886fdd8e42ba0a3b6ef5abe3eb493569fc55e35da2437a4efbd0b7bb93d531b20b28ea6aefae0aeb1596e1a7b793ac496ccbd0392f51969138eee59ce0dbe348bbf994b53f9f26f535af11266a124b3c92cba6665008fdcedafb540594f772c7035bbc81bd598755ed9ae086bb070785e1354d6d3ca1c77ee55a657a870f1edc5c9969736023e2a23581ad6d15415e7c516cebb6a696dfbfe576f75c3c2c16fe701166fb834ddc1191513ac7447ea9abc94c1dcd1c4396ad1be5b24b091a6aa4ce736d972ab67359cc84e1e17629c74f78c9d9b7d4a4606774ef71a4d9bee6aded6d274e1f0b64fd2962cfa6069d6e705958da42eebaeeb4c1bcf72be6bb59cd7ac83b6cb1f376bb266c58dffd94ed79ad2c9d633abeb3be7c42cac367e6ccf9ff8767679ab63e8042b1d83fad296042683e99a72cb201f6412c8ae31cb8b881ab8a507def78ac5336e6ffda36e9cf3fae89ef680e2e000ed67a788946f497e73032d336d66424babe92dc7fe64ecef7dd334e3b9f2c800c30141bf458572a86c6ce1724e3771b81d1b7e6d4d382bc837bd9eeef896bd9c278c58f98b8a905670c6854cdcdba5c88f37cd2902b2ea8b389dba4bcc16e00062a4c34cb7172662d60c2f7ffabc59e7f9ce70b30ed5735621e8c60d744782e98caedb69ee40f070ef24f3d15ae8ef87cc4bd81790d7dc402b577392d2cc472671f2534b71239664ea04cc51245d72114eab8f70d2b3b0b3aca1abe974c610ec566660fa6cdc61244e3c09a7cf7173a4f76e191e484dc1b2680bf39ec8fda9f80ad1c8437c531f034dd58572b6b1dc534a1b5b5bee5f2cfc6c5aa8c51daef1bfaeb154d56b7b338ca655d3cc26baa33e58b52279623f6b0bd25365eb2dd6f96c6804d2391e88bcfcf9e9972e162bbd3e6904d1d4c5ded08dc3ce2258461db792275ab73b77015a9248570e986b6fa32b63add5af6d86d0d42129311d9c47df9e612dc07bd353004dcb863b414943892ca21be75b8df0d9d101a0a93dc40dedf54a5ab9d27a48e077143f4d3f8821bded994c82966d3d4418550ea0e9a2e7091bf9fcc734fd35cfb4dbc5524e6fbabb97e60a23f5459cc1a4a327a278a25cdf9703e88753881e79d01ee69ccb097c61dedbd4fc345d9b4062f7d56cead4cee2ff8a65009abe9e2885d3d12798331ea5f2c6b9c4370068ba76591f301daf4999db3fe55fb1f6cc5200685af1b7d7dc01aca6ccd6decc573efc9181a720344ddff8786437feab3165b17697a220843f52fc66238866d2ed8d712f86488d270af0afbb20439b7996be0cf8965e5b54309ac950cfed4d8b1b3d72d8b011a3c68ceb8f1fd37aeed786d64c05d082fe17a1b4a650adb2dabbf5cd4a3a1dbf983858b793259b0fa0915b721b016d2c69787a8c6ef5b6250dd430024a1c48275ed3d6aab681de0897c94f1c47cf7ba4ab3e1402ba6ddfc38ea397eb47e2e3e1205a34acd961f45a7d75f9ab201af91ea21c44871a1ee0cd1930da797c8b83e8e186ad15c000a22b7e459463e83f9cd757b76500697152ab63e8e937f5d5d40e09d0f62fa31c422f36fe72e0bd3fb705ed0ea1338cf5a7817ff364ba34d682b31d74b6b1fe422c94f6dcaa7200dda7c0587f6f0e94761edbe4007ae4bf8cf5c00144537c8ad5f6d3f19d7fa3a3d68169d7e476fbe959ac5dc75dd0b70b09fbd75276d31fb2a6af8503a034f23aacb69b66ff03e31cf6df2302dc74c2e52d85ddf4465640d5241ced895deb08b847d949f760ff23b916fb760d58879b1c480faaecbdeb95acecf6cc181c1d519088392a9edb612f1dfe5de74dcfc5b6a8f0e2cf7087bbc9eda5d11b86ccfae97afc066fbfd212dc61ef9fd5f6d2689efe9fa23f44223c5d56859b3a4a362beda603776abffe7f26200bf459192e7f719ed066378d5ed6ccaf6529c8127da66d0feeb87f1d65378ddeaca6a92c64912ea5cfe126c09e8755f6d3a28f5b8ff5b746d7e0ba39b7ac0efb69d42733c9a28cc24ae9c674ccf12e0972309d1ee4e1892f5e7e3e9e968a7b5419dd962fc1d4f4d6fed820fa6ee5055bcaa5269a7a54617ebca2a20d7cd794dab642593a15fe723d9bf21bbb47d272911411d20000002574455874646174653a63726561746500323032332d31322d31375431303a32323a33372b30303a3030d4d674d40000002574455874646174653a6d6f6469667900323032332d31322d31375431303a32323a33372b30303a3030a58bcc680000002874455874646174653a74696d657374616d7000323032332d31322d31375431303a32323a35322b30303a303066c9cb970000000049454e44ae426082, '2024-06-13', '2024-06-15', 'Very Good', 'Approved', 'fix the system', '2024-06-25', 'done'),
(4, 9277, 'Jonh Smith', 'smith@gmail.com', 'Intern', 'Sales and Marketing Department', NULL, '2024-06-07', '2024-06-14', 'Poor', 'Rejected', 'its not fix', '2024-06-14', 'i commit the problem in button'),
(5, 2131, 'Kendrick Molina', 'ken@gmail.com', 'DevOps Engineer', 'Infrastructure Department', 0x89504e470d0a1a0a0000000d494844520000008e0000008e08040000004df4f883000000206348524d00007a26000080840000fa00000080e8000075300000ea6000003a98000017709cba513c00000002624b474400ff878fccbf0000000774494d4507e70c14080d0868780b94000007d44944415478daed9d6d88155518c77f33b3777ddb55b37c4113a5b2174b43ec8db052432a2ab13e64541f2a928aca0f2952442f501415121549a05246d00b0a09054951b6212e56686b915a54241665a2eefab2eede7ba70fbb8cd79d33679eb9e7dcb9d73c3fbf0ce379ce33e7bf679e39e73c73e682c3e170381c0ec7ff134f54aa85f98c22acf395fec49794f374d9242a359cc79896ef85c5f059c9c67c5dcac4e9eb617ece72a8ae2157eadde08646da73fa28d2c6df39ff0543a67361ae1e23b289738ce57c4a90eb15863c7772880325cab907e6ba3d085cccd1e0c4d190f5b6aa6410f3189ddae93db6f27dfff110e60906931edff243bd85311567288f7325a594523e4f46e2b4f02497a45a782c3bf9c5e9bb29d39f5d7e668bdc877be917ee188059cfe9a34c077fc5feda1ed3189f68b14d3198f4b998b1f516c4b6382596f3c1809a429a58c5c2048b5e5e607dcca299352ca8b720b6c5811e7ae91d702ea098583e545a94524375ced42ee67899c36a8384e1e3b880acc189a3c189a3c189a3c189a3c189a3c18e38aa9979513b5f575be8e7ebe5bcc7413606813ed7302826b3cf59891601731911b3686292d6cfb9dc6d6555d0e3209f71381f71021ee401a568491458acec25faf9fad5ccb270b510d0c196bcc4912c42985b806f2d420abd9bb8f384d65ec591ecb21ae43161d2737ad94ca76099f497e8b8874dec1558fcaa3cbf9bed46f9fa9031ccccd2674dc439c463048215e19ee8f8204bf1050dec559efd9c878d9e57256ee07d86e6234e4877668ba3468deb367c5af564eb790d72770bc97951e3e4122767cc1ee5b2e01656dc0cd92d92f085fdc8204a9988d3c252ce496d86cf5a3eea3f1ece32260b9e56eff349aaf71bb90d526288cf6fbc44573dc469e6062e1394db158933989bb85860b15d20ce54ee12d4f43daf562f8e49cc9174febe72c78f649d5c52afccb7d154d505640d76f256efb14d312b5fc88c048b22eff243cc22e00ea665f6dec17bb1fe51661a779ab7cd4ec6733d6b15e72fd288b38e8f63677d665621ce4e5e56dc3c3773bb79dbecdc56aa5a9ab475ab2daa19e4a927b356dae5628e06278e06278e06278e06278e06278e86da8913665ed2acef96250576b20faad720f5e39c406951ed3867604d25f18246cdc509b89f7931293c2e4fb428f010372bde099c5985f799bc199b849699646387869d8ce76c6667b208b8d682df3e2633d95a5db1863912314bea657feb4f66212965afa6444c6eab23ac60bd206fd5161d1fe275c6099e4a6da925a08dc705d2fc25c989d7429c6edec9687184b70cfc9d483bedd6ea4ac0c51c0d4e1c0d4e1c0d2631c7672ccd82720739d07f14309682c0623f9da96546305250530fff549f813011a795d7982148eabdc21bfdc72359c14582a4de8bac4af5be90a5a9657cb6732ffbeb214ec044ce16943bbdc26292c8e2344199914c1194ea3299469825f564f3e8caa45ed634a05919c36dd77666e587e9518c45876a2292da629828229d48af629817d2cc30f366d910a7c8f36c8875df80a7b92ec1a28767f8326651e059e664f6fe354f29766ecde1f92a84ae813821bbf82e76d6636fa245991d0a8b807d5578df47bbe27934dec61bcbb54bea0599937a814bea9d44387134387134387134387134387134d8114735942f6b07f86a8bea7c9795672d6067fa700613068c36429a3403788f310a8be62cfb122286322936152932a651927a4d3cc1238a8b199f68d1ccd32c51584ca8c2fb558a17e8425acd270f76c4f19890b1591e132df8ed6338c3add53500b3bc55760b7b5b3b1a3c6f55a68b2ec167a9ba2b2c3a45dbd78e09bc77478baf3adf9d26a1d96c33da125a0549bd3fa2e3832ca64560f1bbc0fb3abe492de37148b01a5d13718a6ccf68d14b8781bf13d9c31e6b7525e006811a9c381a9c381accc63953989e5ac6e3009ba28dafe7325510900fb039f589d5ca2c86a5d615f26dc503215771aee765bc940b0cd8cafc489cf93c97daa0802ddca25981ee631cafa6eefaf3e8e1be7a8913304850aa503114935948ca78340ba608d2af262869cc9863efa55ba39aeccccaf7b183f280a17ac8282e4814ff5f76c66e8990d19c97f9cf55e4473a63be0b4c359f73d911a79d7b625f272871236f272e42b4b128b6d0506201ab199cd177278fd21e5bfe18c5075cd118e2f4d2a978ba1cd15814e9527cb1a29a8f39841c56782ad8f84a939d9853cd6cdb139eab238d19901b04278e06278e06278e06278e06278e065b493dd557b3f3fa199492f29c8529889d41e0386e8d0de9ca5c924bbf2c308709033c85b430aa51c4b994358ab3be8dc45a2aad3cabec250d92d443b1cb323f3cd102475598757cd970bf36c2c9566aaadb541b199bf0279b52cbf8ecaaf88ca23d8eb285dda961b798baa2583371d6b34150aa64b25b2e913ddc2be83b469f6d3413a73bf33726ed5132c965ca7083400d4e1c0d4e1c0d4e1c0d4e1c0d4e1c0d4e1c0d4e1c0d4e1c0d4e1c0d4e1c0d4e1c0d4e1c0d4e1c0df51327149ecbf2ff96694a3c7ffc674fc28ac5ea00df60d9b31cfd317cc5d70a4ad1d57814a205ce30b2f16836fc3995e3575ea85840f528ab7f9055bdc2eab388b951de296408b31909146953fce6af9c90f3fbbfaefd07ed8a37bbcee44a02601f5f712c12673a1702f0b362a37e36ef63b99a26e0001b391ab5c3e70b56cab36c01ab094fa17fabd5774352ccc92b5bd91824b43629e6849c3a0225fea8945a9c900fe968bcafccd6088f1da74c5b1d0e87c3e1703800f80f98af1aea1efdd3210000002574455874646174653a63726561746500323032332d31322d32305430383a31333a30302b30303a303080b1d16c0000002574455874646174653a6d6f6469667900323032332d31322d32305430383a31333a30302b30303a3030f1ec69d00000002874455874646174653a74696d657374616d7000323032332d31322d32305430383a31333a30382b30303a3030951606680000000049454e44ae426082, '2024-06-16', '2024-06-22', 'Good', 'Approved', 'can you revise all of the code and fix the bugs thanks', '2024-06-25', 'done'),
(6, 1111, 'Kendal Jenny', 'jenny@gmail.com', 'IT Project Manager', 'Project Management Office (PMO)', NULL, '2024-06-25', '2024-06-28', NULL, NULL, 'can you add more ui/ux', NULL, NULL),
(7, 5096, 'Joseph', 'karl@gmail.com', 'Intern', 'Sales and Marketing Department', NULL, '2024-06-25', '2024-06-28', NULL, NULL, 'can you update the sales thanks', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `emptb`
--
ALTER TABLE `emptb`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `emp_leave`
--
ALTER TABLE `emp_leave`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `payslip_tb`
--
ALTER TABLE `payslip_tb`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `project_db`
--
ALTER TABLE `project_db`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `emptb`
--
ALTER TABLE `emptb`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `emp_leave`
--
ALTER TABLE `emp_leave`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `payslip_tb`
--
ALTER TABLE `payslip_tb`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `project_db`
--
ALTER TABLE `project_db`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
