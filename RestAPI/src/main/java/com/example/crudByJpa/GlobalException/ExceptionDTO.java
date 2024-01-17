package com.example.crudByJpa.GlobalException;

public class ExceptionDTO {
   private Integer status;
   private Long timeStamp;

    public ExceptionDTO() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public ExceptionDTO(Integer status, Long timeStamp, String message) {
        this.status = status;
        this.timeStamp = timeStamp;
        Message = message;
    }

    private String Message;
}
