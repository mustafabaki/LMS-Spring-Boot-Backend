package com.sudobuild.LMS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class StudentHasCourseId implements Serializable {
    private static final long serialVersionUID = 3633618520883974303L;
    @Column(name = "student_id", nullable = false)
    private String studentId;

    @Column(name = "course_id", nullable = false)
    private String courseId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StudentHasCourseId entity = (StudentHasCourseId) o;
        return Objects.equals(this.studentId, entity.studentId) &&
                Objects.equals(this.courseId, entity.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, courseId);
    }

}