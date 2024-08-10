class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        int odd[]=new int[2];
        int XOR=0;
        for(int i=0;i<N;i++){
            XOR=XOR ^ Arr[i];
        }
        int sb=XOR & ~(XOR-1);
        int res1=0,res2=0;
        for(int i=0;i<N;i++){
            if((Arr[i] & sb)!=0){
                res1=res1 ^ Arr[i];
            }
            else{
                res2=res2 ^ Arr[i];
            }
        }
        if(res1>res2){
            odd[0]=res1;
            odd[1]=res2;
        }
        else{
            odd[0]=res2;
            odd[1]=res1;
        }
        return odd;
    }
}
