package SCHD.SCHD_Application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Table(name="workout_schd")
public class WorkoutSCHD {
    @Id
    private int id;

    @Column(name="member_id")
    private int memberID;

    private LocalDate date;

    @Column(name="exercise_type")
    private String exerciseType;

    private int sets;
    private int reps;
}
