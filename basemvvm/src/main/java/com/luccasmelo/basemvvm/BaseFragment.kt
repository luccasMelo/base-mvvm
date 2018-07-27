package com.luccasmelo.basemvvm

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment<B : ViewDataBinding, VM : ViewModel> : Fragment(), Base<VM> {

    lateinit var activityComponent: ActivityComponent
    lateinit var activity: BaseActivity
    lateinit var binding: B
    lateinit var viewModel: VM


    override fun onAttach(context: Context?) {
        super.onAttach(context)

            activity = context as BaseActivity
            activityComponent = activity.activityComponent
            injectDependencies()


    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, resourceId(), container, false)
        if (savedInstanceState == null) {
            viewModel = viewModel()
            bind()
            onCreate()
        }else{
            onRecreate()
        }
        return binding.root
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        injectDependencies()

    }


}