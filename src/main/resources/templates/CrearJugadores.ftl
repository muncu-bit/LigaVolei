<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Crear Jugadores</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>

<body>
<div class="contenedor-equipo">
    <div class="contenedor-dejugadores">
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

            <h1>CREAR JUGADORES</h1>

            <form action="/jugadores/crear" method="post">

                <input type="hidden" name="equipoId" value="${equipoId}">

                <#list 1..6 as i>
                    <div class="bloque-jugador">

                        <h3>Jugador ${i}</h3>

                        <div class="input">
                            <label>Nombre</label>
                            <input type="text" name="nombreJugador[]" placeholder="Nombre del jugador" required>
                        </div>

                        <div class="input">
                            <label>Edad</label>
                            <input type="number" name="edadJugador[]" min="10" max="60" placeholder="Edad" required>
                        </div>

                        <div class="input">
                            <label>Descripción</label>
                            <textarea name="descripcionJugador[]" placeholder="Descripción del jugador"></textarea>
                        </div>

                    </div>
                </#list>

                <div class="buttons-group">
                    <button type="submit">GUARDAR JUGADORES</button>

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
