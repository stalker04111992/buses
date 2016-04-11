<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Управление</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
</head>
<body>
<div id = "wrapper">
    <div id="menubar">
        <div id="menu">
            <ul>
                <li id = "menu0"><a href="index"><span>Главная</span></a></li>
            </ul>
        </div>
    </div>

    <div id="managementBuses">
        <ul>
            <li><a href="management/buses/addbus">Добавить автобус</a></li>
            <li><a href="management/buses/viewbuses">Работа с данными об автобусах</a></li>
        </ul>
    </div>

    <div id="managementPersonnel">
        <ul>
            <li><a href="management/personnels/addpersonnel">Добавить сотрудника</a></li>
            <li><a href="management/personnels/viewpersonnels">Работа с данными о сотрудниках</a></li>
        </ul>
    </div>

    <div id="managementVacancies">
        <ul>
            <li><a href="management/vacancies/addvacancy">Добавить вакансию</a></li>
            <li><a href="management/vacancies/viewvacancies">Работа с данными о вакансиях</a></li>
        </ul>
    </div>

    <div id="footer">

    </div>

</div>

</body>
</html>
