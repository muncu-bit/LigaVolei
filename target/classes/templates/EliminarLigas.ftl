<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de Ligas</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>

<body>
<div class="contenedor-equipo">
    <div class="caja">
        <div class="header">
            <input type="checkbox" id="menu-check">
            <label for="menu-check" class="menu-icono">☰</label>
            <nav class="nav-menu">
                <ul>
                    <li><a href="#">Inicio</a></li>
                    <li><a href="#">Servicios</a></li>
                    <li><a href="#">Contacto</a></li>
                </ul>
            </nav>
        </div>

        <h2>ELIMINAR LIGAS</h2>

        <div class="lista">

            <#list ligas as liga>
                <div class="fila">
                    <div>🏐</div>

                    <div class="nombre-liga">
                        ${liga.nombre}
                    </div>

                    <form action="/ligas/${liga.id}/eliminar" method="post">
                        <button class="botTabla">Eliminar</button>
                    </form>
                </div>
            </#list>

        </div>

        <a href="/index">
            <button class="boton-volver">↩</button>
        </a>
    </div>
</div>
</body>
</html>
