package com.learntest.learntest.filetest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmailValidTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "mail", "mail@mail", "mail@mail.com"})
    public void verificaSeEmailEValido(String email) {
        assertTrue(Email.validar(email));
    }
}

/*Para escrever um teste parametrizado devemos utilizar a anotação
@ParameterizedTest em conjunto de @ValueSource, assim como exemplificamos abaixo. 
Nesse caso, ao executarmos os testes o método verificaSeEmailEValido() 
será chamado uma vez para cada parâmetro especificado em @ValueSource. 
Uma vez que apenas o último valor corresponde a um e-mail válido, 
os três primeiros casos resultarão em falha. */