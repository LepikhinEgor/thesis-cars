package com.egorl.thesiscars.web.carpurchaserequest;

import java.util.Map;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.thesis.web.ui.basicdoc.browse.AbstractDocBrowser;
import com.egorl.thesiscars.entity.CarPurchaseRequest;

public class CarPurchaseRequestBrowse extends AbstractDocBrowser<CarPurchaseRequest> {

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
        entityName = "cars$CarPurchaseRequest";
    }
}