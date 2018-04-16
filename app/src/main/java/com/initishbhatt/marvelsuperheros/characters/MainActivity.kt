package com.initishbhatt.marvelsuperheros.characters

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.initishbhatt.marvelsuperheros.R
import com.initishbhatt.marvelsuperheros.characters.model.MarvelSuperHeroes
import com.initishbhatt.marvelsuperheros.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity
import timber.log.Timber
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProviders.of(this,mainViewModelFactory).get(MainViewModel::class.java)
        binding.viewModel = mainViewModel
        binding.rvHeros.layoutManager = GridLayoutManager(this, 1)
        binding.rvHeros.setHasFixedSize(true)
        val superHeroAdapter = SuperHeroAdapter(ArrayList<MarvelSuperHeroes>())
        binding.rvHeros.adapter = superHeroAdapter

        mainViewModel.herosData.observe(this, Observer<List<MarvelSuperHeroes>> {
            if (it == null || it.isEmpty())
                Timber.e("no data")
            else {
                superHeroAdapter.replaceData(it)
            }
        })
        mainViewModel.showAllSuperHeros()
    }
}
