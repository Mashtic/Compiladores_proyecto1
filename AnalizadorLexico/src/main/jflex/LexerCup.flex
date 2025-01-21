package jflex;

import java_cup.runtime.*;

import tokens.Token;
import tokens.TokenTable;
import tokens.SymbolTable;
%%
%class LexerCup
%public
%unicode
%cup
%line
%column

%{
    StringBuffer string = new StringBuffer();

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn, yytext());
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, yytext());
    }

    public SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    };

    public TokenTable tokensTable = new TokenTable();

    public TokenTable getTokenTable(){
        return this.tokensTable;
    };
%}

letra = [a-zA-Z]
digito = [0-9]
espacio = \r | \n | \r\n | [ \t\f]

%state STRING

%%

/* Identificadores */
<YYINITIAL> "_verano_" { symbolTable.addSymbol(yytext(), "MAIN", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("MAIN", yytext(), yyline, yycolumn)); return symbol(sym.MAIN); }
<YYINITIAL> "_"({letra}|{digito})({letra}|{digito}|_)*"_" { symbolTable.addSymbol(yytext(), "IDENTIFICADOR", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("IDENTIFICADOR", yytext(), yyline, yycolumn)); return symbol(sym.IDENTIFICADOR); }

/* Tipos */
<YYINITIAL> "rodolfo" { symbolTable.addSymbol(yytext(), "INTEGER", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("INTEGER", yytext(), yyline, yycolumn)); return symbol(sym.INTEGER); }
<YYINITIAL> "bromista" { symbolTable.addSymbol(yytext(), "FLOAT", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("FLOAT", yytext(), yyline, yycolumn)); return symbol(sym.FLOAT); }
<YYINITIAL> "trueno" { symbolTable.addSymbol(yytext(), "BOOL", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("BOOL", yytext(), yyline, yycolumn)); return symbol(sym.BOOL); }
<YYINITIAL> "cupido" { symbolTable.addSymbol(yytext(), "CHAR", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("CHAR", yytext(), yyline, yycolumn)); return symbol(sym.CHAR); }
<YYINITIAL> "cometa" { symbolTable.addSymbol(yytext(), "STRING", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("STRING", yytext(), yyline, yycolumn)); return symbol(sym.STRING); }

/* Objetos */
{digito}+ { symbolTable.addSymbol(yytext(), "LIT_INTEGER", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("LIT_INTEGER", yytext(), yyline, yycolumn)); return symbol(sym.LIT_INTEGER); }
{digito}+.{digito}+ { symbolTable.addSymbol(yytext(), "LIT_FLOAT", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("LIT_FLOAT", yytext(), yyline, yycolumn)); return symbol(sym.LIT_FLOAT); }

\'.?\' { symbolTable.addSymbol(yytext(), "LIT_CHAR", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("LIT_CHAR", yytext(), yyline, yycolumn)); return symbol(sym.LIT_CHAR); }
\".*\" { symbolTable.addSymbol(yytext(), "LIT_STRING", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("LIT_STRING", yytext(), yyline, yycolumn)); return symbol(sym.LIT_STRING); }

<YYINITIAL> "true"|"TRUE" { symbolTable.addSymbol(yytext(), "LIT_BOOL", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("LIT_BOOL", yytext(), yyline, yycolumn)); return symbol(sym.LIT_BOOL); }
<YYINITIAL> "false"|"FALSE" { symbolTable.addSymbol(yytext(), "LIT_BOOL", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("LIT_BOOL", yytext(), yyline, yycolumn)); return symbol(sym.LIT_BOOL); }

/* Operadores aritmeticos */
<YYINITIAL> "navidad" { symbolTable.addSymbol(yytext(), "SUMA", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("SUMA", yytext(), yyline, yycolumn)); return symbol(sym.SUMA); }
<YYINITIAL> "intercambio" { symbolTable.addSymbol(yytext(), "RESTA", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("RESTA", yytext(), yyline, yycolumn)); return symbol(sym.RESTA); }
<YYINITIAL> "reyes" { symbolTable.addSymbol(yytext(), "DIVISION", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("DIVISION", yytext(), yyline, yycolumn)); return symbol(sym.DIVISION); }
<YYINITIAL> "nochebuena" { symbolTable.addSymbol(yytext(), "MULTIPLICACION", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("MULTIPLICACION", yytext(), yyline, yycolumn)); return symbol(sym.MULTIPLICACION); }
<YYINITIAL> "magos" { symbolTable.addSymbol(yytext(), "MODULO", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("MODULO", yytext(), yyline, yycolumn)); return symbol(sym.MODULO); }
<YYINITIAL> "adviento" { symbolTable.addSymbol(yytext(), "POTENCIA", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("POTENCIA", yytext(), yyline, yycolumn)); return symbol(sym.POTENCIA); }
<YYINITIAL> "quien" { symbolTable.addSymbol(yytext(), "INCREMENTO", yyline + 1, yycolumn + 1, null);tokensTable.addToken(new Token("INCREMENTO", yytext(), yyline, yycolumn)); return symbol(sym.INCREMENTO); }
<YYINITIAL> "grinch" { symbolTable.addSymbol(yytext(), "DECREMENTO", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("DECREMENTO", yytext(), yyline, yycolumn)); return symbol(sym.DECREMENTO); }

/* Operadores relacionales */
<YYINITIAL> "snowball" { symbolTable.addSymbol(yytext(), "MENOR", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("MENOR", yytext(), yyline, yycolumn)); return symbol(sym.MENOR); }
<YYINITIAL> "evergreen" { symbolTable.addSymbol(yytext(), "MENOR_IGUAL", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("MENOR_IGUAL", yytext(), yyline, yycolumn)); return symbol(sym.MENOR_IGUAL); }
<YYINITIAL> "minstix" { symbolTable.addSymbol(yytext(), "MAYOR", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("MAYOR", yytext(), yyline, yycolumn)); return symbol(sym.MAYOR); }
<YYINITIAL> "upatree" { symbolTable.addSymbol(yytext(), "MAYOR_IGUAL", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("MAYOR_IGUAL", yytext(), yyline, yycolumn)); return symbol(sym.MAYOR_IGUAL); }
<YYINITIAL> "mary" { symbolTable.addSymbol(yytext(), "IGUALDAD", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("IGUALDAD", yytext(), yyline, yycolumn)); return symbol(sym.IGUALDAD); }
<YYINITIAL> "openslae" { symbolTable.addSymbol(yytext(), "DIFERENTE", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("DIFERENTE", yytext(), yyline, yycolumn)); return symbol(sym.DIFERENTE); }

/* Operadores logicos */
<YYINITIAL> "melchor" { symbolTable.addSymbol(yytext(), "CONJUNCION", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("CONJUNCION", yytext(), yyline, yycolumn)); return symbol(sym.CONJUNCION); }
<YYINITIAL> "gaspar" { symbolTable.addSymbol(yytext(), "DISYUNCION", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("DISYUNCION", yytext(), yyline, yycolumn)); return symbol(sym.DISYUNCION); }
<YYINITIAL> "baltazar" { symbolTable.addSymbol(yytext(), "NEGACION", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("NEGACION", yytext(), yyline, yycolumn)); return symbol(sym.NEGACION); }

/* Estructuras de control */
<YYINITIAL> "elfo" { symbolTable.addSymbol(yytext(), "IF", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("IF", yytext(), yyline, yycolumn)); return symbol(sym.IF); }
<YYINITIAL> "hada" { symbolTable.addSymbol(yytext(), "ELSE", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("ELSE", yytext(), yyline, yycolumn)); return symbol(sym.ELSE); }
<YYINITIAL> "envuelve" { symbolTable.addSymbol(yytext(), "WHILE", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("WHILE", yytext(), yyline, yycolumn)); return symbol(sym.WHILE); }
<YYINITIAL> "duende" { symbolTable.addSymbol(yytext(), "FOR", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("FOR", yytext(), yyline, yycolumn)); return symbol(sym.FOR); }
<YYINITIAL> "varios" { symbolTable.addSymbol(yytext(), "SWITCH", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("SWITCH", yytext(), yyline, yycolumn)); return symbol(sym.SWITCH); }
<YYINITIAL> "historia" { symbolTable.addSymbol(yytext(), "CASE", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("CASE", yytext(), yyline, yycolumn)); return symbol(sym.CASE); }
<YYINITIAL> "ultimo" { symbolTable.addSymbol(yytext(), "DEFAULT", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("DEFAULT", yytext(), yyline, yycolumn)); return symbol(sym.DEFAULT); }
<YYINITIAL> "corta" { symbolTable.addSymbol(yytext(), "BREAK", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("BREAK", yytext(), yyline, yycolumn)); return symbol(sym.BREAK); }
<YYINITIAL> "envia" { symbolTable.addSymbol(yytext(), "RETURN", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("RETURN", yytext(), yyline, yycolumn)); return symbol(sym.RETURN); }
<YYINITIAL> "sigue" { symbolTable.addSymbol(yytext(), "DOS_PUNTOS", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("DOS_PUNTOS", yytext(), yyline, yycolumn)); return symbol(sym.DOS_PUNTOS); }

/* Símbolos de estructura */
<YYINITIAL> "," { symbolTable.addSymbol(yytext(), "COMA", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("COMA", yytext(), yyline, yycolumn)); return symbol(sym.COMA); }
<YYINITIAL> ";" { symbolTable.addSymbol(yytext(), "PUNTO_COMA", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("PUNTO_COMA", yytext(), yyline, yycolumn)); return symbol(sym.PUNTO_COMA); }
<YYINITIAL> "-" { symbolTable.addSymbol(yytext(), "NEGATIVO", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("NEGATIVO", yytext(), yyline, yycolumn)); return symbol(sym.NEGATIVO); }

<YYINITIAL> "abrecuento" { symbolTable.addSymbol(yytext(), "BLOQUE_A", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("BLOQUE_A", yytext(), yyline, yycolumn)); return symbol(sym.BLOQUE_A); }
<YYINITIAL> "cierracuento" { symbolTable.addSymbol(yytext(), "BLOQUE_C", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("BLOQUE_C", yytext(), yyline, yycolumn)); return symbol(sym.BLOQUE_C); }

<YYINITIAL> "abreempaque" { symbolTable.addSymbol(yytext(), "CORCHETE_A", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("CORCHETE_A", yytext(), yyline, yycolumn)); return symbol(sym.CORCHETE_A); }
<YYINITIAL> "cierraempaque" { symbolTable.addSymbol(yytext(), "CORCHETE_C", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("CORCHETE_C", yytext(), yyline, yycolumn)); return symbol(sym.CORCHETE_C); }

<YYINITIAL> "abreregalo" { symbolTable.addSymbol(yytext(), "PARENTESIS_A", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("PARENTESIS_A", yytext(), yyline, yycolumn)); return symbol(sym.PARENTESIS_A); }
<YYINITIAL> "cierraregalo" { symbolTable.addSymbol(yytext(), "PARENTESIS_C", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("PARENTESIS_C", yytext(), yyline, yycolumn)); return symbol(sym.PARENTESIS_C); }

<YYINITIAL> "entrega" { symbolTable.addSymbol(yytext(), "ASIGNACION", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("ASIGNACION", yytext(), yyline, yycolumn)); return symbol(sym.ASIGNACION); }

<YYINITIAL> "finregalo" { symbolTable.addSymbol(yytext(), "DELIMITADOR", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("DELIMITADOR", yytext(), yyline, yycolumn)); return symbol(sym.DELIMITADOR); }

/* Operaciones de lectura */
<YYINITIAL> "narra" { symbolTable.addSymbol(yytext(), "PRINT", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("PRINT", yytext(), yyline, yycolumn)); return symbol(sym.PRINT); }
<YYINITIAL> "escucha" { symbolTable.addSymbol(yytext(), "READ", yyline + 1, yycolumn + 1, null); tokensTable.addToken(new Token("READ", yytext(), yyline, yycolumn)); return symbol(sym.READ); }

/* Ignorar */
"\\_"(.|[ \t\f\r\n]+)*"_/" { /* Ignore */ } // Comentario multilínea
"#".* {/*Ignore*/} // Comentario línea
{espacio} {/*Ignore*/} // Espacios, tabs, saltos de línea...

[^] {
        throw new Error("\nCadena ilegal <" + yytext() + ">\nLínea: " + (yyline+1) + "\nColumna: " + (yycolumn+1));
    }
