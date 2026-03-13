<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Crear Equipo</title>
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

            <h1>CREAR EQUIPO</h1>

            <form action="/equipos/crear" method="post">

                <div class="input">
                    <label for="nombre">Nombre del Equipo</label>
                    <input type="text" id="nombre" name="nombre" placeholder="Introduce el nombre del equipo" required>
                </div>

                <div class="input">
                    <label for="liga">Liga a la que pertenece</label>
                    <select id="liga" name="ligaId" required>
                        <option value="">Selecciona una liga</option>
                        <#list ligas as liga>
                            <option value="${liga.id}">${liga.nombre}</option>
                        </#list>
                    </select>
                </div>

                <div class="buttons-group">
                    <button type="submit">CONTINUAR</button>

                    <a href="/index">
                        <button type="button" class="salir">CANCELAR</button>
                    </a>
                </div>

            </form>

        </div>
    </div>
</div>
</body>
</html>
