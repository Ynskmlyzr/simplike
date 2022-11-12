package com.yunuskemalyazar.simplelike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.yunuskemalyazar.simplelike.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            //val controller = findNavController(R.id.fragment_bottom_nav)
           // NavigationUI.setupWithNavController(btmNav,findNavController(R.id.fragment_bottom_nav))

        }
    }

    override fun onStart() {
        super.onStart()

        binding.apply {

            //val controller = findNavController(R.id.fragment_bottom_nav)
            NavigationUI.setupWithNavController(btmNav,findNavController(R.id.fragment_bottom_nav))

        }
    }
}