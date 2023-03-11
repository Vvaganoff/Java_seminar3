package org.example.hw.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя,
 * веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
 */

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Введите товар (Страна Наименование Вес Цена Сорт):");
        Scanner scanner = new Scanner(System.in);
        List<GoodsEx2> goodsEx2List = new ArrayList<>();
        boolean a = true;
        while (a) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                a = false;
            } else {
                String[] strArray = str.split(" ");
                goodsEx2List.add(new GoodsEx2(strArray[0], strArray[1], Double.parseDouble(strArray[2]),
                        Double.parseDouble(strArray[3]), strArray[4]));
            }
        }
        System.out.println("Введите сорт для поиска:");
        String sortToFind = scanner.nextLine();
        double minPrice = goodsEx2List.get(0).getPrice();
        for (GoodsEx2 good : goodsEx2List
        ) {
            if (good.getSort().equals(sortToFind)) {
                if (good.getPrice() < minPrice) {
                    minPrice = good.getPrice();
                }
            }
        }
        for (GoodsEx2 good : goodsEx2List
        ) {
            if (good.getPrice() == minPrice) {
                System.out.println(good.getName());
            }
        }

    }
}
