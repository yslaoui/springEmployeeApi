-- Insert users into the authorities table
USE employee_directory;
-- Insert relationships between users and their roles in the users_authorities table

-- Assign John the ROLE_EMPLOYEE
INSERT INTO users_authorities (user_id, authority_id)
SELECT u.id, r.id
FROM users u, authorities r
WHERE u.username = 'john' AND r.authority = 'ROLE_EMPLOYEE';

-- Assign Mary the ROLE_EMPLOYEE and ROLE_MANAGER
INSERT INTO users_authorities (user_id, authority_id)
SELECT u.id, r.id
FROM users u, authorities r
WHERE u.username = 'mary' AND r.authority = 'ROLE_EMPLOYEE';

INSERT INTO users_authorities (user_id, authority_id)
SELECT u.id, r.id
FROM users u, authorities r
WHERE u.username = 'mary' AND r.authority = 'ROLE_MANAGER';

-- Assign Susan the ROLE_EMPLOYEE, ROLE_MANAGER, and ROLE_ADMIN
INSERT INTO users_authorities (user_id, authority_id)
SELECT u.id, r.id
FROM users u, authorities r
WHERE u.username = 'susan' AND r.authority = 'ROLE_EMPLOYEE';

INSERT INTO users_authorities (user_id, authority_id)
SELECT u.id, r.id
FROM users u, authorities r
WHERE u.username = 'susan' AND r.authority = 'ROLE_MANAGER';

INSERT INTO users_authorities (user_id, authority_id)
SELECT u.id, r.id
FROM users u, authorities r
WHERE u.username = 'susan' AND r.authority = 'ROLE_ADMIN';
