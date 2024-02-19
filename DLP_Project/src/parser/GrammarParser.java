// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		INT_LITERAL=25, REAL_LITERAL=26, CHAR_LITERAL=27, IDENT=28, IDENT_STRUCT=29, 
		LINE_COMMENT=30, MULTILINE_COMMENT=31, WHITESPACE=32;
	public static final int
		RULE_program = 0, RULE_sentencias = 1, RULE_sentencia = 2, RULE_defVar = 3, 
		RULE_defStruct = 4, RULE_campoStruct = 5, RULE_defFunc = 6, RULE_defArgsOpt = 7, 
		RULE_defArgs = 8, RULE_retorno = 9, RULE_callFunc = 10, RULE_callArgsOpt = 11, 
		RULE_callArgs = 12, RULE_tipo = 13, RULE_array = 14, RULE_expr = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencias", "sentencia", "defVar", "defStruct", "campoStruct", 
			"defFunc", "defArgsOpt", "defArgs", "retorno", "callFunc", "callArgsOpt", 
			"callArgs", "tipo", "array", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'print'", "'='", "'var'", "':'", "'struct'", "'{'", "'}'", 
			"'('", "')'", "','", "');'", "'int'", "'float'", "'char'", "'['", "']'", 
			"'.'", "'<'", "'>'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT_LITERAL", "REAL_LITERAL", "CHAR_LITERAL", "IDENT", "IDENT_STRUCT", 
			"LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			sentencias();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciasContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 503840852L) != 0) {
				{
				{
				setState(34);
				sentencia();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public DefVarContext defVar() {
			return getRuleContext(DefVarContext.class,0);
		}
		public DefStructContext defStruct() {
			return getRuleContext(DefStructContext.class,0);
		}
		public DefFuncContext defFunc() {
			return getRuleContext(DefFuncContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				defVar();
				setState(41);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				defStruct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				defFunc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(T__1);
				setState(46);
				expr(0);
				setState(47);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				expr(0);
				setState(50);
				match(T__2);
				setState(51);
				expr(0);
				setState(52);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefVarContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVar; }
	}

	public final DefVarContext defVar() throws RecognitionException {
		DefVarContext _localctx = new DefVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__3);
			setState(57);
			match(IDENT);
			setState(58);
			match(T__4);
			setState(59);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefStructContext extends ParserRuleContext {
		public TerminalNode IDENT_STRUCT() { return getToken(GrammarParser.IDENT_STRUCT, 0); }
		public List<CampoStructContext> campoStruct() {
			return getRuleContexts(CampoStructContext.class);
		}
		public CampoStructContext campoStruct(int i) {
			return getRuleContext(CampoStructContext.class,i);
		}
		public DefStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStruct; }
	}

	public final DefStructContext defStruct() throws RecognitionException {
		DefStructContext _localctx = new DefStructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__5);
			setState(62);
			match(IDENT_STRUCT);
			setState(63);
			match(T__6);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(64);
				campoStruct();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CampoStructContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CampoStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campoStruct; }
	}

	public final CampoStructContext campoStruct() throws RecognitionException {
		CampoStructContext _localctx = new CampoStructContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_campoStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(IDENT);
			setState(73);
			match(T__4);
			setState(74);
			tipo();
			setState(75);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefFuncContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public DefArgsOptContext defArgsOpt() {
			return getRuleContext(DefArgsOptContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public DefFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunc; }
	}

	public final DefFuncContext defFunc() throws RecognitionException {
		DefFuncContext _localctx = new DefFuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IDENT);
			setState(78);
			match(T__8);
			setState(79);
			defArgsOpt();
			setState(80);
			match(T__9);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(81);
				retorno();
				}
			}

			setState(84);
			match(T__6);
			setState(85);
			sentencias();
			setState(86);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefArgsOptContext extends ParserRuleContext {
		public DefArgsContext defArgs() {
			return getRuleContext(DefArgsContext.class,0);
		}
		public DefArgsOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defArgsOpt; }
	}

	public final DefArgsOptContext defArgsOpt() throws RecognitionException {
		DefArgsOptContext _localctx = new DefArgsOptContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defArgsOpt);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				defArgs();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefArgsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefArgsContext defArgs() {
			return getRuleContext(DefArgsContext.class,0);
		}
		public DefArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defArgs; }
	}

	public final DefArgsContext defArgs() throws RecognitionException {
		DefArgsContext _localctx = new DefArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defArgs);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(IDENT);
				setState(93);
				match(T__4);
				setState(94);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(IDENT);
				setState(96);
				match(T__4);
				setState(97);
				tipo();
				setState(98);
				match(T__10);
				setState(99);
				defArgs();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__4);
			setState(104);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallFuncContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public CallArgsOptContext callArgsOpt() {
			return getRuleContext(CallArgsOptContext.class,0);
		}
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IDENT);
			setState(107);
			match(T__8);
			setState(108);
			callArgsOpt();
			setState(109);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallArgsOptContext extends ParserRuleContext {
		public CallArgsContext callArgs() {
			return getRuleContext(CallArgsContext.class,0);
		}
		public CallArgsOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgsOpt; }
	}

	public final CallArgsOptContext callArgsOpt() throws RecognitionException {
		CallArgsOptContext _localctx = new CallArgsOptContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callArgsOpt);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case INT_LITERAL:
			case REAL_LITERAL:
			case CHAR_LITERAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				callArgs();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallArgsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CallArgsContext callArgs() {
			return getRuleContext(CallArgsContext.class,0);
		}
		public CallArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgs; }
	}

	public final CallArgsContext callArgs() throws RecognitionException {
		CallArgsContext _localctx = new CallArgsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callArgs);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				expr(0);
				setState(117);
				match(T__10);
				setState(118);
				callArgs();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode IDENT_STRUCT() { return getToken(GrammarParser.IDENT_STRUCT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(T__14);
				}
				break;
			case IDENT_STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(IDENT_STRUCT);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				array();
				setState(127);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__15);
			setState(132);
			match(INT_LITERAL);
			setState(133);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(GrammarParser.REAL_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(GrammarParser.CHAR_LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(136);
				match(INT_LITERAL);
				}
				break;
			case 2:
				{
				setState(137);
				match(REAL_LITERAL);
				}
				break;
			case 3:
				{
				setState(138);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				{
				setState(139);
				match(IDENT);
				}
				break;
			case 5:
				{
				setState(140);
				callFunc();
				}
				break;
			case 6:
				{
				setState(141);
				match(T__18);
				setState(142);
				tipo();
				setState(143);
				match(T__19);
				setState(144);
				match(T__8);
				setState(145);
				expr(0);
				setState(146);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(151);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(154);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						expr(2);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
						match(T__15);
						setState(158);
						expr(0);
						setState(159);
						match(T__16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
						match(T__17);
						setState(163);
						match(IDENT);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00aa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001$\b\u0001\n\u0001\f\u0001"+
		"\'\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004B\b\u0004\n\u0004\f\u0004E\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006S\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007[\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bf\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000br\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\fy\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0082\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0095\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00a5\b\u000f"+
		"\n\u000f\f\u000f\u00a8\t\u000f\u0001\u000f\u0000\u0001\u001e\u0010\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e\u0000\u0002\u0001\u0000\u0015\u0016\u0001\u0000\u0017\u0018\u00b1"+
		"\u0000 \u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u00046"+
		"\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b=\u0001\u0000"+
		"\u0000\u0000\nH\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000e"+
		"Z\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000\u0012g\u0001"+
		"\u0000\u0000\u0000\u0014j\u0001\u0000\u0000\u0000\u0016q\u0001\u0000\u0000"+
		"\u0000\u0018x\u0001\u0000\u0000\u0000\u001a\u0081\u0001\u0000\u0000\u0000"+
		"\u001c\u0083\u0001\u0000\u0000\u0000\u001e\u0094\u0001\u0000\u0000\u0000"+
		" !\u0003\u0002\u0001\u0000!\u0001\u0001\u0000\u0000\u0000\"$\u0003\u0004"+
		"\u0002\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0003\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000()\u0003\u0006\u0003\u0000)*\u0005\u0001"+
		"\u0000\u0000*7\u0001\u0000\u0000\u0000+7\u0003\b\u0004\u0000,7\u0003\f"+
		"\u0006\u0000-.\u0005\u0002\u0000\u0000./\u0003\u001e\u000f\u0000/0\u0005"+
		"\u0001\u0000\u000007\u0001\u0000\u0000\u000012\u0003\u001e\u000f\u0000"+
		"23\u0005\u0003\u0000\u000034\u0003\u001e\u000f\u000045\u0005\u0001\u0000"+
		"\u000057\u0001\u0000\u0000\u00006(\u0001\u0000\u0000\u00006+\u0001\u0000"+
		"\u0000\u00006,\u0001\u0000\u0000\u00006-\u0001\u0000\u0000\u000061\u0001"+
		"\u0000\u0000\u00007\u0005\u0001\u0000\u0000\u000089\u0005\u0004\u0000"+
		"\u00009:\u0005\u001c\u0000\u0000:;\u0005\u0005\u0000\u0000;<\u0003\u001a"+
		"\r\u0000<\u0007\u0001\u0000\u0000\u0000=>\u0005\u0006\u0000\u0000>?\u0005"+
		"\u001d\u0000\u0000?C\u0005\u0007\u0000\u0000@B\u0003\n\u0005\u0000A@\u0001"+
		"\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000FG\u0005\b\u0000\u0000G\t\u0001\u0000\u0000\u0000HI\u0005\u001c"+
		"\u0000\u0000IJ\u0005\u0005\u0000\u0000JK\u0003\u001a\r\u0000KL\u0005\u0001"+
		"\u0000\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0005\u001c\u0000\u0000"+
		"NO\u0005\t\u0000\u0000OP\u0003\u000e\u0007\u0000PR\u0005\n\u0000\u0000"+
		"QS\u0003\u0012\t\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TU\u0005\u0007\u0000\u0000UV\u0003\u0002\u0001"+
		"\u0000VW\u0005\b\u0000\u0000W\r\u0001\u0000\u0000\u0000X[\u0003\u0010"+
		"\b\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000[\u000f\u0001\u0000\u0000\u0000\\]\u0005\u001c\u0000\u0000"+
		"]^\u0005\u0005\u0000\u0000^f\u0003\u001a\r\u0000_`\u0005\u001c\u0000\u0000"+
		"`a\u0005\u0005\u0000\u0000ab\u0003\u001a\r\u0000bc\u0005\u000b\u0000\u0000"+
		"cd\u0003\u0010\b\u0000df\u0001\u0000\u0000\u0000e\\\u0001\u0000\u0000"+
		"\u0000e_\u0001\u0000\u0000\u0000f\u0011\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0005\u0000\u0000hi\u0003\u001a\r\u0000i\u0013\u0001\u0000\u0000\u0000"+
		"jk\u0005\u001c\u0000\u0000kl\u0005\t\u0000\u0000lm\u0003\u0016\u000b\u0000"+
		"mn\u0005\f\u0000\u0000n\u0015\u0001\u0000\u0000\u0000or\u0003\u0018\f"+
		"\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000"+
		"\u0000\u0000r\u0017\u0001\u0000\u0000\u0000sy\u0003\u001e\u000f\u0000"+
		"tu\u0003\u001e\u000f\u0000uv\u0005\u000b\u0000\u0000vw\u0003\u0018\f\u0000"+
		"wy\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000"+
		"\u0000y\u0019\u0001\u0000\u0000\u0000z\u0082\u0005\r\u0000\u0000{\u0082"+
		"\u0005\u000e\u0000\u0000|\u0082\u0005\u000f\u0000\u0000}\u0082\u0005\u001d"+
		"\u0000\u0000~\u007f\u0003\u001c\u000e\u0000\u007f\u0080\u0003\u001a\r"+
		"\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081z\u0001\u0000\u0000\u0000"+
		"\u0081{\u0001\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}"+
		"\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0082\u001b\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0010\u0000\u0000\u0084\u0085\u0005"+
		"\u0019\u0000\u0000\u0085\u0086\u0005\u0011\u0000\u0000\u0086\u001d\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0006\u000f\uffff\uffff\u0000\u0088\u0095"+
		"\u0005\u0019\u0000\u0000\u0089\u0095\u0005\u001a\u0000\u0000\u008a\u0095"+
		"\u0005\u001b\u0000\u0000\u008b\u0095\u0005\u001c\u0000\u0000\u008c\u0095"+
		"\u0003\u0014\n\u0000\u008d\u008e\u0005\u0013\u0000\u0000\u008e\u008f\u0003"+
		"\u001a\r\u0000\u008f\u0090\u0005\u0014\u0000\u0000\u0090\u0091\u0005\t"+
		"\u0000\u0000\u0091\u0092\u0003\u001e\u000f\u0000\u0092\u0093\u0005\n\u0000"+
		"\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0087\u0001\u0000\u0000"+
		"\u0000\u0094\u0089\u0001\u0000\u0000\u0000\u0094\u008a\u0001\u0000\u0000"+
		"\u0000\u0094\u008b\u0001\u0000\u0000\u0000\u0094\u008c\u0001\u0000\u0000"+
		"\u0000\u0094\u008d\u0001\u0000\u0000\u0000\u0095\u00a6\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\n\u0002\u0000\u0000\u0097\u0098\u0007\u0000\u0000\u0000"+
		"\u0098\u00a5\u0003\u001e\u000f\u0003\u0099\u009a\n\u0001\u0000\u0000\u009a"+
		"\u009b\u0007\u0001\u0000\u0000\u009b\u00a5\u0003\u001e\u000f\u0002\u009c"+
		"\u009d\n\u0006\u0000\u0000\u009d\u009e\u0005\u0010\u0000\u0000\u009e\u009f"+
		"\u0003\u001e\u000f\u0000\u009f\u00a0\u0005\u0011\u0000\u0000\u00a0\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\n\u0005\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0012\u0000\u0000\u00a3\u00a5\u0005\u001c\u0000\u0000\u00a4\u0096\u0001"+
		"\u0000\u0000\u0000\u00a4\u0099\u0001\u0000\u0000\u0000\u00a4\u009c\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u001f\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\f%6CRZeqx\u0081\u0094\u00a4\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}