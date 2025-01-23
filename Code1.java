import java.sql.SQLOutput;

/*
Write a Java program to demonstrate the use of primitive data types and type conversion. The program should:

Declare and initialize variables of different primitive data types (int, double, char, and boolean).
Perform type conversion by converting an int to a double and a char to an int.
Print the values of all variables before and after the conversions.
 */
public class Code1 {
    public static void main(String []args){
        int intValue=10;
        double doubleValue=25.5;
        char charValue='a';
        boolean booleanValue=false;

        System.out.println("Before Conversion: ");
        System.out.println("intValue: "+intValue);
        System.out.println("doubleValue: "+doubleValue);
        System.out.println("charValue: "+charValue);
        System.out.println("booleanValue: "+booleanValue);

        double convertedDouble=intValue;
        int convertedChar=charValue;

        System.out.println("\nAfter conversion: ");
        System.out.println("convertedDouble: "+convertedDouble);
        System.out.println("convertedChar: "+convertedChar);

        return;
    }
}