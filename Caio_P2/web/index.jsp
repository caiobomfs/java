<%-- 
    Document   : index
    Created on : 26/11/2020, 22:24:31
    Author     : caiob
--%>

<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TITULO AQUIIIII</title>
    </head>
    <body>
        <header>
            <h3>
                ADS M Caio
            </h3>
        </header>
        <section>
            <h2>
                Insira a nota dos seus alunos!
            </h2>
            <form action="ServletMedia" method="POST">
                <span>Nota 1:</span>
                <input type="text" name="a"/>
                <span>Nota 2:</span>
                <input type="text" name="b"/>
                <span>Nota 3:</span>
                <input type="text" name="c"/>
                <input type="submit" value="Calcular" />
            </form>
        </section>
    </body>
</html>