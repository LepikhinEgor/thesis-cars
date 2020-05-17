create table CARS_CAR_PURCHASE_REQUEST (
    CARD_ID uuid,
    --
    CAR_ID uuid,
    BUYER_ID uuid,
    BANK_ID uuid,
    PAID boolean,
    --
    primary key (CARD_ID)
);
