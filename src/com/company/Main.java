package com.company;

import java.util.Scanner;

public class Main {

    public static void spiral() {
        int[][] arr = new int[7][7];
        int top = 0;//colum = 0(i)
        int right = arr.length - 1;//row(j)
        int bottom = arr.length - 1;//colum(i)
        int left = 0;//row = 0 (j)
        int i = 0;

        //step 1
        for (i = left; i <= right; i++) {
            arr[left][i] = 1;
        }
        //step 2
        for (i = top; i <= bottom; i++) {
            arr[i][bottom] = 1;
        }
        //step 3
        for (i = right; i >= left; i--) {
            arr[right][i] = 1;
        }
        //step 4
        for (i = bottom; i >= top+2; i--) {
            arr[i][bottom] = 1;
        }
        //step = 5
        for (i = left+2; i <= right-2; i++) {
            arr[left+2][i] = 1;
        }
        //step = 6
        for (i = top+2; i <= bottom-2; i++) {
            arr[i][bottom-2] = 1;
        }
        //step = 7
        for (i = left+4; i <= right-4; i++) {
            arr[left+4][i] = 1;
        }

        for (int k = 0;k<arr.length;k++){
            for (int z = 0; z< arr.length;z++){
                if(z == arr.length-1){
                    System.out.print("\n");
                }
                System.out.print(arr[k][z]+" ");
            }
        }

    }

    /**
     * add two matrix
     */
    public static void addTwoMatrix() {
        int[][] arr1 = {{0, 1, 2},
                {1, 53, 3},
                {2, 3, 4}};
        int[][] arr2 = {{1, 2, 2},
                {1, 5, 3},
                {2, 34, 4}};
        int[][] arr3 = new int[arr1.length][arr1[0].length * 2];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                if (j < arr1[0].length) {
                    arr3[i][j] = arr1[i][j];
                }
                if (j >= arr1[0].length) {
                    arr3[i][j] = arr2[i][j - arr2.length];
                }
                if (j == arr3[0].length - 1) {
                    System.out.print(arr3[i][j] + "\n");
                } else {
                    System.out.print(arr3[i][j] + " ");
                }

            }
        }

    }

    /**
     * Athletes 3
     */
    public static void athletes3() {
        int[][] arr = {{0, 1, 2},
                {1, 53, 3},
                {2, 3, 4},
                {3, 53, 8},
                {4, 10, 2}};
        int sum = 0;
        int max = 0;
        int p = 0;
        int k = 0;
        int athletes = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            max = 0;
            for (int j = 1; j < arr[0].length; j++) {
                sum += arr[i][j];
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }

            if (k < max) {
                k = max;
                p = sum;
                athletes = arr[i][0];
            } else if (k == max) {
                if (p < sum) {
                    athletes = arr[i][0];
                } else if (p > sum) {
                    break;
                }
            }
        }
        System.out.print("athletes number: " + athletes);
    }


    /**
     * Athletes 2
     */
    public static void athletes2() {
        int[][] arr = {{0, 1, 2},
                {1, 53, 3},
                {2, 3, 4},
                {3, 3, 8},
                {4, 10, 2}};
        int max = 0;
        int k = 0;
        int athletes = 0;
        for (int i = 0; i < arr.length; i++) {
            max = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            if (k < max) {
                k = max;
                athletes = arr[i][0];
            }
        }
        System.out.print("athletes number: " + athletes + " sum: " + k);
    }

    /**
     * Athletes
     */
    public static void athletes() {
        int[][] arr = {{0, 1, 2},
                {1, 53, 3},
                {2, 3, 4},
                {3, 3, 8},
                {4, 10, 2}};
        int sum = 0;
        int k = 0;
        int athletes = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 1; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if (k < sum) {
                k = sum;
                athletes = arr[i][0];
            }
        }
        System.out.print("athletes number: " + athletes + " sum: " + k);
    }

    /**
     * symmetrical
     */
    public static void symmetrical() {
        int[][] arr = {{0, 1, 2},
                {1, 5, 3},
                {2, 3, 4}};
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    k = 0;
                    break;
                }
            }

        }
        if (k == 1) {
            System.out.print("Yes");
        } else {
            System.out.println("no");
        }


    }

    /**
     * diagonal Task 2
     *
     * @param n
     */
    public static void diagonalTask2(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == n - 1) {
                    arr[i][j] = 1;
                }
                if (arr[i][j] == 1 && j != n - 1 || arr[i][j] == 2 && j != n - 1) {
                    arr[i][j + 1] = 2;
                }
                System.out.print(arr[i][j]);
                if (j == n - 1) {
                    System.out.print("\n");
                }

            }

        }
    }

    /**
     * @param n
     */
    public static void diagonalTask1(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = i;
                if (i + j == n - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j]);
                if (j == n - 1) {
                    System.out.print("\n");
                }

            }

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        diagonalTask1(n);

//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        diagonalTask2(n);

//        symmetrical();

//        athletes();

//        athletes2();

//        athletes3();

//        addTwoMatrix();

        spiral();
    }

}
