package CH7;

public class Question8 {
    public static void main(String[] argv){
        int i,j,tmp;
        int[] argv2 = new int[argv.length];
        for(i=0; i<argv.length; i++){
            argv2[i] = Integer.parseInt(argv[i]);
        }
        for(i=0; i<argv.length-1; i++){
            for(j=0; j<argv.length-1-i; j++){
                if(argv2[j]>argv2[j+1]){
                    tmp = argv2[j];
                    argv2[j] = argv2[j+1];
                    argv2[j+1] = tmp;
                }
            }
        }
        for(i=0; i<argv.length; i++){
            System.out.print(argv2[i] + "\t");
        }
        
    }
}
