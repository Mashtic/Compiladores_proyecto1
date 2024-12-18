package tokens;

import java.lang.String;

public class Token {

    String tipo, lexema;
    int linea, columna;

    public Token(String tipo, String lexema, int linea, int columna) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.linea = linea;
        this.columna = columna;
    }

    public String toString() {
        return "Tipo: " + this.tipo +
                "\tLexema: " + this.lexema +
                "\tLinea: " + String.valueOf(this.linea) +
                "\tColumna:" + String.valueOf(this.columna);
    }

}
