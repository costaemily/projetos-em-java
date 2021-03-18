<?php
	$valor1 = $_POST['valor1'];
	$valor2 = $_POST['valor2'];

	if($opcao == 'Dolar'){
		$conversao = $valor * 3.13;
	}else{
		$conversao = $valor / 3.13;
	}
	echo "Valor convertido em $opcao: $conversao";
?>