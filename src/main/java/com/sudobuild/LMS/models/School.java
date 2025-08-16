package com.sudobuild.LMS.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "school")
public class School {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Lob
    @Column(name = "address")
    private String address;

    @Lob
    @Column(name = "logo")
    private String logo;

    @Lob
    @Column(name = "website")
    private String website;

    @Column(name = "created_by", nullable = false, updatable = false)
    @CreatedBy
    private String createdBy;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    private Instant createdAt;

    @Column(name = "updated_by",insertable = false)
    @LastModifiedBy
    private String updatedBy;

    @Column(name = "updated_at", insertable = false)
    @LastModifiedDate
    private Instant updatedAt;

}