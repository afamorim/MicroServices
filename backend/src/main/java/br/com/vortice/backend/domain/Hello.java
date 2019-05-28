package br.com.vortice.backend.domain;

public class Hello {

    public Hello(String aMessage){
        this.message = aMessage;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
