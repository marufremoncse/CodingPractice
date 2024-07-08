package sorting;

public class InsertionSort {
    public static void insertionSort(int[] ara){
        int n = ara.length;
        int i=1;
        while(i<n){
            int key = ara[i];
            for(int j=i-1;j>=0;j--){
                if(ara[j]>key){
                    int temp = ara[j];
                    ara[j] = ara[j+1];
                    ara[j+1] = temp;
                } else{
                    ara[j+1] = key;
                    break;
                }
            }
            i++;
        }

    }
    public static void main(String[] args) {
        int[] arr = {34,16,57,86,99,56,21,61,3,69};
        insertionSort(arr);
        PrintArray.printArray(arr);
    }
}
