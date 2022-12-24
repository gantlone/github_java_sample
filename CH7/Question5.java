package CH7;

public class Question5 {
    public static void main(String[] argv){
        int[] a = {1, 2, 4, 7};
        int i,tmp=0;
        for(i=0; i<a.length; i++){
            tmp = tmp + a[i]*a[i]*a[i];
        }
        System.out.println(tmp);
    }
}
