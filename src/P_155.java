import java.util.Stack;

public class P_155 {


    /** initialize your data structure here. */
    class StackNode {
        
    int curMin;
    int val;

        public StackNode(int curMin, int val){
                    
        this.curMin = curMin;
        this.val = val;
        }
    }
    
    Stack<StackNode> stack = new Stack<StackNode>();
	static int min = 0;

    public void push(int x) {

        int val = x;
        min = Math.min(min, val);
        stack.push(new StackNode(min, val));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        System.out.println(stack.peek().val);
        return stack.peek().val;
    }
    
    public int getMin() {
        System.out.println("this is curMin: " + stack.peek().curMin);
        return stack.peek().curMin;
        
    }
    
  public static void main(String args[]) {
  //Your MinStack object will be instantiated and called as such:
    /*P_155 obj = new P_155();
    obj.push(5);
    obj.push(3);
    obj.push(-2);
    obj.pop();
    int param_3 = obj.top();
    System.out.println(param_3);
    int param_4 = obj.getMin();
    System.out.println(param_4);*/
	  
  P_155 minStack = new P_155();
  minStack.push(Integer.valueOf(null));
  minStack.push(-1);
  minStack.push(Integer.valueOf(null));
  minStack.push(Integer.valueOf(null));

  minStack.getMin();   //--> Returns -3.
  minStack.pop();
  minStack.top();      //--> Returns 0.
  minStack.getMin();   //--> Returns -2.
    
    
    
  }
}


