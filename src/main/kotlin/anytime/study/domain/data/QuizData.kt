package anytime.study.domain.data

data class QuizGroup(
        val description: String,
        val items: List<QuizItem>
)

data class QuizItem(
        val content: String,
        val commentary: String
)