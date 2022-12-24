package CH7;

public class Question4 {
    public static void main(String argv[]){
        int[] a = {30, 20, 10, 5, 34};
        int[] b = new int[5];
        int i, p=4, f=4;
        for(i=0; i<=p; i++){
            b[f] = a[i];
            f--;
        }

        for(i=0; i<5; i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        for(i=0; i<5; i++){
            System.out.print(b[i] + "\t");
        }
    }
}
