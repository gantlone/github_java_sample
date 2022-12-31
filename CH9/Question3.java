package 習題練習.CH9;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] argv){
        ox OX = new ox();
        int i = 0, num = 1;
        String mark = "o";
        Scanner sc = new Scanner(System.in);
        while(i < 9){
            System.out.println("player"+ num +"輸入(x位置): ");
            int input1 = sc.nextInt();
            System.out.println("player"+ num +"輸入(y位置): ");
            int input2 = sc.nextInt();
            OX.judgeSpace(input1, input2, mark, num);
            OX.printResult();
            if(OX.judgeFinal()==true){
                break;
            }

            if(num == 1){
                num = 2;
                mark = "x";
            }
            else{
                num = 1;
                mark = "o";
            }
            i++;
        }
        System.out.println("遊戲結束!!!");
        sc.close();
    }
        
            
    }


class ox{
    String[][] ooxx = new String[3][3];

    void printResult(){
        for(int o=0;o<3;o++){
            for(int i=0;i<3;i++){
            String aa = ooxx[o][i];
            if(aa == null){
                System.out.print("口" + "\t");
            }
            else if(aa == "o"){
                System.out.print("o" + "\t");
            }
            else{
                System.out.print("x" + "\t");
            }
            }
            System.out.println();
        }
    }

    void judgeSpace(int input1, int input2, String mark, int num){
        if(ooxx[input1][input2] == null){
            ooxx[input1][input2] = mark;
        } 
        else{
            System.out.println("腦攤輸入到別人的格子了，破腦");
            Scanner sc = new Scanner(System.in);
            System.out.println("play"+ num +"輸入(x位置): ");
            input1 = sc.nextInt();
            System.out.println("play"+ num +"輸入(y位置): ");
            input2 = sc.nextInt();
            judgeSpace(input1, input2, mark, num);
        }
        
    }

    boolean judgeFinal(){
        int y = 1;
        for(int x=0;x<3;x++){
            if(ooxx[x][0]=="o" & ooxx[x][1]=="o" & ooxx[x][2]=="o"){
                System.out.println("player1 win");
                return true;
            }
            else if(ooxx[x][0]=="x" & ooxx[x][1]=="x" & ooxx[x][2]=="x"){
                System.out.println("player2 win");
                return true;
            }
        }
        for(int x=0;x<3;x++){
            if(ooxx[0][x]=="o" & ooxx[1][x]=="o" & ooxx[2][x]=="o"){
                System.out.println("player1 win");
                return true;
            }
            else if(ooxx[0][x]=="x" & ooxx[1][x]=="x" & ooxx[2][x]=="x"){
                System.out.println("player2 win");
                return true;
            }
        }
        if((ooxx[0][0]=="o" & ooxx[1][1]=="o" & ooxx[2][2]=="o") | (ooxx[0][2]=="o" & ooxx[1][1]=="o" & ooxx[2][0]=="o")){
            System.out.println("player1 win");
            return true;
        }
        else if((ooxx[0][0]=="x" & ooxx[1][1]=="x" & ooxx[2][2]=="x") | (ooxx[0][2]=="x" & ooxx[1][1]=="x" & ooxx[2][0]=="x")){
            System.out.println("player2 win");
            return true;
        }
        return false;
    }
}