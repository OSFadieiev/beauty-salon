create table if not exists roles (id bigint generated by default as identity, name varchar(255) not null, primary key (id));
create table if not exists users (id bigint generated by default as identity, email varchar(255) not null, first_name varchar(255) not null, last_name varchar(255) not null, password varchar(255) not null, role_id bigint, primary key (id));
alter table roles add constraint UK_ofx66keruapi6vyqpv6f2or37 unique (name);
alter table users add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);
alter table users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references roles;
