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
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@NamePattern("%s|name")
@Table(name = "CARS_CAR_MAKE")
@Entity(name = "cars$CarMake")
@EnableRestore
@TrackEditScreenHistory
public class CarMake extends StandardEntity {
    private static final long serialVersionUID = 399720272426372274L;

    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @Column(name = "CODE", length = 50)
    protected Integer code;

    @Column(name = "NOTE", length = 3000)
    protected String note;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }


}