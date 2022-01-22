package Scratch;

import java.util.Scanner;
class twoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("enter a number");
        int N = sc.nextInt();
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                x = i;
                y =j;
                if(x*y>=N){
                    int z = x+y;
                    System.out.println(x+" "+y);
                    System.out.println(z);
                    System.exit(1);

                }

            }

        }
    }
}