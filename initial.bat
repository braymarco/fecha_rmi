cd src
javac *.java
rmic Server
start rmiregistry
start java Server
start java Client