/*
 * Copyright (c) 2020 com.egorl.thesiscars.service
 */
package com.egorl.thesiscars.service;

import com.egorl.thesiscars.entity.CarPurchaseRequest;
import com.haulmont.thesis.core.entity.Contractor;

import java.util.List;

/**
 * @author lepik
 */
public interface ContractorRequestsService {
    String NAME = "cars_ContractorRequestsService";

    List<CarPurchaseRequest> getContractorPurchaseRequests(Contractor contractor);
}