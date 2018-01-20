# Sitemorse-sci-app

## Introduction
Starts a spring boot app which contains an angular app which gets displayed in the channel manager.

## How to run

* If you are running for the first time, build both the frontend and backend modules:

```bash
  $ mvn package -P full
```

* If you built the angular app before and want to skip building it:

```bash
  $ mvn clean package
```

* Run the executable jar:

```bash
  $ java -jar backend/target/backend-0.0.1-SNAPSHOT.jar  
```
