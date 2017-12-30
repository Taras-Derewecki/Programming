/* The following code was generated by JFlex 1.6.1 */

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 2000 Gerwin Klein <lsf@jflex.de>                          *
 * All rights reserved.                                                    *
 *                                                                         *
 * Thanks to Larry Bell and Bob Jamison for suggestions and comments.      *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\51\1\7\1\6\1\12\1\12\1\11\22\0\1\7\1\44"+
    "\3\0\1\43\2\0\1\24\1\25\1\42\1\41\1\50\1\4\1\2"+
    "\1\10\12\1\1\0\1\27\1\45\1\26\1\46\2\0\4\5\1\3"+
    "\25\5\4\0\1\5\1\0\1\14\1\33\1\5\1\47\1\36\1\30"+
    "\1\5\1\35\1\15\2\5\1\31\1\13\1\16\1\32\1\17\1\5"+
    "\1\20\1\40\1\21\1\37\1\5\1\34\3\5\1\22\1\0\1\23"+
    "\7\0\1\12\u1fa2\0\1\12\1\12\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\7\3\1\10\1\11\1\12\1\13\1\14\1\15\5\3"+
    "\1\16\1\17\1\20\1\1\1\21\1\22\1\23\1\24"+
    "\2\0\1\6\3\3\1\25\4\3\1\26\2\3\1\27"+
    "\3\3\1\30\1\31\1\32\2\33\1\0\1\3\1\34"+
    "\1\35\1\36\10\3\1\37\2\3\1\40\2\3\1\41"+
    "\1\3\1\42\1\43\1\3\1\44\1\45\1\46\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[85];
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
    "\0\0\0\52\0\124\0\176\0\52\0\52\0\250\0\322"+
    "\0\374\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\52"+
    "\0\52\0\52\0\52\0\u0222\0\52\0\u024c\0\u0276\0\u02a0"+
    "\0\u02ca\0\u02f4\0\52\0\52\0\52\0\u031e\0\u0348\0\u0372"+
    "\0\52\0\52\0\u039c\0\u03c6\0\u03f0\0\u041a\0\u0444\0\u046e"+
    "\0\176\0\u0498\0\u04c2\0\u04ec\0\u0516\0\52\0\u0540\0\u056a"+
    "\0\176\0\u0594\0\u05be\0\u05e8\0\52\0\52\0\52\0\u0612"+
    "\0\u063c\0\u063c\0\u0666\0\176\0\176\0\176\0\u0690\0\u06ba"+
    "\0\u06e4\0\u070e\0\u0738\0\u0762\0\u078c\0\u07b6\0\176\0\u07e0"+
    "\0\u080a\0\176\0\u0834\0\u085e\0\176\0\u0888\0\176\0\176"+
    "\0\u08b2\0\176\0\176\0\176\0\176";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[85];
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
    "\1\2\1\3\1\2\1\4\1\5\1\4\1\6\1\7"+
    "\1\10\1\7\1\2\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\4\1\27\1\30\1\31\1\4\1\32\2\4"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\4\1\41"+
    "\1\42\53\0\1\3\1\43\1\44\47\0\1\4\1\0"+
    "\1\4\1\0\1\4\5\0\7\4\6\0\11\4\6\0"+
    "\1\4\11\0\1\7\1\0\1\7\50\0\1\45\42\0"+
    "\1\4\1\0\1\4\1\0\1\4\5\0\1\4\1\46"+
    "\5\4\6\0\11\4\6\0\1\4\3\0\1\4\1\0"+
    "\1\4\1\0\1\4\5\0\3\4\1\47\3\4\6\0"+
    "\11\4\6\0\1\4\3\0\1\4\1\0\1\4\1\0"+
    "\1\4\5\0\3\4\1\50\3\4\6\0\1\51\10\4"+
    "\6\0\1\4\3\0\1\4\1\0\1\4\1\0\1\4"+
    "\5\0\7\4\6\0\2\4\1\52\6\4\6\0\1\4"+
    "\3\0\1\4\1\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\53\1\4\6\0\11\4\6\0\1\4\3\0\1\4"+
    "\1\0\1\4\1\0\1\4\5\0\7\4\6\0\6\4"+
    "\1\54\2\4\6\0\1\4\3\0\1\4\1\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\55\1\4\6\0\11\4"+
    "\6\0\1\4\30\0\1\56\24\0\1\4\1\0\1\4"+
    "\1\0\1\4\5\0\1\4\1\57\5\4\6\0\1\4"+
    "\1\60\7\4\6\0\1\4\3\0\1\4\1\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\61\1\4\6\0\11\4"+
    "\6\0\1\4\3\0\1\4\1\0\1\4\1\0\1\4"+
    "\5\0\7\4\6\0\2\4\1\62\6\4\6\0\1\4"+
    "\3\0\1\4\1\0\1\4\1\0\1\4\5\0\7\4"+
    "\6\0\5\4\1\63\3\4\6\0\1\4\3\0\1\4"+
    "\1\0\1\4\1\0\1\4\5\0\7\4\6\0\1\4"+
    "\1\64\7\4\6\0\1\4\30\0\1\65\51\0\1\66"+
    "\51\0\1\67\24\0\1\70\51\0\1\71\2\0\1\72"+
    "\34\0\1\72\10\0\6\45\1\0\2\45\2\0\37\45"+
    "\1\0\1\4\1\0\1\4\1\0\1\4\5\0\2\4"+
    "\1\73\4\4\6\0\11\4\6\0\1\4\3\0\1\4"+
    "\1\0\1\4\1\0\1\4\5\0\7\4\6\0\11\4"+
    "\6\0\1\74\3\0\1\4\1\0\1\4\1\0\1\4"+
    "\5\0\6\4\1\75\6\0\11\4\6\0\1\4\3\0"+
    "\1\4\1\0\1\4\1\0\1\4\5\0\6\4\1\76"+
    "\6\0\11\4\6\0\1\4\3\0\1\4\1\0\1\4"+
    "\1\0\1\4\5\0\2\4\1\77\4\4\6\0\11\4"+
    "\6\0\1\4\3\0\1\4\1\0\1\4\1\0\1\4"+
    "\5\0\6\4\1\100\6\0\11\4\6\0\1\4\3\0"+
    "\1\4\1\0\1\4\1\0\1\4\5\0\7\4\6\0"+
    "\7\4\1\101\1\4\6\0\1\4\3\0\1\4\1\0"+
    "\1\4\1\0\1\4\5\0\7\4\6\0\1\4\1\102"+
    "\7\4\6\0\1\4\3\0\1\4\1\0\1\4\1\0"+
    "\1\4\5\0\7\4\6\0\2\4\1\103\6\4\6\0"+
    "\1\4\3\0\1\4\1\0\1\4\1\0\1\4\5\0"+
    "\7\4\6\0\2\4\1\104\6\4\6\0\1\4\3\0"+
    "\1\4\1\0\1\4\1\0\1\4\5\0\2\4\1\105"+
    "\4\4\6\0\11\4\6\0\1\4\3\0\1\4\1\0"+
    "\1\4\1\0\1\4\5\0\7\4\6\0\10\4\1\106"+
    "\6\0\1\4\3\0\1\70\1\0\1\44\47\0\1\71"+
    "\51\0\1\4\1\0\1\4\1\0\1\4\5\0\3\4"+
    "\1\107\3\4\6\0\11\4\6\0\1\4\3\0\1\4"+
    "\1\0\1\4\1\0\1\4\5\0\3\4\1\110\3\4"+
    "\6\0\11\4\6\0\1\4\3\0\1\4\1\0\1\4"+
    "\1\0\1\4\5\0\7\4\6\0\7\4\1\111\1\4"+
    "\6\0\1\4\3\0\1\4\1\0\1\4\1\0\1\4"+
    "\5\0\7\4\6\0\6\4\1\112\2\4\6\0\1\4"+
    "\3\0\1\4\1\0\1\4\1\0\1\4\5\0\7\4"+
    "\6\0\10\4\1\113\6\0\1\4\3\0\1\4\1\0"+
    "\1\4\1\0\1\4\5\0\1\4\1\114\5\4\6\0"+
    "\11\4\6\0\1\4\3\0\1\4\1\0\1\4\1\0"+
    "\1\4\5\0\7\4\6\0\1\4\1\115\7\4\6\0"+
    "\1\4\3\0\1\4\1\0\1\4\1\0\1\4\5\0"+
    "\7\4\6\0\1\4\1\116\7\4\6\0\1\4\3\0"+
    "\1\4\1\0\1\4\1\0\1\4\5\0\7\4\6\0"+
    "\6\4\1\117\2\4\6\0\1\4\3\0\1\4\1\0"+
    "\1\4\1\0\1\4\5\0\6\4\1\120\6\0\11\4"+
    "\6\0\1\4\3\0\1\4\1\0\1\4\1\0\1\4"+
    "\5\0\5\4\1\121\1\4\6\0\11\4\6\0\1\4"+
    "\3\0\1\4\1\0\1\4\1\0\1\4\5\0\7\4"+
    "\6\0\6\4\1\122\2\4\6\0\1\4\3\0\1\4"+
    "\1\0\1\4\1\0\1\4\5\0\6\4\1\123\6\0"+
    "\11\4\6\0\1\4\3\0\1\4\1\0\1\4\1\0"+
    "\1\4\5\0\7\4\6\0\6\4\1\124\2\4\6\0"+
    "\1\4\3\0\1\4\1\0\1\4\1\0\1\4\5\0"+
    "\3\4\1\125\3\4\6\0\11\4\6\0\1\4\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2268];
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
    "\1\0\1\11\2\1\2\11\11\1\4\11\1\1\1\11"+
    "\5\1\3\11\3\1\2\11\2\0\11\1\1\11\6\1"+
    "\3\11\2\1\1\0\33\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[85];
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

  public Parser   yyparser;
  public int      linenum = 1;

  public Lexer(java.io.Reader r, Parser yyparser) {
    this(r);
    this.yyparser = yyparser;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
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
    while (i < 164) {
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
  public int yylex() throws java.io.IOException {
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
          { return 0; }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 40: break;
          case 2: 
            { yyparser.linenum = linenum; yyparser.yylval = new ParserVal(yytext()); return Parser.NUM   ;
            }
          case 41: break;
          case 3: 
            { yyparser.linenum = linenum; yyparser.yylval = new ParserVal(yytext()); return Parser.ID    ;
            }
          case 42: break;
          case 4: 
            { yyparser.linenum = linenum;     return Parser.SUB;
            }
          case 43: break;
          case 5: 
            { linenum++; /* skip */
            }
          case 44: break;
          case 6: 
            { /* skip */
            }
          case 45: break;
          case 7: 
            { yyparser.linenum = linenum;     return Parser.DIV;
            }
          case 46: break;
          case 8: 
            { yyparser.linenum = linenum;     return Parser.BEGIN   ;
            }
          case 47: break;
          case 9: 
            { yyparser.linenum = linenum;     return Parser.END     ;
            }
          case 48: break;
          case 10: 
            { yyparser.linenum = linenum;     return Parser.LPAREN  ;
            }
          case 49: break;
          case 11: 
            { yyparser.linenum = linenum;     return Parser.RPAREN  ;
            }
          case 50: break;
          case 12: 
            { yyparser.linenum = linenum;     return Parser.ASSIGN  ;
            }
          case 51: break;
          case 13: 
            { yyparser.linenum = linenum;     return Parser.SEMI    ;
            }
          case 52: break;
          case 14: 
            { yyparser.linenum = linenum;     return Parser.PLUS;
            }
          case 53: break;
          case 15: 
            { yyparser.linenum = linenum;     return Parser.MUL;
            }
          case 54: break;
          case 16: 
            { yyparser.linenum = linenum;     return Parser.MOD;
            }
          case 55: break;
          case 17: 
            { yyparser.linenum = linenum;     return Parser.LT;
            }
          case 56: break;
          case 18: 
            { yyparser.linenum = linenum;     return Parser.GT;
            }
          case 57: break;
          case 19: 
            { yyparser.linenum = linenum;     return Parser.COMMA;
            }
          case 58: break;
          case 20: 
            { System.err.println("Sorry, backspace doesn't work");
            }
          case 59: break;
          case 21: 
            { yyparser.linenum = linenum;     return Parser.IF;
            }
          case 60: break;
          case 22: 
            { yyparser.linenum = linenum;     return Parser.EQ;
            }
          case 61: break;
          case 23: 
            { yyparser.linenum = linenum;     return Parser.OR;
            }
          case 62: break;
          case 24: 
            { yyparser.linenum = linenum;     return Parser.NE;
            }
          case 63: break;
          case 25: 
            { yyparser.linenum = linenum;     return Parser.LE;
            }
          case 64: break;
          case 26: 
            { yyparser.linenum = linenum;     return Parser.GE;
            }
          case 65: break;
          case 27: 
            { yyparser.linenum = linenum; yyparser.yylval = new ParserVal(yytext()); return Parser.REAL  ;
            }
          case 66: break;
          case 28: 
            { yyparser.linenum = linenum;     return Parser.AND;
            }
          case 67: break;
          case 29: 
            { yyparser.linenum = linenum;     return Parser.INT;
            }
          case 68: break;
          case 30: 
            { yyparser.linenum = linenum;     return Parser.NOT;
            }
          case 69: break;
          case 31: 
            { yyparser.linenum = linenum;     return Parser.MAIN    ;
            }
          case 70: break;
          case 32: 
            { yyparser.linenum = linenum;     return Parser.TRUE;
            }
          case 71: break;
          case 33: 
            { yyparser.linenum = linenum;     return Parser.BOOL;
            }
          case 72: break;
          case 34: 
            { yyparser.linenum = linenum;     return Parser.ELSE;
            }
          case 73: break;
          case 35: 
            { yyparser.linenum = linenum;     return Parser.PRINT   ;
            }
          case 74: break;
          case 36: 
            { yyparser.linenum = linenum;     return Parser.FALSE;
            }
          case 75: break;
          case 37: 
            { yyparser.linenum = linenum;     return Parser.FLOAT;
            }
          case 76: break;
          case 38: 
            { yyparser.linenum = linenum;     return Parser.WHILE;
            }
          case 77: break;
          case 39: 
            { yyparser.linenum = linenum;     return Parser.RETURN;
            }
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
