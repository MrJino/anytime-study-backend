package anytime.study.service

import anytime.study.domain.data.QuizGroup

interface SampleQuizApi {
    fun getQuizzes(): QuizGroup
}
