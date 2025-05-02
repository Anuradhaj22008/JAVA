package conditional;

import java.util.*;

public class switchexp {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        //output
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Namaskar");
                break;
        
            default:
                System.out.println("the number is not 1,2 and 3");
                break;
        }
    }
    
} 
