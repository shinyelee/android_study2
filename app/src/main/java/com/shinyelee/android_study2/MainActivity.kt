package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    var viewList = ArrayList<View>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewList.add(layoutInflater.inflate(R.layout.fragment_home, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_favorite, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_profile, null))

        binding.viewPager.adapter = pagerAdapter()

    }

    inner class pagerAdapter : PagerAdapter() {

        override fun getCount() = viewList.size

        override fun isViewFromObject(view: View, `object`: Any) = view == `object`

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            var curView = viewList[position]
            binding.viewPager.addView(curView)
            return curView
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            binding.viewPager.removeView(`object` as View)
        }

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }
}