<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>lista usuarios</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <div class="saludo">
        <h2>MENÚ</h2>
        <img src="imagenes/icon-usuario.png" alt="usuario-admin">
    </div>
    <div>
    <div>
        <h1>LISTA DE USUARIOS</h1>
    </div>
    <div class="tabla">
        <table class="tabla">
             <#list usuarios as usuario>
            <tr>
                <th><p>${usuario.id}</p></th>
                <th><p>${usuario.nombre}</p></th>
                <th><p>${usuario.contra}</p></th>
            </tr>
            </#list>
        </table>
    </div>
    <br>
    <a href="/index">
        <button class="medio">VOLVER</button>
    </a>
</body>
</html>