package com.question.services;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService  {

    Question create(Question question);

    List<Question> get();

    Question getone(Long id);

    List<Question> getAllQuestionsOfQuiz(Long quizId);

}
