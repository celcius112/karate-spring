package com.karate.karatespring.feature;

import com.intuit.karate.junit5.Karate;

public class Runner {

    @Karate.Test
    Karate testSample() {
        return new Karate().relativeTo(getClass());
    }
}
