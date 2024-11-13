public class QuickSort{
    
    private static int partition(int arr[],int start,int end){
        int pivot = arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i]=temp;
        return i;
    }
    
    public static void quickSort(int[] arr,int start,int end){
        if(end<=start) return;
        int pivot = partition(arr,start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end); 
    }
    

    public static void main(String args[]){
        int arr[] = {5,3,2,1,23,67,87,33,21,20};
        quickSort(arr,0,(arr.length-1));
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
        }
    }

}