package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.fragments.Fragments.DataFragment
import com.example.fragments.Fragments.DetailsFragment

class MainActivity : FragmentActivity(), DataFragment.DataList {



    override fun enviarTexto(text: String) {
    val dFragment = supportFragmentManager.findFragmentById(R.id.detail_fragment) as DetailsFragment

        dFragment.renderizar(text)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
