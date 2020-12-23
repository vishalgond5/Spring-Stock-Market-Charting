package com.sg.smc.exceptions;

public class SmcExceptions extends RuntimeException {
	
	public SmcExceptions(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SmcExceptions(String exMessage) {
        super(exMessage);
    }

}
