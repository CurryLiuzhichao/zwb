<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Hello World!</title>
    <style type="text/css">
        body{
            padding: 0;
            margin: 0;
        }
        .title{
            background-color: aquamarine;
            border: 2px solid black;
        }
        .index{

        }
        th{
            border: 2px solid black;
        }
    </style>
</head>
<body>
<table>
    <h1>"安居"户籍管理系统</h1>
    <thead>
    <tr class="title">
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
        <tr class="index">
        <th>${ls.personId}</th>
        <th>${ls.personName}</th>
        <th>${ls.personAge}</th>
        <th>${ls.personAreaId}</th>
        <th>${ls.personAddress}</th>
        <th><a href="/zwb/person-info/update/${ls.personId}">修改</a><a href="/zwb/person-info/delectPersonInfo/${ls.personId}">删除</a></th>
        <br/>
        </tr>
    </#list>
    </tbody>

</table>
<#list list as ls>

</#list>

</body>
</html>