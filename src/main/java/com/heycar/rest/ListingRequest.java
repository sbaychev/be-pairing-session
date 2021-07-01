package com.heycar.rest;

import java.util.Objects;
import java.util.StringJoiner;

public class ListingRequest {

    private String code;

    private String make;
    private String model;
    private String year;
    private String color;
    private String price;

    public String getCode() {
        return code;
    }

    public ListingRequest setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMake() {
        return make;
    }

    public ListingRequest setMake(String make) {
        this.make = make;
        return this;
    }

    public String getModel() {
        return model;
    }

    public ListingRequest setModel(String model) {
        this.model = model;
        return this;
    }

    public String getYear() {
        return year;
    }

    public ListingRequest setYear(String year) {
        this.year = year;
        return this;
    }

    public String getColor() {
        return color;
    }

    public ListingRequest setColor(String color) {
        this.color = color;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public ListingRequest setPrice(String price) {
        this.price = price;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListingRequest)) {
            return false;
        }
        ListingRequest that = (ListingRequest) o;
        return Objects.equals(getCode(), that.getCode()) && Objects.equals(getMake(), that.getMake())
            && Objects.equals(getModel(), that.getModel()) && Objects.equals(getYear(), that.getYear())
            && Objects.equals(getColor(), that.getColor()) && Objects
            .equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getMake(), getModel(), getYear(), getColor(), getPrice());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ListingRequest.class.getSimpleName() + "[", "]")
            .add("code='" + code + "'")
            .add("make='" + make + "'")
            .add("model='" + model + "'")
            .add("year='" + year + "'")
            .add("color='" + color + "'")
            .add("price='" + price + "'")
            .toString();
    }
}
