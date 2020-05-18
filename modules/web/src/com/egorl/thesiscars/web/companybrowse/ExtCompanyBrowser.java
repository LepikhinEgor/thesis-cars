/*
 * Copyright (c) 2020 com.egorl.thesiscars.web.companybrowse
 */
package com.egorl.thesiscars.web.companybrowse;

import com.egorl.thesiscars.service.ContractorRequestsService;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.thesis.core.entity.Company;
import com.haulmont.thesis.web.ui.company.CompanyBrowser;

import javax.inject.Inject;
import java.util.Map;

/**
 * @author lepik
 */
public class ExtCompanyBrowser extends CompanyBrowser {

    @Inject
    ContractorRequestsService contractorRequestsService;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        companiesTable.addGeneratedColumn("requestsCount", new Table.ColumnGenerator<Company>() {
            @Override
            public Component generateCell(Company company) {
                int requestsCount = contractorRequestsService.getContractorPurchaseRequests(company).size();

                return new Table.PlainTextCell(Integer.toString(requestsCount));
            }
        });
    }
}
