create table CARS_CAR (
    CARD_ID uuid,
    --
    NUMBER_ varchar(50),
    CAR_MAKE_ID uuid not null,
    NAME varchar(100),
    ISSUE_YEAR integer,
    COST decimal(19, 2),
    TYPE_ integer,
    --
    primary key (CARD_ID)
);
