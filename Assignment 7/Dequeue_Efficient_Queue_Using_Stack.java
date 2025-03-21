import java.util.Scanner;
import java.util.Stack;

public class Dequeue_Efficient_Queue_Using_Stack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        dequeueEfficientClass dequeueclass = new dequeueEfficientClass();
        for(int i=0;i<number;i++){
            dequeueclass.Enqueue(i);
        }
        while(!dequeueEfficientClass.isEmpty()){
            System.out.print(dequeueclass.dequeue() + " ");
        }
    }
    static class dequeueEfficientClass{
        private static Stack<Integer> queueStack= new Stack<>();
        public static void Enqueue(int element){
            Stack<Integer> helper= new Stack<>();
            while(!queueStack.isEmpty()){
                helper.push(queueStack.pop());
            }
            queueStack.push(element);
            while(!helper.isEmpty()){
                queueStack.push(helper.pop());
            }
        }
        public static int dequeue(){
            return queueStack.pop();
        }
        public static boolean isEmpty(){
            return queueStack.isEmpty();
        }
    }
}