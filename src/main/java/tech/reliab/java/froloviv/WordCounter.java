package tech.reliab.java.froloviv;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class WordCounter {
    private List<String> list = new ArrayList<>();
    private HashMap<String, Integer> wordCounterList = new HashMap<>();

    public void readListFromFile() {
        String fileName = "src/main/java/tech/reliab/java/froloviv/test.txt";
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            list = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list.toString());
    }

    public void convertListToMap() {
        for (String el : list) {
            int count = wordCounterList.getOrDefault(el, 0) + 1;
            wordCounterList.put(el, count);
        }
        System.out.println(wordCounterList);
    }
}
