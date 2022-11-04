import java.util.*;
public class Assignment6C{
    public static void printArray(String[][] array){
for (int i = 0; i < array.length; i++){
   for (int j = 0; j < array.length; j++){
   System.out.print("|" + array[i][j]);
    }
    System.out.println("|");
}
    }
    public static boolean isFull(String[][] array, int column, char player){
        boolean isFull = false;
        for (int i=0; i< array.length; i++){
            for (int j = 0; j < array.length; j++){
            if ((array[i][j].contains(" "))){
                return true;
                }
            }
        }
        return false;
    }
public static void addDisc(String[][] array, int column, char player){



}
public static boolean winVertical (String[][]array, char player){

}
public static boolean winHorizontal (String[][] array, char player){

}
//    public static boolean winDiagonal (String[][] array, char player){
//    }
public static void main(String[]arg){
        Scanner scan = new Scanner(System.in);
    String[][] board = new String[4][4];
    for (int i = 0; i < board.length; i++){
        for (int j = 0; j < board.length; j++){
            System.out.print(" " + board[i][j]);
        }

    }
        System.out.println("[Connect Four]");
        do {
            System.out.println("Player 1, enter a column: ");
            String in1 = scan.next();
            for (int i = 0; i < board.length; i++){
                for (int j = 0; j < board.length; j++){
                    System.out.print(" " + board[i][j]);
                }

            }
            System.out.println("Player 2, enter a column: ");
            String in2 = scan.next();
            for (int i = 0; i < board.length; i++){
                for (int j = 0; j < board.length; j++){
                    System.out.print(" " + board[i][j]);
                }

            }
        } while ();
    }
}
//// create array and fll it with empty spaces
//// if the player has 1 vertical or hori break the whle loop
////
