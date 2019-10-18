package com.example.fragments.Fragments


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

import com.example.fragments.R
import kotlinx.android.synthetic.main.fragment_data.view.*
import java.lang.Exception

/**
 * A simple [Fragment] subclass.
 */
class DataFragment : Fragment() {

    var llamada: DataList? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        try {

            llamada = context as DataList
        } catch (e: Exception){}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val miVista = inflater.inflate(R.layout.fragment_data, container, false)

        val editTxt = miVista.edtx
        val btnEnviar = miVista.btn

        btnEnviar.setOnClickListener {
            val texto = editTxt.text.toString()
            llamada!!.enviarTexto(texto)
        }
        return miVista
    }

    interface DataList{
        fun enviarTexto(text: String)
    }


}
