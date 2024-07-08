package sorting;

import utils.PrintArray;

public class CountingSort {
    public static int[] countingSort(int[] ara){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = ara.length;
        for(int i=0;i<n;i++){
            if(min>ara[i]){
                min = ara[i];
            }
            if(max<ara[i]){
                max = ara[i];
            }
        }
        int range = max - min + 1;
        int[] rangeArray = new int[range];
        int[] result = new int[n];

        for(int num: ara){
            rangeArray[num]++;
        }

        for(int j=1;j<range;j++){
            rangeArray[j]+=rangeArray[j-1];
        }

        for(int j=n-1;j>=0;j--){
            result[rangeArray[ara[j]]-1] = ara[j];
            rangeArray[ara[j]]--;
        }

        return result;
    }
    public static void main(String[] args) {
        int ara[] = {2,3,6,1,4,5,1,3,4,2,2,3,5,5,5,6,2,5,2,3,6,2,1,4,6,4,5,2,1,4,6,0,0,3,5,2,3,5,0,4,3,4,1,2,4,3};
        ara = countingSort(ara);
        PrintArray.printArray(ara);
    }
}
