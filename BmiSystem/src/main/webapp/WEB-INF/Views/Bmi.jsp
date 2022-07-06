<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.dahemmvc.model.userDB"  %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
 
      <c:set var = "b" value = "${cbmi}"/>
      <c:choose>
         
         <c:when test = "${cbmi > 25}">
         <div class="p-3 mb-2 bg-danger text-white"><h1>${listofBmi}</h1></div>
         </c:when>
         
         <c:when test = "${cbmi < 18.5}">
           <div class="p-3 mb-2  bg-warning text-white"><h1>${listofBmi}</h1></div>
         </c:when>
        
         <c:otherwise>
          <div class="p-3 mb-2 bg-success text-white"><h1>${listofBmi}</h1></div>
         </c:otherwise>
      </c:choose>
   
     
<table>
<tr>
<td><div style="background-color: silver;"><img src="C:\Users\Dahem\Downloads\Scr.jpg" class="" alt="..."></div></td>
<td> <p class="p-3 mb-2 bg-warning text-white">Low</p>
      
         <p class="p-3 mb-2 bg-success text-white">Normal</p>
         <p class="p-3 mb-2 bg-danger text-white">More</p>
    </td>
</tr>
</table>

  


</body>
</html>