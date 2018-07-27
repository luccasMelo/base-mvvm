package com.luccasmelo.basemvvm

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity:AppCompatActivity(), Base{

    lateinit var activityComponent: ActivityComponent
    lateinit var viewModel: ViewModel
    lateinit var viewDataBinding: ViewDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this,resourceId())
        if(savedInstanceState == null) {
            injectDependencies()
            viewModel = ViewModelProviders.of(this).get(viewModel())
            bind()
            onCreate()
        }else{
            onRecreate()
        }
    }





}

abstract class ActivityComponent