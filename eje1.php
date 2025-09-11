<?php 

$activo = true; 
$nombre = readline("Ingrese su nombre: ");
$edad = readline("Ingrese su edad: ");

$vip = readline("Es VIP (Sí es 1 / No es 0): ");

if ($edad <= 59 && $vip == 0){
    echo "Bienvenido, $nombre No tienes descuento.";
}
elseif ($edad >= 60 || $vip == 1) {
    echo "Bienvenido, $nombre Tienes descuento.";
}
