<%-- File: grails-app/views/layout/twoblocks.gsp --%>
<g:applyLayout name="page">
    <html>
    <head>
        <title><g:layoutTitle/></title>
        <g:layoutHead/>
    </head>
    <body>
    <div id="left">
        <g:pageProperty name="page.left1"/>
        <g:pageProperty name="page.left2"/>
        <g:pageProperty name="page.left3"/>
    </div>

    <div id="right">
        <g:pageProperty name="page.right1"/>
        <g:pageProperty name="page.right2"/>
        <g:pageProperty name="page.right3"/>
    </div>
    </body>
    </html>
</g:applyLayout>