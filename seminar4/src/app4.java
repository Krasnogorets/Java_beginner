import java.util.Stack;

public class app4 {
    static int getSize(Stack<Integer> stack){
        int countStack=0;
        for (int i : stack) {
            countStack++;
            
        }
        
        return countStack;

    }
    public static Stack<Integer> getPush(Stack<Integer> stack,int [] arr ){
        for (int index : arr) {
                stack.add(index);
            }
        return stack;

    }
    static boolean isEmpty(Stack<Integer> stack){
        int count = 0;
        for (int index = 0; index < getSize(stack); index++) {
            if (stack.get(index).equals(null)){
                count++;

            };
        }
            
        if (count == getSize(stack)){
            return true;
        }
        return false;

    }
    static int getPeek(Stack<Integer> stack, int index){
        int result = stack.get(index);
        return result;
    }
    static int getPop(Stack<Integer> stack){
        int result = stack.get(getSize(stack)-1);
        stack.remove(getSize(stack)-1);
        return result;
    }
    public static void main(String[] args) {
        //         Реализовать стэк с помощью массива.
        // Нужно реализовать методы:
        // size(), empty(), push(), peek(), pop().
        int [] arr  = new int []{1,45,3,78,23,78,9,0,2,4};
        Stack<Integer> myStack = new Stack<Integer>();
        getPush(myStack,arr);
        System.out.println(myStack);
        System.out.println(getSize(myStack));
        System.out.println(isEmpty(myStack));
        System.out.println(getPeek(myStack,5));
        System.out.println(getPop(myStack));
        System.out.println(myStack);
    }
}
