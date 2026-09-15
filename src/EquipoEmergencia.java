public abstract class EquipoEmergencia {

    private String nombre;

    public EquipoEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre(){
        System.out.println("Equipo de emergencia...");
    }

    public abstract void atenderEmergencia();
}
