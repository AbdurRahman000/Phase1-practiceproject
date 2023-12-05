package practicePRojectPhase;
import java.util.Arrays;
public class LongestIncreasingSequence {
	public static int longestIncreasingSubsequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int maxLIS = 0;
        for (int length : dp) {
            maxLIS = Math.max(maxLIS, length);
        }

        return maxLIS;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {45,6,7,6,8,9,67,78,98,700};
	        int result = longestIncreasingSubsequence(nums);
	        System.out.println("Length of Longest Increasing Subsequence: " + result);
	}

}
