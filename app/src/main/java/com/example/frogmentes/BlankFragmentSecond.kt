package com.example.frogmentes

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
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

    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val quiz = QuizStorage.getQuiz(QuizStorage.Locale.Ru)

        binding.button.isEnabled = false

        binding.question1.text = quiz.questions[0].question
        binding.RB11.text = quiz.questions[0].answers[0]
        binding.RB11.id = 0
        binding.RB12.text = quiz.questions[0].answers[1]
        binding.RB12.id = 1
        binding.RB13.text = quiz.questions[0].answers[2]
        binding.RB13.id = 2
        binding.RB14.text = quiz.questions[0].answers[3]
        binding.RB14.id = 3

        binding.question2.text = quiz.questions[1].question
        binding.RB21.text = quiz.questions[1].answers[0]
        binding.RB21.id = 0
        binding.RB22.text = quiz.questions[1].answers[1]
        binding.RB22.id = 1
        binding.RB23.text = quiz.questions[1].answers[2]
        binding.RB23.id = 2
        binding.RB24.text = quiz.questions[1].answers[3]
        binding.RB24.id = 3

        binding.question3.text = quiz.questions[2].question
        binding.RB31.text = quiz.questions[2].answers[0]
        binding.RB31.id = 0
        binding.RB32.text = quiz.questions[2].answers[1]
        binding.RB32.id = 1
        binding.RB33.text = quiz.questions[2].answers[2]
        binding.RB33.id = 2
        binding.RB34.text = quiz.questions[2].answers[3]
        binding.RB34.id = 3

        binding.answer1.setOnCheckedChangeListener { group, checkedId -> changeRadiobaton() }
        binding.answer2.setOnCheckedChangeListener { group, checkedId -> changeRadiobaton() }
        binding.answer3.setOnCheckedChangeListener { group, checkedId -> changeRadiobaton() }

        binding.button.setOnClickListener {
            val answersList = answersList()
            val feedback = QuizStorage.answer(quiz, answersList)

            val bundle = Bundle()
//            val bundle = bundleOf("feedback" to feedback)

            bundle.putString("feedback", feedback)
            findNavController().navigate(R.id.action_FragmentBlankSecond_to_blankFragmentThird, bundle)
        }

        binding.buttonbackStart.setOnClickListener {
            findNavController().navigate(R.id.FragmentBlankFirst)
        }

//        binding..setOnClickListener { parentFragmentManager.beginTransaction().replace(R.id.container, BlankFragmentFirst())
//            .commit() }
//
    }

    fun answersList (): List<Int> {
        val answersList = listOf(
            binding.answer1.checkedRadioButtonId,
            binding.answer2.checkedRadioButtonId,
            binding.answer3.checkedRadioButtonId,
        )
        return answersList
    }

    fun changeRadiobaton() {

        val answersList = answersList()

        if (answersList[0] in 0 .. 3 && answersList[1] in 0 .. 3 && answersList[2] in 0 .. 3) {
            binding.button.isEnabled = true
        }
        else { binding.button.isEnabled = false}

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}