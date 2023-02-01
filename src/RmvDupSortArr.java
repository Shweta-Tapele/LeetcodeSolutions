/* Leetcode solution to the problem Remove Duplicates from Sorted Array*/


/* Here we have to remove duplicates from a sorted array in-place that means without using extra space.
We also need to return the number of unique elements present in the array.
The uniques elements should be stored in the beginning of the Array the elements after the unique elements can be discarded  */


public class RmvDupSortArr {

        public int removeDuplicates(int[] nums) {
            int l = 1;

            for(int r=1;r<nums.length;r++)
            {
                if(nums[r] != nums[r-1])
                {
                    nums[l] = nums[r];
                    l++;
                }
            }
            return l;
        }
    }

