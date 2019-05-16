<a name="top"></a>
## ERS 2.6.- DIAGRAMA DE CASOS DE USO

## Índice de contenidos
* [Actores](#item1)
* [Casos de Uso](#item2)


Del estudio detallado de los Requisitos, se extraen los siguientes Actores del sistema.

<a name="item1"></a>
| **Actor** | **Descripción** |
| --- | --- |
| Administrador | Persona responsable de las tareas de gestión del sistema como la gestión de los usuarios, gestión de los cursos y gestión de los proyectos tanto históricos como los de nueva creación. |
| Alumno | Encargado de dar de alta sus proyectos en un curso y consultar proyectos en estado cerrado. Sólo podrá actualizar aquellos proyectos suyos en estado abierto.   |
| Visitante | Persona que puede consultar cualquier proyecto en estado cerrado. |

[Subir](#top)

De lo anterior se llega a la conclusión de que los casos de uso son:
* [Contenido 2](#item2)
| **NUMERACIÓN** | **DESCRIPCIÓN** |
| --- | --- |
| CU1 | Solicitar Registro. |
| CU2 | Autenticar usuario. |
| CU3 | Consultar Lista de Usuarios. |
| CU4 | Mantenimiento de un Usuario. |
| CU5 | Consultar lista de Cursos. |
| CU6 | Mantenimiento de un Curso. |
| CU7 | Consultar lista de Proyectos. |
| CU8 | Consultar Proyectos. |
| CU9 | Enviar Correo. |
| CU10 | Listados de proyectos. |
| CU11 | Migrar Proyectos DIM. |

[Subir](#top)

A continuación, se muestra el Diagrama de casos de uso del sistema.

## ERS 2.7.- ESPECIFICACIÓN CASOS DE USO

A continuación, se detallan los once casos de uso detectados dentro del Sistema.

| **Caso de Uso** | **Solicitar registro** | **CU1** |
| --- | --- | --- |
| **Actores** | ALUMNO, VISITANTE |
| **Tipo** | Primario |
| **Referencias** | RF1-ERS | CU9 |
| **Precondición** | Ninguna |
| **Postcondición** | El usuario solicita acceder al sistema con las opciones autorizadas según su perfil. |
| **Autor** | SCRUM Máster | Fecha | 13/05/18 | Versión | 1.0 |
| **Descripción** |
|
- --El actor introduce su nombre, primer apellido, segundo apellido, dirección de correo electrónico, password, password(confirmación) para solicitar acceder al sistema a determinados menús de la aplicación.
- --Para completar la solicitud de manera satisfactoria debe aceptar obligatoriamente las condiciones de:

-
  - Política de privacidad de datos personales.
  - Asumir la responsabilidad de uso de documentos clasificados.
  |
| **Otros datos** |
| **Frecuencia esperada** | De 1 a 30 veces al año | **Rendimiento** | Menos de 5 seg. |
| **Importancia** | Alta | **Urgencia** | Alta |

| **Caso de Uso** | **Autenticar usuario** | **CU2** |
| --- | --- | --- |
| **Actores** | ADMINISTRADOR, ALUMNO, VISITANTE |
| **Tipo** | Primario |
| **Referencias** | RF3-ERS | CU3, CU4, CU5, CU6, CU7, CU8, CU9, CU10 |
| **Precondición** | Ninguna. |
| **Postcondición** | El usuario queda autenticado y accede al sistema con las opciones autorizadas según su perfil. |
| **Autor** | SCRUM Máster | Fecha | 13/05/19 | Versión | 1.0 |
| **Descripción** |
| El actor introduce su dirección de correo electrónico y contraseña para autenticarse y acceder a determinados menús de la aplicación. |
| **Otros datos** |
| **Frecuencia esperada** | De 1 a 10 veces al día | **Rendimiento** | Menos de 5 seg. |
| **Importancia** | Alta | **Urgencia** | Alta |

| **Caso de Uso** | **Consultar Lista de Usuarios** | **CU3** |
| --- | --- | --- |
| **Actores** | ADMINISTRADOR |
| **Tipo** | Primario |
| **Referencias** | RF2-ERS | CU2, CU4 |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ADMINISTRADOR. |
| **Postcondición** | El sistema una vez comprobado que el actor ha pulsado la opción de menú &quot;Gestionar Usuarios&quot;, accede a la base de datos y muestra una lista con todos los usuarios del sistema. |
| **Autor** | SCRUM Máster | Fecha | 13/05/19 | Versión | 1.0 |
| **Descripción** |
| El actor accede a la opción de gestión de usuarios -\&gt; realiza filtrado por los campos de usuario. |
| **Otros datos** |
| **Frecuencia esperada** | De 1 a 100 veces al año | **Rendimiento** | Menos de 5 seg. |
| **Importancia** | Alta | **Urgencia** | Alta |



| **Caso de Uso** | **Mantenimiento de un usuario** | **CU4** |
| --- | --- | --- |
| **Actores** | ADMINISTRADOR |
| **Tipo** | Primario |
| **Referencias** | RF2-ERS | CU2, CU3, CU9 |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ADMINISTRADOR. |
| **Postcondición** | El sistema registra el usuario cambiándole el perfil a ALUMNO o VISITANTE, así como modificando alguno de sus datos. |
| **Autor** | SCRUM Máster | Fecha | 13/05/19 | Versión | 1.0 |
| **Descripción** |
| El actor, accede a la opción de Gestión de Usuarios-\&gt;Pendiente Aceptación o Gestión de Usuarios-\&gt;Usuarios Sistema. |
| **Otros datos** |
| **Frecuencia esperada** | De 1 a 50 veces al año | **Rendimiento** | Menos de 5 seg. |
| **Importancia** | Alta | **Urgencia** | Alta |

| **Caso de Uso** | **Consultar Lista de Cursos** | **CU5** |
| --- | --- | --- |
| **Actores** | ADMINISTRADOR |
| **Tipo** | Primario |
| **Referencias** | RF4-ERS | CU2, CU6 |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ADMINISTRADOR. |
| **Postcondición** | El sistema una vez comprobado que el actor ha pulsado la opción de menú &quot;Gestionar Cursos&quot;, accede a la base de datos y muestra una lista con todos los cursos del sistema. |
| **Autor** | SCRUM Máster | Fecha | 13/05/19 | Versión | 1.0 |
| **Descripción** |
| El actor accede a la opción de gestión de cursos -\&gt; realiza filtrado por campos de curso. |
| **Otros datos** |
| **Frecuencia esperada** | De 1 a 50 veces al año | **Rendimiento** | Menos de 5 seg. |
| **Importancia** | Alta | **Urgencia** | Alta |

| **Caso de Uso** | **Mantenimiento de un Curso** | **CU6** |
| --- | --- | --- |
| **Actores** | ADMINISTRADOR |
| **Tipo** | Primario |
| **Referencias** | RF4-ERS | CU5, CU2 |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ADMINISTRADOR. |
| **Postcondición** | El sistema da de alta en la base de datos un nuevo curso con los campos obligatorios del curso, introducidos por el actor. |
| **Autor** | SCRUM Máster | Fecha | 13/05/19 | Versión | 1.0 |
| **Descripción** |
| El actor, accede a la opción de Gestión de Cursos-\&gt; Alta de Curso -\&gt; Rellena los campos obligatorios del Curso. |
| **Otros datos** |
| **Frecuencia esperada** | De 1 a 20 veces al año | **Rendimiento** | Menos de 5 seg. |
| **Importancia** | Alta | **Urgencia** | Alta |

| **Caso de Uso** | **Consultar Lista de Proyectos** | **CU7** |
| --- | --- | --- |
| **Actores** | ADMINISTRADOR, ALUMNO |
| **Tipo** | Primario |
| **Referencias** | RF6-ERS | CU2, CU8 |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ADMINISTRADOR o ALUMNO. |
| **Postcondición** | El sistema una vez comprobado que el actor ha pulsado la opción de menú &quot;Mis Proyectos&quot;, accede a la base de datos y muestra una lista con todos los proyectos en el caso del ADMINISTRADOR, y todos los proyectos abiertos y cerrados del actor ALUMNO. |
| **Autor** | SCRUM Máster | Fecha | 13/05/19 | Versión | 1.0 |
| **Descripción** |
| El actor accede a la pantalla inicial -\&gt; Mis proyectos |
| **Otros datos** |
| **Frecuencia esperada** | De 1 a 50 veces al año | **Rendimiento** | Menos de 5 seg. |
| **Importancia** | Alta | **Urgencia** | Alta |

| **Caso de Uso** | **Mantenimiento de un Proyecto** | **CU8** |
| --- | --- | --- |
| **Actores** | ADMINISTRADOR, ALUMNO |
| **Tipo** | Primario |
| **Referencias** | RF5-ERS, RF6-ERS | CU7, CU2 |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ADMINISTRADOR o ALUMNO. |
| **Postcondición** | El sistema da de alta en la base de datos un nuevo proyecto con los campos obligatorios del proyecto o actualiza los existentes, que ha introducido el actor, así como guarda en el repositorio que se asocia automáticamente al proyecto, los documentos o archivos que introduzca el actor. |
| **Autor** | SCRUM Máster | Fecha | 13/05/19 | Versión | 1.0 |
| **Descripción** |
| El actor, accede a la pantalla inicial -\&gt; Alta Proyectos/Mis proyectos -\&gt; Rellena/modifica los campos del Proyecto. |
| **Otros datos** |
| **Frecuencia esperada** | De 1 a 20 veces al año | **Rendimiento** | Menos de 5 seg. |
| **Importancia** | Alta | **Urgencia** | Alta |

| **Caso de Uso** | **Enviar Correo** | **CU9** |
| --- | --- | --- |
| **Actores** | ADMINISTRADOR, VISITANTE, ALUMNO |
| **Tipo** | Primario |
| **Referencias** | RF1-ERS, RF2-ERS | CU1, CU4 |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ADMINISTRADOR, ALUMNO o VISITANTE. |
| **Postcondición** | El sistema envía un email a la cuenta del administrador en caso de solicitud de registro de nuevo usuario, o al usuario ALUMNO/VISITANTE para confirmación de registro. |
| **Autor** | SCRUM Máster | Fecha | 13/05/19 | Versión | 1.0 |
| **Descripción** |
| Un nuevo usuario rellena los datos del formulario de registro y pulsa el botón &quot;Enviar&quot;.El usuario Administrador, asigna perfil a un nuevo usuario y pulsa el botón de aceptación del nuevo registro. |
| **Otros datos** |
| **Frecuencia esperada** | De 1 a 100 veces al año | **Rendimiento** | Menos de 5 seg. |
| **Importancia** | Alta | **Urgencia** | Alta |

| **Caso de Uso** | **Listado de Proyectos** | **CU10** |
| --- | --- | --- |
| **Actores** | ADMINISTRADOR, VISITANTE, ALUMNO |
| **Tipo** | Primario |
| **Referencias** | RF7-ERS | CU2 |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ADMINISTRADOR, VISITANTE o ALUMNO. |
| **Postcondición** | El sistema muestra un listado de Proyectos ordenado y filtrado por los campos indicados por el usuario, en formato pdf. |
| **Autor** | SCRUM Máster | Fecha | 13/05/19 | Versión | 1.0 |
| **Descripción** |
| El actor, desde la pantalla inicial introduce los datos en los campos de filtrado de proyectos -\&gt; aparecen los proyectos filtrados -\&gt; el actor pulsa el botón &quot;Listado &quot;. |
| **Otros datos** |
| **Frecuencia esperada** | De 1 a 100 veces al año | **Rendimiento** | Menos de 10 seg. |
| **Importancia** | Media | **Urgencia** | Media |



| **Caso de Uso** | **Migrar Proyectos DIM** | **CU11** |
| --- | --- | --- |
| **Actores** | ADMINISTRADOR |
| **Tipo** | Primario |
| **Referencias** | RF8-ERS |   |
| **Precondición** | Se ha generado manualmente un repositorio donde almacenar los datos de carácter documental de proyectos antiguos. |
| **Postcondición** | El sistema almacena los proyectos en la base de datos actual, registrando los campos obligatorios. |
| **Autor** | SCRUM Máster | Fecha | 13/05/19 | Versión | 1.0 |
| **Descripción** |
| El actor realiza una importación de los campos obligatorios de los proyectos antiguos, y guarda en el repositorio los archivos documentales permitidos. |
| **Otros datos** |
| **Frecuencia esperada** | Una vez | **Rendimiento** | Menos de 1 hora. |
| **Importancia** | Baja | **Urgencia** | Baja |

## ERS 2.8.- MATRIZ DE CUMPLIMIENTO DE REQUISITOS

En el **ANEXO 1** se exponen los casos de uso asociados a los diferentes requisitos funcionales que se han obtenido en el proceso de captura de requisitos.

Se observa como todos los requisitos tienen asociados al menos un caso de uso que contemple la correspondiente funcionalidad y que todos los casos de uso cumplen algún requisito funcional, por lo que podemos afirmar que no queda ningún requisito por cubrir.

## ERS 2.9.- VALIDACIÓN DE REQUISITOS

El viernes 17 de mayo de 2019 se celebra una reunión entre el analista y el Capitán Jefe de la Compañía de Abastecimiento para presentarle la Especificación de Requisitos Software con la finalidad de revisar comprobar la validez de los requisitos.

En esa misma reunión, el cliente acepta la Especificación de Requisitos Software.

# ANEXO 1: MATRIZ DE CUMPLIMIENTO DE REQUISITOS

| **CASO DE USO** | **REQUISITOS FUNCIONALES RFXX-ERS** |
| --- | --- |
| **1** | **2** | **3** | **4** | **5** | **6** | **7** | **8** |
| CU1 |  Solicitar Registro. | X |   |   |   |   |   |   |   |
| CU2 |  Autenticar usuario. |   |   | X |   |   |   |   |   |
| CU3 |  Consultar Lista de Usuarios. |   | X |   |   |   |   |   |   |
| CU4 |  Mantenimiento de Usuarios. |   | X |   |   |   |   |   |   |
| CU5 |  Consultar lista de Cursos. |   |   |   | X |   |   |   |   |
| CU6 |  Mantenimiento de Cursos. |   |   |   | X |   |   |   |   |
| CU7 |  Mantenimiento de Proyectos. |   |   |   |   |   | X |   |   |
| CU8 |  Consultar lista de Proyectos. |   |   |   |   | X | X |   |   |
| CU9 |  Enviar Correo. | X | X |   |   |   |   |   |   |
| CU10 |  Listados de Proyectos. |   |   |   |   |   |   | X |   |
| CU11 |  Migrar Proyectos DIM. |   |   |   |   |   |   |   | X |