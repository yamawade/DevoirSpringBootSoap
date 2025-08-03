package com.groupeisi.DevoirSoap.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for classeDevoir complex type.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classeDevoir", propOrder = {
        "id",
        "className",
        "description"
})
public class ClasseDevoir {

    protected int id;

    @XmlElement(required = true)
    protected String className;

    @XmlElement(required = true)
    protected String description;

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String value) {
        this.className = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }
}
