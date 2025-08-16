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
@Table(name = "assignment_submission_attachment")
public class AssignmentSubmissionAttachment {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "assignment_submission_id", nullable = false)
    private AssignmentSubmission assignmentSubmission;

    @Column(name = "url", nullable = false)
    private String url;

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