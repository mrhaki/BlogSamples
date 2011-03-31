<%-- File: grails-app/views/templates/homepage.gsp --%>
<g:applyLayout name="fiveblocks">
    <head>
        <title><g:message code="title.homepage"/></title>
    </head>

    <content tag="banner">
        <h1>Welcome to Grails Layout Demo</h1>
    </content>

    <content tag="left1">
        <p>Vestibulum ipsum velit, vestibulum in elementum vel, pellentesque at nisl. Mauris id rutrum eros. In hac habitasse platea dictumst. Nunc mollis euismod diam at ultrices. Aenean sit amet euismod ipsum. Quisque vitae sapien quis orci luctus gravida. Etiam aliquet tempor diam ut rutrum. Vestibulum felis velit, dictum luctus consequat et, lobortis id orci. Ut vulputate pharetra quam, id scelerisque nulla consequat eu. Ut varius neque in magna viverra ut mattis dolor convallis. Nulla blandit ipsum id eros porta sit amet porta augue bibendum. Nullam magna diam, facilisis id malesuada id, hendrerit condimentum enim. Etiam ornare purus at sapien iaculis venenatis. Morbi id semper felis. Curabitur id dapibus nulla.</p>
    </content>

    <content tag="box-left">
        <p>Donec pharetra adipiscing velit, et dignissim neque dignissim vel. Sed sagittis congue vehicula. Integer vel ipsum ipsum. Nulla non risus vel dui tincidunt egestas. In sodales turpis at purus lacinia nec gravida arcu posuere. Proin a gravida massa. Sed urna erat, consectetur a iaculis sit amet, gravida quis sapien. Proin vel lorem libero, nec facilisis massa. Cras consequat rutrum tortor.</p>
    </content>

    <content tag="box-right">
        <p>Vestibulum neque orci, malesuada quis suscipit eu, rhoncus ut ipsum. Maecenas dictum, lectus in ultrices viverra, sapien augue sagittis mauris, ut consequat odio purus nec urna. Suspendisse in magna purus, a gravida mi. Sed vel semper turpis. Proin elementum dolor a dolor pharetra eu eleifend neque ullamcorper. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus.</p>
    </content>

    <content tag="right1">
        <div id="list-products">
            <h2><g:message code="products.list.newest"/></h2>
            <ul>
                <g:each in="${productList}" var="product">
                    <li>
                        <g:link controller="product" action="view" id="${product.id}">${product.title}</g:link>
                    </li>
                </g:each>
            </ul>
        </div>
    </content>
</g:applyLayout>