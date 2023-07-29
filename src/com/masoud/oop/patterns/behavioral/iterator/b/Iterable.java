package com.masoud.oop.patterns.behavioral.iterator.b;

import com.masoud.oop.patterns.behavioral.iterator.a.Iterator;

public interface Iterable<T> {

    Iterator<T> getIterator();
}