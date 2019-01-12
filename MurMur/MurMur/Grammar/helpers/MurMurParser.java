// Generated from ../MurMurParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MurMurParser extends Parser {
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
		RULE_murmur = 0, RULE_initBlock = 1, RULE_tag = 2, RULE_block = 3, RULE_pickBlock = 4, 
		RULE_menuBlock = 5, RULE_ifBlock = 6, RULE_line = 7, RULE_lineFragment = 8, 
		RULE_inlineIfBlock = 9, RULE_inlineIfTrueFragment = 10, RULE_inlineIfFalseFragment = 11, 
		RULE_menuSubBlock = 12, RULE_pickThisBlock = 13, RULE_simpleCommand = 14, 
		RULE_multiLineCommand = 15, RULE_string = 16, RULE_expression = 17, RULE_params = 18, 
		RULE_pickCommand = 19, RULE_pickThisCommand = 20, RULE_menuCommand = 21, 
		RULE_menuOptionCommand = 22, RULE_ifCommand = 23, RULE_elseCommand = 24, 
		RULE_endCommand = 25, RULE_declaration = 26;
	public static final String[] ruleNames = {
		"murmur", "initBlock", "tag", "block", "pickBlock", "menuBlock", "ifBlock", 
		"line", "lineFragment", "inlineIfBlock", "inlineIfTrueFragment", "inlineIfFalseFragment", 
		"menuSubBlock", "pickThisBlock", "simpleCommand", "multiLineCommand", 
		"string", "expression", "params", "pickCommand", "pickThisCommand", "menuCommand", 
		"menuOptionCommand", "ifCommand", "elseCommand", "endCommand", "declaration"
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

	@Override
	public String getGrammarFileName() { return "MurMurParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MurMurParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MurmurContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MurMurParser.EOF, 0); }
		public List<TagContext> tag() {
			return getRuleContexts(TagContext.class);
		}
		public TagContext tag(int i) {
			return getRuleContext(TagContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<InitBlockContext> initBlock() {
			return getRuleContexts(InitBlockContext.class);
		}
		public InitBlockContext initBlock(int i) {
			return getRuleContext(InitBlockContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MurMurParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MurMurParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMAND_NEWLINE() { return getTokens(MurMurParser.COMMAND_NEWLINE); }
		public TerminalNode COMMAND_NEWLINE(int i) {
			return getToken(MurMurParser.COMMAND_NEWLINE, i);
		}
		public List<TerminalNode> NEW_DECLARATION() { return getTokens(MurMurParser.NEW_DECLARATION); }
		public TerminalNode NEW_DECLARATION(int i) {
			return getToken(MurMurParser.NEW_DECLARATION, i);
		}
		public List<TerminalNode> NEW_TAG() { return getTokens(MurMurParser.NEW_TAG); }
		public TerminalNode NEW_TAG(int i) {
			return getToken(MurMurParser.NEW_TAG, i);
		}
		public MurmurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_murmur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterMurmur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitMurmur(this);
		}
	}

	public final MurmurContext murmur() throws RecognitionException {
		MurmurContext _localctx = new MurmurContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_murmur);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << TAG_START) | (1L << INCLUDE_KEYWORD) | (1L << INIT_KEYWORD) | (1L << NEW_TAG) | (1L << NEW_DECLARATION) | (1L << COMMAND_NEWLINE))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_START:
					{
					setState(54);
					tag();
					}
					break;
				case INCLUDE_KEYWORD:
					{
					setState(55);
					declaration();
					}
					break;
				case INIT_KEYWORD:
					{
					setState(56);
					initBlock();
					}
					break;
				case NEWLINE:
					{
					setState(57);
					match(NEWLINE);
					}
					break;
				case COMMAND_NEWLINE:
					{
					setState(58);
					match(COMMAND_NEWLINE);
					}
					break;
				case NEW_DECLARATION:
					{
					setState(59);
					match(NEW_DECLARATION);
					}
					break;
				case NEW_TAG:
					{
					setState(60);
					match(NEW_TAG);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitBlockContext extends ParserRuleContext {
		public TerminalNode INIT_KEYWORD() { return getToken(MurMurParser.INIT_KEYWORD, 0); }
		public TerminalNode COMMAND_PARAMS_START() { return getToken(MurMurParser.COMMAND_PARAMS_START, 0); }
		public List<TerminalNode> COMMAND_NEWLINE() { return getTokens(MurMurParser.COMMAND_NEWLINE); }
		public TerminalNode COMMAND_NEWLINE(int i) {
			return getToken(MurMurParser.COMMAND_NEWLINE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InitBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterInitBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitInitBlock(this);
		}
	}

	public final InitBlockContext initBlock() throws RecognitionException {
		InitBlockContext _localctx = new InitBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(INIT_KEYWORD);
			setState(69);
			match(COMMAND_PARAMS_START);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(72);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMAND_NEWLINE:
						{
						setState(70);
						match(COMMAND_NEWLINE);
						}
						break;
					case COMMAND_STRING_START:
					case OPEN_PAREN:
					case TRUE:
					case FALSE:
					case NUMBER:
					case WORD:
						{
						setState(71);
						expression(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagContext extends ParserRuleContext {
		public TerminalNode TAG_START() { return getToken(MurMurParser.TAG_START, 0); }
		public TerminalNode TEXT() { return getToken(MurMurParser.TEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MurMurParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MurMurParser.NEWLINE, i);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(TAG_START);
			setState(78);
			match(TEXT);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(79);
				match(NEWLINE);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<PickBlockContext> pickBlock() {
			return getRuleContexts(PickBlockContext.class);
		}
		public PickBlockContext pickBlock(int i) {
			return getRuleContext(PickBlockContext.class,i);
		}
		public List<MenuBlockContext> menuBlock() {
			return getRuleContexts(MenuBlockContext.class);
		}
		public MenuBlockContext menuBlock(int i) {
			return getRuleContext(MenuBlockContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(87);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(88);
						pickBlock();
						}
						break;
					case 3:
						{
						setState(89);
						menuBlock();
						}
						break;
					case 4:
						{
						setState(90);
						line();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PickBlockContext extends ParserRuleContext {
		public PickCommandContext pickCommand() {
			return getRuleContext(PickCommandContext.class,0);
		}
		public EndCommandContext endCommand() {
			return getRuleContext(EndCommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MurMurParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MurMurParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MurMurParser.NEWLINE, i);
		}
		public List<PickThisBlockContext> pickThisBlock() {
			return getRuleContexts(PickThisBlockContext.class);
		}
		public PickThisBlockContext pickThisBlock(int i) {
			return getRuleContext(PickThisBlockContext.class,i);
		}
		public PickBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterPickBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitPickBlock(this);
		}
	}

	public final PickBlockContext pickBlock() throws RecognitionException {
		PickBlockContext _localctx = new PickBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pickBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			pickCommand();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(96);
				match(NEWLINE);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(102);
					pickThisBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(107);
			endCommand();
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(109); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(108);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(111); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(113);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuBlockContext extends ParserRuleContext {
		public MenuCommandContext menuCommand() {
			return getRuleContext(MenuCommandContext.class,0);
		}
		public EndCommandContext endCommand() {
			return getRuleContext(EndCommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MurMurParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MurMurParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MurMurParser.NEWLINE, i);
		}
		public List<MenuSubBlockContext> menuSubBlock() {
			return getRuleContexts(MenuSubBlockContext.class);
		}
		public MenuSubBlockContext menuSubBlock(int i) {
			return getRuleContext(MenuSubBlockContext.class,i);
		}
		public MenuBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterMenuBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitMenuBlock(this);
		}
	}

	public final MenuBlockContext menuBlock() throws RecognitionException {
		MenuBlockContext _localctx = new MenuBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_menuBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			menuCommand();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(117);
				match(NEWLINE);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(123);
					menuSubBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(128);
			endCommand();
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(130); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(129);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(132); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(134);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public IfCommandContext ifCommand() {
			return getRuleContext(IfCommandContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public EndCommandContext endCommand() {
			return getRuleContext(EndCommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MurMurParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MurMurParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MurMurParser.NEWLINE, i);
		}
		public ElseCommandContext elseCommand() {
			return getRuleContext(ElseCommandContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitIfBlock(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			ifCommand();
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				match(NEWLINE);
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(143);
			block();
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(144);
				elseCommand();
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					match(NEWLINE);
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(150);
				block();
				}
				break;
			}
			setState(154);
			endCommand();
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(156); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(155);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(158); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(160);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MurMurParser.EOF, 0); }
		public List<LineFragmentContext> lineFragment() {
			return getRuleContexts(LineFragmentContext.class);
		}
		public LineFragmentContext lineFragment(int i) {
			return getRuleContext(LineFragmentContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MurMurParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MurMurParser.NEWLINE, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				lineFragment();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMAND_START || _la==TEXT );
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(169); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(168);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(171); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(173);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineFragmentContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MurMurParser.TEXT, 0); }
		public InlineIfBlockContext inlineIfBlock() {
			return getRuleContext(InlineIfBlockContext.class,0);
		}
		public SimpleCommandContext simpleCommand() {
			return getRuleContext(SimpleCommandContext.class,0);
		}
		public MultiLineCommandContext multiLineCommand() {
			return getRuleContext(MultiLineCommandContext.class,0);
		}
		public LineFragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineFragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterLineFragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitLineFragment(this);
		}
	}

	public final LineFragmentContext lineFragment() throws RecognitionException {
		LineFragmentContext _localctx = new LineFragmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lineFragment);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				inlineIfBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				simpleCommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				multiLineCommand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineIfBlockContext extends ParserRuleContext {
		public IfCommandContext ifCommand() {
			return getRuleContext(IfCommandContext.class,0);
		}
		public InlineIfTrueFragmentContext inlineIfTrueFragment() {
			return getRuleContext(InlineIfTrueFragmentContext.class,0);
		}
		public EndCommandContext endCommand() {
			return getRuleContext(EndCommandContext.class,0);
		}
		public ElseCommandContext elseCommand() {
			return getRuleContext(ElseCommandContext.class,0);
		}
		public InlineIfFalseFragmentContext inlineIfFalseFragment() {
			return getRuleContext(InlineIfFalseFragmentContext.class,0);
		}
		public InlineIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineIfBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterInlineIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitInlineIfBlock(this);
		}
	}

	public final InlineIfBlockContext inlineIfBlock() throws RecognitionException {
		InlineIfBlockContext _localctx = new InlineIfBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inlineIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			ifCommand();
			setState(183);
			inlineIfTrueFragment();
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(184);
				elseCommand();
				setState(185);
				inlineIfFalseFragment();
				}
				break;
			}
			setState(189);
			endCommand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineIfTrueFragmentContext extends ParserRuleContext {
		public List<LineFragmentContext> lineFragment() {
			return getRuleContexts(LineFragmentContext.class);
		}
		public LineFragmentContext lineFragment(int i) {
			return getRuleContext(LineFragmentContext.class,i);
		}
		public InlineIfTrueFragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineIfTrueFragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterInlineIfTrueFragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitInlineIfTrueFragment(this);
		}
	}

	public final InlineIfTrueFragmentContext inlineIfTrueFragment() throws RecognitionException {
		InlineIfTrueFragmentContext _localctx = new InlineIfTrueFragmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inlineIfTrueFragment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(191);
					lineFragment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(194); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineIfFalseFragmentContext extends ParserRuleContext {
		public List<LineFragmentContext> lineFragment() {
			return getRuleContexts(LineFragmentContext.class);
		}
		public LineFragmentContext lineFragment(int i) {
			return getRuleContext(LineFragmentContext.class,i);
		}
		public InlineIfFalseFragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineIfFalseFragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterInlineIfFalseFragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitInlineIfFalseFragment(this);
		}
	}

	public final InlineIfFalseFragmentContext inlineIfFalseFragment() throws RecognitionException {
		InlineIfFalseFragmentContext _localctx = new InlineIfFalseFragmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inlineIfFalseFragment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(196);
					lineFragment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(199); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuSubBlockContext extends ParserRuleContext {
		public MenuOptionCommandContext menuOptionCommand() {
			return getRuleContext(MenuOptionCommandContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MurMurParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MurMurParser.NEWLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MenuSubBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuSubBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterMenuSubBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitMenuSubBlock(this);
		}
	}

	public final MenuSubBlockContext menuSubBlock() throws RecognitionException {
		MenuSubBlockContext _localctx = new MenuSubBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_menuSubBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			menuOptionCommand();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(202);
				match(NEWLINE);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(208);
				block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PickThisBlockContext extends ParserRuleContext {
		public PickThisCommandContext pickThisCommand() {
			return getRuleContext(PickThisCommandContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MurMurParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MurMurParser.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public PickThisBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickThisBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterPickThisBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitPickThisBlock(this);
		}
	}

	public final PickThisBlockContext pickThisBlock() throws RecognitionException {
		PickThisBlockContext _localctx = new PickThisBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pickThisBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			pickThisCommand();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(212);
				match(NEWLINE);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					block();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleCommandContext extends ParserRuleContext {
		public TerminalNode COMMAND_START() { return getToken(MurMurParser.COMMAND_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
		public SimpleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterSimpleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitSimpleCommand(this);
		}
	}

	public final SimpleCommandContext simpleCommand() throws RecognitionException {
		SimpleCommandContext _localctx = new SimpleCommandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simpleCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(COMMAND_START);
			setState(225);
			expression(0);
			setState(226);
			match(COMMAND_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiLineCommandContext extends ParserRuleContext {
		public TerminalNode COMMAND_START() { return getToken(MurMurParser.COMMAND_START, 0); }
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
		public List<TerminalNode> COMMAND_NEWLINE() { return getTokens(MurMurParser.COMMAND_NEWLINE); }
		public TerminalNode COMMAND_NEWLINE(int i) {
			return getToken(MurMurParser.COMMAND_NEWLINE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiLineCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterMultiLineCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitMultiLineCommand(this);
		}
	}

	public final MultiLineCommandContext multiLineCommand() throws RecognitionException {
		MultiLineCommandContext _localctx = new MultiLineCommandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiLineCommand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(COMMAND_START);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND_NEWLINE) {
				{
				{
				setState(229);
				match(COMMAND_NEWLINE);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				expression(0);
				setState(237); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(236);
						match(COMMAND_NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(239); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMAND_STRING_START) | (1L << OPEN_PAREN) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << WORD))) != 0) );
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND_NEWLINE) {
				{
				{
				setState(245);
				match(COMMAND_NEWLINE);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(COMMAND_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode COMMAND_STRING_START() { return getToken(MurMurParser.COMMAND_STRING_START, 0); }
		public TerminalNode STRING() { return getToken(MurMurParser.STRING, 0); }
		public TerminalNode COMMAND_STRING_END() { return getToken(MurMurParser.COMMAND_STRING_END, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(COMMAND_STRING_START);
			setState(254);
			match(STRING);
			setState(255);
			match(COMMAND_STRING_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitStringExpression(this);
		}
	}
	public static class MethodOrVariableExpressionContext extends ExpressionContext {
		public TerminalNode WORD() { return getToken(MurMurParser.WORD, 0); }
		public MethodOrVariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterMethodOrVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitMethodOrVariableExpression(this);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD_SUB_SIGNAL() { return getToken(MurMurParser.ADD_SUB_SIGNAL, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitAdditiveExpression(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(MurMurParser.NUMBER, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitNumberExpression(this);
		}
	}
	public static class AssignExpressionContext extends ExpressionContext {
		public TerminalNode WORD() { return getToken(MurMurParser.WORD, 0); }
		public TerminalNode ASSIGN_SIGNAL() { return getToken(MurMurParser.ASSIGN_SIGNAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitAssignExpression(this);
		}
	}
	public static class ComparissonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMPARISSON_SIGNAL() { return getToken(MurMurParser.COMPARISSON_SIGNAL, 0); }
		public ComparissonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterComparissonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitComparissonExpression(this);
		}
	}
	public static class MethodExpressionContext extends ExpressionContext {
		public TerminalNode WORD() { return getToken(MurMurParser.WORD, 0); }
		public TerminalNode COMMAND_PARAMS_START() { return getToken(MurMurParser.COMMAND_PARAMS_START, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public MethodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitMethodExpression(this);
		}
	}
	public static class PriorityExpressionContext extends ExpressionContext {
		public TerminalNode OPEN_PAREN() { return getToken(MurMurParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MurMurParser.CLOSE_PAREN, 0); }
		public PriorityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterPriorityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitPriorityExpression(this);
		}
	}
	public static class MultiplicationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL_DIV_SIGNAL() { return getToken(MurMurParser.MUL_DIV_SIGNAL, 0); }
		public MultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterMultiplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitMultiplicationExpression(this);
		}
	}
	public static class BooleanExpressionContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(MurMurParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MurMurParser.FALSE, 0); }
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitBooleanExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(258);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new MethodOrVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				match(WORD);
				}
				break;
			case 3:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(WORD);
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(261);
					match(COMMAND_PARAMS_START);
					setState(262);
					params();
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				string();
				}
				break;
			case 6:
				{
				_localctx = new PriorityExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(OPEN_PAREN);
				setState(268);
				expression(0);
				setState(269);
				match(CLOSE_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new AssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(WORD);
				setState(272);
				match(ASSIGN_SIGNAL);
				setState(273);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(277);
						match(MUL_DIV_SIGNAL);
						setState(278);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(280);
						match(MUL_DIV_SIGNAL);
						setState(281);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(283);
						match(ADD_SUB_SIGNAL);
						setState(284);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ComparissonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(286);
						match(COMPARISSON_SIGNAL);
						setState(287);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMAND_PARAMS_SEPARATOR() { return getTokens(MurMurParser.COMMAND_PARAMS_SEPARATOR); }
		public TerminalNode COMMAND_PARAMS_SEPARATOR(int i) {
			return getToken(MurMurParser.COMMAND_PARAMS_SEPARATOR, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			expression(0);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					match(COMMAND_PARAMS_SEPARATOR);
					setState(295);
					expression(0);
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PickCommandContext extends ParserRuleContext {
		public TerminalNode COMMAND_START() { return getToken(MurMurParser.COMMAND_START, 0); }
		public TerminalNode KEYWORD_PICK() { return getToken(MurMurParser.KEYWORD_PICK, 0); }
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
		public PickCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterPickCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitPickCommand(this);
		}
	}

	public final PickCommandContext pickCommand() throws RecognitionException {
		PickCommandContext _localctx = new PickCommandContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pickCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(COMMAND_START);
			setState(302);
			match(KEYWORD_PICK);
			setState(303);
			match(COMMAND_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PickThisCommandContext extends ParserRuleContext {
		public TerminalNode COMMAND_START() { return getToken(MurMurParser.COMMAND_START, 0); }
		public TerminalNode KEYWORD_PICK_THIS() { return getToken(MurMurParser.KEYWORD_PICK_THIS, 0); }
		public TerminalNode COMMAND_PARAMS_START() { return getToken(MurMurParser.COMMAND_PARAMS_START, 0); }
		public TerminalNode NUMBER() { return getToken(MurMurParser.NUMBER, 0); }
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
		public PickThisCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickThisCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterPickThisCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitPickThisCommand(this);
		}
	}

	public final PickThisCommandContext pickThisCommand() throws RecognitionException {
		PickThisCommandContext _localctx = new PickThisCommandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pickThisCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(COMMAND_START);
			setState(306);
			match(KEYWORD_PICK_THIS);
			setState(307);
			match(COMMAND_PARAMS_START);
			setState(308);
			match(NUMBER);
			setState(309);
			match(COMMAND_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuCommandContext extends ParserRuleContext {
		public TerminalNode COMMAND_START() { return getToken(MurMurParser.COMMAND_START, 0); }
		public TerminalNode KEYWORD_MENU() { return getToken(MurMurParser.KEYWORD_MENU, 0); }
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
		public TerminalNode COMMAND_PARAMS_START() { return getToken(MurMurParser.COMMAND_PARAMS_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MenuCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterMenuCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitMenuCommand(this);
		}
	}

	public final MenuCommandContext menuCommand() throws RecognitionException {
		MenuCommandContext _localctx = new MenuCommandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_menuCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(COMMAND_START);
			setState(312);
			match(KEYWORD_MENU);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND_PARAMS_START) {
				{
				setState(313);
				match(COMMAND_PARAMS_START);
				setState(314);
				expression(0);
				}
			}

			setState(317);
			match(COMMAND_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuOptionCommandContext extends ParserRuleContext {
		public TerminalNode COMMAND_START() { return getToken(MurMurParser.COMMAND_START, 0); }
		public TerminalNode KEYWORD_MENU_OPTION() { return getToken(MurMurParser.KEYWORD_MENU_OPTION, 0); }
		public TerminalNode COMMAND_PARAMS_START() { return getToken(MurMurParser.COMMAND_PARAMS_START, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
		public TerminalNode COMMAND_PARAMS_SEPARATOR() { return getToken(MurMurParser.COMMAND_PARAMS_SEPARATOR, 0); }
		public MenuOptionCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuOptionCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterMenuOptionCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitMenuOptionCommand(this);
		}
	}

	public final MenuOptionCommandContext menuOptionCommand() throws RecognitionException {
		MenuOptionCommandContext _localctx = new MenuOptionCommandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_menuOptionCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(COMMAND_START);
			setState(320);
			match(KEYWORD_MENU_OPTION);
			setState(321);
			match(COMMAND_PARAMS_START);
			setState(322);
			expression(0);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND_PARAMS_SEPARATOR) {
				{
				setState(323);
				match(COMMAND_PARAMS_SEPARATOR);
				setState(324);
				expression(0);
				}
			}

			setState(327);
			match(COMMAND_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCommandContext extends ParserRuleContext {
		public TerminalNode COMMAND_START() { return getToken(MurMurParser.COMMAND_START, 0); }
		public TerminalNode KEYWORD_IF() { return getToken(MurMurParser.KEYWORD_IF, 0); }
		public TerminalNode COMMAND_PARAMS_START() { return getToken(MurMurParser.COMMAND_PARAMS_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
		public IfCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterIfCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitIfCommand(this);
		}
	}

	public final IfCommandContext ifCommand() throws RecognitionException {
		IfCommandContext _localctx = new IfCommandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(COMMAND_START);
			setState(330);
			match(KEYWORD_IF);
			setState(331);
			match(COMMAND_PARAMS_START);
			setState(332);
			expression(0);
			setState(333);
			match(COMMAND_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseCommandContext extends ParserRuleContext {
		public TerminalNode COMMAND_START() { return getToken(MurMurParser.COMMAND_START, 0); }
		public TerminalNode KEYWORD_ELSE() { return getToken(MurMurParser.KEYWORD_ELSE, 0); }
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
		public ElseCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterElseCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitElseCommand(this);
		}
	}

	public final ElseCommandContext elseCommand() throws RecognitionException {
		ElseCommandContext _localctx = new ElseCommandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(COMMAND_START);
			setState(336);
			match(KEYWORD_ELSE);
			setState(337);
			match(COMMAND_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndCommandContext extends ParserRuleContext {
		public TerminalNode COMMAND_START() { return getToken(MurMurParser.COMMAND_START, 0); }
		public TerminalNode KEYWORD_END() { return getToken(MurMurParser.KEYWORD_END, 0); }
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
		public EndCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterEndCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitEndCommand(this);
		}
	}

	public final EndCommandContext endCommand() throws RecognitionException {
		EndCommandContext _localctx = new EndCommandContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_endCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(COMMAND_START);
			setState(340);
			match(KEYWORD_END);
			setState(341);
			match(COMMAND_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode INCLUDE_KEYWORD() { return getToken(MurMurParser.INCLUDE_KEYWORD, 0); }
		public TerminalNode COMMAND_PARAMS_START() { return getToken(MurMurParser.COMMAND_PARAMS_START, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> COMMAND_NEWLINE() { return getTokens(MurMurParser.COMMAND_NEWLINE); }
		public TerminalNode COMMAND_NEWLINE(int i) {
			return getToken(MurMurParser.COMMAND_NEWLINE, i);
		}
		public TerminalNode NEW_TAG() { return getToken(MurMurParser.NEW_TAG, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(INCLUDE_KEYWORD);
			setState(344);
			match(COMMAND_PARAMS_START);
			setState(345);
			string();
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346);
					match(COMMAND_NEWLINE);
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(352);
				match(NEW_TAG);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0166\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2@\n\2\f"+
		"\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4"+
		"\3\4\7\4S\n\4\f\4\16\4V\13\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5^\n\5\r\5\16\5"+
		"_\3\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3\6\6\6j\n\6\r\6\16\6k\3\6\3\6\6\6p"+
		"\n\6\r\6\16\6q\3\6\5\6u\n\6\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\7\6\7\177"+
		"\n\7\r\7\16\7\u0080\3\7\3\7\6\7\u0085\n\7\r\7\16\7\u0086\3\7\5\7\u008a"+
		"\n\7\3\b\3\b\6\b\u008e\n\b\r\b\16\b\u008f\3\b\3\b\3\b\6\b\u0095\n\b\r"+
		"\b\16\b\u0096\3\b\3\b\5\b\u009b\n\b\3\b\3\b\6\b\u009f\n\b\r\b\16\b\u00a0"+
		"\3\b\5\b\u00a4\n\b\3\t\6\t\u00a7\n\t\r\t\16\t\u00a8\3\t\6\t\u00ac\n\t"+
		"\r\t\16\t\u00ad\3\t\5\t\u00b1\n\t\3\n\3\n\3\n\3\n\5\n\u00b7\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00be\n\13\3\13\3\13\3\f\6\f\u00c3\n\f\r\f\16"+
		"\f\u00c4\3\r\6\r\u00c8\n\r\r\r\16\r\u00c9\3\16\3\16\7\16\u00ce\n\16\f"+
		"\16\16\16\u00d1\13\16\3\16\5\16\u00d4\n\16\3\17\3\17\7\17\u00d8\n\17\f"+
		"\17\16\17\u00db\13\17\3\17\7\17\u00de\n\17\f\17\16\17\u00e1\13\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\7\21\u00e9\n\21\f\21\16\21\u00ec\13\21\3\21"+
		"\3\21\6\21\u00f0\n\21\r\21\16\21\u00f1\6\21\u00f4\n\21\r\21\16\21\u00f5"+
		"\3\21\7\21\u00f9\n\21\f\21\16\21\u00fc\13\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u010a\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0115\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0123\n\23\f\23\16\23\u0126\13\23"+
		"\3\24\3\24\3\24\7\24\u012b\n\24\f\24\16\24\u012e\13\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u013e\n\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0148\n\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\7\34\u015e\n\34\f\34\16\34\u0161\13\34\3\34\5\34\u0164"+
		"\n\34\3\34\2\3$\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\66\2\3\3\2 !\2\u0186\2A\3\2\2\2\4F\3\2\2\2\6O\3\2\2\2\b]\3\2\2"+
		"\2\na\3\2\2\2\fv\3\2\2\2\16\u008b\3\2\2\2\20\u00a6\3\2\2\2\22\u00b6\3"+
		"\2\2\2\24\u00b8\3\2\2\2\26\u00c2\3\2\2\2\30\u00c7\3\2\2\2\32\u00cb\3\2"+
		"\2\2\34\u00d5\3\2\2\2\36\u00e2\3\2\2\2 \u00e6\3\2\2\2\"\u00ff\3\2\2\2"+
		"$\u0114\3\2\2\2&\u0127\3\2\2\2(\u012f\3\2\2\2*\u0133\3\2\2\2,\u0139\3"+
		"\2\2\2.\u0141\3\2\2\2\60\u014b\3\2\2\2\62\u0151\3\2\2\2\64\u0155\3\2\2"+
		"\2\66\u0159\3\2\2\28@\5\6\4\29@\5\66\34\2:@\5\4\3\2;@\7\4\2\2<@\7\16\2"+
		"\2=@\7\r\2\2>@\7\f\2\2?8\3\2\2\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2"+
		"\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2"+
		"\2DE\7\2\2\3E\3\3\2\2\2FG\7\n\2\2GL\7\22\2\2HK\7\16\2\2IK\5$\23\2JH\3"+
		"\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NL\3\2\2\2OP"+
		"\7\7\2\2PT\7\13\2\2QS\7\4\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2"+
		"UW\3\2\2\2VT\3\2\2\2WX\5\b\5\2X\7\3\2\2\2Y^\5\16\b\2Z^\5\n\6\2[^\5\f\7"+
		"\2\\^\5\20\t\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2`\t\3\2\2\2ae\5(\25\2bd\7\4\2\2cb\3\2\2\2dg\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hj\5\34\17\2ih\3\2\2\2jk\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mt\5\64\33\2np\7\4\2\2on\3\2\2\2pq\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2su\7\2\2\3to\3\2\2\2ts\3\2\2\2u\13\3\2"+
		"\2\2vz\5,\27\2wy\7\4\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2"+
		"\2\2|z\3\2\2\2}\177\5\32\16\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0089\5\64\33\2\u0083"+
		"\u0085\7\4\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u008a\7\2\2\3\u0089"+
		"\u0084\3\2\2\2\u0089\u0088\3\2\2\2\u008a\r\3\2\2\2\u008b\u008d\5\60\31"+
		"\2\u008c\u008e\7\4\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009a\5\b\5\2\u0092"+
		"\u0094\5\62\32\2\u0093\u0095\7\4\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\5\b\5\2\u0099\u009b\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u00a3\5\64\33\2\u009d\u009f\7\4\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a4\7\2\2\3\u00a3\u009e\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\17\3\2\2\2\u00a5\u00a7\5\22\n\2\u00a6\u00a5\3\2\2"+
		"\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b0"+
		"\3\2\2\2\u00aa\u00ac\7\4\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b1\7\2"+
		"\2\3\u00b0\u00ab\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b7"+
		"\7\13\2\2\u00b3\u00b7\5\24\13\2\u00b4\u00b7\5\36\20\2\u00b5\u00b7\5 \21"+
		"\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\23\3\2\2\2\u00b8\u00b9\5\60\31\2\u00b9\u00bd\5\26\f\2\u00ba"+
		"\u00bb\5\62\32\2\u00bb\u00bc\5\30\r\2\u00bc\u00be\3\2\2\2\u00bd\u00ba"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\5\64\33\2"+
		"\u00c0\25\3\2\2\2\u00c1\u00c3\5\22\n\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\27\3\2\2\2\u00c6"+
		"\u00c8\5\22\n\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\31\3\2\2\2\u00cb\u00cf\5.\30\2\u00cc"+
		"\u00ce\7\4\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d4\5\b\5\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\33\3\2\2"+
		"\2\u00d5\u00d9\5*\26\2\u00d6\u00d8\7\4\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00df\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00de\5\b\5\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\35\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e3\7\b\2\2\u00e3\u00e4\5$\23\2\u00e4\u00e5\7\27\2\2"+
		"\u00e5\37\3\2\2\2\u00e6\u00ea\7\b\2\2\u00e7\u00e9\7\16\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00f3\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\5$\23\2\u00ee\u00f0\7\16"+
		"\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7"+
		"\u00f9\7\16\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\7\27\2\2\u00fe!\3\2\2\2\u00ff\u0100\7\23\2\2\u0100\u0101\7(\2\2"+
		"\u0101\u0102\7)\2\2\u0102#\3\2\2\2\u0103\u0104\b\23\1\2\u0104\u0115\7"+
		"\"\2\2\u0105\u0115\7#\2\2\u0106\u0109\7#\2\2\u0107\u0108\7\22\2\2\u0108"+
		"\u010a\5&\24\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0115\3\2"+
		"\2\2\u010b\u0115\t\2\2\2\u010c\u0115\5\"\22\2\u010d\u010e\7\24\2\2\u010e"+
		"\u010f\5$\23\2\u010f\u0110\7\25\2\2\u0110\u0115\3\2\2\2\u0111\u0112\7"+
		"#\2\2\u0112\u0113\7$\2\2\u0113\u0115\5$\23\3\u0114\u0103\3\2\2\2\u0114"+
		"\u0105\3\2\2\2\u0114\u0106\3\2\2\2\u0114\u010b\3\2\2\2\u0114\u010c\3\2"+
		"\2\2\u0114\u010d\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0124\3\2\2\2\u0116"+
		"\u0117\f\b\2\2\u0117\u0118\7&\2\2\u0118\u0123\5$\23\t\u0119\u011a\f\6"+
		"\2\2\u011a\u011b\7&\2\2\u011b\u0123\5$\23\7\u011c\u011d\f\5\2\2\u011d"+
		"\u011e\7\'\2\2\u011e\u0123\5$\23\6\u011f\u0120\f\4\2\2\u0120\u0121\7%"+
		"\2\2\u0121\u0123\5$\23\5\u0122\u0116\3\2\2\2\u0122\u0119\3\2\2\2\u0122"+
		"\u011c\3\2\2\2\u0122\u011f\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125%\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u012c"+
		"\5$\23\2\u0128\u0129\7\26\2\2\u0129\u012b\5$\23\2\u012a\u0128\3\2\2\2"+
		"\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\'\3"+
		"\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\b\2\2\u0130\u0131\7\36\2\2\u0131"+
		"\u0132\7\27\2\2\u0132)\3\2\2\2\u0133\u0134\7\b\2\2\u0134\u0135\7\37\2"+
		"\2\u0135\u0136\7\22\2\2\u0136\u0137\7\"\2\2\u0137\u0138\7\27\2\2\u0138"+
		"+\3\2\2\2\u0139\u013a\7\b\2\2\u013a\u013d\7\34\2\2\u013b\u013c\7\22\2"+
		"\2\u013c\u013e\5$\23\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0140\7\27\2\2\u0140-\3\2\2\2\u0141\u0142\7\b\2\2\u0142"+
		"\u0143\7\35\2\2\u0143\u0144\7\22\2\2\u0144\u0147\5$\23\2\u0145\u0146\7"+
		"\26\2\2\u0146\u0148\5$\23\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\7\27\2\2\u014a/\3\2\2\2\u014b\u014c\7\b\2\2"+
		"\u014c\u014d\7\30\2\2\u014d\u014e\7\22\2\2\u014e\u014f\5$\23\2\u014f\u0150"+
		"\7\27\2\2\u0150\61\3\2\2\2\u0151\u0152\7\b\2\2\u0152\u0153\7\31\2\2\u0153"+
		"\u0154\7\27\2\2\u0154\63\3\2\2\2\u0155\u0156\7\b\2\2\u0156\u0157\7\32"+
		"\2\2\u0157\u0158\7\27\2\2\u0158\65\3\2\2\2\u0159\u015a\7\t\2\2\u015a\u015b"+
		"\7\22\2\2\u015b\u015f\5\"\22\2\u015c\u015e\7\16\2\2\u015d\u015c\3\2\2"+
		"\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\7\f\2\2\u0163\u0162\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\67\3\2\2\2.?AJLT]_ekqtz\u0080\u0086\u0089\u008f\u0096"+
		"\u009a\u00a0\u00a3\u00a8\u00ad\u00b0\u00b6\u00bd\u00c4\u00c9\u00cf\u00d3"+
		"\u00d9\u00df\u00ea\u00f1\u00f5\u00fa\u0109\u0114\u0122\u0124\u012c\u013d"+
		"\u0147\u015f\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}