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
		INCLUDE_KEYWORD=7, TEXT=8, NEW_TAG=9, COMMAND_NEWLINE=10, COMMAND_IGNORE=11, 
		COMMAND_LINE_COMMENT=12, COMMAND_COMMENT=13, COMMAND_PARAMS_START=14, 
		COMMAND_STRING_START=15, OPEN_PAREN=16, CLOSE_PAREN=17, COMMAND_PARAMS_SEPARATOR=18, 
		COMMAND_END=19, KEYWORD_IF=20, KEYWORD_ELSE=21, KEYWORD_END=22, KEYWORD_GOTO=23, 
		KEYWORD_MENU=24, KEYWORD_MENU_OPTION=25, KEYWORD_PICK=26, KEYWORD_PICK_THIS=27, 
		TRUE=28, FALSE=29, NUMBER=30, WORD=31, ASSIGN_SIGNAL=32, COMPARISSON_SIGNAL=33, 
		MUL_DIV_SIGNAL=34, ADD_SUB_SIGNAL=35, STRING=36, COMMAND_STRING_END=37;
	public static final int
		RULE_murmur = 0, RULE_tag = 1, RULE_block = 2, RULE_pickBlock = 3, RULE_menuBlock = 4, 
		RULE_ifBlock = 5, RULE_line = 6, RULE_lineFragment = 7, RULE_inlineIfBlock = 8, 
		RULE_inlineIfTrueFragment = 9, RULE_inlineIfFalseFragment = 10, RULE_menuSubBlock = 11, 
		RULE_pickThisBlock = 12, RULE_simpleCommand = 13, RULE_multiLineCommand = 14, 
		RULE_string = 15, RULE_expression = 16, RULE_params = 17, RULE_pickCommand = 18, 
		RULE_pickThisCommand = 19, RULE_menuCommand = 20, RULE_menuOptionCommand = 21, 
		RULE_ifCommand = 22, RULE_elseCommand = 23, RULE_endCommand = 24, RULE_declaration = 25;
	public static final String[] ruleNames = {
		"murmur", "tag", "block", "pickBlock", "menuBlock", "ifBlock", "line", 
		"lineFragment", "inlineIfBlock", "inlineIfTrueFragment", "inlineIfFalseFragment", 
		"menuSubBlock", "pickThisBlock", "simpleCommand", "multiLineCommand", 
		"string", "expression", "params", "pickCommand", "pickThisCommand", "menuCommand", 
		"menuOptionCommand", "ifCommand", "elseCommand", "endCommand", "declaration"
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_START:
					{
					setState(58);
					tag();
					}
					break;
				case INCLUDE_KEYWORD:
					{
					setState(59);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAG_START || _la==INCLUDE_KEYWORD );
			setState(64);
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
			setState(66);
			match(TAG_START);
			setState(67);
			match(TEXT);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(68);
				match(NEWLINE);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
			setState(80); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(76);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(77);
						pickBlock();
						}
						break;
					case 3:
						{
						setState(78);
						menuBlock();
						}
						break;
					case 4:
						{
						setState(79);
						line();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(84);
			pickCommand();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(85);
				match(NEWLINE);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(91);
					pickThisBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(94); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(96);
			endCommand();
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					match(NEWLINE);
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(102);
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
			setState(105);
			menuCommand();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(106);
				match(NEWLINE);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(112);
					menuSubBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(117);
			endCommand();
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					match(NEWLINE);
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(123);
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
			setState(126);
			ifCommand();
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(133);
				elseCommand();
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					match(NEWLINE);
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(139);
				block();
				}
				break;
			}
			setState(143);
			endCommand();
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144);
					match(NEWLINE);
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(149);
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
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				lineFragment();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMAND_START || _la==TEXT );
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					match(NEWLINE);
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
				{
				setState(162);
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
		enterRule(_localctx, 14, RULE_lineFragment);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				inlineIfBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				simpleCommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
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
		enterRule(_localctx, 16, RULE_inlineIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			ifCommand();
			setState(172);
			inlineIfTrueFragment();
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(173);
				elseCommand();
				setState(174);
				inlineIfFalseFragment();
				}
				break;
			}
			setState(178);
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
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185);
					lineFragment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
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
			setState(190);
			menuOptionCommand();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(191);
				match(NEWLINE);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(197);
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
		enterRule(_localctx, 24, RULE_pickThisBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			pickThisCommand();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(201);
				match(NEWLINE);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					block();
					}
					} 
				}
				setState(212);
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
		enterRule(_localctx, 26, RULE_simpleCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(COMMAND_START);
			setState(214);
			expression(0);
			setState(215);
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
		enterRule(_localctx, 28, RULE_multiLineCommand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(COMMAND_START);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND_NEWLINE) {
				{
				{
				setState(218);
				match(COMMAND_NEWLINE);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(224);
				expression(0);
				setState(226); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(225);
						match(COMMAND_NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(228); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMAND_STRING_START) | (1L << OPEN_PAREN) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << WORD))) != 0) );
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND_NEWLINE) {
				{
				{
				setState(234);
				match(COMMAND_NEWLINE);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
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
			setState(242);
			match(COMMAND_STRING_START);
			setState(243);
			match(STRING);
			setState(244);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(247);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new MethodOrVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(WORD);
				}
				break;
			case 3:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(WORD);
				setState(252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(250);
					match(COMMAND_PARAMS_START);
					setState(251);
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
				setState(254);
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
				setState(255);
				string();
				}
				break;
			case 6:
				{
				_localctx = new PriorityExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(OPEN_PAREN);
				setState(257);
				expression(0);
				setState(258);
				match(CLOSE_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new AssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(WORD);
				setState(261);
				match(ASSIGN_SIGNAL);
				setState(262);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(266);
						match(MUL_DIV_SIGNAL);
						setState(267);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(269);
						match(MUL_DIV_SIGNAL);
						setState(270);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(272);
						match(ADD_SUB_SIGNAL);
						setState(273);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ComparissonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(275);
						match(COMPARISSON_SIGNAL);
						setState(276);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(281);
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
		enterRule(_localctx, 34, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expression(0);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					match(COMMAND_PARAMS_SEPARATOR);
					setState(284);
					expression(0);
					}
					} 
				}
				setState(289);
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
		enterRule(_localctx, 36, RULE_pickCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(COMMAND_START);
			setState(291);
			match(KEYWORD_PICK);
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
			setState(294);
			match(COMMAND_START);
			setState(295);
			match(KEYWORD_PICK_THIS);
			setState(296);
			match(COMMAND_PARAMS_START);
			setState(297);
			match(NUMBER);
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
			setState(300);
			match(COMMAND_START);
			setState(301);
			match(KEYWORD_MENU);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND_PARAMS_START) {
				{
				setState(302);
				match(COMMAND_PARAMS_START);
				setState(303);
				expression(0);
				}
			}

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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(COMMAND_START);
			setState(309);
			match(KEYWORD_MENU_OPTION);
			setState(310);
			match(COMMAND_PARAMS_START);
			setState(311);
			expression(0);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND_PARAMS_SEPARATOR) {
				{
				setState(312);
				match(COMMAND_PARAMS_SEPARATOR);
				setState(313);
				expression(0);
				}
			}

			setState(316);
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
			setState(318);
			match(COMMAND_START);
			setState(319);
			match(KEYWORD_IF);
			setState(320);
			match(COMMAND_PARAMS_START);
			setState(321);
			expression(0);
			setState(322);
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
			setState(324);
			match(COMMAND_START);
			setState(325);
			match(KEYWORD_ELSE);
			setState(326);
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
			setState(328);
			match(COMMAND_START);
			setState(329);
			match(KEYWORD_END);
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
		enterRule(_localctx, 50, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(INCLUDE_KEYWORD);
			setState(333);
			match(COMMAND_PARAMS_START);
			setState(334);
			string();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND_NEWLINE) {
				{
				{
				setState(335);
				match(COMMAND_NEWLINE);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_TAG) {
				{
				setState(341);
				match(NEW_TAG);
				}
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u015b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\6\2?\n\2\r\2"+
		"\16\2@\3\2\3\2\3\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\6\4S\n\4\r\4\16\4T\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\6\5_\n\5"+
		"\r\5\16\5`\3\5\3\5\6\5e\n\5\r\5\16\5f\3\5\5\5j\n\5\3\6\3\6\7\6n\n\6\f"+
		"\6\16\6q\13\6\3\6\6\6t\n\6\r\6\16\6u\3\6\3\6\6\6z\n\6\r\6\16\6{\3\6\5"+
		"\6\177\n\6\3\7\3\7\6\7\u0083\n\7\r\7\16\7\u0084\3\7\3\7\3\7\6\7\u008a"+
		"\n\7\r\7\16\7\u008b\3\7\3\7\5\7\u0090\n\7\3\7\3\7\6\7\u0094\n\7\r\7\16"+
		"\7\u0095\3\7\5\7\u0099\n\7\3\b\6\b\u009c\n\b\r\b\16\b\u009d\3\b\6\b\u00a1"+
		"\n\b\r\b\16\b\u00a2\3\b\5\b\u00a6\n\b\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00b3\n\n\3\n\3\n\3\13\6\13\u00b8\n\13\r\13\16"+
		"\13\u00b9\3\f\6\f\u00bd\n\f\r\f\16\f\u00be\3\r\3\r\7\r\u00c3\n\r\f\r\16"+
		"\r\u00c6\13\r\3\r\5\r\u00c9\n\r\3\16\3\16\7\16\u00cd\n\16\f\16\16\16\u00d0"+
		"\13\16\3\16\7\16\u00d3\n\16\f\16\16\16\u00d6\13\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\7\20\u00de\n\20\f\20\16\20\u00e1\13\20\3\20\3\20\6\20\u00e5"+
		"\n\20\r\20\16\20\u00e6\6\20\u00e9\n\20\r\20\16\20\u00ea\3\20\7\20\u00ee"+
		"\n\20\f\20\16\20\u00f1\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00ff\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u010a\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u0118\n\22\f\22\16\22\u011b\13\22\3\23\3\23\3\23"+
		"\7\23\u0120\n\23\f\23\16\23\u0123\13\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0133\n\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u013d\n\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\7\33\u0153\n\33\f\33\16\33\u0156\13\33\3\33\5\33\u0159\n\33\3\33\2\3"+
		"\"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\3\3\2"+
		"\36\37\2\u0176\29\3\2\2\2\4D\3\2\2\2\6R\3\2\2\2\bV\3\2\2\2\nk\3\2\2\2"+
		"\f\u0080\3\2\2\2\16\u009b\3\2\2\2\20\u00ab\3\2\2\2\22\u00ad\3\2\2\2\24"+
		"\u00b7\3\2\2\2\26\u00bc\3\2\2\2\30\u00c0\3\2\2\2\32\u00ca\3\2\2\2\34\u00d7"+
		"\3\2\2\2\36\u00db\3\2\2\2 \u00f4\3\2\2\2\"\u0109\3\2\2\2$\u011c\3\2\2"+
		"\2&\u0124\3\2\2\2(\u0128\3\2\2\2*\u012e\3\2\2\2,\u0136\3\2\2\2.\u0140"+
		"\3\2\2\2\60\u0146\3\2\2\2\62\u014a\3\2\2\2\64\u014e\3\2\2\2\668\7\4\2"+
		"\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:>\3\2\2\2;9\3\2\2\2<"+
		"?\5\4\3\2=?\5\64\33\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2"+
		"\2AB\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DE\7\7\2\2EI\7\n\2\2FH\7\4\2\2GF\3\2"+
		"\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\5\6\4\2M\5\3"+
		"\2\2\2NS\5\f\7\2OS\5\b\5\2PS\5\n\6\2QS\5\16\b\2RN\3\2\2\2RO\3\2\2\2RP"+
		"\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2\2\2VZ\5&\24\2"+
		"WY\7\4\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2]_\5\32\16\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bi\5\62"+
		"\32\2ce\7\4\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hj\7"+
		"\2\2\3id\3\2\2\2ih\3\2\2\2j\t\3\2\2\2ko\5*\26\2ln\7\4\2\2ml\3\2\2\2nq"+
		"\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rt\5\30\r\2sr\3\2\2\2"+
		"tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2w~\5\62\32\2xz\7\4\2\2yx\3\2\2"+
		"\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}\177\7\2\2\3~y\3\2\2\2~"+
		"}\3\2\2\2\177\13\3\2\2\2\u0080\u0082\5.\30\2\u0081\u0083\7\4\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u008f\5\6\4\2\u0087\u0089\5\60\31\2\u0088"+
		"\u008a\7\4\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\6\4\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0098\5\62\32\2\u0092\u0094\7\4\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0099\7\2\2\3\u0098\u0093\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\r\3\2\2\2\u009a\u009c\5\20\t\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2"+
		"\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a5\3\2\2\2\u009f\u00a1"+
		"\7\4\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6\7\2\2\3\u00a5\u00a0\3\2"+
		"\2\2\u00a5\u00a4\3\2\2\2\u00a6\17\3\2\2\2\u00a7\u00ac\7\n\2\2\u00a8\u00ac"+
		"\5\22\n\2\u00a9\u00ac\5\34\17\2\u00aa\u00ac\5\36\20\2\u00ab\u00a7\3\2"+
		"\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\21\3\2\2\2\u00ad\u00ae\5.\30\2\u00ae\u00b2\5\24\13\2\u00af\u00b0\5\60"+
		"\31\2\u00b0\u00b1\5\26\f\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5\62\32\2\u00b5\23\3\2"+
		"\2\2\u00b6\u00b8\5\20\t\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00bd\5\20\t"+
		"\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u00c4\5,\27\2\u00c1\u00c3\7\4\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\5\6\4\2\u00c8"+
		"\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\31\3\2\2\2\u00ca\u00ce\5(\25"+
		"\2\u00cb\u00cd\7\4\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d3\5\6\4\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8"+
		"\7\b\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\7\25\2\2\u00da\35\3\2\2\2\u00db"+
		"\u00df\7\b\2\2\u00dc\u00de\7\f\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e8\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e4\5\"\22\2\u00e3\u00e5\7\f\2\2\u00e4\u00e3\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\7\f\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\25\2\2\u00f3"+
		"\37\3\2\2\2\u00f4\u00f5\7\21\2\2\u00f5\u00f6\7&\2\2\u00f6\u00f7\7\'\2"+
		"\2\u00f7!\3\2\2\2\u00f8\u00f9\b\22\1\2\u00f9\u010a\7 \2\2\u00fa\u010a"+
		"\7!\2\2\u00fb\u00fe\7!\2\2\u00fc\u00fd\7\20\2\2\u00fd\u00ff\5$\23\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u010a\3\2\2\2\u0100\u010a\t\2"+
		"\2\2\u0101\u010a\5 \21\2\u0102\u0103\7\22\2\2\u0103\u0104\5\"\22\2\u0104"+
		"\u0105\7\23\2\2\u0105\u010a\3\2\2\2\u0106\u0107\7!\2\2\u0107\u0108\7\""+
		"\2\2\u0108\u010a\5\"\22\3\u0109\u00f8\3\2\2\2\u0109\u00fa\3\2\2\2\u0109"+
		"\u00fb\3\2\2\2\u0109\u0100\3\2\2\2\u0109\u0101\3\2\2\2\u0109\u0102\3\2"+
		"\2\2\u0109\u0106\3\2\2\2\u010a\u0119\3\2\2\2\u010b\u010c\f\b\2\2\u010c"+
		"\u010d\7$\2\2\u010d\u0118\5\"\22\t\u010e\u010f\f\6\2\2\u010f\u0110\7$"+
		"\2\2\u0110\u0118\5\"\22\7\u0111\u0112\f\5\2\2\u0112\u0113\7%\2\2\u0113"+
		"\u0118\5\"\22\6\u0114\u0115\f\4\2\2\u0115\u0116\7#\2\2\u0116\u0118\5\""+
		"\22\5\u0117\u010b\3\2\2\2\u0117\u010e\3\2\2\2\u0117\u0111\3\2\2\2\u0117"+
		"\u0114\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a#\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0121\5\"\22\2\u011d\u011e"+
		"\7\24\2\2\u011e\u0120\5\"\22\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122%\3\2\2\2\u0123\u0121\3"+
		"\2\2\2\u0124\u0125\7\b\2\2\u0125\u0126\7\34\2\2\u0126\u0127\7\25\2\2\u0127"+
		"\'\3\2\2\2\u0128\u0129\7\b\2\2\u0129\u012a\7\35\2\2\u012a\u012b\7\20\2"+
		"\2\u012b\u012c\7 \2\2\u012c\u012d\7\25\2\2\u012d)\3\2\2\2\u012e\u012f"+
		"\7\b\2\2\u012f\u0132\7\32\2\2\u0130\u0131\7\20\2\2\u0131\u0133\5\"\22"+
		"\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"+
		"\7\25\2\2\u0135+\3\2\2\2\u0136\u0137\7\b\2\2\u0137\u0138\7\33\2\2\u0138"+
		"\u0139\7\20\2\2\u0139\u013c\5\"\22\2\u013a\u013b\7\24\2\2\u013b\u013d"+
		"\5\"\22\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2"+
		"\u013e\u013f\7\25\2\2\u013f-\3\2\2\2\u0140\u0141\7\b\2\2\u0141\u0142\7"+
		"\26\2\2\u0142\u0143\7\20\2\2\u0143\u0144\5\"\22\2\u0144\u0145\7\25\2\2"+
		"\u0145/\3\2\2\2\u0146\u0147\7\b\2\2\u0147\u0148\7\27\2\2\u0148\u0149\7"+
		"\25\2\2\u0149\61\3\2\2\2\u014a\u014b\7\b\2\2\u014b\u014c\7\30\2\2\u014c"+
		"\u014d\7\25\2\2\u014d\63\3\2\2\2\u014e\u014f\7\t\2\2\u014f\u0150\7\20"+
		"\2\2\u0150\u0154\5 \21\2\u0151\u0153\7\f\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2"+
		"\2\2\u0156\u0154\3\2\2\2\u0157\u0159\7\13\2\2\u0158\u0157\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\65\3\2\2\2-9>@IRTZ`fiou{~\u0084\u008b\u008f\u0095"+
		"\u0098\u009d\u00a2\u00a5\u00ab\u00b2\u00b9\u00be\u00c4\u00c8\u00ce\u00d4"+
		"\u00df\u00e6\u00ea\u00ef\u00fe\u0109\u0117\u0119\u0121\u0132\u013c\u0154"+
		"\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}