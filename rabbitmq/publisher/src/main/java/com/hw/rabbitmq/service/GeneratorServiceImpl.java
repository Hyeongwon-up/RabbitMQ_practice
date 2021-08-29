package com.hw.rabbitmq.service;

import com.hw.rabbitmq.domain.Factor;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.function.Function;

@Service
public class GeneratorServiceImpl implements GeneratorService {
    @Override
    public int randomFactor() {
        Function<String, Integer> function = Integer::parseInt;
        return new Random().nextInt(function.apply(Factor.MAX.toString())
                - function.apply(Factor.MIN.toString()) + 1)
                + function.apply(Factor.MIN.toString());
    }
}
