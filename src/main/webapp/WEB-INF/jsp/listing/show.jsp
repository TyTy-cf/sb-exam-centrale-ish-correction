<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../tag.jsp" %>
<c:set var="title" scope="request" value="Vente #${listing.id}"/>
<jsp:include flush="true" page="${contextPath}/WEB-INF/jsp/base.jsp"/>

<div class="container mt-3">
    <h1>${listing.title}</h1>
    <div class="row mt-sm-3">
        <div class="col-md-6 col-sm-12 mt-sm-3">
            <img class="img-fluid" src="${listing.image}">
        </div>
        <div class="col-md-6 col-sm-12 mt-sm-3">
            <table class="table table-striped">
                <tbody>
                    <tr>
                        <th>Marque</th>
                        <td>${listing.model.brand.name}</td>
                    </tr>
                    <tr>
                        <th>Modèle</th>
                        <td>${listing.model.name}</td>
                    </tr>
                    <tr>
                        <th>Année</th>
                        <td>${listing.producedYear}</td>
                    </tr>
                    <tr>
                        <th>Kilométrage</th>
                        <td>${listing.mileage}</td>
                    </tr>
                    <tr>
                        <th>Prix</th>
                        <td>${listing.price/100}€</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>

    <h2 class="mt-sm-3">Description</h2>
    <p>${listing.description}</p>
</div>

<%@ include file="../footer.jsp" %>
