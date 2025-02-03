import cup.sym;
import managment.FileManager;

import jflex.LexerCup;
import cup.parser;

import java.io.IOException;
import java.io.StringReader;

import java_cup.runtime.Symbol;
import tokens.TokenTable;
import type_table.ValidateTypes;
import java.util.List;
import Generator.MIPSGenerator;
import Generator.ICG;
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
        ICG icg = new ICG();
        // NO SE PUEDE BORRAR
        try {
            Symbol sim;
            String lastVar = null;

            do{
                sim = lexer.next_token();
                if (sim.value != null) {
                    String tokenValue = sim.value.toString();
                    if (sim.sym == sym.IDENTIFICADOR) {
                        lastVar = tokenValue;
                    } else if (sim.sym == sym.ASIGNACION) {
                        Symbol nextToken = lexer.next_token();
                        if (nextToken != null && nextToken.value != null) {
                            icg.generateAssignment(lastVar, nextToken.value.toString());
                        }
                    } else if (sim.sym == sym.SUMA) {
                        Symbol nextToken = lexer.next_token();
                        if (nextToken != null && nextToken.value != null) {
                            icg.generateAddition(lastVar, nextToken.value.toString(), "temp");
                        }
                    } else if (sim.sym == sym.RESTA) {
                        Symbol nextToken = lexer.next_token();
                        if (nextToken != null && nextToken.value != null) {
                            icg.generateSubtraction(lastVar, nextToken.value.toString(), "temp");
                        }
                    }
                }
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
        List<String> irCode = icg.getIntermediateCode();
        for (String line : irCode) {
            System.out.println("IR: " + line);
        }

        MIPSGenerator.generateMIPS(irCode);
    }
}