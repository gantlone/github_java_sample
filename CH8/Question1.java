package github_java_sample.CH8;

public class Question1 {
    public static void main(String[] argv) {
        IcCard myCard = new IcCard();   // �إߪ���
        myCard.id = 0x336789AB;  // �]�w�����ܼƭ�
        myCard.money = 300;
    
        System.out.println("���� 900 ��" +
                   (myCard.minus(900) ? "���\":"����") );
        myCard.showInfo();       // �I�s��k
    
        System.out.println("�[�� 90 ��" +
                   (myCard.minus(90) ? "���\":"����") );
        myCard.showInfo();       // �I�s��k
    }
}   

class IcCard {  // �N�� IC �d�����O
    long id;      // �d��
    int money;    // �d���l�B
  
    void showInfo() {  // ��ܥd����T����k
      System.out.print("�d���d�� "+ id);
      System.out.println(", �l�B " + money + " �� ");
    }
  
    Boolean add(int value) {  // �[�Ȥ�k�G�ѼƬ��n�[�Ȫ����B
      if (value>0 && value+money <= 10000) { // �x�ȤW���@�U
        money += value;
        return true;   // �[�Ȧ��\
      }
      return false;    // �[�ȥ���
    }

    Boolean minus(int value){
        if(value>0 & money-value>=0){
            money-=value;
            return true; //���ڦ��\
        }
        return false; //���ڥ���
    }
}
  
  