package com.mehmetdulger.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mehmetdulger.appnavigation.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    private lateinit var fragmentHomePageBinding: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentHomePageBinding = FragmentHomePageBinding.inflate(inflater)
        return fragmentHomePageBinding.root
        fragmentHomePageBinding.settingsImageView.setOnClickListener{
            clickSettingIcon()
        }


    }
    private fun clickSettingIcon(){
        findNavController().navigate(R.id.action_homePageFragment_to_settingsFragment)
    }


}