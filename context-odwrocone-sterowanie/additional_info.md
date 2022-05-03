
Adnotacja @Component jest jednak bardzo ogólna i nie wskazuje roli, jaką pełni dana klasa. Z tego powodu najczęściej używa się jej specjalizacji w postaci adnotacji:

    @Service - klasy warstwy usług,

    @Repository - klasy repozytoriów, czyli zbiorów danych, które pod spodem mogą 
    korzystać z kolekcji lub np. dodatkowej warstwy DAO,

    @Controller - klasy kontrolerów ze wzorca Model View Controller (MVC).

    @Autowired - oznaczenie miejsca tworzenia objektu potrzebującego inne
    zależności.

Dodatkowe źródła

Dokumentacja klasy SpringApplication: https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringApplication.html

Dokumentacja adnotacji @SpringBootApplication: https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/SpringBootApplication.html
