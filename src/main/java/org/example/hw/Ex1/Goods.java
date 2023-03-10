package org.example.hw.Ex1;

/**
 * Класс товаров
 * @name - Наименование товара типа String
 * @sort - сорт товара типа String
 * @price - Цена товара типа double
 */
public class Goods {
    private String name;
    private String sort;
    private double price;

    public Goods(String name, String sort, double price) {
        this.name = name;
        this.sort = sort;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", price=" + price +
                '}';
    }
}
