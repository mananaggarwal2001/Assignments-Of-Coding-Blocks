import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        int count=0;
        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
