#!/bin/sh

cd src/main/java
javac -d ../../../classes fr/ubordeaux/ao/Main.java
cd ../../..
cp villes_france.csv ./classes
