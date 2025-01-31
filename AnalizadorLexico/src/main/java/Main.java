import managment.FileManager;

import jflex.LexerCup;
import cup.parser;

import java.io.IOException;
import java.io.StringReader;

import java_cup.runtime.Symbol;
import tokens.TokenTable;
import type_table.ValidateTypes;

public class Main {
    public static void main(String[] args) {
        // Nombre del archivo a evaluar
        String nombreArchivoTest = "code.txt";

        // Path del proyecto
        String currentDirectory = System.getProperty("user.dir");

        // Ruta del archivo de pruebas
        String rutaArchivo = currentDirectory + "\\pruebas\\" + nombreArchivoTest;
        String expr = FileManager.getFileContent(rutaArchivo);

        // Trabajo del lexer
        LexerCup lexer = new LexerCup(new StringReader(expr));
        LexerCup lexer_parser = new LexerCup(new StringReader(expr));
        TokenTable tabla = lexer.getTokenTable();

        // NO SE PUEDE BORRAR
        try {
            Symbol sim;
            do{
                sim = lexer.next_token();
            } while (sim.sym != 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Path del resultado
        String rutaArchivoResultados = currentDirectory + "\\resultados";
        FileManager.writeFile(rutaArchivoResultados, "resultado.txt", tabla.toString());

        // Parser
        try{
            parser p = new parser(lexer_parser);
            p.parse();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}