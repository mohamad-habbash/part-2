/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_ch3_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

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
    public static void main(String[] args) throws IOException {
    /*Q1
     Random r = new Random();
     int[] random = new int[30];

     for (int i = 0; i < random.length; i++) {
     random[i] = r.nextInt(100) + 1;
     }

     LinkedList<Integer> list = new LinkedList<Integer>();
     for (int currentInt : random) {
     list.add(currentInt);
     }
        
     for (int i = 0; i < random.length; i++) {
     System.out.println(random[i]);
     // list.sort(Comparator.reverseOrder());
     //OR
     // Collections.sort(list);
     }
         
     //method sum in top
     System.out.println("the sum of random linked list : "+sum(list));
     double avg = sum(list)/30;
     System.out.println("the sum of random linked list : "+avg);
*/
        ///////////////
     
     
    /* Q2
     String filePath = "D:\\Users\\Educ\\Desktop\\test.txt";
     HashMap<String, Integer> map = new HashMap<String, Integer>();

     String line;
     BufferedReader reader = new BufferedReader(new FileReader(filePath));
     while ((line = reader.readLine()) != null) {
     System.out.println("File Contents: " + line);
     if (!line.trim().equals(" ")) {
     String[] parts = line.split(" ");
     for (String word : parts) {
     if (word == null || word.trim().equals(" ")) {
     continue;
     }
     String c = word.toLowerCase();
     if (map.containsKey(c)) {
     map.put(c, map.get(c) + 1);
     } else {
     map.put(c, 1);
     }
     }
     }
     line = reader.readLine();
     }
     System.out.println("number of words: " + map);
    
     //num of latters
     HashMap<Character, Integer> maps = new HashMap<Character, Integer>();
     BufferedReader readers = new BufferedReader(new FileReader(filePath));
     String lines;
     while ((lines = readers.readLine()) != null) {
     if (!lines.trim().equals(" ")) {
     char[] part = lines.toCharArray();
     for (char s : part) {
     if (maps.containsKey(s)) {
     maps.put(s, maps.get(s) + 1);
     } else {
     maps.put(s, 1);
     }
     }
     }
     lines = readers.readLine();
     }
     System.out.println("Number Of Character: " + maps);
     */

    }
}
