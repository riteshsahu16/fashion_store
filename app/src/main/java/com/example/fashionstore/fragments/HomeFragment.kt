package com.example.fashionstore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.fashionstore.R
import com.example.fashionstore.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        with(binding.viewFlipper){

            isAutoStart = true
            flipInterval = 2000
            setInAnimation(binding.root.context, android.R.anim.slide_in_left)
            setOutAnimation(binding.root.context, android.R.anim.slide_out_right)
        }



        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.nav_dashboard -> {
                    findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
                    true
                }

                else ->{
                    true
                }
            }
        }

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.bottomNavigation.selectedItemId = R.id.nav_home
    }

}