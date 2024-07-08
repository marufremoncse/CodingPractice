package sorting;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(int[] ara){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int num:ara){
            if(min>num){
                min = num;
            }
            if(max<num){
                max = num;
            }
        }

        int n = ara.length;
        int range = max - min + 1;
        int bucketSize = (int)Math.ceil(Math.sqrt(range));
        int bucketCapacity = (int)Math.ceil((double) range /bucketSize);

        List<List<Integer>> buckets = new ArrayList<>();

        for(int i=0;i<bucketSize;i++){
            List<Integer> bucket = new ArrayList<>();
            buckets.add(bucket);
        }

        for(int num: ara){
            int bi = (num-min)/bucketCapacity;
            buckets.get(bi).add(num);
        }


        for(List<Integer> ls: buckets){
            Collections.sort(ls);
        }

        int i = 0;
        for(List<Integer> ls : buckets){
            for(int num: ls){
                ara[i++] = num;
            }
        }

    }
    public static void main(String[] args) {
        int ara[] = {1,24,75,84,35,13,43,42,79,78,6,44,3,46,57,55,24,114,22,5,6,43,5};
        bucketSort(ara);
        PrintArray.printArray(ara);
    }
}
