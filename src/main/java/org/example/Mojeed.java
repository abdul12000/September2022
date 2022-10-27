package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

//“In a language of your choice, using all best practice principles you’re aware of, could you please provide code that
// reads a list of 10 numbers ranging between 1 to 100.
//        Assuming there are 4 duplicates in the list of numbers, the output should remove the duplicates and sort
//        the remaining numbers in descending order.
//        Please state any assumptions you’ve made.
    public class Mojeed {
        public static void removeDuplicates(int[] arr) {
            LinkedHashSet<Integer> set
                    = new LinkedHashSet<Integer>();
            // adding elements to LinkedHashSet so we can remove duplicates
            for (int i = 0; i < arr.length; i++)
                set.add(arr[i]);
            // Print the elements of LinkedHashSet
            System.out.println(set);
            //Converting set to a list
            List<Integer> duplicatesRemovedList = new ArrayList<>(set);

            //sorting in descending order
//            List<Integer> sortedList = duplicatesRemovedList.stream().sorted((s1,s2)->s2.compareTo((s1))).collect(Collectors.toList());
            List<Integer> sortedList = duplicatesRemovedList.stream().sorted().collect(Collectors.toList());

            //Printing out the sorted List
            sortedList.forEach(System.out::println);
        }

        // Driver code
        public static void main(String[] args) {
// list of 10 numbers ranging between 1 to 100 with 4 duplicates in the list of numbers
            int arr[] = {1, 2, 80, 1, 7, 2, 4, 80, 50, 7};

            // Function call
            removeDuplicates(arr);
        }

}
