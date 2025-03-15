package edu.icet.controller;

import edu.icet.dto.ExamDto;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {

    final ExamService service;

    @PostMapping("/create-exam")
    public void createExam(@RequestBody ExamDto exam){
        service.createExam(exam);
    }
    @GetMapping("/get-exam-by-course-id/{id}")
    public ExamDto getExamByCourseId(@PathVariable Integer id){
        return service.getExamByCourseId(id);
    }
}
