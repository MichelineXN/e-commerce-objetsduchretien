package com.chretiens.objetsduchretien.Service.Impl;

import com.chretiens.objetsduchretien.Service.DonService;
import com.chretiens.objetsduchretien.domain.Commande;
import com.chretiens.objetsduchretien.domain.Don;
import com.chretiens.objetsduchretien.repositories.DonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DonServiceIpml implements DonService {

    @Autowired
    private DonRepository donRepository;

    @Override
    public Don add(String montant) {
        Don don = new Don();
        don.setDon(montant);

        return donRepository.save(don);
    }

    @Override
    public Don add(String nameDonateur, String objetDon) {
        return null;
    }

    @Override
    public Don findById(int id) {
        return donRepository.findById(id).orElse(null) ;
    }
}