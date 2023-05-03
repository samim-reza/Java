class Sol {
    public int singleNumber(int[] nums) {
        int ans=0; //since XOR with 0 returns same number
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i)
        }
        return ans;
    }
}
public class Solution
{
    public static void main(String[] args) {
        int[] nums=new int[]{4,1,2,1,2};
        Sol s1=new Sol();
        System.out.println(s1.singleNumber(nums));
    }
}