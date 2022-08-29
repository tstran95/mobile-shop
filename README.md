# mobile-shop
CREATE DATABASE IF NOT EXISTS `mobile-shop`;


INSERT INTO `brand` (`name` , `img_name`)
VALUES ('Nokia' , 'brand1.png'),
('Canon' , 'brand2.png'),
('Samsung' , 'brand3.png'),
('Apple' , 'brand4.png'),
('HTC' , 'brand5.png'),
('LG' , 'brand6.png');

INSERT INTO `role` (`role_name`)
VALUES('ADMIN'),
('STAFF'),
('USER');


INSERT INTO `account` (`first_name`, `last_name`, `email`, `user_name`, `password` , `pass_confirm`, `gender`)
VALUES ('tran' , 'thai son', 'tstran95@gmail.com' , 'tstran95' , '123456', '123456' , 1);
INSERT INTO `account` (`email`, `first_name`, `gender`, `last_name`, `pass_confirm`, `password`, `user_name`) 
VALUES ('tstran96@gmail.com', 'tran', '1', 'thai son', '123456', '123456', 'tstran96');
INSERT INTO `account` (`email`, `first_name`, `gender`, `last_name`, `pass_confirm`, `password`, `user_name`)
VALUES ('tstran96@gmail.com', 'tran', '1', 'thai son', '123456', '123456', 'tstran96');

INSERT  INTO `role_account`
VALUES (1 , 1),
(2, 2),
(3, 3);


INSERT INTO `product` (`color` ,`description` , `img` , `img_thumb` , `name` , `price`, `price_sale` , `quantity`, `status` , `storage` , `brand_id_brand` , `ram`)
VALUES ('white' , 'IPhone X with color is white' , 'product-1.jpg' , 'product-thumb-1.jpg' , 'IPhone X' , 1000 , 700, 111 , 1 ,256 , 4 , 6);

INSERT INTO `review` (`id_account` , `comment` , `id_product`)
VALUES (1 , 'Nice' , 1);
