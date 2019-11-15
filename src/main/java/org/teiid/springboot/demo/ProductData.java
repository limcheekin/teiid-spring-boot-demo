package org.teiid.springboot.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.teiid.spring.annotations.TextTable;

@Entity
@TextTable(file="product_data.csv") /* Also see property: spring.teiid.file.parent-directory=src/main/resources */
public class ProductData {
    @Id
    private String productId;
    private String name;
    private String type;

    public ProductData() {
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
            " productId='" + getProductId() + "'" +
            ", name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }   

}