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
		KEYWORD_PICK=19, KEYWORD_PICK_THIS=20, TRUE=21, FALSE=22, NUMBER=23, INT=24, 
		WORD=25, ASSIGN_SIGNAL=26, COMPARISSON_SIGNAL=27, MUL_DIV_SIGNAL=28, ADD_SUB_SIGNAL=29, 
		SUB_TEXT_SEPARATOR=30, FAST_PICK_TEXT=31, FAST_PICK_END=32, STRING=33, 
		COMMAND_STRING_END=34;
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
		"KEYWORD_PICK", "KEYWORD_PICK_THIS", "TRUE", "FALSE", "NUMBER", "INT", 
		"WORD", "ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", 
		"SUB_TEXT_SEPARATOR", "FAST_PICK_TEXT", "FAST_PICK_END", "STRING", "COMMAND_STRING_END"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LINE_COMMENT", "TAG_START", "COMMAND_START", 
		"FAST_PICK_START", "TEXT", "COMMAND_IGNORE", "COMMAND_PARAMS_START", "COMMAND_STRING_START", 
		"COMMAND_PARAMS_SEPARATOR", "COMMAND_END", "KEYWORD_IF", "KEYWORD_ELSE", 
		"KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", 
		"KEYWORD_PICK", "KEYWORD_PICK_THIS", "TRUE", "FALSE", "NUMBER", "INT", 
		"WORD", "ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u012a\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\6\6m\n\6\r\6\16\6n\3\6\3\6\3\7\3\7\3\7\6\7v\n\7\r\7\16\7w\3\b\3"+
		"\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\6\f\u0092\n\f\r\f\16\f\u0093\3\r\3"+
		"\r\3\r\6\r\u0099\n\r\r\r\16\r\u009a\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\6$\u00ec\n$\r$\16$\u00ed\3$\3"+
		"$\6$\u00f2\n$\r$\16$\u00f3\5$\u00f6\n$\3%\6%\u00f9\n%\r%\16%\u00fa\3&"+
		"\3&\3&\6&\u0100\n&\r&\16&\u0101\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5("+
		"\u010f\n(\3)\3)\3*\3*\3+\3+\3,\3,\3,\6,\u011a\n,\r,\16,\u011b\3-\3-\3"+
		"-\3-\3.\6.\u0123\n.\r.\16.\u0124\3/\3/\3/\3/\2\2\60\6\2\b\2\n\2\f\2\16"+
		"\3\20\4\22\5\24\6\26\7\30\b\32\t\34\n\36\13 \f\"\r$\16&\2(\2*\2,\2.\2"+
		"\60\2\62\2\64\2\66\178\20:\21<\22>\23@\24B\25D\26F\27H\30J\31L\32N\33"+
		"P\34R\35T\36V\37X Z!\\\"^#`$\6\2\3\4\5\30\3\2c|\3\2C\\\3\2\62;\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\t\2\f\f\17\17%%\61\61BB]]}}\3\2\61\61\5\2\13\f\17"+
		"\17\"\"\4\2VVvv\4\2TTtt\4\2WWww\4\2GGgg\4\2HHhh\4\2CCcc\4\2NNnn\4\2UU"+
		"uu\4\2..\60\60\4\2>>@@\4\2,,\61\61\4\2--//\7\2\f\f\17\17\61\61__~\177"+
		"\3\2__\2\u0130\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26"+
		"\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2"+
		"\2\3\"\3\2\2\2\3$\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2"+
		"\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3"+
		"J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3\2\2\2\3R\3\2\2\2\3T\3\2\2\2\3V\3"+
		"\2\2\2\4X\3\2\2\2\4Z\3\2\2\2\4\\\3\2\2\2\5^\3\2\2\2\5`\3\2\2\2\6b\3\2"+
		"\2\2\bd\3\2\2\2\nf\3\2\2\2\fi\3\2\2\2\16l\3\2\2\2\20u\3\2\2\2\22y\3\2"+
		"\2\2\24\u0084\3\2\2\2\26\u0086\3\2\2\2\30\u008a\3\2\2\2\32\u0091\3\2\2"+
		"\2\34\u0098\3\2\2\2\36\u009e\3\2\2\2 \u00a0\3\2\2\2\"\u00a4\3\2\2\2$\u00a6"+
		"\3\2\2\2&\u00aa\3\2\2\2(\u00ac\3\2\2\2*\u00ae\3\2\2\2,\u00b0\3\2\2\2."+
		"\u00b2\3\2\2\2\60\u00b4\3\2\2\2\62\u00b6\3\2\2\2\64\u00b8\3\2\2\2\66\u00ba"+
		"\3\2\2\28\u00bd\3\2\2\2:\u00c2\3\2\2\2<\u00c6\3\2\2\2>\u00c9\3\2\2\2@"+
		"\u00ce\3\2\2\2B\u00d5\3\2\2\2D\u00da\3\2\2\2F\u00df\3\2\2\2H\u00e4\3\2"+
		"\2\2J\u00eb\3\2\2\2L\u00f8\3\2\2\2N\u00ff\3\2\2\2P\u0103\3\2\2\2R\u010e"+
		"\3\2\2\2T\u0110\3\2\2\2V\u0112\3\2\2\2X\u0114\3\2\2\2Z\u0119\3\2\2\2\\"+
		"\u011d\3\2\2\2^\u0122\3\2\2\2`\u0126\3\2\2\2bc\t\2\2\2c\7\3\2\2\2de\t"+
		"\3\2\2e\t\3\2\2\2fg\7\61\2\2gh\7\61\2\2h\13\3\2\2\2ij\t\4\2\2j\r\3\2\2"+
		"\2km\t\5\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\6\2"+
		"\2q\17\3\2\2\2rv\t\6\2\2st\7\17\2\2tv\7\f\2\2ur\3\2\2\2us\3\2\2\2vw\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2x\21\3\2\2\2yz\7\61\2\2z{\7\61\2\2{\177\3\2"+
		"\2\2|~\n\6\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\b\b\3\2\u0083\23\3"+
		"\2\2\2\u0084\u0085\7%\2\2\u0085\25\3\2\2\2\u0086\u0087\7}\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\b\n\4\2\u0089\27\3\2\2\2\u008a\u008b\7]\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\b\13\5\2\u008d\31\3\2\2\2\u008e\u0092\n\7\2"+
		"\2\u008f\u0090\7\61\2\2\u0090\u0092\n\b\2\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\33\3\2\2\2\u0095\u0099\t\t\2\2\u0096\u0097\7\17\2\2\u0097\u0099"+
		"\7\f\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\r"+
		"\2\2\u009d\35\3\2\2\2\u009e\u009f\7<\2\2\u009f\37\3\2\2\2\u00a0\u00a1"+
		"\7]\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\17\6\2\u00a3!\3\2\2\2\u00a4"+
		"\u00a5\7.\2\2\u00a5#\3\2\2\2\u00a6\u00a7\7\177\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a9\b\21\7\2\u00a9%\3\2\2\2\u00aa\u00ab\t\n\2\2\u00ab\'\3\2\2"+
		"\2\u00ac\u00ad\t\13\2\2\u00ad)\3\2\2\2\u00ae\u00af\t\f\2\2\u00af+\3\2"+
		"\2\2\u00b0\u00b1\t\r\2\2\u00b1-\3\2\2\2\u00b2\u00b3\t\16\2\2\u00b3/\3"+
		"\2\2\2\u00b4\u00b5\t\17\2\2\u00b5\61\3\2\2\2\u00b6\u00b7\t\20\2\2\u00b7"+
		"\63\3\2\2\2\u00b8\u00b9\t\21\2\2\u00b9\65\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb"+
		"\u00bc\7h\2\2\u00bc\67\3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7n\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c19\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4\u00c5\7f\2\2\u00c5;\3\2\2\2\u00c6\u00c7\7i\2\2\u00c7"+
		"\u00c8\7q\2\2\u00c8=\3\2\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\u00cc\7p\2\2\u00cc\u00cd\7w\2\2\u00cd?\3\2\2\2\u00ce\u00cf\7q\2\2\u00cf"+
		"\u00d0\7r\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7q\2\2"+
		"\u00d3\u00d4\7p\2\2\u00d4A\3\2\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7k\2"+
		"\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7m\2\2\u00d9C\3\2\2\2\u00da\u00db\7"+
		"v\2\2\u00db\u00dc\7j\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7u\2\2\u00deE"+
		"\3\2\2\2\u00df\u00e0\5&\22\2\u00e0\u00e1\5(\23\2\u00e1\u00e2\5*\24\2\u00e2"+
		"\u00e3\5,\25\2\u00e3G\3\2\2\2\u00e4\u00e5\5.\26\2\u00e5\u00e6\5\60\27"+
		"\2\u00e6\u00e7\5\62\30\2\u00e7\u00e8\5\64\31\2\u00e8\u00e9\5,\25\2\u00e9"+
		"I\3\2\2\2\u00ea\u00ec\5\f\5\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f5\3\2\2\2\u00ef\u00f1"+
		"\t\22\2\2\u00f0\u00f2\5\f\5\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2"+
		"\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00ef"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6K\3\2\2\2\u00f7\u00f9\5\f\5\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fbM\3\2\2\2\u00fc\u0100\5\6\2\2\u00fd\u0100\5\b\3\2\u00fe\u0100"+
		"\7a\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102O\3\2\2\2"+
		"\u0103\u0104\7?\2\2\u0104Q\3\2\2\2\u0105\u0106\7?\2\2\u0106\u010f\7?\2"+
		"\2\u0107\u0108\7#\2\2\u0108\u010f\7?\2\2\u0109\u010f\t\23\2\2\u010a\u010b"+
		"\7@\2\2\u010b\u010f\7?\2\2\u010c\u010d\7>\2\2\u010d\u010f\7?\2\2\u010e"+
		"\u0105\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010fS\3\2\2\2\u0110\u0111\t\24\2\2\u0111U\3"+
		"\2\2\2\u0112\u0113\t\25\2\2\u0113W\3\2\2\2\u0114\u0115\7~\2\2\u0115Y\3"+
		"\2\2\2\u0116\u011a\n\26\2\2\u0117\u0118\7\61\2\2\u0118\u011a\n\b\2\2\u0119"+
		"\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c[\3\2\2\2\u011d\u011e\7_\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0120\b-\7\2\u0120]\3\2\2\2\u0121\u0123\n\27\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125_\3\2\2\2\u0126\u0127\7_\2\2\u0127\u0128\3\2\2\2\u0128\u0129"+
		"\b/\7\2\u0129a\3\2\2\2\30\2\3\4\5nuw\177\u0091\u0093\u0098\u009a\u00ed"+
		"\u00f3\u00f5\u00fa\u00ff\u0101\u010e\u0119\u011b\u0124\b\b\2\2\2\3\2\7"+
		"\3\2\7\4\2\7\5\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}