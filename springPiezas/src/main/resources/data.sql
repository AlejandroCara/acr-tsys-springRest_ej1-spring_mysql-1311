create table pieza(
    codigo int auto_increment,
    nombre varchar(100),
    primary key (codigo)
);

create table proveedor(
    id char(4),
    nombre varchar(100),
    primary key (id)
);

create table suministra(
    id int auto_increment,
    codigo_pieza int,
    id_proveedor char(4),
    precio int,
    primary key (id),
    foreign key (codigo_pieza) references pieza(codigo)
    on delete cascade on update cascade,
    foreign key (id_proveedor) references proveedor(id)
    on delete cascade on update cascade
)