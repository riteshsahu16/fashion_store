package com.example.fashionstore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ecommerce.utils.ViewPagerAdapter
import com.example.fashionstore.R
import com.example.fashionstore.databinding.FragmentOnboardBinding
import com.example.fashionstore.fragments.screens.DiscoverScreen
import com.example.fashionstore.fragments.screens.OfferScreen
import com.example.fashionstore.fragments.screens.PaymentScreen

class OnboardFragment : Fragment() {
    private lateinit var binding:FragmentOnboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardBinding.inflate(layoutInflater)
        val springDotsIndicator = binding.dotsIndicator
        val fragmentList = listOf(DiscoverScreen(), OfferScreen(), PaymentScreen())
        val adapter = ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle )
        binding.onboardPager.adapter = adapter
        springDotsIndicator.attachTo(binding.onboardPager)

        return binding.root
    }
}