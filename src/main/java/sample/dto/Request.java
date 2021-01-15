package sample.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="request",description="request")
public class Request {

    @ApiModelProperty(value = "user id", name = "userId", example = "1", required = true)
    private String userId;

    @ApiModelProperty(value = "vehicle id", name = "vehicleId", example = "1", required = true)
    private String vehicleId;

    @ApiModelProperty(value = "from date", name = "fromDate", example = "2020-09-12", required = true)
    private String fromDate;

    @ApiModelProperty(value = "to date", name = "toDate", example = "2020-10-12", required = true)
    private String toDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
}
