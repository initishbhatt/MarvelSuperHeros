package com.initishbhatt.marvelsuperheros.detail

import android.os.Bundle
import android.os.PersistableBundle
import com.initishbhatt.marvelsuperheros.databinding.ActivityDetailBinding
import dagger.android.support.DaggerAppCompatActivity

/**
 * @author nitishbhatt
 */
class DetailActivity : DaggerAppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
   /* @Inject
    lateinit var detailViewModelFactory: DetailViewModelFactory*/
    private lateinit var detailViewModel: DetailViewModel
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
      //  detailViewModel = ViewModelProviders.of(this, detailViewModelFactory).get(DetailViewModel::
       // class.java)
        //binding.detailViewModel = detailViewModel
    }


}
