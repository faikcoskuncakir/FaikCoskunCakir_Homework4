package com.example.faikcoskuncakir_homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.faikcoskuncakir_homework4.databinding.FragmentSayfaABinding
import com.example.faikcoskuncakir_homework4.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {

    private lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        binding.buttonSayfaY.setOnClickListener {
            Navigation.findNavController(it).popBackStack(R.id.anasayfaFragment, false)
        }

        return binding.root
    }

}