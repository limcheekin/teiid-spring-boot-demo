package org.teiid.springboot.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.teiid.spring.annotations.SelectQuery;

@Entity
@SelectQuery("SELECT a.productId, a.cusip, b.name, a.symbol, a.symbolType, b.type " + 
             "FROM symbols.product_symbols AS a, product_data AS b " + 
             "WHERE a.productId = b.product_id")
public class Product {
    @Id
    private String productId;
    private Integer symbolType;
    private String symbol;
    private String cusip;
    private String name;
    private String type;


    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getSymbolType() {
        return this.symbolType;
    }

    public void setSymbolType(Integer symbolType) {
        this.symbolType = symbolType;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCusip() {
        return this.cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
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
            ", symbolType='" + getSymbolType() + "'" +
            ", symbol='" + getSymbol() + "'" +
            ", cusip='" + getCusip() + "'" +
            ", name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }

}