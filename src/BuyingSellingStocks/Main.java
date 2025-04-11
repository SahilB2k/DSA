package BuyingSellingStocks;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n= input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        stocks(arr);



    }

    public static void stocks(int[] arr){
        int min=arr[0]; //consider the first element to be the lowest
        int profit=0; //considering the initial profit to be zero

        for(int i=0;i<arr.length;i++){
            int cost=arr[i]-min;
            if(cost>profit){ //comparing profit and storing the max profit
                profit=cost;
            }
            if(arr[i]<min){ //update the minimum value in each iteration
                min=arr[i];
            }

        }

        System.out.println("Total profit earned is: "+profit); //print the final maximum profit

    }
}
