<!DOCTYPE html>
<html lang="es">
<link rel="stylesheet" href="/../css/styles.css">
<head>
    <link rel="stylesheet" href="/Styyyless.css">
    <meta charset="UTF-8">
    <title>Lista de Ligas</title>
</head>

<body>

<div class="caja">

    <div class="header">

        <input type="checkbox" id="menu-check">
        <label for="menu-check" class="menu-icono">☰</label>

        <nav class="nav-menu">
            <ul>
                <li><a href="/">Inicio</a></li>
                <li><a href="/ligas">Ligas</a></li>
            </ul>
        </nav>

    </div>

    <h2>LISTA DE LIGAS</h2>

    <div class="lista">

        <#list ligas as liga>
            <div class="fila">

                <div>🏐</div>

                <div class="nombre-liga">
                    <a href="/liga/${liga.id}">
                        ${liga.nombre}
                    </a>
                </div>

            </div>
        </#list>

    </div>

    <div class="boton-volver">
        <a href="/">↩</a>
    </div>

</div>

</body>
</html>