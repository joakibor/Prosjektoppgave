package no.uio.ifi.asp.parser;
import no.uio.ifi.asp.main.*;
import no.uio.ifi.asp.runtime.RuntimeReturnValue;
import no.uio.ifi.asp.runtime.RuntimeScope;
import no.uio.ifi.asp.runtime.RuntimeValue;
import no.uio.ifi.asp.scanner.Scanner;
import java.util.ArrayList;

import static no.uio.ifi.asp.scanner.TokenKind.*;

public class AspProgram extends AspSyntax {
    //-- Must be changed in part 2:
    ArrayList<AspStmt> stmts = new ArrayList<>();

    AspProgram(int n) {
	super(n);
    }
    


    public static AspProgram parse(Scanner s)
	{
		Main.log.enterParser("program");
	
		AspProgram ap = new AspProgram(s.curLineNum());
		
		while (s.curToken().kind != eofToken)
			ap.stmts.add(AspStmt.parse(s));
		
		Main.log.leaveParser("program");
		return ap;
    }


    @Override
    public void prettyPrint() {
	//-- Must be changed in part 2:
    }


    @Override
    public RuntimeValue eval(RuntimeScope curScope) throws RuntimeReturnValue
	{
	//-- Must be changed in part 4:
	return null;
    }
}
