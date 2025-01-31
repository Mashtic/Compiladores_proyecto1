package type_table;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public final class ValidateTypes {

    // Patrones
    // Definiciones básicas
    public static final String LETRA = "[a-zA-Z]";
    public static final String DIGITO = "[0-9]";
    public static final String ESPACIO = "\\r|\\n|\\r\\n|[ \\t\\f]";

    // Identificadores
    public static final String P_MAIN = "_verano_";
    public static final String P_IDENTIFICADOR = "_(" + LETRA + "|" + DIGITO + ")(" + LETRA + "|" + DIGITO + "|_)*_";

    // Tipos de datos
    public static final String P_INTEGER = "rodolfo";
    public static final String P_FLOAT = "bromista";
    public static final String P_BOOL = "trueno";
    public static final String P_CHAR = "cupido";
    public static final String P_STRING = "cometa";

    // Literales
    public static final String P_LIT_INTEGER = "(-?)" + DIGITO + "+";
    public static final String P_LIT_FLOAT = "(-?)" + DIGITO + "+\\." + DIGITO + "+";
    public static final String P_LIT_CHAR = "\'.?\'";
    public static final String P_LIT_STRING = "\".*\"";
    public static final String P_LIT_BOOL = "true|TRUE|false|FALSE";

    // Operadores aritméticos
    public static final String P_SUMA = "navidad";
    public static final String P_RESTA = "intercambio";
    public static final String P_DIVISION = "reyes";
    public static final String P_MULTIPLICACION = "nochebuena";
    public static final String P_MODULO = "magos";
    public static final String P_POTENCIA = "adviento";
    public static final String P_INCREMENTO = "quien";
    public static final String P_DECREMENTO = "grinch";

    // Operadores relacionales
    public static final String P_MENOR = "snowball";
    public static final String P_MENOR_IGUAL = "evergreen";
    public static final String P_MAYOR = "minstix";
    public static final String P_MAYOR_IGUAL = "upatree";
    public static final String P_IGUALDAD = "mary";
    public static final String P_DIFERENTE = "openslae";

    // Operadores lógicos
    public static final String P_CONJUNCION = "melchor";
    public static final String P_DISYUNCION = "gaspar";
    public static final String P_NEGACION = "baltazar";

    // Estructuras de control
    public static final String P_IF = "elfo";
    public static final String P_ELSE = "hada";
    public static final String P_WHILE = "envuelve";
    public static final String P_FOR = "duende";
    public static final String P_SWITCH = "varios";
    public static final String P_CASE = "historia";
    public static final String P_DEFAULT = "ultimo";
    public static final String P_BREAK = "corta";
    public static final String P_RETURN = "envia";
    public static final String P_DOS_PUNTOS = "sigue";

    // Símbolos de estructura
    public static final String P_COMA = ",";
    public static final String P_PUNTO_COMA = ";";
    public static final String P_NEGATIVO = "-";
    public static final String P_BLOQUE_A = "abrecuento";
    public static final String P_BLOQUE_C = "cierracuento";
    public static final String P_CORCHETE_A = "abreempaque";
    public static final String P_CORCHETE_C = "cierraempaque";
    public static final String P_PARENTESIS_A = "abreregalo";
    public static final String P_PARENTESIS_C = "cierraregalo";
    public static final String P_ASIGNACION = "entrega";
    public static final String P_DELIMITADOR = "finregalo";

    // Operaciones de lectura/escritura
    public static final String P_PRINT = "narra";
    public static final String P_READ = "escucha";

    // Estándar evaluación
    public static final String E_INTEGER = "integer";
    public static final String E_FLOAT = "float";
    public static final String E_STRING = "string";
    public static final String E_CHAR = "char";
    public static final String E_BOOL = "bool";

    public static final String E_EXPR_ARIT = "expr_arit";
    public static final String E_EXPR_REL = "expr_rel";
    public static final String E_EXPR_LOG = "expr_log";

    // Listas de caracteres permitidos
    public static final List<String> L_NUMBER = Arrays.asList(E_INTEGER, E_FLOAT, E_EXPR_ARIT);
    public static final List<String> L_BOOL = Arrays.asList(E_BOOL, E_EXPR_REL, E_EXPR_LOG);
    public static final List<String> L_EXPR_REL_NUM = Arrays.asList(E_INTEGER, E_FLOAT);
    public static final List<String> L_EXPR_REL_BOOL = Arrays.asList(E_BOOL, E_EXPR_ARIT);
    public static final List<String> L_OP_REL_NUM = Arrays.asList(P_MAYOR, P_MAYOR_IGUAL, P_MENOR,
                                                                    P_MENOR_IGUAL, P_IGUALDAD, P_DIFERENTE);
    public static final List<String> L_OP_REL_BOOL = Arrays.asList(P_IGUALDAD, P_DIFERENTE);
    public static final List<String> L_EXPR_LOG = Arrays.asList(E_BOOL, E_EXPR_REL);

    // Métodos
    public static String getType(String token) {

        // Identificadores
        if (Pattern.matches(P_MAIN, token)) return "main";
        else if (Pattern.matches(P_IDENTIFICADOR, token)) return "identificador";

        // Tipos de datos y literales
        else if (Pattern.matches(P_INTEGER, token) || Pattern.matches(P_LIT_INTEGER, token)) return E_INTEGER;
        else if (Pattern.matches(P_FLOAT, token) || Pattern.matches(P_LIT_FLOAT, token)) return E_FLOAT;
        else if (Pattern.matches(P_BOOL, token) || Pattern.matches(P_LIT_BOOL, token)) return E_BOOL;
        else if (Pattern.matches(P_CHAR, token) || Pattern.matches(P_LIT_CHAR, token)) return E_CHAR;
        else if (Pattern.matches(P_STRING, token) || Pattern.matches(P_LIT_STRING, token)) return E_STRING;

        // Operadores aritméticos
        else if (Pattern.matches(P_SUMA, token)) return "suma";
        else if (Pattern.matches(P_RESTA, token)) return "resta";
        else if (Pattern.matches(P_DIVISION, token)) return "division";
        else if (Pattern.matches(P_MULTIPLICACION, token)) return "multiplicacion";
        else if (Pattern.matches(P_MODULO, token)) return "modulo";
        else if (Pattern.matches(P_POTENCIA, token)) return "potencia";
        else if (Pattern.matches(P_INCREMENTO, token)) return "incremento";
        else if (Pattern.matches(P_DECREMENTO, token)) return "decremento";

        // Operadores lógicos
        else if (Pattern.matches(P_CONJUNCION, token)) return "conjuncion";
        else if (Pattern.matches(P_DISYUNCION, token)) return "disyuncion";
        else if (Pattern.matches(P_NEGACION, token)) return "negacion";

        // Estructuras de control
        else if (Pattern.matches(P_IF, token)) return "if";
        else if (Pattern.matches(P_ELSE, token)) return "else";
        else if (Pattern.matches(P_WHILE, token)) return "while";
        else if (Pattern.matches(P_FOR, token)) return "for";
        else if (Pattern.matches(P_SWITCH, token)) return "switch";
        else if (Pattern.matches(P_CASE, token)) return "case";
        else if (Pattern.matches(P_DEFAULT, token)) return "default";
        else if (Pattern.matches(P_BREAK, token)) return "break";
        else if (Pattern.matches(P_RETURN, token)) return "return";
        else if (Pattern.matches(P_DOS_PUNTOS, token)) return "dos_puntos";

        // Símbolos de estructura
        else if (Pattern.matches(P_COMA, token)) return "coma";
        else if (Pattern.matches(P_PUNTO_COMA, token)) return "punto_coma";
        else if (Pattern.matches(P_NEGATIVO, token)) return "negativo";
        else if (Pattern.matches(P_BLOQUE_A, token)) return "bloque_a";
        else if (Pattern.matches(P_BLOQUE_C, token)) return "bloque_c";
        else if (Pattern.matches(P_CORCHETE_A, token)) return "corchete_a";
        else if (Pattern.matches(P_CORCHETE_C, token)) return "corchete_c";
        else if (Pattern.matches(P_PARENTESIS_A, token)) return "parentesis_a";
        else if (Pattern.matches(P_PARENTESIS_C, token)) return "parentesis_c";
        else if (Pattern.matches(P_ASIGNACION, token)) return "asignacion";
        else if (Pattern.matches(P_DELIMITADOR, token)) return "delimitador";

        // Operaciones de lectura/escritura
        else if (Pattern.matches(P_PRINT, token)) return "print";
        else if (Pattern.matches(P_READ, token)) return "read";

        return "null";
    }

    public static boolean validateTypesAsign(String type, String val){
        System.out.println("Type: " + type + " Value: " + val);
        if (L_NUMBER.contains(type) && L_NUMBER.contains(val)){
            return true;
        }
        else if (L_BOOL.contains(type) && L_BOOL.contains(val)){
            return true;
        }
        else if (type.equals(E_STRING) && val.equals(E_STRING)){
            return true;
        }
        else if (type.equals(E_CHAR) && val.equals(E_CHAR)){
            return true;
        }
        return false;
    }

    public static boolean validateNumber(String val_1){
        if (L_NUMBER.contains(val_1)){
            return true;
        }
        return false;
    }

    public static boolean validateBoolean(String val_1){
        if (val_1.equals(E_BOOL)){
            return true;
        }
        return false;
    }

    public static boolean validateExprRelNum(String val_1, String val_2, String op){
        if (L_EXPR_REL_NUM.contains(val_1) && L_EXPR_REL_NUM.contains(val_2) && L_OP_REL_NUM.contains(op)){
            return true;
        }
        return false;
    }

    public static boolean validateExprRelBool(String val_1, String val_2, String op){
        if (L_EXPR_REL_BOOL.contains(val_1) && L_EXPR_REL_BOOL.contains(val_2) && L_OP_REL_BOOL.contains(op)){
            return true;
        }
        return false;
    }

    public static boolean validateExprLog(String val_1){
        if (L_EXPR_LOG.contains(val_1)){
            return true;
        }
        return false;
    }
}