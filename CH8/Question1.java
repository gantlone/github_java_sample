package github_java_sample.CH8;

public class Question1 {
    public static void main(String[] argv) {
        IcCard myCard = new IcCard();   // 建立物件
        myCard.id = 0x336789AB;  // 設定成員變數值
        myCard.money = 300;
    
        System.out.println("扣款 900 元" +
                   (myCard.minus(900) ? "成功":"失敗") );
        myCard.showInfo();       // 呼叫方法
    
        System.out.println("加值 90 元" +
                   (myCard.minus(90) ? "成功":"失敗") );
        myCard.showInfo();       // 呼叫方法
    }
}   

class IcCard {  // 代表 IC 卡的類別
    long id;      // 卡號
    int money;    // 卡片餘額
  
    void showInfo() {  // 顯示卡片資訊的方法
      System.out.print("卡片卡號 "+ id);
      System.out.println(", 餘額 " + money + " 元 ");
    }
  
    Boolean add(int value) {  // 加值方法：參數為要加值的金額
      if (value>0 && value+money <= 10000) { // 儲值上限一萬
        money += value;
        return true;   // 加值成功
      }
      return false;    // 加值失敗
    }

    Boolean minus(int value){
        if(value>0 & money-value>=0){
            money-=value;
            return true; //扣款成功
        }
        return false; //扣款失敗
    }
}
  
  