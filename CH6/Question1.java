public class Question1{
    public static void main(String argv[]){
        int j = 0;
        for(int i=1; i<=100; i++){
            if (i%3==0){
                j += i;
            }
        }
        System.out.println(j);
    }
}