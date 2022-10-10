package com.swissre.wxd.petclinicdata.services;

import com.swissre.wxd.petclinicdata.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
