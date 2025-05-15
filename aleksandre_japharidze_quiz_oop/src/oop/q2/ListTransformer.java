package oop.q2;

import java.util.*;
/**
 * This program demonstrates how to transform a list of integers (list1)
 * into a list of strings (list3) by using calculated indexes to access elements from another list (list2).
 *
 * The transformation works as follows:
 * For each integer in list1, we compute an index using the formula:
 *      index = (value * 2) - 1
 * Then retrieve the string at that index from list2 and add it to list3.
 *
 * This shows how integer-based logic can be used to navigate and extract values
 * from a separate list of strings using calculated indexes.
 *
 * Author: Aleksandre Japharidze
 * Date: 15/05/2025
 */
public class ListTransformer {
    /**
     * The main method initializes the three lists and performs the transformation from list1 to list3.
     * It prints all three lists to the console.
     */
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(9, 3, 8, 9, 3, 6, 3, 7, 2, 9, 7, 2, 5);

        List<String> list2 = Arrays.asList(
                "YnQ", "Ow2y1", "caG", "1Cnez", "o4Gwl", "u5JtO", "qJ1m",
                "jK0YA", "6zz", "WGsoy", "8lts1", "Ygt", "DM4R",
                "slwVc", "cH1Ke", "Xx6vL", "6ex", "IOG"
        );

        List<String> list3 = new ArrayList<>();

        for (int num : list1) {
            int index = num * 2 - 1;
            if (index >= 0 && index < list2.size()) {
                list3.add(list2.get(index));
            } else {
                list3.add("Out of bounds!");
            }
        }

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);
    }
}
