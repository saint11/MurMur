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
		FAST_PICK_START=6, TEXT=7, COMMAND_NEWLINE=8, COMMAND_IGNORE=9, COMMAND_PARAMS_START=10, 
		COMMAND_STRING_START=11, OPEN_PAREN=12, CLOSE_PAREN=13, COMMAND_PARAMS_SEPARATOR=14, 
		COMMAND_END=15, KEYWORD_IF=16, KEYWORD_ELSE=17, KEYWORD_END=18, KEYWORD_GOTO=19, 
		KEYWORD_MENU=20, KEYWORD_MENU_OPTION=21, KEYWORD_PICK=22, KEYWORD_PICK_THIS=23, 
		TRUE=24, FALSE=25, NUMBER=26, WORD=27, ASSIGN_SIGNAL=28, COMPARISSON_SIGNAL=29, 
		MUL_DIV_SIGNAL=30, ADD_SUB_SIGNAL=31, SUB_TEXT_SEPARATOR=32, FAST_PICK_TEXT=33, 
		FAST_PICK_END=34, STRING=35, COMMAND_STRING_END=36;
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
		"COMMAND_NEWLINE", "COMMAND_IGNORE", "COMMAND_PARAMS_START", "COMMAND_STRING_START", 
		"OPEN_PAREN", "CLOSE_PAREN", "COMMAND_PARAMS_SEPARATOR", "COMMAND_END", 
		"T", "R", "U", "E", "F", "A", "L", "S", "KEYWORD_IF", "KEYWORD_ELSE", 
		"KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", 
		"KEYWORD_PICK", "KEYWORD_PICK_THIS", "TRUE", "FALSE", "NUMBER", "WORD", 
		"ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", 
		"SUB_TEXT_SEPARATOR", "FAST_PICK_TEXT", "FAST_PICK_END", "STRING", "COMMAND_STRING_END"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LINE_COMMENT", "TAG_START", "COMMAND_START", 
		"FAST_PICK_START", "TEXT", "COMMAND_NEWLINE", "COMMAND_IGNORE", "COMMAND_PARAMS_START", 
		"COMMAND_STRING_START", "OPEN_PAREN", "CLOSE_PAREN", "COMMAND_PARAMS_SEPARATOR", 
		"COMMAND_END", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_END", "KEYWORD_GOTO", 
		"KEYWORD_MENU", "KEYWORD_MENU_OPTION", "KEYWORD_PICK", "KEYWORD_PICK_THIS", 
		"TRUE", "FALSE", "NUMBER", "WORD", "ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", 
		"MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", "SUB_TEXT_SEPARATOR", "FAST_PICK_TEXT", 
		"FAST_PICK_END", "STRING", "COMMAND_STRING_END"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0132\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\6\6\6q\n\6\r\6\16\6r\3\6\3\6\3\7\3\7\3\7\6\7"+
		"z\n\7\r\7\16\7{\3\b\3\b\3\b\3\b\7\b\u0082\n\b\f\b\16\b\u0085\13\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\6\f\u0096"+
		"\n\f\r\f\16\f\u0097\3\r\3\r\3\r\6\r\u009d\n\r\r\r\16\r\u009e\3\16\6\16"+
		"\u00a2\n\16\r\16\16\16\u00a3\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\6\'\u00f9\n\'\r\'\16\'\u00fa\3\'\3\'\6\'"+
		"\u00ff\n\'\r\'\16\'\u0100\5\'\u0103\n\'\3(\3(\3(\6(\u0108\n(\r(\16(\u0109"+
		"\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0117\n*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3.\6.\u0122\n.\r.\16.\u0123\3/\3/\3/\3/\3\60\6\60\u012b\n\60\r\60\16"+
		"\60\u012c\3\61\3\61\3\61\3\61\2\2\62\6\2\b\2\n\2\f\2\16\3\20\4\22\5\24"+
		"\6\26\7\30\b\32\t\34\n\36\13 \f\"\r$\16&\17(\20*\21,\2.\2\60\2\62\2\64"+
		"\2\66\28\2:\2<\22>\23@\24B\25D\26F\27H\30J\31L\32N\33P\34R\35T\36V\37"+
		"X Z!\\\"^#`$b%d&\6\2\3\4\5\27\3\2c|\3\2C\\\3\2\62;\4\2\13\13\"\"\4\2\f"+
		"\f\17\17\t\2\f\f\17\17%%\61\61BB]]}}\3\2\61\61\4\2VVvv\4\2TTtt\4\2WWw"+
		"w\4\2GGgg\4\2HHhh\4\2CCcc\4\2NNnn\4\2UUuu\3\2\60\60\4\2>>@@\4\2,,\61\61"+
		"\4\2--//\7\2\f\f\17\17\61\61__~\177\3\2__\2\u0138\2\16\3\2\2\2\2\20\3"+
		"\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2"+
		"\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2"+
		"\2\2\3(\3\2\2\2\3*\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2"+
		"\3D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P"+
		"\3\2\2\2\3R\3\2\2\2\3T\3\2\2\2\3V\3\2\2\2\3X\3\2\2\2\3Z\3\2\2\2\4\\\3"+
		"\2\2\2\4^\3\2\2\2\4`\3\2\2\2\5b\3\2\2\2\5d\3\2\2\2\6f\3\2\2\2\bh\3\2\2"+
		"\2\nj\3\2\2\2\fm\3\2\2\2\16p\3\2\2\2\20y\3\2\2\2\22}\3\2\2\2\24\u0088"+
		"\3\2\2\2\26\u008a\3\2\2\2\30\u008e\3\2\2\2\32\u0095\3\2\2\2\34\u009c\3"+
		"\2\2\2\36\u00a1\3\2\2\2 \u00a7\3\2\2\2\"\u00a9\3\2\2\2$\u00ad\3\2\2\2"+
		"&\u00af\3\2\2\2(\u00b1\3\2\2\2*\u00b3\3\2\2\2,\u00b7\3\2\2\2.\u00b9\3"+
		"\2\2\2\60\u00bb\3\2\2\2\62\u00bd\3\2\2\2\64\u00bf\3\2\2\2\66\u00c1\3\2"+
		"\2\28\u00c3\3\2\2\2:\u00c5\3\2\2\2<\u00c7\3\2\2\2>\u00ca\3\2\2\2@\u00cf"+
		"\3\2\2\2B\u00d3\3\2\2\2D\u00d6\3\2\2\2F\u00db\3\2\2\2H\u00e2\3\2\2\2J"+
		"\u00e7\3\2\2\2L\u00ec\3\2\2\2N\u00f1\3\2\2\2P\u00f8\3\2\2\2R\u0107\3\2"+
		"\2\2T\u010b\3\2\2\2V\u0116\3\2\2\2X\u0118\3\2\2\2Z\u011a\3\2\2\2\\\u011c"+
		"\3\2\2\2^\u0121\3\2\2\2`\u0125\3\2\2\2b\u012a\3\2\2\2d\u012e\3\2\2\2f"+
		"g\t\2\2\2g\7\3\2\2\2hi\t\3\2\2i\t\3\2\2\2jk\7\61\2\2kl\7\61\2\2l\13\3"+
		"\2\2\2mn\t\4\2\2n\r\3\2\2\2oq\t\5\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs"+
		"\3\2\2\2st\3\2\2\2tu\b\6\2\2u\17\3\2\2\2vz\t\6\2\2wx\7\17\2\2xz\7\f\2"+
		"\2yv\3\2\2\2yw\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\21\3\2\2\2}~\7\61"+
		"\2\2~\177\7\61\2\2\177\u0083\3\2\2\2\u0080\u0082\n\6\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\b\b\3\2\u0087\23\3\2\2"+
		"\2\u0088\u0089\7%\2\2\u0089\25\3\2\2\2\u008a\u008b\7}\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\b\n\4\2\u008d\27\3\2\2\2\u008e\u008f\7]\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\b\13\5\2\u0091\31\3\2\2\2\u0092\u0096\n\7\2"+
		"\2\u0093\u0094\7\61\2\2\u0094\u0096\n\b\2\2\u0095\u0092\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\33\3\2\2\2\u0099\u009d\t\6\2\2\u009a\u009b\7\17\2\2\u009b\u009d"+
		"\7\f\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\35\3\2\2\2\u00a0\u00a2\t\5\2"+
		"\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\16\2\2\u00a6\37\3\2\2\2\u00a7"+
		"\u00a8\7<\2\2\u00a8!\3\2\2\2\u00a9\u00aa\7]\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\b\20\6\2\u00ac#\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae%\3\2\2\2\u00af"+
		"\u00b0\7+\2\2\u00b0\'\3\2\2\2\u00b1\u00b2\7.\2\2\u00b2)\3\2\2\2\u00b3"+
		"\u00b4\7\177\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\24\7\2\u00b6+\3\2\2"+
		"\2\u00b7\u00b8\t\t\2\2\u00b8-\3\2\2\2\u00b9\u00ba\t\n\2\2\u00ba/\3\2\2"+
		"\2\u00bb\u00bc\t\13\2\2\u00bc\61\3\2\2\2\u00bd\u00be\t\f\2\2\u00be\63"+
		"\3\2\2\2\u00bf\u00c0\t\r\2\2\u00c0\65\3\2\2\2\u00c1\u00c2\t\16\2\2\u00c2"+
		"\67\3\2\2\2\u00c3\u00c4\t\17\2\2\u00c49\3\2\2\2\u00c5\u00c6\t\20\2\2\u00c6"+
		";\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7h\2\2\u00c9=\3\2\2\2\u00ca\u00cb"+
		"\7g\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"?\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7f\2\2\u00d2"+
		"A\3\2\2\2\u00d3\u00d4\7i\2\2\u00d4\u00d5\7q\2\2\u00d5C\3\2\2\2\u00d6\u00d7"+
		"\7o\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7w\2\2\u00da"+
		"E\3\2\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\u00df\7k\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7p\2\2\u00e1G\3\2\2\2\u00e2"+
		"\u00e3\7r\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7m\2\2"+
		"\u00e6I\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7j\2\2\u00e9\u00ea\7k\2"+
		"\2\u00ea\u00eb\7u\2\2\u00ebK\3\2\2\2\u00ec\u00ed\5,\25\2\u00ed\u00ee\5"+
		".\26\2\u00ee\u00ef\5\60\27\2\u00ef\u00f0\5\62\30\2\u00f0M\3\2\2\2\u00f1"+
		"\u00f2\5\64\31\2\u00f2\u00f3\5\66\32\2\u00f3\u00f4\58\33\2\u00f4\u00f5"+
		"\5:\34\2\u00f5\u00f6\5\62\30\2\u00f6O\3\2\2\2\u00f7\u00f9\5\f\5\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u0102\3\2\2\2\u00fc\u00fe\t\21\2\2\u00fd\u00ff\5\f\5\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"Q\3\2\2\2\u0104\u0108\5\6\2\2\u0105\u0108\5\b\3\2\u0106\u0108\7a\2\2\u0107"+
		"\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010aS\3\2\2\2\u010b\u010c"+
		"\7?\2\2\u010cU\3\2\2\2\u010d\u010e\7?\2\2\u010e\u0117\7?\2\2\u010f\u0110"+
		"\7#\2\2\u0110\u0117\7?\2\2\u0111\u0117\t\22\2\2\u0112\u0113\7@\2\2\u0113"+
		"\u0117\7?\2\2\u0114\u0115\7>\2\2\u0115\u0117\7?\2\2\u0116\u010d\3\2\2"+
		"\2\u0116\u010f\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0117W\3\2\2\2\u0118\u0119\t\23\2\2\u0119Y\3\2\2\2\u011a\u011b"+
		"\t\24\2\2\u011b[\3\2\2\2\u011c\u011d\7~\2\2\u011d]\3\2\2\2\u011e\u0122"+
		"\n\25\2\2\u011f\u0120\7\61\2\2\u0120\u0122\n\b\2\2\u0121\u011e\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124_\3\2\2\2\u0125\u0126\7_\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\b/\7\2\u0128a\3\2\2\2\u0129\u012b\n\26\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012dc\3\2\2\2"+
		"\u012e\u012f\7_\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b\61\7\2\u0131e\3"+
		"\2\2\2\30\2\3\4\5ry{\u0083\u0095\u0097\u009c\u009e\u00a3\u00fa\u0100\u0102"+
		"\u0107\u0109\u0116\u0121\u0123\u012c\b\b\2\2\2\3\2\7\3\2\7\4\2\7\5\2\6"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}