package ir.dunijet.wikipedia.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ir.dunijet.wikipedia.R
import ir.dunijet.wikipedia.databinding.FragmentProfilerBinding

class fragmentProfile : Fragment() {
    lateinit var binding: FragmentProfilerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfilerBinding.inflate(layoutInflater, container, false)

        return binding.root

    }


}