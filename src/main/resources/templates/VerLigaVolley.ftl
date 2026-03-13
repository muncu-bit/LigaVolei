<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>VerLiga</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>

<body>

<div class="contenedor-equipo">

<div class="caja-liga">

<div class="barra-superior">

<select onchange="location=this.value">

<#list ligas as liga>
<option value="/liga/${liga.id}" <#if liga.id == ligaActual.id>selected</#if>>
    ${liga.nombre}
</option>

</#list>

</select>

</div>

<div class="contenedor-tabla">

<table>

<tr>
<th class="ranking">Ranking</th>
<th>V</th>
<th>D</th>
<th>PT</th>
</tr>

<#list equipos as equipo>

<tr>
<td>${equipo.nombre}</td>
<td>${equipo.victorias}</td>
<td>${equipo.derrotas}</td>
<td>${equipo.puntos}</td>
</tr>

</#list>

</table>

</div>

<a href="/index">
<button class="boton-volver">↩</button>
</a>

</div>

</div>

</body>
</html>