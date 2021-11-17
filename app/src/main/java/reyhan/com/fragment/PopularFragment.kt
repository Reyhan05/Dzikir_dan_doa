package reyhan.com.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import reyhan.com.adapter.NewsAdapter
import reyhan.com.data.DataNews
import reyhan.com.newsapp.bindNewsHeadline
import reyhan.com.newsapp.databinding.FragmentPopularBinding

class PopularFragment : Fragment() {

    private lateinit var binding: FragmentPopularBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPopularBinding.inflate(inflater, container, false)
        binding.rvPopularNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }
        /*binding.newsHeadline.apply {
            imgHeadline.setImageResource(DataNews.photoHeadline[1])
            tvTitleHeadline.text = DataNews.titleHeadline[1]
            tvDescHeadline.text = DataNews.contentHeadline[1]
            tvDateHeadline.text = DataNews.dateHeadline[1]
            tvAuthorHeadline.text = DataNews.authorHeadline[1]
        }*/
        bindNewsHeadline(binding.newsHeadline, 1)

        return binding.root
    }
}