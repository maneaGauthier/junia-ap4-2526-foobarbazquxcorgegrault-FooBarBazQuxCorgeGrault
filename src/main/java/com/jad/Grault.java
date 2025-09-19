package com.jad;

// Grault.java
import java.util.Objects;

public class Grault {
    // multiplicité côté Foo = 1 → référence obligatoire
    private Foo foo;

    // constructeur indiqué dans l’image
    public Grault(Foo foo) {
        this.foo = Objects.requireNonNull(foo);
    }
}

