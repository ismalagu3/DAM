package com.example.pmydm01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.pmydm01.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.toastButton).setOnClickListener {
            val toast = Toast.makeText(context,"Hello toast", Toast.LENGTH_SHORT)
            toast.show()
        }

        view.findViewById<Button>(R.id.countButton).setOnClickListener { count(view)}

        binding.randomButton.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    private fun count(view: View){
        val TextView = view.findViewById<TextView>(R.id.textview_first)
        var string = TextView.text.toString()
        var int = string.toInt()
        int++
        TextView.text = int.toString()
    }

    fun random(){
        Math.random()*15
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}