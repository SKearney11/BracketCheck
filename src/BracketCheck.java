import java.util.Scanner;
import java.util.Stack;

/*
 * Checks if brackets are balanced in code
 * checks for (, [, {
 * put code into the expression string run the program and results will be printed in the console
 * by Sean Kearney
 */
public class BracketCheck {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Stack  <Character> charStack = new Stack <Character> ();
		
		boolean isBalanced = true;
		int index = 0;
		char nextCharacter = ' ';
		String expression = "(()){}";
		int characterCount = expression.length ();
		nextCharacter = expression.charAt (index);

			while (isBalanced && index < characterCount)
			{
				nextCharacter = expression.charAt (index);
				switch (nextCharacter)
	            {
	                case '(':
	                case '[':
	                case '{':
	                    charStack.push (nextCharacter);
	                    break;
	                case ')':
	                case ']':
	                case '}':
	                	isBalanced = isPaired (charStack.pop(),expression.charAt (index));
                    }
				index++;
		}
			 if (charStack.isEmpty ())
             {
         		isBalanced = true;
         		System.out.println("balanced");
             }
			 else 
			 {
				 System.out.println("not balanced");
			 }
	}
	
	private static boolean isPaired (char open, char close)
    {
        return ((open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}'));
        
    }
}