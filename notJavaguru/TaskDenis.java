package notJavaguru;

import java.io.*;


public class TaskDenis {

    public static void main(String[] args) {
        //uzdot faila nosaukumu
        String fileName = "C:\\users\\userOhohoho\\Documents\\textFile.txt";
//        String fileName = "C:\\Users\\Polina\\Documents\\textFile.txt";

        int wordCount = 0;
        int letterCount = 0;
        int lineCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            String line;

            while ((line = reader.readLine()) != null) { //nolasīt rindu un pārbaudīt vai tā eksistē

                String[] wordsInLine = line.split(" ");     //sadalīt rindu pa vārdiem

                for (int i = 0; i < wordsInLine.length; i++) {
                    char[] lettersinWord = wordsInLine[i].toCharArray();    //sadalīt vārdu pa burtiem

                    for (char letter : lettersinWord
                    ) {
                        if ((int) letter >= 0 && (int) letter < 128) {
                            letterCount++;          //TODO Burtu skaitītajs
                        }
                    }
                }

                if (letterCount > 0) {
                    wordCount = wordCount + wordsInLine.length;     //TODO Vārdu skaitītājs
                }
                if (wordCount > 0) {
                    lineCount++;        //TODO Rindu skaitītājs
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(wordCount);
        System.out.println(letterCount);
        System.out.println(lineCount);

    }


}
