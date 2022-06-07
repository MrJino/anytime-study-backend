package anytime.study.service

import anytime.study.domain.data.QuizGroup
import anytime.study.domain.data.QuizItem
import org.springframework.stereotype.Service

@Service(value = SampleQuizService.NAME)
class SampleQuizService : SampleQuizApi {

    companion object {
        const val NAME = "PrevQuizService"
    }

    override fun getQuizzes(): QuizGroup {
        return QuizGroup(
                description = "",
                items = listOf(QuizItem(
                        content = "",
                        commentary = ""
                ))
        )
    }
}