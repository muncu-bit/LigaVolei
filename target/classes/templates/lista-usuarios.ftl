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
            <h2>Lista USUARIOS</h2>
        </div>
        <div class="tabla-contenedor">
            <#if usuarios?? && usuarios?size gt 0>
                <table class="tabla2">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Usuario</th>
                            <th style="text-align: center;">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <#list usuarios as usuario>
                            <tr>
                                <td><strong>${usuario.id}</strong></td>
                                <td>${usuario.nombre}</td>
                                <td>
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
                    <p>No hay usuarios registrados</p>
                </div>
            </#if>
        </div>

        <div class="botones-footer">
            <a href="/index" class="btn-volver">⬅️ VOLVER AL MENÚ</a>
        </div>
    </div>
</body>
</html>