package com.example.frogmentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.frogmentes.databinding.FragmentBlankFirstBinding
import com.example.frogmentes.databinding.FragmentBlankSecondBinding


class BlankFragmentFirst : Fragment() {

    private var _binding: FragmentBlankFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankFirstBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_FragmentBlankFirst_to_FragmentBlankSecond)
//            parentFragmentManager.beginTransaction().replace(R.id.container, BlankFragmentSecond())
//                .commit()
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}