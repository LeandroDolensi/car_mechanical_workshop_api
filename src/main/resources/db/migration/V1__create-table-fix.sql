create table fix(
     id bigint not null auto_increment,
     entrada varchar(30) not null,
     saida varchar(30) not null,
     nome varchar(100) not null,
     anos_exp varchar(3),
     marca varchar(100) not null,
     modelo varchar(100) not null,
     ano varchar(10) not null,
     primary key(id)
);