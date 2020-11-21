import java.util.Scanner;
public class PigLatin
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("pls enter a word");
        String input = myObj.nextLine();
        myObj.close();
        String[] arr = input.split(" "); 
        String ret = "";
        for (int i=0;i<arr.length;i++){
            if(arr[i].length()>2){
                ret += arr[i].substring(1)+arr[i].substring(0,1)+"ay";
            }
            else{
                ret += arr[i];
            }
            if(i!=arr.length-1){
                ret += " ";
            }
        }
        System.out.println(ret);
    }
}