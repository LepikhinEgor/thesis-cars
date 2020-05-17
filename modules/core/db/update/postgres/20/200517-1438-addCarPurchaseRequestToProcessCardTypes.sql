--Update process card_types for entity cars$CarPurchaseRequest
update wf_proc set card_types = regexp_replace(card_types, E',cars\\$CarPurchaseRequest', '') where code in ('Endorsement','Resolution','Acquaintance','Registration')^
update wf_proc set updated_by='admin', card_types = card_types || 'cars$CarPurchaseRequest,' where code in ('Endorsement','Resolution','Acquaintance','Registration')^
