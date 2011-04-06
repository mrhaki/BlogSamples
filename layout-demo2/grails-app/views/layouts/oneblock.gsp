<%-- File: grails-app/views/layout/oneblock.gsp --%>
<g:applyLayout name="page">
    <html>
    <head>
        <title><g:layoutTitle/></title>
        <g:layoutHead/>
    </head>
    <body>
    <div id="main">
        <g:pageProperty name="page.main1"/>
        <g:pageProperty name="page.main2"/>
        <g:pageProperty name="page.main3"/>
    </div>
    </body>
    </html>
</g:applyLayout>