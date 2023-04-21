drop database IF EXISTS weatherBD;
create DATABASE weatherBD;
USE weatherBD;
SET NAMES 'utf8';


create TABLE cities (
    name varchar (32) PRIMARY KEY not null,
    latitude float not null,
    longitude float not null;

)

create TABLE quotes (
    id bigint PRIMARY KEY NOT NULL AUTO_INCREMENT,
    author_name varchar (32) NOT NULL,
    text varchar (32) NOT NULL);
)

insert into quotes(name, text) values
("Федор Достоевский", "Жизнь задыхается без цели"),
("Теодор Рузвель", "Никогда не ошибается тот, кто ничего не делает"),
("Наполеон Бонапарт", "Дай человеку власть, и ты узнаешь, кто он"),
("Стивен Хокинг", "Перспектива рано умереть заставила меня понять, что жизнь стоит того, чтобы её прожить"),
("Генри Форд", "Если тебе тяжело, значит ты поднимаешься в гору. Если тебе легко, значит ты летишь в пропасть");


insert into cities(name, latitude, longitude) values
("Moscow", 55.75, 37.62),
("Astrahan", 46.35, 48.04),
("Tomsk", 56.5, 84.97);