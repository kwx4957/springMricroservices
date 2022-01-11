package com.mricroservices.springmricroservices.multiplication.domain;

import com.mricroservices.springmricroservices.multiplication.service.MultiplicationService;
import com.mricroservices.springmricroservices.multiplication.service.RandomGeneratorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class MultiplicationTest {

    @MockBean
    private RandomGeneratorService randomGeneratorService;

    @MockBean
    private MultiplicationService multiplicationService;

    @Test
    public void createRandomMultiplicationTest(){
        //given
        given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);

        //when
        Multiplication multiplication = multiplicationService.createRandomMultiplication();

        //assert
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getResult()).isEqualTo(1500);

    }
}