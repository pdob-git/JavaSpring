Klasy konfiguracji

```
@Configuration
class AppConfig {
    
    @Bean
    Scanner scanner() {
        return new Scanner(System.in);
    }
}
```

Adnotacja `@SpringBootApplication`
ma w sobie adnotację `@Configuration`

Dodatkowe źródła

Dokumentacja adnotacji @Bean: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Bean.html
