import java.util.Scanner;

public class Replace_All_Pie {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            String inputString= sc.next();
            System.out.println(inputString.replaceAll("pi","3.14"));
            test--;
        }
    }
}
