
-- Insert data into users table
INSERT INTO `employee_directory`.`users` (`username`, `password`, `enabled`) VALUES ('john', '{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', '1');
INSERT INTO `employee_directory`.`users` (`username`, `password`, `enabled`) VALUES ('mary', '{bcrypt}$$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', '1');
INSERT INTO `employee_directory`.`users` (`username`, `password`, `enabled`) VALUES ('susan', '{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', '1');


-- Inset data into authorities tables
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('john', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('mary', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('mary', 'ROLE_MANAGER');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('susan', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('susan', 'ROLE_MANAGER');
INSERT INTO `employee_directory`.`authorities` (`username`, `authority`) VALUES ('susan', 'ROLE_ADMIN');
