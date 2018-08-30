set projectLocation=E:\Qmetry\qmetryHack

E:
cd %projectLocation%

mvn clean test -DsuiteXmlFile=testng.xml
pause