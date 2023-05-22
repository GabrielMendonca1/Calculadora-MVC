
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Divisão</title>
</head>
<body>
    <form action="CalculatorController" method="post">
        <input type="text" name="dividend" placeholder="Dividendo" required>
        <input type="text" name="divisor" placeholder="Divisor" required>
        <button type="submit">Dividir</button>
    </form>
    <c:if test="${not empty requestScope['result']}">
    
        <h2>Resultado: ${requestScope['result']}</h2>
    </c:if>
    <c:if test="${not empty requestScope['error']}">
        <h2>Erro: ${requestScope['error']}</h2>
    </c:if>
</body>
</html>
    