import java.util.*;
public class Replace_Sum_Greater_Node {
    private static int index=0;
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] numberArray= new int[n];
        for(int i=0;i<numberArray.length;i++){
            numberArray[i]=sc.nextInt();
        }
        giveAns(numberArray);
    }
    public static void giveAns(int[] numberArray){
        int[] result= new int[numberArray.length];
        result[result.length-1]= numberArray[numberArray.length-1];
        for(int i=numberArray.length-2;i>=0;i--){
            result[i]= result[i+1]+numberArray[i];
        }
        int[] ans= new int[result.length];
        findResult(result,0, result.length-1, ans);
        for(int value:ans){
            System.out.print(value + " ");
        }

    }
    public static void findResult(int[] resultArray, int start, int end, int[] ans){
        if(start>end){
            return;
        }
        int mid=start+(end-start)/2;
        ans[index]=resultArray[mid];
        index++;
        findResult(resultArray, start, mid-1, ans);
        findResult(resultArray, mid+1, end, ans);
    }
}