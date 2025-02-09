package search.binary;


import java.util.List;

public class MyBinarySearchApp {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 8, 11, 12, 13, 14, 17, 20, 23, 25, 26, 27, 28, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 45, 46, 47, 48, 49, 50, 51, 52, 53, 55, 56, 58, 59, 60, 72, 85, 96, 100, 102, 201, 302, 303};
        //binarySearch(array, 303);
        recursiveBinarySearch(array, 303, 0, array.length);
    }

    private static void binarySearch(int[] array, int searchedValue) {
        int debut = 0;
        int fin = array.length;

        while (debut <= fin) {
            int milieu = (debut + fin) / 2;
            System.out.println("milieu: " + array[milieu]);
            if (array[milieu] == searchedValue) {
                System.out.println("trouvé");
                break;
            } else if (array[milieu] < searchedValue) {
                System.out.println("plus grand");
                debut = milieu + 1;
            } else {
                System.out.println("plus petit");
                fin = milieu - 1;
            }
        }
        System.out.println("non trouvé");
    }

    private static int recursiveBinarySearch(int[] array, int searchedValue, int debut, int fin) {
        if (debut > fin) {
            return -1;
        }
        int milieu = (debut + fin) / 2;

        if (array[milieu] == searchedValue) {
            return milieu;
        } else if (array[milieu] < searchedValue) {
            return recursiveBinarySearch(array, searchedValue, milieu + 1, fin);
        } else {
            return recursiveBinarySearch(array, searchedValue, debut, milieu - 1);
        }
    }
}
