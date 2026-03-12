<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <title>Lista de Usuarios</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <div class="contenedor-lista">
        <div class="saludo">
            <div>
                <h2>👥 LISTA DE USUARIOS</h2>
            </div>
            <div>
                <img src="/imagenes/icon-usuario.png" alt="usuario-admin">
            </div>
        </div>

        <h1>ADMINISTRACIÓN DE USUARIOS</h1>

        <div class="tabla-contenedor">
            <#if usuarios?? && usuarios?size gt 0>
                <table class="tabla2">
                    <thead>
                        <tr>
                            <th style="width: 15%;">ID</th>
                            <th style="width: 55%;">Usuario</th>
                            <th style="width: 30%; text-align: center;">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <#list usuarios as usuario>
                            <tr>
                                <td><strong>${usuario.id}</strong></td>
                                <td>${usuario.nombre}</td>
                                <td style="text-align: center;">
                                    <div class="acciones">
                                        <a href="/eliminar-usuario?id=${usuario.id}" class="btn-accion btn-eliminar" title="Eliminar usuario">🗑️ Eliminar</a>
                                    </div>
                                </td>
                            </tr>
                        </#list>
                    </tbody>
                </table>
            <#else>
                <div class="sin-usuarios">
                    <p style="font-size: 48px; margin-bottom: 15px;">📭</p>
                    <p>No hay usuarios registrados en el sistema</p>
                </div>
            </#if>
        </div>

        <div class="botones-footer">
            <a href="/index" class="btn-volver">⬅️ VOLVER AL MENÚ</a>
        </div>
    </div>
</body>
</html>