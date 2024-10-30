package SCHD.SCHD_Application.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table
@Entity
public class Member {
    @Id
    private Long id;

    private String name;
    private String email;
    private String password;
    private LocalDate reg_date;
}
