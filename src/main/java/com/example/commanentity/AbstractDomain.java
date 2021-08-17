package com.example.commanentity;

import com.example.commanentity.enums.Status;
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
    private Calendar createdat;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar updatedat;

    private String updatedby;

    @Enumerated(EnumType.STRING)
    private Status status;

    @PrePersist
    public void updateCreateddDate() {
        createdat = updatedat = Calendar.getInstance(TimeZone.getDefault());
    }

    @PreUpdate
    public void updateUpdatedDate() {
        updatedat = Calendar.getInstance(TimeZone.getDefault());
    }
}
