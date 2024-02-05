/*
Añadir EN ESTE ORDEN:
- Literales reales: 3.15, 78.23, ... (parte entera obligatoria/parte decimal OPCIONAL)
- Operadores aritméticos y otros simbolos:  + - * / . : = ; [ ] ( ) { } < >
- Palabras reservadas: if, while, read, print, int y float
*/

package lexer;

import java.io.*;

public class Lexico {
	// FINAL
	public static final int END = 0;

	// TIPOS
	public static final int LITENT = 256;
	public static final int IDENT = 257;
	public static final int LITREAL = 258;

	// PALABRAS RESERVADAS
	public static final int IF = 300;
	public static final int WHILE = 301;
	public static final int READ = 302;
	public static final int PRINT = 303;
	public static final int INT = 304;
	public static final int FLOAT = 305;

	private Reader input;
	private int currentChar;

	public Lexico(Reader reader) throws IOException {
		input = reader;
		readNext();
	}

	// Funciones auxiliares -------------------------------
	private int readNext() throws IOException {
		currentChar = input.read();
		return currentChar;
	}

	private int getChar() throws IOException {
		return currentChar;
	}
	
	// Aquí empieza el Analizador Léxico ------------------
	public Token nextToken() throws IOException {

		while (true) {
			while (Character.isWhitespace(getChar()))
				readNext();

			if (getChar() == -1)
				return new Token(END, null);

			if(!Character.isDigit(getChar()) && !Character.isLetter(getChar())){
				int tmp = getChar();
				readNext();
				return new Token(tmp, String.valueOf((char) tmp));
			}

			if (Character.isDigit(getChar())) {
				boolean pto = false;
				StringBuffer buffer = new StringBuffer();
				buffer.append((char) getChar());
				while (Character.isDigit(readNext()) || (getChar() == '.' && pto == false)) {
					if (getChar() == '.')
						pto = true;
					buffer.append((char) getChar());
				}
				return pto ? new Token(LITREAL, buffer.toString()) : new Token(LITENT, buffer.toString());
			}


			if (Character.isLetter(getChar())) {
				StringBuffer buffer = new StringBuffer();
				buffer.append((char) getChar());
				while (Character.isLetterOrDigit(readNext()))
					buffer.append((char) getChar());

				if (buffer.toString().toLowerCase().equals("if"))
					return new Token(IF, buffer.toString());
				else if (buffer.toString().toLowerCase().equals("while"))
					return new Token(WHILE, buffer.toString());
				else if (buffer.toString().toLowerCase().equals("read"))
					return new Token(READ, buffer.toString());
				else if (buffer.toString().toLowerCase().equals("print"))
					return new Token(PRINT, buffer.toString());
				else if (buffer.toString().toLowerCase().equals("int"))
					return new Token(INT, buffer.toString());
				else if (buffer.toString().toLowerCase().equals("float"))
					return new Token(FLOAT, buffer.toString());
				else
					return new Token(IDENT, buffer.toString());

			}

			System.out.println("Error léxico: " + (char) getChar());
			readNext();
		}
	}
}
