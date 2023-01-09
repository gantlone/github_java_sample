import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
   
      String str; // 記錄使用者輸入資料
      boolean isID; // 使用者輸入的格式是否正確

      do {
        isID = false;
        System.out.println("請輸入信箱：");
        System.out.println("格式只能小寫英文 舉例: qwer@gmail.com");
        str = br.readLine(); // 讀取使用者輸入資料

        try{
            if(check(str) == true){
                    isID = true;}

            if(isID == true && (str.indexOf("@") < str.indexOf("."))){
        
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

    public static boolean check(String str){
        if(str.length() == 0){
            return true;
        }
        str = str.replace("@", "");
        str = str.replace(".", "");
        if(str.charAt(0) < 'a' || str.charAt(0) > 'z'){
            return false;
        }
        return check(str.substring(1, str.length()));
    }
}
