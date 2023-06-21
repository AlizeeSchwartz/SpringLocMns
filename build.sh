#!/bin/bash

# Mettre à jour le code source
git pull

# Construire le projet avec Maven
sudo bash mvnw  --settings /home/debian/.m2/settings.xml package

# Construire l'image Docker
docker build --no-cache -t image-loc-alizee .

