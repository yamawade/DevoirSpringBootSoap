package com.groupeisi.DevoirSoap.service;

import com.groupeisi.DevoirSoap.model.ClasseDevoir;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClasseDevoirService {
    private static final Map<Integer, ClasseDevoir> classes = new HashMap<>();

    @PostConstruct
    public void initialize() {
        ClasseDevoir c1 = new ClasseDevoir();
        c1.setId(1);
        c1.setClassName("GL");
        c1.setDescription("Génie Logiciel");
        classes.put(c1.getId(), c1);

        ClasseDevoir c2 = new ClasseDevoir();
        c2.setId(2);
        c2.setClassName("RT");
        c2.setDescription("Réseaux Télécom");
        classes.put(c2.getId(), c2);

        ClasseDevoir c3 = new ClasseDevoir();
        c3.setId(3);
        c3.setClassName("MAE");
        c3.setDescription("Marketing et Action d’Entreprise");
        classes.put(c3.getId(), c3);
    }

    public ClasseDevoir getClassById(int id) {
        return classes.get(id);
    }

    public Map<Integer, ClasseDevoir> getAllClasses() {
        return classes;
    }
}
