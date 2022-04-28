<%--
  Created by IntelliJ IDEA.
  User: seynabou
  Date: 27/04/22
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <!-- CSS only -->
    <title>Formulaire de Produits</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<form>

    <div class="mb-3">
        <label for="nom" class="form-label container">Nom Produit</label>
        <input type="text" class="form-control" id="nom" name="nom">
    </div>
    <div class="mb-3">
        <label for="code" class="form-label">Code Produit</label>
        <input type="text" class="form-control" id="code" name="code">
    </div>
    <div class="mb-3">
        <label for="description" class="form-label">Description Produit</label>
        <input type="text" class="form-control" id="description" name="description">
    </div>
    <div class="mb-3">
        <label for="prix" class="form-label">Prix Produit</label>
        <input type="text" class="form-control" id="prix" name="prix">
    </div>
    <div class="mb-3">
        <label for="dateC" class="form-label">Date de Creation</label>
        <input type="text" class="form-control" id="dateC" name="dateC">
    </div>
    <div class="mb-3">
        <label for="dateE" class="form-label">Date d'Expiration</label>
        <input type="text" class="form-control" id="dateE" name="dateE">
    </div>

    <button type="submit" class="btn btn-primary">Enregistrer</button>

</form>
</body>
</html>
