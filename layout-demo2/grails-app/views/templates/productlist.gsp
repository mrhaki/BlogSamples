<%-- File: grails-app/views/templates/productlist.gsp --%>
<html>
<head>
    <meta content="oneblock" name="layout"/>
    <title><g:message code="title.product.list"/></title>
</head>
<body>
<content tag="main1">
    <h1><g:message code="products.list"/></h1>
    <ul class="product-list">
        <g:each in="${productList}" var="product">
            <li>
                <g:link action="view" id="${product.id}">
                    <img src="${resource(dir: 'images', file: 'product-image.jpg')}" alt="" width="100" height="100" class="product-image"/>
                </g:link>
                <span class="product-details">
                    <h2><g:link action="view" id="${product.id}">${product.title}</g:link></h2>
                    <p class="product-description">
                        ${product.description}
                    </p>
                </span>
            </li>
        </g:each>
    </ul>
</content>
</body>
</html>