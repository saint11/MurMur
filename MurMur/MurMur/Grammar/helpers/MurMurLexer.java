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
		INCLUDE_KEYWORD=7, INIT_KEYWORD=8, TEXT=9, NEW_TAG=10, NEW_DECLARATION=11, 
		COMMAND_NEWLINE=12, COMMAND_LINE_COMMENT=13, COMMAND_COMMENT=14, COMMAND_IGNORE=15, 
		COMMAND_PARAMS_START=16, COMMAND_STRING_START=17, OPEN_PAREN=18, CLOSE_PAREN=19, 
		COMMAND_PARAMS_SEPARATOR=20, COMMAND_END=21, KEYWORD_IF=22, KEYWORD_ELSE=23, 
		KEYWORD_END=24, KEYWORD_GOTO=25, KEYWORD_MENU=26, KEYWORD_MENU_OPTION=27, 
		KEYWORD_PICK=28, KEYWORD_PICK_THIS=29, TRUE=30, FALSE=31, NUMBER=32, WORD=33, 
		ASSIGN_SIGNAL=34, COMPARISSON_SIGNAL=35, MUL_DIV_SIGNAL=36, ADD_SUB_SIGNAL=37, 
		STRING=38, COMMAND_STRING_END=39;
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
		"INIT_KEYWORD", "TEXT", "NEW_TAG", "NEW_DECLARATION", "COMMAND_NEWLINE", 
		"COMMAND_LINE_COMMENT", "COMMAND_COMMENT", "COMMAND_IGNORE", "COMMAND_PARAMS_START", 
		"COMMAND_STRING_START", "OPEN_PAREN", "CLOSE_PAREN", "COMMAND_PARAMS_SEPARATOR", 
		"COMMAND_END", "T", "R", "U", "E", "F", "A", "L", "S", "KEYWORD_IF", "KEYWORD_ELSE", 
		"KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", 
		"KEYWORD_PICK", "KEYWORD_PICK_THIS", "TRUE", "FALSE", "NUMBER", "WORD", 
		"ASSIGN_SIGNAL", "COMPARISSON_SIGNAL", "MUL_DIV_SIGNAL", "ADD_SUB_SIGNAL", 
		"STRING", "COMMAND_STRING_END"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'@include'", "'@init'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LINE_COMMENT", "COMMENT", "TAG_START", 
		"COMMAND_START", "INCLUDE_KEYWORD", "INIT_KEYWORD", "TEXT", "NEW_TAG", 
		"NEW_DECLARATION", "COMMAND_NEWLINE", "COMMAND_LINE_COMMENT", "COMMAND_COMMENT", 
		"COMMAND_IGNORE", "COMMAND_PARAMS_START", "COMMAND_STRING_START", "OPEN_PAREN", 
		"CLOSE_PAREN", "COMMAND_PARAMS_SEPARATOR", "COMMAND_END", "KEYWORD_IF", 
		"KEYWORD_ELSE", "KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", 
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
			return NEW_TAG_sempred((RuleContext)_localctx, predIndex);
		case 15:
			return NEW_DECLARATION_sempred((RuleContext)_localctx, predIndex);
		case 48:
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
	private boolean NEW_DECLARATION_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0173\b\1\b\1\b"+
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
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\6\17\u00bc\n\17\r\17\16\17\u00bd"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\7\23\u00d0\n\23\f\23\16\23\u00d3\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\7\24\u00db\n\24\f\24\16\24\u00de\13\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\6\25\u00e6\n\25\r\25\16\25\u00e7\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		".\6.\u013d\n.\r.\16.\u013e\3.\3.\6.\u0143\n.\r.\16.\u0144\5.\u0147\n."+
		"\3/\3/\3/\5/\u014c\n/\3/\3/\3/\3/\6/\u0152\n/\r/\16/\u0153\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0161\n\61\3\62\3\62"+
		"\3\62\3\62\5\62\u0167\n\62\3\63\3\63\3\64\6\64\u016c\n\64\r\64\16\64\u016d"+
		"\3\65\3\65\3\65\3\65\4\u0097\u00dc\2\66\5\2\7\2\t\2\13\2\r\2\17\3\21\4"+
		"\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61"+
		"\24\63\25\65\26\67\279\2;\2=\2?\2A\2C\2E\2G\2I\30K\31M\32O\33Q\34S\35"+
		"U\36W\37Y [!]\"_#a$c%e&g\'i(k)\5\2\3\4\25\3\2c|\3\2C\\\3\2\62;\4\2\f\f"+
		"\17\17\4\2\13\13\"\"\t\2\f\f\17\17%%\61\61BB]]}}\4\2,,\61\61\4\2VVvv\4"+
		"\2TTtt\4\2WWww\4\2GGgg\4\2HHhh\4\2CCcc\4\2NNnn\4\2UUuu\3\2\60\60\4\2>"+
		">@@\4\2--//\3\2__\2\u017c\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2"+
		"\2\3-\3\2\2\2\3/\3\2\2\2\3\61\3\2\2\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3"+
		"\2\2\2\3I\3\2\2\2\3K\3\2\2\2\3M\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\3S\3\2\2"+
		"\2\3U\3\2\2\2\3W\3\2\2\2\3Y\3\2\2\2\3[\3\2\2\2\3]\3\2\2\2\3_\3\2\2\2\3"+
		"a\3\2\2\2\3c\3\2\2\2\3e\3\2\2\2\3g\3\2\2\2\4i\3\2\2\2\4k\3\2\2\2\5m\3"+
		"\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\rx\3\2\2\2\17{\3\2\2\2\21\u0082"+
		"\3\2\2\2\23\u0086\3\2\2\2\25\u0091\3\2\2\2\27\u009f\3\2\2\2\31\u00a1\3"+
		"\2\2\2\33\u00a5\3\2\2\2\35\u00b0\3\2\2\2\37\u00bb\3\2\2\2!\u00bf\3\2\2"+
		"\2#\u00c4\3\2\2\2%\u00c9\3\2\2\2\'\u00cb\3\2\2\2)\u00d6\3\2\2\2+\u00e5"+
		"\3\2\2\2-\u00eb\3\2\2\2/\u00ed\3\2\2\2\61\u00f1\3\2\2\2\63\u00f3\3\2\2"+
		"\2\65\u00f5\3\2\2\2\67\u00f7\3\2\2\29\u00fb\3\2\2\2;\u00fd\3\2\2\2=\u00ff"+
		"\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2C\u0105\3\2\2\2E\u0107\3\2\2\2G"+
		"\u0109\3\2\2\2I\u010b\3\2\2\2K\u010e\3\2\2\2M\u0113\3\2\2\2O\u0117\3\2"+
		"\2\2Q\u011a\3\2\2\2S\u011f\3\2\2\2U\u0126\3\2\2\2W\u012b\3\2\2\2Y\u0130"+
		"\3\2\2\2[\u0135\3\2\2\2]\u013c\3\2\2\2_\u014b\3\2\2\2a\u0155\3\2\2\2c"+
		"\u0160\3\2\2\2e\u0166\3\2\2\2g\u0168\3\2\2\2i\u016b\3\2\2\2k\u016f\3\2"+
		"\2\2mn\t\2\2\2n\6\3\2\2\2op\t\3\2\2p\b\3\2\2\2qr\t\4\2\2r\n\3\2\2\2st"+
		"\7%\2\2t\f\3\2\2\2uy\t\5\2\2vw\7\17\2\2wy\7\f\2\2xu\3\2\2\2xv\3\2\2\2"+
		"y\16\3\2\2\2z|\t\6\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3"+
		"\2\2\2\177\u0080\b\7\2\2\u0080\20\3\2\2\2\u0081\u0083\5\r\6\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\22\3\2\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7\61\2\2\u0088\u008c\3\2"+
		"\2\2\u0089\u008b\n\5\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0090\b\t\3\2\u0090\24\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093"+
		"\7,\2\2\u0093\u0097\3\2\2\2\u0094\u0096\13\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7,\2\2\u009b\u009c\7\61\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\b\n\3\2\u009e\26\3\2\2\2\u009f\u00a0\5\13\5"+
		"\2\u00a0\30\3\2\2\2\u00a1\u00a2\7}\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\b\f\4\2\u00a4\32\3\2\2\2\u00a5\u00a6\7B\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7w\2\2"+
		"\u00ab\u00ac\7f\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\b\r\4\2\u00af\34\3\2\2\2\u00b0\u00b1\7B\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\3\2\2"+
		"\2\u00b6\u00b7\b\16\4\2\u00b7\36\3\2\2\2\u00b8\u00bc\n\7\2\2\u00b9\u00ba"+
		"\7\61\2\2\u00ba\u00bc\n\b\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be \3"+
		"\2\2\2\u00bf\u00c0\5\r\6\2\u00c0\u00c1\6\20\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\b\20\5\2\u00c3\"\3\2\2\2\u00c4\u00c5\5\r\6\2\u00c5\u00c6\6\21\3"+
		"\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\21\5\2\u00c8$\3\2\2\2\u00c9\u00ca"+
		"\5\r\6\2\u00ca&\3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00cd\7\61\2\2\u00cd"+
		"\u00d1\3\2\2\2\u00ce\u00d0\n\5\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d5\b\23\3\2\u00d5(\3\2\2\2\u00d6\u00d7\7\61\2"+
		"\2\u00d7\u00d8\7,\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00db\13\2\2\2\u00da\u00d9"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1\7\61"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\24\3\2\u00e3*\3\2\2\2\u00e4\u00e6"+
		"\t\6\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b\25\2\2\u00ea,\3\2\2\2"+
		"\u00eb\u00ec\7<\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7]\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\b\27\6\2\u00f0\60\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2\62"+
		"\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4\64\3\2\2\2\u00f5\u00f6\7.\2\2\u00f6"+
		"\66\3\2\2\2\u00f7\u00f8\7\177\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b\33"+
		"\5\2\u00fa8\3\2\2\2\u00fb\u00fc\t\t\2\2\u00fc:\3\2\2\2\u00fd\u00fe\t\n"+
		"\2\2\u00fe<\3\2\2\2\u00ff\u0100\t\13\2\2\u0100>\3\2\2\2\u0101\u0102\t"+
		"\f\2\2\u0102@\3\2\2\2\u0103\u0104\t\r\2\2\u0104B\3\2\2\2\u0105\u0106\t"+
		"\16\2\2\u0106D\3\2\2\2\u0107\u0108\t\17\2\2\u0108F\3\2\2\2\u0109\u010a"+
		"\t\20\2\2\u010aH\3\2\2\2\u010b\u010c\7k\2\2\u010c\u010d\7h\2\2\u010dJ"+
		"\3\2\2\2\u010e\u010f\7g\2\2\u010f\u0110\7n\2\2\u0110\u0111\7u\2\2\u0111"+
		"\u0112\7g\2\2\u0112L\3\2\2\2\u0113\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115"+
		"\u0116\7f\2\2\u0116N\3\2\2\2\u0117\u0118\7i\2\2\u0118\u0119\7q\2\2\u0119"+
		"P\3\2\2\2\u011a\u011b\7o\2\2\u011b\u011c\7g\2\2\u011c\u011d\7p\2\2\u011d"+
		"\u011e\7w\2\2\u011eR\3\2\2\2\u011f\u0120\7q\2\2\u0120\u0121\7r\2\2\u0121"+
		"\u0122\7v\2\2\u0122\u0123\7k\2\2\u0123\u0124\7q\2\2\u0124\u0125\7p\2\2"+
		"\u0125T\3\2\2\2\u0126\u0127\7r\2\2\u0127\u0128\7k\2\2\u0128\u0129\7e\2"+
		"\2\u0129\u012a\7m\2\2\u012aV\3\2\2\2\u012b\u012c\7v\2\2\u012c\u012d\7"+
		"j\2\2\u012d\u012e\7k\2\2\u012e\u012f\7u\2\2\u012fX\3\2\2\2\u0130\u0131"+
		"\59\34\2\u0131\u0132\5;\35\2\u0132\u0133\5=\36\2\u0133\u0134\5?\37\2\u0134"+
		"Z\3\2\2\2\u0135\u0136\5A \2\u0136\u0137\5C!\2\u0137\u0138\5E\"\2\u0138"+
		"\u0139\5G#\2\u0139\u013a\5?\37\2\u013a\\\3\2\2\2\u013b\u013d\5\t\4\2\u013c"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0146\3\2\2\2\u0140\u0142\t\21\2\2\u0141\u0143\5\t\4\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"^\3\2\2\2\u0148\u014c\5\5\2\2\u0149\u014c\5\7\3\2\u014a\u014c\7a\2\2\u014b"+
		"\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\u0151\3\2"+
		"\2\2\u014d\u0152\5\5\2\2\u014e\u0152\5\7\3\2\u014f\u0152\7a\2\2\u0150"+
		"\u0152\5\t\4\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154`\3\2\2\2\u0155\u0156\7?\2\2\u0156b\3\2\2\2\u0157"+
		"\u0158\7?\2\2\u0158\u0161\7?\2\2\u0159\u015a\7#\2\2\u015a\u0161\7?\2\2"+
		"\u015b\u0161\t\22\2\2\u015c\u015d\7@\2\2\u015d\u0161\7?\2\2\u015e\u015f"+
		"\7>\2\2\u015f\u0161\7?\2\2\u0160\u0157\3\2\2\2\u0160\u0159\3\2\2\2\u0160"+
		"\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015e\3\2\2\2\u0161d\3\2\2\2"+
		"\u0162\u0167\7,\2\2\u0163\u0164\7\61\2\2\u0164\u0165\6\62\4\2\u0165\u0167"+
		"\6\62\5\2\u0166\u0162\3\2\2\2\u0166\u0163\3\2\2\2\u0167f\3\2\2\2\u0168"+
		"\u0169\t\23\2\2\u0169h\3\2\2\2\u016a\u016c\n\24\2\2\u016b\u016a\3\2\2"+
		"\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016ej"+
		"\3\2\2\2\u016f\u0170\7_\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b\65\5\2\u0172"+
		"l\3\2\2\2\30\2\3\4x}\u0084\u008c\u0097\u00bb\u00bd\u00d1\u00dc\u00e7\u013e"+
		"\u0144\u0146\u014b\u0151\u0153\u0160\u0166\u016d\7\b\2\2\2\3\2\7\3\2\6"+
		"\2\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}