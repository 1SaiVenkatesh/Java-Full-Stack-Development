package com.simplilearn.rangequeries;

public class Main {

    public static void main(String args[]) 
    { 
        int arr[] = { 3, 7, 2, 5, 8, 9 }; 
        int n = arr.length;

        RangeQuery.buildSparseTable(arr, n); 
        System.out.println(RangeQuery.query(0, 5)); 
        System.out.println(RangeQuery.query(3, 5)); 
        System.out.println(RangeQuery.query(2, 4)); 
    } 

}