FROM ghcr.io/piranhacloud/webprofile:23.6.0
USER root
ADD target/piranha-smart.war /home/piranha
WORKDIR /home/piranha
RUN mv piranha-smart.war ROOT.war && \
    chown piranha:piranha ROOT.war
USER piranha
CMD ["java", "-jar", "piranha-dist-webprofile.jar", "--war-file", "ROOT.war"]
