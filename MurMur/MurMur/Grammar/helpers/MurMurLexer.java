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
		INCLUDE_KEYWORD=7, TEXT=8, NEW_TAG=9, COMMAND_NEWLINE=10, COMMAND_IGNORE=11, 
		COMMAND_LINE_COMMENT=12, COMMAND_COMMENT=13, COMMAND_PARAMS_START=14, 
		COMMAND_STRING_START=15, OPEN_PAREN=16, CLOSE_PAREN=17, COMMAND_PARAMS_SEPARATOR=18, 
		COMMAND_END=19, KEYWORD_IF=20, KEYWORD_ELSE=21, KEYWORD_END=22, KEYWORD_GOTO=23, 
		KEYWORD_MENU=24, KEYWORD_MENU_OPTION=25, KEYWORD_PICK=26, KEYWORD_PICK_THIS=27, 
		TRUE=28, FALSE=29, NUMBER=30, WORD=31, ASSIGN_SIGNAL=32, COMPARISSON_SIGNAL=33, 
		MUL_DIV_SIGNAL=34, ADD_SUB_SIGNAL=35, STRING=36, COMMAND_STRING_END=37;
	public static final int
		INSIDE_COMMAND=1, STRING_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE_COMMAND", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"LOWERCASE", "UPPERCASE", "DIGIT", "TAG", "WHITESPACE", "NEWLINE", "LINE_COMMENT", 
		"COMMENT", "TAG_START", "COMMAND_START", "INCLUDE_KEYWORD", "TEXT", "NEW_TAG", 
		"COMMAND_NEWLINE", "COMMAND_IGNORE", "COMMAND_LINE_COMMENT", "COMMAND_COMMENT", 
		"COMMAND_PARAMS_START", "COMMAND_STRING_START", "OPEN_PAREN", "CLOSE_PAREN", 
		"COMMAND_PARAMS_SEPARATOR", "COMMAND_END", "T", "R", "U", "E", "F", "A", 
		"L", "S", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_END", "KEYWORD_GOTO", 
		"KEYWORD_MENU", "KEYWORD_MENU_OPTION", "KEYWORD_PICK", "KEYWORD_PICK_THIS", 
		"TRUE", "FALSE", "NUMBER", "WORD", "ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", 
		"MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", "STRING", "COMMAND_STRING_END"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'@include'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LINE_COMMENT", "COMMENT", "TAG_START", 
		"COMMAND_START", "INCLUDE_KEYWORD", "TEXT", "NEW_TAG", "COMMAND_NEWLINE", 
		"COMMAND_IGNORE", "COMMAND_LINE_COMMENT", "COMMAND_COMMENT", "COMMAND_PARAMS_START", 
		"COMMAND_STRING_START", "OPEN_PAREN", "CLOSE_PAREN", "COMMAND_PARAMS_SEPARATOR", 
		"COMMAND_END", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_END", "KEYWORD_GOTO", 
		"KEYWORD_MENU", "KEYWORD_MENU_OPTION", "KEYWORD_PICK", "KEYWORD_PICK_THIS", 
		"TRUE", "FALSE", "NUMBER", "WORD", "ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", 
		"MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", "STRING", "COMMAND_STRING_END"
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
		case 12:
			return NEW_TAG_sempred((RuleContext)_localctx, predIndex);
		case 45:
			return MUL_DIV_SIGNAL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEW_TAG_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _input.LA(1)=='#';
		}
		return true;
	}
	private boolean MUL_DIV_SIGNAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _input.LA(1)!='*';
		case 2:
			return _input.LA(1)!='/';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0166\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6q\n\6\r\6\16\6r\3\6\3\6\3\7\3\7\3\7\6"+
		"\7z\n\7\r\7\16\7{\3\b\3\b\3\b\3\b\7\b\u0082\n\b\f\b\16\b\u0085\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\7\t\u008d\n\t\f\t\16\t\u0090\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\6\r\u00ab\n\r\r\r\16\r\u00ac\3\16\3\16\3\16\5\16"+
		"\u00b2\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00bb\n\17\3\17\3"+
		"\17\3\20\6\20\u00c0\n\20\r\20\16\20\u00c1\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\7\21\u00ca\n\21\f\21\16\21\u00cd\13\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\7\22\u00d5\n\22\f\22\16\22\u00d8\13\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\6+\u0130\n+\r+\16+\u0131\3+\3+\6+\u0136"+
		"\n+\r+\16+\u0137\5+\u013a\n+\3,\3,\3,\5,\u013f\n,\3,\3,\3,\3,\6,\u0145"+
		"\n,\r,\16,\u0146\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0154\n.\3/\3/\3"+
		"/\3/\5/\u015a\n/\3\60\3\60\3\61\6\61\u015f\n\61\r\61\16\61\u0160\3\62"+
		"\3\62\3\62\3\62\4\u008e\u00d6\2\63\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6"+
		"\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25"+
		"\63\2\65\2\67\29\2;\2=\2?\2A\2C\26E\27G\30I\31K\32M\33O\34Q\35S\36U\37"+
		"W Y![\"]#_$a%c&e\'\5\2\3\4\26\3\2c|\3\2C\\\3\2\62;\4\2\13\13\"\"\4\2\f"+
		"\f\17\17\t\2\f\f\17\17%%\61\61BB]]}}\4\2,,\61\61\3\2%%\4\2VVvv\4\2TTt"+
		"t\4\2WWww\4\2GGgg\4\2HHhh\4\2CCcc\4\2NNnn\4\2UUuu\3\2\60\60\4\2>>@@\4"+
		"\2--//\3\2__\2\u0172\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\3"+
		"\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3"+
		"+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3\61\3\2\2\2\3C\3\2\2\2\3E\3\2\2\2\3G"+
		"\3\2\2\2\3I\3\2\2\2\3K\3\2\2\2\3M\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\3S\3\2"+
		"\2\2\3U\3\2\2\2\3W\3\2\2\2\3Y\3\2\2\2\3[\3\2\2\2\3]\3\2\2\2\3_\3\2\2\2"+
		"\3a\3\2\2\2\4c\3\2\2\2\4e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13"+
		"m\3\2\2\2\rp\3\2\2\2\17y\3\2\2\2\21}\3\2\2\2\23\u0088\3\2\2\2\25\u0096"+
		"\3\2\2\2\27\u0098\3\2\2\2\31\u009c\3\2\2\2\33\u00aa\3\2\2\2\35\u00b1\3"+
		"\2\2\2\37\u00ba\3\2\2\2!\u00bf\3\2\2\2#\u00c5\3\2\2\2%\u00d0\3\2\2\2\'"+
		"\u00de\3\2\2\2)\u00e0\3\2\2\2+\u00e4\3\2\2\2-\u00e6\3\2\2\2/\u00e8\3\2"+
		"\2\2\61\u00ea\3\2\2\2\63\u00ee\3\2\2\2\65\u00f0\3\2\2\2\67\u00f2\3\2\2"+
		"\29\u00f4\3\2\2\2;\u00f6\3\2\2\2=\u00f8\3\2\2\2?\u00fa\3\2\2\2A\u00fc"+
		"\3\2\2\2C\u00fe\3\2\2\2E\u0101\3\2\2\2G\u0106\3\2\2\2I\u010a\3\2\2\2K"+
		"\u010d\3\2\2\2M\u0112\3\2\2\2O\u0119\3\2\2\2Q\u011e\3\2\2\2S\u0123\3\2"+
		"\2\2U\u0128\3\2\2\2W\u012f\3\2\2\2Y\u013e\3\2\2\2[\u0148\3\2\2\2]\u0153"+
		"\3\2\2\2_\u0159\3\2\2\2a\u015b\3\2\2\2c\u015e\3\2\2\2e\u0162\3\2\2\2g"+
		"h\t\2\2\2h\6\3\2\2\2ij\t\3\2\2j\b\3\2\2\2kl\t\4\2\2l\n\3\2\2\2mn\7%\2"+
		"\2n\f\3\2\2\2oq\t\5\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2"+
		"\2\2tu\b\6\2\2u\16\3\2\2\2vz\t\6\2\2wx\7\17\2\2xz\7\f\2\2yv\3\2\2\2yw"+
		"\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\20\3\2\2\2}~\7\61\2\2~\177\7\61"+
		"\2\2\177\u0083\3\2\2\2\u0080\u0082\n\6\2\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\b\b\3\2\u0087\22\3\2\2\2\u0088\u0089\7\61\2"+
		"\2\u0089\u008a\7,\2\2\u008a\u008e\3\2\2\2\u008b\u008d\13\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7,\2\2\u0092\u0093\7\61"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\t\3\2\u0095\24\3\2\2\2\u0096\u0097"+
		"\5\13\5\2\u0097\26\3\2\2\2\u0098\u0099\7}\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\13\4\2\u009b\30\3\2\2\2\u009c\u009d\7B\2\2\u009d\u009e\7k\2\2"+
		"\u009e\u009f\7p\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2"+
		"\7w\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\b\f\4\2\u00a6\32\3\2\2\2\u00a7\u00ab\n\7\2\2\u00a8\u00a9\7\61\2"+
		"\2\u00a9\u00ab\n\b\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\34\3\2\2\2\u00ae"+
		"\u00b2\t\6\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b2\7\f\2\2\u00b1\u00ae\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\6\16\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\b\16\5\2\u00b6\36\3\2\2\2\u00b7\u00bb\t\6\2"+
		"\2\u00b8\u00b9\7\17\2\2\u00b9\u00bb\7\f\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\n\t\2\2\u00bd \3\2\2\2"+
		"\u00be\u00c0\t\5\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\b\20\2\2"+
		"\u00c4\"\3\2\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00cb"+
		"\3\2\2\2\u00c8\u00ca\n\6\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\b\21\3\2\u00cf$\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2"+
		"\7,\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\13\2\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7,\2\2\u00da\u00db\7\61\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\b\22\3\2\u00dd&\3\2\2\2\u00de\u00df\7<\2\2"+
		"\u00df(\3\2\2\2\u00e0\u00e1\7]\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\24"+
		"\6\2\u00e3*\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5,\3\2\2\2\u00e6\u00e7\7+\2"+
		"\2\u00e7.\3\2\2\2\u00e8\u00e9\7.\2\2\u00e9\60\3\2\2\2\u00ea\u00eb\7\177"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\30\5\2\u00ed\62\3\2\2\2\u00ee\u00ef"+
		"\t\n\2\2\u00ef\64\3\2\2\2\u00f0\u00f1\t\13\2\2\u00f1\66\3\2\2\2\u00f2"+
		"\u00f3\t\f\2\2\u00f38\3\2\2\2\u00f4\u00f5\t\r\2\2\u00f5:\3\2\2\2\u00f6"+
		"\u00f7\t\16\2\2\u00f7<\3\2\2\2\u00f8\u00f9\t\17\2\2\u00f9>\3\2\2\2\u00fa"+
		"\u00fb\t\20\2\2\u00fb@\3\2\2\2\u00fc\u00fd\t\21\2\2\u00fdB\3\2\2\2\u00fe"+
		"\u00ff\7k\2\2\u00ff\u0100\7h\2\2\u0100D\3\2\2\2\u0101\u0102\7g\2\2\u0102"+
		"\u0103\7n\2\2\u0103\u0104\7u\2\2\u0104\u0105\7g\2\2\u0105F\3\2\2\2\u0106"+
		"\u0107\7g\2\2\u0107\u0108\7p\2\2\u0108\u0109\7f\2\2\u0109H\3\2\2\2\u010a"+
		"\u010b\7i\2\2\u010b\u010c\7q\2\2\u010cJ\3\2\2\2\u010d\u010e\7o\2\2\u010e"+
		"\u010f\7g\2\2\u010f\u0110\7p\2\2\u0110\u0111\7w\2\2\u0111L\3\2\2\2\u0112"+
		"\u0113\7q\2\2\u0113\u0114\7r\2\2\u0114\u0115\7v\2\2\u0115\u0116\7k\2\2"+
		"\u0116\u0117\7q\2\2\u0117\u0118\7p\2\2\u0118N\3\2\2\2\u0119\u011a\7r\2"+
		"\2\u011a\u011b\7k\2\2\u011b\u011c\7e\2\2\u011c\u011d\7m\2\2\u011dP\3\2"+
		"\2\2\u011e\u011f\7v\2\2\u011f\u0120\7j\2\2\u0120\u0121\7k\2\2\u0121\u0122"+
		"\7u\2\2\u0122R\3\2\2\2\u0123\u0124\5\63\31\2\u0124\u0125\5\65\32\2\u0125"+
		"\u0126\5\67\33\2\u0126\u0127\59\34\2\u0127T\3\2\2\2\u0128\u0129\5;\35"+
		"\2\u0129\u012a\5=\36\2\u012a\u012b\5?\37\2\u012b\u012c\5A \2\u012c\u012d"+
		"\59\34\2\u012dV\3\2\2\2\u012e\u0130\5\t\4\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0139\3\2"+
		"\2\2\u0133\u0135\t\22\2\2\u0134\u0136\5\t\4\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u0133\3\2\2\2\u0139\u013a\3\2\2\2\u013aX\3\2\2\2\u013b\u013f"+
		"\5\5\2\2\u013c\u013f\5\7\3\2\u013d\u013f\7a\2\2\u013e\u013b\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0144\3\2\2\2\u0140\u0145\5\5"+
		"\2\2\u0141\u0145\5\7\3\2\u0142\u0145\7a\2\2\u0143\u0145\5\t\4\2\u0144"+
		"\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"Z\3\2\2\2\u0148\u0149\7?\2\2\u0149\\\3\2\2\2\u014a\u014b\7?\2\2\u014b"+
		"\u0154\7?\2\2\u014c\u014d\7#\2\2\u014d\u0154\7?\2\2\u014e\u0154\t\23\2"+
		"\2\u014f\u0150\7@\2\2\u0150\u0154\7?\2\2\u0151\u0152\7>\2\2\u0152\u0154"+
		"\7?\2\2\u0153\u014a\3\2\2\2\u0153\u014c\3\2\2\2\u0153\u014e\3\2\2\2\u0153"+
		"\u014f\3\2\2\2\u0153\u0151\3\2\2\2\u0154^\3\2\2\2\u0155\u015a\7,\2\2\u0156"+
		"\u0157\7\61\2\2\u0157\u0158\6/\3\2\u0158\u015a\6/\4\2\u0159\u0155\3\2"+
		"\2\2\u0159\u0156\3\2\2\2\u015a`\3\2\2\2\u015b\u015c\t\24\2\2\u015cb\3"+
		"\2\2\2\u015d\u015f\n\25\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161d\3\2\2\2\u0162\u0163\7_\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\b\62\5\2\u0165f\3\2\2\2\32\2\3\4ry{\u0083\u008e"+
		"\u00aa\u00ac\u00b1\u00ba\u00c1\u00cb\u00d6\u0131\u0137\u0139\u013e\u0144"+
		"\u0146\u0153\u0159\u0160\7\b\2\2\2\3\2\7\3\2\6\2\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}