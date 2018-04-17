package com.initishbhatt.marvelsuperheros.detail.presentation.ui

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.initishbhatt.marvelsuperheros.R
import com.initishbhatt.marvelsuperheros.characters.model.MarvelSuperHeroes
import com.initishbhatt.marvelsuperheros.databinding.ActivityDetailBinding
import com.initishbhatt.marvelsuperheros.detail.presentation.viewModel.DetailViewModel
import com.initishbhatt.marvelsuperheros.util.DetailViewModelFactory

/**
 * @author nitishbhatt
 */
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var detailViewModelFactory: DetailViewModelFactory
    private lateinit var detailViewModel: DetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        val superHero = intent.getSerializableExtra("superHero") as MarvelSuperHeroes
        detailViewModelFactory = DetailViewModelFactory(superHero)
        detailViewModel = ViewModelProviders.of(this, detailViewModelFactory).get(DetailViewModel::
        class.java)
        binding.detailViewModel = detailViewModel
    }


}
