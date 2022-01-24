/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 24/01/2022
 */

package Scratch;

import java.util.Scanner;

/**public class searching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = scanner.nextInt();
        System.out.println("enter elements in array");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
       for(int array :arr){
            System.out.println(array);
        }
        /*for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("enter a number you want to search in unsorted array");
        int x = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if(arr[i]==x){s
                System.out.println("element found at index of "+ i);
            }

        }
    }
}*/

class searching{
    static int search(int arr[],int x){
         int n = arr.length;
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int array : arr){
            System.out.print(array+" ");
        }
        System.out.println(search(arr,9));
    }
}