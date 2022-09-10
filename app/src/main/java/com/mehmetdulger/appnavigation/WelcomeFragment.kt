package com.mehmetdulger.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mehmetdulger.appnavigation.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private lateinit var fragmentWelcomeBinding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentWelcomeBinding = FragmentWelcomeBinding.inflate(inflater)
        return fragmentWelcomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentWelcomeBinding.joinNowButton.setOnClickListener {
            clickJoinNowButton()
        }
    }

    private fun clickJoinNowButton() {
        findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
    }
}


