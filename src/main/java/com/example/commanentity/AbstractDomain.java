package com.example.commanentity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.TimeZone;

@Data
@MappedSuperclass
public class AbstractDomain implements Serializable {

    @Column(updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar updated_at;

    private String updated_by;
    
    private int status;

    @PrePersist
    public void updateCreateddDate() {
        created_at = updated_at = Calendar.getInstance(TimeZone.getDefault());
    }

    @PreUpdate
    public void updateUpdatedDate() {
        updated_at = Calendar.getInstance(TimeZone.getDefault());
    }
}
