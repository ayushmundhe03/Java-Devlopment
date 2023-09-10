public class Linearsearch {

   public static int search(int key,int[] arr){

    int left = 0;
    int right = (arr.length) - 1;
    while(left<=right){

        int mid = left+right/2;
        if (arr[mid]==key) {
            return mid;  
        }
        else if(arr[mid]>key){
            right =mid -1;
        }
        else{
            left = mid+1;
        }
    }
    return -1;


   }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 3;

        System.out.print(key+"__ for this key value its index position is  "+ search(left,right,mid,arr));


    }
}