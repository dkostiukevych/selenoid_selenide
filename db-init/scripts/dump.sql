CREATE DATABASE IF NOT EXISTS automation;
USE automation;
CREATE table users(
	first_name varchar(20),
	last_name varchar(30),
    email varchar(50)
);

INSERT into users VALUES (
	'test_user', 'test', 'email@host.com'
);