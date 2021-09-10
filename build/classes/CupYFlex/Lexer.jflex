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
LetraS = [A-Za-zÑñ]
simbol= [_@#$-]
Comilla = [\"]
ID = [A-Za-z|Ñ|ñ|0-9]*
OR = [\|]
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
(" ")+ {}

    ({OR})({OR})                            {System.out.println( "OR"+ yytext()); return symbol(sym.OR, yytext(), yyline, yycolumn);} 

//palabras reservadas
    ("entero")                              {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.SENTERO, yytext(), yyline, yycolumn);}
    ("doble")                               {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.SDOBLE, yytext(), yyline, yycolumn);}
    ("boolean")                             {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.SBOOLEAN, yytext(), yyline, yycolumn);}
    ("caracter")                            {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.SCARACTER, yytext(), yyline, yycolumn);}
    ("cadena")                              {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.SCADENA, yytext(), yyline, yycolumn);}


    ("Extiende"|"extiende")                 {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.EXTIENDE, yytext(), yyline, yycolumn);}
    ("Pista"|"pista")                       {  pintar.pintaAzul(yychar,yylength());  return symbol(sym.PISTA, yytext(), yyline, yycolumn);}
    ("falso"|"false")                       {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.BOOLF, yytext(), yyline, yycolumn);}
    ("verdadero"|"true")                    {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.BOOLT, yytext(), yyline, yycolumn);}
    ("keep"|"Keep")                         {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.KEEP, yytext(), yyline, yycolumn);}
    
    ("var"|"Var")                           { System.out.println( "VAR"+ yytext()); pintar.pintaAzul(yychar,yylength()); return symbol(sym.VAR, yytext(), yyline, yycolumn);}
    ("arreglo"|"Arreglo")                   {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.ARREGLO, yytext(), yyline, yycolumn);}
    ("switch"|"Switch")                     {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.SWITCH, yytext(), yyline, yycolumn);}
    ("default"|"Default")                   {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.DEFAULT, yytext(), yyline, yycolumn);}
    ("caso"|"Caso")                         {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.CASO, yytext(), yyline, yycolumn);}
    ("salir"|"Salir")                       {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.SALIR, yytext(), yyline, yycolumn);}
    ("para"|"Para")                         {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.PARA, yytext(), yyline, yycolumn);}
    ("mientras"|"Mientras")                 {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.MIENTRAS, yytext(), yyline, yycolumn);}
    ("hacer"|"Hacer")                       {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.HACER, yytext(), yyline, yycolumn);}
    ("caso"|"Caso")                         {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.CASO, yytext(), yyline, yycolumn);}
    ("continuar"|"Continuar")               {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.CONTINUAR, yytext(), yyline, yycolumn);}
    ("void"|"Void")                         {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.CONTINUAR, yytext(), yyline, yycolumn);}


    ("Principal")                           {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.PRINCIPAL, yytext(), yyline, yycolumn);}
    ("reproducir"|"Reproduci")              {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.REPRODUCIR, yytext(), yyline, yycolumn);}
    ("esperar"|"Esperar")                   {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.ESPERAR, yytext(), yyline, yycolumn);}
    ("ordenar"|"Ordenar")                   {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.ORDENAR, yytext(), yyline, yycolumn);}
    ("sumarizar"|"Sumarizar")               {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.SUMARIZAR, yytext(), yyline, yycolumn);}
    ("longitud"|"Longitud")                 {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.LONGITUD, yytext(), yyline, yycolumn);}
    ("mensaje"|"Mensaje")                   {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.MENSAJE, yytext(), yyline, yycolumn);}
    
//formas de ordenar
    ("ascendente"|"Ascendente")             {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.ASCENDENTE, yytext(), yyline, yycolumn);}
    ("descendente"|"Descendente")           {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.DESCENDENTE, yytext(), yyline, yycolumn);}
    ("pares"|"Pares")                       {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.PARES, yytext(), yyline, yycolumn);}
    ("impares"|"Impares")                   {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.IMPARES, yytext(), yyline, yycolumn);}
    ("primos"|"Primos")                     {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.PRIMOS, yytext(), yyline, yycolumn);}

//IFELSE
    ("if"|"If")                     {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.IF, yytext(), yyline, yycolumn);}
    ("else"|"Else")                 {  pintar.pintaAzul(yychar,yylength()); return symbol(sym.ELSE, yytext(), yyline, yycolumn);}


// signos de agrupacion
    "("                                     { return symbol(sym.PARABRE, yytext(), yyline, yycolumn);}
    ")"                                     { return symbol(sym.PARCIERRA, yytext(), yyline, yycolumn);}
    "["                                     { return symbol(sym.CORCHETEIZ, yytext(), yyline, yycolumn);}
    "]"                                     { return symbol(sym.CORCHETEDER, yytext(), yyline, yycolumn);}
    "{"                                     { return symbol(sym.LLAVEABRE, yytext(), yyline, yycolumn);}
    "}"                                     { return symbol(sym.LLAVECIERRA, yytext(), yyline, yycolumn);}



// digitos
    ({Comilla})({LetraS})({D}|{LetraS}|"#t"|"#n")*({Comilla})    {pintar.pintaNara(yychar,yylength()); System.out.println( "cadena"); return symbol(sym.CADENA , yytext(), yyline, yycolumn);} 
    ({LetraS})({ID})                            {System.out.println( "ID"); pintar.pintaVerde(yychar,yylength()); System.out.println( "id"); return symbol(sym.IDENTIFICADOR , yytext(), yyline, yycolumn);} 
    ({D})(".")({D})                             { pintar.pintaMora(yychar,yylength()); return symbol(sym.DECIMAL , yytext(), yyline, yycolumn);} 
    ({D})                                       { pintar.pintaMora(yychar,yylength()); System.out.println( "int"); return symbol(sym.ENTERO , yytext(), yyline, yycolumn);} 
    ("'")({LetraS}|{D}|"#t"|"#n"|simbol)("'")   { pintar.pintaNara(yychar,yylength()); System.out.println( "char");return symbol(sym.CHAR , yytext(), yyline, yycolumn);} 

// SIGNOS ASIGNACION
    "+="                                     { return symbol(sym.MASIGUAL, yytext(), yyline, yycolumn);}
    "++"                                     { return symbol(sym.SUMASUMA, yytext(), yyline, yycolumn);}
    "--"                                     { return symbol(sym.MENOSMENOS, yytext(), yyline, yycolumn);}

// SIMBOLOS ALGEBRAICOS
    "+"                                     { return symbol(sym.MAS, yytext(), yyline, yycolumn);}
    "*"                                     { return symbol(sym.ASTERISCO, yytext(), yyline, yycolumn);}  
    "-"                                     { return symbol(sym.MENOS, yytext(), yyline, yycolumn);}  
    "/"                                     { return symbol(sym.DIV, yytext(), yyline, yycolumn);}  
    "%"                                     { return symbol(sym.MODULO, yytext(), yyline, yycolumn);} 
    "^"                                     { return symbol(sym.POT, yytext(), yyline, yycolumn);} 

// OPERADORES RELACIONALES
    //"=="                                     { return symbol(sym.IGUALIGUAL, yytext(), yyline, yycolumn);} 
    "!="                                     { return symbol(sym.NOIGUAL, yytext(), yyline, yycolumn);} 
    ">"                                      { return symbol(sym.MAYOR, yytext(), yyline, yycolumn);} 
    "<"                                      { return symbol(sym.MENOR, yytext(), yyline, yycolumn);} 
    ">="                                     { return symbol(sym.MAYORIGUAL, yytext(), yyline, yycolumn);} 
    "<="                                     { return symbol(sym.MENORIGUAL, yytext(), yyline, yycolumn);} 
    "!!"                                     { return symbol(sym.ESNULO, yytext(), yyline, yycolumn);} 
    "="                                      { return symbol(sym.IGUAL, yytext(), yyline, yycolumn);}


//  OPERADORES LOGICOS
    "&&"                                    { return symbol(sym.AND, yytext(), yyline, yycolumn);} 
    "!&&"                                   { System.out.println( "NAND"+ yytext()); return symbol(sym.NAND, yytext(), yyline, yycolumn);} 
    "!||"                                   { System.out.println( "NOR"+ yytext()); return symbol(sym.NOR, yytext(), yyline, yycolumn);} 
    "&|"                                    { System.out.println( "XOR"+ yytext());return symbol(sym.XOR, yytext(), yyline, yycolumn);} 
    "!"                                     { return symbol(sym.NOT, yytext(), yyline, yycolumn);} 

// SIGNOS
    ";"                                     { return symbol(sym.PUNTOYCOMA, yytext(), yyline+1, yycolumn+1);} 
    ","                                     { return symbol(sym.COMA, yytext(), yyline, yycolumn);} 
//SALTOS DE LINEA Y TAB

    (\n)+                                    { System.out.println( " LN "+ yytext()); return symbol(sym.LN, yytext(), yyline, yycolumn);} 
    (\t)                                     { System.out.println( "TAB"+ yytext()); return symbol(sym.TAB, yytext(), yyline, yycolumn);} 
// caracteres de escape
    (\r|\r\n)+ {/*IGNORAR*/}
    
    .                                       {System.out.println( "Caracter no reconocido: "+ yytext());}
}
