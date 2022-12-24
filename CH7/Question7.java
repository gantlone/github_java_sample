package CH7;

import java.util.Arrays;

public class Question7 {
    public static void main(String[] argv){
        int i, p, n=100;
        boolean[] a = new boolean[n+1];
        int[] b;
        Arrays.fill(a, true); //true = 質數 
        for(p=2; p<=n; p++){
            for(i=0; i<=n; i++){
                if(i!=0 & i!=1 & i%p==0 & i/p != 1 ){
                    a[i] = false;} //false = 不為質數
                else if(i==0 | i==1){
                    a[i] = false; //false = 不為質數
                }
                }
        
        }
        for(i=1; i<=n; i++){
            if(a[i]==true){
                System.out.print(i + "\t");
            }
        }
        }}
