CREATE USER vasyha@localhost identified BY '1234';
GRANT usage ON *.* TO contactmanager@localhost identified BY '1234';
CREATE DATABASE IF NOT EXISTS vs_db;
GRANT ALL privileges ON vs_db.* TO vasyha@localhost;
USE vs_db;
CREATE TABLE Users
  (
     id        INT PRIMARY KEY AUTO_INCREMENT,
     firstname VARCHAR(30),
     lastname  VARCHAR(30),
     telephone VARCHAR(15),
     email     VARCHAR(30),
     created   TIMESTAMP DEFAULT NOW()
  );