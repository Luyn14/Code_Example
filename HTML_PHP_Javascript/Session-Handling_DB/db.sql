CREATE DATABASE SessionHandling;

USE SessionHandling;

CREATE TABLE user (
id INT NOT NULL auto_increment KEY,
firstname VARCHAR(30),
lastname VARCHAR(30),
username VARCHAR(30),
password VARCHAR(30)
);

INSERT INTO  user (firstname, lastname, username, password) 
VALUES ("Hugo", "Vogler", "Hugovogler", "vogler123");


