package CH8;
import java.io.*;

public class Question2 {
    public static void main(String[] argv) throws IOException{
        long startTime = System.currentTimeMillis(); //獲取開始時間
        Mathematics m = new Mathematics();
    
        BufferedReader br =
          new BufferedReader(new InputStreamReader(System.in));
    
        System.out.print("請輸入 n：");
        int n = Integer.parseInt(br.readLine());
    
        System.out.println("Fibonacci 數列第 " + n + " 項：" +
          m.fibonacci(n));

        long endTime = System.currentTimeMillis(); //獲取結束時間
        System.out.println("程式執行時間：" + (endTime - startTime) + "ms"); //輸出程式執行時間
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
