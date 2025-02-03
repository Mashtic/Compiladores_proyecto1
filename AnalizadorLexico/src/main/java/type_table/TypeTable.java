package type_table;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import type_table.ValidateTypes;

public class TypeTable {
    
    String currentHash = null;
    HashMap<String, ArrayList<String>> typeTable = new HashMap<String, ArrayList<String>>(); // String = Identificador
                                            // String = {main/funcion/variable:identificador:tipoRetorno}
                                            // Primer ítem del segundo String es de función,
                                            // los otros son de variables


    public TypeTable() {
        System.out.println("Iniciando TypeTable");
    }

    public void addTable(String tipoRetorno, String identificador, String parametros) {
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
        String infoFuncion= tipoFuncion + ":" + identificador + ":" + tipoRetorno + ":" + parametros;
        infoTabla.add(infoFuncion);
        typeTable.put(currentHash, infoTabla);
    }

    public void addRow(String tipoRetorno, String identificador, String asignado) {
        // Información de variable
        String infoRow = "variable" + ":" + identificador + ":" + tipoRetorno + ":" + asignado;
        ArrayList<String> infoTabla = typeTable.get(currentHash);
        if (infoTabla == null) {
            System.out.println("Error: No existe una tabla para el currentHash");
            return;
        }
        infoTabla.add(infoRow);
    }

    public String getRowStatus(String identificador) {
        // Información de variable
        ArrayList<String> infoTabla = typeTable.get(currentHash);
        if (infoTabla == null) {
            System.out.println("Error: No existe una tabla para el currentHash");
            return "";
        }
        for (String row : infoTabla) {
            String[] rowInfo = row.split(":");
            if (rowInfo[1].equals(identificador)) {
                return rowInfo[3];
            }
        }
        return ValidateTypes.ERROR;
    }

    public void updateRowStatus(String identificador) {
        // Obtener la lista de filas de la tabla de tipos para el currentHash
        ArrayList<String> infoTabla = typeTable.get(currentHash);
        if (infoTabla == null) {
            System.out.println("Error: No existe una tabla para el currentHash");
            return;
        }
        if (infoTabla == null) {
            System.out.println("Error: No existe una tabla para el currentHash");
            return;
        }
        // Iterar sobre las filas para encontrar la variable específica
        for (int i = 0; i < infoTabla.size(); i++) {
            String[] rowInfo = infoTabla.get(i).split(":");

            // Verificar si el identificador coincide
            if (rowInfo[1].equals(identificador)) {
                // Actualizar el estado en la fila
                rowInfo[3] = "asignado";

                // Reconstruir la fila y actualizar la lista
                infoTabla.set(i, String.join(":", rowInfo));
                System.out.println(infoTabla.get(i));
                return;
            }
        }
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
        return ValidateTypes.ERROR;
    }

    public String getTableParamsType(String identificador) {
        for (HashMap.Entry<String, ArrayList<String>> entry : typeTable.entrySet()) {

            // Obtiene los valores
            ArrayList<String> row = entry.getValue();

            String[] rowInfo = row.get(0).split(":"); // Ve sobre el primero de cada uno para obtener el tipo

            // Reconocer si el identificador existe
            if (rowInfo[1].equals(identificador)) {
                String[] resultArray = Arrays.copyOfRange(rowInfo, 3, rowInfo.length);
                return String.join(":", resultArray);
            }
        }
        return ValidateTypes.ERROR;
    }

    public String getRowType(String hash,String identificador) {
        ArrayList<String> infoTabla = typeTable.get(hash);
        for (String row : infoTabla) {
            String[] rowInfo = row.split(":");
            if (rowInfo[1].equals(identificador)) {
                return rowInfo[2];
            }
        }
        return ValidateTypes.ERROR;
    }

    public String getTableTypeCurrentHash() {
        ArrayList<String> infoTabla = typeTable.get(currentHash);
        if (infoTabla == null) {
            System.out.println("Error: No existe una tabla para el currentHash");
            return "";
        }
        String[] rowInfo = infoTabla.get(0).split(":");
        return rowInfo[2];
    }

    public String getRowTypeCurrentHash(String identificador) {
        if (currentHash == null) {
            return "error";
        }

        ArrayList<String> infoTabla = typeTable.get(currentHash);
        for (String row : infoTabla) {
            String[] rowInfo = row.split(":");
            if (rowInfo[1].equals(identificador)) {
                return rowInfo[2];
            }
        }
        return ValidateTypes.ERROR;
    }

    public String toString(){
        String res = "\nTabla de tipos:\n";
        for(String s : typeTable.keySet()){
            res += s + "\t" + typeTable.get(s) + "\n";
        }
        return res;
    }
}
