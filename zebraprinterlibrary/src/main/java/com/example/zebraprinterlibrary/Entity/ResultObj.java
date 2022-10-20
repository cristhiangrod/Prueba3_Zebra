package com.example.zebraprinterlibrary.Entity;

/**
 * Result Object
 */
public class ResultObj {

    /**
     * Estado
     */
    private boolean status;
    /**
     * Informacion
     */
    private String message;

    public ResultObj() {
        this.status = false;
    }

    public ResultObj(boolean status) {
        this.status = status;
    }

    public ResultObj(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
