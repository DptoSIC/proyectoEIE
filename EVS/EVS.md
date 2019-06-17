[EVS 1.- ESTABLECIMIENTO DEL ALCANCE DEL SISTEMA:	4](#item1)
[EVS 1.1.- ESTUDIO DE LA SOLICITUD	4](#item2)
[EVS 1.2.- IDENTIFICACIÓN DEL ALCANCE DEL SISTEMA	5](#item3)
[EVS 1.3.- ESPECIFICACIÓN DEL ALCANCE DEL EVS	5](#item4)
[EVS 2.- ESTUDIO DE LA SITUACIÓN ACTUAL	7](#item5)
[EVS 2.1.- VALORACIÓN DEL ESTUDIO DE LA SITUACIÓN ACTUAL	7](#item6)
[EVS 2.2.- IDENTIFICACIÓN DE LOS USUARIOS PARTICIPANTES EN EL ESTUDIO DE LA	 SITUACIÓN ACTUAL 7	](#item7)
[EVS 2.3.- DESCRIPCIÓN DE LOS SISTEMAS DE INFORMACIÓN EXISTENTES	7](#item8)
[EVS 2.4.- REALIZACIÓN DEL DIAGNÓSTICO DE LA SITUACIÓN ACTUAL	9](#item9)
[EVS 3.- DEFINICIÓN DE REQUISITOS DEL SISTEMA	10](#item10)
[EVS 3.1.- IDENTIFICACIÓN DE LAS DIRECTRICES Y TÉCNICAS DE GESTIÓN	10](#item11)
[EVS 3.2/3.3.- IDENTIFICACIÓN Y CATALOGACIÓN DE REQUISITOS	10](#item12)
[EVS 4.- ESTUDIO DE LAS ALTERNATIVAS DE SOLUCIÓN	13](#item143)
[EVS 4.1.- PRESELECCIÓN DE ALTERNATIVAS DE SOLUCIÓN	13](#item14)
[EVS 4.2.- DESCRIPCIÓN DE LAS ALTERNATIVAS DE SOLUCIÓN	13](#item15)
[EVS 5.- DEFINICIÓN DE REQUISITOS DEL SISTEMA	16](#item16)
[EVS 5.1.- ESTUDIO DE LA INVERSIÓN	16](#item17)
[EVS 5.2.- ESTUDIO DE LOS RIESGOS	17](#item18)
[EVS 5.3.- PLANIFICACIÓN DE ALTERNATIVAS	18](#item19)
[EVS 6.- SELECCIÓN DE LA SOLUCIÓN	18](#item20)
[EVS 6.1.- CONVOCATORIA DE LA PRESENTACIÓN	18](#item21)
[EVS 6.2.- EVALUACIÓN DE LAS ALTERNATIVAS Y SELECCIÓN	19](#item22)
[EVS 6.3- APROBACIÓN DE LA SOLUCIÓN	19](#item23)
[ANEXO 1: MATRIZ DE CUMPLIMIENTO DE REQUISITOS	20](#item24)
[ANEXO 2: PROPUESTA ECONOMICA ALTERNATIVA 3	21](#item25)

<a name="item1"></a>
**EVS 1.- ESTABLECIMIENTO DEL ALCANCE DEL SISTEMA:** 
<a name="item2"></a>
**EVS 1.1.- ESTUDIO DE LA SOLICITUD**
1.- Descripción General del Sistema: 

La Academia de Ingenieros del Ejército de Tierra requiere disponer de una aplicación que permita gestionar los proyectos informáticos que los alumnos del curso DIM realizan durante el periodo de prácticas y almacenar la documentación generada en dichos proyectos. El proyecto, por tanto, tiene como propósito desarrollar una aplicación web que sustituya a la actual base de datos documental de proyectos en Lotus Notes, antigua y difícil de mantener.

La aplicación actual corre sobre el cliente Lotus Notes, no pudiendo asegurar la continuidad de esta solución, por la obsolescencia del producto y la previsible no continuidad del mismo dentro del Ejército de Tierra.

Para automatizar, optimizar y facilitar tanto las consultas de los diferentes proyectos informáticos realizados por Diplomados en Informática Militar, el alta de los nuevos proyectos de los alumnos que están realizando el curso, así como la obtención de información filtrada de los distintos proyectos con opción de ser listada, se solicita la implantación de un nuevo sistema que cumpla con todos los requisitos que se detallan en el presente documento.

2.- Catálogo objetivo del EVS: 
 
1.	Detectar las necesidades de información de los usuarios.
2.	Conocer las limitaciones técnicas y legales para el trato de información personal de carácter sensible protegida por la Ley Orgánica de Protección de Datos (LOPD) o la Ley de Secretos Oficiales. 
3.	Detectar las fuentes de datos relacionados con cada requisito y diferenciarlas de 
los datos que sean únicamente manejados por este SI. 
4.	Delimitar un catálogo de requisitos que permita terminar el proceso de diseño no más tarde del 10 de mayo de 2019.
 
3.- Alcance: 

El Sistema de Información afectará a todos los usuarios Diplomados en Informática Militar, alumnos, personal docente y cualquier posible usuario que desee acceder a esta plataforma de conocimiento informático militar.
Además, se requiere de este Sistema para dar continuidad a la información existente y de esa forma, facilitar el alta, la gestión y el acceso a un historial de proyectos, así como mejorar la accesibilidad y la seguridad. 

4.- Estudio de restricciones: 
 
Se contemplan restricciones de tipo temporal, restricciones técnicas tanto de hardware como de software, restricciones económicas, así como restricciones legales que deben estar conforme a los estándares vigentes. 
 <a name="item3"></a>
**EVS 1.2.- IDENTIFICACIÓN DEL ALCANCE DEL SISTEMA** 
Se desea mejorar el actual sistema de gestión de proyectos DIM, obsoleto, basado en una base de datos documental Lotus Notes, siendo este tipo de tecnología algo que está en vías de desaparecer a medio plazo, tanto por la falta de personal propio con conocimientos para hacer nuevos desarrollos, así como mantener los existentes en este entorno.

El nuevo sistema se implementará en un servidor web centralizado, será accesible desde Internet por cualquier dispositivo con conexión a dicha red, terminales móviles o fijos.
<a name="item4"></a>
**EVS 1.3.- ESPECIFICACIÓN DEL ALCANCE DEL EVS** 
El objetivo que se pretende es estudiar en profundidad la situación actual, para así averiguar si es posible crear un sistema informático que haga posible que el Departamento de Sistemas de Información y Ciberdefensa de la ACING, mejore su sistema actual, tanto en usabilidad, incremento de funcionalidades y seguridad de la información. Para ello se llevará un proceso de estudio para evaluar su viabilidad y, en su caso, ofrecer posibles opciones. 
 
Se estudiará la gestión actual de la aplicación Notes “Gestión Proyectos EIE” ubicada en el servidor Notes “CGE/Ejercito de Tierra”, y especialmente en lo referente al uso de la base de datos documental que actualmente disponen. Se llevarán a cabo las oportunas entrevistas personales tanto con el profesor del Departamento que requiere disponer de esta aplicación, así como personal usuario del Sistema y personal docente, para conocer en profundidad todos los detalles relevantes. 

Los usuarios que participarán en el EVS serán:  
	* **El jefe de proyecto**: Responsable del estudio y de las posibles soluciones. 
	* **Profesor del Departamento Sistemas de Información y Ciberdefensa de la ACING**: Aportará sus necesidades desde el punto de vista de gestión y responsable de la aplicación y será responsable de elegir qué solución a adoptar. 
	* **Personal Docente**: Aportará su experiencia respecto a la gestión de proyectos en el ámbito de la informática, así como todas las mejoras que pueda proporcionar, siendo conocedor del sistema actual.  
	* **Usuarios**: Como usuarios del sistema, aportarán sus opiniones de uso y mejoras de la actual gestión, proporcionando información para la mejora del sistema. 
 
Se seguirá el siguiente plan de trabajo: El 25 de abril de 2019 se realizará una entrevista con el Profesor del Departamento Sistemas de Información y Ciberdefensa de la ACING, para recabar información. Si es necesario, se irán programando sucesivas entrevistas para recabar más información. Como fecha límite el 29 de abril, el jefe de proyecto entregará un informe detallado a este responsable para que tome la decisión final. 
 
 
 	 
<a name="item5"></a>
**EVS 2.- ESTUDIO DE LA SITUACIÓN ACTUAL**
<a name="item6"></a> 
**EVS 2.1.- VALORACIÓN DEL ESTUDIO DE LA SITUACIÓN ACTUAL** 
El actual Sistema de Información comprende una base de datos documental realizada en Lotus Notes mediante la cual, se gestiona la información de los proyectos informáticos realizados por los Diplomados en Informática Militar, así como los que estuviesen actualmente en curso por los alumnos. 
 
<a name="item7"></a> 
**EVS 2.2.- IDENTIFICACIÓN DE LOS USUARIOS PARTICIPANTES EN EL ESTUDIO DE LA 
SITUACIÓN ACTUAL** 
	* **Profesor del Departamento Sistemas de Información y Ciberdefensa de la ACING**: Como máximo responsable de la aplicación. 
	* **Personal docente**: Conocedor del sistema actual. 
<a name="item8"></a> 
**EVS 2.3.- DESCRIPCIÓN DE LOS SISTEMAS DE INFORMACIÓN EXISTENTES**

El actual Sistema de Información comprende una base de datos documental realizada en Lotus Notes mediante la cual, se gestiona la información de los proyectos informáticos realizados por los Diplomados en Informática Militar, así como los que estuviesen actualmente en curso por los alumnos. 
 
Dicha base de datos está ubicada en un servidor Notes, al cual se accede a través de la WANPG, teniendo acceso únicamente los usuarios con permisos en dicha red. Además, requiere disponer de usuario notes y contraseña de acceso al cliente Notes desde el cual se accede propiamente a la aplicación que permite realizar las consultas a los proyectos ya existentes o subir la documentación de los nuevos proyectos. 

El acceso al Sistema existente se realiza mediante una lista de control con acceso ACL a través del usuario “Default” y nivel de acceso “Editor” a cualquier usuario, exceptuando los usuarios específicos con nivel de acceso “Gerente”. 

Una vez realizada la consulta del proyecto, el actual sistema da la opción de poder descargar los distintos ficheros aportados como documentación del proyecto quedando a disposición del usuario.

A continuación, se describe de forma gráfica [el modelo del sistema actual](https://git.institutomilitar.com/Patrick/ProyectoEIE/blob/master/Documentos/EVS/imagenes/situacion_inicial.jpg).
 


 
Los problemas que actualmente se observan con el sistema actual son los siguientes:  
* A través del usuario “default” de la aplicación, cualquier usuario Notes accede a la aplicación pudiendo con el nivel de acceso “editor”, que se le asigna automáticamente, realizar lo siguiente:
  *  Dar da alta nuevos Proyectos.
  *  Subir archivos dentro de proyectos existentes.
  *  Editar y modificar los proyectos existentes, incluidos los creados por otros usuarios, sin posibilidad de auditar dichos cambios ni realizar una trazabilidad de los mismos.
	* Al tratarse de un Sistema ubicado en la WANPG del Ministerio de Defensa, impide el acceso a usuarios de otros organismos.
* Al tratarse de una base de datos documental realizada sobre Lotus, exige disponer de un cliente Lotus Notes y en un futuro, es posible que ningún usuario disponga de él. 
* El sistema de almacenamiento actual es documental por lo que cualquier tipo de filtrado de datos en atención a los campos requeridos para el alta de proyectos no es viable. 
* Los archivos anexados en cada proyecto son almacenados en la propia base de datos lo cual, unido a que no está definido el tamaño máximo de fichero que puede subirse a la aplicación, esta base de datos no es fácilmente escalable y ofrece problemas de mantenimiento y problemas de consumo excesivo de capacidad de almacenamiento.
* La base de datos puede quedar desactualizada por la falta de mantenimiento y el abandono a medio plazo, de la tecnología sobre la que se soporta.
* Todo esto hace que el sistema sea lento, ineficaz, poco accesible y difícil de mantener haciendo viable su mejora. 
<a name="item9"></a> 
**EVS 2.4.- REALIZACIÓN DEL DIAGNÓSTICO DE LA SITUACIÓN ACTUAL** 
Una vez valorado que el sistema actual es ineficaz, la solución podría pasar por crear una aplicación informática que sustituya el método actual y resuelva, agilice y mejore el proceso de gestión de los proyectos informáticos del curso DIM. 
 
Dicha aplicación, debería ser en entorno web, a la cual se podría acceder desde cualquier ordenador o dispositivo móvil conectado a Internet, con identificación de usuarios mediante diferentes perfiles de acceso y privilegios y con datos almacenados en un Sistema Gestor de Base de Datos centralizado y seguro, lo que garantizaría la integridad y seguridad de los datos. 
 
 
<a name="item10"></a>  	 
**EVS 3.- DEFINICIÓN DE REQUISITOS DEL SISTEMA** 
<a name="item11"></a> 
**EVS 3.1.- IDENTIFICACIÓN DE LAS DIRECTRICES Y TÉCNICAS DE GESTIÓN**
El desarrollo se ajustará a una metodología mixta, basada en MÉTRICA v.3.0 de planificación, análisis, desarrollo y construcción de sistemas de información, así como metodologías ágiles (SCRUM). 
 <a name="item12"></a> 
**EVS 3.2/3.3.- IDENTIFICACIÓN Y CATALOGACIÓN DE REQUISITOS** 
**REQUISITOS FUNCIONALES** 
 
|REQUISITO |FUENTE| DESCRIPCIÓN |PRIORIDAD |
|:---:|:---:|:---:|:---:|
|RF1 |Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING. |El Sistema debe permitir que los usuarios puedan registrarse en el mismo.|Alta |
|RF2|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|La solicitud de registro debe llegar al Administrador que confirmará mediante correo electrónico al usuario su aceptación.|Alta|
|RF3 |Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|El Sistema debe permitir que los usuarios registrados puedan logearse en el mismo.|Alta| 
|RF41|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|El Sistema debe permitir que el usuario administrador autorice el acceso de nuevos usuarios.|Alta|
|RF5|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|Permitirá al usuario administrador dar de alta los nuevos cursos DIM en el Sistema.|Alta|
|RF6|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|El usuario administrador podrá dar de alta nuevos proyectos de las prácticas de los alumnos DIM.|Alta|
|RF7|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|Tras la confirmación por parte del administrador del alta del usuario, se enviará un email de confirmación de alta al usuario.|Alta|
|RF8|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|El Sistema debe permitir a todos los usuarios del mismo, acceder en modo consulta a la información en el disponible.|Alta|
|RF9|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|El Sistema debe permitir a los usuarios alumnos dar de alta/modificar los datos asociados a su proyecto.|Media|
|RF10|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|Debe permitir a los usuarios alumnos poder introducir la diferente documentación y archivos que se generen en su proyecto.|Alta|
|RF11|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|Debe permitir a los usuarios administradores poder introducir la diferente documentación y archivos de cualquier proyecto.|Alta|
|RF12|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|El sistema debe ofrecer la posibilidad de obtener listados de los proyectos, ordenados y filtrados por diferentes criterios.|Alta|
|RF13|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|Debe permitir que los listados obtenidos puedan ser convertidos a formato pdf.|Media|
|RF14|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|El sistema deberá inicialmente importar los proyectos ya existentes en la base de datos documental de Lotus Notes.|Baja|
|RF15|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|Debe aparecer un checkbox en el alta de usuario donde acepte que aparezcan los datos personales aportados dentro de la aplicación.|Media|
**REQUISITOS NO FUNCIONALES** 
|REQUISITO |FUENTE |DESCRIPCIÓN |PRIORIDAD| 
|:---:|:---:|:---:|:---:|
|RNF1 |Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|El Sistema debe funcionar en cualquier ordenador o dispositivo móvil con acceso a Internet. |Alta| 
|RNF2|Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|El Sistema deberá programarse en entorno WEB, con lenguaje Java. |Alta| 
|RNF3 |Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|El Sistema deberá emplear un SGBD relacional de software libre.|Alta| 
|RNF4 |Profesor del Dpto. Sist. Info y Ciberdefensa de la ACING.|Los permisos de acceso al sistema podrán ser cambiados solamente por el administrador de acceso a datos. |Media| 
|RNF5|Jefe Proyecto |El sistema debe proporcionar mensajes de error que sean informativos y orientados a usuario final. |Media|
|RNF6 |Jefe Proyecto |El sistema debe bloquear al usuario que introduzca una contraseña errónea en tres intentos consecutivos. |Media|
|RNF7|Jefe Proyecto |El sistema no debe permitir subir archivos de más de 20 MB. |Alta|
 
**RESTRICCIONES** 
 
Las principales restricciones con las que nos encontramos en este proyecto son la temporal ya que, al tratarse de un proyecto de prácticas, el tiempo está limitado a los 2 meses de duración de la Fase de presente del Curso DIM y la falta de presupuesto económico para abordar cualquier necesidad. 
 <a name="item13"></a> 
**EVS 4.- ESTUDIO DE LAS ALTERNATIVAS DE SOLUCIÓN** 
 <a name="item14"></a> 
**EVS 4.1.- PRESELECCIÓN DE ALTERNATIVAS DE SOLUCIÓN** 
En lo que respecta a las alternativas hardware, se usarán los actuales equipos y servidores de los que dispone el Departamento de Informática ubicados en la Academia de Ingenieros (ACING) de Hoyo de Manzanares (Madrid).

En lo que respecta a las alternativas software: 

**Alternativa 1:**
-	Desarrollo de una aplicación en entrono WEB, en lenguaje Java y PostgresSQL . 
 
**Alternativa 2:**
-	Mejorar la base de datos Lotus Note actual. 

**Alternativa 3:**
-	Utilizar el software comercial Sharepoint de Microsoft. 

  <a name="item15"></a> 
**EVS 4.2.- DESCRIPCIÓN DE LAS ALTERNATIVAS DE SOLUCIÓN** 
**Alternativa 1:**
 	Supone crear una aplicación a medida que se adapte a las necesidades del cliente y que cumpla todos los requisitos funcionales.  
 
Al contar con un gestor de bases de datos de código abierto el gasto sería 0. 
 
A continuación, se describe de forma gráfica el [modelo de negocio del sistema propuesto.](https://git.institutomilitar.com/Patrick/ProyectoEIE/blob/master/Documentos/EVS/imagenes/situacion_final.jpg).


**Alternativa 2:**
 Supone el uso del sistema actual con una serie de mejoras para que se adapte en parte a los requisitos funcionales. El margen de mejora es reducido y se enfocaría en la restricción de edición para el usuario por defecto, la creación de diferentes vistas de ordenación de los proyectos por diversos campos y limitación de tamaño de los documentos a 20 MB.
 
Este sistema se basa en Lotus Notes no adaptándose a la mayoría de las necesidades del cliente y no cumpliendo gran parte de los requisitos funcionales. 
 
Tiene grandes desventajas ya que actualmente este tipo de software no dispone de presupuesto asignado para ser actualizado, por lo que su uso quedará muy restringido y será de costoso mantenimiento. 
 

**Alternativa 3:** 
 Utilización de una aplicación comercial, probada y contrastada. 

 Cumple con la mayor parte de los requisitos funcionales, pero cuenta con varios inconvenientes claros:
	Alto coste (en el ANEXO 2, se encuentra detallado): 
-	Solución Sharepoint online: 4,20€ usuario/mes;
-	Solución on premise: Unos 9.000€ de coste de licencias para 20 usuarios y un servidor.

	Requiere personal que administre, actualice y mantenga la plataforma y por tanto es necesario que tenga conocimientos de la misma.

	Es, de nuevo, una solución comercial que permite poca flexibilidad a la hora de adaptarla o modificarla a posibles necesidades futuras.
 

 A modo de resumen, en el ANEXO 1 se muestra una tabla con la cobertura de requisitos funcionales de las diferentes alternativas aportadas. 
 
En cuanto a los requisitos no funcionales, la única alternativa que los contempla y que los implementaría, es la uno (Desarrollo de un nuevo sistema).
 
 <a name="item16"></a> 
**EVS 5.- DEFINICIÓN DE REQUISITOS DEL SISTEMA** 
 <a name="item17"></a>
**EVS 5.1.- ESTUDIO DE LA INVERSIÓN** 
**Alternativa 1:**   
    Tecnológicamente supone el mayor avance ya que la herramienta que se propone se confeccionará a medida. Ofrece mejoras respecto al antiguo sistema, en lo referente a la posibilidad de realizar búsquedas filtradas por campos, algo que no permite el sistema actual de tipo documental.

Otra de las ventajas que ofrece la construcción de una herramienta web es evitar el actual acceso obligatorio a través de la WAN-PG, lo que permitiría el acceso a la base de datos de personal ajeno al Ministerio de Defensa.
 
La herramienta que se pretende confeccionar estará basada en código abierto y a nivel hardware podría instalarse en un servidor propio de la Academia de Ingenieros, utilizando los sistemas de seguridad perimetral existentes y utilizando el acceso a Internet actual, con lo que el coste podría aproximarse a cero. 
 
Finalmente indicar que, la solución que se propone, en tres capas, facilitaría la escalabilidad y una migración futura a un entorno corporativo del Ministerio de Defensa 
 
**Alternativa 2:** 
 Tecnológicamente no supone avance alguno, ya que el proceso de búsqueda de proyectos sigue siendo manual. 
 
El margen de mejora estaría en una adecuada gestión de usuarios ya que, actualmente, cualquier usuario de la aplicación Lotus Notes puede acceder, modificar y borrar cualquier documento o archivo al contar dicho usuario, por defecto, con privilegios de editor. 
 
Además, se puede realizar la creación de diferentes vistas que muestren los documentos ordenados por los campos que se determinen y limitación de tamaño de ficheros a 20 MB.
 
Lo anterior no impedirá que la falta de mantenimiento termine por hacer inviable el uso de Lotus Notes que actualmente se encuentra sin presupuesto disponible para nuevos desarrollos dentro del Ejército. 

**Alternativa 3:** 
 Tecnológicamente supone un gran avance, al proporcionar un software altamente estable, mantenible y ya contrastado.

La existencia en la aplicación comercial de utilidades que no tienen cabida en los requisitos solicitados por el cliente, deriva en la presencia de funcionalidades que no serán usadas por el cliente y que ralentizarán el uso principal buscado. 
 
El coste de la herramienta comercial es su principal defecto puesto que se debería emplear una media de 10 euros por usuario mensualmente.

Finalmente, no cumple algunos de los requisitos funcionales marcados para este sistema por el cliente, algunos de ellos considerados como muy importantes para el correcto funcionamiento de la aplicación. 
 
 <a name="item18"></a>
**EVS 5.2.- ESTUDIO DE LOS RIESGOS** 
**Alternativa 1:**   
 
El riesgo de puesta en marcha de esta solución sería relativamente bajo y únicamente podría ligarse a la pequeña franja temporal en la que se solicita la finalización del proyecto. 

  El hecho de sufrir algún contratiempo los miembros del equipo o el encontrar dificultades inesperadas en la migración de los datos históricos podrían ser problemas derivados del mencionado en primer lugar.

Existen riesgos relativos a la seguridad, al ser una aplicación que va a estar accesible desde Internet, requiere de medidas que eviten ataques tipo DoS o intentos de accesos malintencionados, teniendo en cuenta que sería una web del Ejército de Tierra, y por tanto uno de los objetivos preferidos por los hackers.
 
 	 
**Alternativa 2:**  
 
Si no se hacen cambios en el sistema actual, el riesgo derivado es alto dada la falta actual de mantenimiento de la base en Lotus Notes. 

Igualmente, de no producirse un cambio en el tipo de acceso actual a través de WAN-PG y Lotus Notes, los usuarios invitados – que no sean alumnos en sí del Diploma en Informática Militar-, por ejemplo, los profesores externos al Ministerio de Defensa o futuros alumnos interesados en desarrollos anteriores, seguirían como hasta la fecha, sin acceso a la misma.


**Alternativa 3:** 
 
El riesgo de esta alternativa es bajo al estar soportada por un software comercial ya implantado en multitud de empresas públicas y privadas, incluido el Ministerio de Defensa, que cuenta con mejoras y actualizaciones periódicas por parte de Microsoft.

El riesgo puede venir principalmente de los costes inesperados del futuro mantenimiento de la plataforma y de los cambios de licenciamiento.

  <a name="item19"></a>
**EVS 5.3.- PLANIFICACIÓN DE ALTERNATIVAS** 
**Alternativa 1 supone:** 
 
1.	Una semana para el estudio de la situación actual. 
2.	Dos semanas para el análisis y diseño del producto.  
3.	1 mes para la construcción de la aplicación. 
4.	Una semana para su implantación, pruebas y confección de un video-tutorial.

**Alternativa 2 supone:**  
 
1.	Una semana para el estudio de la situación actual. 
2.	Una semana para la modificación en la gestión de usuarios
3.	Dos semanas para la creación de vistas y limitar tamaño ficheros.
4.	Una semana para su implantación y pruebas.

**Alternativa 3 supone:**  
 
1.	Una semana para el estudio de la situación actual. 
2.	Dos semanas para el estudio del nuevo producto.
3.	Un mes para su implantación, pruebas.    
4.	Dos semanas de formación a Administradores. 
5.	Una semana para confección de un videotutorial.
  <a name="item20"></a>
**EVS 6.- SELECCIÓN DE LA SOLUCIÓN** 
  <a name="item21"></a>
**EVS 6.1.- CONVOCATORIA DE LA PRESENTACIÓN** 
 Se efectúa la convocatoria de la presentación de las distintas alternativas propuestas, adjuntando los productos de la actividad anterior con el fin de que el Profesor del Departamento Sistemas de Información y Ciberdefensa de la ACING pueda estudiar previamente su contenido. 
 
Para ello, se realizará la presentación en el aula DIM el 29 de abril de 2019, a las 11:10 de la mañana.
   <a name="item22"></a>
**EVS 6.2.- EVALUACIÓN DE LAS ALTERNATIVAS Y SELECCIÓN**
 Se le presentan al Tutor del proyecto, las alternativas propuestas en el apartado 4.1, para una vez debatidas las ventajas e inconvenientes de cada una de ellas, se adopte una solución. 
 
Tras estudiar, analizar y valorar los argumentos del estudio de EVS y las alternativas dadas, se concluye que la mejor opción es el desarrollo de una nueva aplicación para agilizar el acceso filtrado a documentos almacenados en la aplicación, abrir el acceso a usuarios no dados de alta en WAN-PG y Lotus Notes y mejorar la escalabilidad del sistema para futuras ampliaciones. Otros factores tenidos en cuenta positivamente son el coste 0 y el riesgo bajo de implantación.
   <a name="item23"></a>
**EVS 6.3- APROBACIÓN DE LA SOLUCIÓN** 
Una vez finalizado este estudio y presentada la propuesta al Tutor del proyecto, éste aprueba ejecutar la alternativa 1, con lo que autoriza el inicio del desarrollo de una aplicación propia.  
    <a name="item24"></a>
[**ANEXO 1: MATRIZ DE CUMPLIMIENTO DE REQUISITOS**](http://www.sampleurl.com)
   <a name="item25"></a>
[**ANEXO 2: PROPUESTA ECONOMICA ALTERNATIVA 3**](http://www.sampleurl.com)
 





