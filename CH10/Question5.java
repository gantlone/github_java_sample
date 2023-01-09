

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question5 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
   
      //String pat = "[a-z]+@[a-z.]+"; // 記錄樣式
      String pat ="[a-z]+@[a-z]+(\\.[a-z]+)+";
      String str; // 記錄使用者輸入資料
      boolean isID; // 使用者輸入的格式是否正確

      do {
        isID = false;
        System.out.println("請輸入電話號碼：");
        System.out.println("格式舉例：(00)-25331234");
        str = br.readLine(); // 讀取使用者輸入資料
        
        try{
            if(str.matches(pat)){
        
                System.out.println(
                    "輸入正確");
                isID = true;
                break;
            
           }
   
           System.out.println(
                    "輸入錯誤");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(
                    "輸入錯誤");
        }

     } while (!isID);
    }
    
}
