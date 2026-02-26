<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="../../src/main/resources/public/css/styles.css">
</head>
<body>
    <div class="contenedor">
        <img src="imagenes/pelota-volei.png">
        <h3>Liga Voleibol</h3>
        <p>Descripción breve</p>
        <div class="login">
            <h1>Iniciar Sesión</h1>
            <form action="index-admin.html" method="GET">
                <div class="input">
                    <label for="email">Email</label>
                    <input type="email" id="email" value="${usuarioCreado.email}" required>
                </div>

                <div class="input">
                    <label for="password">Contraseña</label>
                    <input type="password" id="password" value="${usuarioCreado.contra}" required>
                </div>

            <#if ${error}>
                <a href="/">
            <#else>
            <a href="/index"><button type="submit">Iniciar sesión</button></a>
                
            </#if>
            </form>

            <div class="links">
                <a href="#">¿Olvidaste tu contraseña?</a>
                <br>
                <a href="registro.html">Registrarse</a>
            </div>
        </div>
    </div>
</body>
</html>