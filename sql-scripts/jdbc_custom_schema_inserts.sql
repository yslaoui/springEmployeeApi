
-- Insert data into members table
INSERT INTO `employee_directory`.`members` (`user_id`, `pw`, `active`) VALUES ('john', '{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', '1');
INSERT INTO `employee_directory`.`members` (`user_id`, `pw`, `active`) VALUES ('mary', '{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', '1');
INSERT INTO `employee_directory`.`members` (`user_id`, `pw`, `active`) VALUES ('susan','{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', '1');


-- Inset data into roles tables
INSERT INTO `employee_directory`.`roles` (`user_id`, `role`) VALUES ('john', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`roles` (`user_id`, `role`) VALUES ('mary', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`roles` (`user_id`, `role`) VALUES ('mary', 'ROLE_MANAGER');
INSERT INTO `employee_directory`.`roles` (`user_id`, `role`) VALUES ('susan', 'ROLE_EMPLOYEE');
INSERT INTO `employee_directory`.`roles` (`user_id`, `role`) VALUES ('susan', 'ROLE_MANAGER');
INSERT INTO `employee_directory`.`roles` (`user_id`, `role`) VALUES ('susan', 'ROLE_ADMIN');
