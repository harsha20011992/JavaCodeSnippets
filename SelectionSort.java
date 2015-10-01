class SelectionSort{
	public static void main(String[] args){
		int[] arr = {6,2,5,3,1,4,7,8,9,10,11,4,6,7,4,5,6};
		int j=arr.length-1;
		while(j>0){
		int temp = 0;
		for(int i=0;i<=j;i++){
			if(arr[i] >= arr[temp]){
				temp = i;
				}
			}
			int swapTemp = arr[j];
			arr[j] = arr[temp];
			arr[temp] = swapTemp;
		j--;
		}
		
		for(int i =0; i<arr.length;i++){
			System.out.println("arr[" + i + "]: " + arr[i]);
			}
			
		}
	}