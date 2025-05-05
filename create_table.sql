
create table fiados (
    id int primary key,
    cliente varchar(255),
    categoria varchar(255),
    producto varchar(255),
    unidad varchar(255),
    cantidad int,
    precioventa float8,
    total float8,
    estado varchar(255)
);