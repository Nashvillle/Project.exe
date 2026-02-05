
Steps after unzip:

1. Create folder: ManufacturingSimple/lib
2. Copy these two JARs into lib:
   - mysql-connector-j-8.x.x.jar
   - servlet-api.jar (from Tomcat/lib)

3. Add ManufacturingSimple/lib to Java Build Path in VS Code.

4. In MachineDAO.java replace:
   REPLACE_WITH_YOUR_PASSWORD
   with your MySQL root password.

5. Deploy this folder to Tomcat and open:
   http://localhost:8080/ManufacturingSimple/
