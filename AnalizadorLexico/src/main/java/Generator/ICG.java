package Generator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ICG {
    private List<String> intermediateCode;
    private HashMap<String, String> variableMap;

    public ICG() {
        this.intermediateCode = new ArrayList<>();
        this.variableMap = new HashMap<>();
    }

    public void generateAssignment(String var, String value) {
        variableMap.put(var, value);
        intermediateCode.add(var + " = " + value);
    }

    public void generateAddition(String left, String right, String result) {
        String leftVal = variableMap.getOrDefault(left, left);
        String rightVal = variableMap.getOrDefault(right, right);
        intermediateCode.add(result + " = " + leftVal + " + " + rightVal);
    }

    public void generateSubtraction(String left, String right, String result) {
        String leftVal = variableMap.getOrDefault(left, left);
        String rightVal = variableMap.getOrDefault(right, right);
        intermediateCode.add(result + " = " + leftVal + " - " + rightVal);
    }

    public List<String> getIntermediateCode() {
        return intermediateCode;
    }
}

