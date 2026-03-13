<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Eliminar Equipos</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>

<body>

<div class="contenedor-equipo">
    <div class="contenedor-eliminar">
        <div class="form-container">




            <div class="lista">
                <#list equipos as equipo>
                    <div class="fila">
                        <span>${equipo.nombre}</span>

                        <form action="/equipo/${equipo.id}/eliminar" method="post">
                            <button class="botTabla" type="submit">ELIMINAR</button>
                        </form>
                    </div>
                </#list>
            </div>


            <a href="/index">
                <button class="medio">VOLVER</button>
            </a>

        </div>
    </div>
</div>

</body>
</html>
