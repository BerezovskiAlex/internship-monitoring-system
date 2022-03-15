package com.inthergroup.ims.Candidates;

import lombok.Data;

@Data
public class RegisterCandidateDTO {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String cv;
    private String comment;
    private String status;
    private double mark;
}
