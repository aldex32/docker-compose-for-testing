create table if not exists account
(
    id       serial primary key,
    username text not null
);