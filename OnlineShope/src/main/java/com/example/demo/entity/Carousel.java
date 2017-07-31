package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Vardan on 31.07.2017.
 */
@Entity
@Table
public class Carousel {
    private long id;
    private String image1;
    private String image2;
    private long position;
    private String logoText1;
    private String logoText2;
    private String header;
    private String description;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "image1")
    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    @Column(name = "image2")
    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    @Column(name = "position")
    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    @Column(name = "logo_text1")
    public String getLogoText1() {
        return logoText1;
    }

    public void setLogoText1(String logoText1) {
        this.logoText1 = logoText1;
    }

    @Column(name = "logo_text2")
    public String getLogoText2() {
        return logoText2;
    }

    public void setLogoText2(String logoText2) {
        this.logoText2 = logoText2;
    }

    @Column(name = "header")
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
