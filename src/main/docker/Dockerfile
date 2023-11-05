FROM ghcr.io/piranhacloud/webprofile:23.10.0
USER root
ADD target/spider.war /home/piranha
WORKDIR /home/piranha
RUN mv spider.war ROOT.war && \
    chown piranha:piranha ROOT.war
USER piranha
CMD ["java", "-jar", "piranha-dist-webprofile.jar", "--war-file", "ROOT.war"]
