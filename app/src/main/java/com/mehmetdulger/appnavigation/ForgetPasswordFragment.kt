package com.mehmetdulger.appnavigation

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.mehmetdulger.appnavigation.databinding.FragmentForgetPasswordBinding


class ForgetPasswordFragment : Fragment() {
    private lateinit var fragmentForgetPasswordBinding: FragmentForgetPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentForgetPasswordBinding = FragmentForgetPasswordBinding.inflate(inflater)
        return fragmentForgetPasswordBinding.root

        fragmentForgetPasswordBinding.sendPasswordButton.setOnClickListener {
            clickSendPasswordButton()
        }
    }

    private fun clickSendPasswordButton() {
        val eMail = fragmentForgetPasswordBinding.eMailEditText.text
        if (eMail.isNullOrEmpty()){
            Toast.makeText(context, "Email is cannot empty!",Toast.LENGTH_SHORT).show()
        }
    }
}