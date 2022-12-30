package algorithmicThinking;

class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        System.out.println(search(nums, target));
        System.out.println(search(nums2, target2));
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (target == nums[mid]){
                return mid;
            }
            else if (target > nums[mid]){
                left = mid + 1;
            }
            else if (target < nums[mid]){
                right = mid - 1;
            }
        }
        return -1;
    }
}
