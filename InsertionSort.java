class InsertionSort{
	public static void main(String[] args){
		int[] arr = {6,2,5,3,1,4};

		for(int i=0;i<arr.length;i++){
			System.out.println("arr[" + i + "]: " + arr[i]);
			}

		for(int i=1;i<arr.length-1;i++){

			for(int j=i;j>0;j--){
				//System.out.println("*****************");
				//System.out.println("arr[i=" + i + "]: "  + arr[i]);
				//System.out.println("arr[" + j + "]: " + arr[j]);
				//System.out.println("arr[" + (j-1) + "]: " + arr[j-1]);	
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;

					}
				}
			}
			
		System.out.println("After Sort");
		
		for(int i=0;i<arr.length;i++){
			System.out.println("arr[" + i + "]: " + arr[i]);
			}
		}
	}