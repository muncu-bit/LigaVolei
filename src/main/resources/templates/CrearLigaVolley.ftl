<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Liga</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>

<body>
    <div class="contenedor-equipo">
        <div class="contenedor">
            <div class="form-container">

                <h2>CREAR LIGA</h2>

                <form action="/liga/crear" method="post" enctype="multipart/form-data">

                    <div class="input">
                        <label for="nombre">Nombre de la Liga</label>
                        <input type="text" id="nombre" name="nombre" placeholder="Ingresa el nombre" required>
                    </div>

                    <div class="input">
                        <label for="descripcion">Descripción</label>
                        <textarea id="descripcion" name="descripcion" placeholder="Ingresa la descripción"></textarea>
                    </div>

                    <div class="input">
                        <label>Foto de Liga</label>
                        <input type="file" id="foto" name="foto" accept="image/*">
                    </div>



                    <div class="buttons-group">
                        <button type="submit">CREAR</button>

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