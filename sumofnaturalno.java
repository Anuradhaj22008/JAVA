package loopcondition;
import java.util.*;
public class sumofnaturalno{

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms to be added: ");
        int n = sc.nextInt();
        int sum=0;
    
        for(int i=1; i<=n; i++){
            sum=sum+i;
        
        }
        System.out.println(sum);
    }
}