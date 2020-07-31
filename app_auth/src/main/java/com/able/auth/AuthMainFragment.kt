package com.able.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import androidx.lifecycle.ViewModelProviders

class AuthMainFragment : androidx.fragment.app.Fragment() {

    companion object {
        fun newInstance() = AuthMainFragment()
    }

    private lateinit var viewModel: AuthMainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.auth_main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProviders.of(this).get(AuthMainViewModel::class.java)
    }

}