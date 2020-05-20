package com.egorl.thesiscars.scripts

import com.haulmont.cuba.core.Persistence
import com.haulmont.cuba.core.global.AppBeans
import com.haulmont.cuba.core.global.UserSessionSource

def user = AppBeans.get(UserSessionSource.class).getUserSession().getUser()
def persistence = AppBeans.get(Persistence.class)

def cards = persistence.getEntityManager().createQuery("select pr from cars\$CarPurchaseRequest pr where pr.creator.id = :userId " +
        "and (pr.proc is null OR pr.proc.name <> 'Утверждения заявки')")
        .setParameter("userId", user.getId())
        .getResultList()

return cards
