package tokens;

import java.util.HashMap;

public class SymbolTable {
    private static class SymbolInfo {
        String type;
        int line;
        int column;
        Object value;

        public SymbolInfo(String type, int line, int column, Object value) {
            this.type = type;
            this.line = line;
            this.column = column;
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("%-15s %-10d %-10d %-10s", type, line, column, value != null ? value : "null");
        }
    }

    private final HashMap<String, SymbolInfo> table;

    public SymbolTable() {
        this.table = new HashMap<>();
    }

    public void addSymbol(String name, String type, int line, int column, Object value) {
        if (!table.containsKey(name)) {
            table.put(name, new SymbolInfo(type, line, column, value));
        } else {
            System.out.println("Warning: El símbolo '" + name + "' ya existe en la tabla.");
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
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n", "Nombre", "Tipo", "Línea", "Columna", "Valor");
        System.out.println("----------------------------------------------------------");
        for (var entry : table.entrySet()) {
            System.out.printf("%-15s %s\n", entry.getKey(), entry.getValue());
        }
    }
}
