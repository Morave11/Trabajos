<?php
echo ("¡¡Bienvenido a la asistencia!!". "\n");
$nombre = readline("Ingrese su nombre completo: ");
$asistencia = readline("¿Asistió a la reunión? (Sí es 1 / No es 0): ");
$miembro = readline("¿Es miembro del comité? (Sí es 1 / No es 0): ");

if ($asistencia == 1 && $miembro == 1) {
    echo "Gracias por asistir, $nombre. puedes Votar";
} 
elseif ($asistencia == 1 && $miembro == 0) {
    echo "Gracias por asistir, $nombre. No puedes Votar";
}
else {
    echo "$nombre, No asististe a la reunión.";
}