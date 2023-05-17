package ss10_stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Bai1 {
    public boolean checkSNT(int input) {
        boolean flag = true;
        if (input < 2) {
            return false;
        } else if (input == 2) {
            return true;
        } else {
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
            return false;
        }
    }
    public  Stack<Integer> stack (int input){
        Bai1 bai1 = new Bai1();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input; i++) {
            if (bai1.checkSNT(i)==true){
                stack.push(i);
            }
        }
        return stack;
    }
    public Queue<Integer> queue (int input) {
        Bai1 bai1 = new Bai1();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < input; i++) {
            if (bai1.checkSNT(i) == true){
                queue.add(i);
            }
        }
        return queue;
    }

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        System.out.println(bai1.checkSNT(7));
        System.out.println(bai1.queue(9));
        System.out.println(bai1.stack(9));
    }
}
