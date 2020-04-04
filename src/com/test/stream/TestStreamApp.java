package com.test.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreamApp {

    public static void main(String[] args) throws IOException {
        
        // Read file, map, filter, get count
        System.out.println("------------- Read file, map, filter, get count ------------");
        Stream<String> data = Files.lines(Paths.get("files/stockDataCsv.txt"));
        data
            .map((x) -> x.split(","))
            .filter((x) -> x.length > 3)
            .filter((x) -> Integer.parseInt(x[2].trim()) > 15)
            .forEach(n -> System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]));
        data.close();
        System.out.println();
        
        // Read file, map, filter, get count
        System.out.println("------------- Read file, map, filter, get count ------------");
        Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
        int count = (int) rows
            .map((x) -> x.split(","))
            .filter((x) -> x.length > 3)
            .count();
        System.out.println(count + " good rows");
        rows.close();
        System.out.println();
        
        // Read file, filter, collect, print
        System.out.println("------------- Read file, filter, collect, print ------------");
        List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
            .filter((x) -> x.startsWith("W"))
            .collect(Collectors.toList());
        words.forEach((x) -> System.out.print(x + ", "));
        System.out.println();
        
        // Read file, filter, sort, print
        System.out.println("----- Read file, filter, sort, print -----");
        Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
        lines
            .filter((n) -> (n.length() > 6))
            .sorted()
            .forEach((n) -> System.out.print(n + ", "));
        
        lines.close();
        System.out.println();
        
        
        // Stream from a list, filter and print
        System.out.println("----- Stream from a list, filter and print -----");
        List<String> list = Arrays.asList("Hello", "Doctor", "Computer", "Bucket", "Cloth", "Towel");
        list.stream()
            .map((x) -> x.toLowerCase())
            .sorted()
            .forEach((n) -> System.out.print(n + ", "));
        System.out.println();
        
        // Average of square of an int array
        System.out.println("----- Average of square of an int array -----");
        Arrays
            .stream(new int[] {2, 4, 6, 8})
            .map((x) -> x * x)
            .average()
            .ifPresent((n) -> System.out.println(n));
        System.out.println();
        
        // Stream of array, sort, filter and print
        System.out.println("----- Stream of array, sort, filter and print -----");
        String[] array = {"car", "keys", "wiper", "diaper", "toothbrush", "driver", "dinner"};
        Stream
            .of(array)
            .filter((x) -> x.startsWith("d"))
            .sorted()
            .forEach((x) -> System.out.print(x + ", "));
        System.out.println();
        
        // Stream.of, sorted, findFirst
        System.out.println("----- Stream.of, sorted, findFirst -----");
        Stream
            .of("Hello", "Kite", "Gutki", "Pipo", "Apple")
            .sorted()
            .findFirst()
            .ifPresent((x) -> System.out.println(x));
        System.out.println();
        
        
        // Print integer stream with sum
        System.out.println("----- Print Integer sum -----");
        int val = IntStream.range(1,  5)
            .sum();
        System.out.println("Sum = " + val);
        System.out.println();
        
        // Print Integers with skip
        System.out.println("----- Print Range of Numbers skip upto 4 -----");
        IntStream
            .range(10,  20)
            .skip(4)
            .forEach((x) -> System.out.print(x + ", "));
        System.out.println();
        
        // Print Integers (last number is non-inclusive)
        System.out.println("----- Print Range of Numbers -----");
        IntStream
            .range(1,  10)
            .forEach((x) -> System.out.print(x + ", "));
        System.out.println();
    }

}
