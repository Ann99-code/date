import java.util.HashMap;
import java.util.Map;

/**
 * @author lina @date 2022/7/2510:15
 */
public class ceshi {
    public static void main(String[] args) {
        class Solution {
            public int[] twoSum(int[] nums, int target) {
// 暴力算法:用每一个去加后面的数，和为target就返回数组下标,其实就是冒泡排序
// 哈希表算法，先建立一个哈希表，然后往哈希表里添加第一个值，此后每添加一个值，判断一次目标值减去添加的值在哈希表中是否存在
                Map<Integer,Integer> hashmap=new HashMap<>();
                int len=nums.length;
                hashmap.put(0,nums[0]);
                for(int i=1;i<len;i++){
                    int n=target-nums[i];
                    if(hashmap.containsKey(n)){
                        return new int[]{hashmap.get(n),i};
                    }
                    hashmap.put(nums[i],i);
                }
                return new int[0];
            }
        }
    }
}
