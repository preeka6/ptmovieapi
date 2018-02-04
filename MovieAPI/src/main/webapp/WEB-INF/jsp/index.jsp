<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"></jsp:include>

<h3>Add Movie</h3>
<br>
<form action='/index/add' method='post'>
 
    <table class='table table-hover table-responsive table-bordered'>
 
        <tr>
            <td><b>ID</b></td> 
            <td><input type='text' name='id' class='form-control' size="10" required/></td>
        </tr>
 
        <tr>
            <td><b>Title</b></td>
            <td><input type='text' name='title' class='form-control' size="30" required /></td>
        </tr>
 
        <tr>
            <td><b>Director</b></td>
            <td><input type='text' name='director' class='form-control' size="20" required/></td>
            
        </tr>
 
 
        <tr>
            <td></td>
            <td>
                <button type="submit" class="btn btn-primary">Add</button>
            </td>
        </tr>
 
    </table>
    <b><c:out value="${danger}"></c:out></b>
</form>



<h3>List Of Movies</h3>
<br>
<table class="table table-hover">

    <thead>
      <tr>
        <th><b>ID</b></th>
        <th><b>Title</b></th>
        <th><b>Director</b></th>
        <th><b>Transactions</b></th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="lom">
      <tr>
        <td><c:out value="${lom.id}"></c:out></td>
        <td><c:out value="${lom.title}"></c:out></td>
        <td><c:out value="${lom.director}"></c:out></td>

			 <td>
             <a href="/index/${lom.id1}/edit">
                <button type="submit" class="btn btn-primary">Edit Movie</button>
                </a>
            </td>
            <td>
             <a href="/index/${lom.id1}/delete">
                <button type="submit" class="btn btn-primary">Delete Movie</button>
                </a>
            </td>
      </tr>

          </c:forEach>
    </tbody>
  </table>
</div>

<jsp:include page="footer.jsp"></jsp:include>