// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/main/jflex/LexerCup.flex

package jflex;

import java_cup.runtime.*;
import java.lang.String;

import cup.sym;

import tokens.Token;
import tokens.TokenTable;


@SuppressWarnings("fallthrough")
public class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\5\22\0\1\1"+
    "\1\0\1\6\1\7\3\0\1\10\4\0\1\11\1\12"+
    "\1\0\1\13\12\14\1\0\1\15\5\0\1\16\3\17"+
    "\1\20\1\21\5\17\1\22\5\17\1\23\1\24\1\25"+
    "\1\26\5\17\1\0\1\27\2\0\1\30\1\0\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\2\17\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
    "\12\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\1\1\2\1\1\1\3\1\4"+
    "\1\5\1\6\26\1\1\0\1\7\1\0\1\10\50\0"+
    "\1\10\1\11\3\0\1\12\47\0\1\13\1\14\12\0"+
    "\1\15\11\0\1\16\3\0\1\17\13\0\1\13\14\0"+
    "\1\20\3\0\1\21\10\0\1\22\2\0\1\23\3\0"+
    "\1\24\1\25\1\0\1\26\15\0\1\27\1\30\1\31"+
    "\5\0\1\32\1\33\11\0\1\34\1\35\1\0\1\36"+
    "\12\0\1\37\1\0\1\40\4\0\1\41\1\42\1\43"+
    "\2\0\1\44\1\0\1\45\1\46\3\0\1\47\1\50"+
    "\1\51\3\0\1\52\2\0\1\53\2\0\1\54\1\55"+
    "\6\0\1\56\1\57\2\0\1\60\1\0\1\61\4\0"+
    "\1\62\1\63\3\0\1\64\1\65\1\0\1\66\1\67";

  private static int [] zzUnpackAction() {
    int [] result = new int[304];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\142\0\223\0\304\0\365\0\u0126"+
    "\0\142\0\142\0\u0157\0\142\0\u0188\0\u01b9\0\u01ea\0\u021b"+
    "\0\u024c\0\u027d\0\u02ae\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3"+
    "\0\u03d4\0\u0405\0\u0436\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b"+
    "\0\u055c\0\u058d\0\304\0\304\0\u05be\0\u05be\0\u05ef\0\u0620"+
    "\0\u0651\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746\0\u0777\0\u07a8"+
    "\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930"+
    "\0\u0961\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8"+
    "\0\u0ae9\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f\0\u0c40"+
    "\0\u0c71\0\u0ca2\0\u0cd3\0\u0d04\0\u0d35\0\u0d66\0\142\0\u05ef"+
    "\0\u0d97\0\u0dc8\0\u0df9\0\u06b3\0\u0e2a\0\u0e5b\0\u0e8c\0\u0ebd"+
    "\0\u0eee\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2\0\u0fe3\0\u1014\0\u1045"+
    "\0\u1076\0\u10a7\0\u10d8\0\u1109\0\u113a\0\u116b\0\u119c\0\u11cd"+
    "\0\u11fe\0\u122f\0\u1260\0\u1291\0\u12c2\0\u12f3\0\u1324\0\u1355"+
    "\0\u1386\0\u13b7\0\u13e8\0\u1419\0\u144a\0\u147b\0\u14ac\0\u14dd"+
    "\0\u150e\0\u153f\0\u1570\0\142\0\u0682\0\u15a1\0\u15d2\0\u1603"+
    "\0\u1634\0\u1665\0\u1696\0\u16c7\0\u16f8\0\u1729\0\u175a\0\142"+
    "\0\u178b\0\u17bc\0\u17ed\0\u181e\0\u184f\0\u1880\0\u18b1\0\u18e2"+
    "\0\u1913\0\142\0\u1944\0\u1975\0\u19a6\0\142\0\u19d7\0\u1a08"+
    "\0\u1a39\0\u1a6a\0\u1a9b\0\u1acc\0\u1afd\0\u1b2e\0\u1b5f\0\u1b90"+
    "\0\u1bc1\0\u1bf2\0\u1c23\0\u1c54\0\u1c85\0\u1cb6\0\u1ce7\0\u1d18"+
    "\0\u1d49\0\u1d7a\0\u1dab\0\u1ddc\0\u1e0d\0\u1e3e\0\142\0\u1e6f"+
    "\0\u1ea0\0\u1ed1\0\142\0\u1f02\0\u1f33\0\u1f64\0\u1f95\0\u1fc6"+
    "\0\u1ff7\0\u2028\0\u2059\0\142\0\u208a\0\u20bb\0\142\0\u20ec"+
    "\0\u211d\0\u214e\0\142\0\142\0\u217f\0\142\0\u21b0\0\u21e1"+
    "\0\u2212\0\u2243\0\u2274\0\u22a5\0\u22d6\0\u2307\0\u2338\0\u2369"+
    "\0\u239a\0\u23cb\0\u23fc\0\142\0\142\0\142\0\u242d\0\u245e"+
    "\0\u248f\0\u24c0\0\u24f1\0\142\0\142\0\u2522\0\u2553\0\u2584"+
    "\0\u25b5\0\u25e6\0\u2617\0\u2648\0\u2679\0\u26aa\0\142\0\142"+
    "\0\u26db\0\142\0\u270c\0\u273d\0\u276e\0\u279f\0\u27d0\0\u2801"+
    "\0\u2832\0\u2863\0\u2894\0\u28c5\0\142\0\u28f6\0\142\0\u2927"+
    "\0\u2958\0\u2989\0\u29ba\0\142\0\142\0\142\0\u29eb\0\u2a1c"+
    "\0\142\0\u2a4d\0\142\0\u06b3\0\u2a7e\0\u2aaf\0\u2ae0\0\142"+
    "\0\142\0\142\0\u2b11\0\u2b42\0\u2b73\0\142\0\u2ba4\0\u2bd5"+
    "\0\142\0\u2c06\0\u2c37\0\142\0\142\0\u2c68\0\u2c99\0\u2cca"+
    "\0\u2cfb\0\u2d2c\0\u2d5d\0\142\0\142\0\u2d8e\0\u2dbf\0\142"+
    "\0\u2df0\0\142\0\u2e21\0\u2e52\0\u2e83\0\u2eb4\0\142\0\142"+
    "\0\u2ee5\0\u2f16\0\u2f47\0\142\0\142\0\u2f78\0\142\0\142";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[304];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\3\1\13\1\14\3\3\1\15\3\3"+
    "\1\16\1\3\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\3\1\32\1\33"+
    "\1\34\1\3\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\5\3\2\4\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\3\3\1\13\12\3\1\17\31\3\63\0\1\4\56\0"+
    "\2\43\4\0\1\44\52\43\2\7\4\0\53\7\2\45"+
    "\4\0\2\45\1\46\50\45\2\47\4\0\6\47\1\13"+
    "\44\47\16\0\1\50\65\0\1\51\65\0\1\52\44\0"+
    "\1\53\1\0\11\53\2\0\23\53\1\54\4\53\32\0"+
    "\1\55\1\0\1\56\55\0\1\57\16\0\1\60\51\0"+
    "\1\61\3\0\1\62\5\0\1\63\60\0\1\64\47\0"+
    "\1\65\1\0\1\66\4\0\1\67\2\0\1\70\35\0"+
    "\1\71\7\0\1\72\50\0\1\73\16\0\1\74\41\0"+
    "\1\75\7\0\1\76\63\0\1\77\45\0\1\100\3\0"+
    "\1\101\3\0\1\102\50\0\1\103\13\0\1\104\61\0"+
    "\1\105\65\0\1\106\42\0\1\107\7\0\1\110\54\0"+
    "\1\111\2\0\1\112\64\0\1\113\52\0\1\114\3\0"+
    "\1\115\43\0\1\116\37\0\1\117\64\0\1\120\66\0"+
    "\1\121\64\0\1\122\32\0\3\52\1\0\24\52\1\123"+
    "\30\52\14\0\1\53\1\0\11\53\1\0\1\124\30\53"+
    "\14\0\1\53\1\0\11\53\1\0\1\124\4\53\1\125"+
    "\23\53\50\0\1\126\64\0\1\127\46\0\1\130\63\0"+
    "\1\131\50\0\1\132\66\0\1\133\4\0\1\134\56\0"+
    "\1\135\47\0\1\136\61\0\1\137\74\0\1\140\1\0"+
    "\1\141\37\0\1\142\62\0\1\143\65\0\1\144\62\0"+
    "\1\145\65\0\1\146\50\0\1\147\53\0\1\150\75\0"+
    "\1\151\61\0\1\152\45\0\1\153\10\0\1\154\52\0"+
    "\1\155\62\0\1\156\64\0\1\157\3\0\1\160\37\0"+
    "\1\161\62\0\1\162\64\0\1\163\76\0\1\164\35\0"+
    "\1\165\63\0\1\166\66\0\1\167\66\0\1\170\57\0"+
    "\1\171\37\0\1\172\77\0\1\173\34\0\1\122\54\0"+
    "\1\174\40\0\3\52\1\0\7\52\1\175\14\52\1\123"+
    "\30\52\14\0\1\53\1\0\11\53\1\0\1\124\17\53"+
    "\1\176\10\53\35\0\1\177\64\0\1\200\71\0\1\201"+
    "\51\0\1\202\65\0\1\203\45\0\1\204\75\0\1\205"+
    "\47\0\1\206\63\0\1\207\61\0\1\210\63\0\1\211"+
    "\51\0\1\212\11\0\1\213\60\0\1\214\55\0\1\215"+
    "\61\0\1\216\57\0\1\217\56\0\1\220\56\0\1\221"+
    "\45\0\1\222\101\0\1\223\43\0\1\224\70\0\1\225"+
    "\72\0\1\226\34\0\1\227\76\0\1\230\57\0\1\231"+
    "\51\0\1\232\57\0\1\233\64\0\1\234\51\0\1\235"+
    "\60\0\1\236\70\0\1\237\66\0\1\240\62\0\1\241"+
    "\40\0\1\242\64\0\1\243\71\0\1\244\47\0\1\245"+
    "\33\0\1\53\1\0\11\53\1\0\1\124\1\246\27\53"+
    "\33\0\1\247\1\0\1\250\12\0\1\251\45\0\1\252"+
    "\54\0\1\253\70\0\1\254\67\0\1\255\62\0\1\256"+
    "\37\0\1\257\63\0\1\260\60\0\1\261\61\0\1\262"+
    "\54\0\1\263\64\0\1\264\56\0\1\265\64\0\1\266"+
    "\56\0\1\174\60\0\1\267\54\0\1\270\62\0\1\271"+
    "\72\0\1\272\63\0\1\273\61\0\1\274\47\0\1\275"+
    "\72\0\1\276\37\0\1\277\63\0\1\300\61\0\1\301"+
    "\74\0\1\302\53\0\1\303\65\0\1\304\51\0\1\305"+
    "\53\0\1\306\55\0\1\307\72\0\1\310\57\0\1\311"+
    "\65\0\1\312\55\0\1\313\27\0\1\53\1\0\11\53"+
    "\1\0\1\124\13\53\1\314\14\53\53\0\1\315\50\0"+
    "\1\316\52\0\1\317\67\0\1\320\74\0\1\321\51\0"+
    "\1\322\40\0\1\323\60\0\1\324\74\0\1\325\50\0"+
    "\1\326\62\0\1\327\63\0\1\330\56\0\1\331\70\0"+
    "\1\332\47\0\1\333\71\0\1\334\50\0\1\335\70\0"+
    "\1\336\43\0\1\337\72\0\1\340\54\0\1\341\50\0"+
    "\1\342\61\0\1\343\70\0\1\344\54\0\1\345\53\0"+
    "\1\346\74\0\1\347\60\0\1\350\50\0\1\351\74\0"+
    "\1\352\23\0\1\53\1\0\11\53\1\0\1\124\14\53"+
    "\1\353\13\53\35\0\1\354\71\0\1\355\51\0\1\356"+
    "\73\0\1\357\37\0\1\360\101\0\1\361\41\0\1\362"+
    "\1\0\1\363\12\0\1\364\41\0\1\365\103\0\1\366"+
    "\35\0\1\367\64\0\1\370\54\0\1\371\70\0\1\372"+
    "\50\0\1\373\77\0\1\374\66\0\1\375\36\0\1\376"+
    "\77\0\1\377\36\0\1\u0100\74\0\1\u0101\55\0\1\u0102"+
    "\53\0\1\u0103\37\0\1\53\1\0\11\53\1\0\1\u0104"+
    "\30\53\44\0\1\u0105\45\0\1\u0106\60\0\1\u0107\74\0"+
    "\1\u0108\63\0\1\u0109\41\0\1\u010a\102\0\1\u010b\50\0"+
    "\1\u010c\52\0\1\u010d\60\0\1\u010e\60\0\1\u010f\65\0"+
    "\1\u0110\47\0\1\u0111\72\0\1\u0112\52\0\1\u0113\60\0"+
    "\1\u0114\65\0\1\u0115\70\0\1\u0116\55\0\1\u0117\53\0"+
    "\1\u0118\53\0\1\u0119\71\0\1\u011a\51\0\1\u011b\65\0"+
    "\1\u011c\61\0\1\u011d\45\0\1\u011e\72\0\1\u011f\61\0"+
    "\1\u0120\66\0\1\u0121\52\0\1\u0122\57\0\1\u0123\45\0"+
    "\1\u0124\60\0\1\u0125\70\0\1\u0126\50\0\1\u0127\64\0"+
    "\1\u0128\75\0\1\u0129\55\0\1\u012a\53\0\1\u012b\63\0"+
    "\1\u012c\60\0\1\u012d\66\0\1\u012e\52\0\1\u012f\50\0"+
    "\1\u0130\23\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[12201];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\4\1\2\11\1\1\1\11\26\1\1\0"+
    "\1\1\1\0\1\1\50\0\1\11\1\1\3\0\1\1"+
    "\47\0\1\11\1\1\12\0\1\11\11\0\1\11\3\0"+
    "\1\11\13\0\1\1\14\0\1\11\3\0\1\11\10\0"+
    "\1\11\2\0\1\11\3\0\2\11\1\0\1\11\15\0"+
    "\3\11\5\0\2\11\11\0\2\11\1\0\1\11\12\0"+
    "\1\11\1\0\1\11\4\0\3\11\2\0\1\11\1\0"+
    "\1\11\1\1\3\0\3\11\3\0\1\11\2\0\1\11"+
    "\2\0\2\11\6\0\2\11\2\0\1\11\1\0\1\11"+
    "\4\0\2\11\3\0\2\11\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[304];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new Error("\nCadena ilegal <" + yytext() + ">\nLínea: " + (yyline+1) + "\nColumna: " + (yycolumn+1));
            }
          // fall through
          case 56: break;
          case 2:
            { /*Ignore*/
            }
          // fall through
          case 57: break;
          case 3:
            { tokensTable.addToken(new Token("COMA", yytext(), yyline, yycolumn)); return symbol(sym.COMA);
            }
          // fall through
          case 58: break;
          case 4:
            { tokensTable.addToken(new Token("NEGATIVO", yytext(), yyline, yycolumn)); return symbol(sym.NEGATIVO);
            }
          // fall through
          case 59: break;
          case 5:
            { tokensTable.addToken(new Token("LIT_INTEGER", yytext(), yyline, yycolumn)); return symbol(sym.LIT_INTEGER);
            }
          // fall through
          case 60: break;
          case 6:
            { tokensTable.addToken(new Token("PUNTO_COMA", yytext(), yyline, yycolumn)); return symbol(sym.PUNTO_COMA);
            }
          // fall through
          case 61: break;
          case 7:
            { tokensTable.addToken(new Token("LIT_STRING", yytext(), yyline, yycolumn)); return symbol(sym.LIT_STRING);
            }
          // fall through
          case 62: break;
          case 8:
            { tokensTable.addToken(new Token("LIT_CHAR", yytext(), yyline, yycolumn)); return symbol(sym.LIT_CHAR);
            }
          // fall through
          case 63: break;
          case 9:
            { tokensTable.addToken(new Token("LIT_FLOAT", yytext(), yyline, yycolumn)); return symbol(sym.LIT_FLOAT);
            }
          // fall through
          case 64: break;
          case 10:
            { tokensTable.addToken(new Token("IDENTIFICADOR", yytext(), yyline, yycolumn)); return symbol(sym.IDENTIFICADOR);
            }
          // fall through
          case 65: break;
          case 11:
            { tokensTable.addToken(new Token("LIT_BOOL", yytext(), yyline, yycolumn)); return symbol(sym.LIT_BOOL);
            }
          // fall through
          case 66: break;
          case 12:
            { /* Ignore */
            }
          // fall through
          case 67: break;
          case 13:
            { tokensTable.addToken(new Token("IF", yytext(), yyline, yycolumn)); return symbol(sym.IF);
            }
          // fall through
          case 68: break;
          case 14:
            { tokensTable.addToken(new Token("ELSE", yytext(), yyline, yycolumn)); return symbol(sym.ELSE);
            }
          // fall through
          case 69: break;
          case 15:
            { tokensTable.addToken(new Token("IGUALDAD", yytext(), yyline, yycolumn)); return symbol(sym.IGUALDAD);
            }
          // fall through
          case 70: break;
          case 16:
            { tokensTable.addToken(new Token("BREAK", yytext(), yyline, yycolumn)); return symbol(sym.BREAK);
            }
          // fall through
          case 71: break;
          case 17:
            { tokensTable.addToken(new Token("RETURN", yytext(), yyline, yycolumn)); return symbol(sym.RETURN);
            }
          // fall through
          case 72: break;
          case 18:
            { tokensTable.addToken(new Token("MODULO", yytext(), yyline, yycolumn)); return symbol(sym.MODULO);
            }
          // fall through
          case 73: break;
          case 19:
            { tokensTable.addToken(new Token("PRINT", yytext(), yyline, yycolumn)); return symbol(sym.PRINT);
            }
          // fall through
          case 74: break;
          case 20:
            { tokensTable.addToken(new Token("INCREMENTO", yytext(), yyline, yycolumn)); return symbol(sym.INCREMENTO);
            }
          // fall through
          case 75: break;
          case 21:
            { tokensTable.addToken(new Token("DIVISION", yytext(), yyline, yycolumn)); return symbol(sym.DIVISION);
            }
          // fall through
          case 76: break;
          case 22:
            { tokensTable.addToken(new Token("DOS_PUNTOS", yytext(), yyline, yycolumn)); return symbol(sym.DOS_PUNTOS);
            }
          // fall through
          case 77: break;
          case 23:
            { tokensTable.addToken(new Token("STRING", yytext(), yyline, yycolumn)); return symbol(sym.STRING);
            }
          // fall through
          case 78: break;
          case 24:
            { tokensTable.addToken(new Token("CHAR", yytext(), yyline, yycolumn)); return symbol(sym.CHAR);
            }
          // fall through
          case 79: break;
          case 25:
            { tokensTable.addToken(new Token("FOR", yytext(), yyline, yycolumn)); return symbol(sym.FOR);
            }
          // fall through
          case 80: break;
          case 26:
            { tokensTable.addToken(new Token("DISYUNCION", yytext(), yyline, yycolumn)); return symbol(sym.DISYUNCION);
            }
          // fall through
          case 81: break;
          case 27:
            { tokensTable.addToken(new Token("DECREMENTO", yytext(), yyline, yycolumn)); return symbol(sym.DECREMENTO);
            }
          // fall through
          case 82: break;
          case 28:
            { tokensTable.addToken(new Token("BOOL", yytext(), yyline, yycolumn)); return symbol(sym.BOOL);
            }
          // fall through
          case 83: break;
          case 29:
            { tokensTable.addToken(new Token("DEFAULT", yytext(), yyline, yycolumn)); return symbol(sym.DEFAULT);
            }
          // fall through
          case 84: break;
          case 30:
            { tokensTable.addToken(new Token("SWITCH", yytext(), yyline, yycolumn)); return symbol(sym.SWITCH);
            }
          // fall through
          case 85: break;
          case 31:
            { tokensTable.addToken(new Token("ASIGNACION", yytext(), yyline, yycolumn)); return symbol(sym.ASIGNACION);
            }
          // fall through
          case 86: break;
          case 32:
            { tokensTable.addToken(new Token("READ", yytext(), yyline, yycolumn)); return symbol(sym.READ);
            }
          // fall through
          case 87: break;
          case 33:
            { tokensTable.addToken(new Token("CONJUNCION", yytext(), yyline, yycolumn)); return symbol(sym.CONJUNCION);
            }
          // fall through
          case 88: break;
          case 34:
            { tokensTable.addToken(new Token("MAYOR", yytext(), yyline, yycolumn)); return symbol(sym.MAYOR);
            }
          // fall through
          case 89: break;
          case 35:
            { tokensTable.addToken(new Token("SUMA", yytext(), yyline, yycolumn)); return symbol(sym.SUMA);
            }
          // fall through
          case 90: break;
          case 36:
            { tokensTable.addToken(new Token("INTEGER", yytext(), yyline, yycolumn)); return symbol(sym.INTEGER);
            }
          // fall through
          case 91: break;
          case 37:
            { tokensTable.addToken(new Token("MAYOR_IGUAL", yytext(), yyline, yycolumn)); return symbol(sym.MAYOR_IGUAL);
            }
          // fall through
          case 92: break;
          case 38:
            { tokensTable.addToken(new Token("MAIN", yytext(), yyline, yycolumn)); return symbol(sym.MAIN);
            }
          // fall through
          case 93: break;
          case 39:
            { tokensTable.addToken(new Token("POTENCIA", yytext(), yyline, yycolumn)); return symbol(sym.POTENCIA);
            }
          // fall through
          case 94: break;
          case 40:
            { tokensTable.addToken(new Token("NEGACION", yytext(), yyline, yycolumn)); return symbol(sym.NEGACION);
            }
          // fall through
          case 95: break;
          case 41:
            { tokensTable.addToken(new Token("FLOAT", yytext(), yyline, yycolumn)); return symbol(sym.FLOAT);
            }
          // fall through
          case 96: break;
          case 42:
            { tokensTable.addToken(new Token("WHILE", yytext(), yyline, yycolumn)); return symbol(sym.WHILE);
            }
          // fall through
          case 97: break;
          case 43:
            { tokensTable.addToken(new Token("CASE", yytext(), yyline, yycolumn)); return symbol(sym.CASE);
            }
          // fall through
          case 98: break;
          case 44:
            { tokensTable.addToken(new Token("DIFERENTE", yytext(), yyline, yycolumn)); return symbol(sym.DIFERENTE);
            }
          // fall through
          case 99: break;
          case 45:
            { tokensTable.addToken(new Token("MENOR", yytext(), yyline, yycolumn)); return symbol(sym.MENOR);
            }
          // fall through
          case 100: break;
          case 46:
            { tokensTable.addToken(new Token("MENOR_IGUAL", yytext(), yyline, yycolumn)); return symbol(sym.MENOR_IGUAL);
            }
          // fall through
          case 101: break;
          case 47:
            { tokensTable.addToken(new Token("DELIMITADOR", yytext(), yyline, yycolumn)); return symbol(sym.DELIMITADOR);
            }
          // fall through
          case 102: break;
          case 48:
            { tokensTable.addToken(new Token("BLOQUE_A", yytext(), yyline, yycolumn)); return symbol(sym.BLOQUE_A);
            }
          // fall through
          case 103: break;
          case 49:
            { tokensTable.addToken(new Token("PARENTESIS_A", yytext(), yyline, yycolumn)); return symbol(sym.PARENTESIS_A);
            }
          // fall through
          case 104: break;
          case 50:
            { tokensTable.addToken(new Token("MULTIPLICACION", yytext(), yyline, yycolumn)); return symbol(sym.MULTIPLICACION);
            }
          // fall through
          case 105: break;
          case 51:
            { tokensTable.addToken(new Token("CORCHETE_A", yytext(), yyline, yycolumn)); return symbol(sym.CORCHETE_A);
            }
          // fall through
          case 106: break;
          case 52:
            { tokensTable.addToken(new Token("RESTA", yytext(), yyline, yycolumn)); return symbol(sym.RESTA);
            }
          // fall through
          case 107: break;
          case 53:
            { tokensTable.addToken(new Token("BLOQUE_C", yytext(), yyline, yycolumn)); return symbol(sym.BLOQUE_C);
            }
          // fall through
          case 108: break;
          case 54:
            { tokensTable.addToken(new Token("PARENTESIS_C", yytext(), yyline, yycolumn)); return symbol(sym.PARENTESIS_C);
            }
          // fall through
          case 109: break;
          case 55:
            { tokensTable.addToken(new Token("CORCHETE_C", yytext(), yyline, yycolumn)); return symbol(sym.CORCHETE_C);
            }
          // fall through
          case 110: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
