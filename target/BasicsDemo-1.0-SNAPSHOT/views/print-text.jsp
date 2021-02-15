<%@ include file="shared/navigation.jspf"%>
<%@ include file="shared/header.jspf"%>

<div class="container">
<table class="table table-striped">
    <caption><h2>Here we have our print text page!</h2> </caption>
    <thead>
    </thead>
    <tbody>
    <c:forEach items="${texts}" var="text">
        <tr>
            <td>${text.nameText}</td>
            <td> <a class="btn btn-danger"
                    href="/delete-text.do?text=${text.nameText}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<a class="btn btn-success" href="/type-text.do">Type another Text</a>
</div>
<%@ include file="shared/footer.jspf"%>

