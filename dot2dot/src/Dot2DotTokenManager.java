/* Generated By:JJTree&JavaCC: Do not edit this line. Dot2DotTokenManager.java */

/** Token Manager. */
public class Dot2DotTokenManager implements Dot2DotConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 3;
         return jjMoveNfa_0(7, 0);
      case 10:
         jjmatchedKind = 6;
         return jjMoveNfa_0(7, 0);
      case 13:
         jjmatchedKind = 2;
         return jjMoveNfa_0(7, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(7, 0);
      case 35:
         jjmatchedKind = 4;
         return jjMoveNfa_0(7, 0);
      case 44:
         jjmatchedKind = 24;
         return jjMoveNfa_0(7, 0);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x18000L);
      case 58:
         jjmatchedKind = 21;
         return jjMoveNfa_0(7, 0);
      case 59:
         jjmatchedKind = 22;
         return jjMoveNfa_0(7, 0);
      case 61:
         jjmatchedKind = 23;
         return jjMoveNfa_0(7, 0);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x500L);
      case 91:
         jjmatchedKind = 19;
         return jjMoveNfa_0(7, 0);
      case 93:
         jjmatchedKind = 20;
         return jjMoveNfa_0(7, 0);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x500L);
      case 125:
         jjmatchedKind = 18;
         return jjMoveNfa_0(7, 0);
      default :
         return jjMoveNfa_0(7, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(7, 0);
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 1;
         }
         break;
      case 62:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 1;
         }
         break;
      case 84:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      default :
         break;
   }
   return jjMoveNfa_0(7, 1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(7, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(7, 1);
   }
   switch(curChar)
   {
      case 66:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 82:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      default :
         break;
   }
   return jjMoveNfa_0(7, 2);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(7, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(7, 2);
   }
   switch(curChar)
   {
      case 71:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 3;
         }
         break;
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      default :
         break;
   }
   return jjMoveNfa_0(7, 3);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(7, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(7, 3);
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      default :
         break;
   }
   return jjMoveNfa_0(7, 4);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(7, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(7, 4);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 84:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 5;
         }
         break;
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 116:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(7, 5);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(7, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(7, 5);
   }
   switch(curChar)
   {
      case 80:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      default :
         break;
   }
   return jjMoveNfa_0(7, 6);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(7, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(7, 6);
   }
   switch(curChar)
   {
      case 72:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 7;
         }
         break;
      case 104:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 7;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(7, 7);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 49;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 7:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(0);
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjAddStates(0, 1);
                  break;
               case 29:
                  if (curChar == 10)
                     kind = 17;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 7:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                     jjCheckNAddTwoStates(26, 27);
                  }
                  else if (curChar == 123)
                  {
                     if (kind > 17)
                        kind = 17;
                     jjstateSet[jjnewStateCnt++] = 29;
                  }
                  if ((0x88402880000000L & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                  }
                  else if ((0x8000000080L & l) != 0L)
                     jjAddStates(2, 3);
                  else if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 24;
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 115)
                     jjCheckNAddStates(4, 7);
                  else if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 19;
                  if (curChar == 110)
                     jjCheckNAddTwoStates(31, 32);
                  break;
               case 1:
                  if ((0x10000000100L & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 2:
               case 34:
                  if ((0x1000000010000L & l) != 0L)
                     jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if ((0x8000000080L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 8:
                  if ((0x2000000020L & l) != 0L && kind > 9)
                     kind = 9;
                  break;
               case 9:
                  if ((0x1000000010L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 10:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if ((0x8000000080L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 13:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if ((0x88402880000000L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 16:
                  if (curChar == 114 && kind > 12)
                     kind = 12;
                  break;
               case 17:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 108 && kind > 12)
                     kind = 12;
                  break;
               case 22:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAddTwoStates(26, 27);
                  break;
               case 28:
                  if (curChar != 123)
                     break;
                  kind = 17;
                  jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 30:
                  if (curChar == 110)
                     jjCheckNAddTwoStates(31, 32);
                  break;
               case 31:
                  if (curChar == 101 && kind > 11)
                     kind = 11;
                  break;
               case 32:
                  if (curChar == 119 && kind > 11)
                     kind = 11;
                  break;
               case 33:
                  if ((0x8000000080L & l) != 0L)
                     jjAddStates(2, 3);
                  break;
               case 35:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 37:
                  if ((0x10000000100L & l) != 0L && kind > 9)
                     kind = 9;
                  break;
               case 38:
                  if ((0x1000000010000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 115)
                     jjCheckNAddStates(4, 7);
                  break;
               case 42:
                  if (curChar == 101 && kind > 12)
                     kind = 12;
                  break;
               case 43:
                  if (curChar == 108)
                     jjCheckNAdd(42);
                  break;
               case 44:
                  if (curChar == 121)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 45:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if (curChar == 112)
                     jjCheckNAdd(42);
                  break;
               case 47:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 49 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
   26, 27, 36, 40, 31, 32, 45, 48, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\43", null, "\12", null, null, null, null, null, null, 
"\156\157\144\145", null, "\55\76", "\55\55", null, "\175", "\133", "\135", "\72", "\73", "\75", 
"\54", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[49];
static private final int[] jjstateSet = new int[98];
static protected char curChar;
/** Constructor. */
public Dot2DotTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public Dot2DotTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 49; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
