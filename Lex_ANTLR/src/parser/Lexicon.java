// Generated from src\parser\Lexicon.g4 by ANTLR 4.7.2
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
public class Lexicon extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITENT=1, READ=2, PRINT=3, INT=4, FLOAT=5, MAS=6, MENOS=7, IGUAL=8, PCOMA=9, 
		IDENT=10, LITREAL=11, LINE_COMMENT=12, MULTILNE_COMMENT=13, WHITESPACE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LITENT", "READ", "PRINT", "INT", "FLOAT", "MAS", "MENOS", "IGUAL", "PCOMA", 
			"IDENT", "LITREAL", "LINE_COMMENT", "MULTILNE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'read'", "'print'", "'int'", "'float'", "'+'", "'-'", "'='", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITENT", "READ", "PRINT", "INT", "FLOAT", "MAS", "MENOS", "IGUAL", 
			"PCOMA", "IDENT", "LITREAL", "LINE_COMMENT", "MULTILNE_COMMENT", "WHITESPACE"
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


	public Lexicon(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexicon.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2!\n\2\r\2\16\2\"\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13D\n\13\f\13\16"+
		"\13G\13\13\3\f\6\fJ\n\f\r\f\16\fK\3\f\3\f\7\fP\n\f\f\f\16\fS\13\f\3\r"+
		"\3\r\3\r\3\r\7\rY\n\r\f\r\16\r\\\13\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\7\16f\n\16\f\16\16\16i\13\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17q\n"+
		"\17\r\17\16\17r\3\17\3\17\4Zg\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\3\2\6\3\2\62;\4\2C\\c|\6\2\62;C\\a"+
		"ac|\5\2\13\f\17\17\"\"\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3 \3\2"+
		"\2\2\5$\3\2\2\2\7)\3\2\2\2\t/\3\2\2\2\13\63\3\2\2\2\r9\3\2\2\2\17;\3\2"+
		"\2\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27I\3\2\2\2\31T\3\2\2\2\33a\3"+
		"\2\2\2\35p\3\2\2\2\37!\t\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3"+
		"\2\2\2#\4\3\2\2\2$%\7t\2\2%&\7g\2\2&\'\7c\2\2\'(\7f\2\2(\6\3\2\2\2)*\7"+
		"r\2\2*+\7t\2\2+,\7k\2\2,-\7p\2\2-.\7v\2\2.\b\3\2\2\2/\60\7k\2\2\60\61"+
		"\7p\2\2\61\62\7v\2\2\62\n\3\2\2\2\63\64\7h\2\2\64\65\7n\2\2\65\66\7q\2"+
		"\2\66\67\7c\2\2\678\7v\2\28\f\3\2\2\29:\7-\2\2:\16\3\2\2\2;<\7/\2\2<\20"+
		"\3\2\2\2=>\7?\2\2>\22\3\2\2\2?@\7=\2\2@\24\3\2\2\2AE\t\3\2\2BD\t\4\2\2"+
		"CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\26\3\2\2\2GE\3\2\2\2HJ\t\2\2"+
		"\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MQ\7\60\2\2NP\t\2"+
		"\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\30\3\2\2\2SQ\3\2\2\2TU\7"+
		"\61\2\2UV\7\61\2\2VZ\3\2\2\2WY\13\2\2\2XW\3\2\2\2Y\\\3\2\2\2Z[\3\2\2\2"+
		"ZX\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\f\2\2^_\3\2\2\2_`\b\r\2\2`\32\3\2"+
		"\2\2ab\7\61\2\2bc\7,\2\2cg\3\2\2\2df\13\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3"+
		"\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7,\2\2kl\7\61\2\2lm\3\2\2\2mn\b"+
		"\16\2\2n\34\3\2\2\2oq\t\5\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"st\3\2\2\2tu\b\17\2\2u\36\3\2\2\2\n\2\"EKQZgr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}