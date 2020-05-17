/*
 * Copyright (c) 2020 com.egorl.thesiscars.core.app.reassignment.commands
 */
package com.egorl.thesiscars.core.app.reassignment.commands;


import com.haulmont.thesis.core.app.reassignment.commands.AbstractDocReassignmentCommand;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;

import com.egorl.thesiscars.entity.CarPurchaseRequest;

/**
 * @author lepik
 */
@ManagedBean(CarPurchaseRequestReassignmentCommand.NAME)
public class CarPurchaseRequestReassignmentCommand extends AbstractDocReassignmentCommand<CarPurchaseRequest> {
    protected static final String NAME = "carpurchaserequest_reassignment_command";

    @PostConstruct
    protected void postInit() {
        type = "CarPurchaseRequest";
        docQuery = String.format(DOC_QUERY_TEMPLATE, "cars$CarPurchaseRequest");
    }

    @Override
    public String getName() {
        return NAME;
    }
}