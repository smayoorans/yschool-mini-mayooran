<html>
    <head>        
        <title>JSP Page</title>
    </head>
    <body>
        <center>
         <h1>You're registered student!</h1>      
         <jsp:useBean id="ob" scope="request" class="org.ymini.mayooran.modelClasses.Student" />
         <table border="2" width="400">
             <thead>
                 <tr>
                     <th>Attributes</th>
                     <th>Values</th>
                 </tr>
             </thead>
             <tbody>
                 <tr>
                     <td>Student Name:</td>
                     <td><%=ob.getStudentname()%></td>
                 </tr>
                 <tr>
                     <td>Grade:</td>
                     <td><%=ob.getGrade()%></td>
                 </tr>
                 <tr>
                     <td>Parent Name:</td>
                     <td><%=ob.getParentname()%></td>
                 </tr>
                 <tr>
                     <td>Address:</td>
                     <td><%=ob.getAddress() %></td>
                 </tr>
                 <tr>
                     <td></td>
                     <td></td>
                 </tr>
             </tbody>
         </table>
    </center>
    </body>
</html>
