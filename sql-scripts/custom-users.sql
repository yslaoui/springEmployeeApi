USE `employee_directory`;

DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS members;

-- Create custom tables

CREATE TABLE members (
   user_id VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL PRIMARY KEY,
   pw VARCHAR(68) COLLATE utf8mb4_unicode_ci NOT NULL,
   active BOOLEAN NOT NULL
);

CREATE TABLE roles (
   user_id VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL,
   role VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL,
   CONSTRAINT fk_role_members FOREIGN KEY (user_id) REFERENCES members(user_id)
);

CREATE UNIQUE INDEX ix_auth_user_id ON roles (user_id, role);


-- Insert Data

INSERT INTO `employee_directory`.`members` (`user_id`, `pw`, `active`)
VALUES
('john', '{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', '1'),
('mary', '{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', '1'),
('susan', '{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', '1');



INSERT INTO `employee_directory`.`roles` (`user_id`, `role`)
VALUES
('john', 'ROLE_EMPLOYEE'),
('mary', 'ROLE_EMPLOYEE'),
('mary', 'ROLE_MANAGER'),
('susan', 'ROLE_EMPLOYEE'),
('susan', 'ROLE_MANAGER'),
('susan', 'ROLE_ADMIN');

