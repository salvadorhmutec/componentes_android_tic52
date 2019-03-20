<?php
	$server = "127.0.0.1";
	$user = "root";
	$password = "1405";
	$bd = "sistema_gmg";

	$conexion = mysqli_connect($server, $user, $password, $bd);
	if (!$conexion){ 
		die('Error de Conexión: ' . mysqli_connect_errno());	
	}	
?>

