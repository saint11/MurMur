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
		FAST_PICK_START=6, INCLUDE_KEYWORD=7, TEXT=8, COMMAND_NEWLINE=9, NEW_TAG=10, 
		COMMAND_IGNORE=11, COMMAND_PARAMS_START=12, COMMAND_STRING_START=13, OPEN_PAREN=14, 
		CLOSE_PAREN=15, COMMAND_PARAMS_SEPARATOR=16, COMMAND_END=17, KEYWORD_IF=18, 
		KEYWORD_ELSE=19, KEYWORD_END=20, KEYWORD_GOTO=21, KEYWORD_MENU=22, KEYWORD_MENU_OPTION=23, 
		KEYWORD_PICK=24, KEYWORD_PICK_THIS=25, TRUE=26, FALSE=27, NUMBER=28, WORD=29, 
		ASSIGN_SIGNAL=30, COMPARISSON_SIGNAL=31, MUL_DIV_SIGNAL=32, ADD_SUB_SIGNAL=33, 
		SUB_TEXT_SEPARATOR=34, FAST_PICK_TEXT=35, FAST_PICK_END=36, STRING=37, 
		COMMAND_STRING_END=38;
	public static final int
		INSIDE_COMMAND=1, FAST_PICK=2, STRING_MODE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE_COMMAND", "FAST_PICK", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"LOWERCASE", "UPPERCASE", "COMMENT_ESCAPE", "DIGIT", "TAG", "WHITESPACE", 
		"NEWLINE", "LINE_COMMENT", "TAG_START", "COMMAND_START", "FAST_PICK_START", 
		"INCLUDE_KEYWORD", "TEXT", "COMMAND_NEWLINE", "NEW_TAG", "COMMAND_IGNORE", 
		"COMMAND_PARAMS_START", "COMMAND_STRING_START", "OPEN_PAREN", "CLOSE_PAREN", 
		"COMMAND_PARAMS_SEPARATOR", "COMMAND_END", "T", "R", "U", "E", "F", "A", 
		"L", "S", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_END", "KEYWORD_GOTO", 
		"KEYWORD_MENU", "KEYWORD_MENU_OPTION", "KEYWORD_PICK", "KEYWORD_PICK_THIS", 
		"TRUE", "FALSE", "NUMBER", "WORD", "ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", 
		"MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", "SUB_TEXT_SEPARATOR", "FAST_PICK_TEXT", 
		"FAST_PICK_END", "STRING", "COMMAND_STRING_END"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'@include'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LINE_COMMENT", "TAG_START", "COMMAND_START", 
		"FAST_PICK_START", "INCLUDE_KEYWORD", "TEXT", "COMMAND_NEWLINE", "NEW_TAG", 
		"COMMAND_IGNORE", "COMMAND_PARAMS_START", "COMMAND_STRING_START", "OPEN_PAREN", 
		"CLOSE_PAREN", "COMMAND_PARAMS_SEPARATOR", "COMMAND_END", "KEYWORD_IF", 
		"KEYWORD_ELSE", "KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u014c\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7y\n"+
		"\7\r\7\16\7z\3\7\3\7\3\b\3\b\3\b\6\b\u0082\n\b\r\b\16\b\u0083\3\t\3\t"+
		"\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\6\16\u00a9\n\16\r\16\16\16\u00aa\3\17\3\17\3\17\5\17\u00b0"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u00b7\n\20\3\20\3\20\3\21\6\21\u00bc"+
		"\n\21\r\21\16\21\u00bd\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*"+
		"\6*\u0113\n*\r*\16*\u0114\3*\3*\6*\u0119\n*\r*\16*\u011a\5*\u011d\n*\3"+
		"+\3+\3+\6+\u0122\n+\r+\16+\u0123\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0131"+
		"\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\6\61\u013c\n\61\r\61\16\61\u013d"+
		"\3\62\3\62\3\62\3\62\3\63\6\63\u0145\n\63\r\63\16\63\u0146\3\64\3\64\3"+
		"\64\3\64\2\2\65\6\2\b\2\n\2\f\2\16\2\20\3\22\4\24\5\26\6\30\7\32\b\34"+
		"\t\36\n \13\"\f$\r&\16(\17*\20,\21.\22\60\23\62\2\64\2\66\28\2:\2<\2>"+
		"\2@\2B\24D\25F\26H\27J\30L\31N\32P\33R\34T\35V\36X\37Z \\!^\"`#b$d%f&"+
		"h\'j(\6\2\3\4\5\30\3\2c|\3\2C\\\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\t"+
		"\2\f\f\17\17%%\61\61BB]]}}\3\2\61\61\3\2%%\4\2VVvv\4\2TTtt\4\2WWww\4\2"+
		"GGgg\4\2HHhh\4\2CCcc\4\2NNnn\4\2UUuu\3\2\60\60\4\2>>@@\4\2,,\61\61\4\2"+
		"--//\7\2\f\f\17\17\61\61__~\177\3\2__\2\u0151\2\20\3\2\2\2\2\22\3\2\2"+
		"\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2"+
		"\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3"+
		"*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\3F"+
		"\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3\2\2\2\3R\3\2"+
		"\2\2\3T\3\2\2\2\3V\3\2\2\2\3X\3\2\2\2\3Z\3\2\2\2\3\\\3\2\2\2\3^\3\2\2"+
		"\2\3`\3\2\2\2\4b\3\2\2\2\4d\3\2\2\2\4f\3\2\2\2\5h\3\2\2\2\5j\3\2\2\2\6"+
		"l\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\fs\3\2\2\2\16u\3\2\2\2\20x\3\2\2\2\22"+
		"\u0081\3\2\2\2\24\u0085\3\2\2\2\26\u0090\3\2\2\2\30\u0092\3\2\2\2\32\u0096"+
		"\3\2\2\2\34\u009a\3\2\2\2\36\u00a8\3\2\2\2 \u00af\3\2\2\2\"\u00b6\3\2"+
		"\2\2$\u00bb\3\2\2\2&\u00c1\3\2\2\2(\u00c3\3\2\2\2*\u00c7\3\2\2\2,\u00c9"+
		"\3\2\2\2.\u00cb\3\2\2\2\60\u00cd\3\2\2\2\62\u00d1\3\2\2\2\64\u00d3\3\2"+
		"\2\2\66\u00d5\3\2\2\28\u00d7\3\2\2\2:\u00d9\3\2\2\2<\u00db\3\2\2\2>\u00dd"+
		"\3\2\2\2@\u00df\3\2\2\2B\u00e1\3\2\2\2D\u00e4\3\2\2\2F\u00e9\3\2\2\2H"+
		"\u00ed\3\2\2\2J\u00f0\3\2\2\2L\u00f5\3\2\2\2N\u00fc\3\2\2\2P\u0101\3\2"+
		"\2\2R\u0106\3\2\2\2T\u010b\3\2\2\2V\u0112\3\2\2\2X\u0121\3\2\2\2Z\u0125"+
		"\3\2\2\2\\\u0130\3\2\2\2^\u0132\3\2\2\2`\u0134\3\2\2\2b\u0136\3\2\2\2"+
		"d\u013b\3\2\2\2f\u013f\3\2\2\2h\u0144\3\2\2\2j\u0148\3\2\2\2lm\t\2\2\2"+
		"m\7\3\2\2\2no\t\3\2\2o\t\3\2\2\2pq\7\61\2\2qr\7\61\2\2r\13\3\2\2\2st\t"+
		"\4\2\2t\r\3\2\2\2uv\7%\2\2v\17\3\2\2\2wy\t\5\2\2xw\3\2\2\2yz\3\2\2\2z"+
		"x\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\7\2\2}\21\3\2\2\2~\u0082\t\6\2\2\177"+
		"\u0080\7\17\2\2\u0080\u0082\7\f\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\23\3\2\2"+
		"\2\u0085\u0086\7\61\2\2\u0086\u0087\7\61\2\2\u0087\u008b\3\2\2\2\u0088"+
		"\u008a\n\6\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\b\t\3\2\u008f\25\3\2\2\2\u0090\u0091\5\16\6\2\u0091\27\3\2\2\2"+
		"\u0092\u0093\7}\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\13\4\2\u0095\31"+
		"\3\2\2\2\u0096\u0097\7]\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\f\5\2\u0099"+
		"\33\3\2\2\2\u009a\u009b\7B\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d"+
		"\u009e\7e\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7f\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\r\4\2\u00a4\35\3"+
		"\2\2\2\u00a5\u00a9\n\7\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a9\n\b\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\37\3\2\2\2\u00ac\u00b0\t\6\2\2\u00ad\u00ae"+
		"\7\17\2\2\u00ae\u00b0\7\f\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\n\t\2\2\u00b2!\3\2\2\2\u00b3\u00b7\t"+
		"\6\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00b7\7\f\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\20\6\2\u00b9#\3\2\2\2"+
		"\u00ba\u00bc\t\5\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\21\2\2"+
		"\u00c0%\3\2\2\2\u00c1\u00c2\7<\2\2\u00c2\'\3\2\2\2\u00c3\u00c4\7]\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\23\7\2\u00c6)\3\2\2\2\u00c7\u00c8\7"+
		"*\2\2\u00c8+\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca-\3\2\2\2\u00cb\u00cc\7."+
		"\2\2\u00cc/\3\2\2\2\u00cd\u00ce\7\177\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\b\27\6\2\u00d0\61\3\2\2\2\u00d1\u00d2\t\n\2\2\u00d2\63\3\2\2\2\u00d3"+
		"\u00d4\t\13\2\2\u00d4\65\3\2\2\2\u00d5\u00d6\t\f\2\2\u00d6\67\3\2\2\2"+
		"\u00d7\u00d8\t\r\2\2\u00d89\3\2\2\2\u00d9\u00da\t\16\2\2\u00da;\3\2\2"+
		"\2\u00db\u00dc\t\17\2\2\u00dc=\3\2\2\2\u00dd\u00de\t\20\2\2\u00de?\3\2"+
		"\2\2\u00df\u00e0\t\21\2\2\u00e0A\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3"+
		"\7h\2\2\u00e3C\3\2\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7"+
		"\7u\2\2\u00e7\u00e8\7g\2\2\u00e8E\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7p\2\2\u00eb\u00ec\7f\2\2\u00ecG\3\2\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef"+
		"\7q\2\2\u00efI\3\2\2\2\u00f0\u00f1\7o\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3"+
		"\7p\2\2\u00f3\u00f4\7w\2\2\u00f4K\3\2\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7"+
		"\7r\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7q\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fbM\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7k\2\2\u00fe"+
		"\u00ff\7e\2\2\u00ff\u0100\7m\2\2\u0100O\3\2\2\2\u0101\u0102\7v\2\2\u0102"+
		"\u0103\7j\2\2\u0103\u0104\7k\2\2\u0104\u0105\7u\2\2\u0105Q\3\2\2\2\u0106"+
		"\u0107\5\62\30\2\u0107\u0108\5\64\31\2\u0108\u0109\5\66\32\2\u0109\u010a"+
		"\58\33\2\u010aS\3\2\2\2\u010b\u010c\5:\34\2\u010c\u010d\5<\35\2\u010d"+
		"\u010e\5>\36\2\u010e\u010f\5@\37\2\u010f\u0110\58\33\2\u0110U\3\2\2\2"+
		"\u0111\u0113\5\f\5\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011c\3\2\2\2\u0116\u0118\t\22\2\2"+
		"\u0117\u0119\5\f\5\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0116\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011dW\3\2\2\2\u011e\u0122\5\6\2\2\u011f\u0122\5\b\3\2"+
		"\u0120\u0122\7a\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"Y\3\2\2\2\u0125\u0126\7?\2\2\u0126[\3\2\2\2\u0127\u0128\7?\2\2\u0128\u0131"+
		"\7?\2\2\u0129\u012a\7#\2\2\u012a\u0131\7?\2\2\u012b\u0131\t\23\2\2\u012c"+
		"\u012d\7@\2\2\u012d\u0131\7?\2\2\u012e\u012f\7>\2\2\u012f\u0131\7?\2\2"+
		"\u0130\u0127\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131]\3\2\2\2\u0132\u0133\t\24\2\2\u0133"+
		"_\3\2\2\2\u0134\u0135\t\25\2\2\u0135a\3\2\2\2\u0136\u0137\7~\2\2\u0137"+
		"c\3\2\2\2\u0138\u013c\n\26\2\2\u0139\u013a\7\61\2\2\u013a\u013c\n\b\2"+
		"\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013ee\3\2\2\2\u013f\u0140\7_\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0142\b\62\6\2\u0142g\3\2\2\2\u0143\u0145\n\27\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147i\3\2\2\2\u0148\u0149\7_\2\2\u0149\u014a\3\2\2\2\u014a\u014b"+
		"\b\64\6\2\u014bk\3\2\2\2\30\2\3\4\5z\u0081\u0083\u008b\u00a8\u00aa\u00af"+
		"\u00b6\u00bd\u0114\u011a\u011c\u0121\u0123\u0130\u013b\u013d\u0146\b\b"+
		"\2\2\2\3\2\7\3\2\7\4\2\6\2\2\7\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}