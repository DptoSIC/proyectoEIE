var proyectos = [
  {
    idProyecto: "DIM001",
    titulo: "La gestión de las urnas en elecciones",
    desCorta: "Esta es la descripción corta DIM001...abcdefghijklmnopqrstuv",
    nomCurso: "DIM",
    estado: "abierto"
  },
  {
    idProyecto: "DIM002",
    titulo: "titulo 1",
    desCorta: "DIM002....",
    nomCurso: "DIM",
    estado: "cerrado"
  },
  {
    idProyecto: "NBQ001",
    titulo: "titulo 2",
    desCorta: "NBQ001....",
    nomCurso: "NBQ",
    estado: "abierto"
  },
  {
    idProyecto: "NBQ002",
    titulo: "titulo 3",
    desCorta: "NBQ002....",
    nomCurso: "NBQ",
    estado: "abierto"
  },
  {
    idProyecto: "CI0001",
    titulo: "titulo 4",
    desCorta: "CI0001....",
    nomCurso: "CIBERDEFENSA",
    estado: "cerrado"
  },
  {
    idProyecto: "EW0001",
    titulo: "titulo 5",
    desCorta: "EW0001....",
    nomCurso: "GUERRA ELECTRONICA",
    estado: "abierto"
  }
];

function getproyectos() {
  return proyectos;
}

var longitud = getproyectos().length;

function genera_tabla() {
  //Primero limpiamos el espacio;
  var numTablas = document.querySelector("table");
  if (numTablas == null) {
    // Obtener la referencia del elemento body

    //	var body = document.getElementsByTagName('body')[0];
    //	var espacioTabla=document.createElement("div");
    //	var espacioT=body.appendChild(espacioTabla);

    var espacioTabla = document.querySelector(".container-table100");

    // Crea un elemento <table> y un elemento <tbody>
    var tabla = document.createElement("table");
    var tblBody = document.createElement("tbody");

    //Crear cabecera tabla
    var cabecera = document.createElement("tr");
    cabecera.style.backgroundColor = "darkgreen";
    cabecera.style.color = "white";

    // Celda de datos.
    var celda1 = document.createElement("td");
    var textoCelda = document.createTextNode("Código Proyecto");
    celda1.appendChild(textoCelda);
    cabecera.appendChild(celda1);

    var celda2 = document.createElement("td");
    var textoCelda = document.createTextNode("Título");
    celda2.appendChild(textoCelda);
    cabecera.appendChild(celda2);

    var celda3 = document.createElement("td");
    var textoCelda = document.createTextNode("Descripción");
    celda3.appendChild(textoCelda);
    cabecera.appendChild(celda3);

    var celda4 = document.createElement("td");
    var textoCelda = document.createTextNode("Nombre Curso");
    celda4.appendChild(textoCelda);
    cabecera.appendChild(celda4);

    var celda5 = document.createElement("td");
    var textoCelda = document.createTextNode("Estado");
    celda5.appendChild(textoCelda);
    cabecera.appendChild(celda5);

    var celda6 = document.createElement("td");
    var textoCelda = document.createTextNode("Editar");
    celda6.appendChild(textoCelda);
    cabecera.appendChild(celda6);

    var celda7 = document.createElement("td");
    var textoCelda = document.createTextNode("Consultar");
    celda7.appendChild(textoCelda);
    cabecera.appendChild(celda7); 

    var celda8 = document.createElement("td");
    var textoCelda = document.createTextNode("Eliminar");
    celda8.appendChild(textoCelda);
    cabecera.appendChild(celda8); 

    tblBody.appendChild(cabecera);

    // Crea las celdas
    for (var i = 0; i < longitud; i++) {
      // Crea las hileras de la tabla
      var hilera = document.createElement("tr");

      var celdaBotonE = document.createElement("td");
      celdaBotonE.width = "1.0cm";
      var botonE = document.createElement("button");
      botonE.classList.add("botonE", "btn", "btn-outline-primary");
      botonE.innerText="Editar";
      celdaBotonE.appendChild(botonE);

      var celdaBotonC = document.createElement("td");
      celdaBotonC.width = "1.0cm";
      var botonC = document.createElement("button");
      botonC.classList.add("botonC", "btn", "btn-outline-success");
      botonC.innerText="Consultar";
      celdaBotonC.appendChild(botonC);

      var celdaBotonD = document.createElement("td");
      celdaBotonD.width = "1.0cm";
      var botonD = document.createElement("button");
      botonD.classList.add("botonD", "btn", "btn-outline-dark");
      botonD.innerText="Eliminar";
      celdaBotonD.appendChild(botonD);

      for (var j = 0; j < 5; j++) {
        // Crea un elemento <td> y un nodo de texto, haz que el nodo de
        // texto sea el contenido de <td>, ubica el elemento <td> al final
        // de la hilera de la tabla
        var celda = document.createElement("td");
        var textoArray = [
          proyectos[i].idProyecto,
          proyectos[i].titulo,
          proyectos[i].desCorta,
          proyectos[i].nomCurso,
          proyectos[i].estado
        ];
        var textoCelda = document.createTextNode(textoArray[j]);
        celda.appendChild(textoCelda);
        hilera.appendChild(celda);
      }
      hilera.appendChild(celdaBotonE);
      hilera.appendChild(celdaBotonC);
      hilera.appendChild(celdaBotonD);

      // agrega la hilera al final de la tabla (al final del elemento tblbody)
      tblBody.appendChild(hilera);
    }

    // posiciona el <tbody> debajo del elemento <table>
    tabla.appendChild(tblBody);
    // appends <table> into <body>
    espacioTabla.appendChild(tabla);
    // modifica el atributo "border" de la tabla y lo fija a "2";
    tabla.setAttribute("border", "2");
  }
}

function limpiarConsulta() {
  var ocultar = document.querySelector(".container-table100");
  if (ocultar.firstChild !== null) {
    ocultar.firstChild.remove();
  }
}

