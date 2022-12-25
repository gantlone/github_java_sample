package CH8;
import java.io.*;

public class Question2 {
    public static void main(String[] argv) throws IOException{
        long startTime = System.currentTimeMillis(); //����}�l�ɶ�
        Mathematics m = new Mathematics();
    
        BufferedReader br =
          new BufferedReader(new InputStreamReader(System.in));
    
        System.out.print("�п�J n�G");
        int n = Integer.parseInt(br.readLine());
    
        System.out.println("Fibonacci �ƦC�� " + n + " ���G" +
          m.fibonacci(n));

        long endTime = System.currentTimeMillis(); //��������ɶ�
        System.out.println("�{������ɶ��G" + (endTime - startTime) + "ms"); //��X�{������ɶ�
      }
}

class Mathematics {
    long[] Fisave = new long[61];

    long fibonacci(int n) {
      if(n <= 2) {
        return 1;
      }
      if(n<61){
        if(Fisave[n]==0){
            Fisave[n] = fibonacci(n - 1) + fibonacci(n - 2);
          }
        return Fisave[n];
      }
    
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
