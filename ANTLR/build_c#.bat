@echo off
SET CLASSPATH=.;C:\PATH\antlr-4.7.1-complete.jar;%CLASSPATH%


echo ==============================
echo LEXER: 
java org.antlr.v4.Tool %* MurMurLexer.g4
if %errorlevel% neq 0 exit /b %errorlevel%
echo ==============================
echo PARSER: 
java org.antlr.v4.Tool %* MurMurParser.g4
if %errorlevel% neq 0 exit /b %errorlevel%

echo ==============================
echo COMPILING:
javac MurMur*.java
if %errorlevel% neq 0 exit /b %errorlevel%

echo ==============================
echo BUILDING C#, LET'S GO!
java -jar antlr-4.7.1-complete.jar -Dlanguage=CSharp MurMurParser.g4 -visitor
java -jar antlr-4.7.1-complete.jar -Dlanguage=CSharp MurMurLexer.g4 -visitor

echo DONE ;)

