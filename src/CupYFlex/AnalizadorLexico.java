/* The following code was generated by JFlex 1.6.1 */

package CupYFlex;
import java_cup.runtime.* ;
import java_cup.runtime.Symbol;
import CupYFlex.sym;
import java.util.ArrayList;
import Backend.Pintor.PintarPalabras;
/*--------------2 Declaraciones ------------*/


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Lexer.jflex</tt>
 */
public class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMENT_MULTI = 2;
  public static final int COMENT_SIMPLE = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\50\1\7\1\10\1\10\1\11\22\0\1\51\1\0\1\3"+
    "\1\40\1\0\2\0\1\37\1\32\1\33\1\44\1\43\1\47\1\5"+
    "\1\36\1\45\12\1\2\0\1\4\1\0\1\6\1\0\1\0\4\2"+
    "\1\12\12\2\1\21\12\2\1\34\1\0\1\35\1\46\1\0\1\0"+
    "\1\23\1\42\1\2\1\20\1\16\1\24\2\2\1\15\2\2\1\25"+
    "\1\41\1\17\1\26\1\21\1\2\1\30\1\22\1\14\1\31\1\27"+
    "\1\2\1\13\2\2\1\0\1\2\10\0\1\10\113\0\1\2\37\0"+
    "\1\2\u1f36\0\1\10\1\10\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\2\1\1\4\1\1\1\5"+
    "\5\3\1\6\1\7\1\10\1\11\1\1\1\12\1\13"+
    "\1\14\1\15\1\16\3\17\1\20\1\21\2\0\1\22"+
    "\1\23\5\3\4\0\1\24\1\0\1\25\5\3\1\26"+
    "\2\0\1\3\1\27\3\3\2\0\1\3\1\30\1\31"+
    "\1\3\2\0\2\3\2\0\2\3\1\0\1\32\1\3"+
    "\3\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[80];
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
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\u0126"+
    "\0\176\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c"+
    "\0\176\0\176\0\176\0\176\0\u0276\0\176\0\176\0\176"+
    "\0\176\0\176\0\u02a0\0\176\0\u02ca\0\176\0\176\0\u02f4"+
    "\0\u031e\0\176\0\176\0\u0348\0\u0372\0\u039c\0\u03c6\0\u03f0"+
    "\0\u041a\0\u0444\0\u046e\0\u0498\0\u02f4\0\u04c2\0\176\0\u04ec"+
    "\0\u0516\0\u0540\0\u056a\0\u0594\0\176\0\u05be\0\u05e8\0\u0612"+
    "\0\322\0\u063c\0\u0666\0\u0690\0\u06ba\0\u06e4\0\u070e\0\322"+
    "\0\322\0\u0738\0\u0762\0\u078c\0\u07b6\0\u07e0\0\u080a\0\u0834"+
    "\0\u085e\0\u0888\0\u08b2\0\322\0\u08dc\0\u0906\0\u0930\0\u095a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[80];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\0\1\13\1\14\1\6\1\15\1\6\1\14\2\6"+
    "\1\16\2\6\1\17\2\6\1\20\2\6\1\21\1\22"+
    "\1\23\1\24\1\4\1\25\1\4\2\6\1\26\1\27"+
    "\1\30\1\31\1\32\1\13\1\33\5\34\1\35\44\34"+
    "\7\36\1\37\2\0\40\36\53\0\1\5\34\0\1\40"+
    "\14\0\2\6\7\0\20\6\7\0\2\6\11\0\1\41"+
    "\7\0\20\41\7\0\2\41\14\0\1\42\52\0\1\43"+
    "\52\0\1\13\1\0\1\13\36\0\1\13\2\0\2\6"+
    "\7\0\1\6\1\44\16\6\7\0\2\6\10\0\2\6"+
    "\7\0\16\6\1\45\1\6\7\0\2\6\10\0\2\6"+
    "\7\0\3\6\1\46\14\6\7\0\2\6\10\0\2\6"+
    "\7\0\11\6\1\47\6\6\7\0\2\6\10\0\2\6"+
    "\7\0\4\6\1\50\13\6\7\0\2\6\10\0\1\51"+
    "\1\52\7\0\10\52\1\53\7\52\6\0\1\54\2\52"+
    "\60\0\1\33\6\0\1\37\44\0\1\55\52\0\1\56"+
    "\1\57\6\0\20\56\7\0\2\56\10\0\2\6\7\0"+
    "\2\6\1\60\15\6\7\0\2\6\10\0\2\6\7\0"+
    "\17\6\1\61\7\0\2\6\10\0\2\6\7\0\10\6"+
    "\1\62\7\6\7\0\2\6\10\0\2\6\7\0\13\6"+
    "\1\63\4\6\7\0\2\6\10\0\2\6\7\0\16\6"+
    "\1\64\1\6\7\0\2\6\10\0\1\51\35\0\1\65"+
    "\51\0\1\65\27\0\1\66\21\0\1\65\26\0\1\52"+
    "\2\0\1\52\34\0\1\67\1\57\6\0\20\67\7\0"+
    "\2\67\10\0\2\6\7\0\3\6\1\70\14\6\7\0"+
    "\2\6\10\0\2\6\7\0\4\6\1\71\13\6\7\0"+
    "\2\6\10\0\2\6\7\0\2\6\1\72\15\6\7\0"+
    "\2\6\10\0\2\6\7\0\10\6\1\73\7\6\7\0"+
    "\2\6\10\0\2\6\7\0\6\6\1\74\11\6\7\0"+
    "\2\6\50\0\1\75\12\0\1\76\1\57\6\0\20\76"+
    "\7\0\2\76\10\0\2\6\7\0\4\6\1\77\13\6"+
    "\7\0\2\6\10\0\2\6\7\0\11\6\1\100\6\6"+
    "\7\0\2\6\10\0\2\6\7\0\4\6\1\101\7\6"+
    "\1\101\3\6\7\0\2\6\10\0\2\6\7\0\11\6"+
    "\1\102\6\6\7\0\2\6\51\0\1\103\11\0\1\104"+
    "\1\57\6\0\20\104\7\0\2\104\10\0\2\6\7\0"+
    "\5\6\1\105\12\6\7\0\2\6\10\0\2\6\7\0"+
    "\6\6\1\106\11\6\7\0\2\6\35\0\1\107\25\0"+
    "\1\110\1\57\6\0\20\110\7\0\2\110\10\0\2\6"+
    "\7\0\6\6\1\111\11\6\7\0\2\6\10\0\2\6"+
    "\7\0\4\6\1\112\13\6\7\0\2\6\34\0\1\52"+
    "\26\0\1\113\1\57\6\0\20\113\7\0\2\113\10\0"+
    "\2\6\7\0\4\6\1\114\13\6\7\0\2\6\10\0"+
    "\2\6\7\0\16\6\1\115\1\6\7\0\2\6\11\0"+
    "\1\116\1\57\6\0\20\116\7\0\2\116\10\0\2\6"+
    "\7\0\14\6\1\71\3\6\7\0\2\6\11\0\1\117"+
    "\1\57\6\0\20\117\7\0\2\117\11\0\1\120\1\57"+
    "\6\0\20\120\7\0\2\120\12\0\1\57\46\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2436];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\4\1\1\11\7\1\4\11\1\1\5\11"+
    "\1\1\1\11\1\1\2\11\2\0\2\11\5\1\4\0"+
    "\1\1\1\0\1\11\5\1\1\11\2\0\5\1\2\0"+
    "\4\1\2\0\2\1\2\0\2\1\1\0\2\1\3\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[80];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    String cadena="";
    public PintarPalabras pintar = new PintarPalabras();

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type, Object value, int fila, int columna) {
        return new Symbol(type, yyline, yycolumn, value);}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 182) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
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
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
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
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
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
        // peek one character ahead if it is \n (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
            { System.out.println( "Caracter no reconocido: "+ yytext());
            }
          case 27: break;
          case 2: 
            { pintar.pintaMora(yychar,yylength()); System.out.println( "int"); return symbol(sym.ENTERO , yytext(), yyline, yycolumn);
            }
          case 28: break;
          case 3: 
            { pintar.pintaVerde(yychar,yylength()); System.out.println( "id"); return symbol(sym.IDENTIFICADOR , yytext(), yyline, yycolumn);
            }
          case 29: break;
          case 4: 
            { return symbol(sym.MENOS, yytext(), yyline, yycolumn);
            }
          case 30: break;
          case 5: 
            { /*IGNORAR*/
            }
          case 31: break;
          case 6: 
            { return symbol(sym.PARABRE, yytext(), yyline, yycolumn);
            }
          case 32: break;
          case 7: 
            { return symbol(sym.PARCIERRA, yytext(), yyline, yycolumn);
            }
          case 33: break;
          case 8: 
            { return symbol(sym.CORCHETEIZ, yytext(), yyline, yycolumn);
            }
          case 34: break;
          case 9: 
            { return symbol(sym.CORCHETEDER, yytext(), yyline, yycolumn);
            }
          case 35: break;
          case 10: 
            { return symbol(sym.SIMMAS, yytext(), yyline, yycolumn);
            }
          case 36: break;
          case 11: 
            { return symbol(sym.ASTERISCO, yytext(), yyline, yycolumn);
            }
          case 37: break;
          case 12: 
            { return symbol(sym.DIV, yytext(), yyline, yycolumn);
            }
          case 38: break;
          case 13: 
            { return symbol(sym.POT, yytext(), yyline, yycolumn);
            }
          case 39: break;
          case 14: 
            { return symbol(sym.COMA, yytext(), yyline, yycolumn);
            }
          case 40: break;
          case 15: 
            { 
            }
          case 41: break;
          case 16: 
            { pintar.pintaGris(yychar,yylength());
            }
          case 42: break;
          case 17: 
            { pintar.pintaGris(yychar,yylength()); yybegin(YYINITIAL);
            }
          case 43: break;
          case 18: 
            { yybegin(COMENT_MULTI);
            }
          case 44: break;
          case 19: 
            { yybegin(COMENT_SIMPLE);
            }
          case 45: break;
          case 20: 
            { pintar.pintaMora(yychar,yylength()); return symbol(sym.DECIMAL , yytext(), yyline, yycolumn);
            }
          case 46: break;
          case 21: 
            { pintar.pintaNara(yychar,yylength()); System.out.println( "cadena"); return symbol(sym.CADENA , yytext(), yyline, yycolumn);
            }
          case 47: break;
          case 22: 
            { pintar.pintaNara(yychar,yylength()); System.out.println( "char");return symbol(sym.CHAR , yytext(), yyline, yycolumn);
            }
          case 48: break;
          case 23: 
            { pintar.pintaAzul(yychar,yylength()); return symbol(sym.BOOLT, yytext(), yyline, yycolumn);
            }
          case 49: break;
          case 24: 
            { pintar.pintaAzul(yychar,yylength());  return symbol(sym.PISTA, yytext(), yyline, yycolumn);
            }
          case 50: break;
          case 25: 
            { pintar.pintaAzul(yychar,yylength()); return symbol(sym.BOOLF, yytext(), yyline, yycolumn);
            }
          case 51: break;
          case 26: 
            { pintar.pintaAzul(yychar,yylength()); return symbol(sym.EXTIENDE, yytext(), yyline, yycolumn);
            }
          case 52: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
