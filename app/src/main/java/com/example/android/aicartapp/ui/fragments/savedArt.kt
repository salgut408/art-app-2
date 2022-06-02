package com.example.android.aicartapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.aicartapp.R
import com.example.android.aicartapp.databinding.FragmentSavedArtBinding


/**
 * A simple [Fragment] subclass.
 * Use the [savedArt.newInstance] factory method to
 * create an instance of this fragment.
 */
class savedArt : Fragment() {

    private lateinit var binding: FragmentSavedArtBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentSavedArtBinding.inflate(inflater)
        binding.lifecycleOwner = this
        return binding.root
    }


}