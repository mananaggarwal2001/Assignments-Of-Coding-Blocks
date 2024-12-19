import java.util.Scanner;
public class Board_Path {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int ladder=sc.nextInt();
        int faces=sc.nextInt();
        printfaces(ladder, faces,0,"");
        System.out.println();
        int count=countpossible(ladder, faces, 0);
        System.out.println(count);
    }
    public static void printfaces(int ladder, int faces, int track, String ans){
        if(ladder==track){
            System.out.print(ans+" ");
            return;
        }
        if(ladder<track){
            return;
        }
        for(int i=1;i<=faces;i++){
            printfaces(ladder, faces, track+i,ans+i);
        }
    }
    public static int countpossible(int ladder, int faces, int ans){
        if(ladder==ans){
            return 1;
        }
        if(ladder<ans){
            return 0;
        }
        int count=0;
        for(int i=1;i<=faces;i++){
            count+=countpossible(ladder, faces, ans+i);
        }
        return count;
    }
}
