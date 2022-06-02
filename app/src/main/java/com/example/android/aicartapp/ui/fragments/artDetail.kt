package com.example.android.aicartapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.aicartapp.R
import com.example.android.aicartapp.databinding.FragmentArtDetailBinding


/**
 * A simple [Fragment] subclass.
 * Use the [artDetail.newInstance] factory method to
 * create an instance of this fragment.
 */
class artDetail : Fragment() {

    private lateinit var binding: FragmentArtDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentArtDetailBinding.inflate(inflater)
        binding.lifecycleOwner = this

        return binding.root
    }


}