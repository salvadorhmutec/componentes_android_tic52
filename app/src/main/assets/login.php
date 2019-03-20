<?php
include ("conexion.php");

$users = mysqli_query($conexion, "SELECT usuario, tipo_usuario 
FROM login
WHERE usuario = '".$_POST['usuario']."' 
AND password = '".$_POST['pass']."'");

if($users->num_rows == 1):
    $datos = mysqli_fetch_array($users, MYSQLI_ASSOC);
    echo json_encode(array('error' => false , 'tipo' => $datos['tipo_usuario']));
else:
    echo json_encode(array('error' =>  true));     
endif;

mysqli_close($conexion);

?>
