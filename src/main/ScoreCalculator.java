package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ScoreCalculator {
    int deadline;                                   //time for completing total scanning process.
    List<Library> libs;                             //list of libraries.
    HashMap<Integer, Integer> bookScoreMap;         //map of books with score

    public void fileRead(String fileName) {
        try {
            //the file to be opened for reading
            FileInputStream fis = new FileInputStream(fileName);
            Scanner sc = new Scanner(fis);          //file to be scanned
            //returns true if there is another line to read
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

            }
            sc.close();                             //closes the scanner
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initializeBookList() {

    }

    public int calculateScoreOfLib() {
        int score = 0;

        return score;
    }
}
