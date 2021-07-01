package com.heycar.model;

import java.util.Objects;
import java.util.StringJoiner;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String make;
    private String model;
    private String year;
    private String color;
    private String price;

    public String getDealerId() {
        return dealerId;
    }

    public Listing setDealerId(String dealerId) {
        this.dealerId = dealerId;
        return this;
    }

    private String dealerId;

    public String getCode() {
        return code;
    }

    public Listing setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMake() {
        return make;
    }

    public Listing setMake(String make) {
        this.make = make;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Listing setModel(String model) {
        this.model = model;
        return this;
    }

    public String getYear() {
        return year;
    }

    public Listing setYear(String year) {
        this.year = year;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Listing setColor(String color) {
        this.color = color;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Listing setPrice(String price) {
        this.price = price;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Listing)) {
            return false;
        }
        Listing listing = (Listing) o;
        return Objects.equals(id, listing.id) && Objects.equals(getCode(), listing.getCode())
            && Objects.equals(getMake(), listing.getMake()) && Objects
            .equals(getModel(), listing.getModel()) && Objects.equals(getYear(), listing.getYear())
            && Objects.equals(getColor(), listing.getColor()) && Objects
            .equals(getPrice(), listing.getPrice()) && Objects.equals(getDealerId(), listing.getDealerId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getCode(), getMake(), getModel(), getYear(), getColor(), getPrice(), getDealerId());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Listing.class.getSimpleName() + "[", "]")
            .add("id=" + id)
            .add("code='" + code + "'")
            .add("make='" + make + "'")
            .add("model='" + model + "'")
            .add("year='" + year + "'")
            .add("color='" + color + "'")
            .add("price='" + price + "'")
            .add("dealerId='" + dealerId + "'")
            .toString();
    }
}
