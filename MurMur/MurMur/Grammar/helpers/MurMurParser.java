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
		KEYWORD_PICK=19, KEYWORD_PICK_THIS=20, TRUE=21, FALSE=22, NUMBER=23, WORD=24, 
		ASSIGN_SIGNAL=25, COMPARISSON_SIGNAL=26, MUL_DIV_SIGNAL=27, ADD_SUB_SIGNAL=28, 
		SUB_TEXT_SEPARATOR=29, FAST_PICK_TEXT=30, FAST_PICK_END=31, STRING=32, 
		COMMAND_STRING_END=33;
	public static final int
		RULE_murmur = 0, RULE_tag = 1, RULE_block = 2, RULE_pickBlock = 3, RULE_menuBlock = 4, 
		RULE_ifBlock = 5, RULE_line = 6, RULE_lineFragment = 7, RULE_inlineIfBlock = 8, 
		RULE_inlineIfTrueFragment = 9, RULE_inlineIfFalseFragment = 10, RULE_menuSubBlock = 11, 
		RULE_fastPickBlock = 12, RULE_pickThisBlock = 13, RULE_command = 14, RULE_string = 15, 
		RULE_expression = 16, RULE_params = 17, RULE_pickCommand = 18, RULE_pickThisCommand = 19, 
		RULE_menuCommand = 20, RULE_menuOptionCommand = 21, RULE_ifCommand = 22, 
		RULE_elseCommand = 23, RULE_endCommand = 24;
	public static final String[] ruleNames = {
		"murmur", "tag", "block", "pickBlock", "menuBlock", "ifBlock", "line", 
		"lineFragment", "inlineIfBlock", "inlineIfTrueFragment", "inlineIfFalseFragment", 
		"menuSubBlock", "fastPickBlock", "pickThisBlock", "command", "string", 
		"expression", "params", "pickCommand", "pickThisCommand", "menuCommand", 
		"menuOptionCommand", "ifCommand", "elseCommand", "endCommand"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LINE_COMMENT", "TAG_START", "COMMAND_START", 
		"FAST_PICK_START", "TEXT", "COMMAND_IGNORE", "COMMAND_PARAMS_START", "COMMAND_STRING_START", 
		"COMMAND_PARAMS_SEPARATOR", "COMMAND_END", "KEYWORD_IF", "KEYWORD_ELSE", 
		"KEYWORD_END", "KEYWORD_GOTO", "KEYWORD_MENU", "KEYWORD_MENU_OPTION", 
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(50);
				match(NEWLINE);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				tag();
				}
				}
				setState(59); 
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
			setState(61);
			match(TAG_START);
			setState(62);
			match(TEXT);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(63);
				match(NEWLINE);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(71);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(72);
						pickBlock();
						}
						break;
					case 3:
						{
						setState(73);
						menuBlock();
						}
						break;
					case 4:
						{
						setState(74);
						line();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
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
			setState(79);
			pickCommand();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(80);
				match(NEWLINE);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(86);
					pickThisBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(91);
			endCommand();
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					match(NEWLINE);
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(97);
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
			setState(100);
			menuCommand();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(101);
				match(NEWLINE);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(107);
					menuSubBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(112);
			endCommand();
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					match(NEWLINE);
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(118);
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
			setState(121);
			ifCommand();
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				match(NEWLINE);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(127);
			block();
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(128);
				elseCommand();
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					match(NEWLINE);
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(134);
				block();
				}
				break;
			}
			setState(138);
			endCommand();
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
					match(NEWLINE);
					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(144);
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
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				lineFragment();
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMAND_START) | (1L << FAST_PICK_START) | (1L << TEXT))) != 0) );
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(152);
					match(NEWLINE);
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(157);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				inlineIfBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
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
			setState(166);
			ifCommand();
			setState(167);
			inlineIfTrueFragment();
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(168);
				elseCommand();
				setState(169);
				inlineIfFalseFragment();
				}
				break;
			}
			setState(173);
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
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					lineFragment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
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
			setState(181); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(180);
					lineFragment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183); 
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
			setState(185);
			menuOptionCommand();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(186);
				match(NEWLINE);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(192);
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
			setState(195);
			match(FAST_PICK_START);
			setState(196);
			match(FAST_PICK_TEXT);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB_TEXT_SEPARATOR) {
				{
				{
				setState(197);
				match(SUB_TEXT_SEPARATOR);
				setState(198);
				match(FAST_PICK_TEXT);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
			setState(206);
			pickThisCommand();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(207);
				match(NEWLINE);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					block();
					}
					} 
				}
				setState(218);
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
			setState(219);
			match(COMMAND_START);
			setState(220);
			expression(0);
			setState(221);
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
		enterRule(_localctx, 30, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(COMMAND_STRING_START);
			setState(224);
			match(STRING);
			setState(225);
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
	public static class AdditionExpressionNNContext extends ExpressionContext {
		public List<TerminalNode> NUMBER() { return getTokens(MurMurParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MurMurParser.NUMBER, i);
		}
		public TerminalNode ADD_SUB_SIGNAL() { return getToken(MurMurParser.ADD_SUB_SIGNAL, 0); }
		public AdditionExpressionNNContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterAdditionExpressionNN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitAdditionExpressionNN(this);
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
	public static class AdditionExpressionBaseContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD_SUB_SIGNAL() { return getToken(MurMurParser.ADD_SUB_SIGNAL, 0); }
		public AdditionExpressionBaseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).enterAdditionExpressionBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MurMurParserListener ) ((MurMurParserListener)listener).exitAdditionExpressionBase(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(228);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
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
			case 3:
				{
				_localctx = new MethodOrVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(WORD);
				}
				break;
			case 4:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(WORD);
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(232);
					match(COMMAND_PARAMS_START);
					setState(233);
					params();
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				string();
				}
				break;
			case 6:
				{
				_localctx = new AdditionExpressionNNContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(NUMBER);
				setState(238);
				match(ADD_SUB_SIGNAL);
				setState(239);
				match(NUMBER);
				}
				break;
			case 7:
				{
				_localctx = new AssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(WORD);
				setState(241);
				match(ASSIGN_SIGNAL);
				setState(242);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(246);
						match(MUL_DIV_SIGNAL);
						setState(247);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AdditionExpressionBaseContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(249);
						match(ADD_SUB_SIGNAL);
						setState(250);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ComparissonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(252);
						match(COMPARISSON_SIGNAL);
						setState(253);
						expression(3);
						}
						break;
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
		enterRule(_localctx, 34, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			expression(0);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					match(COMMAND_PARAMS_SEPARATOR);
					setState(261);
					expression(0);
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 36, RULE_pickCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(COMMAND_START);
			setState(268);
			match(KEYWORD_PICK);
			setState(269);
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
		enterRule(_localctx, 38, RULE_pickThisCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(COMMAND_START);
			setState(272);
			match(KEYWORD_PICK_THIS);
			setState(273);
			match(COMMAND_PARAMS_START);
			setState(274);
			match(NUMBER);
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
		enterRule(_localctx, 40, RULE_menuCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(COMMAND_START);
			setState(278);
			match(KEYWORD_MENU);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND_PARAMS_START) {
				{
				setState(279);
				match(COMMAND_PARAMS_START);
				setState(280);
				expression(0);
				}
			}

			setState(283);
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
		enterRule(_localctx, 42, RULE_menuOptionCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(COMMAND_START);
			setState(286);
			match(KEYWORD_MENU_OPTION);
			setState(287);
			match(COMMAND_PARAMS_START);
			setState(288);
			expression(0);
			{
			setState(289);
			match(COMMAND_PARAMS_SEPARATOR);
			setState(290);
			expression(0);
			}
			setState(292);
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
		enterRule(_localctx, 44, RULE_ifCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(COMMAND_START);
			setState(295);
			match(KEYWORD_IF);
			setState(296);
			match(COMMAND_PARAMS_START);
			setState(297);
			expression(0);
			setState(298);
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
		enterRule(_localctx, 46, RULE_elseCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(COMMAND_START);
			setState(301);
			match(KEYWORD_ELSE);
			setState(302);
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
		enterRule(_localctx, 48, RULE_endCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(COMMAND_START);
			setState(305);
			match(KEYWORD_END);
			setState(306);
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
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0137\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\6\2<\n\2\r\2\16\2=\3\3\3"+
		"\3\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4N\n\4\r\4\16"+
		"\4O\3\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\6\5Z\n\5\r\5\16\5[\3\5\3\5\6\5"+
		"`\n\5\r\5\16\5a\3\5\5\5e\n\5\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\6\6o"+
		"\n\6\r\6\16\6p\3\6\3\6\6\6u\n\6\r\6\16\6v\3\6\5\6z\n\6\3\7\3\7\6\7~\n"+
		"\7\r\7\16\7\177\3\7\3\7\3\7\6\7\u0085\n\7\r\7\16\7\u0086\3\7\3\7\5\7\u008b"+
		"\n\7\3\7\3\7\6\7\u008f\n\7\r\7\16\7\u0090\3\7\5\7\u0094\n\7\3\b\6\b\u0097"+
		"\n\b\r\b\16\b\u0098\3\b\6\b\u009c\n\b\r\b\16\b\u009d\3\b\5\b\u00a1\n\b"+
		"\3\t\3\t\3\t\3\t\5\t\u00a7\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ae\n\n\3\n\3"+
		"\n\3\13\6\13\u00b3\n\13\r\13\16\13\u00b4\3\f\6\f\u00b8\n\f\r\f\16\f\u00b9"+
		"\3\r\3\r\7\r\u00be\n\r\f\r\16\r\u00c1\13\r\3\r\5\r\u00c4\n\r\3\16\3\16"+
		"\3\16\3\16\7\16\u00ca\n\16\f\16\16\16\u00cd\13\16\3\16\3\16\3\17\3\17"+
		"\7\17\u00d3\n\17\f\17\16\17\u00d6\13\17\3\17\7\17\u00d9\n\17\f\17\16\17"+
		"\u00dc\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00ed\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00f6\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0101"+
		"\n\22\f\22\16\22\u0104\13\22\3\23\3\23\3\23\7\23\u0109\n\23\f\23\16\23"+
		"\u010c\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\5\26\u011c\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\2\3\"\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\2\3\3\2\27\30\2\u014b\2\67\3\2\2\2\4?\3\2\2\2\6M\3\2\2"+
		"\2\bQ\3\2\2\2\nf\3\2\2\2\f{\3\2\2\2\16\u0096\3\2\2\2\20\u00a6\3\2\2\2"+
		"\22\u00a8\3\2\2\2\24\u00b2\3\2\2\2\26\u00b7\3\2\2\2\30\u00bb\3\2\2\2\32"+
		"\u00c5\3\2\2\2\34\u00d0\3\2\2\2\36\u00dd\3\2\2\2 \u00e1\3\2\2\2\"\u00f5"+
		"\3\2\2\2$\u0105\3\2\2\2&\u010d\3\2\2\2(\u0111\3\2\2\2*\u0117\3\2\2\2,"+
		"\u011f\3\2\2\2.\u0128\3\2\2\2\60\u012e\3\2\2\2\62\u0132\3\2\2\2\64\66"+
		"\7\4\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\2:<\5\4\3\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2"+
		"\2\2?@\7\6\2\2@D\7\t\2\2AC\7\4\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2"+
		"\2\2EG\3\2\2\2FD\3\2\2\2GH\5\6\4\2H\5\3\2\2\2IN\5\f\7\2JN\5\b\5\2KN\5"+
		"\n\6\2LN\5\16\b\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OM"+
		"\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QU\5&\24\2RT\7\4\2\2SR\3\2\2\2TW\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2XZ\5\34\17\2YX\3\2\2\2Z[\3\2\2"+
		"\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]d\5\62\32\2^`\7\4\2\2_^\3\2\2\2`a\3"+
		"\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ce\7\2\2\3d_\3\2\2\2dc\3\2\2\2e\t"+
		"\3\2\2\2fj\5*\26\2gi\7\4\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k"+
		"n\3\2\2\2lj\3\2\2\2mo\5\30\r\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2"+
		"qr\3\2\2\2ry\5\62\32\2su\7\4\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2wz\3\2\2\2xz\7\2\2\3yt\3\2\2\2yx\3\2\2\2z\13\3\2\2\2{}\5.\30\2|~\7\4"+
		"\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u008a\5\6\4\2\u0082\u0084\5\60\31\2\u0083\u0085\7\4\2\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5\6\4\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0082\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0093\5\62"+
		"\32\2\u008d\u008f\7\4\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0094\7\2"+
		"\2\3\u0093\u008e\3\2\2\2\u0093\u0092\3\2\2\2\u0094\r\3\2\2\2\u0095\u0097"+
		"\5\20\t\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u00a0\3\2\2\2\u009a\u009c\7\4\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u00a1\7\2\2\3\u00a0\u009b\3\2\2\2\u00a0\u009f\3\2"+
		"\2\2\u00a1\17\3\2\2\2\u00a2\u00a7\7\t\2\2\u00a3\u00a7\5\22\n\2\u00a4\u00a7"+
		"\5\36\20\2\u00a5\u00a7\5\32\16\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\21\3\2\2\2\u00a8\u00a9"+
		"\5.\30\2\u00a9\u00ad\5\24\13\2\u00aa\u00ab\5\60\31\2\u00ab\u00ac\5\26"+
		"\f\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\5\62\32\2\u00b0\23\3\2\2\2\u00b1\u00b3\5\20"+
		"\t\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\25\3\2\2\2\u00b6\u00b8\5\20\t\2\u00b7\u00b6\3\2\2"+
		"\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\27"+
		"\3\2\2\2\u00bb\u00bf\5,\27\2\u00bc\u00be\7\4\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\5\6\4\2\u00c3\u00c2\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\31\3\2\2\2\u00c5\u00c6\7\b\2\2\u00c6\u00cb\7 \2\2"+
		"\u00c7\u00c8\7\37\2\2\u00c8\u00ca\7 \2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7!\2\2\u00cf\33\3\2\2\2\u00d0\u00d4\5(\25\2"+
		"\u00d1\u00d3\7\4\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d9\5\6\4\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\35\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de"+
		"\7\7\2\2\u00de\u00df\5\"\22\2\u00df\u00e0\7\16\2\2\u00e0\37\3\2\2\2\u00e1"+
		"\u00e2\7\f\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\7#\2\2\u00e4!\3\2\2\2\u00e5"+
		"\u00e6\b\22\1\2\u00e6\u00f6\7\31\2\2\u00e7\u00f6\t\2\2\2\u00e8\u00f6\7"+
		"\32\2\2\u00e9\u00ec\7\32\2\2\u00ea\u00eb\7\13\2\2\u00eb\u00ed\5$\23\2"+
		"\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f6\3\2\2\2\u00ee\u00f6"+
		"\5 \21\2\u00ef\u00f0\7\31\2\2\u00f0\u00f1\7\36\2\2\u00f1\u00f6\7\31\2"+
		"\2\u00f2\u00f3\7\32\2\2\u00f3\u00f4\7\33\2\2\u00f4\u00f6\5\"\22\3\u00f5"+
		"\u00e5\3\2\2\2\u00f5\u00e7\3\2\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00e9\3\2"+
		"\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6"+
		"\u0102\3\2\2\2\u00f7\u00f8\f\7\2\2\u00f8\u00f9\7\35\2\2\u00f9\u0101\5"+
		"\"\22\b\u00fa\u00fb\f\6\2\2\u00fb\u00fc\7\36\2\2\u00fc\u0101\5\"\22\7"+
		"\u00fd\u00fe\f\4\2\2\u00fe\u00ff\7\34\2\2\u00ff\u0101\5\"\22\5\u0100\u00f7"+
		"\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103#\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u010a\5\"\22\2\u0106\u0107\7\r\2\2\u0107\u0109\5\"\22\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"%\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\7\2\2\u010e\u010f\7\25\2\2"+
		"\u010f\u0110\7\16\2\2\u0110\'\3\2\2\2\u0111\u0112\7\7\2\2\u0112\u0113"+
		"\7\26\2\2\u0113\u0114\7\13\2\2\u0114\u0115\7\31\2\2\u0115\u0116\7\16\2"+
		"\2\u0116)\3\2\2\2\u0117\u0118\7\7\2\2\u0118\u011b\7\23\2\2\u0119\u011a"+
		"\7\13\2\2\u011a\u011c\5\"\22\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\7\16\2\2\u011e+\3\2\2\2\u011f\u0120\7"+
		"\7\2\2\u0120\u0121\7\24\2\2\u0121\u0122\7\13\2\2\u0122\u0123\5\"\22\2"+
		"\u0123\u0124\7\r\2\2\u0124\u0125\5\"\22\2\u0125\u0126\3\2\2\2\u0126\u0127"+
		"\7\16\2\2\u0127-\3\2\2\2\u0128\u0129\7\7\2\2\u0129\u012a\7\17\2\2\u012a"+
		"\u012b\7\13\2\2\u012b\u012c\5\"\22\2\u012c\u012d\7\16\2\2\u012d/\3\2\2"+
		"\2\u012e\u012f\7\7\2\2\u012f\u0130\7\20\2\2\u0130\u0131\7\16\2\2\u0131"+
		"\61\3\2\2\2\u0132\u0133\7\7\2\2\u0133\u0134\7\21\2\2\u0134\u0135\7\16"+
		"\2\2\u0135\63\3\2\2\2&\67=DMOU[adjpvy\177\u0086\u008a\u0090\u0093\u0098"+
		"\u009d\u00a0\u00a6\u00ad\u00b4\u00b9\u00bf\u00c3\u00cb\u00d4\u00da\u00ec"+
		"\u00f5\u0100\u0102\u010a\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}