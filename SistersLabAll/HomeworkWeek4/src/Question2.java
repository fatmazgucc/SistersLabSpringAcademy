/*
*
*
*
* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
*
* */

public class Question2 {

    public static int[] arr = new int[9];
    public static int[] ctrlArr = new int[arr.length];

    public static void main(String[] args) {
        arr[0]=8;
        arr[1]=4;
        arr[2]=7;
        arr[3]=3;
        arr[4]=2;
        arr[5]=0;
        arr[6]=1;
        arr[7]=9;
        arr[8]=6;

        int missingN = returnMissingNumber();
        if(missingN == -1){
            System.out.println("There is no missing number");
        }else{
            System.out.println("Missing number is :"+missingN);
        }
    }
public static int returnMissingNumber(){
for (int i =0; i< arr.length;i++){
    ctrlArr[i]=-1;
}

for(int i=0;i<arr.length;i++){
    if(arr[i] >=0 && arr[i]<arr.length){
        ctrlArr[arr[i]] = arr[i];
    }
}

for(int i = 0; i<ctrlArr.length;i++){
    if(ctrlArr[i]==-1){
        return i;
    }
}
return -1;

    }
}
