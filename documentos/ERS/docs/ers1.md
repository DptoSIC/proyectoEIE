<a name="top"></a>
# [ERS 1.- DEFINICIÓN DEL SISTEMA]

[ERS 1.1.- DETERMINACIÓN DEL ALCANCE DEL SISTEMA](#item1)

[ERS 1.2.- GLOSARIO DE TÉRMINOS Y ABREVIATURAS](#item2)

[ERS 1.3.- MODELO DE NEGOCIO](#item3)

[ERS 1.4.- MODELO DE DOMINIO](#item4)

[ERS 1.5.- IDENTIFICACIÓN DEL ENTORNO TECNOLÓGICO](#item5)

[ERS 1.6.- ESPECIFICACIÓN DE ESTÁNDARES Y NORMAS](#item6)

<br>ERS 1.- DEFINICIÓN DEL SISTEMA
==================================

<a name="item1"></a>
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

6.  Se podrán consultar los proyectos del usuario mediante un botón específico
    de búsqueda que muestre un histórico de sus proyectos y sus proyectos en
    curso si los tuviera.

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
    documental ProyectosEIE de Lotus Notes, previa a la implantación del sistema
    y en una única carga.

12. Realizar el cierre del proyecto al finalizar un curso por parte del usuario
    administrador.

Quedan fuera del ámbito del sistema:

1.  La integración con otros sistemas ni compartir sus datos con terceros.

[Subir](#top)

<a name="item2"></a>
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

[Subir](#top)

<a name="item3"></a>
ERS 1.3.- MODELO DE NEGOCIO
---------------------------

![Modelo de Negocio](https://github.com/DptoSIC/proyectoEIE/blob/master/ERS-ASI/Modelo%20de%20Negocio/MNEGOCIO%20v2.jpg)

[Subir](#top)

<a name="item4"></a>
ERS 1.4.- MODELO DE DOMINIO
---------------------------

![Modelo de Dominio](https://github.com/DptoSIC/proyectoEIE/blob/master/ERS-ASI/Modelo%20de%20Dominio/MDOMINIO%202.jpg)

[Subir](#top)

<a name="item5"></a>
ERS 1.5.- IDENTIFICACIÓN DEL ENTORNO TECNOLÓGICO
------------------------------------------------

En lo que se refiere al hardware, los usuarios, como miembros del Ministerio de
Defensa, disponen de los ordenadores necesarios para utilizar la aplicación, el
único requisito que deben cumplir es disponer de conexión a la WAN-PG.

Aquellos usuarios externos al Ministerio de Defensa deberán solicitar un usuario
de acceso a la WAN-PG para poder acceder al Sistema.

En cuanto al software, durante el desarrollo de la aplicación se usará ANGULAR
programando en lenguaje JAVA, no siendo necesaria la instalación de ningún
Framework adicional de los que ya dispongan los equipos, bajo el SO Windows y
utilizando como SGDB SQL Server 2012.

[Subir](#top)

<a name="item6"></a>
ERS 1.6.- ESPECIFICACIÓN DE ESTÁNDARES Y NORMAS
-----------------------------------------------

-   Híbrido de metodologías (Metodología métrica v.3 y metodología ágil SCRUM).

-   Ley Orgánica 3/2018, de 5 de diciembre, de Protección de Datos Personales y
    garantía de los derechos digitales.

-   Ley 9/1968, de 5 de abril, sobre secretos oficiales.


[Volver ERS](https://github.com/DptoSIC/proyectoEIE/blob/master/ERS-ASI/ERS_SIGEPROY.md)
