package com.example.fashionstore.fragments.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.fashionstore.R
import com.example.fashionstore.databinding.FragmentPaymentScreenBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PaymentScreen.newInstance] factory method to
 * create an instance of this fragment.
 */
class PaymentScreen : Fragment() {
    private lateinit var binding: FragmentPaymentScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPaymentScreenBinding.inflate(layoutInflater)
        var pager = activity?.findViewById<ViewPager2>(R.id.onboard_pager)
        binding.txtNext.setOnClickListener{
            findNavController().navigate(R.id.action_onboardFragment_to_homeFragment )
            isOnboardingFinished()
        }
        return binding.root
    }

    private fun isOnboardingFinished(){
        val sharedPrefrences = requireActivity().getSharedPreferences("onBoardingPref", Context.MODE_PRIVATE)
        val editor = sharedPrefrences.edit()
        editor.putBoolean("isFinished", true )
        editor.apply()
    }
}