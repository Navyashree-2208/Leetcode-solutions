class Solution {
    public int[] searchRange(int[] nums, int target) {
        int First = findf(nums, target);
        int Second = finds(nums, target);
        return new int[] { First, Second };
    }

    private int findf(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        return ans;
    }

    private int finds(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans =-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        return ans;
    }

}