package type_table;

import java.util.HashMap;
import java.util.ArrayList;
import type_table.ValidateTypes;

public class TypeTable {

    String currentHash;
    HashMap<String, ArrayList<String>> typeTable = new HashMap<String, ArrayList<String>>(); // String = Identificador
                                            // String = {main/funcion/variable:identificador:tipoRetorno}
                                            // Primer ítem del segundo String es de función,
                                            // los otros son de variables


    public TypeTable() {
        System.out.println("Iniciando TypeTable");
    }

    public void addTable(String tipoRetorno, String identificador) {
        // Verificar redefinición (PUEDE SER QUE SE TENGA QUE BORRAR)
        if (typeTable.containsKey(identificador)) {
            ArrayList<String> infoTabla = new ArrayList<String>();
            String infoFuncion = "error:redefinicion";
            infoTabla.add(infoFuncion);
            typeTable.put(identificador, infoTabla);
            return ;
        }

        // Asignar la categoría de función
        String tipoFuncion;
        if (identificador.equals("_verano_"))
            tipoFuncion = "main";
        else
            tipoFuncion = "funcion";

        // Guardar currentHash
        currentHash = identificador;

        // Información de tabla
        ArrayList<String> infoTabla = new ArrayList<String>();
        String infoFuncion= tipoFuncion + ":" + identificador + ":" + tipoRetorno;
        infoTabla.add(infoFuncion);
        typeTable.put(currentHash, infoTabla);
    }

    public void addRow(String tipoRetorno, String identificador) {
        // Información de variable
        String infoRow = "variable" + ":" + identificador + ":" + tipoRetorno;
        ArrayList<String> infoTabla = typeTable.get(currentHash);
        infoTabla.add(infoRow);
    }

    public String getTableType(String identificador) {
        for (HashMap.Entry<String, ArrayList<String>> entry : typeTable.entrySet()) {

            // Obtiene los valores
            ArrayList<String> row = entry.getValue();

            String[] rowInfo = row.get(0).split(":"); // Ve sobre el primero de cada uno para obtener el tipo

            // Reconocer si el identificador existe
            if (rowInfo[1].equals(identificador)) {
                return rowInfo[2];
            }
        }
        return "null";
    }


    public String getRowType(String hash,String identificador) {
        ArrayList<String> infoTabla = typeTable.get(hash);
        for (String row : infoTabla) {
            String[] rowInfo = row.split(":");
            if (rowInfo[1].equals(identificador)) {
                return rowInfo[2];
            }
        }
        return "null";
    }

    public String getRowTypeCurrentHash(String identificador) {
        ArrayList<String> infoTabla = typeTable.get(currentHash);
        for (String row : infoTabla) {
            String[] rowInfo = row.split(":");
            if (rowInfo[1].equals(identificador)) {
                return rowInfo[2];
            }
        }
        return "null";
    }

    public String toString(){
        String res = "";
        for(String s : typeTable.keySet()){
            res += s + "\t" + typeTable.get(s) + "\n";
        }
        return res;
    }
}
