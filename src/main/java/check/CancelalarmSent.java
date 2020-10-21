package check;

public class CancelalarmSent extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String reciever;
    private String message;
    
    public CancelalarmSent(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
