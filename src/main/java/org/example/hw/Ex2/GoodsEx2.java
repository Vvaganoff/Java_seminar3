package org.example.hw.Ex2;

import java.util.Objects;

/**
 * Класс товаров
 * @country - Страна происхождения, String
 * @name  - Наименование товара, String
 * @weight - Вес товара, double
 * @price - Цена товара, double
 * @sort - Сорт товара, String
 */
public class GoodsEx2 {
    private String country;
    private String name;
    private double weight;
    private double price;
    private String sort;

    public GoodsEx2(String country, String name, double weight, double price, String sort) {
        this.country = country;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.sort = sort;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsEx2 goodsEx2 = (GoodsEx2) o;
        return weight == goodsEx2.weight && Double.compare(goodsEx2.price, price) == 0 && Objects.equals(country, goodsEx2.country) && name.equals(goodsEx2.name) && Objects.equals(sort, goodsEx2.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, name, weight, price, sort);
    }

    @Override
    public String toString() {
        return "GoodsEx2{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sort='" + sort + '\'' +
                '}';
    }
}
