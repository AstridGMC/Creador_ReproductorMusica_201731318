package CupYFlex;
import java_cup.runtime.* ;
import java_cup.runtime.Symbol;
import CupYFlex.sym;
import java.util.ArrayList;
import Backend.Pintor.PintarPalabras;
/*--------------2 Declaraciones ------------*/

%% 
%unicode
%public 
%class AnalizadorLexico 
%cupsym sym
%cup 
%char
%column
%line 

%{
    String cadena="";
    public PintarPalabras pintar = new PintarPalabras();

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type, Object value, int fila, int columna) {
        return new Symbol(type, yyline, yycolumn, value);}
%}

D = [0-9]+
LetraS = [A-Za-z|Ñ|ñ]
simbol= [_@#$-]
Comilla = [\"]
ID = [A-Za-z|Ñ|ñ|0-9]*
%state COMENT_MULTI
%state COMENT_SIMPLE
%%



<YYINITIAL> "<-"            {yybegin(COMENT_MULTI);}
<COMENT_MULTI> "->"         {pintar.pintaGris(yychar,yylength()); yybegin(YYINITIAL);  }
<COMENT_MULTI>[^\n]         {}
<COMENT_MULTI> [\r|\r\n\f]  {}


<YYINITIAL> ">>"            {yybegin(COMENT_SIMPLE);}
<COMENT_SIMPLE> .           { pintar.pintaGris(yychar,yylength()); }
<COMENT_SIMPLE> "\n"        { pintar.pintaGris(yychar,yylength()); yybegin(YYINITIAL);}

//simbolos
<YYINITIAL> {

//palabras reservadas
    ("entero")                              {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.SENTERO, yytext(), yyline, yycolumn);}
    ("doble")                               {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.SDOBLE, yytext(), yyline, yycolumn);}
    ("boolean")                             {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.SBOOLEN, yytext(), yyline, yycolumn);}
    ("caracter")                            {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.SCARACTER, yytext(), yyline, yycolumn);}
    ("cadena")                              {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.SCADENA, yytext(), yyline, yycolumn);}


    ("Extiende"|"extiende")                 {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.EXTIENDE, yytext(), yyline, yycolumn);}
    ("Pista"|"pista")                       {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.PISTA, yytext(), yyline, yycolumn);}
    ("falso"|"false")                       {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.BOOLF, yytext(), yyline, yycolumn);}
    ("verdadero"|"true")                    {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.BOOLT, yytext(), yyline, yycolumn);}
    ("keep"|"Keep")                         {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.KEEP, yytext(), yyline, yycolumn);}
    ("var"|"Var")                           {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.VAR, yytext(), yyline, yycolumn);}
    
// signos de agrupacion
    "("                                     { return symbol(sym.PARABRE, yytext(), yyline, yycolumn);}
    ")"                                     { return symbol(sym.PARCIERRA, yytext(), yyline, yycolumn);}
    "["                                     { return symbol(sym.CORCHETEIZ, yytext(), yyline, yycolumn);}
    "]"                                     { return symbol(sym.CORCHETEDER, yytext(), yyline, yycolumn);}

// digitos
    ({Comilla})({LetraS}({LetraS}{1,9})|({LetraS}))({Comilla})    {pintar.pintaNara(yychar,yylength()); System.out.println( "cadena"); return symbol(sym.CADENA , yytext(), yyline, yycolumn);} 
    ({LetraS})({ID})                            { pintar.pintaVerde(yychar,yylength()); System.out.println( "id"); return symbol(sym.IDENTIFICADOR , yytext(), yyline, yycolumn);} 
    ({D})(".")({D})                             { pintar.pintaMora(yychar,yylength()); return symbol(sym.DECIMAL , yytext(), yyline, yycolumn);} 
    ({D})                                       { pintar.pintaMora(yychar,yylength()); System.out.println( "int"); return symbol(sym.ENTERO , yytext(), yyline, yycolumn);} 
    ("'")({LetraS}|{D}|"#t"|"#n"|simbol)("'")   { pintar.pintaNara(yychar,yylength()); System.out.println( "char");return symbol(sym.CHAR , yytext(), yyline, yycolumn);} 

// SIGNOS ASIGNACION
    "+="                                     { return symbol(sym.SUMASIM, yytext(), yyline, yycolumn);}
    "++"                                     { return symbol(sym.SUMAUNOSIM, yytext(), yyline, yycolumn);}
    "--"                                     { return symbol(sym.MENOSUNOSIM, yytext(), yyline, yycolumn);}

// SIMBOLOS ALGEBRAICOS
    "+"                                     { return symbol(sym.MAS, yytext(), yyline, yycolumn);}
    "*"                                     { return symbol(sym.ASTERISCO, yytext(), yyline, yycolumn);}  
    "-"                                     { return symbol(sym.MENOS, yytext(), yyline, yycolumn);}  
    "/"                                     { return symbol(sym.DIV, yytext(), yyline, yycolumn);}  
    "%"                                     { return symbol(sym.MODULO, yytext(), yyline, yycolumn);} 
    "^"                                     { return symbol(sym.POT, yytext(), yyline, yycolumn);} 

// OPERADORES RELACIONALES
    "=="                                     { return symbol(sym.IGUALIGUAL, yytext(), yyline, yycolumn);} 
    "!="                                     { return symbol(sym.NOIGUAL, yytext(), yyline, yycolumn);} 
    ">"                                      { return symbol(sym.MAYORQUE, yytext(), yyline, yycolumn);} 
    "<"                                      { return symbol(sym.MENORQUE, yytext(), yyline, yycolumn);} 
    ">="                                     { return symbol(sym.MAYORIGUAL, yytext(), yyline, yycolumn);} 
    "<="                                     { return symbol(sym.MENORIGUAL, yytext(), yyline, yycolumn);} 
    "!!"                                     { return symbol(sym.ESNULO, yytext(), yyline, yycolumn);} 
    "="                                      { return symbol(sym.IGUAL, yytext(), yyline, yycolumn);}


//  OPERADORES LOGICOS
    "&&"                                    { return symbol(sym.AND, yytext(), yyline, yycolumn);} 
    "!&&"                                   { return symbol(sym.NAND, yytext(), yyline, yycolumn);} 
    "||"                                    { return symbol(sym.OR, yytext(), yyline, yycolumn);} 
    "!||"                                   { return symbol(sym.NOR, yytext(), yyline, yycolumn);} 
    "&|"                                    { return symbol(sym.XOR, yytext(), yyline, yycolumn);} 
    "!"                                     { return symbol(sym.NOT, yytext(), yyline, yycolumn);} 

// SIGNOS
    ";"                                     { return symbol(sym.PUNTOYCOMA, yytext(), yyline, yycolumn);} 
    ","                                     { return symbol(sym.COMA, yytext(), yyline, yycolumn);} 


// caracteres de escape
    (\n|\t|\r|\r\n)+ {/*IGNORAR*/}
    (" ")+ {}
    .                                       {System.out.println( "Caracter no reconocido: "+ yytext());}
}
