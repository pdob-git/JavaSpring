Dodatkowe źródła

Metoda PUT w standardzie HTTP: https://datatracker.ietf.org/doc/html/rfc7231#section-4.3.4

Dokumentacja adnotacji @PutMapping: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PutMapping.html

request to test:

PUT http://localhost:8080/companies/1
{
    "name": "Appel",
    "description": "Super firma, lider branży",
    "city": "Wrocław",
    "employees": 100,
    "telephone": "48 123-234-345",
    "email": "kontakt@appul.xyz"
}
