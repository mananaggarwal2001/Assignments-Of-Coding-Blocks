import java.util.Scanner;
import java.util.Stack;

public class Stock_Span {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int inputvalue= sc.nextInt();
        int[] numberArray= new int[inputvalue];
        for(int i=0;i<numberArray.length;i++){
            numberArray[i]=sc.nextInt();
        }
        int[] ans= findStockSpan(numberArray);
        for(int value:ans){
            System.out.print(value + " ");
        }
        System.out.println("END");
    }
    public static int[] findStockSpan(int[] numberArray){
        Stack<Integer> st= new Stack<>();
        int[] ans= new int[numberArray.length];
        for(int i=0;i<numberArray.length;i++){
            while(!st.isEmpty() && numberArray[i]>numberArray[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]= i+1;
            }else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}
