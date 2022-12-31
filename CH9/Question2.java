package 習題練習.CH9;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] argv){
        System.out.println("請輸入一個數字，將會從排列好的陣列告訴你他的位置: ");
        int[] numarr = {1,2,3,5,6,9,10};
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("在陣列中第" + Searcher.binarySearch(input, numarr) + "個位置");
        sc.close();
    }
}

class Searcher{
    public static int binarySearch(int x, int[] y){
        int start = 0;
        int end = y.length - 1;
        while(end >= start){
            int mid = (start + end)/2;
            if(y[mid] < x){
                start = mid + 1;
            }
            else if(y[mid] > x){
                end = mid - 1;
            }
            else{
                return mid + 1;
            }        
        }
        return -1;
    }
}