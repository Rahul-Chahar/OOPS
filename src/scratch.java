import java.util.Scanner;

public class scratch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j =0; j<n; j++){

        int a= sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        for(int i=c; i>=1; i--){
            if(i%a==b) {
                System.out.println(i);
                break;
            }
            // System.exit(0);
            }

        }
        System.out.println("-1");
    }
}