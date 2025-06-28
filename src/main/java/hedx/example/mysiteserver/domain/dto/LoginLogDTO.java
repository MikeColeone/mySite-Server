package hedx.example.mysiteserver.domain.dto;

import lombok.Data;

import java.util.Date;


@Data
public class LoginLogDTO {
    //用户名称
    private String userName;
    //登录地址
    private String address;
    //登录状态(0：成功，1：失败)
    private Integer state;
    // 登录开始时间
    private Date loginTimeStart;
    // 登录结束时间
    private Date loginTimeEnd;
}
