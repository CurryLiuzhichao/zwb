<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Hello World!</title>
</head>
<body>
<form action="/zwb/person-info/updatePersonInfo" method="post" >
    用户id：
    <input type="text" name="personId" value="${one.personId}">
    <br>
    用户姓名
    <input type="text" name="personName" value="${one.personName}">
    <br>
    用户所在地
    <select name="personAreaId" >
        <#list list as ls>
            <option value="${ls.areaId}" >${ls.areaName}</option>
        </#list>
    </select>

    <br>
    人员年龄
    <input type="text" name="personAge" value="${one.personAge}">
    <br>
    家庭住址
    <input type="text" name="personAddress" value="${one.personAddress}">
    <br>
    <button type="submit" value="Submit">提交修改</button>
</form>

</body>
</html>