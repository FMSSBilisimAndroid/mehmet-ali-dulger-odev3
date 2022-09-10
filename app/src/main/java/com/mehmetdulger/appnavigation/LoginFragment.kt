package com.mehmetdulger.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.mehmetdulger.appnavigation.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var fragmentLoginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentLoginBinding = FragmentLoginBinding.inflate(inflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentLoginBinding.apply {
            loginButton.setOnClickListener {
                clickLoginButton()
            }
            forgotPasswordTextView.setOnClickListener {
                clickForgotPasswordButton()
            }
        }
    }

    private fun clickLoginButton() {
        val username = fragmentLoginBinding.usernameEditText.text
        val password = fragmentLoginBinding.passwordEditText.text
        if (username.isNullOrEmpty() && password.isNullOrEmpty()) {
            Toast.makeText(
                context,
                "Username and password cannot be empty!",
                Toast.LENGTH_SHORT
            )
                .show()
        } else {
            findNavController().navigate(R.id.action_loginFragment_to_homePageFragment)
        }
    }

    private fun clickForgotPasswordButton() {
        findNavController().navigate(R.id.action_loginFragment_to_forgetPasswordFragment)
    }

}