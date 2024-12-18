package jflex;

import java_cup.runtime.*;
import java.lang.String;

import cup.sym;

import tokens.Token;
import tokens.TokenTable;

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

    public TokenTable tokensTable = new TokenTable();

    public TokenTable getTokenTable(){
        return this.tokensTable;
    };
%}

letra=[a-zA-Z_]
digito=[0-9]
espacio=[ \t\n]
saltoDeLinea=[\n] // No funciona

%state STRING

%%
// NECESARIO REVISARLAS

/* Generales */
{espacio} {/*Ignore*/}
{saltoDeLinea} {/*Ignore*/} // No funciona
{digito}+ { tokensTable.addToken(new Token("LIT_ENTERO", yytext(), yyline, yycolumn)); return symbol(sym.LIT_ENTERO); }
{digito}+.{digito}+ { tokensTable.addToken(new Token("LIT_DECIMAL", yytext(), yyline, yycolumn)); return symbol(sym.LIT_DECIMAL); }
<YYINITIAL> "_verano_" { tokensTable.addToken(new Token("MAIN", yytext(), yyline, yycolumn)); return symbol(sym.MAIN); }
<YYINITIAL> "_"({letra}|{digito}|_)+"_" { tokensTable.addToken(new Token("IDENTIFICADOR", yytext(), yyline, yycolumn)); return symbol(sym.IDENTIFICADOR); }

/* Tipos */
<YYINITIAL> "rodolfo" { tokensTable.addToken(new Token("INTEGER", yytext(), yyline, yycolumn)); return symbol(sym.INTEGER); }
<YYINITIAL> "bromista" { tokensTable.addToken(new Token("FLOAT", yytext(), yyline, yycolumn)); return symbol(sym.FLOAT); }
<YYINITIAL> "trueno" { tokensTable.addToken(new Token("BOOL", yytext(), yyline, yycolumn)); return symbol(sym.BOOL); }
<YYINITIAL> "cupido" { tokensTable.addToken(new Token("CHAR", yytext(), yyline, yycolumn)); return symbol(sym.CHAR); }
<YYINITIAL> "cometa" { tokensTable.addToken(new Token("STRING", yytext(), yyline, yycolumn)); return symbol(sym.STRING); }

/* Estructura */
<YYINITIAL> "#" { tokensTable.addToken(new Token("COMENTARIO_LINEA", yytext(), yyline, yycolumn)); return symbol(sym.COMENTARIO_LINEA); }
<YYINITIAL> "\__/" { tokensTable.addToken(new Token("COMENTARIO_VARIAS_LINEAS", yytext(), yyline, yycolumn)); return symbol(sym.COMENTARIO_VARIAS_LINEAS); }

/* Estructura */
<YYINITIAL> "abrecuento" { tokensTable.addToken(new Token("BLOQUE_A", yytext(), yyline, yycolumn)); return symbol(sym.BLOQUE_A); }
<YYINITIAL> "cierracuento" { tokensTable.addToken(new Token("BLOQUE_C", yytext(), yyline, yycolumn)); return symbol(sym.BLOQUE_C); }


/* Simbolos */
<YYINITIAL> "abreempaque" { tokensTable.addToken(new Token("CORCHETE_A", yytext(), yyline, yycolumn)); return symbol(sym.CORCHETE_A); }
<YYINITIAL> "cierraempaque" { tokensTable.addToken(new Token("CORCHETE_C", yytext(), yyline, yycolumn)); return symbol(sym.CORCHETE_C); }

<YYINITIAL> "abreregalo" { tokensTable.addToken(new Token("PARENTESIS_A", yytext(), yyline, yycolumn)); return symbol(sym.PARENTESIS_A); }
<YYINITIAL> "cierraregalo" { tokensTable.addToken(new Token("PARENTESIS_C", yytext(), yyline, yycolumn)); return symbol(sym.PARENTESIS_C); }

<YYINITIAL> "entrega" { tokensTable.addToken(new Token("ASIGNACION", yytext(), yyline, yycolumn)); return symbol(sym.ASIGNACION); }

<YYINITIAL> "finregalo" { tokensTable.addToken(new Token("DELIMITADOR", yytext(), yyline, yycolumn)); return symbol(sym.DELIMITADOR); }

/* Operadores aritmeticos */
<YYINITIAL> "navidad" { tokensTable.addToken(new Token("SUMA", yytext(), yyline, yycolumn)); return symbol(sym.SUMA); }
<YYINITIAL> "intercambio" { tokensTable.addToken(new Token("RESTA", yytext(), yyline, yycolumn)); return symbol(sym.RESTA); }
<YYINITIAL> "reyes" { tokensTable.addToken(new Token("DIVISION", yytext(), yyline, yycolumn)); return symbol(sym.DIVISION); }
<YYINITIAL> "nochebuena" { tokensTable.addToken(new Token("MULTIPLICACION", yytext(), yyline, yycolumn)); return symbol(sym.MULTIPLICACION); }
<YYINITIAL> "magos" { tokensTable.addToken(new Token("MODULO", yytext(), yyline, yycolumn)); return symbol(sym.MODULO); }
<YYINITIAL> "adviento" { tokensTable.addToken(new Token("POTENCIA", yytext(), yyline, yycolumn)); return symbol(sym.POTENCIA); }
<YYINITIAL> "quien" { tokensTable.addToken(new Token("INCREMENTO", yytext(), yyline, yycolumn)); return symbol(sym.INCREMENTO); }
<YYINITIAL> "grinch" { tokensTable.addToken(new Token("DECREMENTO", yytext(), yyline, yycolumn)); return symbol(sym.DECREMENTO); }

/* Operadores relacionales */
<YYINITIAL> "snowball" { tokensTable.addToken(new Token("MENOR", yytext(), yyline, yycolumn)); return symbol(sym.MENOR); }
<YYINITIAL> "evergreen" { tokensTable.addToken(new Token("MENOR_IGUAL", yytext(), yyline, yycolumn)); return symbol(sym.MENOR_IGUAL); }
<YYINITIAL> "minstix" { tokensTable.addToken(new Token("MAYOR", yytext(), yyline, yycolumn)); return symbol(sym.MAYOR); }
<YYINITIAL> "upatree" { tokensTable.addToken(new Token("MAYOR_IGUAL", yytext(), yyline, yycolumn)); return symbol(sym.MAYOR_IGUAL); }
<YYINITIAL> "mary" { tokensTable.addToken(new Token("IGUALDAD", yytext(), yyline, yycolumn)); return symbol(sym.IGUALDAD); }
<YYINITIAL> "openslae" { tokensTable.addToken(new Token("DIFERENTE", yytext(), yyline, yycolumn)); return symbol(sym.DIFERENTE); }

/* Operadores logicos */
<YYINITIAL> "melchor" { tokensTable.addToken(new Token("CONJUNCION", yytext(), yyline, yycolumn)); return symbol(sym.CONJUNCION); }
<YYINITIAL> "gaspar" { tokensTable.addToken(new Token("DISYUNCION", yytext(), yyline, yycolumn)); return symbol(sym.DISYUNCION); }
<YYINITIAL> "baltazar" { tokensTable.addToken(new Token("NEGACION", yytext(), yyline, yycolumn)); return symbol(sym.NEGACION); }

/* Estructuras de control */
<YYINITIAL> "elfo" { tokensTable.addToken(new Token("IF", yytext(), yyline, yycolumn)); return symbol(sym.IF); }
<YYINITIAL> "hada" { tokensTable.addToken(new Token("ELSE", yytext(), yyline, yycolumn)); return symbol(sym.ELSE); }
<YYINITIAL> "envuelve" { tokensTable.addToken(new Token("WHILE", yytext(), yyline, yycolumn)); return symbol(sym.WHILE); }
<YYINITIAL> "duende" { tokensTable.addToken(new Token("FOR", yytext(), yyline, yycolumn)); return symbol(sym.FOR); }
<YYINITIAL> "varios" { tokensTable.addToken(new Token("SWITCH", yytext(), yyline, yycolumn)); return symbol(sym.SWITCH); }
<YYINITIAL> "historia" { tokensTable.addToken(new Token("CASE", yytext(), yyline, yycolumn)); return symbol(sym.CASE); }
<YYINITIAL> "ultimo" { tokensTable.addToken(new Token("DEFAULT", yytext(), yyline, yycolumn)); return symbol(sym.DEFAULT); }
<YYINITIAL> "corta" { tokensTable.addToken(new Token("BREAK", yytext(), yyline, yycolumn)); return symbol(sym.BREAK); }
<YYINITIAL> "envia" { tokensTable.addToken(new Token("RETURN", yytext(), yyline, yycolumn)); return symbol(sym.RETURN); }
<YYINITIAL> "sigue" { tokensTable.addToken(new Token("DOS_PUNTOS", yytext(), yyline, yycolumn)); return symbol(sym.DOS_PUNTOS); }

/* Operaciones de lectura */
<YYINITIAL> "narra" { tokensTable.addToken(new Token("PRINT", yytext(), yyline, yycolumn)); return symbol(sym.PRINT); }
<YYINITIAL> "escucha" { tokensTable.addToken(new Token("READ", yytext(), yyline, yycolumn)); return symbol(sym.READ); }

[^] {throw new Error("Cadena ilegal <" + yytext() + ">");}