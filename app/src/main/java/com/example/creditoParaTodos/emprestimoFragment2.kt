package com.example.creditoParaTodos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.emprestimo_frag_layout.*

class emprestimoFragment2: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.emprestimo_frag_layout2,container,false)


        val check: CheckBox = view.findViewById(R.id.checkemp)

        check.setOnClickListener {
            habilitabtn()
        }


        return view


    }


    //habilita ou desabilita o botao contratar
    fun habilitabtn() {
        if (checkemp.isChecked) {
            btnContratar.isEnabled = true
        } else {
            btnContratar.isEnabled = false
        }
    }
}