package org.interview; /*  Created By  Lyes  on 3/21/2021 , at 10:03 PM  */

public class findSmallestPositiveNumberThatDoesNotOccur {

    public static int solution(int[] A, int size) {
        int shifted= getAllPositiveNums(A, size);
        int A2[]= new int[size-shifted];
        int j=0;

        for (int i=shifted; i<size;i++){

            A2[j]= A[i];
            j++;
        }
        return fingMissingPositiveNum(A2, j);
    }

    static int getAllPositiveNums(int A[], int size){

        int j=0;
        for(int i=0; i<size;i++){
            if(A[i]<=0){
                int temp;
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                j++;
            }
        }
        return j;
    }

    static int fingMissingPositiveNum(int A[], int size){
        int i;

        for (i=0; i<size; i++){
            int x= Math.abs(A[i]);
            if (x-1 <size && A[x-1]>0)
                A[x-1] = -A[x-1];
        }

        for (i=0; i<size;i++)
            if (A[i]>0)
                return i+1;

        return size+1;
    }

    public static void main(String[] args) {
        int A[]={1, 9, 6, 4, 1, 2};
        int size= A.length;
        int missing= solution(A, size);
        System.out.println("The smallest positive number missing is : "+ missing);
    }




}
