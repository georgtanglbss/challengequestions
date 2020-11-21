public class ppap{
    public static void main(String[] args){
        String input = "I have a pointer, I have a null";
        ppap("I have a mario, I have a super");
        ppap("I have a byng, I have a lord");
        
    }
    public static void ppap(String input) {
        int start1 = input.indexOf("a ")+2;
        int end1 = input.indexOf(",");
        String obj1 = input.substring(start1,end1);
        int start2 = input.lastIndexOf("a ")+2;
        int end2 = input.length();
        String obj2 = input.substring(start2,end2);
        obj2 = obj2.substring(0,1).toUpperCase()+obj2.substring(1);
        
        System.out.println("Uh! "+obj2+" "+obj1);
    }
}
        