echo off
SET CLASSPATH=.;C:\PATH\antlr-4.7.1-complete.jar;%CLASSPATH%


echo ==============================
echo LEXER: 
java org.antlr.v4.Tool %* ../MurMurLexer.g4
if %errorlevel% neq 0 exit /b %errorlevel%
echo ==============================
echo PARSER: 
java org.antlr.v4.Tool %* ../MurMurLexer.g4
if %errorlevel% neq 0 exit /b %errorlevel%

echo ==============================
echo COMPILING:
javac MurMur*.java
if %errorlevel% neq 0 exit /b %errorlevel%

echo ==============================
echo TESTING: 
java org.antlr.v4.gui.TestRig %* MurMur murmur hello.mur -tokens -gui