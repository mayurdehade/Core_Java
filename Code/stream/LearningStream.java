package core.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LearningStream {

    public static void main(String[] args) {
        
        // Creating a List of integers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        // Creating a Stream from the List
        // A stream object can only be used once
        Stream<Integer> s1 = nums.stream();
        
        // Filter the stream to include only even numbers
        // The filter() operation returns a new stream consisting of elements 
        // that match the given predicate (here, elements that are even)
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        
        // Map the filtered numbers to their double
        // The map() operation returns a new stream by applying the given 
        // function (here, multiplying by 2) to each element of the original stream
        Stream<Integer> s3 = s2.map(n -> n * 2);
        
        // Reduce the stream to sum all the elements, starting with an initial value of 0
        // The reduce() operation combines all elements of the stream into a single result 
        // using the provided accumulator function (here, summing the elements)
        Integer s4 = s3.reduce(0, (c, n) -> c + n); 
        
        // Print the result of the reduction (sum of doubled even numbers)
        // The expected output is 40, which is the sum of 4 + 8 + 12 + 16 = 40
        System.out.println("Sum of doubled even numbers: " + s4); // Output: 40
        
        // Printing each number in the original list
        // The forEach() method performs an action (here, printing each element)
        // on each element of the stream
        nums.forEach(n -> System.out.println("Original number: " + n));
    }
}
