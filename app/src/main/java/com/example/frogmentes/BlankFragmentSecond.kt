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
//        binding..setOnClickListener { parentFragmentManager.beginTransaction().replace(R.id.container, BlankFragmentFirst())
//            .commit() }
//
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}