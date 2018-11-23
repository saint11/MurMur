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
		COMMAND_PARAMS_SEPARATOR=11, COMMAND_END=12, KEYWORD_IF=13, KEYWORD_END=14, 
		KEYWORD_GOTO=15, KEYWORD_MENU=16, KEYWORD_MENU_OPTION=17, KEYWORD_PICK=18, 
		KEYWORD_PICK_THIS=19, NUMBER=20, INT=21, WORD=22, COMPARISSON_SIGNAL=23, 
		MUL_DIV_SIGNAL=24, ADD_SUB_SIGNAL=25, SUB_TEXT_SEPARATOR=26, FAST_PICK_TEXT=27, 
		FAST_PICK_END=28, STRING=29, COMMAND_STRING_END=30;
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
		"COMMAND_END", "KEYWORD_IF", "KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", 
		"KEYWORD_MENU_OPTION", "KEYWORD_PICK", "KEYWORD_PICK_THIS", "NUMBER", 
		"INT", "WORD", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", 
		"SUB_TEXT_SEPARATOR", "FAST_PICK_TEXT", "FAST_PICK_END", "STRING", "COMMAND_STRING_END"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LINE_COMMENT", "TAG_START", "COMMAND_START", 
		"FAST_PICK_START", "TEXT", "COMMAND_IGNORE", "COMMAND_PARAMS_START", "COMMAND_STRING_START", 
		"COMMAND_PARAMS_SEPARATOR", "COMMAND_END", "KEYWORD_IF", "KEYWORD_END", 
		"KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", "KEYWORD_PICK", 
		"KEYWORD_PICK_THIS", "NUMBER", "INT", "WORD", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", 
		"ADD_SUB_SIGNAL", "SUB_TEXT_SEPARATOR", "FAST_PICK_TEXT", "FAST_PICK_END", 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00f0\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\6\6\6U\n\6\r\6\16\6V\3\6\3\6\3\7\3\7\3\7\6\7^\n\7\r\7\16\7_\3\b\3\b\3"+
		"\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\6\fz\n\f\r\f\16\f{\3\r\3\r\3\r\6\r\u0081\n\r"+
		"\r\r\16\r\u0082\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\6\31\u00b4\n\31\r\31\16\31\u00b5"+
		"\3\31\3\31\6\31\u00ba\n\31\r\31\16\31\u00bb\5\31\u00be\n\31\3\32\6\32"+
		"\u00c1\n\32\r\32\16\32\u00c2\3\33\3\33\3\33\6\33\u00c8\n\33\r\33\16\33"+
		"\u00c9\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00d5\n\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \6 \u00e0\n \r \16 \u00e1\3!\3!\3"+
		"!\3!\3\"\6\"\u00e9\n\"\r\"\16\"\u00ea\3#\3#\3#\3#\2\2$\6\2\b\2\n\2\f\2"+
		"\16\3\20\4\22\5\24\6\26\7\30\b\32\t\34\n\36\13 \f\"\r$\16&\17(\20*\21"+
		",\22.\23\60\24\62\25\64\26\66\278\30:\31<\32>\33@\34B\35D\36F\37H \6\2"+
		"\3\4\5\20\3\2c|\3\2C\\\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\t\2\f\f\17"+
		"\17%%\61\61BB]]}}\3\2\61\61\5\2\13\f\17\17\"\"\4\2..\60\60\4\2>>@@\4\2"+
		",,\61\61\4\2--//\7\2\f\f\17\17\61\61__~\177\3\2__\2\u00fe\2\16\3\2\2\2"+
		"\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32"+
		"\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3"+
		"&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62"+
		"\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3"+
		">\3\2\2\2\4@\3\2\2\2\4B\3\2\2\2\4D\3\2\2\2\5F\3\2\2\2\5H\3\2\2\2\6J\3"+
		"\2\2\2\bL\3\2\2\2\nN\3\2\2\2\fQ\3\2\2\2\16T\3\2\2\2\20]\3\2\2\2\22a\3"+
		"\2\2\2\24l\3\2\2\2\26n\3\2\2\2\30r\3\2\2\2\32y\3\2\2\2\34\u0080\3\2\2"+
		"\2\36\u0086\3\2\2\2 \u0088\3\2\2\2\"\u008c\3\2\2\2$\u008e\3\2\2\2&\u0092"+
		"\3\2\2\2(\u0095\3\2\2\2*\u0099\3\2\2\2,\u009c\3\2\2\2.\u00a1\3\2\2\2\60"+
		"\u00a8\3\2\2\2\62\u00ad\3\2\2\2\64\u00b3\3\2\2\2\66\u00c0\3\2\2\28\u00c7"+
		"\3\2\2\2:\u00d4\3\2\2\2<\u00d6\3\2\2\2>\u00d8\3\2\2\2@\u00da\3\2\2\2B"+
		"\u00df\3\2\2\2D\u00e3\3\2\2\2F\u00e8\3\2\2\2H\u00ec\3\2\2\2JK\t\2\2\2"+
		"K\7\3\2\2\2LM\t\3\2\2M\t\3\2\2\2NO\7\61\2\2OP\7\61\2\2P\13\3\2\2\2QR\t"+
		"\4\2\2R\r\3\2\2\2SU\t\5\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX"+
		"\3\2\2\2XY\b\6\2\2Y\17\3\2\2\2Z^\t\6\2\2[\\\7\17\2\2\\^\7\f\2\2]Z\3\2"+
		"\2\2][\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\21\3\2\2\2ab\7\61\2\2bc"+
		"\7\61\2\2cg\3\2\2\2df\n\6\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hj\3\2\2\2ig\3\2\2\2jk\b\b\3\2k\23\3\2\2\2lm\7%\2\2m\25\3\2\2\2no\7}\2"+
		"\2op\3\2\2\2pq\b\n\4\2q\27\3\2\2\2rs\7]\2\2st\3\2\2\2tu\b\13\5\2u\31\3"+
		"\2\2\2vz\n\7\2\2wx\7\61\2\2xz\n\b\2\2yv\3\2\2\2yw\3\2\2\2z{\3\2\2\2{y"+
		"\3\2\2\2{|\3\2\2\2|\33\3\2\2\2}\u0081\t\t\2\2~\177\7\17\2\2\177\u0081"+
		"\7\f\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\r\2\2\u0085"+
		"\35\3\2\2\2\u0086\u0087\7<\2\2\u0087\37\3\2\2\2\u0088\u0089\7]\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\b\17\6\2\u008b!\3\2\2\2\u008c\u008d\7.\2\2"+
		"\u008d#\3\2\2\2\u008e\u008f\7\177\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\b\21\7\2\u0091%\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7h\2\2\u0094\'"+
		"\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7f\2\2\u0098"+
		")\3\2\2\2\u0099\u009a\7i\2\2\u009a\u009b\7q\2\2\u009b+\3\2\2\2\u009c\u009d"+
		"\7o\2\2\u009d\u009e\7g\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7w\2\2\u00a0"+
		"-\3\2\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7p\2\2\u00a7/\3\2\2\2\u00a8"+
		"\u00a9\7r\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7m\2\2"+
		"\u00ac\61\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7"+
		"k\2\2\u00b0\u00b1\7u\2\2\u00b1\63\3\2\2\2\u00b2\u00b4\5\f\5\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00bd\3\2\2\2\u00b7\u00b9\t\n\2\2\u00b8\u00ba\5\f\5\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\65\3\2\2"+
		"\2\u00bf\u00c1\5\f\5\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\67\3\2\2\2\u00c4\u00c8\5\6\2\2\u00c5"+
		"\u00c8\5\b\3\2\u00c6\u00c8\7a\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca9\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\u00d5\7?\2\2\u00cd"+
		"\u00ce\7#\2\2\u00ce\u00d5\7?\2\2\u00cf\u00d5\t\13\2\2\u00d0\u00d1\7@\2"+
		"\2\u00d1\u00d5\7?\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d5\7?\2\2\u00d4\u00cb"+
		"\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5;\3\2\2\2\u00d6\u00d7\t\f\2\2\u00d7=\3\2\2\2\u00d8"+
		"\u00d9\t\r\2\2\u00d9?\3\2\2\2\u00da\u00db\7~\2\2\u00dbA\3\2\2\2\u00dc"+
		"\u00e0\n\16\2\2\u00dd\u00de\7\61\2\2\u00de\u00e0\n\b\2\2\u00df\u00dc\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2C\3\2\2\2\u00e3\u00e4\7_\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\b!\7\2\u00e6E\3\2\2\2\u00e7\u00e9\n\17\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ebG\3"+
		"\2\2\2\u00ec\u00ed\7_\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b#\7\2\u00ef"+
		"I\3\2\2\2\30\2\3\4\5V]_gy{\u0080\u0082\u00b5\u00bb\u00bd\u00c2\u00c7\u00c9"+
		"\u00d4\u00df\u00e1\u00ea\b\b\2\2\2\3\2\7\3\2\7\4\2\7\5\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}