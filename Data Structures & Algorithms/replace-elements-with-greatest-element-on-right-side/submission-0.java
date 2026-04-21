class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0;
        int[] res = new int[arr.length];
        for (int i = arr.length - 2; i >= 0; i--) {
            max = Math.max(max, arr[i+1]);
            res[i] = max;
        }
        res[res.length-1] = -1;
        return res;
    }
}