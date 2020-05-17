alter table CARS_CAR add constraint FK_CARS_CAR_CAR_MAKE_ID foreign key (CAR_MAKE_ID) references CARS_CAR_MAKE(ID);
alter table CARS_CAR add constraint FK_CARS_CAR_CARD_ID foreign key (CARD_ID) references WF_CARD(ID);
create index IDX_CARS_CAR_CAR_MAKE on CARS_CAR (CAR_MAKE_ID);
