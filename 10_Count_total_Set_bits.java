class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
        if(n==0){
            return 0;
        }
        // Your code here
        int x=maxPowOf2(n);
        int y=x*(1<<(x-1));
        int z=n-(1<<x);
        return y+z+1+countSetBits(z);
    }
    private static int maxPowOf2(int n){
        int x=0;
        while((1<<x)<=n){
            x++;
        }
        return x-1;
    }
      
}
