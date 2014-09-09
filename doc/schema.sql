DROP SCHEMA IF EXISTS solr;
CREATE SCHEMA IF NOT EXISTS solr CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
USE solr;
CREATE TABLE `shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64),
  `address` varchar(512),
  `is_deleted` tinyint(1) NOT NULL,
  `last_time` timestamp,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_id` int(11) NOT NULL,
  `name` varchar(64),
  `remark` varchar(512),
  `price` double,
  `is_deleted` tinyint(1) NOT NULL,
  `last_time` timestamp,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

GRANT ALL ON solr.* TO 'solr'@'127.0.0.1' IDENTIFIED BY 'solr';
