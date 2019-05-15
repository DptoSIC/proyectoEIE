SISTEMA DE GESTIÓN DE PROYECTOS

**ESPECIFICACIÓN DE REQUISITOS SOFTWARE**

Equipo 2:

ALUMNO. Raúl Gallego Sanjuán

ALUMNO. María del Carmen del Cerro de la Cruz

ALUMNO. Patricio Lestón Valbuena

**Historial de Revisiones ERS**

| **Fecha**  | **Revisión** | **Estado**  | **Descripción**                                |
|------------|--------------|-------------|------------------------------------------------|
| 08/05/2019 | 1.0          | Elaboración | Inicio de la confección del presente documento |
| 17/05/2019 | 1.0          | Revisado    | Se estudia el documento con el cliente.        |
|            |              |             |                                                |
|            |              |             |                                                |
|            |              |             |                                                |
|            |              |             |                                                |
|            |              |             |                                                |
|            |              |             |                                                |

Documento validado y aprobado por las partes en fecha: 17/05/2019

| Por la Academia de Ingenieros del Ejército de Tierra | VºBº Tutor del Proyecto           | Por el Jefe de Proyecto   |
|------------------------------------------------------|-----------------------------------|---------------------------|
|                                                      |                                   |                           |
| Fdo. Juan Manuel García Rodríguez                    | Fdo. Juan Manuel García Rodríguez | Fdo. Raúl Gallego Sanjuán |

INDICE

[ERS 1.- DEFINICIÓN DEL SISTEMA 4](#ers-1.--definición-del-sistema)

[ERS 1.1.- DETERMINACIÓN DEL ALCANCE DEL SISTEMA
](#ers-1.1.--determinación-del-alcance-del-sistema)

[ERS 1.2.- GLOSARIO DE TÉRMINOS Y ABREVIATURAS
](#ers-1.2.--glosario-de-términos-y-abreviaturas)

[ERS 1.3.- MODELO DE NEGOCIO ](#ers-1.3.--modelo-de-negocio)

[ERS 1.4.- MODELO DE DOMINIO ](#ers-1.4.--modelo-de-dominio)

[ERS 1.5.- IDENTIFICACIÓN DEL ENTORNO TECNOLÓGICO
](#ers-1.5.--identificación-del-entorno-tecnológico)

[ERS 1.6.- ESPECIFICACIÓN DE ESTÁNDARES Y NORMAS
](#ers-1.6.--especificación-de-estándares-y-normas)

[ERS 2.- CATÁLOGO DE REQUISITOS ](#ers-2.--catálogo-de-requisitos)

[ERS 2.1.- REQUISITOS CATEGORIZADOS. ](#ers-2.1.--requisitos-categorizados.)

[ERS 2.2.- IDENTIFICACIÓN DE USUARIOS PARTICIPANTES Y FINALES
](#ers-2.2.--identificación-de-usuarios-participantes-y-finales)

[ERS 2.2.1.- CATÁLOGO DE USUARIOS ](#ers-2.2.1.--catálogo-de-usuarios)

[ERS 2.2.2.- PLANIFICACIÓN ](#ers-2.2.2.--planificación)

[ERS 2.3 ESTABLECIMIENTO DE REQUISITOS:
](#ers-2.3-establecimiento-de-requisitos)

[ERS 2.3.1.- OBTENCIÓN DE REQUISITOS ](#ers-2.3.1.--obtención-de-requisitos)

[ERS 2.3.2.- INTERFACES DE USUARIO ](#ers-2.3.2.--interfaces-de-usuario)

[ERS 2.3.3.- INTERFACES DE HARDWARE ](#ers-2.3.3.--interfaces-de-hardware)

[ERS 2.3.4.- INTERFACES DE SOFTWARE ](#ers-2.3.4.--interfaces-de-software)

[ERS 2.3.5.- INTERFACES DE COMUNICACIONES
](#ers-2.3.5.--interfaces-de-comunicaciones)

[ERS 2.4.- REQUISITOS FUNCIONALES ](#ers-2.4.--requisitos-funcionales)

[ERS 2.5.- REQUISITOS NO FUNCIONALES ](#ers-2.5.--requisitos-no-funcionales)

[ERS 2.5.1.- REQUISITOS DE RENDIMIENTO
](#ers-2.5.1.--requisitos-de-rendimiento)

[ERS 2.5.2.- REQUISITOS DE SEGURIDAD ](#ers-2.5.2.--requisitos-de-seguridad)

[ERS 2.5.3.- REQUISITOS DE ACCESIBILIDAD
](#ers-2.5.3.--requisitos-de-accesibilidad)

[ERS 2.5.4.- REQUISITOS DE FACILIDAD DE USO
](#ers-2.5.4.--requisitos-de-facilidad-de-uso)

[ANEXO 1: MATRIZ DE CUMPLIMIENTO DE REQUISITOS
](#anexo-1-matriz-de-cumplimiento-de-requisitos)

<br>ERS 1.- DEFINICIÓN DEL SISTEMA
==================================

ERS 1.1.- DETERMINACIÓN DEL ALCANCE DEL SISTEMA
-----------------------------------------------

**SIGEPROY**, se desarrollará como una aplicación web, desarrollada en JAVA,
siendo accesible, únicamente desde los ordenadores conectados a la Red de
Propósito General del Ministerio de Defensa (WAN-PG), con el fin de gestionar y
controlar todos los proyectos académicos que realizan los alumnos de los
distintos cursos que se imparten en la Academia de Ingenieros del Ejército de
Tierra.

Quedan dentro del alcance del sistema las siguientes operaciones:

1.  Llevar un control de los proyectos académicos, tanto de la información
    genérica del proyecto como la específica según el tipo de curso, y si pueden
    o no ser consultados o editados por los usuarios.

2.  Gestión de los usuarios que pueden acceder al sistema, indicando para cada
    uno de ellos cuál es su perfil de acceso.

3.  Control por perfiles de las acciones que puede realizar cada usuario en el
    sistema.

4.  Realizar el mantenimiento de los usuarios.

5.  Permitir la creación de nuevos proyectos a los usuarios con perfil de
    alumno/administrador, introduciendo los datos generales del proyecto y
    específicos, si los hubiera, así como subir los ficheros del proyecto a un
    repositorio de datos para ser almacenados.

6.  Se podrán consultar los proyectos del usuario logeado mediante un botón
    específico de búsqueda que muestre un histórico de sus proyectos y sus
    proyectos en curso si los tuviera.

7.  Se podrán consultar los proyectos académicos con diferentes opciones de
    búsqueda o filtro (curso, año, edición, autor, descripción), incluido
    descargar los ficheros asociados al proyecto.

8.  Permitir que un usuario con perfil de alumno pueda modificar su proyecto en
    curso, no así al usuario con perfil de visitante que sólo podrá realizar la
    consulta de los proyectos.

9.  Realizar la creación de nuevos cursos por parte del usuario administrador,
    indicando para cada uno de ellos sus características.

10. Realizar el mantenimiento de los diferentes cursos.

11. Realizar la migración de los proyectos existentes en la base de datos
    documental ProyectosEIE de Lotus Notes.

12. Realizar el cierre del proyecto al finalizar un curso por parte del usuario
    administrador.

Quedan fuera del ámbito del sistema:

1.  La integración con otros sistemas ni compartir sus datos con terceros.

ERS 1.2.- GLOSARIO DE TÉRMINOS Y ABREVIATURAS
---------------------------------------------

Se define un glosario de términos del ámbito del negocio, con el fin de
conseguir una mayor precisión en la especificación del sistema de información:

-   **ACING**: Academia de Ingenieros.

-   **PROYECTO**: conjunto de documentos y datos referentes a un trabajo
    solicitado durante la realización de un curso académico.

-   **CURSO**: tiempo señalado en cada año para el estudio de unas materias
    impartidas en un centro de enseñanza.

-   **DIM:** diploma de informática militar.

-   **PROYECTOEIE:** base de datos documental de Lotus Notes con un histórico de
    los proyectos informáticos de la antigua Escuela de Informática del
    Ejército.

-   **PERFIL USUARIO:** nivel de acceso del usuario al sistema y que determina
    el conjunto de acciones que puede realizar dentro del sistema.

-   **ATU:** arquitectura técnica unificada. Documento que dirige y coordina el
    uso de productos software en desarrollos y plataformas del Ministerio de
    Defensa.

-   **WAN-PG:** red de propósito general del Ministerio de Defensa.

-   **LOTUS NOTES:** IBM Notes es un sistema software cliente/servidor de
    colaboración y correo electrónico, desarrollado por Lotus Software, filial
    de IBM. La parte del servidor recibe el nombre Lotus Domino, mientras que el
    cliente se llama Lotus Notes.

ERS 1.3.- MODELO DE NEGOCIO
---------------------------

![Modelo de Negocio - SIGEPROY](https://github.com/DptoSIC/proyectoEIE/blob/master/ERS-ASI/Modelo%20de%20Negocio/MNEGOCIO.jpg)

<br>**ERS 1.4.- MODELO DE DOMINIO**
-----------------------------------

![Modelo de Dominio - SIGEPROY](media/813625ddf05e6a2d28b96cc6f322c48c.jpg)

ERS 1.5.- IDENTIFICACIÓN DEL ENTORNO TECNOLÓGICO
------------------------------------------------

En lo que se refiere al hardware, los usuarios, como miembros del Ministerio de
Defensa, disponen de los ordenadores necesarios para utilizar la aplicación, el
único requisito que deben cumplir es disponer de conexión a la WAN-PG.

Aquellos usuarios externos al Ministerio de Defensa deberán solicitar un acceso
físico a la WAN PG y un usuario de acceso a la WAN-PG.

En cuanto al software, durante el desarrollo de la aplicación se usará ANGULAR
programando en lenguaje JAVA, no siendo necesaria la instalación de ningún
Framework adicional de los que ya dispongan los equipos, bajo el SO Windows y
utilizando como SGDB SQL Server 2012.

ERS 1.6.- ESPECIFICACIÓN DE ESTÁNDARES Y NORMAS
-----------------------------------------------

-   Híbrido de metodologías (Metodología métrica v.3 y metodología ágil SCRUM).

-   Ley Orgánica 3/2018, de 5 de diciembre, de Protección de Datos Personales y
    garantía de los derechos digitales.

-   Ley 9/1968, de 5 de abril, sobre secretos oficiales.

ERS 2.- CATÁLOGO DE REQUISITOS
==============================

ERS 2.1.- REQUISITOS CATEGORIZADOS.
-----------------------------------

**REQUISITOS SOFTWARE**

| **REQUISITO** | **DESCRIPCIÓN**                                                                                                                                                       |
|---------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| RS1           | El email que recibe el administrador del sistema del usuario que solicita registrarse en el sistema, incluirá un texto con los datos de la solicitud del solicitante. |
| RS2           | El email que recibe el usuario por parte del administrador del sistema incluirá un texto con los datos de alta en el sistema del nuevo usuario.                       |

**REQUISITOS DE FACILIDAD DE USO**

| **REQUISITO** | **DESCRIPCIÓN**                                                                                                                                                        |
|---------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| RFU1          | Para los que lo usen por primera vez, el sistema debe proporcionar ayuda en línea con instrucciones paso a paso para guiar al usuario en las tareas que debe realizar. |

**REQUISITOS DE LA ORGANIZACIÓN**

| **REQUISITO** | **DESCRIPCIÓN**                                                                                                                                                                               |
|---------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| RO1           | Las peticiones de registro en el sistema por parte de un usuario, así como la aceptación de dicha petición por parte del administrador se generarán y enviarán de forma automática por email. |

**REQUISITOS DE RENDIMIENTO**

| **REQUISITO** | **DESCRIPCIÓN**                                                                                                                                                                                                      |
|---------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| RR1           | El sistema proporcionará acceso rápido a los proyectos de la base de datos, no tardando más de 5 segundos. Se calcula que el sistema debe manejar un volumen de datos de 100 proyectos históricos y unos 20 anuales. |

**REQUISITOS FUNCIONALES**

| **REQUISITO** | **DESCRIPCIÓN**                                                                                                            | **PRIORIDAD** | **ITERACIÓN** |
|---------------|----------------------------------------------------------------------------------------------------------------------------|---------------|---------------|
| RF1           | El Sistema debe permitir que los usuarios puedan registrarse en el mismo.                                                  | Alta          | 2             |
| RF2           | El Sistema debe permitir que el usuario con perfil de Administrador pueda gestionar los usuarios del en el sistema.        | Alta          | 2             |
| RF3           | El Sistema debe permitir que los usuarios registrados puedan acceder al mismo.                                             | Alta          | 2             |
| RF4           | El Sistema debe permitir que el usuario con perfil de Administrador pueda gestionar los cursos.                            | Alta          | 1             |
| RF5           | El Sistema debe permitir que el usuario con perfil de Administrador\\Alumno pueda crear nuevos proyectos.                  | Alta          | 1             |
| RF6           | El Sistema debe permitir a todos los usuarios del mismo, acceder en modo consulta a la información de todos los proyectos. | Alta          | 2             |
| RF7           | El sistema debe permitir obtener listados de los proyectos, ordenados y filtrados por diferentes criterios.                | Media         | 3             |
| RF8           | El sistema deberá importar los proyectos DIM ya existentes en la base de datos documental de Lotus Notes “ProyectosEIE”.   | Baja          | 3             |

**REQUISITOS NO FUNCIONALES**

| **REQUISITO** | **DESCRIPCIÓN**                                                                                           |
|---------------|-----------------------------------------------------------------------------------------------------------|
| RNF1          | El Sistema debe funcionar en cualquier ordenador conectado a la Red de Propósito General del MINISDEF.    |
| RNF2          | El Sistema deberá programarse en entorno WEB, con lenguaje JAVA acorde a la ATU del MINISDEF.             |
| RNF3          | El Sistema deberá emplear el SGBD SQL SERVER 2012, acorde a la ATU del MINISDEF.                          |
| RNF4          | Toda funcionalidad del sistema y transacción de negocio debe responder al usuario en menos de 5 segundos. |
| RNF5          | El sistema debe ser capaz de operar adecuadamente con hasta 20 usuarios con sesiones concurrentes.        |
| RNF6          | Los permisos de acceso al sistema podrán ser cambiados solamente por el administrador de acceso a datos.  |
| RNF7          | El sistema debe proporcionar mensajes de error que sean informativos y orientados a usuario final.        |
| RNF8          | El sistema debe bloquear al usuario que introduzca una contraseña errónea en tres intentos consecutivos.  |
| RNF9          | El sistema no debe permitir subir archivos de más de 20 MB.                                               |

ERS 2.2.- IDENTIFICACIÓN DE USUARIOS PARTICIPANTES Y FINALES
------------------------------------------------------------

### ERS 2.2.1.- CATÁLOGO DE USUARIOS

| **ROL**                                                                          | **TIPO USUARIO**     | **RESPONSABILIDAD**                                                         |
|----------------------------------------------------------------------------------|----------------------|-----------------------------------------------------------------------------|
| Jefe de proyecto                                                                 | SCRUM Master         | Controlar el cumplimiento de la metodología y supervisar el proyecto.       |
| Profesor del Departamento de Sistemas de Información y Ciberdefensa de la ACING. | PRODUCT OWNER        | Generar la petición del sistema y comprobación del funcionamiento esperado. |
| ACING.                                                                           | Participante y final | Aportar experiencia y comprobación del funcionamiento esperado.             |
| Equipo de desarrollo                                                             | Desarrollador        | Llevar a la práctica el sistema.                                            |

### ERS 2.2.2.- PLANIFICACIÓN

| **NOMBRE DE TAREA**                    | **COMIENZO** | **FIN**  |
|----------------------------------------|--------------|----------|
| Definición del sistema                 | 08/05/19     | 08/05/19 |
| Establecimiento de requisitos          | 09/05/19     | 11/05/19 |
| Especificación de casos de uso         | 12/05/19     | 14/05/18 |
| Definición de Interfaces de Usuario    | 14/05/19     | 16/05/19 |
| Presentación y Aprobación del Análisis | 17/05/19     | 17/05/19 |

<br>ERS 2.3 ESTABLECIMIENTO DE REQUISITOS:
------------------------------------------

### ERS 2.3.1.- OBTENCIÓN DE REQUISITOS

Tras las tres últimas reuniones con el cliente, se procede a una obtención más
detallada de información con el objetivo de actualizar la lista de requisitos ya
detallada anteriormente. Además de los ya enumerados en ERS 2.1, se han
establecido los siguientes requisitos englobándolos en los diferentes tipos de
interfaces de usuario, interfaces hardware, interfaces software, interfaces de
comunicación, funcionales, rendimiento, seguridad, mantenimiento, accesibilidad,
facilidad de uso.

### ERS 2.3.2.- INTERFACES DE USUARIO

| Identificación  | RIUS1-ERS                                                                                                                                                                                                                                                       |             |      |
|-----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | Los interfaces de los actores se realizarán mediante la creación de páginas web responsive y utilizando los colores corporativos.                                                                                                                               |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                       | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                                                                                                                    |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                            | Media       | Baja |
| Relacionado con |                                                                                                                                                                                                                                                                 |             |      |
| Identificación  | RIUS2-ERS                                                                                                                                                                                                                                                       |             |      |
| Descripción     | La aplicación ofrecerá el mismo interfaz de usuario al acceder a la aplicación independientemente de si el usuario tiene el perfil ADMINISTRADOR, el perfil ALUMNO o el perfil VISITANTE. Dependiendo del perfil, se le habilitarán o no las diversas opciones. |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                       | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                                                                                                                    |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                            | Media       | Baja |
| Relacionado con |                                                                                                                                                                                                                                                                 |             |      |
| Identificación  | RIUS3-ERS                                                                                                                                                                                                                                                       |             |      |
| Descripción     | En todas las interfaces de usuario, se podrá elegir en todo momento si se cancelan o aceptan las operaciones realizadas.                                                                                                                                        |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                       | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                                                                                                                    |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                            | Media       | Baja |
| Relacionado con |                                                                                                                                                                                                                                                                 |             |      |

### ERS 2.3.3.- INTERFACES DE HARDWARE

| Identificación  | RIHW1-ERS                                                                                                                                               |             |      |
|-----------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | La aplicación deberá poder ser utilizada en los ordenadores que ya disponen las unidades del Ministerio de Defensa conectados a la WAN-PG.              |             |      |
| Tipo            | Requisito                                                                                                                                               | Restricción |      |
| Fuente          | Profesor del Dpto. Sistemas de Información y Ciberdefensa.                                                                                              |             |      |
| Prioridad       | Alta                                                                                                                                                    | Media       | Baja |
| Relacionado con | RNF1                                                                                                                                                    |             |      |
| Identificación  | RIHW2-ERS                                                                                                                                               |             |      |
| Descripción     | El servidor de la aplicación y el servidor de base de datos será el que disponga la Academia de Ingenieros del Ejército en Hoyo de Manzanares (Madrid). |             |      |
| Tipo            | Requisito                                                                                                                                               | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                            |             |      |
| Prioridad       | Alta                                                                                                                                                    | Media       | Baja |
| Relacionado con |                                                                                                                                                         |             |      |

### ERS 2.3.4.- INTERFACES DE SOFTWARE

| Identificación  | RISW1-ERS                                                                                                               |             |      |
|-----------------|-------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | El Sistema deberá programarse en entorno WEB con ANGULAR y lenguaje de programación JAVA, acorde a la ATU del MINISDEF. |             |      |
| Tipo            | Requisito                                                                                                               | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                            |             |      |
| Prioridad       | Alta                                                                                                                    | Media       | Baja |
| Relacionado con | RNF2                                                                                                                    |             |      |
| Identificación  | RISW2-ERS                                                                                                               |             |      |
| Descripción     | El sistema gestor de base de datos a usar será, SQL Server 2012, acorde a la ATU del MINISDEF..                         |             |      |
| Tipo            | Requisito                                                                                                               | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                            |             |      |
| Prioridad       | Alta                                                                                                                    | Media       | Baja |
| Relacionado con | RNF3                                                                                                                    |             |      |

### ERS 2.3.5.- INTERFACES DE COMUNICACIONES

| Identificación  | RICOM1-ERS                                                                                                                                                        |             |      |
|-----------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | La infraestructura de la red y sus comunicaciones se basarán en la Red de Propósito General del Ministerio de Defensa (WAN-PG).                                   |             |      |
| Tipo            | Requisito                                                                                                                                                         | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                      |             |      |
| Prioridad       | Alta                                                                                                                                                              | Media       | Baja |
| Relacionado con | RNF4                                                                                                                                                              |             |      |
|                 |                                                                                                                                                                   |             |      |
| Identificación  | RICOM2-ERS                                                                                                                                                        |             |      |
| Descripción     | Todas las solicitudes de datos al sistema, proyectos, usuarios, cursos, etc., serán tratados en tiempo real.                                                      |             |      |
| Tipo            | Requisito                                                                                                                                                         | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                      |             |      |
| Prioridad       | Alta                                                                                                                                                              | Media       | Baja |
| Relacionado con | RNF4                                                                                                                                                              |             |      |
| Identificación  | RICOM3-ERS                                                                                                                                                        |             |      |
| Descripción     | La ACING, deberá solicitar la creación de una cuenta de correo electrónico genérico para ser usado como origen en los correos electrónicos que genere el Sistema. |             |      |
| Tipo            | Requisito                                                                                                                                                         | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                      |             |      |
| Prioridad       | Alta                                                                                                                                                              | Media       | Baja |
| Relacionado con |                                                                                                                                                                   |             |      |

ERS 2.4.- REQUISITOS FUNCIONALES
--------------------------------

| Identificación  | RF1-ERS                                                                                                                                                                                                                                                         |             |      |
|-----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | El Sistema debe permitir que los usuarios puedan registrarse en el mismo. La pantalla de acceso incluirá un botón para solicitar el registro. Al pulsar dicho botón se abrirá un formulario en el cual debe incluir los siguientes datos de manera obligatoria: |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                       | Restricción |      |
| Fuente          | Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.                                                                                                                                                                                                       |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                            | Media       | Baja |
| Relacionado con | RF2-ERS                                                                                                                                                                                                                                                         |             |      |

-   Nombre

-   Primer Apellido

-   Segundo Apellido

-   dirección de correo electrónico

-   Password

-   Password (confirmación)

Para completar la solicitud de registro de manera satisfactoria debe aceptar
obligatoriamente las condiciones de:

-   Política de privacidad de datos personales.

-   Asumir la responsabilidad de uso de documentos clasificados.

Al pulsar el botón de Enviar el sistema comprobará que el usuario no existe ya
en la tabla de usuarios, de lo contrario mostrará un mensaje indicando que el
usuario ya existe.

Tras la comprobación de no existencia del usuario, los datos solicitados en el
registro se almacenarán en la tabla de usuarios de la base de datos del sistema
donde el solicitante permanecerá en espera de que se le asigne un perfil de
acceso al sistema**,** y generará un correo electrónico al usuario con perfil
Administrador con la solicitud.

| Identificación  | RF2-ERS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |             |      |
|-----------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | El sistema debe permitir al usuario con perfil Administrador dar de alta a los usuarios solicitantes. El usuario Administrador recibirá un correo electrónico con la solicitud de registro y accederá al sistema. El sistema le mostrará en su pantalla de inicio una entrada de menú para gestionar los usuarios. Al pulsar esa entrada le aparecerá una lista de todos los usuarios del sistema. Para cada usuario aparecerán sus datos y un campo desplegable con el Tipo Perfil a asignar por el administrador, seleccionará aquellos que no tengan valor en el atributo perfil y les asignará un perfil de acceso al sistema. Al asignar perfil tras la solicitud de registro, aparecerá una ventana de alerta solicitando la aceptación, esta aceptación realizará las siguientes acciones: |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Restricción |      |
| Fuente          | Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Media       | Baja |
| Relacionado con | RF1-ERS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |             |      |

-   Actualizar los campos de la tabla usuario en la base de datos.

-   Enviar un correo electrónico al usuario confirmando su alta en el sistema.

También podrá realizar tareas de:

-   consulta de los datos de un usuario

-   modificación de sus datos al pulsar el botón de Editar, que le mostrará en
    un formulario los datos editados del usuario, por ejemplo, cuando un usuario
    alumno deje de serlo al cerrar\\finalizar su proyecto el administrador y
    deba pasar a ser usuario visitante

-   eliminar usuarios, pulsando el botón Eliminar, que le mostrará una ventana
    solicitando confirmación.

Al finalizar cualquiera de las operaciones CRUD mostrará al usuario la pantalla
inicial del sistema.

| Identificación  | RF3-ERS                                                                                                                                                          |             |      |
|-----------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | El Sistema debe permitir que los usuarios registrados puedan acceder al mismo. La pantalla de acceso incluirá dos campos obligatorios a rellenar por el usuario: |             |      |
| Tipo            | Requisito                                                                                                                                                        | Restricción |      |
| Fuente          | Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.                                                                                                        |             |      |
| Prioridad       | Alta                                                                                                                                                             | Media       | Baja |
| Relacionado con | RF2-ERS, RF3-ERS, RF4-ERS, RF5-ERS, RF6-ERS, RF7-ERS                                                                                                             |             |      |

-   Dirección de correo electrónico

-   Password

También incluirá un botón para solicitar el acceso. Al pulsar dicho botón el
sistema comprobará en la tabla de usuarios de la base de datos que la dirección
de correo electrónico y la password introducidos existen y coinciden con los
almacenados.

El sistema comprobará el perfil asignado a dicho usuario.

Tras esta comprobación mostrará al usuario la pantalla inicial del sistema según
su perfil de acceso.

| Identificación  | RF4-ERS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |             |      |
|-----------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | El sistema debe permitir al usuario administrador gestionar los Cursos. El Administrador accederá al sistema. El sistema le mostrará su pantalla de inicio y una entrada de menú para gestionar los cursos. Al pulsar sobre dicha entrada le mostrará una pantalla con todos los cursos y en la cual deberá pulsar el botón de Alta de Curso para crear un nuevo curso, que abrirá un nuevo formulario para introducir datos a los siguientes campos obligatorios referentes a un curso: |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Restricción |      |
| Fuente          | Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.                                                                                                                                                                                                                                                                                                                                                                                                                                |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Media       | Baja |
| Relacionado con | RF3-ERS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |             |      |

-   Código

-   Nombre Corto Curso

-   Nombre Largo Curso

-   Año

-   Edición

Introducirá los datos y pulsará el botón de aceptación del registro.

También podrá realizar tareas de:

-   consulta de los datos de un curso

-   modificación de sus datos al pulsar el botón de Editar, que le mostrará en
    un formulario los datos editados del curso

-   eliminar cursos, pulsando el botón Eliminar, que le mostrará una ventana
    solicitando confirmación.

La aceptación realizará las siguientes acciones:

-   Actualizar los campos de la tabla cursos en la base de datos.

Al finalizar cualquiera de las operaciones CRUD mostrará al usuario la pantalla
inicial del sistema.

| Identificación  | RF5-ERS                                                                                                                                                                                                                                                                                                                                                                   |             |      |
|-----------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | El usuario Administrador\\Alumno podrá dar de alta nuevos proyectos. El Administrador\\Alumno accederá al sistema. El sistema le mostrará su pantalla de inicio y un botón para dar de alta proyectos. Al pulsar sobre dicha entrada le mostrará una pantalla en la cual deberá introducir datos a los siguientes campos obligatorios generales referentes a un proyecto: |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                                                                                                 | Restricción |      |
| Fuente          | Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.                                                                                                                                                                                                                                                                                                                 |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                                                                                      | Media       | Baja |
| Relacionado con | RF3-ERS                                                                                                                                                                                                                                                                                                                                                                   |             |      |

-   Código

-   Título

-   Descripción Corta del Proyecto

-   Descripción Larga del Proyecto.

-   Alumno\\s

-   Curso

-   Tutores

Al introducir los datos, si en el campo Curso se ha seleccionado un curso DIM se
le mostrarán los siguientes campos no obligatorios:

-   Paradigma

-   Sistema Operativo Cliente

-   Sistema Operativo Servidor

-   Lenguaje Desarrollo

-   Entorno Desarrollo

-   Ámbito

-   SGBD

Finalmente, dispondrá de un campo denominado Repositorio en el cual al pulsar
sobre él se creará una carpeta en el repositorio de documentos con el nombre del
curso y la descripción corta del proyecto. Esto abrirá el explorador de archivos
del Sistema Operativo y podrá añadir ficheros documentales a dicha carpeta.
Internamente el sistema almacenará la ruta de ubicación de dicho repositorio que
será almacenada en este campo.

Al pulsar el botón de aceptación del registro se generarán las siguientes
acciones:

-   Validación de los datos y comprobación cumplimiento limitación tamaño 20MB
    para los ficheros documentales en el repositorio.

-   Actualizar los campos de la tabla proyectos en la base de datos
    anteriormente mencionados.

-   Actualizar el campo Estado de la tabla proyectos en la base de datos con el
    valor de “ABIERTO”.

Tras esta acción se mostrará al usuario la pantalla inicial del sistema.

| Identificación  | RF6-ERS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |             |      |
|-----------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | El Sistema debe permitir a todos los usuarios acceder en modo consulta a la información disponible de cualquier proyecto a través de una barra de filtrado de datos de proyectos. El usuario accederá al sistema y le mostrará en la pantalla de inicio una barra de filtrado\\búsqueda por los campos Curso, Año, Edición, Autor y Descripción (por palabras clave). Seleccionará los valores de los campos de filtrado que haya escogido y pulsará el botón de FILTRAR. Al pulsar dicho botón le mostrará en pantalla el listado de los proyectos encontrados por esos campos de búsqueda en formato de línea a línea y al hacer click sobre el botón de consulta se abrirá una pantalla que mostrará los datos del proyecto, así como sus ficheros de documentos. Al pulsar el botón de cerrar se mostrará al usuario la pantalla inicial del sistema. De la misma manera podrá consultar proyectos pulsando el botón Mis Proyectos que le aparecerá debajo de la barra de filtrado, y le mostrará, si los tuviera, sus proyectos, con estado CERRADO y con estado ABIERTO (en curso), en cuyo caso en este último estado podrá editar dicho proyecto pulsando el botón de Editar para realizar modificaciones. Aquellos proyectos cuyo estado sea CERRADO, ni siquiera el propio alumno podrá modificarlo o borrarlo, sólo consultarlo. Al usuario con perfil Administrador además le aparecerá el botón Eliminar para borrar proyectos, en cuyo caso al pulsar el botón de Aceptar le mostrará un mensaje de confirmación de la eliminación, y podrá acceder a modificar los proyectos con estado Abierto una vez finalizados actualizando el estado a Cerrado. |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Restricción |      |
| Fuente          | Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Media       | Baja |
| Relacionado con | RF3-ERS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |             |      |
| Identificación  | RF7-ERS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |             |      |
| Descripción     | El sistema debe permitir obtener listados de los proyectos, ordenados y filtrados por diferentes criterios. En la pantalla inicial de un usuario le aparecerá el botón Listado en e la barra de filtrado de datos de proyectos. Primero seleccionará los datos de la consulta en la barra de filtrado de datos de proyecto y una vez introducidos pulsará el botón Listado que generará un documento en pdf con el resultado de la consulta, es decir los datos de los proyectos filtrados.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Restricción |      |
| Fuente          | Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Media       | Baja |
| Relacionado con | RF-8ERS y RF-12ERS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |             |      |
| Identificación  | RF8-ERS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |             |      |
| Descripción     | El sistema deberá poder importar los proyectos ya existentes en la base de datos documental de Lotus Notes “PROYECTOSEIE”. Se realizará una migración de la base documental a la nueva aplicación mediante lenguaje de desarrollo Java. La aplicación generará un repositorio de proyectos del curso DIM donde se almacenarán los datos previos de carácter documental. Se verificará que en estos proyectos se encuentren bien referenciados, al menos, los datos presentes en el actual formulario de proyectos. Se realizará una limpieza de aquellos ficheros pertenecientes a un proyecto, como ejecutables o software comercial instalable, no necesarios en dicha documentación y que exceden en tamaño la limitación de tamaño de los ficheros documentales del proyecto.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Restricción |      |
| Fuente          | Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Media       | Baja |
| Relacionado con |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |             |      |

ERS 2.5.- REQUISITOS NO FUNCIONALES
-----------------------------------

### ERS 2.5.1.- REQUISITOS DE RENDIMIENTO

| Identificación  | RREN1-ERS                                                                                                                 |             |      |
|-----------------|---------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | Toda funcionalidad del sistema y transacción de negocio debe responder al usuario en menos de 5 segundos.                 |             |      |
| Tipo            | Requisito                                                                                                                 | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                              |             |      |
| Prioridad       | Alta                                                                                                                      | Media       | Baja |
| Relacionado con | RNF4-ERS                                                                                                                  |             |      |
| Identificación  | RREN2-ERS                                                                                                                 |             |      |
| Descripción     | El sistema debe ser capaz de operar adecuadamente con hasta 20 usuarios con sesiones concurrentes                         |             |      |
| Tipo            | Requisito                                                                                                                 | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                              |             |      |
| Prioridad       | Alta                                                                                                                      | Media       | Baja |
| Relacionado con | RNF5-ERS                                                                                                                  |             |      |
| Identificación  | RREN3-ERS                                                                                                                 |             |      |
| Descripción     | El sistema debe manejar un volumen de datos de 100 proyectos migrados inicialmente y unos 20 proyectos nuevos anualmente. |             |      |
| Tipo            | Requisito                                                                                                                 | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                              |             |      |
| Prioridad       | Alta                                                                                                                      | Media       | Baja |
| Relacionado con |                                                                                                                           |             |      |

### ERS 2.5.2.- REQUISITOS DE SEGURIDAD

| Identificación  | RSEG1-ERS                                                                                                                                                                                                                                                                                                                         |             |      |
|-----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | La aplicación permitirá crear nuevos usuarios, asignándole uno de los tres perfiles de acceso, ADMINISTRADOR, ALUMNO o VISITANTE. Sólo el usuario con perfil ADMINISTRADOR podrá crear nuevos usuarios. Cuando un usuario sin acceso permitido acceda al portal de la aplicación, se le mostrará un mensaje informándole de ello. |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                                                         | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                                                                                                                                                                                      |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                                              | Media       | Baja |
| Relacionado con | RNF6-ERS                                                                                                                                                                                                                                                                                                                          |             |      |
| Identificación  | RSEG2-ERS                                                                                                                                                                                                                                                                                                                         |             |      |
| Descripción     | Los permisos de acceso al sistema podrán ser cambiados solamente por el usuario con perfil ADMINISTRADOR.                                                                                                                                                                                                                         |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                                                         | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                                                                                                                                                                                      |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                                              | Media       | Baja |
| Relacionado con | RNF6-ERS                                                                                                                                                                                                                                                                                                                          |             |      |
| Identificación  | RSEG3-ERS                                                                                                                                                                                                                                                                                                                         |             |      |
| Descripción     | Sólo los usuarios con perfil ADMINISTRADOR, podrán acceder a la gestión de la tabla de cursos.                                                                                                                                                                                                                                    |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                                                         | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                                                                                                                                                                                      |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                                              | Media       | Baja |
| Relacionado con |                                                                                                                                                                                                                                                                                                                                   |             |      |

### ERS 2.5.3.- REQUISITOS DE ACCESIBILIDAD

| Identificación  | RAC1-ERS                                                                                                                                                        |             |      |
|-----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | Las peticiones de registro de los usuarios se generarán y enviarán de forma automática por email, una vez el usuario ha introducido los datos correspondientes. |             |      |
| Tipo            | Requisito                                                                                                                                                       | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                    |             |      |
| Prioridad       | Alta                                                                                                                                                            | Media       | Baja |
| Relacionado con | RO1-ERS                                                                                                                                                         |             |      |

### ERS 2.5.4.- REQUISITOS DE FACILIDAD DE USO

| Identificación  | RFU1-ERS                                                                                                                                                                                                                                                                                             |             |      |
|-----------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|------|
| Descripción     | El sistema debe proporcionar ayuda en línea con instrucciones paso a paso para guiar al usuario en las tareas que debe realizar y se usarán asistentes que guíen en los procesos de creación de proyectos, cursos o usuarios.                                                                        |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                            | Restricción |      |
| Fuente          | PRODUCT OWNER                                                                                                                                                                                                                                                                                        |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                 | Media       | Baja |
| Relacionado con | RNF7-ERS                                                                                                                                                                                                                                                                                             |             |      |
| Identificación  | RFU2-ERS                                                                                                                                                                                                                                                                                             |             |      |
| Descripción     | El tiempo de aprendizaje del sistema por un usuario deberá ser menor a 1 horas.                                                                                                                                                                                                                      |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                            | Restricción |      |
| Fuente          | PRODUCT OWNER                                                                                                                                                                                                                                                                                        |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                 | Media       | Baja |
| Relacionado con |                                                                                                                                                                                                                                                                                                      |             |      |
| Identificación  | RFU3-ERS                                                                                                                                                                                                                                                                                             |             |      |
| Descripción     | Cuando el usuario realice una operación no admitida por la aplicación o deje de cumplimentar una de las exigidas por la misma, aparecerá un mensaje de error, utilizando para ello, un texto aclarativo que explique el error y qué acciones tomar para resolverlo y continuar o abandonar la misma. |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                            | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                                                                                                                                                         |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                 | Media       | Baja |
| Relacionado con | RNF7-ERS                                                                                                                                                                                                                                                                                             |             |      |
| Identificación  | RFU4-ERS                                                                                                                                                                                                                                                                                             |             |      |
| Descripción     | La aplicación deberá poder mostrar la información mediante Tablas, pudiendo acceder desde ellas a las operaciones básicas de mantenimiento de los datos visualizados.                                                                                                                                |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                            | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                                                                                                                                                         |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                 | Media       | Baja |
| Relacionado con |                                                                                                                                                                                                                                                                                                      |             |      |
| Identificación  | RFU6-ASI                                                                                                                                                                                                                                                                                             |             |      |
| Descripción     | Debe contener facilidades para las consultas como permitir búsquedas por varios campos a elegir por el usuario, búsquedas con coincidencias parciales o coincidencia exacta (descripción), selección sencilla de un determinado proyecto para consulta de sus datos tras una búsqueda, etc.          |             |      |
| Tipo            | Requisito                                                                                                                                                                                                                                                                                            | Restricción |      |
| Fuente          | SCRUM Máster                                                                                                                                                                                                                                                                                         |             |      |
| Prioridad       | Alta                                                                                                                                                                                                                                                                                                 | Media       | Baja |
| Relacionado con |                                                                                                                                                                                                                                                                                                      |             |      |

ANEXO 1: MATRIZ DE CUMPLIMIENTO DE REQUISITOS
=============================================

| **CASO DE USO** | **REQUISITOS FUNCIONALES RFXX-ERS** |       |       |       |       |       |       |       |   |
|-----------------|-------------------------------------|-------|-------|-------|-------|-------|-------|-------|---|
|                 | **1**                               | **2** | **3** | **4** | **5** | **6** | **7** | **8** |   |
| CU1             | Solicitar Registro.                 | X     |       |       |       |       |       |       |   |
| CU2             | Autenticar usuario.                 |       |       | X     |       |       |       |       |   |
| CU3             | Consultar Lista de Usuarios.        |       | X     |       |       |       |       |       |   |
| CU4             | Mantenimiento de Usuarios.          |       | X     |       |       |       |       |       |   |
| CU5             | Consultar lista de Cursos.          |       |       |       | X     |       |       |       |   |
| CU6             | Mantenimiento de Cursos.            |       |       |       | X     |       |       |       |   |
| CU7             | Mantenimiento de Proyectos.         |       |       |       |       |       | X     |       |   |
| CU8             | Consultar lista de Proyectos.       |       |       |       |       | X     | X     |       |   |
| CU9             | Enviar Correo.                      | X     | X     |       |       |       |       |       |   |
| CU10            | Listados de Proyectos.              |       |       |       |       |       |       | X     |   |
| CU11            | Migrar Proyectos DIM.               |       |       |       |       |       |       |       | X |
