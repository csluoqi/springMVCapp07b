<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Add Product Form</title>
<meta charset="utf-8">
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<br>
<br>
   <form:form commandName="product" action="product_save" method="post">
    <fieldset>
        <legend>Add a product</legend>
        <p class="errorLine">
            <form:errors path="name" cssClass="error"/>
        </p>
        <p>
            <label for="name">*Product Name: </label>
            <form:input id="name" path="name" tabindex="1"/>
        </p>
        <p class="errorLine">
            <form:errors path="description" cssClass="error"/>
        </p>
        <p>
            <label for="description">Description: </label>
            <form:input id="description" path="description" tabindex="2"/>
        </p>
        <p class="errorLine">
            <form:errors path="price" cssClass="error"/>
        </p>
        <!--如果输入一个字符串比如（abc）会直接将错误代码显示在页面，因为没有写一个<String,float>的格式化器  -->
        <p>
            <label for="price">*Price: </label>
            <form:input id="price" path="price" tabindex="3"/>
        </p>
        <p class="errorLine">
            <form:errors path="productionDate" cssClass="error"/>
        </p>
        <p>
        <!--1.数据类型的转换
       		2.数据格式化的问题
       		3.日期的效验  -->
            <label for="productionDate">*Production Date: </label>
            <form:input id="productionDate" path="productionDate" tabindex="4"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="5">
            <input id="submit" type="submit" tabindex="6" 
                value="Add Product">
        </p>
    </fieldset>
</form:form> 
</div>
</body>
</html>
