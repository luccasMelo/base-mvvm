package com.luccasmelo.samplebasemvvm

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.luccasmelo.basemvvm.BaseActivity
import kotlin.reflect.KClass

class MainActivity : BaseActivity() {

    override fun viewModel(): ViewModel {
       return ViewModelProviders.of(this).get(TestViewModel::class.java)
    }

    override fun injectDependencies() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun resourceId(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    override fun onCreate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRecreate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

class TestViewModel:ViewModel()