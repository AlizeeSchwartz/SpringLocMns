#!/bin/bash

# Mettre à jour le code source
git pull

# Construire le projet avec Maven
bash mvnw  --settings /home/debian/.m2/settings.xml package -DskipTests

# Construire l'image Docker
docker build --no-cache -t image-loc-alizee .

