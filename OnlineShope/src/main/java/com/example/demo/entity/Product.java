package com.example.demo.entity;


import javax.persistence.*;

/**
 * Created by Vardan on 23.07.2017.
 */
@Entity
@Table(name = "product")
public class Product  {

    private long id;
    private String prodName;
    private String image;
    private double price;
    private int quantity;
    private String condit;
    private String availability;
    private long view;
    private Category categoryByCategoryId;
    private Brand brandByBrandId;
    private Purpose purposeByPurposeId;






    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Column(name = "pic", nullable = true)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "condit")
    public String getCondit() {
        return condit;
    }

    public void setCondit(String condit) {
        this.condit = condit;
    }

    @Column(name = "availability")
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }


    @Column(name = "view")
    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }






    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "id", nullable = false)
    public Brand getBrandByBrandId() {
        return brandByBrandId;
    }

    public void setBrandByBrandId(Brand brandByBrandId) {
        this.brandByBrandId = brandByBrandId;
    }


    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }


    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

    @ManyToOne
    @JoinColumn(name = "purpose_id", referencedColumnName = "id", nullable = false)
    public Purpose getPurposeByPurposeId() {
        return purposeByPurposeId;
    }

    public void setPurposeByPurposeId(Purpose purposeByPurposeIdr) {
        this.purposeByPurposeId = purposeByPurposeIdr;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", prodName='" + prodName + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", condit='" + condit + '\'' +
                ", availability='" + availability + '\'' +
                ", view=" + view +
                ", categoryByCategoryId=" + categoryByCategoryId +
                ", brandByBrandId=" + brandByBrandId +
                ", purposeByPurposeId=" + purposeByPurposeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (quantity != product.quantity) return false;
        if (view != product.view) return false;
        if (prodName != null ? !prodName.equals(product.prodName) : product.prodName != null) return false;
        if (image != null ? !image.equals(product.image) : product.image != null) return false;
        if (condit != null ? !condit.equals(product.condit) : product.condit != null) return false;
        if (availability != null ? !availability.equals(product.availability) : product.availability != null)
            return false;
        if (categoryByCategoryId != null ? !categoryByCategoryId.equals(product.categoryByCategoryId) : product.categoryByCategoryId != null)
            return false;
        if (brandByBrandId != null ? !brandByBrandId.equals(product.brandByBrandId) : product.brandByBrandId != null)
            return false;
        return purposeByPurposeId != null ? purposeByPurposeId.equals(product.purposeByPurposeId) : product.purposeByPurposeId == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (prodName != null ? prodName.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + quantity;
        result = 31 * result + (condit != null ? condit.hashCode() : 0);
        result = 31 * result + (availability != null ? availability.hashCode() : 0);
        result = 31 * result + (int) (view ^ (view >>> 32));
        result = 31 * result + (categoryByCategoryId != null ? categoryByCategoryId.hashCode() : 0);
        result = 31 * result + (brandByBrandId != null ? brandByBrandId.hashCode() : 0);
        result = 31 * result + (purposeByPurposeId != null ? purposeByPurposeId.hashCode() : 0);
        return result;
    }


}

