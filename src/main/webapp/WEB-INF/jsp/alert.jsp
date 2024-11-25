<%-- 
    Document   : alert
    Created on : 30 oct. 2024, 11:25:37
    Author     : yahaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!-- head -->
    <jsp:include page="head.jsp" />
    
    <body>
        <script src="assets/static/js/initTheme.js"></script>
        <!-- left menu -->
        <jsp:include page="left-menu.jsp" />
        
        <div id="main">
            <!-- header -->
            <jsp:include page="header.jsp">
                <jsp:param name="title" value="Dashboard - Mazer Admin Dashboard"/>
            </jsp:include>
            
            <h1>Alert</h1>
        </div>
    </body>
</html>
