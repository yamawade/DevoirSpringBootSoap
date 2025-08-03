package com.groupeisi.DevoirSoap.service;

import org.springframework.stereotype.Service;
import com.groupeisi.DevoirSoap.model.Sector;


import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class SectorService {
    private static final Map<Integer, Sector> sectors = new HashMap<>();

    @PostConstruct
    public void initialize() {
        Sector s1 = new Sector();
        s1.setId(1);
        s1.setName("Informatique");
        sectors.put(s1.getId(), s1);

        Sector s2 = new Sector();
        s2.setId(2);
        s2.setName("Santé");
        sectors.put(s2.getId(), s2);

        Sector s3 = new Sector();
        s3.setId(3);
        s3.setName("Industrie");
        sectors.put(s3.getId(), s3);
    }

    public Sector getSectorById(int id) {
        return sectors.get(id);
    }

    public Map<Integer, Sector> getAllSectors() {
        return sectors;
    }
}
