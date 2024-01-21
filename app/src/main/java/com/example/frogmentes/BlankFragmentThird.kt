package com.example.frogmentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.frogmentes.databinding.FragmentBlankThirdBinding


class BlankFragmentThird : Fragment() {

    private var _binding: FragmentBlankThirdBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBlankThirdBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.FB1.text =
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}