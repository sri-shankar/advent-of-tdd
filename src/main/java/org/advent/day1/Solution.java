package org.advent.day1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
public class Solution {
    //Answer should be 70613
    public static void main(String[] args) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("day1-elf-calories.txt");

        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        ElfCalorieCounter elfCalorieCounter = new ElfCalorieCounter(reader);
        System.out.println("Max Calories:" + elfCalorieCounter.maxCalories());
    }
}
