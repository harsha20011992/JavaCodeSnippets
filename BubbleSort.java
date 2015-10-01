class BubbleSort{
public static void main(String[] args){

int[] arr = {6,2,5,3,1,4};

for(int i=0;i<arr.length;i++){
System.out.println("arr[" + i + "]: " + arr[i]);
}

for (int j=0; j < arr.length-1; j++)
{
for(int i=0;i<(arr.length-(j+1));i++){

if(arr[i+1] < arr[i])
{
	int temp = arr[i];
	arr[i] = arr[i+1];
	arr[i+1] = temp;
}
}
}
System.out.println("After Sort");

for(int i=0;i<arr.length;i++){
System.out.println("arr[" + i + "]: " + arr[i]);
}

}
}