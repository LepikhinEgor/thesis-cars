-- begin CARS_CAR_MAKE
create table CARS_CAR_MAKE (
    ID uuid,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    CODE integer,
    NOTE varchar(3000),
    --
    primary key (ID)
)^
-- end CARS_CAR_MAKE
