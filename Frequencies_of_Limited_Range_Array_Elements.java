class Frequencies_of_Limited_Range_Array_Elements{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer,Integer> frequency=new HashMap<>();
        for(int num:arr){
            if(frequency.containsKey(num)){
                frequency.put(num,frequency.get(num)+1);
            }
            else{
                frequency.put(num,1);
            }
            
        }
        int k=1;
        for(int i=0;i<N;i++){
            if(frequency.containsKey(k)){
                arr[i]=frequency.get(k);
            }
            else{
                arr[i]=0;
            }
            k++;
        }
        
    }
}
