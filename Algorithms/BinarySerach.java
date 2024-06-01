package Algorithms;
public class BinarySerach{

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        int mid = start + (end - start)/2 ;
        
        
            for (int i=0; start <= end; i++){
                    if( target == arr[mid]){
                        return mid;
                    }
                    else if (target > arr[mid]){
                        start = mid + 1;
                        mid = start + (end - start)/2 ;
                    }
                    else{
                        end = mid - 1;
                        mid = start + (end - start)/2 ;
                    }
            }
                
            return -1;
        
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,11,13,15,27,39,41,45,47};
        int target = 27;
        if (BinarySerach.binarySearch(arr, target) != -1)
         System.out.println(target + " is located at index:" + BinarySerach.binarySearch(arr, target));
        else 
         System.out.println("target not found!");
        
    }
    
}