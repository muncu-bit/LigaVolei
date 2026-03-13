<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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

                <!-- ⭐ Ruta corregida -->
                <form action="/liga/${liga.id}/editar" method="post" enctype="multipart/form-data">

                    <div class="input">
                        <label for="nombre-actual">Nombre actual de la Liga</label>
                        <input type="text" id="nombre-actual" name="nombreActual"
                               value="${liga.nombre}" readonly>
                    </div>

                    <div class="input">
                        <label for="nombre-nuevo">Nuevo nombre de la Liga</label>
                        <input type="text" id="nombre-nuevo" name="nombreNuevo"
                               placeholder="Ingresa el nombre nuevo" required>
                    </div>

                    <div class="input">
                        <label for="descripcion">Descripción</label>
                        <textarea id="descripcion" name="descripcion"
                                  placeholder="Ingresa la descripción">${liga.descripcion!""}</textarea>
                    </div>



                    <div class="buttons-group">
                        <button type="submit">GUARDAR CAMBIOS</button>

                        <a href="/ligas">
                            <button type="button" class="salir">CANCELAR</button>
                        </a>
                    </div>

                </form>

            </div>
        </div>
    </div>
</body>
</html>
