import java.util.*;
public class Assignment6B {
public static String whatsMyType(char data){
    return data + " is a char value!";
}
    public static String whatsMyType(int data){
        return data + " is a char value!";
    }
    public static String whatsMyType(String data){
return data + " is a string value!";
    }
    public static String whatsMyType(float data){
        return data + " is a float value!";
    }
    public static String whatsMyType(boolean data){
        return data + " is a boolean value!";
    }
    public static void main(String []arg){
    Scanner scan = new Scanner(System.in);
    System.out.println("[What’s my datatype?]");
        System.out.print("Enter an int: ");
        int in1 = scan.nextInt();
        System.out.print("Enter a string: ");
        String in2 = scan.next();
        System.out.print("Enter a float: ");
        float in3 = scan.nextFloat();
        System.out.print("Enter a char: ");
        char in4 = scan.next().charAt(0);
        System.out.print("Enter a boolean: ");
        boolean in5 = scan.nextBoolean();
        System.out.println("What datatype do you want to check?");
        String in6 = scan.next();
        if (in6.equalsIgnoreCase("Char")){
            System.out.println(whatsMyType(in4));
        }
        else if (in6.equalsIgnoreCase("String")) {
            System.out.println(whatsMyType(in2));
        }
        else if (in6.equalsIgnoreCase("float")) {
            System.out.println(whatsMyType(in3));
        }
        else if (in6.equalsIgnoreCase("int")) {
            System.out.println(whatsMyType(in1));
        }
        else if (in6.equalsIgnoreCase("boolean")) {
            System.out.println(whatsMyType(in5));
        }
    }
}
