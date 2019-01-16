// Generated from ../MurMurLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MurMurLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NEWLINE=2, LINE_COMMENT=3, COMMENT=4, TAG_START=5, COMMAND_START=6, 
		INCLUDE_KEYWORD=7, DEF_KEYWORD=8, TEXT=9, EXIT_COMMAND=10, COMMAND_NEWLINE=11, 
		COMMAND_LINE_COMMENT=12, COMMAND_COMMENT=13, COMMAND_IGNORE=14, COMMAND_PARAMS_START=15, 
		COMMAND_STRING_START=16, OPEN_PAREN=17, CLOSE_PAREN=18, COMMAND_PARAMS_SEPARATOR=19, 
		COMMAND_END=20, KEYWORD_IF=21, KEYWORD_ELSE=22, KEYWORD_END=23, KEYWORD_GOTO=24, 
		KEYWORD_MENU=25, KEYWORD_MENU_OPTION=26, KEYWORD_PICK=27, KEYWORD_PICK_THIS=28, 
		KEYWORD_RETURN=29, TRUE=30, FALSE=31, NUMBER=32, WORD=33, ASSIGN_SIGNAL=34, 
		COMPARISSON_SIGNAL=35, MUL_DIV_SIGNAL=36, ADD_SUB_SIGNAL=37, STRING=38, 
		COMMAND_STRING_END=39;
	public static final int
		INSIDE_COMMAND=1, STRING_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE_COMMAND", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"LOWERCASE", "UPPERCASE", "DIGIT", "TAG", "NL", "WHITESPACE", "NEWLINE", 
		"LINE_COMMENT", "COMMENT", "TAG_START", "COMMAND_START", "INCLUDE_KEYWORD", 
		"DEF_KEYWORD", "TEXT", "EXIT_COMMAND", "COMMAND_NEWLINE", "COMMAND_LINE_COMMENT", 
		"COMMAND_COMMENT", "COMMAND_IGNORE", "COMMAND_PARAMS_START", "COMMAND_STRING_START", 
		"OPEN_PAREN", "CLOSE_PAREN", "COMMAND_PARAMS_SEPARATOR", "COMMAND_END", 
		"T", "R", "U", "E", "F", "A", "L", "S", "KEYWORD_IF", "KEYWORD_ELSE", 
		"KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", 
		"KEYWORD_PICK", "KEYWORD_PICK_THIS", "KEYWORD_RETURN", "TRUE", "FALSE", 
		"NUMBER", "WORD", "ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", 
		"ADD_SUB_SIGNAL", "STRING", "COMMAND_STRING_END"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'@include'", "'@def'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LINE_COMMENT", "COMMENT", "TAG_START", 
		"COMMAND_START", "INCLUDE_KEYWORD", "DEF_KEYWORD", "TEXT", "EXIT_COMMAND", 
		"COMMAND_NEWLINE", "COMMAND_LINE_COMMENT", "COMMAND_COMMENT", "COMMAND_IGNORE", 
		"COMMAND_PARAMS_START", "COMMAND_STRING_START", "OPEN_PAREN", "CLOSE_PAREN", 
		"COMMAND_PARAMS_SEPARATOR", "COMMAND_END", "KEYWORD_IF", "KEYWORD_ELSE", 
		"KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", 
		"KEYWORD_PICK", "KEYWORD_PICK_THIS", "KEYWORD_RETURN", "TRUE", "FALSE", 
		"NUMBER", "WORD", "ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", 
		"ADD_SUB_SIGNAL", "STRING", "COMMAND_STRING_END"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MurMurLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MurMurLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return EXIT_COMMAND_sempred((RuleContext)_localctx, predIndex);
		case 48:
			return MUL_DIV_SIGNAL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean EXIT_COMMAND_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _input.LA(1)=='#';
		case 1:
			return _input.LA(1)=='@';
		}
		return true;
	}
	private boolean MUL_DIV_SIGNAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _input.LA(1)!='*';
		case 3:
			return _input.LA(1)!='/';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0175\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6y"+
		"\n\6\3\7\6\7|\n\7\r\7\16\7}\3\7\3\7\3\b\6\b\u0083\n\b\r\b\16\b\u0084\3"+
		"\t\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\6\17\u00bb\n\17\r\17\16\17\u00bc\3"+
		"\20\3\20\5\20\u00c1\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22"+
		"\u00cb\n\22\f\22\16\22\u00ce\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23"+
		"\u00d6\n\23\f\23\16\23\u00d9\13\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24"+
		"\u00e1\n\24\r\24\16\24\u00e2\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3.\6.\u013f\n.\r.\16.\u0140\3.\3.\6.\u0145\n.\r.\16.\u0146"+
		"\5.\u0149\n.\3/\3/\3/\5/\u014e\n/\3/\3/\3/\3/\6/\u0154\n/\r/\16/\u0155"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0163\n\61"+
		"\3\62\3\62\3\62\3\62\5\62\u0169\n\62\3\63\3\63\3\64\6\64\u016e\n\64\r"+
		"\64\16\64\u016f\3\65\3\65\3\65\3\65\4\u0097\u00d7\2\66\5\2\7\2\t\2\13"+
		"\2\r\2\17\3\21\4\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20"+
		"+\21-\22/\23\61\24\63\25\65\26\67\29\2;\2=\2?\2A\2C\2E\2G\27I\30K\31M"+
		"\32O\33Q\34S\35U\36W\37Y [!]\"_#a$c%e&g\'i(k)\5\2\3\4\25\3\2c|\3\2C\\"+
		"\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\t\2\f\f\17\17%%\61\61BB]]}}\4\2,"+
		",\61\61\4\2VVvv\4\2TTtt\4\2WWww\4\2GGgg\4\2HHhh\4\2CCcc\4\2NNnn\4\2UU"+
		"uu\3\2\60\60\4\2>>@@\4\2--//\3\2__\2\u017f\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'\3\2\2\2\3)\3"+
		"\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3\61\3\2\2\2\3\63\3\2\2\2\3\65"+
		"\3\2\2\2\3G\3\2\2\2\3I\3\2\2\2\3K\3\2\2\2\3M\3\2\2\2\3O\3\2\2\2\3Q\3\2"+
		"\2\2\3S\3\2\2\2\3U\3\2\2\2\3W\3\2\2\2\3Y\3\2\2\2\3[\3\2\2\2\3]\3\2\2\2"+
		"\3_\3\2\2\2\3a\3\2\2\2\3c\3\2\2\2\3e\3\2\2\2\3g\3\2\2\2\4i\3\2\2\2\4k"+
		"\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\rx\3\2\2\2\17{\3"+
		"\2\2\2\21\u0082\3\2\2\2\23\u0086\3\2\2\2\25\u0091\3\2\2\2\27\u009f\3\2"+
		"\2\2\31\u00a1\3\2\2\2\33\u00a5\3\2\2\2\35\u00b0\3\2\2\2\37\u00ba\3\2\2"+
		"\2!\u00c0\3\2\2\2#\u00c4\3\2\2\2%\u00c6\3\2\2\2\'\u00d1\3\2\2\2)\u00e0"+
		"\3\2\2\2+\u00e6\3\2\2\2-\u00e8\3\2\2\2/\u00ec\3\2\2\2\61\u00ee\3\2\2\2"+
		"\63\u00f0\3\2\2\2\65\u00f2\3\2\2\2\67\u00f6\3\2\2\29\u00f8\3\2\2\2;\u00fa"+
		"\3\2\2\2=\u00fc\3\2\2\2?\u00fe\3\2\2\2A\u0100\3\2\2\2C\u0102\3\2\2\2E"+
		"\u0104\3\2\2\2G\u0106\3\2\2\2I\u0109\3\2\2\2K\u010e\3\2\2\2M\u0112\3\2"+
		"\2\2O\u0115\3\2\2\2Q\u011a\3\2\2\2S\u0121\3\2\2\2U\u0126\3\2\2\2W\u012b"+
		"\3\2\2\2Y\u0132\3\2\2\2[\u0137\3\2\2\2]\u013e\3\2\2\2_\u014d\3\2\2\2a"+
		"\u0157\3\2\2\2c\u0162\3\2\2\2e\u0168\3\2\2\2g\u016a\3\2\2\2i\u016d\3\2"+
		"\2\2k\u0171\3\2\2\2mn\t\2\2\2n\6\3\2\2\2op\t\3\2\2p\b\3\2\2\2qr\t\4\2"+
		"\2r\n\3\2\2\2st\7%\2\2t\f\3\2\2\2uy\t\5\2\2vw\7\17\2\2wy\7\f\2\2xu\3\2"+
		"\2\2xv\3\2\2\2y\16\3\2\2\2z|\t\6\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\177\3\2\2\2\177\u0080\b\7\2\2\u0080\20\3\2\2\2\u0081\u0083\5\r"+
		"\6\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\22\3\2\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7\61"+
		"\2\2\u0088\u008c\3\2\2\2\u0089\u008b\n\5\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\t\3\2\u0090\24\3\2\2\2\u0091\u0092"+
		"\7\61\2\2\u0092\u0093\7,\2\2\u0093\u0097\3\2\2\2\u0094\u0096\13\2\2\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7,\2\2\u009b"+
		"\u009c\7\61\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\n\3\2\u009e\26\3\2\2"+
		"\2\u009f\u00a0\5\13\5\2\u00a0\30\3\2\2\2\u00a1\u00a2\7}\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\b\f\4\2\u00a4\32\3\2\2\2\u00a5\u00a6\7B\2\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7n\2\2"+
		"\u00aa\u00ab\7w\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00af\b\r\4\2\u00af\34\3\2\2\2\u00b0\u00b1\7B\2\2\u00b1"+
		"\u00b2\7f\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\3\2\2"+
		"\2\u00b5\u00b6\b\16\4\2\u00b6\36\3\2\2\2\u00b7\u00bb\n\7\2\2\u00b8\u00b9"+
		"\7\61\2\2\u00b9\u00bb\n\b\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd \3"+
		"\2\2\2\u00be\u00c1\6\20\2\2\u00bf\u00c1\6\20\3\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\20\5\2\u00c3\"\3\2\2"+
		"\2\u00c4\u00c5\5\r\6\2\u00c5$\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8"+
		"\7\61\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\n\5\2\2\u00ca\u00c9\3\2\2\2"+
		"\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b\22\3\2\u00d0&\3\2\2\2\u00d1"+
		"\u00d2\7\61\2\2\u00d2\u00d3\7,\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\13"+
		"\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7,"+
		"\2\2\u00db\u00dc\7\61\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\23\3\2\u00de"+
		"(\3\2\2\2\u00df\u00e1\t\6\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\b\24\2\2\u00e5*\3\2\2\2\u00e6\u00e7\7<\2\2\u00e7,\3\2\2\2\u00e8\u00e9"+
		"\7]\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\26\6\2\u00eb.\3\2\2\2\u00ec"+
		"\u00ed\7*\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef\62\3\2\2\2\u00f0"+
		"\u00f1\7.\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7\177\2\2\u00f3\u00f4\3\2\2"+
		"\2\u00f4\u00f5\b\32\5\2\u00f5\66\3\2\2\2\u00f6\u00f7\t\t\2\2\u00f78\3"+
		"\2\2\2\u00f8\u00f9\t\n\2\2\u00f9:\3\2\2\2\u00fa\u00fb\t\13\2\2\u00fb<"+
		"\3\2\2\2\u00fc\u00fd\t\f\2\2\u00fd>\3\2\2\2\u00fe\u00ff\t\r\2\2\u00ff"+
		"@\3\2\2\2\u0100\u0101\t\16\2\2\u0101B\3\2\2\2\u0102\u0103\t\17\2\2\u0103"+
		"D\3\2\2\2\u0104\u0105\t\20\2\2\u0105F\3\2\2\2\u0106\u0107\7k\2\2\u0107"+
		"\u0108\7h\2\2\u0108H\3\2\2\2\u0109\u010a\7g\2\2\u010a\u010b\7n\2\2\u010b"+
		"\u010c\7u\2\2\u010c\u010d\7g\2\2\u010dJ\3\2\2\2\u010e\u010f\7g\2\2\u010f"+
		"\u0110\7p\2\2\u0110\u0111\7f\2\2\u0111L\3\2\2\2\u0112\u0113\7i\2\2\u0113"+
		"\u0114\7q\2\2\u0114N\3\2\2\2\u0115\u0116\7o\2\2\u0116\u0117\7g\2\2\u0117"+
		"\u0118\7p\2\2\u0118\u0119\7w\2\2\u0119P\3\2\2\2\u011a\u011b\7q\2\2\u011b"+
		"\u011c\7r\2\2\u011c\u011d\7v\2\2\u011d\u011e\7k\2\2\u011e\u011f\7q\2\2"+
		"\u011f\u0120\7p\2\2\u0120R\3\2\2\2\u0121\u0122\7r\2\2\u0122\u0123\7k\2"+
		"\2\u0123\u0124\7e\2\2\u0124\u0125\7m\2\2\u0125T\3\2\2\2\u0126\u0127\7"+
		"v\2\2\u0127\u0128\7j\2\2\u0128\u0129\7k\2\2\u0129\u012a\7u\2\2\u012aV"+
		"\3\2\2\2\u012b\u012c\7t\2\2\u012c\u012d\7g\2\2\u012d\u012e\7v\2\2\u012e"+
		"\u012f\7w\2\2\u012f\u0130\7t\2\2\u0130\u0131\7p\2\2\u0131X\3\2\2\2\u0132"+
		"\u0133\5\67\33\2\u0133\u0134\59\34\2\u0134\u0135\5;\35\2\u0135\u0136\5"+
		"=\36\2\u0136Z\3\2\2\2\u0137\u0138\5?\37\2\u0138\u0139\5A \2\u0139\u013a"+
		"\5C!\2\u013a\u013b\5E\"\2\u013b\u013c\5=\36\2\u013c\\\3\2\2\2\u013d\u013f"+
		"\5\t\4\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0148\3\2\2\2\u0142\u0144\t\21\2\2\u0143\u0145\5"+
		"\t\4\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149^\3\2\2\2\u014a\u014e\5\5\2\2\u014b\u014e\5\7\3\2\u014c\u014e"+
		"\7a\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\u0153\3\2\2\2\u014f\u0154\5\5\2\2\u0150\u0154\5\7\3\2\u0151\u0154\7a"+
		"\2\2\u0152\u0154\5\t\4\2\u0153\u014f\3\2\2\2\u0153\u0150\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156`\3\2\2\2\u0157\u0158\7?\2\2\u0158b\3\2"+
		"\2\2\u0159\u015a\7?\2\2\u015a\u0163\7?\2\2\u015b\u015c\7#\2\2\u015c\u0163"+
		"\7?\2\2\u015d\u0163\t\22\2\2\u015e\u015f\7@\2\2\u015f\u0163\7?\2\2\u0160"+
		"\u0161\7>\2\2\u0161\u0163\7?\2\2\u0162\u0159\3\2\2\2\u0162\u015b\3\2\2"+
		"\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0162\u0160\3\2\2\2\u0163d"+
		"\3\2\2\2\u0164\u0169\7,\2\2\u0165\u0166\7\61\2\2\u0166\u0167\6\62\4\2"+
		"\u0167\u0169\6\62\5\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2\2\2\u0169f\3"+
		"\2\2\2\u016a\u016b\t\23\2\2\u016bh\3\2\2\2\u016c\u016e\n\24\2\2\u016d"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170j\3\2\2\2\u0171\u0172\7_\2\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\b\65\5\2\u0174l\3\2\2\2\31\2\3\4x}\u0084\u008c\u0097\u00ba\u00bc\u00c0"+
		"\u00cc\u00d7\u00e2\u0140\u0146\u0148\u014d\u0153\u0155\u0162\u0168\u016f"+
		"\7\b\2\2\2\3\2\7\3\2\6\2\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}