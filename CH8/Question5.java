package CH8;

public class Question5 {
    public static void main(String[] argv){
        int[] IntArr = {1, 2, 3};
        double[] doubleArr = {1.2, 2.3, 3.4};
        math mh = new math();
        System.out.println("整數陣列平均值: " + mh.IntAvg(IntArr));
        System.out.println("浮點數陣列平均值: " + mh.IntAvg(doubleArr));
    }
}

class math{
    int IntAvg(int[] ints){
        int sum = 0, avg = 0;

        for(int e: ints){
            sum = sum + e;
        }
        avg = sum/(ints.length);
        return avg;
    }

    double IntAvg(double[] doubles){
        double sum = 0, avg = 0;

        for(double e: doubles){
            sum = sum + e;
        }
        avg = sum/(doubles.length);
        return avg;
    }
}