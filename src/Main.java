//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    BrigadaMedica brigadamedica1 = new BrigadaMedica("Equipo Alpha");
    BrigadaTecnica brigadatecnica1 = new BrigadaTecnica("Equipo Beta");
    DronRescate dronrescate1 = new DronRescate("Equipo Charlie");

    brigadamedica1.mostrarNombre();
    brigadamedica1.atenderEmergencia();


    brigadatecnica1.mostrarNombre();
    brigadatecnica1.atenderEmergencia();

    dronrescate1.mostrarNombre();
    dronrescate1.atenderEmergencia();


    DronRescate dron = new DronRescate("Dron de Rescate");
    BrigadaTecnica tecnica = new BrigadaTecnica("Brigada Técnica");


    dron.volar();
    tecnica.reparar();

    dron.atenderEmergencia();
    tecnica.atenderEmergencia();
}
