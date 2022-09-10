package com.mehmetdulger.appnavigation

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mehmetdulger.appnavigation.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    private lateinit var fragmentHomePageBinding: FragmentHomePageBinding
    private var saveNote = ""

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.v("PATIKADEV", "onAttach called.")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("PATIKADEV", "onCreate called.")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentHomePageBinding = FragmentHomePageBinding.inflate(inflater)
        return fragmentHomePageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val noteTextView = fragmentHomePageBinding.noteTextView
        val noteEditText = fragmentHomePageBinding.noteEditText
        fragmentHomePageBinding.settingsImageView.setOnClickListener {
            clickSettingIcon()
        }
        fragmentHomePageBinding.backIconHomePageImageView.setOnClickListener {
            clickBackIcon()
        }
        fragmentHomePageBinding.noteButton.setOnClickListener {
            noteTextView.text = noteEditText.text
            saveNote = noteEditText.text.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("saveNote", saveNote)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        if (savedInstanceState != null) {
            saveNote = savedInstanceState.getString("saveNote", "")
        }
        fragmentHomePageBinding.noteTextView.text = saveNote
    }

    override fun onStart() {
        super.onStart()
        Log.v("PATIKADEV", "onStart called.")
    }

    override fun onResume() {
        super.onResume()
        Log.v("PATIKADEV", "onResume called.")
    }

    override fun onPause() {
        super.onPause()
        Log.v("PATIKADEV", "onPause called.")
    }

    override fun onStop() {
        super.onStop()
        Log.v("PATIKADEV", "onStop called.")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.v("PATIKADEV", "onDestroyView called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("PATIKADEV", "onDestroy called.")
    }

    override fun onDetach() {
        super.onDetach()
        Log.v("PATIKADEV", "onDetach called.")
    }

    private fun clickBackIcon() {
        findNavController().popBackStack()
    }

    private fun clickSettingIcon() {
        findNavController().navigate(R.id.action_homePageFragment_to_settingsFragment)
    }
}