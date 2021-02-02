package mx.edu.utvt.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_archivo")
public class FileType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idfile_type")
    private Long id;
    @Column(name = "tipo")
    private String type;
    @Column(name = "estado")
    private boolean status;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
