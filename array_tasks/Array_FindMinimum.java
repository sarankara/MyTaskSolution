package array_tasks;

public class Array_FindMinimum {

    /*
    Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int[] arrmin={25,82,4,65,3,45};
        System.out.println(minValue(arrmin));

    }
    public static int minValue(int []num){
        int min=Integer.MAX_VALUE;
        for (int each: num){
            if(each<min){
                min=each;
            }
        }return min;
    }

//    public static int maxValue(int[] n) {
//
//        int min = Integer.MAX_VALUE;
//
//        for (int each : n) {
//            if (each < min) {
//                min = each;
//            }
//        }
//
//        return min;
//
//    }


}