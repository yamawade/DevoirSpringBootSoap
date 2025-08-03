package com.groupeisi.DevoirSoap.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for sector complex type.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sector", propOrder = {
        "id",
        "name"
})
public class Sector {

    protected int id;

    @XmlElement(required = true)
    protected String name;

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }
}
