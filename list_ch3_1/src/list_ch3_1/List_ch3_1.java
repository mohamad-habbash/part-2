/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ch3_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Educ
 */
public class List_ch3_1 {

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
 //Q2
      Pattern p = Pattern.compile("\\B"); 
        try {
            Files
                    .lines(Paths.get("D:\\Users\\Educ\\Desktop\\test.txt"))
                    .flatMap(line -> p.splitAsStream(line))
                    .collect(Collectors
                            .groupingBy(String::toUpperCase, Collectors.counting()
                            )
                    )
                    .forEach((charc, count)
                            -> System.out.println(charc + " : " + count));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
