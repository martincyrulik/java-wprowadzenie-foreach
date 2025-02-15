/**
 * Zadanie 3 - Tablica dwuwymiarowa
 * Wyświetl dowolną tablicę dwuwymiarową korzystając z pętli foreach.
 */

public class Display2_d_Array {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,3,4},
                {2,6,8,-4,7},
                {1,7,-3,10,12,-1},
                {3,9}
        };

        for (int[] wiersz : numbers){
            for (int number : wiersz){
                System.out.print(number + ",");
            }
            System.out.println();
        }

    }
}
