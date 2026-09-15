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


    EquipoEmergencia equipo1 = new BrigadaMedica("Brigada Médica");

    EquipoEmergencia equipo2 = new BrigadaTecnica("Brigada Técnica");

    EquipoEmergencia equipo3 = new DronRescate("Dron de Rescate");

    equipo1.atenderEmergencia();
    equipo2.atenderEmergencia();
    equipo3.atenderEmergencia();

    Volador volador = new DronRescate("Dron Aéreo");

    volador.volar();

    Reparador reparador = new BrigadaTecnica("Equipo Técnico");

    reparador.reparar();
}
