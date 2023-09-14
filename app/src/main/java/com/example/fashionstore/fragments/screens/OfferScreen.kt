package com.example.fashionstore.fragments.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.fashionstore.R
import com.example.fashionstore.databinding.FragmentOfferScreenBinding

class OfferScreen : Fragment() {
    private lateinit var binding:FragmentOfferScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOfferScreenBinding.inflate(layoutInflater)
        var pager = activity?.findViewById<ViewPager2>(R.id.onboard_pager)
        binding.txtNext.setOnClickListener{
            pager?.currentItem = 2
        }
        return binding.root
        return binding.root
    }

}