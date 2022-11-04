import java.util.*;
import java.util.Random;
public class Assignment6A {
    public static void ranArray(int[] array, int array_size) {
        Random rand = new Random();
        for (int i = 0; i < array_size; i++) {
            int rand1 = rand.nextInt(1000 - 500);
            array[i] = rand1;
        }
    }
    public static boolean arraySort(int[] array, int array_size) {
        boolean swapped = false;
        int i, j, temp;
        for (i = 0; i < array_size - 1; i++) {
            for (j = 0; j < array_size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
            return false;
                }
            }
        }
        return true;
    }
    public static void sortThis(int[] array, int array_size) {
        for (int i= 0; i <array_size-1; i++){
            int minPos = i;
            for (int j = i+1; j<array_size; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
                int temp = array[minPos];
                array[minPos] = array[i];
                array[i] = temp;
            }
        }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int size = 10, input;
        int[] ranArray2 = new int[size];
        ranArray(ranArray2, size);
        System.out.println("[Is it sorted?]");
        System.out.println("Random Array: " + Arrays.toString(ranArray2));
        do {
            System.out.println("What do you want to do?" + "\n" + "1) Generate a new random array" + "\n" + "2) Is the array sorted?" + "\n" +
                    "3) Sort this array" + "\n" + "4) Quit");
            System.out.print("Choice: ");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    ranArray(ranArray2,size);
                    System.out.println("Random Array: " + Arrays.toString(ranArray2));
                    break;
                case 2:
                    if (arraySort(ranArray2,size) == true){
                        System.out.println("The array is sorted.");
                    }
                    else if (arraySort(ranArray2,size) == false){
                        System.out.println("The array is not sorted.");
                    }
                    break;
                case 3:
                    sortThis(ranArray2, size);
                    System.out.println("Sorted Array: " + Arrays.toString(ranArray2));
                    break;
                case 4:
                    break;
            }
        }
        while (input != 4);
    }
}
