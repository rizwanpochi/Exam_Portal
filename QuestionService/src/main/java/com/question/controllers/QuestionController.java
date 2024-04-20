package com.question.controllers;

import com.question.entities.Question;
import com.question.services.QuestionService;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;


    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/add")
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }
    @GetMapping("/all")
    public List<Question> getAll(){

        return questionService.get();

    }
    @GetMapping("/get/{id}")
    public Question getOne(@PathVariable Long id){
        return questionService.getone(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuiz(@PathVariable Long quizId){
        return questionService.getAllQuestionsOfQuiz(quizId);
    }
}
