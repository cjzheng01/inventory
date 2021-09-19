package org.cjzheng01.inventory.utils;

public class Exceptions {

    public static RuntimeException unchecked(Throwable cause) {
        return cause instanceof RuntimeException ? (RuntimeException)cause : new RuntimeException(cause);
    }
}
