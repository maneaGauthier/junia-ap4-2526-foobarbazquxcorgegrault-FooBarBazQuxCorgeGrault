package com.jad;

// Foo.java
import java.util.Arrays;
import java.util.Objects;

public class Foo {
    // attributs (tous privés ‘-’ dans l’UML)
    private Bar bar;          // 1
    private Baz[] bazs;       // *
    private Qux qux;          // composition
    private Corge corge;      // 0..1
    private Grault[] graults; // *

    // opérations ‘+’
    public Foo(Bar bar) {
        this.bar = Objects.requireNonNull(bar);
        this.bazs = new Baz[0];
        this.qux = new Qux();     // créé par Foo (composition)
        this.graults = new Grault[0];
        this.corge = null;        // optionnel (0..1)
    }

    public void addBaz(Baz baz) {
        Baz[] next = Arrays.copyOf(bazs, bazs.length + 1);
        next[next.length - 1] = Objects.requireNonNull(baz);
        this.bazs = next;
    }
}

