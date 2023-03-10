package org.example.hw.Ex1;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        /**
         * 1. Дан массив записей: наименование товара, цена, сорт.
         * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
         * название которых содержит «высший».
         */
        List<Goods> goodsList= new ArrayList<>();
        Goods good1 = new Goods("Колбаса", "1", 380);
        Goods good2 = new Goods("Колбаса высший", "1", 410);
        Goods good3 = new Goods("Колбаса копченая", "3", 280);
        Goods good4 = new Goods("Сосиски молочные", "2", 360);
        Goods good5 = new Goods("Сосиски молочные высший", "1", 420);
        Goods good6 = new Goods("Карбонад высший", "3", 380);
        Goods good7 = new Goods("Карбонад высший", "2", 430);
        Goods good8 = new Goods("Карбонад высший", "1", 580);
        Goods good9 = new Goods("Карбонад высший", "4", 380);
        goodsList.add(good1);
        goodsList.add(good2);
        goodsList.add(good3);
        goodsList.add(good4);
        goodsList.add(good5);
        goodsList.add(good6);
        goodsList.add(good7);
        goodsList.add(good8);
        goodsList.add(good9);
        double max = 0;
        String goodName = "";
        for (Goods good:goodsList
             ) {
            if(good.getName().contains("высший") && (good.getSort().equals("1") || good.getSort().equals("2"))){
                if (good.getPrice() > max){
                    max = good.getPrice();
                    goodName = good.getName();
                }
            }
        }
        System.out.println("Наибольшую цену товаров 1го или 2го сорта среди товаров,название " +
                "которых содержит «высший» имеет товар: \n" + goodName + "\n Его цена: " + max);
    }
}
