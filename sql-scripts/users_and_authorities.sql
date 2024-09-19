USE employee_directory;

DROP TABLE IF EXISTS `users`;
DROP TABLE IF EXISTS `authorities`;


CREATE TABLE users (
   username VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL PRIMARY KEY,
   password VARCHAR(500) COLLATE utf8mb4_unicode_ci NOT NULL,
   enabled BOOLEAN NOT NULL
);

CREATE TABLE authorities (
   username VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL,
   authority VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL,
   CONSTRAINT fk_authorities_users FOREIGN KEY (username) REFERENCES users(username)
);

CREATE UNIQUE INDEX ix_auth_username ON authorities (username, authority);

-- Insert data into users table
INSERT INTO `employee_directory`.`users` (`username`, `password`, `enabled`) VALUES ('john', '{noop}abc123', '1');
INSERT INTO `employee_directory`.`users` (`username`, `password`, `enabled`) VALUES ('mary', '{noop}abc123', '1');
INSERT INTO `employee_directory`.`users` (`username`, `password`, `enabled`) VALUES ('susan', '{noop}abc123', '1');

-- Insert data into authorities table
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('john', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('mary', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('mary', 'ROLE_MANAGER');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('susan', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('susan', 'ROLE_MANAGER');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('susan', 'ROLE_ADMIN');
