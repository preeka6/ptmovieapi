<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<<jsp:include page="header.jsp"></jsp:include>

<div class="container">

<h3>Add Movie</h3>
<form action='/index/update' method='post'>
 
    <table class='table table-hover table-responsive table-bordered'>
 
        <tr>
            <td><b>ID</b></td>
            <td><input type='text' name='id' class='form-control' size="10" value="${movie.id}" /></td>
        </tr>
 
        <tr>
            <td><b>Title</b></td>
            <td><input type='text' name='title' class='form-control' size="30" value="${movie.title}" /></td>
        </tr>
 
        <tr>
            <td><b>Director</b></td>
            <td><input type='text' name='director' class='form-control' size="20" value="${movie.director}" /></td>
            
        </tr>
 
 			<input type='hidden' id='id1' rows='5' class='form-control' name='id1' value="${movie.id1}"/>
        <tr>
            <td></td>
            <td>
                <button type="submit" class="btn btn-primary">Update Movie Information</button>
            </td>
        </tr>
 
    </table>
</form>


</div>

<jsp:include page="footer.jsp"></jsp:include>