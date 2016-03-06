package app07a.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class Product implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = -164834188493691288L;

    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    
    @NotNull
    @NumberFormat(pattern="#,###,###.#")
    private Float price;
    
    @NotNull
    @Past
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date productionDate;

   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Date getProductionDate() {
        return productionDate;
    }
    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }
    @Override
    public String toString()
    {
        return "Product [name=" + name + ", description=" + description
                + ", price=" + price + ", productionDate=" + productionDate
                + "]";
    }
    
    
}