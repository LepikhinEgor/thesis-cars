/*
 * Copyright (c) 2020 com.egorl.thesiscars.entity
 */
package com.egorl.thesiscars.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;

/**
 * @author lepik
 */
public enum CarType implements EnumClass<Integer> {

    Crossover(0),
    Universal(1),
    Sedan(2);

    private Integer id;

    CarType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static CarType fromId(Integer id) {
        for (CarType at : CarType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}