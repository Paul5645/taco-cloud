create table if not exists Taco_Order (
    id int auto_increment primary key,
    delivery_Name varchar(50) not null,
    delivery_Street varchar(50) not null,
    delivery_City varchar(50) not null,
    delivery_State varchar(2) not null,
    delivery_Zip varchar(10) not null,
    cc_number varchar(16) not null,
    cc_expiration varchar(5) not null,
    cc_cvv varchar(3) not null,
    placed_at timestamp not null
    );

create table if not exists Taco (
    id int auto_increment primary key,
    name varchar(50) not null,
    taco_order int not null,
    created_at timestamp not null,
    foreign key (taco_order) references Taco_Order(id)
    );

create table if not exists Ingredient (
    id varchar(4) not null primary key,
    name varchar(25) not null,
    type varchar(10) not null
    );

create table if not exists Ingredient_Ref (
    ingredient varchar(4) not null,
    taco int not null,
    primary key (ingredient, taco),
    foreign key (ingredient) references Ingredient(id),
    foreign key (taco) references Taco(id)
    );
