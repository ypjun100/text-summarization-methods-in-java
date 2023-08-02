package us.narin.summarizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
        try {
            Summarizer summarizer = new Summarizer(new Scanner(new File("./test.txt")).useDelimiter("\\Z").next());
            System.out.println(summarizer.summarize());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
