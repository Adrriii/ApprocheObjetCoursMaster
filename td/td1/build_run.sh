#!/bin/sh

cd src/main/java
javac -d ../../../classes fr/ubordeaux/ao/Main.java
cd ../../../classes/
java fr/ubordeaux/ao/Main
