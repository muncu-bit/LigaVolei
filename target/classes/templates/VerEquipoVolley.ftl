<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>verEquipo</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>

<body>

<div class="contenedor-principal">

<div class="contenedor-equipo">

<div class="header">
    <h2>${equipo.nombre}</h2>
</div>

<h3>Formación Titular</h3>

<div class="formacion">

<#list jugadores as jugador>
    <div class="caja-imagen">
        <img src="${jugador.imagen}">
    </div>
</#list>

</div>

<h3>Jugadores</h3>

<div class="jugadores">

<#list jugadores as jugador>

<div class="jugador">

<div class="jugador-img">
    <img src="${jugador.imagen}">
</div>

<div class="info-jugador">

<div class="jugador">
    ${jugador.nombre}
</div>

<div class="jugador-desc">
    ${jugador.descripcion}
</div>

</div>

</div>

</#list>

</div>

<div class="buttons">

<a href="/equipos/${equipo.ligaId}">
    <button class="salir">Volver</button>
</a>

<a href="/equipos/siguiente/${equipo.id}">
    <button class="siguiente">Siguiente Equipo</button>
</a>

</div>

</div>

</div>

</body>
</html>