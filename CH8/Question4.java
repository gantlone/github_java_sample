package CH8;

public class Question4 {
    public static void main(String[] argv){
        IntArr Ar = new IntArr();
        int sum = Ar.SumArr(new int[]{1, 2, 87, 100});
        System.out.println(sum);
    } 
}

class IntArr{
    int SumArr(int[] ints){
        int Sum = 0;

        for(int e: ints){
            Sum = Sum + e;
        }

        return Sum;
    }
}