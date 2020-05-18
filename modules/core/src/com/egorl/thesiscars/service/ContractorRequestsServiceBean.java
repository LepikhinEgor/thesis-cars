/*
 * Copyright (c) 2020 com.egorl.thesiscars.service
 */
package com.egorl.thesiscars.service;

import com.egorl.thesiscars.entity.CarPurchaseRequest;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.View;
import com.haulmont.thesis.core.entity.Contractor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * @author lepik
 */
@Service(ContractorRequestsService.NAME)
public class ContractorRequestsServiceBean implements ContractorRequestsService {

    @Inject
    Persistence persistence;

    @Inject
    Metadata metadata;

    @Override
    @Transactional
    public List<CarPurchaseRequest> getContractorPurchaseRequests(Contractor contractor) {
        EntityManager em = persistence.getEntityManager();
        TypedQuery<CarPurchaseRequest> query = em.createQuery(
                "select cr from cars$CarPurchaseRequest cr where cr.buyer.id = :buyerId",
                CarPurchaseRequest.class);
        query.setParameter("buyerId", contractor);
        query.setView(metadata.getViewRepository().getView(contractor.getMetaClass(), View.LOCAL));

        return query.getResultList();
    }

}