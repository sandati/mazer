<%-- 
    Document   : dashboard
    Created on : 29 oct. 2024, 15:47:34
    Author     : yahaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <!-- <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head> -->
    
    <!-- head -->
    <jsp:include page="head.jsp" />
    
    <body class="light">
        
        <!-- left menu -->
        <jsp:include page="left-menu.jsp" />
        
        <div id="main">
            <!-- header -->
            <jsp:include page="header.jsp">
                <jsp:param name="title" value="Dashboard - Mazer Admin Dashboard"/>
            </jsp:include>
            
            <h1>Hello World!</h1>
        </div>
    </body>
</html>
