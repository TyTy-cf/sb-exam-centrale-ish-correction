<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="tag.jsp" %>
<c:set var="title" scope="request" value="Listings"/>
<jsp:include flush="true" page="${contextPath}/WEB-INF/jsp/base.jsp"/>

<div class="container">
    <h1>Les dernières ventes</h1>
    <div class="row">
        <c:forEach items="${listings}" var="listing">
            <a class="col-md-4 mt-5 main-listing-card" href="${UrlRoute.URL_LISTING}/${listing.id}">
                <div class="listing-card">
                    <div class="listing-card-img">
                        <img alt="${listing.id}" src="${listing.image}">
                    </div>
                    <div class="d-flex justify-content-between">
                        <p>${listing.model.brand.name} ${listing.model.name}</p>
                        <p>
                                ${listing.mileage}km</br>
                                ${listing.price/100}€
                        </p>
                    </div>
                </div>
            </a>
        </c:forEach>
    </div>
</div>

<%@ include file="footer.jsp" %>
