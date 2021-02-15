<%@ include file="shared/header.jspf"%>
<%@ include file="shared/navigation.jspf"%>

<div class="container">
    <h2> This is the form we created to type text: </h2>
    <form method="POST" action="/type-text.do">
        <fieldset class="form-group">
            <label>Type Text</label> <input name="text" type="text"
                                            class="form-control" /> <BR />
        </fieldset>

        <input name="add" type="submit" class="btn btn-success" value="Submit" />
    </form>
</div>

<%@ include file="shared/footer.jspf"%>
