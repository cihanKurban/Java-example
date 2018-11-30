
public class IlkProgram {
	
public static void main(String[] args) {
int arr[] = {5,4,4,2,4,12,68,49,21,48,9,48,12,31,14,65,87,98,7,6,5,4,3,2,1}; // This is my array
		    int min = 0;

		    for(int i = 0;i<arr.length;i++)
		    {
		        //Assume first element is min
		        min = i;
		        for(int j = i + 1;j<arr.length;j++)
		        {
		            if(arr[j] < arr[min]) { min = j;}
		        }
		        int temp = arr[i];
		        arr[i] = arr[min];//arr[i]=4
		        arr[min] = temp;
		        System.out.println(arr[i]);//I print the in ascending order 
		    }
	       
		
	}
