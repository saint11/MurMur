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
		FAST_PICK_START=6, TEXT=7, COMMAND_IGNORE=8, COMMAND_PARAMS_START=9, COMMAND_STRING_START=10, 
		COMMAND_PARAMS_SEPARATOR=11, COMMAND_END=12, KEYWORD_IF=13, KEYWORD_ELSE=14, 
		KEYWORD_END=15, KEYWORD_GOTO=16, KEYWORD_MENU=17, KEYWORD_MENU_OPTION=18, 
		KEYWORD_PICK=19, KEYWORD_PICK_THIS=20, TRUE=21, FALSE=22, NUMBER=23, INT=24, 
		WORD=25, ASSIGN_SIGNAL=26, COMPARISSON_SIGNAL=27, MUL_DIV_SIGNAL=28, ADD_SUB_SIGNAL=29, 
		SUB_TEXT_SEPARATOR=30, FAST_PICK_TEXT=31, FAST_PICK_END=32, STRING=33, 
		COMMAND_STRING_END=34;
	public static final int
		RULE_murmur = 0, RULE_tag = 1, RULE_block = 2, RULE_pickBlock = 3, RULE_menuBlock = 4, 
		RULE_ifBlock = 5, RULE_line = 6, RULE_lineFragment = 7, RULE_inlineIfBlock = 8, 
		RULE_inlineIfTrueFragment = 9, RULE_inlineIfFalseFragment = 10, RULE_menuSubBlock = 11, 
		RULE_fastPickBlock = 12, RULE_pickThisBlock = 13, RULE_command = 14, RULE_expression = 15, 
		RULE_params = 16, RULE_pickCommand = 17, RULE_pickThisCommand = 18, RULE_menuCommand = 19, 
		RULE_menuOptionCommand = 20, RULE_ifCommand = 21, RULE_elseCommand = 22, 
		RULE_endCommand = 23;
	public static final String[] ruleNames = {
		"murmur", "tag", "block", "pickBlock", "menuBlock", "ifBlock", "line", 
		"lineFragment", "inlineIfBlock", "inlineIfTrueFragment", "inlineIfFalseFragment", 
		"menuSubBlock", "fastPickBlock", "pickThisBlock", "command", "expression", 
		"params", "pickCommand", "pickThisCommand", "menuCommand", "menuOptionCommand", 
		"ifCommand", "elseCommand", "endCommand"
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(48);
				match(NEWLINE);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				tag();
				}
				}
				setState(57); 
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
			setState(59);
			match(TAG_START);
			setState(60);
			match(TEXT);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(61);
				match(NEWLINE);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(73); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(69);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(70);
						pickBlock();
						}
						break;
					case 3:
						{
						setState(71);
						menuBlock();
						}
						break;
					case 4:
						{
						setState(72);
						line();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75); 
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
			setState(77);
			pickCommand();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(78);
				match(NEWLINE);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(84);
					pickThisBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(89);
			endCommand();
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					match(NEWLINE);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(95);
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
			setState(98);
			menuCommand();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(99);
				match(NEWLINE);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(105);
					menuSubBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(108); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(110);
			endCommand();
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					match(NEWLINE);
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(116);
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
			setState(119);
			ifCommand();
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				match(NEWLINE);
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(125);
			block();
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(126);
				elseCommand();
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					match(NEWLINE);
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(132);
				block();
				}
				break;
			}
			setState(136);
			endCommand();
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137);
					match(NEWLINE);
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(142);
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
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				lineFragment();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMAND_START) | (1L << FAST_PICK_START) | (1L << TEXT))) != 0) );
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					match(NEWLINE);
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(155);
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				inlineIfBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
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
			setState(164);
			ifCommand();
			setState(165);
			inlineIfTrueFragment();
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(166);
				elseCommand();
				setState(167);
				inlineIfFalseFragment();
				}
				break;
			}
			setState(171);
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
			setState(174); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(173);
					lineFragment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(176); 
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MurMurParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MurMurParser.NEWLINE, i);
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
			setState(183);
			menuOptionCommand();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(184);
				match(NEWLINE);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
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
			setState(192);
			match(FAST_PICK_START);
			setState(193);
			match(FAST_PICK_TEXT);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB_TEXT_SEPARATOR) {
				{
				{
				setState(194);
				match(SUB_TEXT_SEPARATOR);
				setState(195);
				match(FAST_PICK_TEXT);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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
			setState(203);
			pickThisCommand();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(204);
				match(NEWLINE);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					block();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode COMMAND_START() { return getToken(MurMurParser.COMMAND_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(COMMAND_START);
			setState(217);
			expression(0);
			setState(218);
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
		public TerminalNode COMMAND_STRING_START() { return getToken(MurMurParser.COMMAND_STRING_START, 0); }
		public TerminalNode STRING() { return getToken(MurMurParser.STRING, 0); }
		public TerminalNode COMMAND_STRING_END() { return getToken(MurMurParser.COMMAND_STRING_END, 0); }
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
	public static class AdditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD_SUB_SIGNAL() { return getToken(MurMurParser.ADD_SUB_SIGNAL, 0); }
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitAdditionExpression(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(MurMurParser.NUMBER, 0); }
		public TerminalNode INT() { return getToken(MurMurParser.INT, 0); }
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(221);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new MethodOrVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(WORD);
				}
				break;
			case 3:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(WORD);
				setState(226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(224);
					match(COMMAND_PARAMS_START);
					setState(225);
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
				setState(228);
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
				setState(229);
				match(COMMAND_STRING_START);
				setState(230);
				match(STRING);
				setState(231);
				match(COMMAND_STRING_END);
				}
				break;
			case 6:
				{
				_localctx = new AssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(WORD);
				setState(233);
				match(ASSIGN_SIGNAL);
				setState(234);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(238);
						match(MUL_DIV_SIGNAL);
						setState(239);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(241);
						match(ADD_SUB_SIGNAL);
						setState(242);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ComparissonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(244);
						match(COMPARISSON_SIGNAL);
						setState(245);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 32, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			expression(0);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
					match(COMMAND_PARAMS_SEPARATOR);
					setState(253);
					expression(0);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 34, RULE_pickCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(COMMAND_START);
			setState(260);
			match(KEYWORD_PICK);
			setState(261);
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
		enterRule(_localctx, 36, RULE_pickThisCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(COMMAND_START);
			setState(264);
			match(KEYWORD_PICK_THIS);
			setState(265);
			match(COMMAND_PARAMS_START);
			setState(266);
			match(NUMBER);
			setState(267);
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
		enterRule(_localctx, 38, RULE_menuCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(COMMAND_START);
			setState(270);
			match(KEYWORD_MENU);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND_PARAMS_START) {
				{
				setState(271);
				match(COMMAND_PARAMS_START);
				setState(272);
				expression(0);
				}
			}

			setState(275);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMAND_END() { return getToken(MurMurParser.COMMAND_END, 0); }
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
		enterRule(_localctx, 40, RULE_menuOptionCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(COMMAND_START);
			setState(278);
			match(KEYWORD_MENU_OPTION);
			setState(279);
			match(COMMAND_PARAMS_START);
			setState(280);
			expression(0);
			setState(281);
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
		enterRule(_localctx, 42, RULE_ifCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(COMMAND_START);
			setState(284);
			match(KEYWORD_IF);
			setState(285);
			match(COMMAND_PARAMS_START);
			setState(286);
			expression(0);
			setState(287);
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
		enterRule(_localctx, 44, RULE_elseCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(COMMAND_START);
			setState(290);
			match(KEYWORD_ELSE);
			setState(291);
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
		enterRule(_localctx, 46, RULE_endCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(COMMAND_START);
			setState(294);
			match(KEYWORD_END);
			setState(295);
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
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\6\2:\n\2\r\2\16\2;\3\3\3\3\3\3\7"+
		"\3A\n\3\f\3\16\3D\13\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4L\n\4\r\4\16\4M\3\5"+
		"\3\5\7\5R\n\5\f\5\16\5U\13\5\3\5\6\5X\n\5\r\5\16\5Y\3\5\3\5\6\5^\n\5\r"+
		"\5\16\5_\3\5\5\5c\n\5\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\6\6m\n\6\r\6"+
		"\16\6n\3\6\3\6\6\6s\n\6\r\6\16\6t\3\6\5\6x\n\6\3\7\3\7\6\7|\n\7\r\7\16"+
		"\7}\3\7\3\7\3\7\6\7\u0083\n\7\r\7\16\7\u0084\3\7\3\7\5\7\u0089\n\7\3\7"+
		"\3\7\6\7\u008d\n\7\r\7\16\7\u008e\3\7\5\7\u0092\n\7\3\b\6\b\u0095\n\b"+
		"\r\b\16\b\u0096\3\b\6\b\u009a\n\b\r\b\16\b\u009b\3\b\5\b\u009f\n\b\3\t"+
		"\3\t\3\t\3\t\5\t\u00a5\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\n\3\n\3"+
		"\13\6\13\u00b1\n\13\r\13\16\13\u00b2\3\f\6\f\u00b6\n\f\r\f\16\f\u00b7"+
		"\3\r\3\r\7\r\u00bc\n\r\f\r\16\r\u00bf\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\7\16\u00c7\n\16\f\16\16\16\u00ca\13\16\3\16\3\16\3\17\3\17\7\17\u00d0"+
		"\n\17\f\17\16\17\u00d3\13\17\3\17\7\17\u00d6\n\17\f\17\16\17\u00d9\13"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e5\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ee\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u00f9\n\21\f\21\16\21\u00fc\13\21\3\22"+
		"\3\22\3\22\7\22\u0101\n\22\f\22\16\22\u0104\13\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0114\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\2\3 \32\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\2\4\3\2\31\32\3\2\27\30\2\u013f\2\65\3"+
		"\2\2\2\4=\3\2\2\2\6K\3\2\2\2\bO\3\2\2\2\nd\3\2\2\2\fy\3\2\2\2\16\u0094"+
		"\3\2\2\2\20\u00a4\3\2\2\2\22\u00a6\3\2\2\2\24\u00b0\3\2\2\2\26\u00b5\3"+
		"\2\2\2\30\u00b9\3\2\2\2\32\u00c2\3\2\2\2\34\u00cd\3\2\2\2\36\u00da\3\2"+
		"\2\2 \u00ed\3\2\2\2\"\u00fd\3\2\2\2$\u0105\3\2\2\2&\u0109\3\2\2\2(\u010f"+
		"\3\2\2\2*\u0117\3\2\2\2,\u011d\3\2\2\2.\u0123\3\2\2\2\60\u0127\3\2\2\2"+
		"\62\64\7\4\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2"+
		"\669\3\2\2\2\67\65\3\2\2\28:\5\4\3\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3"+
		"\2\2\2<\3\3\2\2\2=>\7\6\2\2>B\7\t\2\2?A\7\4\2\2@?\3\2\2\2AD\3\2\2\2B@"+
		"\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\5\6\4\2F\5\3\2\2\2GL\5\f\7\2"+
		"HL\5\b\5\2IL\5\n\6\2JL\5\16\b\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2"+
		"\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\7\3\2\2\2OS\5$\23\2PR\7\4\2\2QP\3\2"+
		"\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VX\5\34\17\2WV\3"+
		"\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[b\5\60\31\2\\^\7\4\2\2"+
		"]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2ac\7\2\2\3b]\3\2\2"+
		"\2ba\3\2\2\2c\t\3\2\2\2dh\5(\25\2eg\7\4\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2"+
		"\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2km\5\30\r\2lk\3\2\2\2mn\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2op\3\2\2\2pw\5\60\31\2qs\7\4\2\2rq\3\2\2\2st\3\2\2\2t"+
		"r\3\2\2\2tu\3\2\2\2ux\3\2\2\2vx\7\2\2\3wr\3\2\2\2wv\3\2\2\2x\13\3\2\2"+
		"\2y{\5,\27\2z|\7\4\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3"+
		"\2\2\2\177\u0088\5\6\4\2\u0080\u0082\5.\30\2\u0081\u0083\7\4\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5\6\4\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0080\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0091\5\60"+
		"\31\2\u008b\u008d\7\4\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u0092\7\2"+
		"\2\3\u0091\u008c\3\2\2\2\u0091\u0090\3\2\2\2\u0092\r\3\2\2\2\u0093\u0095"+
		"\5\20\t\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u009e\3\2\2\2\u0098\u009a\7\4\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009f\7\2\2\3\u009e\u0099\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\17\3\2\2\2\u00a0\u00a5\7\t\2\2\u00a1\u00a5\5\22\n\2\u00a2\u00a5"+
		"\5\36\20\2\u00a3\u00a5\5\32\16\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00a7"+
		"\5,\27\2\u00a7\u00ab\5\24\13\2\u00a8\u00a9\5.\30\2\u00a9\u00aa\5\26\f"+
		"\2\u00aa\u00ac\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ae\5\60\31\2\u00ae\23\3\2\2\2\u00af\u00b1\5\20\t\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\25\3\2\2\2\u00b4\u00b6\5\20\t\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\27\3\2\2\2\u00b9"+
		"\u00bd\5*\26\2\u00ba\u00bc\7\4\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\5\6\4\2\u00c1\31\3\2\2\2\u00c2\u00c3\7\b\2"+
		"\2\u00c3\u00c8\7!\2\2\u00c4\u00c5\7 \2\2\u00c5\u00c7\7!\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\"\2\2\u00cc\33\3\2\2"+
		"\2\u00cd\u00d1\5&\24\2\u00ce\u00d0\7\4\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d7\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d6\5\6\4\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\35\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00db\7\7\2\2\u00db\u00dc\5 \21\2\u00dc\u00dd\7\16\2\2"+
		"\u00dd\37\3\2\2\2\u00de\u00df\b\21\1\2\u00df\u00ee\t\2\2\2\u00e0\u00ee"+
		"\7\33\2\2\u00e1\u00e4\7\33\2\2\u00e2\u00e3\7\13\2\2\u00e3\u00e5\5\"\22"+
		"\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ee\3\2\2\2\u00e6\u00ee"+
		"\t\3\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ee\7$\2\2\u00ea"+
		"\u00eb\7\33\2\2\u00eb\u00ec\7\34\2\2\u00ec\u00ee\5 \21\3\u00ed\u00de\3"+
		"\2\2\2\u00ed\u00e0\3\2\2\2\u00ed\u00e1\3\2\2\2\u00ed\u00e6\3\2\2\2\u00ed"+
		"\u00e7\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00fa\3\2\2\2\u00ef\u00f0\f\6"+
		"\2\2\u00f0\u00f1\7\36\2\2\u00f1\u00f9\5 \21\7\u00f2\u00f3\f\5\2\2\u00f3"+
		"\u00f4\7\37\2\2\u00f4\u00f9\5 \21\6\u00f5\u00f6\f\4\2\2\u00f6\u00f7\7"+
		"\35\2\2\u00f7\u00f9\5 \21\5\u00f8\u00ef\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb!\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0102\5 \21\2\u00fe\u00ff"+
		"\7\r\2\2\u00ff\u0101\5 \21\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103#\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u0106\7\7\2\2\u0106\u0107\7\25\2\2\u0107\u0108\7\16\2\2\u0108%"+
		"\3\2\2\2\u0109\u010a\7\7\2\2\u010a\u010b\7\26\2\2\u010b\u010c\7\13\2\2"+
		"\u010c\u010d\7\31\2\2\u010d\u010e\7\16\2\2\u010e\'\3\2\2\2\u010f\u0110"+
		"\7\7\2\2\u0110\u0113\7\23\2\2\u0111\u0112\7\13\2\2\u0112\u0114\5 \21\2"+
		"\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\7\16\2\2\u0116)\3\2\2\2\u0117\u0118\7\7\2\2\u0118\u0119\7\24\2\2\u0119"+
		"\u011a\7\13\2\2\u011a\u011b\5 \21\2\u011b\u011c\7\16\2\2\u011c+\3\2\2"+
		"\2\u011d\u011e\7\7\2\2\u011e\u011f\7\17\2\2\u011f\u0120\7\13\2\2\u0120"+
		"\u0121\5 \21\2\u0121\u0122\7\16\2\2\u0122-\3\2\2\2\u0123\u0124\7\7\2\2"+
		"\u0124\u0125\7\20\2\2\u0125\u0126\7\16\2\2\u0126/\3\2\2\2\u0127\u0128"+
		"\7\7\2\2\u0128\u0129\7\21\2\2\u0129\u012a\7\16\2\2\u012a\61\3\2\2\2%\65"+
		";BKMSY_bhntw}\u0084\u0088\u008e\u0091\u0096\u009b\u009e\u00a4\u00ab\u00b2"+
		"\u00b7\u00bd\u00c8\u00d1\u00d7\u00e4\u00ed\u00f8\u00fa\u0102\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}