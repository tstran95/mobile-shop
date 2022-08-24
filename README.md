# mobile-shop

INSERT INTO `account` (`first_name`, `last_name`, `email`, `user_name`, `password` , `pass_confirm`, `gender`)
VALUES ('tran' , 'thai son', 'tstran95@gmail.com' , 'tstran95' , '123456', '123456' , 1)



INSERT INTO `review` (`id_account` , `comment`)
VALUES (1 , 'Nice')

INSERT INTO `product` (`color` ,`description` , `img` , `img_thumb` , `name` , `price`, `price_sale` , `quantity`, `status` , `storage`)
VALUES ('white' , 'IPhone X with color is white' , 'product-1.jpg' , 'product-thumb-1.jpg' , 'IPhone X' , 1000 , 700, 111 , 1 ,256)

INSERT INTO `brand` (`name` , `img_name`)
VALUES ('Nokia' , 'brand1.png'),
('Canon' , 'brand2.png'),
('Samsung' , 'brand3.png'),
('Apple' , 'brand4.png'),
('HTC' , 'brand5.png'),
('LG' , 'brand6.png')
