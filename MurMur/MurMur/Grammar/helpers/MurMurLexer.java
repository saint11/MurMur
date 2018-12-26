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
		WHITESPACE=1, NEWLINE=2, LINE_COMMENT=3, TAG_START=4, COMMAND_START=5, 
		FAST_PICK_START=6, TEXT=7, COMMAND_IGNORE=8, COMMAND_PARAMS_START=9, COMMAND_STRING_START=10, 
		COMMAND_PARAMS_SEPARATOR=11, COMMAND_END=12, KEYWORD_IF=13, KEYWORD_ELSE=14, 
		KEYWORD_END=15, KEYWORD_GOTO=16, KEYWORD_MENU=17, KEYWORD_MENU_OPTION=18, 
		KEYWORD_PICK=19, KEYWORD_PICK_THIS=20, TRUE=21, FALSE=22, NUMBER=23, WORD=24, 
		ASSIGN_SIGNAL=25, COMPARISSON_SIGNAL=26, MUL_DIV_SIGNAL=27, ADD_SUB_SIGNAL=28, 
		SUB_TEXT_SEPARATOR=29, FAST_PICK_TEXT=30, FAST_PICK_END=31, STRING=32, 
		COMMAND_STRING_END=33;
	public static final int
		INSIDE_COMMAND=1, FAST_PICK=2, STRING_MODE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE_COMMAND", "FAST_PICK", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"LOWERCASE", "UPPERCASE", "COMMENT_ESCAPE", "DIGIT", "WHITESPACE", "NEWLINE", 
		"LINE_COMMENT", "TAG_START", "COMMAND_START", "FAST_PICK_START", "TEXT", 
		"COMMAND_IGNORE", "COMMAND_PARAMS_START", "COMMAND_STRING_START", "COMMAND_PARAMS_SEPARATOR", 
		"COMMAND_END", "T", "R", "U", "E", "F", "A", "L", "S", "KEYWORD_IF", "KEYWORD_ELSE", 
		"KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", 
		"KEYWORD_PICK", "KEYWORD_PICK_THIS", "TRUE", "FALSE", "NUMBER", "WORD", 
		"ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", 
		"SUB_TEXT_SEPARATOR", "FAST_PICK_TEXT", "FAST_PICK_END", "STRING", "COMMAND_STRING_END"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LINE_COMMENT", "TAG_START", "COMMAND_START", 
		"FAST_PICK_START", "TEXT", "COMMAND_IGNORE", "COMMAND_PARAMS_START", "COMMAND_STRING_START", 
		"COMMAND_PARAMS_SEPARATOR", "COMMAND_END", "KEYWORD_IF", "KEYWORD_ELSE", 
		"KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", 
		"KEYWORD_PICK", "KEYWORD_PICK_THIS", "TRUE", "FALSE", "NUMBER", "WORD", 
		"ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", 
		"SUB_TEXT_SEPARATOR", "FAST_PICK_TEXT", "FAST_PICK_END", "STRING", "COMMAND_STRING_END"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0123\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\6\6k\n\6\r\6\16\6l\3\6\3\6\3\7\3\7\3\7\6\7t\n\7\r\7\16\7u\3\b\3\b\3\b"+
		"\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\6\f\u0090\n\f\r\f\16\f\u0091\3\r\3\r\3\r\6\r"+
		"\u0097\n\r\r\r\16\r\u0098\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\6$\u00ea\n$\r$\16$\u00eb\3$\3$\6$\u00f0"+
		"\n$\r$\16$\u00f1\5$\u00f4\n$\3%\3%\3%\6%\u00f9\n%\r%\16%\u00fa\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0108\n\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3+\6+\u0113\n+\r+\16+\u0114\3,\3,\3,\3,\3-\6-\u011c\n-\r-\16-\u011d"+
		"\3.\3.\3.\3.\2\2/\6\2\b\2\n\2\f\2\16\3\20\4\22\5\24\6\26\7\30\b\32\t\34"+
		"\n\36\13 \f\"\r$\16&\2(\2*\2,\2.\2\60\2\62\2\64\2\66\178\20:\21<\22>\23"+
		"@\24B\25D\26F\27H\30J\31L\32N\33P\34R\35T\36V\37X Z!\\\"^#\6\2\3\4\5\30"+
		"\3\2c|\3\2C\\\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\t\2\f\f\17\17%%\61\61"+
		"BB]]}}\3\2\61\61\5\2\13\f\17\17\"\"\4\2VVvv\4\2TTtt\4\2WWww\4\2GGgg\4"+
		"\2HHhh\4\2CCcc\4\2NNnn\4\2UUuu\3\2\60\60\4\2>>@@\4\2,,\61\61\4\2--//\7"+
		"\2\f\f\17\17\61\61__~\177\3\2__\2\u0128\2\16\3\2\2\2\2\20\3\2\2\2\2\22"+
		"\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\3\34\3\2"+
		"\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3\66\3\2\2\2\38\3"+
		"\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2"+
		"\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3\2\2\2\3"+
		"R\3\2\2\2\3T\3\2\2\2\4V\3\2\2\2\4X\3\2\2\2\4Z\3\2\2\2\5\\\3\2\2\2\5^\3"+
		"\2\2\2\6`\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fg\3\2\2\2\16j\3\2\2\2\20s\3\2"+
		"\2\2\22w\3\2\2\2\24\u0082\3\2\2\2\26\u0084\3\2\2\2\30\u0088\3\2\2\2\32"+
		"\u008f\3\2\2\2\34\u0096\3\2\2\2\36\u009c\3\2\2\2 \u009e\3\2\2\2\"\u00a2"+
		"\3\2\2\2$\u00a4\3\2\2\2&\u00a8\3\2\2\2(\u00aa\3\2\2\2*\u00ac\3\2\2\2,"+
		"\u00ae\3\2\2\2.\u00b0\3\2\2\2\60\u00b2\3\2\2\2\62\u00b4\3\2\2\2\64\u00b6"+
		"\3\2\2\2\66\u00b8\3\2\2\28\u00bb\3\2\2\2:\u00c0\3\2\2\2<\u00c4\3\2\2\2"+
		">\u00c7\3\2\2\2@\u00cc\3\2\2\2B\u00d3\3\2\2\2D\u00d8\3\2\2\2F\u00dd\3"+
		"\2\2\2H\u00e2\3\2\2\2J\u00e9\3\2\2\2L\u00f8\3\2\2\2N\u00fc\3\2\2\2P\u0107"+
		"\3\2\2\2R\u0109\3\2\2\2T\u010b\3\2\2\2V\u010d\3\2\2\2X\u0112\3\2\2\2Z"+
		"\u0116\3\2\2\2\\\u011b\3\2\2\2^\u011f\3\2\2\2`a\t\2\2\2a\7\3\2\2\2bc\t"+
		"\3\2\2c\t\3\2\2\2de\7\61\2\2ef\7\61\2\2f\13\3\2\2\2gh\t\4\2\2h\r\3\2\2"+
		"\2ik\t\5\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\6\2"+
		"\2o\17\3\2\2\2pt\t\6\2\2qr\7\17\2\2rt\7\f\2\2sp\3\2\2\2sq\3\2\2\2tu\3"+
		"\2\2\2us\3\2\2\2uv\3\2\2\2v\21\3\2\2\2wx\7\61\2\2xy\7\61\2\2y}\3\2\2\2"+
		"z|\n\6\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\b\b\3\2\u0081\23\3\2\2\2\u0082\u0083\7%\2\2\u0083"+
		"\25\3\2\2\2\u0084\u0085\7}\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\n\4\2"+
		"\u0087\27\3\2\2\2\u0088\u0089\7]\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b"+
		"\13\5\2\u008b\31\3\2\2\2\u008c\u0090\n\7\2\2\u008d\u008e\7\61\2\2\u008e"+
		"\u0090\n\b\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\33\3\2\2\2\u0093\u0097"+
		"\t\t\2\2\u0094\u0095\7\17\2\2\u0095\u0097\7\f\2\2\u0096\u0093\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\r\2\2\u009b\35\3\2\2\2\u009c"+
		"\u009d\7<\2\2\u009d\37\3\2\2\2\u009e\u009f\7]\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u00a1\b\17\6\2\u00a1!\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3#\3\2\2\2"+
		"\u00a4\u00a5\7\177\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\21\7\2\u00a7"+
		"%\3\2\2\2\u00a8\u00a9\t\n\2\2\u00a9\'\3\2\2\2\u00aa\u00ab\t\13\2\2\u00ab"+
		")\3\2\2\2\u00ac\u00ad\t\f\2\2\u00ad+\3\2\2\2\u00ae\u00af\t\r\2\2\u00af"+
		"-\3\2\2\2\u00b0\u00b1\t\16\2\2\u00b1/\3\2\2\2\u00b2\u00b3\t\17\2\2\u00b3"+
		"\61\3\2\2\2\u00b4\u00b5\t\20\2\2\u00b5\63\3\2\2\2\u00b6\u00b7\t\21\2\2"+
		"\u00b7\65\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba\67\3\2\2"+
		"\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf9\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3"+
		"\7f\2\2\u00c3;\3\2\2\2\u00c4\u00c5\7i\2\2\u00c5\u00c6\7q\2\2\u00c6=\3"+
		"\2\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7p\2\2\u00ca"+
		"\u00cb\7w\2\2\u00cb?\3\2\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7r\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7p\2\2"+
		"\u00d2A\3\2\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7e\2"+
		"\2\u00d6\u00d7\7m\2\2\u00d7C\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7"+
		"j\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7u\2\2\u00dcE\3\2\2\2\u00dd\u00de"+
		"\5&\22\2\u00de\u00df\5(\23\2\u00df\u00e0\5*\24\2\u00e0\u00e1\5,\25\2\u00e1"+
		"G\3\2\2\2\u00e2\u00e3\5.\26\2\u00e3\u00e4\5\60\27\2\u00e4\u00e5\5\62\30"+
		"\2\u00e5\u00e6\5\64\31\2\u00e6\u00e7\5,\25\2\u00e7I\3\2\2\2\u00e8\u00ea"+
		"\5\f\5\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00f3\3\2\2\2\u00ed\u00ef\t\22\2\2\u00ee\u00f0\5"+
		"\f\5\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4K\3\2\2\2\u00f5\u00f9\5\6\2\2\u00f6\u00f9\5\b\3\2\u00f7\u00f9"+
		"\7a\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fbM\3\2\2\2"+
		"\u00fc\u00fd\7?\2\2\u00fdO\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff\u0108\7?\2"+
		"\2\u0100\u0101\7#\2\2\u0101\u0108\7?\2\2\u0102\u0108\t\23\2\2\u0103\u0104"+
		"\7@\2\2\u0104\u0108\7?\2\2\u0105\u0106\7>\2\2\u0106\u0108\7?\2\2\u0107"+
		"\u00fe\3\2\2\2\u0107\u0100\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108Q\3\2\2\2\u0109\u010a\t\24\2\2\u010aS\3"+
		"\2\2\2\u010b\u010c\t\25\2\2\u010cU\3\2\2\2\u010d\u010e\7~\2\2\u010eW\3"+
		"\2\2\2\u010f\u0113\n\26\2\2\u0110\u0111\7\61\2\2\u0111\u0113\n\b\2\2\u0112"+
		"\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115Y\3\2\2\2\u0116\u0117\7_\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\b,\7\2\u0119[\3\2\2\2\u011a\u011c\n\27\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e]\3\2\2\2\u011f\u0120\7_\2\2\u0120\u0121\3\2\2\2\u0121\u0122"+
		"\b.\7\2\u0122_\3\2\2\2\27\2\3\4\5lsu}\u008f\u0091\u0096\u0098\u00eb\u00f1"+
		"\u00f3\u00f8\u00fa\u0107\u0112\u0114\u011d\b\b\2\2\2\3\2\7\3\2\7\4\2\7"+
		"\5\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}