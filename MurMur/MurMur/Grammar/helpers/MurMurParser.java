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
		WHITESPACE=1, NEWLINE=2, LINE_COMMENT=3, TAG_START=4, COMMAND_START=5, 
		FAST_PICK_START=6, TEXT=7, COMMAND_NEWLINE=8, COMMAND_IGNORE=9, COMMAND_PARAMS_START=10, 
		COMMAND_STRING_START=11, OPEN_PAREN=12, CLOSE_PAREN=13, COMMAND_PARAMS_SEPARATOR=14, 
		COMMAND_END=15, KEYWORD_IF=16, KEYWORD_ELSE=17, KEYWORD_END=18, KEYWORD_GOTO=19, 
		KEYWORD_MENU=20, KEYWORD_MENU_OPTION=21, KEYWORD_PICK=22, KEYWORD_PICK_THIS=23, 
		TRUE=24, FALSE=25, NUMBER=26, WORD=27, ASSIGN_SIGNAL=28, COMPARISSON_SIGNAL=29, 
		MUL_DIV_SIGNAL=30, ADD_SUB_SIGNAL=31, SUB_TEXT_SEPARATOR=32, FAST_PICK_TEXT=33, 
		FAST_PICK_END=34, STRING=35, COMMAND_STRING_END=36;
	public static final int
		RULE_murmur = 0, RULE_tag = 1, RULE_block = 2, RULE_pickBlock = 3, RULE_menuBlock = 4, 
		RULE_ifBlock = 5, RULE_line = 6, RULE_lineFragment = 7, RULE_inlineIfBlock = 8, 
		RULE_inlineIfTrueFragment = 9, RULE_inlineIfFalseFragment = 10, RULE_menuSubBlock = 11, 
		RULE_fastPickBlock = 12, RULE_pickThisBlock = 13, RULE_simpleCommand = 14, 
		RULE_multiLineCommand = 15, RULE_string = 16, RULE_expression = 17, RULE_params = 18, 
		RULE_pickCommand = 19, RULE_pickThisCommand = 20, RULE_menuCommand = 21, 
		RULE_menuOptionCommand = 22, RULE_ifCommand = 23, RULE_elseCommand = 24, 
		RULE_endCommand = 25;
	public static final String[] ruleNames = {
		"murmur", "tag", "block", "pickBlock", "menuBlock", "ifBlock", "line", 
		"lineFragment", "inlineIfBlock", "inlineIfTrueFragment", "inlineIfFalseFragment", 
		"menuSubBlock", "fastPickBlock", "pickThisBlock", "simpleCommand", "multiLineCommand", 
		"string", "expression", "params", "pickCommand", "pickThisCommand", "menuCommand", 
		"menuOptionCommand", "ifCommand", "elseCommand", "endCommand"
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
		public List<TerminalNode> NEWLINE() { return getTokens(MurMurParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MurMurParser.NEWLINE, i);
		}
		public List<TagContext> tag() {
			return getRuleContexts(TagContext.class);
		}
		public TagContext tag(int i) {
			return getRuleContext(TagContext.class,i);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(52);
				match(NEWLINE);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				tag();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAG_START );
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
		enterRule(_localctx, 2, RULE_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(TAG_START);
			setState(64);
			match(TEXT);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(65);
				match(NEWLINE);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
		enterRule(_localctx, 4, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(73);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(74);
						pickBlock();
						}
						break;
					case 3:
						{
						setState(75);
						menuBlock();
						}
						break;
					case 4:
						{
						setState(76);
						line();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 6, RULE_pickBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			pickCommand();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(82);
				match(NEWLINE);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(88);
					pickThisBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(91); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(93);
			endCommand();
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94);
					match(NEWLINE);
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(99);
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
		enterRule(_localctx, 8, RULE_menuBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			menuCommand();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(103);
				match(NEWLINE);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(109);
					menuSubBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(114);
			endCommand();
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					match(NEWLINE);
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(120);
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
		enterRule(_localctx, 10, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			ifCommand();
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				match(NEWLINE);
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(129);
			block();
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(130);
				elseCommand();
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					match(NEWLINE);
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(136);
				block();
				}
				break;
			}
			setState(140);
			endCommand();
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					match(NEWLINE);
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(146);
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
		enterRule(_localctx, 12, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				lineFragment();
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMAND_START) | (1L << FAST_PICK_START) | (1L << TEXT))) != 0) );
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					match(NEWLINE);
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(159);
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
		public FastPickBlockContext fastPickBlock() {
			return getRuleContext(FastPickBlockContext.class,0);
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
		enterRule(_localctx, 14, RULE_lineFragment);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				inlineIfBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				simpleCommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				multiLineCommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				fastPickBlock();
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
		enterRule(_localctx, 16, RULE_inlineIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			ifCommand();
			setState(170);
			inlineIfTrueFragment();
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(171);
				elseCommand();
				setState(172);
				inlineIfFalseFragment();
				}
				break;
			}
			setState(176);
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
		enterRule(_localctx, 18, RULE_inlineIfTrueFragment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(178);
					lineFragment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(181); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 20, RULE_inlineIfFalseFragment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(183);
					lineFragment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(186); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 22, RULE_menuSubBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			menuOptionCommand();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(189);
				match(NEWLINE);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(195);
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

	public static class FastPickBlockContext extends ParserRuleContext {
		public TerminalNode FAST_PICK_START() { return getToken(MurMurParser.FAST_PICK_START, 0); }
		public List<TerminalNode> FAST_PICK_TEXT() { return getTokens(MurMurParser.FAST_PICK_TEXT); }
		public TerminalNode FAST_PICK_TEXT(int i) {
			return getToken(MurMurParser.FAST_PICK_TEXT, i);
		}
		public TerminalNode FAST_PICK_END() { return getToken(MurMurParser.FAST_PICK_END, 0); }
		public List<TerminalNode> SUB_TEXT_SEPARATOR() { return getTokens(MurMurParser.SUB_TEXT_SEPARATOR); }
		public TerminalNode SUB_TEXT_SEPARATOR(int i) {
			return getToken(MurMurParser.SUB_TEXT_SEPARATOR, i);
		}
		public FastPickBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fastPickBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterFastPickBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitFastPickBlock(this);
		}
	}

	public final FastPickBlockContext fastPickBlock() throws RecognitionException {
		FastPickBlockContext _localctx = new FastPickBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fastPickBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(FAST_PICK_START);
			setState(199);
			match(FAST_PICK_TEXT);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB_TEXT_SEPARATOR) {
				{
				{
				setState(200);
				match(SUB_TEXT_SEPARATOR);
				setState(201);
				match(FAST_PICK_TEXT);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(FAST_PICK_END);
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
			setState(209);
			pickThisCommand();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(210);
				match(NEWLINE);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					block();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(222);
			match(COMMAND_START);
			setState(223);
			expression(0);
			setState(224);
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
			setState(226);
			match(COMMAND_START);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND_NEWLINE) {
				{
				{
				setState(227);
				match(COMMAND_NEWLINE);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				expression(0);
				setState(235); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(234);
						match(COMMAND_NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(237); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMAND_STRING_START) | (1L << OPEN_PAREN) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << WORD))) != 0) );
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND_NEWLINE) {
				{
				{
				setState(243);
				match(COMMAND_NEWLINE);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
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
			setState(251);
			match(COMMAND_STRING_START);
			setState(252);
			match(STRING);
			setState(253);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(256);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new MethodOrVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(WORD);
				}
				break;
			case 3:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(WORD);
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(259);
					match(COMMAND_PARAMS_START);
					setState(260);
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
				setState(263);
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
				setState(264);
				string();
				}
				break;
			case 6:
				{
				_localctx = new PriorityExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(OPEN_PAREN);
				setState(266);
				expression(0);
				setState(267);
				match(CLOSE_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new AssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(WORD);
				setState(270);
				match(ASSIGN_SIGNAL);
				setState(271);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(275);
						match(MUL_DIV_SIGNAL);
						setState(276);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(278);
						match(MUL_DIV_SIGNAL);
						setState(279);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(281);
						match(ADD_SUB_SIGNAL);
						setState(282);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ComparissonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(284);
						match(COMPARISSON_SIGNAL);
						setState(285);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
			setState(291);
			expression(0);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					match(COMMAND_PARAMS_SEPARATOR);
					setState(293);
					expression(0);
					}
					} 
				}
				setState(298);
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
			setState(299);
			match(COMMAND_START);
			setState(300);
			match(KEYWORD_PICK);
			setState(301);
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
			setState(303);
			match(COMMAND_START);
			setState(304);
			match(KEYWORD_PICK_THIS);
			setState(305);
			match(COMMAND_PARAMS_START);
			setState(306);
			match(NUMBER);
			setState(307);
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
			setState(309);
			match(COMMAND_START);
			setState(310);
			match(KEYWORD_MENU);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND_PARAMS_START) {
				{
				setState(311);
				match(COMMAND_PARAMS_START);
				setState(312);
				expression(0);
				}
			}

			setState(315);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(COMMAND_START);
			setState(318);
			match(KEYWORD_MENU_OPTION);
			setState(319);
			match(COMMAND_PARAMS_START);
			setState(320);
			expression(0);
			{
			setState(321);
			match(COMMAND_PARAMS_SEPARATOR);
			setState(322);
			expression(0);
			}
			setState(324);
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
			setState(326);
			match(COMMAND_START);
			setState(327);
			match(KEYWORD_IF);
			setState(328);
			match(COMMAND_PARAMS_START);
			setState(329);
			expression(0);
			setState(330);
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
			setState(332);
			match(COMMAND_START);
			setState(333);
			match(KEYWORD_ELSE);
			setState(334);
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
			setState(336);
			match(COMMAND_START);
			setState(337);
			match(KEYWORD_END);
			setState(338);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0157\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\6\2>\n\2\r\2\16\2"+
		"?\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4P\n\4"+
		"\r\4\16\4Q\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\5\6\5\\\n\5\r\5\16\5]\3\5"+
		"\3\5\6\5b\n\5\r\5\16\5c\3\5\5\5g\n\5\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3"+
		"\6\6\6q\n\6\r\6\16\6r\3\6\3\6\6\6w\n\6\r\6\16\6x\3\6\5\6|\n\6\3\7\3\7"+
		"\6\7\u0080\n\7\r\7\16\7\u0081\3\7\3\7\3\7\6\7\u0087\n\7\r\7\16\7\u0088"+
		"\3\7\3\7\5\7\u008d\n\7\3\7\3\7\6\7\u0091\n\7\r\7\16\7\u0092\3\7\5\7\u0096"+
		"\n\7\3\b\6\b\u0099\n\b\r\b\16\b\u009a\3\b\6\b\u009e\n\b\r\b\16\b\u009f"+
		"\3\b\5\b\u00a3\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00b1\n\n\3\n\3\n\3\13\6\13\u00b6\n\13\r\13\16\13\u00b7\3\f\6\f"+
		"\u00bb\n\f\r\f\16\f\u00bc\3\r\3\r\7\r\u00c1\n\r\f\r\16\r\u00c4\13\r\3"+
		"\r\5\r\u00c7\n\r\3\16\3\16\3\16\3\16\7\16\u00cd\n\16\f\16\16\16\u00d0"+
		"\13\16\3\16\3\16\3\17\3\17\7\17\u00d6\n\17\f\17\16\17\u00d9\13\17\3\17"+
		"\7\17\u00dc\n\17\f\17\16\17\u00df\13\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\7\21\u00e7\n\21\f\21\16\21\u00ea\13\21\3\21\3\21\6\21\u00ee\n\21\r\21"+
		"\16\21\u00ef\6\21\u00f2\n\21\r\21\16\21\u00f3\3\21\7\21\u00f7\n\21\f\21"+
		"\16\21\u00fa\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u0108\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0113\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0121\n\23\f\23\16\23\u0124\13\23\3\24\3\24\3\24\7\24\u0129"+
		"\n\24\f\24\16\24\u012c\13\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\5\27\u013c\n\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\2\3$\34\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\2\3\3\2\32\33\2\u0170\29\3\2\2\2\4A\3\2"+
		"\2\2\6O\3\2\2\2\bS\3\2\2\2\nh\3\2\2\2\f}\3\2\2\2\16\u0098\3\2\2\2\20\u00a9"+
		"\3\2\2\2\22\u00ab\3\2\2\2\24\u00b5\3\2\2\2\26\u00ba\3\2\2\2\30\u00be\3"+
		"\2\2\2\32\u00c8\3\2\2\2\34\u00d3\3\2\2\2\36\u00e0\3\2\2\2 \u00e4\3\2\2"+
		"\2\"\u00fd\3\2\2\2$\u0112\3\2\2\2&\u0125\3\2\2\2(\u012d\3\2\2\2*\u0131"+
		"\3\2\2\2,\u0137\3\2\2\2.\u013f\3\2\2\2\60\u0148\3\2\2\2\62\u014e\3\2\2"+
		"\2\64\u0152\3\2\2\2\668\7\4\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:"+
		"\3\2\2\2:=\3\2\2\2;9\3\2\2\2<>\5\4\3\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?"+
		"@\3\2\2\2@\3\3\2\2\2AB\7\6\2\2BF\7\t\2\2CE\7\4\2\2DC\3\2\2\2EH\3\2\2\2"+
		"FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\6\4\2J\5\3\2\2\2KP\5\f\7"+
		"\2LP\5\b\5\2MP\5\n\6\2NP\5\16\b\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2"+
		"\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\7\3\2\2\2SW\5(\25\2TV\7\4\2\2UT\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2Z\\\5\34\17\2"+
		"[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_f\5\64\33\2`b\7\4"+
		"\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2eg\7\2\2\3fa\3\2"+
		"\2\2fe\3\2\2\2g\t\3\2\2\2hl\5,\27\2ik\7\4\2\2ji\3\2\2\2kn\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2oq\5\30\r\2po\3\2\2\2qr\3\2\2\2rp"+
		"\3\2\2\2rs\3\2\2\2st\3\2\2\2t{\5\64\33\2uw\7\4\2\2vu\3\2\2\2wx\3\2\2\2"+
		"xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2z|\7\2\2\3{v\3\2\2\2{z\3\2\2\2|\13\3\2\2"+
		"\2}\177\5\60\31\2~\u0080\7\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008c\5\6\4"+
		"\2\u0084\u0086\5\62\32\2\u0085\u0087\7\4\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\5\6\4\2\u008b\u008d\3\2\2\2\u008c\u0084\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0095\5\64\33\2\u008f\u0091\7"+
		"\4\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0096\7\2\2\3\u0095\u0090\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\r\3\2\2\2\u0097\u0099\5\20\t\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u00a2\3\2\2\2\u009c\u009e\7\4\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u00a3\7\2\2\3\u00a2\u009d\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\17\3\2\2"+
		"\2\u00a4\u00aa\7\t\2\2\u00a5\u00aa\5\22\n\2\u00a6\u00aa\5\36\20\2\u00a7"+
		"\u00aa\5 \21\2\u00a8\u00aa\5\32\16\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3"+
		"\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\21\3\2\2\2\u00ab\u00ac\5\60\31\2\u00ac\u00b0\5\24\13\2\u00ad\u00ae\5"+
		"\62\32\2\u00ae\u00af\5\26\f\2\u00af\u00b1\3\2\2\2\u00b0\u00ad\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\5\64\33\2\u00b3\23"+
		"\3\2\2\2\u00b4\u00b6\5\20\t\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\25\3\2\2\2\u00b9\u00bb"+
		"\5\20\t\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\27\3\2\2\2\u00be\u00c2\5.\30\2\u00bf\u00c1"+
		"\7\4\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\5\6"+
		"\4\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\31\3\2\2\2\u00c8\u00c9"+
		"\7\b\2\2\u00c9\u00ce\7#\2\2\u00ca\u00cb\7\"\2\2\u00cb\u00cd\7#\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2"+
		"\33\3\2\2\2\u00d3\u00d7\5*\26\2\u00d4\u00d6\7\4\2\2\u00d5\u00d4\3\2\2"+
		"\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dd"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\5\6\4\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\35\3\2\2"+
		"\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\7\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e3"+
		"\7\21\2\2\u00e3\37\3\2\2\2\u00e4\u00e8\7\7\2\2\u00e5\u00e7\7\n\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00f1\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\5$\23\2\u00ec"+
		"\u00ee\7\n\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f8\3\2"+
		"\2\2\u00f5\u00f7\7\n\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7\21\2\2\u00fc!\3\2\2\2\u00fd\u00fe\7\r\2\2\u00fe\u00ff"+
		"\7%\2\2\u00ff\u0100\7&\2\2\u0100#\3\2\2\2\u0101\u0102\b\23\1\2\u0102\u0113"+
		"\7\34\2\2\u0103\u0113\7\35\2\2\u0104\u0107\7\35\2\2\u0105\u0106\7\f\2"+
		"\2\u0106\u0108\5&\24\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0113"+
		"\3\2\2\2\u0109\u0113\t\2\2\2\u010a\u0113\5\"\22\2\u010b\u010c\7\16\2\2"+
		"\u010c\u010d\5$\23\2\u010d\u010e\7\17\2\2\u010e\u0113\3\2\2\2\u010f\u0110"+
		"\7\35\2\2\u0110\u0111\7\36\2\2\u0111\u0113\5$\23\3\u0112\u0101\3\2\2\2"+
		"\u0112\u0103\3\2\2\2\u0112\u0104\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u010a"+
		"\3\2\2\2\u0112\u010b\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u0122\3\2\2\2\u0114"+
		"\u0115\f\b\2\2\u0115\u0116\7 \2\2\u0116\u0121\5$\23\t\u0117\u0118\f\6"+
		"\2\2\u0118\u0119\7 \2\2\u0119\u0121\5$\23\7\u011a\u011b\f\5\2\2\u011b"+
		"\u011c\7!\2\2\u011c\u0121\5$\23\6\u011d\u011e\f\4\2\2\u011e\u011f\7\37"+
		"\2\2\u011f\u0121\5$\23\5\u0120\u0114\3\2\2\2\u0120\u0117\3\2\2\2\u0120"+
		"\u011a\3\2\2\2\u0120\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123%\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u012a"+
		"\5$\23\2\u0126\u0127\7\20\2\2\u0127\u0129\5$\23\2\u0128\u0126\3\2\2\2"+
		"\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\'\3"+
		"\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\7\2\2\u012e\u012f\7\30\2\2\u012f"+
		"\u0130\7\21\2\2\u0130)\3\2\2\2\u0131\u0132\7\7\2\2\u0132\u0133\7\31\2"+
		"\2\u0133\u0134\7\f\2\2\u0134\u0135\7\34\2\2\u0135\u0136\7\21\2\2\u0136"+
		"+\3\2\2\2\u0137\u0138\7\7\2\2\u0138\u013b\7\26\2\2\u0139\u013a\7\f\2\2"+
		"\u013a\u013c\5$\23\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\7\21\2\2\u013e-\3\2\2\2\u013f\u0140\7\7\2\2\u0140"+
		"\u0141\7\27\2\2\u0141\u0142\7\f\2\2\u0142\u0143\5$\23\2\u0143\u0144\7"+
		"\20\2\2\u0144\u0145\5$\23\2\u0145\u0146\3\2\2\2\u0146\u0147\7\21\2\2\u0147"+
		"/\3\2\2\2\u0148\u0149\7\7\2\2\u0149\u014a\7\22\2\2\u014a\u014b\7\f\2\2"+
		"\u014b\u014c\5$\23\2\u014c\u014d\7\21\2\2\u014d\61\3\2\2\2\u014e\u014f"+
		"\7\7\2\2\u014f\u0150\7\23\2\2\u0150\u0151\7\21\2\2\u0151\63\3\2\2\2\u0152"+
		"\u0153\7\7\2\2\u0153\u0154\7\24\2\2\u0154\u0155\7\21\2\2\u0155\65\3\2"+
		"\2\2*9?FOQW]cflrx{\u0081\u0088\u008c\u0092\u0095\u009a\u009f\u00a2\u00a9"+
		"\u00b0\u00b7\u00bc\u00c2\u00c6\u00ce\u00d7\u00dd\u00e8\u00ef\u00f3\u00f8"+
		"\u0107\u0112\u0120\u0122\u012a\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}