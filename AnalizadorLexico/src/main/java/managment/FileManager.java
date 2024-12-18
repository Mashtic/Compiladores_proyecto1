package managment;

import java.io.FileWriter;
import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FileManager {

    public static String getFileContent(String rutaArchivo) {

        try {
            // Leer todo el contenido del archivo como un String
            return Files.readString(Path.of(rutaArchivo));
        } catch (IOException e) {
            // Manejo de errores si el archivo no se encuentra o no se puede leer
            return (String) e.getMessage();
        }
    }

    public static void writeFile(String rutaArchivo, String nombreArchivo, String contenido) {

        // Uso de try-with-resources para manejar automáticamente el cierre del FileWriter
        try (FileWriter escritor = new FileWriter(rutaArchivo+"\\"+nombreArchivo)) {
            // Escribir el contenido en el archivo
            escritor.write(contenido);
            System.out.println("Archivo escrito exitosamente en: " + rutaArchivo);
        } catch (IOException e) {
            // Manejo de errores en caso de que algo falle al escribir el archivo
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void moveFile(String rutaArchivo, String rutaDestino) {
        // Convert the file paths to Path objects
        Path sourcePath = Paths.get(rutaArchivo);
        Path destinationPath = Paths.get(rutaDestino);

        try {
            // Move the file from sourcePath to destinationPath
            Files.move(sourcePath, destinationPath);
            System.out.println("File moved successfully!");
        } catch (IOException e) {
            System.err.println("Error moving file: " + e.getMessage());
        }
    }
}
