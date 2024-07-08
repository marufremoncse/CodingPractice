package sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
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
        selectionSort(arr);
    }
}
