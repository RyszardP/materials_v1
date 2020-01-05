package com.ryszard.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Material {

    private Long materialId;
    private String title;
    private String vCode;
    private String type;
    private int thickness;
    private int length;
    private int width;
    private String color;
    private String description;
    private double price;
    private double coefficient;

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getvCode() {
        return vCode;
    }

    public void setvCode(String vCode) {
        this.vCode = vCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Material)) return false;

        Material material = (Material) o;

        if (thickness != material.thickness) return false;
        if (length != material.length) return false;
        if (width != material.width) return false;
        if (Double.compare(material.price, price) != 0) return false;
        if (Double.compare(material.coefficient, coefficient) != 0) return false;
        if (materialId != null ? !materialId.equals(material.materialId) : material.materialId != null) return false;
        if (title != null ? !title.equals(material.title) : material.title != null) return false;
        if (vCode != null ? !vCode.equals(material.vCode) : material.vCode != null) return false;
        if (type != null ? !type.equals(material.type) : material.type != null) return false;
        if (color != null ? !color.equals(material.color) : material.color != null) return false;
        return description != null ? description.equals(material.description) : material.description == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = materialId != null ? materialId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (vCode != null ? vCode.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + thickness;
        result = 31 * result + length;
        result = 31 * result + width;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(coefficient);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
