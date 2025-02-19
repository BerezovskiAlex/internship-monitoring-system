package org.inthergroup.ims.candidate.Controller;

import lombok.Data;
import org.inthergroup.ims.candidate.model.Status;

@Data
public class CandidateDTO {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String cv;
    private String comment;
    private String status;
    private double mark;
}
