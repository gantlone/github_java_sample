public class Question5 {
    public static void main(String argv[]){
        int intSpeed = 100;
        double intSec = 0;
        double dubSpeed = 30 * 2.54;
        intSec = (double)(20000/(intSpeed + dubSpeed));
        System.out.print(intSec);
    }
}
