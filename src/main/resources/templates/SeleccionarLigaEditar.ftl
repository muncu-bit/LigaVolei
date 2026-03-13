<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Editar Liga</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>

<body>

<div class="contenedor-equipo">
    <div class="contenedor">
        <div class="form-container">


            <div class="saludo">
                <input type="checkbox" id="menu-check">
                <label for="menu-check" class="menu-icono">☰</label>

                <nav class="nav-menu">
                    <ul>
                        <li><a href="/index">Inicio</a></li>
                        <li><a href="/ligas">Ligas</a></li>
                        <li><a href="/logout">Salir</a></li>
                    </ul>
                </nav>
            </div>

            <h1>EDITAR LIGA</h1>

            <p class="descripcion">
                Selecciona la liga que deseas editar:
            </p>


           <div class="lista">
               <#list ligas as liga>
                   <div class="fila">
                       <a href="/liga/${liga.id}/editar">
                           ${liga.nombre}
                       </a>
                   </div>
               </#list>
           </div>



            <div class="buttons-group">
                <a href="/index">
                    <button type="button" class="salir">VOLVER</button>
                </a>
            </div>

        </div>
    </div>
</div>

</body>
</html>
