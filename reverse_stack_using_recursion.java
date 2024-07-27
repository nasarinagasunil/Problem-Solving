class Solution{ 
    static void reverse(Stack<Integer> s){
        // add your code here
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        insertBottom(s,top);
        
        
    }
    static void insertBottom(Stack<Integer> stack,int element){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        else{
            int top=stack.pop();
            insertBottom(stack,element);
            stack.push(top);
        }
    }
}
