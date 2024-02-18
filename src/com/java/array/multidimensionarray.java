package com.java.array;

import java.util.Arrays;

public class multidimensionarray {



    public static void main(String[] args){

        int[] a ={1,2,3,4};
        int[] b ={12,13,14};
        int[] c ={3,7,9,10};

        //instead of creating multiple array we can create a single mutli dimenional array
//        int d[][] ={a,b,c};
        int[][] d ={ {11,12,13,14},{12,13,14,15},{31,17,19,10} };

        System.out.println("print a Array with predefining row column count");
        for(int i =0;i<3;i++){//row count
            for(int j=0;j<4;j++){//column count
                System.out.print(" "+d[i][j]);
            }
            System.out.println();
        }

//----------------------------------------------
        //Jagged Array
        System.out.println("print a Jagged Array");
        int[][] e ={ {11},{12,13,14},{31,17,19,10} };

        for(int i =0;i<e.length;i++){//row count
            for(int j=0;j<e[i].length;j++){//column count
                System.out.print(" "+e[i][j]);
            }
            System.out.println();
        }
//----------------------------------------------
        System.out.println("print Using Enhanced forloop ");
        //Enhanced forloop
        for(int[] k: e){
            for(int l:k){
                System.out.print(" "+l);
            }
            System.out.println();
        }

    }
}
