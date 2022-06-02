package com.example.android.aicartapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android.aicartapp.databinding.ActivityArtBinding
import com.example.android.aicartapp.ui.fragments.allArt

class ArtActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArtBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtBinding.inflate(layoutInflater)

        setContentView(binding.root)


//        binding.bottomNavigationView.setupWithNavController(binding.artNavHostFragment.findNavController())
//


    }

}