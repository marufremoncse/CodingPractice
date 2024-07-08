package sorting;

public class QuickSort {
    public static void quickSort(int[] ara, int l, int h){
        if(l<h) {
            int i = l-1;
            int pivot = h;
            for (int j = l; j < pivot; j++) {
                if (ara[j] < ara[pivot]) {
                    i++;
                    int temp = ara[i];
                    ara[i] = ara[j];
                    ara[j] = temp;
                }
            }
            int temp = ara[++i];
            ara[i] = ara[pivot];
            ara[pivot] = temp;
            quickSort(ara,l, i-1);
            quickSort(ara, i+1, h);
        }

    }
    public static void main(String[] args) {
        int ara[] = {1,24,75,84,35,13,43,42,79,78,6,44,3,46,57,55,24,114,22,5,6,43,5};
        //int ara[] = {2,5,2};
        quickSort(ara, 0, ara.length-1);
        PrintArray.printArray(ara);
    }
}
