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
import reyhan.com.newsapp.databinding.FragmentAllNewsBinding

class AllNewsFragment : Fragment() {

    private lateinit var binding: FragmentAllNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllNewsBinding.inflate(inflater, container, false)
        binding.rvAllNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataAllNews)
        }

        /*
        binding.newsHeadline.apply {
            imgHeadline.setImageResource(DataNews.photoHeadline[0])
            tvTitleHeadline.text = DataNews.titleHeadline[0]
            tvDescHeadline.text = DataNews.contentHeadline[0]
            tvDateHeadline.text = DataNews.dateHeadline[0]
            tvAuthorHeadline.text = DataNews.authorHeadline[0]
        }*/
        bindNewsHeadline(binding.newsHeadline, 0)

        return binding.root
    }
}