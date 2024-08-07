
-- Insert data into users table
INSERT INTO `employee_directory`.`users` (`username`, `password`, `enabled`) VALUES ('john', '{noop}test123', '1');
INSERT INTO `employee_directory`.`users` (`username`, `password`, `enabled`) VALUES ('mary', '{noop}test123', '1');
INSERT INTO `employee_directory`.`users` (`username`, `password`, `enabled`) VALUES ('susan', '{noop}test123', '1');


-- Inset data into authorities tables
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('john', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('mary', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('mary', 'ROLE_MANAGER');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('susan', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('susan', 'ROLE_MANAGER');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('susan', 'ROLE_ADMIN');
