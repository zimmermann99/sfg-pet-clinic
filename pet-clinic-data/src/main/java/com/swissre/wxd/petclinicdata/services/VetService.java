package com.swissre.wxd.petclinicdata.services;

import com.swissre.wxd.petclinicdata.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
