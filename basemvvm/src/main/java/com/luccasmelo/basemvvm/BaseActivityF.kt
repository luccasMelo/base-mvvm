package com.luccasmelo.basemvvm

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<VM:ViewModel>:AppCompatActivity(), Base<VM>{

    lateinit var activityComponent: ActivityComponent
    lateinit var viewModel: VM
    lateinit var viewDataBinding: ViewDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this,resourceId())
        if(savedInstanceState == null) {
            injectDependencies()
            viewModel = viewModel()
            bind()
            onCreate()
        }else{
            onRecreate()
        }
    }



}

abstract class ActivityComponent