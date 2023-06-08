CREATE TABLE `user`(
  id INT PRIMARY KEY,
  `name` VARCHAR(25),
  `password` VARCHAR(25),
  salt VARCHAR(25),
  email VARCHAR(25),
  phone_number VARCHAR(25),
  `status` INT,
  create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  last_login_time DATETIME,
  last_update_time DATETIME
)

insert into user values (#{user.id},#{user.name},#{user.password},#{user.salt},#{user.email},#{user.phone_number},#{user.status},#{user.create_time},#{user.lastLoginTime},#{user.last_update_time})