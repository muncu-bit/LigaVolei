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
                           <li><a href="#">Inicio</a></li>
                           <li><a href="#">Ligas</a></li>
                           <li><a href="#">salir</a></li>
                        </ul>
                    </nav>
                </div>
                <h1>EDITAR Liga</h1>
                <div class="input"
                   <label for="nombre-actual">Nombre actual de la Liga</label>
                   <input type="text" id="nombre-actual" placeholder="Ingresa el nombre actual">
                </div>
                <div class="input">
                   <label for="nombre-nuevo">Nuevo nombre de la Liga</label>
                   <input type="text" id="nombre-nuevo" placeholder="Ingresa el nombre Nuevo">
                </div>
                <div class="input">
                   <label for="descripción">Descripción</label>
                   <textarea id="descripción" placeholder="Ingresa la descripción"></textarea>
                </div>
                <div class="input">
                   <label for="foto">Foto de la Liga</label>
                   <input type="file" id="foto" accept="image/*" >
                </div>
                <div class="buttons-group">
                   <button>GUARDAR CAMBIOS</button>
                   <a href="/index">
                    <button class="salir">CANCELAR</button>
                   </a>
        </div>


     </div>

    </div>

    </body>
</html>