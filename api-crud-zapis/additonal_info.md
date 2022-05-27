Dodatkowe źródła

Dokumentacja adnotacji @RequestBody: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestBody.html

Dokumentacja klasy ResponseEntity: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/ResponseEntity.html

Kod odpowiedzi 201 Created w dokumentacji Mozilli: https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/201

Nagłówek Location w dokumentacji Mozilli: https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Location



API request to save data:
localhost:8080/offers - method POST

{
    "title": "Junior Java Developer",
    "description": "Rozpocznij z nami karierę jako programista Java",
    "requirements": "Ukończone studia informatyczne, znajomość Javy 8+, frameworków Spring i Hibernate",
    "duties": "Rozwój istniejącej aplikacji o rezerwacji pod okiem starszych programistów",
    "location": "Poznań",
    "minSalary": 4000.0,
    "maxSalary": 5000.0,
    "companyId": 1
}
