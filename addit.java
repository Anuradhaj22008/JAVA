package fun;// always above on import statements
import java.util.*;// for the scanner class


//making a function to add two numbers
public class addit {
    public static int add(int a,int b){
        int c=a+b;
        return c;

    }
    //main function
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = add(a ,b);
        System.out.println(c);// printing the sum of two numbers


    }
    
}

