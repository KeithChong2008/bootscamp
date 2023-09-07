import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;

import Array.array;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Testing2 {

   public static void main(String[] args) {
    Stream<String> empty = Stream.empty();

    Stream<Integer> singleElemeent = Stream.of(1);

    Stream<Integer> multipleElements = Stream.of(1,2,3);

    List<String> list = Arrays.asList("a","b","c");

    Stream<String> fromList = list.stream();

    Stream<Double> randoms = Stream.generate(Math::random);

    Stream<Integer> oddnumbers = Stream.iterate(1, n-> n+2)
    .limit(10);
    
    Stream<Double> randoms2 = Stream.generate(Math::random).limit(10);
    oddnumbers.forEach(System.out:: println);

    long count = list.stream()
    .distinct()
    .count();
   }
    
}
