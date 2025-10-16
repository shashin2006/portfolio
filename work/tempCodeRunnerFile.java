package work;
public class solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            count+=1;
            if(count>max)
            {
                max=count;
            }
            else
            {
                return count;
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

