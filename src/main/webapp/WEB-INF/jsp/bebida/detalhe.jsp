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
<title>bebida detalhe</title>
</head>
<body>
	
	<div class="container">
	<br>
  <h2>Cadastrar bebida</h2>
  <br>
  <form action="/bebida" method="post">
  
    <div class="form-group">
      <label for="tipo">Tipo:</label>
      <input type="text" class="form-control" id="tipo" placeholder="Digitar tipo" name="tipo" required>
    </div>
    <div class="form-group">
      <label for="marca">Marca:</label>
      <input type="text" class="form-control" id="marca" placeholder="Digitar marcar" name="marcar" required>
    </div>
       <div class="form-group">
      <label for="tamanho">Tamanho:</label>
      <input type="number" class="form-control" id="tamanho" placeholder="Digitar tamanho" name="tamanho" required>
    </div>
<!--        <div class="form-group">
      <label for="id_produto">Número do produto:</label>
      <input type="number" class="form-control" id="id_produto" placeholder="Digitar número do produto" name="id_produto" required>
    </div> -->
    	<br>
    <input type="submit"  class="btn btn-primary" value="Cadastrar">	
 <a href="/home" class="btn btn-secondary">Voltar</a>
  </form>
</div>			
</body>
</html>