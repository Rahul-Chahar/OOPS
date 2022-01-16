/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 15/01/2022
 */
import java.util.*;
public class scratch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
            //System.out.print(A[i]+" ");
        }
        //System.out.print(A[i]+" ");
        Arrays.sort(A);

        for(int i =0; i<A.length; i++ ){
            for(int j=i+1; j<A.length; j++){
                if(A[i] == A[j]){
                    System.out.print(A[i]);
                }
               // System.out.print(Arrays.sort(A));

            }
        }
       // System.out.print(Arrays.sort(A));
    }
}