//Intersection of Two Arrays II
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

public class IntersectionOfTwoArraysII {
    //public int[] intersect(int[] nums1, int[] nums2) {
    public void intersect(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length];
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    newArray[count] = nums1[i];
                    nums2[j] = Integer.MIN_VALUE;
                    count++;
                    break;
                }
            }
        }

        //int[] newArray2 = new int[count];

        System.out.println("Repeated values");
        for (int i = 0; i < count; i++)
            System.out.print(newArray[i]+" ");
            //newArray2[i] = newArray[i];

        //return newArray2;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysII iota = new IntersectionOfTwoArraysII();

        //int[] nums1 = {1,2,2,1};
        //int[] nums2 = {2,2};
        
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        iota.intersect(nums1, nums2);
    }
}