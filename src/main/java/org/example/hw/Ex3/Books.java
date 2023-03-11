package org.example.hw.Ex3;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * @name - Наименование книги, String
 * @autorSurname - Фамилия автора книги, String
 * @price - Цена книги, float
 * @year - Год издания книги, int
 * @countOfPages - Количество страниц, int
 */
public class Books {
    private String name;
    private String autorSurname;
    private float price;
    private int year;
    private int countOfPages;


    public Books(String name, String autorSurname, float price, int year, int countOfPages) {
        this.name = name;
        this.autorSurname = autorSurname;
        this.price = price;
        this.year = year;
        this.countOfPages = countOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutorSurname() {
        return autorSurname;
    }

    public void setAutorSurname(String autorSurname) {
        this.autorSurname = autorSurname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", autorSurname='" + autorSurname + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", countOfPages=" + countOfPages +
                '}';
    }
}
