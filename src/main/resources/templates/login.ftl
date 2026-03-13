<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="/../css/styles.css">
</head>
<body>
    <div class="contenedor">
        <img src="imagenes/pelota-volei.png">
        <h3 class="verde">Liga Voleibol</h3>
        <div class="login">
            <h1>Iniciar Sesión</h1>

            <form action="/" method="POST">
                <div class="input">
                    <label for="email">Email</label>
                    <input type="email" id="email" name="email" placeholder="nombre@ejemplo.com" required>
                </div>

                <div class="input">
                    <label for="password">Contraseña</label>
                    <input type="password" id="password" name="password" placeholder="**********" required>
                </div>
                <button type="submit">Iniciar sesión</button>

            </form>

            <div class="links">
                <a href="/registro">Registrarse</a>
            </div>
        </div>
    </div>
</body>
</html>
