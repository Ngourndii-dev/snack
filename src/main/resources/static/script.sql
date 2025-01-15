-- Création de la base de données
CREATE DATABASE snack_choco;

-- Connexion à la base de données
\c snack_choco

-- Création de la table admin
CREATE TABLE admin (
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    email VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);
-- Création de la table product
CREATE TABLE product (
    id_product SERIAL PRIMARY KEY,
    product_name VARCHAR(50),
    price DOUBLE PRECISION,
    taste VARCHAR(50) not null,
    description VARCHAR(100),
    image_url TEXT
);
