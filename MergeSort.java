class MergeSort{
	public static void main(String[] args) throws Exception{
		int[] arr = {6,2,5,3,1,4,7,8,9,10,11,4,6,7,4,5,6};
		MergeSort sortObj = new MergeSort();
		arr = sortObj.divide(arr);
		for(int i=0;i< arr.length;i++){
			System.out.println("arr[" + i + "] = " + arr[i]  );
			}
		}
	
	int[]  divide(int[] arr) throws Exception{
		int n = arr.length;
		if(n<2){
			return arr; 
			}
		int m = n/2;
		//System.out.println("m : " + m);
		int[] left = new int[m];
		int[] right = new int[n-m];
		//System.out.println("Left array: ");
		for(int i=0; i<m;i++){
			left[i] = arr[i];
			//System.out.println("Left[" + i + "] = " + left[i]  );
			}
			//System.out.println("Right array: ");
		for(int i=0; i<(n-m);i++){
			right[i] = arr[i+m];
			//System.out.println("Right[" + i + "] = " + right[i]  );
			}	
		//System.out.println("Divide Left");
		divide(left);
		
		/*for(int i=0;i< left.length;i++){
			//System.out.println("arr1[" + i + "] = " + left[i]  );
			}*/
		 //System.out.println("Divide Right");
		divide(right);
		
		//System.out.println("arr[2]: ");
		/*for(int i=0;i< right.length;i++){
			System.out.println("arr2[" + i + "] = " + right[i]  );
			}*/
		merge(left,right,arr);
		
		/*for(int i=0;i< arr.length;i++){
			System.out.println("arrAfterMerge[" + i + "] = " + arr[i]  );
			}*/
		
		/*try{
			Thread.sleep(2000);
			}catch(Exception ex){
				System.out.println(ex.toString());
				}*/
		return arr;
		}
		
	void merge(int[] left,int[] right,int[] arr){
		int nL = 0;
		int nR = 0;
		int n = 0;
		while(nL < (left.length) && nR < (right.length)){
			if(left[nL] < right[nR]){
				arr[n] = left[nL];
				n++;
				nL++;
				//System.out.println("MergeFor[" + n + "] = " + arr[n]  );
				}
			else{
				arr[n] = right[nR];
				n++;
				nR++;
				}
			}
		while(nL < (left.length)){
			arr[n] = left[nL];
			n++;
			nL++;
			}
		while(nR < (right.length)){
			arr[n] = right[nR];
			n++;
			nR++;
			}
			/*for(int i=0;i< arr.length;i++){
			System.out.println("ReturnFromMerge[" + i + "] = " + arr[i]  );
			}*/
			//return arr;
		}	

	}