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
-- begin CARS_CAR
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
)^
-- end CARS_CAR

--Add default numerator for cars$Car
CREATE OR REPLACE FUNCTION baseInsert()
RETURNS integer
AS $$
DECLARE
    cnt integer = 0;
BEGIN
cnt = (select count(id) from DF_NUMERATOR where CODE = 'CarNumerator' and delete_ts is null);
if(cnt = 0) then
    INSERT INTO DF_NUMERATOR (ID, CREATE_TS, CREATED_BY, VERSION, CODE, NUMERATOR_FORMAT, SCRIPT_ENABLED,
    PERIODICITY, NUMBER_INITIAL_VALUE, LOC_NAME)
    VALUES ('867f8465-e37f-4743-a9eb-ef3d2856fcdb', now(), 'system', 1, 'CarNumerator', 'CAR-[number]', FALSE, 'Y', 1,
    '{"captionWithLanguageList":[{"language":"ru","caption":"Car"},{"language":"en","caption":"Car"}]}'
    );
end if;

return 0;
END;
$$
LANGUAGE plpgsql;
^

select baseInsert()^
drop function if exists baseInsert()^
-- begin addSecGroupConstraintsForCar
insert into SEC_CONSTRAINT (ID, CREATE_TS, CREATED_BY, ENTITY_NAME, JOIN_CLAUSE, WHERE_CLAUSE, GROUP_ID) values 
('c2385608-1efb-4483-9fa0-c9a27c27273f', current_timestamp, 'admin', 'cars$Car', ', ts$CardAcl acl', '{E}.id = acl.card.id and (acl.user.id = :session$userId or acl.global = true)', '8e6306e2-9e10-414a-b437-24c91ffef804')^

-- end addSecGroupConstraintsForCar
