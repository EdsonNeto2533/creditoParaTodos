package com.example.creditoParaTodos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.segundofragment.*

class SegundoFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.segundofragment,container,false)

        val btn: Button = view.findViewById(R.id.btn5500)

        btn.setOnClickListener { view ->
            val tx = fragmentManager?.beginTransaction()
            if (tx != null) {
                tx.replace(R.id.container_fragment, emprestimoFragment())
            }
            if (tx != null) {
                tx.commit()
            }
        }
        /*
        btn5500.setOnClickListener {
            val tx = fragmentManager?.beginTransaction()
            if (tx != null) {
                tx.replace(R.id.container_fragment, emprestimoFragment())
            }
            if (tx != null) {
                tx.commit()
            }
        }

         */




        return view
    }

}