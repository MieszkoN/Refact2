grammar MiniJava;

start
    :   mainClassDeclaration
        classDeclaration*
        EOF
    ;

mainClassDeclaration
    :   'class' Identifier
        mainClassBody
    ;

classDeclaration
    :   'class' Identifier ('extends' type)?
        classBody
    ;

mainClassBody
    :   '{' mainMethod '}'
    ;

mainMethod
    :   mainMethodDeclaration '{' statement '}'
    ;

mainMethodDeclaration
    :   'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')'
    ;

classBody
    :   '{' fieldDeclaration*
            methodDeclaration* '}'
    ;

fieldDeclaration
    :   type Identifier ';'
    ;

varDeclaration
    :   type Identifier ';'
    ;

methodDeclaration
    :   ( 'public' type Identifier formalParameters
        /* illegal method declarations */
        |          type Identifier formalParameters
            {notifyErrorListeners("method declaration without public");}
        | 'public'      Identifier formalParameters
            {notifyErrorListeners("method declaration without return type");}
        | 'public' type    formalParameters
            {notifyErrorListeners("method declaration without method name");}
        | 'public' type Identifier
            {notifyErrorListeners("method declaration without argument list");}
        )
        methodBody
    ;

methodBody
    :   '{'
            varDeclaration*
            statement+
        '}'
    ;

formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)*
    ;

formalParameter
    :   type Identifier
    ;

type
    :   intArrayType
    |   booleanType
    |   intType
    |   charType
    |   stringType
    |   Identifier
    ;

statement
    :   '{' statement* '}'
    # nestedStatement
    |   'if' '(' expression ')'
            statement
        'else'
            statement
    # ifElseStatement
    |   'while' '(' expression ')'
            statement
    # whileStatement
    |   'System.out.println' '(' expression ')' ';'
    # printStatement
    |   Identifier '=' expression ';'
    # assignStatement
    |   Identifier '[' expression ']' '=' expression ';'
    # arrayAssignStatement
    |   'return' expression ';'
    # returnStatement
    |   'recur' expression '?' methodArgumentList ':' expression ';'
    # recurStatement
    ;

expression
    :   expression '[' expression ']'
    # arrayAccessExpression
    |   expression '.' 'length'
    # arrayLengthExpression
    |   expression '.' Identifier methodArgumentList
    # methodCallExpression
    |   '-' expression
    # negExpression
    |   '!' expression
    # notExpression
    |   'new' 'int' '[' expression ']'
    # arrayInstantiationExpression
    |   'new' Identifier '(' ')'
    # objectInstantiationExpression
    |   expression '+'  expression
    # addExpression
    |   expression '-'  expression
    # subExpression
    |   expression '*'  expression
    # mulExpression
    |   expression '<'  expression
    # ltExpression  
    |   expression '&&' expression
    # andExpression
    |   INT
    # intLitExpression
    |   BOOL
    # booleanLitExpression
    |   Identifier
    # identifierExpression
    |   'this'
    # thisExpression
    |   '(' expression ')'
    # parentExpression
    ;

methodArgumentList
    :   '(' (expression (',' expression)*)? ')'
    ;

intArrayType
    :   'int' '[' ']'
    ;

booleanType
    :   'boolean'
    ;

intType
    :   'int'
    ;

charType
    :   'char'
    ;

stringType
    :   'String'
    ;

INT
    :   ('0' | [1-9][0-9]*) 
    ;

BOOL
    :   'true'
    |   'false'
    ;

Identifier
    :   [a-zA-Z_][0-9a-zA-Z_]*
    ;

WS
    :   [ \r\t\n]+ -> channel(HIDDEN)
    ;