import managment.FileManager;

import jflex.LexerCup;

import java.io.IOException;
import java.io.StringReader;

import java_cup.runtime.Symbol;
import tokens.TokenTable;

public class Main {
    public static void main(String[] args) {

        // Necesario (creo) mover las clases creadas en target
        // Por ahora no detecta LexerCup


        String rutaArchivo = "";
        String expr = FileManager.getFileContent(rutaArchivo); // Ruta concreta
        LexerCup lexer = new LexerCup(new StringReader(expr));
        TokenTable tabla = lexer.getTokenTable();

        // NO SE PUEDE BORRAR
        try {
            Symbol sim = lexer.next_token();
            while (sim.sym != 0){
                sim = lexer.next_token();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String resultado = tabla.toString();

        String rutaArchivoResultados = ""; // Ruta donde van los resultados
        FileManager.writeFile(rutaArchivoResultados, "prueba.txt", resultado);

        // Eliminar las clases anteriores (creadas por plugins) acá si existen

    }
}