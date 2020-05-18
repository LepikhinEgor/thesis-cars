/*
 * Copyright (c) 2020 com.egorl.thesiscars.web.individualbrowse
 */
package com.egorl.thesiscars.web.individualbrowse;

import com.egorl.thesiscars.service.ContractorRequestsService;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.thesis.core.entity.Individual;
import com.haulmont.thesis.web.ui.individual.IndividualBrowser;

import javax.inject.Inject;
import java.util.Map;

/**
 * @author lepik
 */
public class ExtIndividualBrowser extends IndividualBrowser {

    @Inject
    ContractorRequestsService contractorRequestsService;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        individualsTable.addGeneratedColumn("requestsCount", new Table.ColumnGenerator<Individual>() {
            @Override
            public Component generateCell(Individual individual) {
                int requestsCount = contractorRequestsService.getContractorPurchaseRequests(individual).size();

                return new Table.PlainTextCell(Integer.toString(requestsCount));
            }
        });
    }
}
