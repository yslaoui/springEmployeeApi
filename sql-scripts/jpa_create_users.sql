-- Insert users into the authorities table
USE employee_directory;
-- Insert users with bcrypt encoded passwords
-- The passwords below are encrypted with bcrypt; the plain password is 'password'.
INSERT INTO users (username, password, enabled) VALUES
('john', '{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', TRUE),
('mary', '{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', TRUE),
('susan', '{bcrypt}$2a$10$mshOoIbIoLK0gux3kFg6Ae//G6dfRppAq3DEWOZtzKC3T8Ijqnl3G', TRUE);

