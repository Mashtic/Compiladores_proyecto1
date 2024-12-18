package tokens;

import java.util.ArrayList;
import java.lang.String;

public class TokenTable {

    ArrayList<Token> tokens ;

    public TokenTable() {
        this.tokens = new ArrayList<>();
    }

    public void addToken(Token token) {
        this.tokens.add(token);
    }

    public void showTokens() {
        for (int i = 0; i < tokens.size(); i++) {
            System.out.println(tokens.get(i).toString());
        }
    }

    public String toString() {
        String table = "";
        for (int i = 0; i < tokens.size(); i++) {
            table += tokens.get(i).toString();
            if (i != tokens.size()-1)
                table += "\n";
        }
        return table;
    }
}
