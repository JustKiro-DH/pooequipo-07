# EcoCampus Circular — Proyecto de Programación Orientada a Objetos

Sistema de sostenibilidad universitaria desarrollado en Java como proyecto del curso de
Programación Orientada a Objetos (Universidad EIA). Modela la gestión de campañas
ambientales, recolección de materiales, rutas de recolección y un sistema de EcoPuntos
para incentivar la participación de la comunidad universitaria.

## Estructura del repositorio

```
POO_Proyecto/
├── Proyecto Maven/              Proyecto Java (Eclipse, JavaSE-21)
│   └── src/ecoCampusCircular/   Código fuente
├── Informe_E1.pdf               Informe de la entrega 1
├── Diagrama_Clases_E1.pdf       Diagrama de clases
├── Diagrama_Objetos_E1.pdf      Diagrama de objetos
├── Matriz_Contribuciones_E1.pdf Matriz de contribuciones del equipo
└── README_E1.txt                README original de la entrega
```

## Modelo de clases

| Clase | Rol |
|---|---|
| `Persona` (abstracta) | Base de los actores del sistema: id, nombre, correo |
| `Estudiante`, `Operador`, `ResponsableSostenibilidad` | Especializaciones de `Persona` |
| `Campana`, `Actividad`, `Participacion` | Campañas ambientales y participación en ellas |
| `EcoPuntos`, `MovimientoEcoPuntos` | Sistema de puntos e historial de movimientos |
| `Material`, `PuntoEcologico`, `Recoleccion` | Materiales reciclables y su recolección |
| `Ruta`, `Parada` | Rutas de recolección y sus paradas |
| `Reporte`, `Notificador` | Reportes de incidencias y notificaciones |
| `Main` | Clase de pruebas: crea objetos y ejecuta los métodos principales |

## Cómo importar el proyecto en Eclipse

1. Clonar el repositorio.
2. En Eclipse: `File > Import > General > Existing Projects into Workspace`.
3. Seleccionar la carpeta `Proyecto Maven` como raíz del proyecto.
4. Verificar que los archivos `.java` queden bajo `src/ecoCampusCircular`.

## Cómo ejecutar

1. Abrir `Main.java`.
2. Ejecutar el método `main`.
3. Los resultados de las pruebas se muestran directamente en la consola.

## Pruebas

Las pruebas están en la clase `Main.java`, donde se crean objetos de las diferentes
clases y se ejecutan los métodos principales del sistema:

- Creación de estudiantes, operadores y responsables.
- Creación de campañas y actividades.
- Registro de participaciones.
- Manejo de EcoPuntos y movimientos.
- Creación de materiales y puntos ecológicos.
- Creación de recolecciones.
- Creación de rutas y paradas.
- Creación, asignación y cierre de reportes.

La capacidad de los arreglos se define al momento de crear los objetos. En los datos de
prueba de `Main.java` los arreglos no se llenan por completo: el sistema controla la
cantidad de elementos almacenados mediante variables como `cantidadActividades`,
`cantidadParticipaciones`, `cantidadMateriales`, `cantidadMovimientos` y `cantidadParadas`.

## Requisitos

- JDK 21 (el proyecto está configurado con `JavaSE-21`).
- Eclipse IDE (o cualquier IDE con soporte para proyectos Java).
