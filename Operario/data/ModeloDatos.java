package data;

import java.util.HashMap;
import logica.Operador;

public class ModeloDatos {

    private HashMap<String, Operador> operadores;

    public ModeloDatos() {
        operadores = new HashMap<>();
    }

    public String registrarOperador(Operador op) {

        if (!operadores.containsKey(op.getDocumento())) {

            operadores.put(op.getDocumento(), op);
            return "si";

        }

        return "no";
    }

    public Operador buscarOperador(String documento) {

        if (operadores.containsKey(documento)) {
            return operadores.get(documento);
        }

        return null;
    }

    public void mostrarLista() {

        System.out.println("OPERADORES REGISTRADOS");
        System.out.println(operadores);
    }
}