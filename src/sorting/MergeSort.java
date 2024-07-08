package sorting;

public class MergeSort {
    public static void partitioning(int[] arr, int l, int h){
        if(l<h){
            int m = (l + h)/2;
            partitioning(arr, l, m);
            partitioning(arr, m+1, h);
            mergeSort(arr, l, m, h);
        }
    }

    public static void mergeSort(int[] arr, int l, int m, int h){
        int i = l;
        int j = m + 1;
        int[] res = new int[h-l+1];
        int k = 0;
        while(i<=m && j<=h){
            if(arr[i]>arr[j]){
                res[k++] = arr[j++];
            } else if(arr[i]<=arr[j]){
                res[k++] = arr[i++];
            }
        }

        while(i<=m){
            res[k++] = arr[i++];
        }

        while(j<=h){
            res[k++] = arr[j++];
        }

        for(i=0;i<k;i++){
            arr[l++] = res[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {34,16,57,86,99,56,21,61,3,69};
        partitioning(arr, 0, arr.length-1);

        for(int i=0;i<arr.length-1;i++){
            System.out.print("-->" + arr[i]);
        }
    }
}
