package check;

public class CancelalarmSent extends AbstractEvent {

    private Long id;

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
