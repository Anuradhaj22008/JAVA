package button;

import java.util.*;

public class button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        //output
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("hi");
                break;
            case 3:
                System.out.println("hey");
                break;
        
            default:
                System.out.println("the number is not 1,2 and 3");
                break;
        }
    }
    
}
