<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${equipo.nombre}</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>

<body>

<div class="contenedor-pagina">


    <div class="pagina-equipo">

        <h1 class="titulo-equipo">${equipo.nombre}</h1>

      <section class="seccion">
          <h2 class="seccion-titulo">Formación Titular</h2>

          <div class="formacion-grid">
              <#list jugadores as jugador>
                  <div class="formacion-card">
                      <span class="formacion-nombre">${jugador.nombre}</span>
                  </div>
              </#list>
          </div>
      </section>


        <section class="seccion">
            <h2 class="seccion-titulo">Jugadores</h2>
            <div class="jugadores-grid">
                <#list jugadores as jugador>
                    <div class="jugador-card">
                        <h3 class="jugador-nombre">${jugador.nombre}</h3>
                        <p class="jugador-edad">Edad: ${jugador.edad} años</p>
                        <p class="jugador-desc">${jugador.descripcion}</p>
                    </div>
                </#list>
            </div>
        </section>


            <a href="/ligas" class="boton-volver">Volver</a>

        </div>

    </div>

</div>

</body>
</html>
