# Ograniczenia standardu Bean Validation

Boolean

    @AssertFalse - wartość musi mieć wartość false
    @AssertTrue - wartość musi mieć wartość true

Liczby

    @DecimalMin - minimalna wartość liczby wyrażona jako String.
    @DecimalMax - maksymalna wartość liczby wyrażona jako String.
    @Digits - określa liczbę cyfr przed i po przecinku z ilu może składać się liczba.
    @Min - minimalną wartość liczby.
    @Max - maksymalną wartość liczby. 
    @Negative - czy liczba jest ujemna.
    @NegativeOrZero - czy liczba jest niedodatnia.
    @Positive - czy liczba jest dodatnia.
    @PositiveOrZero - czy liczba jest nieujemna.

Wspierane są wartości całkowitoliczbowe i ich wrappery oraz klasy BigDecimal, BigInteger, a także reprezentacja liczb w postaci Stringów. Specyfikacja wskazuje, że adnotacje nie wspierają typów float i double ze względu na ich naturę (przybliżone wartości).

String

    @Email - czy tekst jest prawidłowym adresem email,
    @NotBlank - czy tekst nie jest pusty, tzn. nie jest nullem i zawiera co najmniej jeden niebiały znak.
    @Pattern - czy tekst pasuje do wzorca.

Daty

    @Future - czy data reprezentuje przyszłość w stosunku do aktualnego czasu.
    @FutureOrPresent - czy data reprezentuje przyszłość, albo teraźniejszość w stosunku do aktualnego czasu.
    @Past - czy data reprezentuje przeszłość w stosunku do aktualnego czasu.
    @PastOrPresent - czy data reprezentuje przeszłość, albo teraźniejszość w stosunku do aktualnego czasu.

Wspierane są wszystkie typy przeznaczone dla dat, takżecz Date Time API Javy 8.

Różne typy

    @NotEmpty - w przypadku tekstu nie może on być nullem, a w przypadku tablic i kolekcji nie może być ona pusta.
    @Null - wartość musi być null.
    @NotNull - wartość nie może być null.
    @Size - czy długość tekstu, lub rozmiar tablic, albo kolekcji mieści się w zdefiniowanym przedziale.

# Ograniczenia spoza standardu Bean Validation 

Ograniczenia z Hibernate Validatora:

    @ISBN - czy tekst jest prawidłowym numerem ISBN.
    @Length - czy tekst ma długość z określonego przedziału.
    @URL - czy tekst jest poprawnym adresem URL.

Ograniczenia z Java Bean Validation Extension:

    @Alphanumeric - czy tekst składa się wyłącznie z liter i cyfr.
    @IPv4 - czy tekst jest prawidłowym adresem IPv4.

Hibernate Validator Polskie ogranizczenia: @NIP, @PESEL, @REGON.


Dodatkowe źródła

Kod z tej lekcji: https://github.com/javastartpl/spring2021/tree/master/walidacja-ograniczenia-standard

Wszystkie niestandardowe ograniczenia Hibernate Validatora: https://docs.jboss.org/hibernate/validator/6.2/api/org/hibernate/validator/constraints/package-summary.html

Dokumentacja biblioteki Java Bean Validation Extension: https://github.com/nomemory/java-bean-validation-extension
