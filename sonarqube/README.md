# SonarQube in Docker

The only difference to original image is **Dependency check** plugin which 
was absent in marketplace for unknown (for me) reason.

## Usage

Start container:

```
docker-compose up
```

Wait until SonarQube is started.

Use **admin** as login, and **admin** as password to access SonarQube using browser:
```
http://localhost:9000
```

Install, if any, required plugins using marketplace.