package Algorithms;
public class FindMin {
    public static void main(String[] args) {
        int arr[] = {1,4,45,60,-29,5,100,2};
        int len = arr.length;
        Main.findMin(arr,len);
        }
}

class Main{
static void findMin(int[] arr, int len){
    int min = arr[0];
    int max = arr[0];
    if (len ==1){
        System.out.println(arr[0]);
    }

    for( int i=0; i<len-1; i++){
        if(arr[i]<arr[i+1] && arr[i]<min ){
        min = arr[i];
        }
        if(arr[i]>arr[i+1] && arr[i]>max){
            max = arr[i];
        }
    }
    System.out.println("min:" + min);
    System.out.println("max:" + max);

}
}
