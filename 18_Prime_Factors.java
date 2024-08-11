class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                list.add(i);
                while(N%i==0){
                    N=N/i;
                }
            }
        }
        if(N!=1){
            list.add(N);
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
