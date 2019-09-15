package com.example.demo.repository;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TwoSumRepository {
    int[] nums;

    public TwoSumRepository() {
        nums = new int[]{1,2,3,4,5,6,7,8,9};
    }

    public int[] findTwoSum(int target) {
        int[] res = new int[]{-1, -1};

        Map<Integer, Integer> map  = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
        }

        return res;
    }
}
