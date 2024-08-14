class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low<high){
            int partition_index=partition(arr,low,high);
            quickSort(arr,low,partition_index-1);
            quickSort(arr,partition_index+1,high);
        }
        // code here
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int i=low,j=high;
        int pivot=arr[low];
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        if(i>=j){
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
        }
        return j;
    } 
}
