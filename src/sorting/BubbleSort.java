package sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print("-->" + arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {34,16,57,86,99,56,21,61,3,69};
        bubbleSort(arr);
    }
}
