<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Hello World!</title>
    <style>
        .dalog{
            width: 70px;
            height: 70px;
            border: 1px solid pink;
            display: none;
        }

    </style>
</head>
<body>
<form action="/zwb/person-info/updatePersonInfo" type="post">
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
    <button type="submit" value="Submit" onclick="savaUpdate()" >提交修改</button>
</form>



<script>
    savaUpdate=function () {
        // console.log(1111)1111
        alert("编辑成功！");
        setTimeout(function (){
            // window.location.href="http://localhost:8080/zwb/person-info/index"
            window.location.href = document.referrer;//返回上一页并刷新
            // location.href="http://localhost:8080/zwb/person-info/index";
        },2000)

    }
</script>
</body>
</html>