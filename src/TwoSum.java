import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            List<Integer> values = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    values.add(map.get(nums[i]));
                    values.add(i);
                    break;
                }
                int dif = target - nums[i];
                map.put(dif, i);
            }
            return values.stream().mapToInt(x -> x).toArray();
        }

}