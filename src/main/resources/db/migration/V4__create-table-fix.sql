create table fix(
     id bigint not null auto_increment,
     entrada varchar(30) not null,
     saida varchar(30) not null,
     nome varchar(100) not null,
     anos_exp varchar(100) not null,
     marca varchar(100) not null,
     modelo varchar(100) not null,
     ano varchar(20),
     primary key(id)
);