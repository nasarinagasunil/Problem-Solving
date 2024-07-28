class sorting_stack_using_recursion {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        
        if(s == null || s.isEmpty()){
            return s;
        }
        int top=s.pop();
        sort(s);
        sortedInsert(s,top);
        
        return s;
        
    }
    public void sortedInsert(Stack<Integer> stack,int element){
        if(stack.isEmpty() || stack.peek()<=element){
            stack.push(element);
            return;
        }
        int top=stack.pop();
        sortedInsert(stack,element);
        stack.push(top);
        
    }
}
