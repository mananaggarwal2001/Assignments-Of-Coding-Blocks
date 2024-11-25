import java.util.*;
public class String_IsPallindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        boolean pallindrome= isPallindrome(s);
        System.out.println(pallindrome);
    }
    public static boolean isPallindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
