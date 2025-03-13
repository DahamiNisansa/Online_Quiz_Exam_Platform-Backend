package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {
    private Integer id;
    private Integer examId;
    private String text;
    private String options;
    private String correctAnswer;
    private Integer points;
}
