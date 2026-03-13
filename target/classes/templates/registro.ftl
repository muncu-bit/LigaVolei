<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <div class="contenedor">
        <img src="imagenes/pelota-volei.png">
        <h3>Liga Voleibol</h3>
        <p>Descripción breve</p>
        <div class="registro">
            <h1>Registrarse</h1>
            <form>
                <div class="input">
                    <label for="usuario">Nombre de usuario</label>
                    <input type="text" id="usuario" name="usuario" placeholder="FLorca" required>
                </div>

                <div class="input">
                    <label for="email">Email</label>
                    <input type="email" id="email" name="email" placeholder="nombre@ejemplo.com" required>
                </div>

                <div class="input">
                    <label for="password">Contraseña</label>
                    <input type="password" id="password" name="password" placeholder="**********" required>
                </div>

                <div class="input">
                    <label for="confirm-password">Confirmar contraseña</label>
                    <input type="password" id="confirm-password" id="confirm-password" placeholder="**********" required>
                </div>

                <button type="submit">Registro</button>
                <button type="reset">Cancelar</button>
            </form>

            <div class="link">
                <p>Ya tienes una cuenta? <a href="/">Inicia sesión</a></p>
            </div>
        </div>
    </div>
</body>
</html>