

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question5 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
   
      //String pat = "[a-z]+@[a-z.]+"; // �O���˦�
      String pat ="[a-z]+@[a-z]+(\\.[a-z]+)+";
      String str; // �O���ϥΪ̿�J���
      boolean isID; // �ϥΪ̿�J���榡�O�_���T

      do {
        isID = false;
        System.out.println("�п�J�q�ܸ��X�G");
        System.out.println("�榡�|�ҡG(00)-25331234");
        str = br.readLine(); // Ū���ϥΪ̿�J���
        
        try{
            if(str.matches(pat)){
        
                System.out.println(
                    "��J���T");
                isID = true;
                break;
            
           }
   
           System.out.println(
                    "��J���~");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(
                    "��J���~");
        }

     } while (!isID);
    }
    
}
