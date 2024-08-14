class Solution{
	public static void sort(int arr[],int n){
		for(int i=0;i<n-1;i++{
			int min_index=i;
			for(int j=i;j<n;j++){
				if(arr[j]<arr[min_index]){
					min_index=j;
				}
			}
			int temp=arr[i];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
	}
}
