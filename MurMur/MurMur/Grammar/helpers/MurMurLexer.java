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
		KEYWORD_PICK_THIS=19, TRUE=20, FALSE=21, NUMBER=22, INT=23, WORD=24, COMPARISSON_SIGNAL=25, 
		MUL_DIV_SIGNAL=26, ADD_SUB_SIGNAL=27, SUB_TEXT_SEPARATOR=28, FAST_PICK_TEXT=29, 
		FAST_PICK_END=30, STRING=31, COMMAND_STRING_END=32;
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
		"COMMAND_END", "T", "R", "U", "E", "F", "A", "L", "S", "KEYWORD_IF", "KEYWORD_END", 
		"KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", "KEYWORD_PICK", 
		"KEYWORD_PICK_THIS", "TRUE", "FALSE", "NUMBER", "INT", "WORD", "COMPARISSON_SIGNAL", 
		"MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", "SUB_TEXT_SEPARATOR", "FAST_PICK_TEXT", 
		"FAST_PICK_END", "STRING", "COMMAND_STRING_END"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LINE_COMMENT", "TAG_START", "COMMAND_START", 
		"FAST_PICK_START", "TEXT", "COMMAND_IGNORE", "COMMAND_PARAMS_START", "COMMAND_STRING_START", 
		"COMMAND_PARAMS_SEPARATOR", "COMMAND_END", "KEYWORD_IF", "KEYWORD_END", 
		"KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", "KEYWORD_PICK", 
		"KEYWORD_PICK_THIS", "TRUE", "FALSE", "NUMBER", "INT", "WORD", "COMPARISSON_SIGNAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u011f\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\6\6i"+
		"\n\6\r\6\16\6j\3\6\3\6\3\7\3\7\3\7\6\7r\n\7\r\7\16\7s\3\b\3\b\3\b\3\b"+
		"\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\6\f\u008e\n\f\r\f\16\f\u008f\3\r\3\r\3\r\6\r\u0095\n"+
		"\r\r\r\16\r\u0096\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\6#\u00e3\n#\r#\16#\u00e4\3#\3#\6#\u00e9\n#\r#\16#\u00ea\5#\u00ed"+
		"\n#\3$\6$\u00f0\n$\r$\16$\u00f1\3%\3%\3%\6%\u00f7\n%\r%\16%\u00f8\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\5&\u0104\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\6*\u010f"+
		"\n*\r*\16*\u0110\3+\3+\3+\3+\3,\6,\u0118\n,\r,\16,\u0119\3-\3-\3-\3-\2"+
		"\2.\6\2\b\2\n\2\f\2\16\3\20\4\22\5\24\6\26\7\30\b\32\t\34\n\36\13 \f\""+
		"\r$\16&\2(\2*\2,\2.\2\60\2\62\2\64\2\66\178\20:\21<\22>\23@\24B\25D\26"+
		"F\27H\30J\31L\32N\33P\34R\35T\36V\37X Z!\\\"\6\2\3\4\5\30\3\2c|\3\2C\\"+
		"\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\t\2\f\f\17\17%%\61\61BB]]}}\3\2\61"+
		"\61\5\2\13\f\17\17\"\"\4\2VVvv\4\2TTtt\4\2WWww\4\2GGgg\4\2HHhh\4\2CCc"+
		"c\4\2NNnn\4\2UUuu\4\2..\60\60\4\2>>@@\4\2,,\61\61\4\2--//\7\2\f\f\17\17"+
		"\61\61__~\177\3\2__\2\u0125\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24"+
		"\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2"+
		"\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2"+
		"\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2"+
		"\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3\2\2\2\3R\3\2\2\2\4T"+
		"\3\2\2\2\4V\3\2\2\2\4X\3\2\2\2\5Z\3\2\2\2\5\\\3\2\2\2\6^\3\2\2\2\b`\3"+
		"\2\2\2\nb\3\2\2\2\fe\3\2\2\2\16h\3\2\2\2\20q\3\2\2\2\22u\3\2\2\2\24\u0080"+
		"\3\2\2\2\26\u0082\3\2\2\2\30\u0086\3\2\2\2\32\u008d\3\2\2\2\34\u0094\3"+
		"\2\2\2\36\u009a\3\2\2\2 \u009c\3\2\2\2\"\u00a0\3\2\2\2$\u00a2\3\2\2\2"+
		"&\u00a6\3\2\2\2(\u00a8\3\2\2\2*\u00aa\3\2\2\2,\u00ac\3\2\2\2.\u00ae\3"+
		"\2\2\2\60\u00b0\3\2\2\2\62\u00b2\3\2\2\2\64\u00b4\3\2\2\2\66\u00b6\3\2"+
		"\2\28\u00b9\3\2\2\2:\u00bd\3\2\2\2<\u00c0\3\2\2\2>\u00c5\3\2\2\2@\u00cc"+
		"\3\2\2\2B\u00d1\3\2\2\2D\u00d6\3\2\2\2F\u00db\3\2\2\2H\u00e2\3\2\2\2J"+
		"\u00ef\3\2\2\2L\u00f6\3\2\2\2N\u0103\3\2\2\2P\u0105\3\2\2\2R\u0107\3\2"+
		"\2\2T\u0109\3\2\2\2V\u010e\3\2\2\2X\u0112\3\2\2\2Z\u0117\3\2\2\2\\\u011b"+
		"\3\2\2\2^_\t\2\2\2_\7\3\2\2\2`a\t\3\2\2a\t\3\2\2\2bc\7\61\2\2cd\7\61\2"+
		"\2d\13\3\2\2\2ef\t\4\2\2f\r\3\2\2\2gi\t\5\2\2hg\3\2\2\2ij\3\2\2\2jh\3"+
		"\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\6\2\2m\17\3\2\2\2nr\t\6\2\2op\7\17\2\2"+
		"pr\7\f\2\2qn\3\2\2\2qo\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\21\3\2\2"+
		"\2uv\7\61\2\2vw\7\61\2\2w{\3\2\2\2xz\n\6\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2"+
		"\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\b\b\3\2\177\23\3\2\2\2\u0080\u0081"+
		"\7%\2\2\u0081\25\3\2\2\2\u0082\u0083\7}\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\b\n\4\2\u0085\27\3\2\2\2\u0086\u0087\7]\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\u0089\b\13\5\2\u0089\31\3\2\2\2\u008a\u008e\n\7\2\2\u008b\u008c"+
		"\7\61\2\2\u008c\u008e\n\b\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\33"+
		"\3\2\2\2\u0091\u0095\t\t\2\2\u0092\u0093\7\17\2\2\u0093\u0095\7\f\2\2"+
		"\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\r\2\2\u0099"+
		"\35\3\2\2\2\u009a\u009b\7<\2\2\u009b\37\3\2\2\2\u009c\u009d\7]\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\b\17\6\2\u009f!\3\2\2\2\u00a0\u00a1\7.\2\2"+
		"\u00a1#\3\2\2\2\u00a2\u00a3\7\177\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\b\21\7\2\u00a5%\3\2\2\2\u00a6\u00a7\t\n\2\2\u00a7\'\3\2\2\2\u00a8\u00a9"+
		"\t\13\2\2\u00a9)\3\2\2\2\u00aa\u00ab\t\f\2\2\u00ab+\3\2\2\2\u00ac\u00ad"+
		"\t\r\2\2\u00ad-\3\2\2\2\u00ae\u00af\t\16\2\2\u00af/\3\2\2\2\u00b0\u00b1"+
		"\t\17\2\2\u00b1\61\3\2\2\2\u00b2\u00b3\t\20\2\2\u00b3\63\3\2\2\2\u00b4"+
		"\u00b5\t\21\2\2\u00b5\65\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7h\2\2"+
		"\u00b8\67\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7"+
		"f\2\2\u00bc9\3\2\2\2\u00bd\u00be\7i\2\2\u00be\u00bf\7q\2\2\u00bf;\3\2"+
		"\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4"+
		"\7w\2\2\u00c4=\3\2\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8"+
		"\7v\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7p\2\2\u00cb"+
		"?\3\2\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7e\2\2\u00cf"+
		"\u00d0\7m\2\2\u00d0A\3\2\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7j\2\2\u00d3"+
		"\u00d4\7k\2\2\u00d4\u00d5\7u\2\2\u00d5C\3\2\2\2\u00d6\u00d7\5&\22\2\u00d7"+
		"\u00d8\5(\23\2\u00d8\u00d9\5*\24\2\u00d9\u00da\5,\25\2\u00daE\3\2\2\2"+
		"\u00db\u00dc\5.\26\2\u00dc\u00dd\5\60\27\2\u00dd\u00de\5\62\30\2\u00de"+
		"\u00df\5\64\31\2\u00df\u00e0\5,\25\2\u00e0G\3\2\2\2\u00e1\u00e3\5\f\5"+
		"\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00ec\3\2\2\2\u00e6\u00e8\t\22\2\2\u00e7\u00e9\5\f\5\2"+
		"\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"I\3\2\2\2\u00ee\u00f0\5\f\5\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2K\3\2\2\2\u00f3\u00f7\5"+
		"\6\2\2\u00f4\u00f7\5\b\3\2\u00f5\u00f7\7a\2\2\u00f6\u00f3\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9M\3\2\2\2\u00fa\u00fb\7?\2\2\u00fb\u0104"+
		"\7?\2\2\u00fc\u00fd\7#\2\2\u00fd\u0104\7?\2\2\u00fe\u0104\t\23\2\2\u00ff"+
		"\u0100\7@\2\2\u0100\u0104\7?\2\2\u0101\u0102\7>\2\2\u0102\u0104\7?\2\2"+
		"\u0103\u00fa\3\2\2\2\u0103\u00fc\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0104O\3\2\2\2\u0105\u0106\t\24\2\2\u0106"+
		"Q\3\2\2\2\u0107\u0108\t\25\2\2\u0108S\3\2\2\2\u0109\u010a\7~\2\2\u010a"+
		"U\3\2\2\2\u010b\u010f\n\26\2\2\u010c\u010d\7\61\2\2\u010d\u010f\n\b\2"+
		"\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111W\3\2\2\2\u0112\u0113\7_\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\b+\7\2\u0115Y\3\2\2\2\u0116\u0118\n\27\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a[\3\2\2\2\u011b\u011c\7_\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\b-\7\2\u011e]\3\2\2\2\30\2\3\4\5jqs{\u008d\u008f\u0094\u0096\u00e4\u00ea"+
		"\u00ec\u00f1\u00f6\u00f8\u0103\u010e\u0110\u0119\b\b\2\2\2\3\2\7\3\2\7"+
		"\4\2\7\5\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}