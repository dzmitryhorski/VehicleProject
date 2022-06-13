package org.example.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Vehicle {

    private String name;

    private String model;

    private String year;

    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return new EqualsBuilder()
                .append(name, vehicle.name)
                .append(model, vehicle.model)
                .append(year, vehicle.year)
                .append(color, vehicle.color)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(model)
                .append(year)
                .append(color)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "name ='" + name + '\'' +
                ", model ='" + model + '\'' +
                ", year =" + year +
                ", color ='" + color + '\'' +
                '}';
    }
}
