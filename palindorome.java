public class palindorome{
    public static void main(String[] args){
        String input1 = "Madam I'm Adam";
        String input2 = "Sorry I'm Late";
        System.out.println(input1 + ": " + palindrome(input1));
        System.out.println(input2 + ": " + palindrome(input2));
    }
    public static boolean palindrome(String input) {
        input = input.toLowerCase();
        String temp = "";
        for(int i=0;i<input.length();i++){
            char pal = input.charAt(i);
            if(Character.isLetter(pal)) temp = temp + pal;
        }
        for(int i=0;i<temp.length();i++){
            char forward = temp.charAt(i);
            char backward = temp.charAt(temp.length()-1-i);
            if(forward != backward){
                return false;
            }
        }
        return true;
    }
}