public class BrigadaTecnica extends EquipoEmergencia implements Reparador{

    public BrigadaTecnica(String nombre) {
        super(nombre);
    }

    @Override
    public void atenderEmergencia(){
        System.out.println("Revisando infraestructura dañada...");
    }

    @Override
    public void reparar(){
        System.out.println("Proceso de reparacion..");
    }
}
