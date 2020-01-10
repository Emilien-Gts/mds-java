package fr.mds.gameoflife.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class File {

    public void printFile(String[] args) {

        String path = "D:\\Workspace\\workspace_eclipse_mds_19_20\\GameOfLife\\src\\star.txt";

        try (Stream<String> lines = Files.lines(Paths.get(path))) {

            // Formatting like \r\n will be lost
            // String content = lines.collect(Collectors.joining());

            // UNIX \n, WIndows \r\n
            String content = lines.collect(Collectors.joining(System.lineSeparator()));
            System.out.println(content);

			// File to List
            //List<String> list = lines.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
