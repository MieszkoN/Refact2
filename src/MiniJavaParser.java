// Generated from /home/mieszko/Pulpit/ECOTE/Lab/Refact2/grammar/MiniJava.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT=39, BOOL=40, STRING=41, Identifier=42, WS=43;
	public static final int
		RULE_start = 0, RULE_mainClassDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_mainClassBody = 3, RULE_mainMethod = 4, RULE_mainMethodDeclaration = 5, 
		RULE_classBody = 6, RULE_fieldDeclaration = 7, RULE_varDeclaration = 8, 
		RULE_methodDeclaration = 9, RULE_methodBody = 10, RULE_formalParameters = 11, 
		RULE_formalParameterList = 12, RULE_formalParameter = 13, RULE_type = 14, 
		RULE_statement = 15, RULE_expression = 16, RULE_methodArgumentList = 17, 
		RULE_intArrayType = 18, RULE_booleanType = 19, RULE_intType = 20, RULE_charType = 21, 
		RULE_stringType = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "mainClassDeclaration", "classDeclaration", "mainClassBody", 
			"mainMethod", "mainMethodDeclaration", "classBody", "fieldDeclaration", 
			"varDeclaration", "methodDeclaration", "methodBody", "formalParameters", 
			"formalParameterList", "formalParameter", "type", "statement", "expression", 
			"methodArgumentList", "intArrayType", "booleanType", "intType", "charType", 
			"stringType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'extends'", "'{'", "'}'", "'public'", "'static'", "'void'", 
			"'main'", "'('", "'String'", "'['", "']'", "')'", "';'", "','", "'if'", 
			"'else'", "'while'", "'System.out.println'", "'='", "'return'", "'recur'", 
			"'?'", "':'", "'.'", "'length'", "'-'", "'!'", "'new'", "'int'", "'+'", 
			"'*'", "'/'", "'<'", "'&&'", "'this'", "'boolean'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT", "BOOL", "STRING", "Identifier", "WS"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public MainClassDeclarationContext mainClassDeclaration() {
			return getRuleContext(MainClassDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			mainClassDeclaration();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(47);
				classDeclaration();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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

	public static class MainClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public MainClassBodyContext mainClassBody() {
			return getRuleContext(MainClassBodyContext.class,0);
		}
		public MainClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassDeclarationContext mainClassDeclaration() throws RecognitionException {
		MainClassDeclarationContext _localctx = new MainClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
			match(Identifier);
			setState(57);
			mainClassBody();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(60);
			match(Identifier);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(61);
				match(T__1);
				setState(62);
				type();
				}
			}

			setState(65);
			classBody();
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

	public static class MainClassBodyContext extends ParserRuleContext {
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public MainClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClassBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassBodyContext mainClassBody() throws RecognitionException {
		MainClassBodyContext _localctx = new MainClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainClassBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__2);
			setState(68);
			mainMethod();
			setState(69);
			match(T__3);
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

	public static class MainMethodContext extends ParserRuleContext {
		public MainMethodDeclarationContext mainMethodDeclaration() {
			return getRuleContext(MainMethodDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			mainMethodDeclaration();
			setState(72);
			match(T__2);
			setState(73);
			statement();
			setState(74);
			match(T__3);
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

	public static class MainMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public MainMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__4);
			setState(77);
			match(T__5);
			setState(78);
			match(T__6);
			setState(79);
			match(T__7);
			setState(80);
			match(T__8);
			setState(81);
			match(T__9);
			setState(82);
			match(T__10);
			setState(83);
			match(T__11);
			setState(84);
			match(Identifier);
			setState(85);
			match(T__12);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__2);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					fieldDeclaration();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << T__29) | (1L << T__36) | (1L << T__37) | (1L << Identifier))) != 0)) {
				{
				{
				setState(94);
				methodDeclaration();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T__3);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			match(Identifier);
			setState(104);
			match(T__13);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			type();
			setState(107);
			match(Identifier);
			setState(108);
			match(T__13);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(110);
				match(T__4);
				setState(111);
				type();
				setState(112);
				match(Identifier);
				setState(113);
				formalParameters();
				}
				break;
			case 2:
				{
				setState(115);
				type();
				setState(116);
				match(Identifier);
				setState(117);
				formalParameters();
				notifyErrorListeners("method declaration without public");
				}
				break;
			case 3:
				{
				setState(120);
				match(T__4);
				setState(121);
				match(Identifier);
				setState(122);
				formalParameters();
				notifyErrorListeners("method declaration without return type");
				}
				break;
			case 4:
				{
				setState(125);
				match(T__4);
				setState(126);
				type();
				setState(127);
				formalParameters();
				notifyErrorListeners("method declaration without method name");
				}
				break;
			case 5:
				{
				setState(130);
				match(T__4);
				setState(131);
				type();
				setState(132);
				match(Identifier);
				notifyErrorListeners("method declaration without argument list");
				}
				break;
			}
			setState(137);
			methodBody();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__2);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					varDeclaration();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				statement();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0) );
			setState(151);
			match(T__3);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__8);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__29) | (1L << T__36) | (1L << T__37) | (1L << Identifier))) != 0)) {
				{
				setState(154);
				formalParameterList();
				}
			}

			setState(157);
			match(T__12);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			formalParameter();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(160);
				match(T__14);
				setState(161);
				formalParameter();
				}
				}
				setState(166);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			type();
			setState(168);
			match(Identifier);
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

	public static class TypeContext extends ParserRuleContext {
		public IntArrayTypeContext intArrayType() {
			return getRuleContext(IntArrayTypeContext.class,0);
		}
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
		}
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public CharTypeContext charType() {
			return getRuleContext(CharTypeContext.class,0);
		}
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				intArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				booleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				intType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				charType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				stringType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecurStatementContext extends StatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodArgumentListContext methodArgumentList() {
			return getRuleContext(MethodArgumentListContext.class,0);
		}
		public RecurStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterRecurStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitRecurStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitRecurStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NestedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNestedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNestedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNestedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new NestedStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(T__2);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(179);
					statement();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(T__15);
				setState(187);
				match(T__8);
				setState(188);
				expression(0);
				setState(189);
				match(T__12);
				setState(190);
				statement();
				setState(191);
				match(T__16);
				setState(192);
				statement();
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(T__17);
				setState(195);
				match(T__8);
				setState(196);
				expression(0);
				setState(197);
				match(T__12);
				setState(198);
				statement();
				}
				break;
			case 4:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(T__18);
				setState(201);
				match(T__8);
				setState(202);
				expression(0);
				setState(203);
				match(T__12);
				setState(204);
				match(T__13);
				}
				break;
			case 5:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(Identifier);
				setState(207);
				match(T__19);
				setState(208);
				expression(0);
				setState(209);
				match(T__13);
				}
				break;
			case 6:
				_localctx = new ArrayAssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				match(Identifier);
				setState(212);
				match(T__10);
				setState(213);
				expression(0);
				setState(214);
				match(T__11);
				setState(215);
				match(T__19);
				setState(216);
				expression(0);
				setState(217);
				match(T__13);
				}
				break;
			case 7:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(219);
				match(T__20);
				setState(220);
				expression(0);
				setState(221);
				match(T__13);
				}
				break;
			case 8:
				_localctx = new RecurStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(223);
				match(T__21);
				setState(224);
				expression(0);
				setState(225);
				match(T__22);
				setState(226);
				methodArgumentList();
				setState(227);
				match(T__23);
				setState(228);
				expression(0);
				setState(229);
				match(T__13);
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
	public static class LtExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectInstantiationExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ObjectInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterObjectInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitObjectInstantiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitObjectInstantiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayInstantiationExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayInstantiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayInstantiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public MethodArgumentListContext methodArgumentList() {
			return getRuleContext(MethodArgumentListContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLitExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public BooleanLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBooleanLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBooleanLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBooleanLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLitExpressionContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public IntLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIntLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIntLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLitExpressionContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(MiniJavaParser.BOOL, 0); }
		public StringLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStringLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStringLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStringLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLengthExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayLengthExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayLengthExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayLengthExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNegExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNegExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNegExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new NegExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(234);
				match(T__26);
				setState(235);
				expression(16);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(T__27);
				setState(237);
				expression(15);
				}
				break;
			case 3:
				{
				_localctx = new ArrayInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(T__28);
				setState(239);
				match(T__29);
				setState(240);
				match(T__10);
				setState(241);
				expression(0);
				setState(242);
				match(T__11);
				}
				break;
			case 4:
				{
				_localctx = new ObjectInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(T__28);
				setState(245);
				match(Identifier);
				setState(246);
				match(T__8);
				setState(247);
				match(T__12);
				}
				break;
			case 5:
				{
				_localctx = new IntLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new StringLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new BooleanLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(T__35);
				}
				break;
			case 10:
				{
				_localctx = new ParentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(T__8);
				setState(254);
				expression(0);
				setState(255);
				match(T__12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(260);
						match(T__30);
						setState(261);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(263);
						match(T__26);
						setState(264);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(266);
						match(T__31);
						setState(267);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(269);
						match(T__32);
						setState(270);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(272);
						match(T__33);
						setState(273);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(275);
						match(T__34);
						setState(276);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(278);
						match(T__10);
						setState(279);
						expression(0);
						setState(280);
						match(T__11);
						}
						break;
					case 8:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(283);
						match(T__24);
						setState(284);
						match(T__25);
						}
						break;
					case 9:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(286);
						match(T__24);
						setState(287);
						match(Identifier);
						setState(288);
						methodArgumentList();
						}
						break;
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class MethodArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentListContext methodArgumentList() throws RecognitionException {
		MethodArgumentListContext _localctx = new MethodArgumentListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__8);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__35) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << Identifier))) != 0)) {
				{
				setState(295);
				expression(0);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(296);
					match(T__14);
					setState(297);
					expression(0);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(305);
			match(T__12);
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

	public static class IntArrayTypeContext extends ParserRuleContext {
		public IntArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIntArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIntArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArrayTypeContext intArrayType() throws RecognitionException {
		IntArrayTypeContext _localctx = new IntArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_intArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__29);
			setState(308);
			match(T__10);
			setState(309);
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

	public static class BooleanTypeContext extends ParserRuleContext {
		public BooleanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTypeContext booleanType() throws RecognitionException {
		BooleanTypeContext _localctx = new BooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__36);
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

	public static class IntTypeContext extends ParserRuleContext {
		public IntTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntTypeContext intType() throws RecognitionException {
		IntTypeContext _localctx = new IntTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_intType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__29);
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

	public static class CharTypeContext extends ParserRuleContext {
		public CharTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharTypeContext charType() throws RecognitionException {
		CharTypeContext _localctx = new CharTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_charType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__37);
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

	public static class StringTypeContext extends ParserRuleContext {
		public StringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringTypeContext stringType() throws RecognitionException {
		StringTypeContext _localctx = new StringTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__9);
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
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0140\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"+
		"\n\u0000\f\u00004\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002@\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0005\u0006Z\b\u0006\n\u0006\f\u0006]\t\u0006"+
		"\u0001\u0006\u0005\u0006`\b\u0006\n\u0006\f\u0006c\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0088\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u008e\b\n"+
		"\n\n\f\n\u0091\t\n\u0001\n\u0004\n\u0094\b\n\u000b\n\f\n\u0095\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u009c\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00a3\b\f\n\f\f\f\u00a6\t"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00b1\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00b5\b\u000f\n\u000f\f\u000f\u00b8\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e8\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0102"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0122\b\u0010\n\u0010\f\u0010\u0125\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u012b\b\u0011\n\u0011"+
		"\f\u0011\u012e\t\u0011\u0003\u0011\u0130\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0000\u0001 \u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0000\u0155\u0000"+
		".\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004;\u0001"+
		"\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000"+
		"\u0000\nL\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000ef\u0001"+
		"\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000\u0012\u0087\u0001\u0000"+
		"\u0000\u0000\u0014\u008b\u0001\u0000\u0000\u0000\u0016\u0099\u0001\u0000"+
		"\u0000\u0000\u0018\u009f\u0001\u0000\u0000\u0000\u001a\u00a7\u0001\u0000"+
		"\u0000\u0000\u001c\u00b0\u0001\u0000\u0000\u0000\u001e\u00e7\u0001\u0000"+
		"\u0000\u0000 \u0101\u0001\u0000\u0000\u0000\"\u0126\u0001\u0000\u0000"+
		"\u0000$\u0133\u0001\u0000\u0000\u0000&\u0137\u0001\u0000\u0000\u0000("+
		"\u0139\u0001\u0000\u0000\u0000*\u013b\u0001\u0000\u0000\u0000,\u013d\u0001"+
		"\u0000\u0000\u0000.2\u0003\u0002\u0001\u0000/1\u0003\u0004\u0002\u0000"+
		"0/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u0000"+
		"78\u0005\u0001\u0000\u000089\u0005*\u0000\u00009:\u0003\u0006\u0003\u0000"+
		":\u0003\u0001\u0000\u0000\u0000;<\u0005\u0001\u0000\u0000<?\u0005*\u0000"+
		"\u0000=>\u0005\u0002\u0000\u0000>@\u0003\u001c\u000e\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0003"+
		"\f\u0006\u0000B\u0005\u0001\u0000\u0000\u0000CD\u0005\u0003\u0000\u0000"+
		"DE\u0003\b\u0004\u0000EF\u0005\u0004\u0000\u0000F\u0007\u0001\u0000\u0000"+
		"\u0000GH\u0003\n\u0005\u0000HI\u0005\u0003\u0000\u0000IJ\u0003\u001e\u000f"+
		"\u0000JK\u0005\u0004\u0000\u0000K\t\u0001\u0000\u0000\u0000LM\u0005\u0005"+
		"\u0000\u0000MN\u0005\u0006\u0000\u0000NO\u0005\u0007\u0000\u0000OP\u0005"+
		"\b\u0000\u0000PQ\u0005\t\u0000\u0000QR\u0005\n\u0000\u0000RS\u0005\u000b"+
		"\u0000\u0000ST\u0005\f\u0000\u0000TU\u0005*\u0000\u0000UV\u0005\r\u0000"+
		"\u0000V\u000b\u0001\u0000\u0000\u0000W[\u0005\u0003\u0000\u0000XZ\u0003"+
		"\u000e\u0007\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\a\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^`\u0003\u0012\t\u0000_^\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005"+
		"\u0004\u0000\u0000e\r\u0001\u0000\u0000\u0000fg\u0003\u001c\u000e\u0000"+
		"gh\u0005*\u0000\u0000hi\u0005\u000e\u0000\u0000i\u000f\u0001\u0000\u0000"+
		"\u0000jk\u0003\u001c\u000e\u0000kl\u0005*\u0000\u0000lm\u0005\u000e\u0000"+
		"\u0000m\u0011\u0001\u0000\u0000\u0000no\u0005\u0005\u0000\u0000op\u0003"+
		"\u001c\u000e\u0000pq\u0005*\u0000\u0000qr\u0003\u0016\u000b\u0000r\u0088"+
		"\u0001\u0000\u0000\u0000st\u0003\u001c\u000e\u0000tu\u0005*\u0000\u0000"+
		"uv\u0003\u0016\u000b\u0000vw\u0006\t\uffff\uffff\u0000w\u0088\u0001\u0000"+
		"\u0000\u0000xy\u0005\u0005\u0000\u0000yz\u0005*\u0000\u0000z{\u0003\u0016"+
		"\u000b\u0000{|\u0006\t\uffff\uffff\u0000|\u0088\u0001\u0000\u0000\u0000"+
		"}~\u0005\u0005\u0000\u0000~\u007f\u0003\u001c\u000e\u0000\u007f\u0080"+
		"\u0003\u0016\u000b\u0000\u0080\u0081\u0006\t\uffff\uffff\u0000\u0081\u0088"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u0084"+
		"\u0003\u001c\u000e\u0000\u0084\u0085\u0005*\u0000\u0000\u0085\u0086\u0006"+
		"\t\uffff\uffff\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087n\u0001"+
		"\u0000\u0000\u0000\u0087s\u0001\u0000\u0000\u0000\u0087x\u0001\u0000\u0000"+
		"\u0000\u0087}\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0003\u0014\n\u0000\u008a"+
		"\u0013\u0001\u0000\u0000\u0000\u008b\u008f\u0005\u0003\u0000\u0000\u008c"+
		"\u008e\u0003\u0010\b\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0094\u0003\u001e\u000f\u0000\u0093\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0004\u0000\u0000\u0098\u0015"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0005\t\u0000\u0000\u009a\u009c\u0003"+
		"\u0018\f\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\r\u0000"+
		"\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a4\u0003\u001a\r\u0000"+
		"\u00a0\u00a1\u0005\u000f\u0000\u0000\u00a1\u00a3\u0003\u001a\r\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u0019\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0003\u001c\u000e\u0000\u00a8\u00a9\u0005*\u0000\u0000\u00a9\u001b"+
		"\u0001\u0000\u0000\u0000\u00aa\u00b1\u0003$\u0012\u0000\u00ab\u00b1\u0003"+
		"&\u0013\u0000\u00ac\u00b1\u0003(\u0014\u0000\u00ad\u00b1\u0003*\u0015"+
		"\u0000\u00ae\u00b1\u0003,\u0016\u0000\u00af\u00b1\u0005*\u0000\u0000\u00b0"+
		"\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u001d\u0001\u0000\u0000\u0000\u00b2\u00b6\u0005\u0003\u0000\u0000\u00b3"+
		"\u00b5\u0003\u001e\u000f\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00e8\u0005\u0004\u0000\u0000\u00ba"+
		"\u00bb\u0005\u0010\u0000\u0000\u00bb\u00bc\u0005\t\u0000\u0000\u00bc\u00bd"+
		"\u0003 \u0010\u0000\u00bd\u00be\u0005\r\u0000\u0000\u00be\u00bf\u0003"+
		"\u001e\u000f\u0000\u00bf\u00c0\u0005\u0011\u0000\u0000\u00c0\u00c1\u0003"+
		"\u001e\u000f\u0000\u00c1\u00e8\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\u0012\u0000\u0000\u00c3\u00c4\u0005\t\u0000\u0000\u00c4\u00c5\u0003 "+
		"\u0010\u0000\u00c5\u00c6\u0005\r\u0000\u0000\u00c6\u00c7\u0003\u001e\u000f"+
		"\u0000\u00c7\u00e8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0013\u0000"+
		"\u0000\u00c9\u00ca\u0005\t\u0000\u0000\u00ca\u00cb\u0003 \u0010\u0000"+
		"\u00cb\u00cc\u0005\r\u0000\u0000\u00cc\u00cd\u0005\u000e\u0000\u0000\u00cd"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005*\u0000\u0000\u00cf\u00d0"+
		"\u0005\u0014\u0000\u0000\u00d0\u00d1\u0003 \u0010\u0000\u00d1\u00d2\u0005"+
		"\u000e\u0000\u0000\u00d2\u00e8\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"*\u0000\u0000\u00d4\u00d5\u0005\u000b\u0000\u0000\u00d5\u00d6\u0003 \u0010"+
		"\u0000\u00d6\u00d7\u0005\f\u0000\u0000\u00d7\u00d8\u0005\u0014\u0000\u0000"+
		"\u00d8\u00d9\u0003 \u0010\u0000\u00d9\u00da\u0005\u000e\u0000\u0000\u00da"+
		"\u00e8\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0015\u0000\u0000\u00dc"+
		"\u00dd\u0003 \u0010\u0000\u00dd\u00de\u0005\u000e\u0000\u0000\u00de\u00e8"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0016\u0000\u0000\u00e0\u00e1"+
		"\u0003 \u0010\u0000\u00e1\u00e2\u0005\u0017\u0000\u0000\u00e2\u00e3\u0003"+
		"\"\u0011\u0000\u00e3\u00e4\u0005\u0018\u0000\u0000\u00e4\u00e5\u0003 "+
		"\u0010\u0000\u00e5\u00e6\u0005\u000e\u0000\u0000\u00e6\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e7\u00b2\u0001\u0000\u0000\u0000\u00e7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00e7\u00c2\u0001\u0000\u0000\u0000\u00e7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00e7\u00ce\u0001\u0000\u0000\u0000\u00e7\u00d3\u0001\u0000"+
		"\u0000\u0000\u00e7\u00db\u0001\u0000\u0000\u0000\u00e7\u00df\u0001\u0000"+
		"\u0000\u0000\u00e8\u001f\u0001\u0000\u0000\u0000\u00e9\u00ea\u0006\u0010"+
		"\uffff\uffff\u0000\u00ea\u00eb\u0005\u001b\u0000\u0000\u00eb\u0102\u0003"+
		" \u0010\u0010\u00ec\u00ed\u0005\u001c\u0000\u0000\u00ed\u0102\u0003 \u0010"+
		"\u000f\u00ee\u00ef\u0005\u001d\u0000\u0000\u00ef\u00f0\u0005\u001e\u0000"+
		"\u0000\u00f0\u00f1\u0005\u000b\u0000\u0000\u00f1\u00f2\u0003 \u0010\u0000"+
		"\u00f2\u00f3\u0005\f\u0000\u0000\u00f3\u0102\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005\u001d\u0000\u0000\u00f5\u00f6\u0005*\u0000\u0000\u00f6\u00f7"+
		"\u0005\t\u0000\u0000\u00f7\u0102\u0005\r\u0000\u0000\u00f8\u0102\u0005"+
		"\'\u0000\u0000\u00f9\u0102\u0005(\u0000\u0000\u00fa\u0102\u0005)\u0000"+
		"\u0000\u00fb\u0102\u0005*\u0000\u0000\u00fc\u0102\u0005$\u0000\u0000\u00fd"+
		"\u00fe\u0005\t\u0000\u0000\u00fe\u00ff\u0003 \u0010\u0000\u00ff\u0100"+
		"\u0005\r\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00e9\u0001"+
		"\u0000\u0000\u0000\u0101\u00ec\u0001\u0000\u0000\u0000\u0101\u00ee\u0001"+
		"\u0000\u0000\u0000\u0101\u00f4\u0001\u0000\u0000\u0000\u0101\u00f8\u0001"+
		"\u0000\u0000\u0000\u0101\u00f9\u0001\u0000\u0000\u0000\u0101\u00fa\u0001"+
		"\u0000\u0000\u0000\u0101\u00fb\u0001\u0000\u0000\u0000\u0101\u00fc\u0001"+
		"\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0102\u0123\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\n\f\u0000\u0000\u0104\u0105\u0005\u001f"+
		"\u0000\u0000\u0105\u0122\u0003 \u0010\r\u0106\u0107\n\u000b\u0000\u0000"+
		"\u0107\u0108\u0005\u001b\u0000\u0000\u0108\u0122\u0003 \u0010\f\u0109"+
		"\u010a\n\n\u0000\u0000\u010a\u010b\u0005 \u0000\u0000\u010b\u0122\u0003"+
		" \u0010\u000b\u010c\u010d\n\t\u0000\u0000\u010d\u010e\u0005!\u0000\u0000"+
		"\u010e\u0122\u0003 \u0010\n\u010f\u0110\n\b\u0000\u0000\u0110\u0111\u0005"+
		"\"\u0000\u0000\u0111\u0122\u0003 \u0010\t\u0112\u0113\n\u0007\u0000\u0000"+
		"\u0113\u0114\u0005#\u0000\u0000\u0114\u0122\u0003 \u0010\b\u0115\u0116"+
		"\n\u0013\u0000\u0000\u0116\u0117\u0005\u000b\u0000\u0000\u0117\u0118\u0003"+
		" \u0010\u0000\u0118\u0119\u0005\f\u0000\u0000\u0119\u0122\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\n\u0012\u0000\u0000\u011b\u011c\u0005\u0019\u0000"+
		"\u0000\u011c\u0122\u0005\u001a\u0000\u0000\u011d\u011e\n\u0011\u0000\u0000"+
		"\u011e\u011f\u0005\u0019\u0000\u0000\u011f\u0120\u0005*\u0000\u0000\u0120"+
		"\u0122\u0003\"\u0011\u0000\u0121\u0103\u0001\u0000\u0000\u0000\u0121\u0106"+
		"\u0001\u0000\u0000\u0000\u0121\u0109\u0001\u0000\u0000\u0000\u0121\u010c"+
		"\u0001\u0000\u0000\u0000\u0121\u010f\u0001\u0000\u0000\u0000\u0121\u0112"+
		"\u0001\u0000\u0000\u0000\u0121\u0115\u0001\u0000\u0000\u0000\u0121\u011a"+
		"\u0001\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0122\u0125"+
		"\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124!\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0126\u012f\u0005\t\u0000\u0000\u0127\u012c\u0003 "+
		"\u0010\u0000\u0128\u0129\u0005\u000f\u0000\u0000\u0129\u012b\u0003 \u0010"+
		"\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012f\u0127\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0005\r\u0000\u0000"+
		"\u0132#\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u001e\u0000\u0000\u0134"+
		"\u0135\u0005\u000b\u0000\u0000\u0135\u0136\u0005\f\u0000\u0000\u0136%"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0005%\u0000\u0000\u0138\'\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0005\u001e\u0000\u0000\u013a)\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0005&\u0000\u0000\u013c+\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0005\n\u0000\u0000\u013e-\u0001\u0000\u0000\u0000\u0011"+
		"2?[a\u0087\u008f\u0095\u009b\u00a4\u00b0\u00b6\u00e7\u0101\u0121\u0123"+
		"\u012c\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}