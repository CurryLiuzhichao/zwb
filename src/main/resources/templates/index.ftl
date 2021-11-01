<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Hello World!</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>地区编号</th>
        <th>地址</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <#list list as ls>
        <tr>
        <th>${ls.personId}</th>
        <th>${ls.personName}</th>
        <th>${ls.personAge}</th>
        <th>${ls.personAreaId}</th>
        <th>${ls.personAddress}</th>
        <th><a href="/zwb/person-info/update/${ls.personId}">修改</a><a href="">删除</a></th>
        <br/>
        </tr>
    </#list>
    </tbody>

</table>
<#list list as ls>

</#list>

</body>
</html>