public class MergeTwoYouXuShuZu {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] cur = new int[m];
        System.arraycopy(nums1,0,cur,0,m);
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        while(p1<m && p2<n){
            nums1[p++] = (cur[p1]<=nums2[p2])? cur[p1++] : nums2[p2++];
        }
        if(p1<m)System.arraycopy(cur, p1, nums1, p, m-p1);
        if(p2<m)System.arraycopy(nums2, p2, nums1, p, n-p2);
    }
}
