<html>
<head>
    <title>Shabab Shipment Program Entry</title>
    <link href="/static/css/application-static.css" rel="stylesheet" />

</head>
<body>
<div class="shabab-program-div-wrapper">
    <div class="shabab-logo"></div>
    <div class="shabab-program-div">
        <h1>Programs</h1>
        <table class="shabab-table">
            <tr>
                <td>Name</td>
                <td>Destination</td>
                <td>Way of shipment</td>
                <td>Hand over date</td>
            </tr>
            <% if(programs.programs) {
                programs.programs?.each { program -> %>
                <tr>
                    <td><%= program.programName %></td>
                    <td><%= program.destination %></td>
                    <td><%= program.wayOfShipment %></td>
                    <td><%= program.handOverDate %></td>
                </tr>
            <%}
            } else {%>
                Program not found
            <%} %>
        </table>

        <div>
            <a href="/programentry" class="btn">Add another program</a>
        </div>
    </div>
</div>
</body>
</html>