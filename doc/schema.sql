CREATE SCHEMA IF NOT EXISTS solr;
USE solr;
CREATE TABLE `shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64),
  `address` varchar(512),
  `last_time` timestamp,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_id` int(11) NOT NULL,
  `name` varchar(64),
  `desc` varchar(512),
  `price` double,
  `last_time` timestamp,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

GRANT ALL ON solr.* TO 'solr'@'127.0.0.1' IDENTIFIED BY 'solr';
