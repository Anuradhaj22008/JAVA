package pattern;

public class bipat9 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum=i+j;
                if(sum%2==0){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
                }
            }
            System.out.println();
        }
    }
    

