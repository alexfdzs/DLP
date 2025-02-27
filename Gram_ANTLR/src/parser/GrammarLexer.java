// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, LITENT=21, LITREAL=22, IDENT=23, COMMENT=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "LITENT", "LITREAL", "IDENT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DATA'", "'CODE'", "';'", "'real'", "'int'", "'read'", "'print'", 
			"'='", "'if'", "'while'", "'else'", "'('", "')'", "'{'", "'}'", "'+'", 
			"'!='", "'<'", "'>'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "LITENT", "LITREAL", 
			"IDENT", "COMMENT", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26z\n\26\r\26\16\26{\3\27\6\27\177"+
		"\n\27\r\27\16\27\u0080\3\27\3\27\7\27\u0085\n\27\f\27\16\27\u0088\13\27"+
		"\3\30\3\30\7\30\u008c\n\30\f\30\16\30\u008f\13\30\3\31\3\31\3\31\3\31"+
		"\7\31\u0095\n\31\f\31\16\31\u0098\13\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\6\32\u00a0\n\32\r\32\16\32\u00a1\3\32\3\32\3\u0096\2\33\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\6\3\2\62;\4\2C\\c|\6\2\62;C"+
		"\\aac|\5\2\13\f\17\17\"\"\2\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2"+
		"\2\2\5:\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13F\3\2\2\2\rJ\3\2\2\2\17O\3\2\2"+
		"\2\21U\3\2\2\2\23W\3\2\2\2\25Z\3\2\2\2\27`\3\2\2\2\31e\3\2\2\2\33g\3\2"+
		"\2\2\35i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%r\3\2\2\2\'t\3\2\2\2"+
		")v\3\2\2\2+y\3\2\2\2-~\3\2\2\2/\u0089\3\2\2\2\61\u0090\3\2\2\2\63\u009f"+
		"\3\2\2\2\65\66\7F\2\2\66\67\7C\2\2\678\7V\2\289\7C\2\29\4\3\2\2\2:;\7"+
		"E\2\2;<\7Q\2\2<=\7F\2\2=>\7G\2\2>\6\3\2\2\2?@\7=\2\2@\b\3\2\2\2AB\7t\2"+
		"\2BC\7g\2\2CD\7c\2\2DE\7n\2\2E\n\3\2\2\2FG\7k\2\2GH\7p\2\2HI\7v\2\2I\f"+
		"\3\2\2\2JK\7t\2\2KL\7g\2\2LM\7c\2\2MN\7f\2\2N\16\3\2\2\2OP\7r\2\2PQ\7"+
		"t\2\2QR\7k\2\2RS\7p\2\2ST\7v\2\2T\20\3\2\2\2UV\7?\2\2V\22\3\2\2\2WX\7"+
		"k\2\2XY\7h\2\2Y\24\3\2\2\2Z[\7y\2\2[\\\7j\2\2\\]\7k\2\2]^\7n\2\2^_\7g"+
		"\2\2_\26\3\2\2\2`a\7g\2\2ab\7n\2\2bc\7u\2\2cd\7g\2\2d\30\3\2\2\2ef\7*"+
		"\2\2f\32\3\2\2\2gh\7+\2\2h\34\3\2\2\2ij\7}\2\2j\36\3\2\2\2kl\7\177\2\2"+
		"l \3\2\2\2mn\7-\2\2n\"\3\2\2\2op\7#\2\2pq\7?\2\2q$\3\2\2\2rs\7>\2\2s&"+
		"\3\2\2\2tu\7@\2\2u(\3\2\2\2vw\7.\2\2w*\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{\3"+
		"\2\2\2{y\3\2\2\2{|\3\2\2\2|,\3\2\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0086\7\60\2\2\u0083\u0085\t\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087.\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008d\t\3\2\2\u008a\u008c\t\4\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\60\3\2\2"+
		"\2\u008f\u008d\3\2\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7,\2\2\u0092\u0096"+
		"\3\2\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009a\7,\2\2\u009a\u009b\7\61\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\b\31\2\2\u009d\62\3\2\2\2\u009e\u00a0\t\5\2\2\u009f\u009e\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\b\32\2\2\u00a4\64\3\2\2\2\t\2{\u0080\u0086\u008d"+
		"\u0096\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}