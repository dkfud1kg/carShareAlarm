package check;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Alarm_table")
public class Alarm {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long orderId;
    private String reciever;
    private String message;

    @PostPersist
    public void onPostPersist(){
        OkAlarmSent okAlarmSent = new OkAlarmSent();
        BeanUtils.copyProperties(this, okAlarmSent);
        okAlarmSent.publishAfterCommit();


    }

    @PrePersist
    public void onPrePersist(){
        CancelalarmSent cancelalarmSent = new CancelalarmSent();
        BeanUtils.copyProperties(this, cancelalarmSent);
        cancelalarmSent.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }




}
