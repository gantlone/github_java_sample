public class Question2 {
    public static void main(String argv[]){
        int x = 10, y = 5, z = 1; //幣值
        int a = 0, b = 0, c = 0; //個數
        a = 137/x;
        b = (137 - a * x)/y;
        c = 137 - a * x - b * y;
        System.out.print("最少需要的幣數為 10元: " + a + "枚\n");
        System.out.print("最少需要的幣數為 5元: " + b + "枚\n");
        System.out.print("最少需要的幣數為 1元: " + c + "枚\n");

    }
}
