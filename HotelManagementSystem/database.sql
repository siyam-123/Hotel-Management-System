CREATE DATABASE hotel_management;
USE hotel_management;

CREATE TABLE guests (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    phone VARCHAR(20),
    room_number INT UNIQUE,
    room_type VARCHAR(50),
    check_in DATE,
    check_out DATE,
    bill DOUBLE
);
