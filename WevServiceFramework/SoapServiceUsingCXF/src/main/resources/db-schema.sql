drop table if exists `REQUESTOR_INFO`;
CREATE TABLE `REQUESTOR_INFO` (
  `Requestor_ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `Username` VARCHAR(100) NOT NULL,
  `Password` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`Requestor_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT into REQUESTOR_INFO VALUES (1,'shubham','pathak');
INSERT into REQUESTOR_INFO VALUES (2,'aman','vyas');
INSERT into REQUESTOR_INFO VALUES (3,'aditya','gupta');
INSERT into REQUESTOR_INFO VALUES (4,'anil','rekha');