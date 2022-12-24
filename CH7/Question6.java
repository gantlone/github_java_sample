package CH7;

public class Question6 {
    public static void main(String[] argv){
        int[] a = {20, 30, 40 ,50};
        int[] b = {1, 3, 0, 2};
        int[] tmp = new int[4];
        int i, x;
        for(i=0; i<a.length; i++){
            x = a[i];
            tmp[b[i]] = x;
        }
        
        a = tmp;
        for(i=0; i<a.length; i++){
            System.out.print(a[i] + "\t");
        }
    }
}