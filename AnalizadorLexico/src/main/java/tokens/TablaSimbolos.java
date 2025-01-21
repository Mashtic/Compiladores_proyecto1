package tokens;
import java.util.HashMap;
public class TablaSimbolos {

    private static class SymbolInfo {
        String type;
        String scope;
        Object value;

        public SymbolInfo(String type, String scope, Object value) {
            this.type = type;
            this.scope = scope;
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("%-15s %-10s %-10s", type, scope, value != null ? value : "null");
        }
    }
    private final HashMap<String, SymbolInfo> table;

    public TablaSimbolos() {
        this.table = new HashMap<>();
    }

    public void addSymbol(String name, String type, String scope, Object value) {
        if (table.containsKey(name)) {
            if (table.get(name).value != null) {
                table.get(name).value = value;
            }
            System.out.println("Error: Symbol " + name + " already exists in scope " + scope);
        } else {
            table.put(name, new SymbolInfo(type, scope, value));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tabla de Símbolos:\n");
        sb.append(String.format("%-15s %-10s %-10s %-10s %-10s\n", "Nombre", "Tipo", "Línea", "Columna", "Valor"));
        sb.append("----------------------------------------------------------\n");
        for (var entry : table.entrySet()) {
            sb.append(String.format("%-15s %s\n", entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }

    public void display() {
        System.out.println("Tabla de Símbolos:");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Nombre", "Tipo", "Alcance", "Valor");
        System.out.println("----------------------------------------------------");
        for (var entry : table.entrySet()) {
            System.out.printf("%-15s %s\n", entry.getKey(), entry.getValue());
        }
    }
}
