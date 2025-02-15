/**
 * Zadanie 2 - Liczby podzielne
 * Dla podanych liczb wyświetl liczby podzielne przez 5.
 * Użyj pętli foreach.
 */

public class LiczbyPodzielne {
    public static void main(String[] args) {

        int[] numbers = {5, 12, 16, 20, 26, 32, 36, 40};

        System.out.println("-------------zbiór wszystkich liczb-------------");
        for (int i : numbers){
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("-------------zbiór liczb podzielnych przez 5------------");
        for (int i : numbers){
            if (i % 5 == 0){
                System.out.print(i + ",");
            }
        }
    }
}
