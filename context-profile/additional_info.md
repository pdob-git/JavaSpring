Uruchamianie z innym profilem

spring:
  profiles:
    active: dev

mvn spring-boot:run -Dspring-boot.run.profiles=dev

Dodatkowe źródła

Profile w dokumentacji Springa: https://docs.spring.io/spring-boot/docs/2.5.6/reference/html/features.html#features.profiles

Dokumentacja adnotacji @Profile: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Profile.html

