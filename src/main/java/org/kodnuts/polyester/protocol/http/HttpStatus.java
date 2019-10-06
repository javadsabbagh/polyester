package org.kodnuts.polyester.protocol.http;


// todo consider category by
public enum HttpStatus {
    OK((short) 200, "OK");

    private final short code;
    private final String text;

    HttpStatus(short code, String text) {
        this.code = code;
        this.text = text;
    }
}
