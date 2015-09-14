<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Shabab Shipment Program Entry</title>
    <link href="/static/css/application-static.css" rel="stylesheet" />

</head>
<body>
    <div class="shabab-program-div-wrapper">
        <div class="shabab-logo"></div>
        <div class="shabab-program-div">

            <form:form commandName="program" method="post">
                <div>
                    <label for="programName">Program</label>
                    <form:input path="programName" id="programName"></form:input>
                    <form:errors path="programName"/>
                </div>
                <div>
                    <label for="destination">Destination</label>
                    <form:input path="destination" id="destination"></form:input>
                    <form:errors path="destination"/>
                </div>

                <div>
                    <label for="wayOfShipment">Way of shipment</label>
                    <form:input path="wayOfShipment" id="wayOfShipment"></form:input>
                    <form:errors path="wayOfShipment"/>
                </div>

                <div>
                    <label for="handOverDate">Hand over date</label>
                    <form:input path="handOverDate" id="handOverDate"></form:input>
                    <form:errors path="handOverDate"/>
                </div>
                <div>
                    <button type="submit" class="btn">Submit</button>
                </div>
            </form:form>
        </div>
    </div>
</body>
</html>