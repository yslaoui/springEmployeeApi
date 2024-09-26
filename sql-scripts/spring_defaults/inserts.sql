-- Insert users
USE employee_directory;
INSERT INTO users (id, username, password, enabled) VALUES
(1, 'john', '$2a$10$2NFYV6jMcrVgbp56bw2cieGLqCAawQpGxkIBOdsvYmGIG.GYwuZCa', true),
(2, 'mary', '$2a$10$2NFYV6jMcrVgbp56bw2cieGLqCAawQpGxkIBOdsvYmGIG.GYwuZCa', true),
(3, 'susan', '$2a$10$2NFYV6jMcrVgbp56bw2cieGLqCAawQpGxkIBOdsvYmGIG.GYwuZCa', true);


-- Insert roles (authorities)
USE employee_directory;
INSERT INTO authorities (id, authority) VALUES
(1, 'ROLE_EMPLOYEE'),
(2, 'ROLE_MANAGER'),
(3, 'ROLE_ADMIN');


-- Assign roles to users
USE employee_directory;
-- John is an employee
INSERT INTO users_authorities (user_id, authority_id) VALUES
(1, 1);

-- Mary is an employee and a manager
INSERT INTO users_authorities (user_id, authority_id) VALUES
(2, 1),  -- ROLE_EMPLOYEE
(2, 2);  -- ROLE_MANAGER

-- Susan is an employee, manager, and admin
INSERT INTO users_authorities (user_id, authority_id) VALUES
(3, 1),  -- ROLE_EMPLOYEE
(3, 2),  -- ROLE_MANAGER
(3, 3);  -- ROLE_ADMIN
