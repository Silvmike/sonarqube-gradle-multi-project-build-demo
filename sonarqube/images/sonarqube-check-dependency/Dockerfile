FROM mwendler/wget as wget
WORKDIR /tmp/_sonar_extenstions
ENV OWASP_PLUGIN_URL https://github.com/dependency-check/dependency-check-sonar-plugin/releases/download/1.2.6/sonar-dependency-check-plugin-1.2.6.jar
RUN wget --no-check-certificate -O sonar-dependency-check-plugin-1.2.6.jar $OWASP_PLUGIN_URL

FROM sonarqube:7.9-community
COPY --from=wget /tmp/_sonar_extenstions/*.jar $SONARQUBE_HOME/extensions/plugins/

