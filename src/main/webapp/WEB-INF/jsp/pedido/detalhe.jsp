<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>pedido detalhe</title>
</head>
<body>
	<div class="container">
	 <br>
	  <h2>Cadastrar pedido</h2>
	   <br>
	<form action="/pedido" method="post">
	
	 <div class="form-group">
      <label for="descricao">Descri��o:</label>
      <input type="text" class="form-control" id="descricao" placeholder="Digitar descri��o" name="descricao" required>
    </div>
   <div class="form-group">
      <label for="idCiente">N�mero do cliente:</label>
      <input type="number" class="form-control" id="idCiente" placeholder="Digitar n�mero do cliente" name="idCiente" required>
    </div> 
     <br>
    <input type="submit"  class="btn btn-primary" value="Cadastrar">	
  <a href="/home" class="btn btn-secondary">Voltar</a>
		
	</form>

</body>
</html>