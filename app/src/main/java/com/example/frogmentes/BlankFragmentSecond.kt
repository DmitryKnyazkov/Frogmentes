package com.example.frogmentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.frogmentes.databinding.FragmentBlankFirstBinding
import com.example.frogmentes.databinding.FragmentBlankSecondBinding



class BlankFragmentSecond : Fragment() {
    private var _binding: FragmentBlankSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankSecondBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val quiz = QuizStorage.getQuiz(QuizStorage.Locale.Ru)

        binding.question1.text = quiz.questions[0].question
        binding.RB11.text = quiz.questions[0].answers[0]
        binding.RB12.text = quiz.questions[0].answers[1]
        binding.RB13.text = quiz.questions[0].answers[2]
        binding.RB14.text = quiz.questions[0].answers[3]

        binding.question2.text = quiz.questions[1].question
        binding.RB21.text = quiz.questions[1].answers[0]
        binding.RB22.text = quiz.questions[1].answers[1]
        binding.RB23.text = quiz.questions[1].answers[2]
        binding.RB24.text = quiz.questions[1].answers[3]

        binding.question3.text = quiz.questions[2].question
        binding.RB31.text = quiz.questions[2].answers[0]
        binding.RB32.text = quiz.questions[2].answers[1]
        binding.RB33.text = quiz.questions[2].answers[2]
        binding.RB34.text = quiz.questions[2].answers[3]

//        binding..setOnClickListener { parentFragmentManager.beginTransaction().replace(R.id.container, BlankFragmentFirst())
//            .commit() }
//
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}