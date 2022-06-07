package anytime.study.controller

import anytime.study.domain.data.QuizGroup
import anytime.study.service.SampleQuizApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/sample")
class SampleQuizController {

    @Autowired
    private lateinit var sampleQuizApi: SampleQuizApi

    @GetMapping("/quiz")
    @ResponseBody
    fun getSampleQuizzes(typeId: Int?): ResponseEntity<QuizGroup> {
        return ResponseEntity.ok(sampleQuizApi.getQuizzes())
    }
}