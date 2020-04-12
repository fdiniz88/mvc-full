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
<title>Sobremesa detalhe</title>
</head>
<body>
	<div class="container">
	 <br>
	  <h2>Cadastrar sobremesa</h2>
	   <br>
	<form action="/sobremesa" method="post">

		
		    <div class="form-group">
      <label for="validade">Validade:</label>
      <input type="datetime-local" class="form-control" id="validade" placeholder="Digitar validade" name="validade" required>
    </div>
    <div class="form-group">
      <label for="tamanho">Tamanho:</label>
      <input type="text" class="form-control" id="tamanho" placeholder="Digitar tamanho" name="tamanho" required>
    </div>
       <div class="form-group">
      <label for="isFeitoHoje">Feito hoje:</label>
      <input type="checkbox" class="form-control" id="isFeitoHoje" name="isFeitoHoje" required>
    </div>  
 <br>
    <input type="submit"  class="btn btn-primary" value="Cadastrar">	
   <a href="/home" class="btn btn-secondary">Voltar</a>
		
		
	</form>
		    </div> 
</body>
</html>


	