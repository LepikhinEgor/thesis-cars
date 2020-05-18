insert into SEC_ROLE
(AD_GROUP_NAME, NAME, LOC_NAME, DESCRIPTION, ROLE_TYPE, IS_DEFAULT_ROLE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 'manager', 'Менеджер', null, 0, null, 1, '2020-05-18 13:05:38', null, null, null, '80f88708-ee75-5389-dcb4-4dfdac39de10', '2020-05-18 13:05:38', 'admin')^

insert into SEC_PERMISSION
(PERMISSION_TYPE, TARGET, VALUE, ROLE_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (10, 'cars$CarPurchaseRequest.lookup', 1, '80f88708-ee75-5389-dcb4-4dfdac39de10', 1, '2020-05-18 13:14:19', null, null, null, '7c5bff16-b0f3-8f45-3842-14987d27633f', '2020-05-18 13:14:19', 'admin')^

insert into SEC_ROLE
(AD_GROUP_NAME, NAME, LOC_NAME, DESCRIPTION, ROLE_TYPE, IS_DEFAULT_ROLE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 'bank_operator', 'Оператор банка', null, 0, null, 1, '2020-05-18 13:11:32', null, null, null, 'bdad2509-cb7d-0327-c2f0-3590c9a8eef5', '2020-05-18 13:11:32', 'admin')^

insert into SEC_PERMISSION
(PERMISSION_TYPE, TARGET, VALUE, ROLE_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (10, 'cars$CarPurchaseRequest.lookup', 1, 'bdad2509-cb7d-0327-c2f0-3590c9a8eef5', 1, '2020-05-18 13:11:32', null, null, null, '7a16f77d-36e9-4e6d-3446-d5797e2165d8', '2020-05-18 13:11:32', 'admin')^

insert into SEC_ROLE
(AD_GROUP_NAME, NAME, LOC_NAME, DESCRIPTION, ROLE_TYPE, IS_DEFAULT_ROLE, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (null, 'master', 'Мастер', null, 0, null, 1, '2020-05-18 13:15:28', null, null, null, 'e6b9cf41-a403-3ce9-a749-e92c4c69708e', '2020-05-18 13:15:28', 'admin')^

insert into SEC_PERMISSION
(PERMISSION_TYPE, TARGET, VALUE, ROLE_ID, VERSION, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ID, CREATE_TS, CREATED_BY)
values (10, 'cars$CarPurchaseRequest.lookup', 1, 'e6b9cf41-a403-3ce9-a749-e92c4c69708e', 1, '2020-05-18 13:15:28', null, null, null, '5e6af7f6-1497-ec49-6003-477e1c6ffcef', '2020-05-18 13:15:28', 'admin')^