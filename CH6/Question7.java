public class Question7 {
    public static void main(String argv[]){

        int intStarCount = 0, intEE = 0;
        for (intStarCount = 0; 2 * intStarCount + 1 <= 7; intStarCount++){
            String strStar = "";
            int intStarSum = 2 * intStarCount + 1;
            for (intEE = 0; intEE < intStarSum; intEE++){
                strStar = strStar + "*";
            }
            if (strStar.length() <= 7){
                int intSpace = (7 - strStar.length())/2;
                String strSpace = "";
                for (intEE = 0; intEE < intSpace; intEE++){
                    strSpace = strSpace + " ";
                }
                System.out.println(strSpace + strStar);
            }
        }
        for (intStarCount = 2; 2 * intStarCount + 1 <= 7; intStarCount--){
            if (intStarCount < 0){
                break;
            }
                
            String strStar = "";
            int intStarSum = 2 * intStarCount + 1;
            for (intEE = 0; intEE < intStarSum; intEE++){
                strStar = strStar + "*";
            }
            if (strStar.length() < 7){
                int intSpace = (7 - strStar.length())/2;
                String strSpace = "";
                for (intEE = 0; intEE < intSpace; intEE++){
                    strSpace = strSpace + " ";
                }
                System.out.println(strSpace + strStar);
            }
        }
    }
}
