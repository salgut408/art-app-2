package com.example.android.aicartapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.aicartapp.R
import com.example.android.aicartapp.databinding.ActivityArtBinding


/**
 * A simple [Fragment] subclass.
 * Use the [allArt.newInstance] factory method to
 * create an instance of this fragment.
 */
class allArt : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = ActivityArtBinding.inflate(inflater)
        binding.lifecycleOwner = this
        // Inflate the layout for this fragment
        return binding.root
    }

}