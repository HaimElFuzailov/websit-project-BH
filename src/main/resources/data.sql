DROP TABLE IF EXISTS user_sign;
DROP TABLE IF EXISTS user_order;
DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS favorite;
DROP TABLE IF EXISTS favorite_list;
DROP TABLE IF EXISTS order_list;

CREATE TABLE user_sign(
    user_id int(11) unsigned NOT NULL AUTO_INCREMENT,
    user_name varchar(300) NOT NULL DEFAULT '',
    password varchar(300) NOT NULL DEFAULT '',
    first_name varchar(300) NOT NULL DEFAULT '',
    last_name varchar(300) NOT NULL DEFAULT '',
    email varchar(300) NOT NULL DEFAULT '',
    phone varchar(300) NOT NULL DEFAULT '',
    address varchar(300) NOT NULL DEFAULT '',
    PRIMARY KEY (user_id)
);

CREATE TABLE user_order(
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    user_id int(11) NOT NULL ,
    order_date date NOT NULL DEFAULT '',
    shipping_address varchar(300) NOT NULL DEFAULT '',
    total_price int(11) NOT NULL DEFAULT '',
    order_status varchar(300) NOT NULL DEFAULT 'TEMP',
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES user_sign(user_id)
);

CREATE TABLE item(
    item_id int(11) unsigned NOT NULL AUTO_INCREMENT,
    title_of_the_item varchar(300) NOT NULL ,
    photo_of_the_item varchar(300) NOT NULL DEFAULT '',
    price int(11) NOT NULL DEFAULT '',
    how_much_items_available_in_stock int(11) NOT NULL DEFAULT '10',
    PRIMARY KEY (item_id)
);
CREATE TABLE favorite(
    favorite_id int(11) unsigned NOT NULL AUTO_INCREMENT,
    user_id varchar(300) NOT NULL ,
    PRIMARY KEY (favorite_id),
    FOREIGN KEY (user_id) REFERENCES user_sign(user_id)
);

CREATE TABLE favorite_list(
    favorite_id int(11) unsigned NOT NULL,
    item_id varchar(300) NOT NULL ,
    PRIMARY KEY (favorite_id),
    FOREIGN KEY (item_id) REFERENCES item(item_id)
);

CREATE TABLE order_list(
    order_id int(11) unsigned NOT NULL,
    item_id varchar(300) NOT NULL ,
    PRIMARY KEY (order_id),
    FOREIGN KEY (item_id) REFERENCES item(item_id)
);



INSERT INTO item ( title_of_the_item, photo_of_the_item, price, how_much_items_available_in_stock)
VALUES ('Instant Tent For 8 People From Home Coleman Design!!', '../images/green.jpg',400,99),
('Supernova 8 large instant tent from Aztec Design!!', '../images/black.jpg',400,90),
('Tent for three Outdoor Mountain 3-season tent is designed for three people', '../images/COFFEE-BREAK.jpg',350,78),
('Amigo coffee set from Go Nature', '../images/COFFEE-BREAK2.jpg',70,170),
('Alpine coffee set VOLCANO', '../images/COFFEE-BREAK3.jpg',60,100),
('Outdoor Fire Light coffee set', '../images/COFFEE-BREAK4.jpg',50,109),
('Mens micro-fleece shirt Micro-Hati from AZTEC', '../images/suitcase-backpack.jpg',200,120),
('Columbia TITAN PASS 2.0 II M microfleece jacket for men', '../images/suitcase-backpack-2.jpg',250,200),
('Columbia Titan Ridge 3.0 Hybrid Mens Softshell', '../images/suitcase-backpack3.jpg',200,250),
('Set Sail in the Atlantic Ocean visiting Uncharted Waters', '../images/Microfleece-shirt.jpg',40,140),
('Experience Football on Top of the Himilayan Mountains', '../images/Microfleece-shirt2.jpg',20,105),
('Ride through the Sahara Desert on a guided camel tour', '../images/Microfleece-shirt3.jpg',30,160);


