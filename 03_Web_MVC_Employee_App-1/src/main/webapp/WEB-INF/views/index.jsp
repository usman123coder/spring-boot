<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Employee Website</title>
        </head>

        <body>
            <h2>Employee Enquiry Form</h2>
            <p>${msg}</p>
            <form modelAttribute="emp" action="/emp" method="post">
                <table>
                    <tr>
                        <td>Emp Id : </td>
                        <td>
                            <form:input path="id" />
                        </td>
                    </tr>
                    <tr>
                        <td>Emp Name : </td>
                        <td>
                            <form:input path="empName" />
                        </td>
                    </tr>
                    <tr>
                        <td>Designation : </td>
                        <td>
                            <form:checkboxes items="${desig}" path="desig" />
                        </td>
                    </tr>
                    <tr>
                        <td>Location : </td>
                        <form:select path="loc">
                            <form:option value="">-Select-</form:option>
                            <form:options items="${loc}" />
                        </form:select>
                    </tr>
                    <tr>
                        <td>Email : </td>
                        <td>
                            <form:input path="email" />
                        </td>
                    </tr>
                    <tr>
                        <td>Salary : </td>
                        <td>
                            <form:input path="salary" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Submit"/></td>
                    </tr>
                </table>
            </form>
        </body>

        </html>