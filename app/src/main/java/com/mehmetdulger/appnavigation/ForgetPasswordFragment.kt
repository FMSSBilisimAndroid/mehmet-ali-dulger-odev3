package com.mehmetdulger.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.mehmetdulger.appnavigation.databinding.FragmentForgetPasswordBinding

class ForgetPasswordFragment : Fragment() {
    private lateinit var fragmentForgetPasswordBinding: FragmentForgetPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentForgetPasswordBinding = FragmentForgetPasswordBinding.inflate(inflater)
        return fragmentForgetPasswordBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentForgetPasswordBinding.sendPasswordButton.setOnClickListener {
            clickSendPasswordButton()
        }
    }

    private fun clickSendPasswordButton() {
        val eMail = fragmentForgetPasswordBinding.eMailEditText.text
        if (eMail.isNullOrEmpty()) {
            Toast.makeText(context, "Email is cannot empty!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(
                context,
                "Password reset link has been sent to your e-mail address",
                Toast.LENGTH_LONG
            ).show()
            findNavController().navigateUp()
        }
    }
}