--Add default doc kind for cars$CarPurchaseRequest
CREATE OR REPLACE FUNCTION baseInsert()
RETURNS integer
AS $$
DECLARE
cnt integer = 0;
BEGIN
cnt = (select count(CATEGORY_ID) from DF_DOC_KIND where category_id = 'a6db8bb8-405e-4ffb-bfa5-72724221118a');
if(cnt = 0) then
    insert into SYS_CATEGORY (ID, NAME, ENTITY_TYPE, IS_DEFAULT, CREATE_TS, CREATED_BY, VERSION, DISCRIMINATOR)
    values ( 'a6db8bb8-405e-4ffb-bfa5-72724221118a', 'Заявка на покупку автомобиля', 'cars$CarPurchaseRequest', false, now(), USER, 1, 1);

    insert into DF_DOC_KIND (category_id, create_ts, created_by, version, doc_type_id, numerator_id, 
    numerator_type, category_attrs_place, tab_name, portal_publish_allowed, disable_add_process_actors, create_only_by_template)
    values ('a6db8bb8-405e-4ffb-bfa5-72724221118a', 'now()', 'admin', 1, 'f727e873-4823-425d-ada4-775f12c273bc', '4acaed60-6f43-4faa-8601-927026b14d4d', 
    1, 1, 'Р”РѕРї. РїРѕР»СЏ', false, false, false);
end if;return 0;

END;
$$
LANGUAGE plpgsql;
^
select baseInsert();
^
drop function if exists baseInsert()^
