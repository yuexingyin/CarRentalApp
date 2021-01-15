package sample.dto;

public class ServiceResponse<T> {

    private Status status;

    private T data;

    public static <T> ServiceResponse<T> success(T data){
        ServiceResponse serviceResponse = new ServiceResponse();
        serviceResponse.setStatus(new Status("0000", "success"));
        serviceResponse.setData(data);
        return (ServiceResponse<T>) serviceResponse;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
