package ecoCampusCircular;

public class Main {

public static void main(String[] args) {

    System.out.println("SISTEMA DE SOSTENIBILIDAD UNIVERSITARIA");

    System.out.println("\nPERSONAS:\n");
    Estudiante estudiante = new Estudiante(
            "E001",
            "Nicolas",
            "nicolas@universidad.edu",
            "Ingenieria de Sistemas"
    );

    Operador operador = new Operador(
            "O001",
            "Carlos",
            "carlos@universidad.edu",
            true
    );

    ResponsableSostenibilidad responsable = new ResponsableSostenibilidad(
                    "R001",
                    "Laura",
                    "laura@universidad.edu",
                    "Gestion Ambiental"
            );

    System.out.println("Estudiante: " + estudiante.getNombre());
    System.out.println("Programa: " + estudiante.getPrograma());
    System.out.println("Operador: " + operador.getNombre());
    System.out.println("Operador disponible: " + operador.isDisponible());
    System.out.println("Responsable: " + responsable.getNombre());
    System.out.println("Area: " + responsable.getArea());

//-----------------------------------------------------------------------------------------
    
    System.out.println("\nACCIONES DE LAS PERSONAS:\n");

    Persona persona1 = estudiante;
    Persona persona2 = operador;
    Persona persona3 = responsable;

    persona1.realizarAccion();
    persona2.realizarAccion();
    persona3.realizarAccion();

//-----------------------------------------------------------------------------------------

    System.out.println("\nMATERIALES:\n");

    Material plastico = new Material(
            "M001",
            "Botella plastica",
            "Plastico"
    );

    Material papel = new Material(
            "M002",
            "Papel",
            "Papel"
    );

    Material bateria = new Material(
            "M003",
            "Bateria",
            "Electronico",
            true
    );

    System.out.println("Material: " + plastico.getNombre());
    System.out.println("Tipo: " + plastico.getTipo());
    System.out.println("¿Es especial?: " + plastico.esMaterialEspecial());
    System.out.println("Material: " + bateria.getNombre());
    System.out.println("¿Es especial?: " + bateria.esMaterialEspecial());

//-----------------------------------------------------------------------------------------
    
    System.out.println("\nPUNTO ECOLOGICO:\n");

    PuntoEcologico punto = new PuntoEcologico(
            "PE001",
            "Bloque A",
            500,
            5
    );

    System.out.println("Punto ecologico activo: " + punto.estaActivo());
    System.out.println("Agregar plastico: " + punto.agregarMaterial(plastico));
    System.out.println("Agregar papel: " + punto.agregarMaterial(papel));

    punto.desactivar();

    System.out.println("Punto ecologico activo despues de desactivar: " + punto.estaActivo());
    System.out.println("Intentar agregar bateria con punto inactivo: " + punto.agregarMaterial(bateria));

    punto.activar();

    System.out.println("Punto ecologico activo nuevamente: " + punto.estaActivo());

//-----------------------------------------------------------------------------------------

    System.out.println("\nCAMPANA Y ACTIVIDADES:\n");

    Campana campana = new Campana(
            "C001",
            "Reciclaton Universitaria",
            "Campana de recoleccion de residuos",
            "01/09/2026",
            "30/09/2026",
            30,
            5,
            10
    );

    Actividad actividad1 = new Actividad(
            "A001",
            "Jornada de reciclaje",
            "Recoleccion de materiales reciclables",
            "05/09/2026",
            15
    );

    Actividad actividad2 = new Actividad(
            "A002",
            "Charla ambiental",
            "Charla sobre manejo de residuos",
            "10/09/2026",
            20
    );

    System.out.println("Campana: " + campana.getNombre());
    System.out.println("Agregar actividad 1: " + campana.agregarActividad(actividad1));
    System.out.println("Agregar actividad 2: " + campana.agregarActividad(actividad2));
    System.out.println("Cupo disponible en actividad 1: " + actividad1.tieneCupo());
    System.out.println("Ocupar cupo actividad 1: " + actividad1.ocuparCupo());
    System.out.println("Cupo restante actividad 1: " + actividad1.getCupo());

  //-----------------------------------------------------------------------------------------

    System.out.println("\nPARTICIPACION:\n");

    System.out.println("Cupo disponible en campaña: " + campana.tieneCupo());

    boolean participacionRegistrada = estudiante.participarCampana(
                    campana,
                    "P001",
                    "01/09/2026"
            );

    System.out.println("Participacion registrada: " + participacionRegistrada);
    System.out.println("Cupo disponible despues del registro: " + campana.tieneCupo());

    Participacion participacion = new Participacion(
            "P002",
            "02/09/2026",
            estudiante,
            campana
    );

    System.out.println("Estado inicial de participacion: " + participacion.getEstado());

    participacion.confirmarParticipacion();

    System.out.println("Estado despues de confirmar: " + participacion.getEstado());
    System.out.println("¿Esta activa?: " + participacion.estaActivo());

    participacion.cancelarParticipacion();

    System.out.println("Estado despues de cancelar: " + participacion.getEstado());

//-----------------------------------------------------------------------------------------

    System.out.println("\nECOPUNTOS:\n");

    EcoPuntos ecoPuntos = estudiante.getEcoPuntos();

    System.out.println("Saldo inicial: " + ecoPuntos.getSaldo());
    System.out.println("Sumar 50 puntos: " + ecoPuntos.sumarPuntos(50, "Participacion en campaña", "05/09/2026"));
    System.out.println("Saldo despues del ingreso: " + ecoPuntos.getSaldo());
    System.out.println("¿Tiene saldo para gastar 20 puntos?: " + ecoPuntos.tieneSaldo(20));
    System.out.println("Restar 20 puntos: " + ecoPuntos.restarPuntos(20, "Canje de beneficio", "06/09/2026"));
    System.out.println("Saldo final: " + ecoPuntos.getSaldo());
    
//-----------------------------------------------------------------------------------------
    
    System.out.println("\nRECOLECCION:\n");

    Recoleccion recoleccion = new Recoleccion(
            "REC001",
            "05/09/2026",
            "Recoleccion de materiales reciclables",
            25.5,
            5
    );

    System.out.println("Agregar plastico: " + recoleccion.agregarMaterial(plastico));
    System.out.println("Agregar bateria: " + recoleccion.agregarMaterial(bateria));
    System.out.println("Cantidad de materiales: " + recoleccion.getCantidadMateriales());
    System.out.println("Peso total: " + recoleccion.calcularPesoTotal());
    System.out.println("¿Peso valido?: " + recoleccion.pesoValido());
    System.out.println("¿Contiene material especial?: " + recoleccion.contieneMaterialEspecial());

//-----------------------------------------------------------------------------------------

    System.out.println("\nOPERADOR Y RECOLECCION:\n");
    System.out.println("¿Operador habilitado para residuos especiales?: " + operador.isHabilitadoResiduosEspeciales());
    System.out.println("Realizar recoleccion: " + operador.realizarRecoleccion(recoleccion));

    operador.cambiarDisponibilidad();

    System.out.println("Disponibilidad despues de cambiar: " + operador.isDisponible());
    System.out.println("Intentar otra recoleccion estando ocupado: " + operador.realizarRecoleccion(recoleccion));

    operador.cambiarDisponibilidad();

//-----------------------------------------------------------------------------------------

    System.out.println("\nRUTA Y PARADAS:\n");

    Ruta ruta = new Ruta(
            1,
            "05/09/2026",
            5
    );

    Parada parada1 = new Parada(
            1,
            "Recolectar materiales"
    );

    Parada parada2 = new Parada(
            2,
            "Transportar materiales"
    );

    Parada parada3 = new Parada(
            3,
            "Entregar materiales"
    );

    System.out.println("Agregar parada 1: " + ruta.agregarParada(parada1));
    System.out.println("Agregar parada 2: " + ruta.agregarParada(parada2));
    System.out.println("Agregar parada 3: " + ruta.agregarParada(parada3));
    System.out.println("Parada 1 - orden: " + parada1.getOrden());
    System.out.println("Parada 1 - accion: " + parada1.getAccionEsperada());

    parada1.setAccionEsperada("Recolectar materiales reciclables");

    System.out.println("Nueva accion de parada 1: " + parada1.getAccionEsperada());
    System.out.println("¿Ruta cerrada?: " + ruta.estaCerrada());

    ruta.cerrarRuta();

    System.out.println("¿Ruta cerrada despues de cerrar?: " + ruta.estaCerrada());

//-----------------------------------------------------------------------------------------
    
    System.out.println("\nREPORTE:\n");

    Reporte reporte = new Reporte(
            "REP001",
            "05/09/2026",
            "Reporte de jornada de reciclaje"
    );

    System.out.println("¿Puede cerrar el reporte?: " + reporte.puedeCerrar());

    Ruta rutaReporte = new Ruta(
            2,
            "06/09/2026",
            5
    );

    responsable.asignarReporte(reporte, operador);
    responsable.asignarReporte(reporte,rutaReporte);

    System.out.println("¿Puede cerrar el reporte despues de asignar "+ "operador y ruta?: " + reporte.puedeCerrar());
    System.out.println("Cerrar reporte: " + reporte.cerrarReporte());
    System.out.println("¿Reporte cerrado?: " + reporte.estaCerrado());

//-----------------------------------------------------------------------------------------
    
    System.out.println("\nNOTIFICADOR:\n");

    Notificador notificador = new Notificador();

    notificador.notificar("La jornada de sostenibilidad ha finalizado correctamente.");

  //-----------------------------------------------------------------------------------------

    System.out.println("\nCIERRE DE CAMPAÑA:\n");
    
    System.out.println("¿Campaña cerrada?: " + campana.estaCerrada());

    campana.cerrarCampana();

    System.out.println("¿Campaña cerrada despues de cerrar?: " + campana.estaCerrada());
    System.out.println("Intentar agregar actividad despues de cerrar: " + campana.agregarActividad(new Actividad("A003", "Nueva actividad", "Actividad de prueba", "15/09/2026", 10)));

	}
}
