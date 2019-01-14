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
		TRUE=29, FALSE=30, NUMBER=31, WORD=32, ASSIGN_SIGNAL=33, COMPARISSON_SIGNAL=34, 
		MUL_DIV_SIGNAL=35, ADD_SUB_SIGNAL=36, STRING=37, COMMAND_STRING_END=38;
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
		"KEYWORD_PICK", "KEYWORD_PICK_THIS", "TRUE", "FALSE", "NUMBER", "WORD", 
		"ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", 
		"STRING", "COMMAND_STRING_END"
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
		"KEYWORD_PICK", "KEYWORD_PICK_THIS", "TRUE", "FALSE", "NUMBER", "WORD", 
		"ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", 
		"STRING", "COMMAND_STRING_END"
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
		case 47:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u016c\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6w\n\6\3\7\6"+
		"\7z\n\7\r\7\16\7{\3\7\3\7\3\b\6\b\u0081\n\b\r\b\16\b\u0082\3\t\3\t\3\t"+
		"\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0094"+
		"\n\n\f\n\16\n\u0097\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\6\17\u00b9\n\17\r\17\16\17\u00ba\3\20\3\20\5"+
		"\20\u00bf\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00c9\n\22"+
		"\f\22\16\22\u00cc\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00d4\n\23"+
		"\f\23\16\23\u00d7\13\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00df\n\24"+
		"\r\24\16\24\u00e0\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\6-\u0136\n-\r-\16"+
		"-\u0137\3-\3-\6-\u013c\n-\r-\16-\u013d\5-\u0140\n-\3.\3.\3.\5.\u0145\n"+
		".\3.\3.\3.\3.\6.\u014b\n.\r.\16.\u014c\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u015a\n\60\3\61\3\61\3\61\3\61\5\61\u0160\n"+
		"\61\3\62\3\62\3\63\6\63\u0165\n\63\r\63\16\63\u0166\3\64\3\64\3\64\3\64"+
		"\4\u0095\u00d5\2\65\5\2\7\2\t\2\13\2\r\2\17\3\21\4\23\5\25\6\27\7\31\b"+
		"\33\t\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\2"+
		"9\2;\2=\2?\2A\2C\2E\2G\27I\30K\31M\32O\33Q\34S\35U\36W\37Y [!]\"_#a$c"+
		"%e&g\'i(\5\2\3\4\25\3\2c|\3\2C\\\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\t"+
		"\2\f\f\17\17%%\61\61BB]]}}\4\2,,\61\61\4\2VVvv\4\2TTtt\4\2WWww\4\2GGg"+
		"g\4\2HHhh\4\2CCcc\4\2NNnn\4\2UUuu\3\2\60\60\4\2>>@@\4\2--//\3\2__\2\u0176"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2"+
		"\3%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3"+
		"\61\3\2\2\2\3\63\3\2\2\2\3\65\3\2\2\2\3G\3\2\2\2\3I\3\2\2\2\3K\3\2\2\2"+
		"\3M\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\3S\3\2\2\2\3U\3\2\2\2\3W\3\2\2\2\3Y"+
		"\3\2\2\2\3[\3\2\2\2\3]\3\2\2\2\3_\3\2\2\2\3a\3\2\2\2\3c\3\2\2\2\3e\3\2"+
		"\2\2\4g\3\2\2\2\4i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13q\3\2\2"+
		"\2\rv\3\2\2\2\17y\3\2\2\2\21\u0080\3\2\2\2\23\u0084\3\2\2\2\25\u008f\3"+
		"\2\2\2\27\u009d\3\2\2\2\31\u009f\3\2\2\2\33\u00a3\3\2\2\2\35\u00ae\3\2"+
		"\2\2\37\u00b8\3\2\2\2!\u00be\3\2\2\2#\u00c2\3\2\2\2%\u00c4\3\2\2\2\'\u00cf"+
		"\3\2\2\2)\u00de\3\2\2\2+\u00e4\3\2\2\2-\u00e6\3\2\2\2/\u00ea\3\2\2\2\61"+
		"\u00ec\3\2\2\2\63\u00ee\3\2\2\2\65\u00f0\3\2\2\2\67\u00f4\3\2\2\29\u00f6"+
		"\3\2\2\2;\u00f8\3\2\2\2=\u00fa\3\2\2\2?\u00fc\3\2\2\2A\u00fe\3\2\2\2C"+
		"\u0100\3\2\2\2E\u0102\3\2\2\2G\u0104\3\2\2\2I\u0107\3\2\2\2K\u010c\3\2"+
		"\2\2M\u0110\3\2\2\2O\u0113\3\2\2\2Q\u0118\3\2\2\2S\u011f\3\2\2\2U\u0124"+
		"\3\2\2\2W\u0129\3\2\2\2Y\u012e\3\2\2\2[\u0135\3\2\2\2]\u0144\3\2\2\2_"+
		"\u014e\3\2\2\2a\u0159\3\2\2\2c\u015f\3\2\2\2e\u0161\3\2\2\2g\u0164\3\2"+
		"\2\2i\u0168\3\2\2\2kl\t\2\2\2l\6\3\2\2\2mn\t\3\2\2n\b\3\2\2\2op\t\4\2"+
		"\2p\n\3\2\2\2qr\7%\2\2r\f\3\2\2\2sw\t\5\2\2tu\7\17\2\2uw\7\f\2\2vs\3\2"+
		"\2\2vt\3\2\2\2w\16\3\2\2\2xz\t\6\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|}\3\2\2\2}~\b\7\2\2~\20\3\2\2\2\177\u0081\5\r\6\2\u0080\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\22\3\2\2\2\u0084\u0085\7\61\2\2\u0085\u0086\7\61\2\2\u0086\u008a\3\2"+
		"\2\2\u0087\u0089\n\5\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\b\t\3\2\u008e\24\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091"+
		"\7,\2\2\u0091\u0095\3\2\2\2\u0092\u0094\13\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7,\2\2\u0099\u009a\7\61\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\b\n\3\2\u009c\26\3\2\2\2\u009d\u009e\5\13\5"+
		"\2\u009e\30\3\2\2\2\u009f\u00a0\7}\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2"+
		"\b\f\4\2\u00a2\32\3\2\2\2\u00a3\u00a4\7B\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7w\2\2"+
		"\u00a9\u00aa\7f\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\b\r\4\2\u00ad\34\3\2\2\2\u00ae\u00af\7B\2\2\u00af\u00b0\7f\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\16"+
		"\4\2\u00b4\36\3\2\2\2\u00b5\u00b9\n\7\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b9"+
		"\n\b\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb \3\2\2\2\u00bc\u00bf\6\20\2\2"+
		"\u00bd\u00bf\6\20\3\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c1\b\20\5\2\u00c1\"\3\2\2\2\u00c2\u00c3\5\r\6\2\u00c3"+
		"$\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00ca\3\2\2"+
		"\2\u00c7\u00c9\n\5\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\b\22\3\2\u00ce&\3\2\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00d1\7,\2\2"+
		"\u00d1\u00d5\3\2\2\2\u00d2\u00d4\13\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7,\2\2\u00d9\u00da\7\61\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\b\23\3\2\u00dc(\3\2\2\2\u00dd\u00df\t\6\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\b\24\2\2\u00e3*\3\2\2\2\u00e4\u00e5\7<\2\2"+
		"\u00e5,\3\2\2\2\u00e6\u00e7\7]\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\26"+
		"\6\2\u00e9.\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb\60\3\2\2\2\u00ec\u00ed\7"+
		"+\2\2\u00ed\62\3\2\2\2\u00ee\u00ef\7.\2\2\u00ef\64\3\2\2\2\u00f0\u00f1"+
		"\7\177\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\32\5\2\u00f3\66\3\2\2\2\u00f4"+
		"\u00f5\t\t\2\2\u00f58\3\2\2\2\u00f6\u00f7\t\n\2\2\u00f7:\3\2\2\2\u00f8"+
		"\u00f9\t\13\2\2\u00f9<\3\2\2\2\u00fa\u00fb\t\f\2\2\u00fb>\3\2\2\2\u00fc"+
		"\u00fd\t\r\2\2\u00fd@\3\2\2\2\u00fe\u00ff\t\16\2\2\u00ffB\3\2\2\2\u0100"+
		"\u0101\t\17\2\2\u0101D\3\2\2\2\u0102\u0103\t\20\2\2\u0103F\3\2\2\2\u0104"+
		"\u0105\7k\2\2\u0105\u0106\7h\2\2\u0106H\3\2\2\2\u0107\u0108\7g\2\2\u0108"+
		"\u0109\7n\2\2\u0109\u010a\7u\2\2\u010a\u010b\7g\2\2\u010bJ\3\2\2\2\u010c"+
		"\u010d\7g\2\2\u010d\u010e\7p\2\2\u010e\u010f\7f\2\2\u010fL\3\2\2\2\u0110"+
		"\u0111\7i\2\2\u0111\u0112\7q\2\2\u0112N\3\2\2\2\u0113\u0114\7o\2\2\u0114"+
		"\u0115\7g\2\2\u0115\u0116\7p\2\2\u0116\u0117\7w\2\2\u0117P\3\2\2\2\u0118"+
		"\u0119\7q\2\2\u0119\u011a\7r\2\2\u011a\u011b\7v\2\2\u011b\u011c\7k\2\2"+
		"\u011c\u011d\7q\2\2\u011d\u011e\7p\2\2\u011eR\3\2\2\2\u011f\u0120\7r\2"+
		"\2\u0120\u0121\7k\2\2\u0121\u0122\7e\2\2\u0122\u0123\7m\2\2\u0123T\3\2"+
		"\2\2\u0124\u0125\7v\2\2\u0125\u0126\7j\2\2\u0126\u0127\7k\2\2\u0127\u0128"+
		"\7u\2\2\u0128V\3\2\2\2\u0129\u012a\5\67\33\2\u012a\u012b\59\34\2\u012b"+
		"\u012c\5;\35\2\u012c\u012d\5=\36\2\u012dX\3\2\2\2\u012e\u012f\5?\37\2"+
		"\u012f\u0130\5A \2\u0130\u0131\5C!\2\u0131\u0132\5E\"\2\u0132\u0133\5"+
		"=\36\2\u0133Z\3\2\2\2\u0134\u0136\5\t\4\2\u0135\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013f\3\2\2\2\u0139"+
		"\u013b\t\21\2\2\u013a\u013c\5\t\4\2\u013b\u013a\3\2\2\2\u013c\u013d\3"+
		"\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u0139\3\2\2\2\u013f\u0140\3\2\2\2\u0140\\\3\2\2\2\u0141\u0145\5\5\2\2"+
		"\u0142\u0145\5\7\3\2\u0143\u0145\7a\2\2\u0144\u0141\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u014a\3\2\2\2\u0146\u014b\5\5\2\2\u0147"+
		"\u014b\5\7\3\2\u0148\u014b\7a\2\2\u0149\u014b\5\t\4\2\u014a\u0146\3\2"+
		"\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d^\3\2\2\2"+
		"\u014e\u014f\7?\2\2\u014f`\3\2\2\2\u0150\u0151\7?\2\2\u0151\u015a\7?\2"+
		"\2\u0152\u0153\7#\2\2\u0153\u015a\7?\2\2\u0154\u015a\t\22\2\2\u0155\u0156"+
		"\7@\2\2\u0156\u015a\7?\2\2\u0157\u0158\7>\2\2\u0158\u015a\7?\2\2\u0159"+
		"\u0150\3\2\2\2\u0159\u0152\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u015ab\3\2\2\2\u015b\u0160\7,\2\2\u015c\u015d"+
		"\7\61\2\2\u015d\u015e\6\61\4\2\u015e\u0160\6\61\5\2\u015f\u015b\3\2\2"+
		"\2\u015f\u015c\3\2\2\2\u0160d\3\2\2\2\u0161\u0162\t\23\2\2\u0162f\3\2"+
		"\2\2\u0163\u0165\n\24\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167h\3\2\2\2\u0168\u0169\7_\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\b\64\5\2\u016bj\3\2\2\2\31\2\3\4v{\u0082\u008a"+
		"\u0095\u00b8\u00ba\u00be\u00ca\u00d5\u00e0\u0137\u013d\u013f\u0144\u014a"+
		"\u014c\u0159\u015f\u0166\7\b\2\2\2\3\2\7\3\2\6\2\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}