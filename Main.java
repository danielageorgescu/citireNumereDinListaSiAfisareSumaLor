package com.itfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Main {
    @Override
    public String toString() {
        return new StringJoiner(", ", Main.class.getSimpleName() + "[", "]")
                .toString();
    }

    public static void main(String[] args) throws IOException {

           Path path = Paths.get("numere.txt");
           List<String>line = Files.readAllLines(path);
           System.out.println(line);

            Random random = new Random();

                int variabila1 = Integer.parseInt(line.get(random.nextInt(line.size())));
                int variabila2 = Integer.parseInt(line.get(random.nextInt(line.size())));
                int suma = variabila1+variabila2;

            System.out.println("Primul numar ales este: "+variabila1+
                   "\n Al doilea numar ales este: "+ variabila2+
                  "\n Suma celor doua este: "+suma);
    }
}




