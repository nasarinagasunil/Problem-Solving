class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        int result=n&(1<<(k));
        if(result!=0){
            return true;
        }
        else{
            return false;
        }
    }
}
