class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) 
            list.add(nums1[i]);
        for (int i = 0; i < n; i++) 
        list.add(nums2[i]);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }
//         int i = 0;
// int j = 0;

// while(i < nums1.length && j < nums2.length) {
//     if(nums1[i] <= nums2[j]) {
//         list.add(nums1[i]);
//         i++;
//     } else {
//         list.add(nums2[j]);
//         j++;
//     }
// }
        // int i=0,j=0;
        //  while(i < nums1.length) {
        //     list.add(nums1[i]);
        //     i++;
        //     if(j<nums2.length){
        //     list.add(nums2[j]);
        //     j++;
        //     } 
        //  }
        //  Collections.sort(list);

        }
    }
