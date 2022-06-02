package com.example.android.aicartapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.aicartapp.R


/**
 * A simple [Fragment] subclass.
 * Use the [searchArt.newInstance] factory method to
 * create an instance of this fragment.
 */
class searchArt : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_art, container, false)
    }


}