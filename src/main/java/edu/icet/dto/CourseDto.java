package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
    private Integer id;
    private String name;
    private String description;
    private Integer teacherId;
    private String subject;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
