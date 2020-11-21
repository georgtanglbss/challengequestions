public class ToBinary {

    public static void main (String[] args) {
        System.out.println("5: " + toBinary(5));
        System.out.println("343: " + toBinary(343));
        System.out.println("72: " + toBinary(72));
    }
    public static String toBinary(int n) {
        String str="";
        
        for(;n > 0;n=n/2){
            int remainder = n%2;
            str = remainder+str ; 
        }
        return str;
    }
}