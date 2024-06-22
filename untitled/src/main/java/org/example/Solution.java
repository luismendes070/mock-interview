package org.example;
// 30 minutes artificial intelligence mock interview
// Input stdin 4 2 1 3 2
// Expected output 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    public static int getMaxEngineers(List<Integer> serverLoad) {
        if (serverLoad == null || serverLoad.isEmpty()) {
            return 0;
        }

        int engineers = 1; // At least one engineer is needed
        for (int i = 1; i < serverLoad.size(); i++) {
            if (serverLoad.get(i) <= serverLoad.get(i - 1)) {
                engineers++;
            }
        }

        return engineers;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read the input line
        String inputLine = bufferedReader.readLine().trim();

        // Split the input line into tokens based on spaces
        String[] tokens = inputLine.split("\\s+");

        // Convert tokens to integers and store in a list
        List<Integer> serverLoad = new ArrayList<>();
        for (String token : tokens) {
            serverLoad.add(Integer.parseInt(token));
        }

        int result = Result.getMaxEngineers(serverLoad);

        System.out.println(result);

        bufferedReader.close();
    }
}

