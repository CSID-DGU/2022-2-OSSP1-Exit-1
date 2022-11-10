package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.children
import androidx.fragment.app.Fragment
import com.example.testapplication.databinding.FragmentMatchingBinding

@Suppress("DEPRECATION")
class MatchingFragment: Fragment(), View.OnClickListener  {
    private lateinit var btn_mat1: Button
    private var _binding: FragmentMatchingBinding? = null
    private val binding: FragmentMatchingBinding
        get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMatchingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClickListener()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun setOnClickListener() {
        val btnSequence = binding.container2.children
        btnSequence.forEach { btn ->
            btn.setOnClickListener(this)
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_mat1 -> {
                val intent = Intent(getActivity(), Matching_intro::class.java)
                startActivity(intent)
            }
        }
    }
}


