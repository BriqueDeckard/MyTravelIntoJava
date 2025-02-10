package input_output;

import java.io.*;

public class MainInputOutput {
    /**
     * Les buffer sont des zones de mémoire utilisée pour stocker temporairement les informations avant que le processeur ne les traite.
     * Cela permet de gérer les différence de vitesse entre les processus, de diminuer le nombre d'IO, de synchroniser les diff. composants d'un système et de traiter l'info en lots.
     *
     * @param args
     */
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Répertoire de travail courant : " + currentDirectory);
        String inputFilePath = "JavaFundamentals/src/main/resources/lorem_ipsum.txt";
        MainInputOutput.class.getClassLoader().getResource(inputFilePath);
        String outputFilePath = "JavaFundamentals/src/main/resources/ipsum.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(inputFilePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erreur lecture fichier", e);
        }
        BufferedReader br = new BufferedReader(fileReader);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(outputFilePath);
        } catch (IOException e) {
            throw new RuntimeException("Erreur ecriture fichier", e);
        }
        BufferedWriter bw = new BufferedWriter(fileWriter);
        String line;
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException("Erreur lecture fichier", e);
            }
            try {
                fileWriter.write(line + "\n");
            } catch (IOException e) {
                throw new RuntimeException("Erreur ecriture fichier", e);
            }
        }
        System.out.println("Fichier ecrit");
    }
}
