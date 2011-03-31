<%-- File: grails-app/views/templates/productview.gsp --%>
<g:applyLayout name="twoblocks">
    <head>
        <title>${product.title}</title>
    </head>

    <content tag="left1">
        <h1>${product.title}</h1>

        <p class="product-body">
            <img src="${resource(dir: 'images', file: 'product-image.jpg')}" alt="" width="220" height="220" class="product-image"/>

            ${product.description}
        </p>
    </content>

    <content tag="right1">
        <div id="list-products">
            <h2><g:message code="products.list.newest"/></h2>
            <ul>
                <g:each in="${productList}" var="product">
                    <li>
                        <p>
                            <g:link controller="product" action="view" id="${product.id}">${product.title}</g:link>
                        </p>
                    </li>
                </g:each>
            </ul>
        </div>
    </content>
</g:applyLayout>