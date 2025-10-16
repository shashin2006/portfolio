package work;
class solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                max=Math.max(max,count);
            }   
            else
            {
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        solution s=new solution();
        int[] arr={1,1,0,1};
        System.out.println(s.findMaxConsecutiveOnes(arr));
    }
}

