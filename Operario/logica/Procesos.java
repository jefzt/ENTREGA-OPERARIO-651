package logica;

public class Procesos {

    public void calcularSueldoNuevo(Operador op) {

        double porcentaje;

        if (op.getSueldo() < 500) {

            if (op.getAntiguedad() >= 10) {
                porcentaje = 0.20;
            } else {
                porcentaje = 0.05;
            }

        } else {
            porcentaje = 0;
        }

        double aumento = op.getSueldo() * porcentaje;
        double nuevo = op.getSueldo() + aumento;

        op.setSueldoNuevo(nuevo);
        op.setAumento(porcentaje * 100);
    }
}