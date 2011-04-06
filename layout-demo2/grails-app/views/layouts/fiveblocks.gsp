<%-- File: grails-app/views/layout/fiveblocks.gsp --%>
<g:applyLayout name="page">
    <html>
    <head>
        <title><g:layoutTitle/></title>
        <g:layoutHead/>
    </head>
    <body>
    <div id="banner">
        <g:pageProperty name="page.banner"/>
    </div>

    <div id="left">
        <g:pageProperty name="page.left1"/>
        <g:pageProperty name="page.left2"/>
        <g:pageProperty name="page.left3"/>

        <div id="box-left">
            <g:pageProperty name="page.box-left"/>
        </div>

        <div id="box-right">
            <g:pageProperty name="page.box-right"/>
        </div>
    </div>

    <div id="right">
        <g:pageProperty name="page.right1"/>
        <g:pageProperty name="page.right2"/>
        <g:pageProperty name="page.right3"/>
    </div>
    </body>
    </html>
</g:applyLayout>