Easy Problems

1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
            nums[i]=n*(nums[nums[i]]%n)+nums[i];
        }
        for(int i=0; i<n;i++)
        {
            nums[i]=nums[i]/n;
        }
        return nums;
        
    }
}

2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0; i<n;i++)
        {
            ans[i]=nums[i];
        }

        for(int i=n; i<2*n;i++)
        {
            ans[i]=nums[i-n];

        }
        return ans;
        
    }
}
3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++)
        {
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;  
    }
}
4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans =0;
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j =0; j<accounts[i].length; j++)
            {
                sum+=accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }

        }
        return ans;
        
    }
}
5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] ans = new int[nums.length];
        int j=0;
       for(int i=0; i<nums.length; i+=2)
       {
           ans[i]=nums[j];
           j++;
       }
       int k=0;
       for(int i=1; i<nums.length; i+=2)
       {
           ans[i]=nums[k+n];
           k++;
       }
        return ans;
    }
}
6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0; i<candies.length; i++)
        {
            if(candies[i]>max)
            {
                max = candies[i];
            }
        }
        ArrayList<Boolean> arr = new ArrayList<>();
        for(int val:candies)
        {
            arr.add(val+extraCandies>=max);
        }
        return arr;
    }
}

7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++)
        {
        for(int j=0; j<nums.length; j++)
        {
            if(i<j && nums[i]==nums[j])
            {
                count++;
            }
        }
        }
        return count;
    }
}
8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i=0; i<nums.length;i++)
        {
            int count=0;
            for(int j=0; j<nums.length; j++)
            {
                if(nums[i]>nums[j]&&j!=i)
                {
                    count++;
                }
                arr[i]=count;
            }
        }
        return arr;
        
    }
}
9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            list.add(index[i], nums[i]);
        } 
        for(int i=0; i<nums.length; i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}
10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> alpha = new HashSet<>();
        for(int i ='a'; i<='z'; i++)
        {
            alpha.add((char)i);
        }
        for(int i=0; i<sentence.length(); i++)
        {
            alpha.remove(sentence.charAt(i));
            if(alpha.isEmpty())
            {
                return true;
            }
        }
        return false;
    }
}
