package com.amigo.nav_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        view.findViewById<Button>(R.id.btn1).setOnClickListener{
            it.findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }

        //이미 위치가 두번째 Fragement에 있기 때문에 버튼을 눌러서 이동할 필요가 없어서, SecondFragment에서는 두번째 버튼의 동작을 지정하지 않는다.
        //view.findViewById<Button>(R.id.btn2).setOnClickListener{
        //}

        view.findViewById<Button>(R.id.btn3).setOnClickListener{
            it.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        return view
    }


}