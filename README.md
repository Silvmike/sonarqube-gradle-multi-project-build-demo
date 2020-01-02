# SonarQube Integration

All unused imports and issues in project are placed on purpose.

This project was created as a demo of possible gradle multi-project
build setup with sonarqube, jacoco, dependency check, and spotbugs
static analysis tools.

## SonarQube

* JaCoCo support works fine
* DependencyCheck support works, but:
    * doesn't show anything in OWASP DependencyCheck section
    * creates issues (and that's good)
* Test reports work fine
* Static analysis works fine

### Running

Related **docker-compose** based project can be found [here](/sonarqube).
Do not forget to update **gradle.properties**: see [documentation](https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-gradle/).

## Dependency Check

* Can hang if some irrelevant analyzers enabled

## JaCoCo

* Required to configure tools like Lombok to generate @Generated annotation

## Spotbugs

* Works, but still there is an issue with **INVOKEDYNAMIC**:

    * see [issue #6 opened in 2016](https://github.com/spotbugs/spotbugs/issues/6) 