public class DronRescate extends EquipoEmergencia implements Volador{


    public DronRescate(String nombre) {
        super(nombre);
    }

    @Override
    public void atenderEmergencia(){
        System.out.println("Inspeccionando zona de emergencia...");
    }

    @Override
    public void volar(){
        System.out.println("En accion de vuelo...");
    }

}
