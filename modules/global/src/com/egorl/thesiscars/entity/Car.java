/*
 * Copyright (c) 2020 com.egorl.thesiscars.entity
 */
package com.egorl.thesiscars.entity;


/**
 * @author lepik
 */
import com.haulmont.cuba.core.entity.annotation.EnableRestore;
import com.haulmont.cuba.core.entity.annotation.TrackEditScreenHistory;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.DiscriminatorValue;
import javax.persistence.InheritanceType;
import javax.persistence.Inheritance;
import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.thesis.core.entity.TsCard;
import com.haulmont.cuba.core.entity.annotation.Listeners;

@Listeners("cars_CarListener")
@PrimaryKeyJoinColumn(name = "CARD_ID", referencedColumnName = "ID")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("1")
@Table(name = "CARS_CAR")
@Entity(name = "cars$Car")
@EnableRestore
@TrackEditScreenHistory
public class Car extends TsCard {
    private static final long serialVersionUID = -7444845067282336193L;

    @Column(name = "NUMBER_", length = 50)
    protected String number;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CAR_MAKE_ID")
    protected CarMake carMake;

    @Column(name = "NAME", length = 100)
    protected String name;

    @Column(name = "ISSUE_YEAR", length = 50)
    protected Integer issueYear;

    @Column(name = "COST", length = 50)
    protected BigDecimal cost;

    @Column(name = "TYPE_")
    protected Integer type;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setCarMake(CarMake carMake) {
        this.carMake = carMake;
    }

    public CarMake getCarMake() {
        return carMake;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIssueYear(Integer issueYear) {
        this.issueYear = issueYear;
    }

    public Integer getIssueYear() {
        return issueYear;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }


}