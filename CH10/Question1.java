package 習題練習.CH10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br =
          new BufferedReader(new InputStreamReader(System.in));
     
        String str; // 記錄使用者輸入資料
        boolean isID; // 使用者輸入的格式是否正確
        do {
           isID = true;
           System.out.print("請輸入身份證字號：");
           str = br.readLine(); // 讀取使用者輸入資料
           
           String str2 = str.toUpperCase();
           if(str2.charAt(0) < 'A' | str2.length()-1 != 9){
           
                System.out.println(
                    "身份證字號應該是1個英文字母接著9個數字！");
                isID = false;
            
           }

        } while (!isID);
      }
}
