create database njbao;
use njbao;
create table user
(
    username varchar(50) not null unique,
    password varchar(50) not null
);
insert into user
values ('admin', 'admin');
create table admin
(
    username varchar(50) not null unique,
    password varchar(50) not null
);
insert into admin
values ('admin', 'admin');
create table type
(
    id          int auto_increment
        primary key,
    name        varchar(50)  not null,
    description varchar(100) not null
);
insert into type (name, description)
values ('电子产品', '电子产品'),
       ('生活用品', '生活用品'),
       ('图书', '图书'),
       ('其他', '其他');
create table service_position
(
    id          int auto_increment
        primary key,
    name        varchar(50)  not null,
    description varchar(100) not null
);
insert into service_position (name, description)
values ('浦口区', '含江浦、桥林街道'),
       ('六合', '含雄州、龙池街道');
create table enterprise_user
(
    id       int auto_increment
        primary key,
    username varchar(50) not null unique,
    company  varchar(50) not null,
    name     varchar(50) not null,
    phone    varchar(50) not null
);
insert into enterprise_user (username, company, name, phone)
values ('zhang', '南京XX有限公司', '张三', '13000000000'),
       ('li', '南京XX有限公司', '李四', '13000000001');
create table service
(
    id      int auto_increment primary key,
    project varchar(50) not null,
    name    varchar(50) not null
);
insert into service (project, name)
values ('电子产品', '张三'),
       ('生活用品', '李四');