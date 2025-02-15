/**
 * Zadanie 1 - Wyświetlenie cen
 * Napisz program, który dla podanych cen
 * wyświetli nowe ceny, powiększone o 10%
 */

public class PriceIncrease {
    public static void main(String[] args) {

//        int[] numbers = {1,4,-5,2,0};
//
//        for (int number : numbers){
//            System.out.print(number + ",");

        double[] prices = {23.0, 22.11, 2134.12, 5, 62.1};

        System.out.println("-----------przed podwyżką-----------");
        //przed podwyżką
        for (double price : prices){
            System.out.println(price);
        }

        System.out.println("-----------po podwyżce-----------");
        //po podwyżce
        for (double price : prices) {
            System.out.println(price * 1.1);
        }
    }
}
