package cursos.api.carro.Exceptions;

import org.springframework.http.HttpStatus;

public class ErrorBody {
    private HttpStatus status;
    private String message;

    public ErrorBody(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
