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
import reyhan.com.newsapp.databinding.FragmentTopBinding


class TopFragment : Fragment() {

    private lateinit var binding: FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTopBinding.inflate(inflater, container, false)
        binding.rvTopNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTopNews)
        }
        /*binding.newsHeadline.apply {
            imgHeadline.setImageResource(DataNews.photoHeadline[2])
            tvTitleHeadline.text = DataNews.titleHeadline[2]
            tvDescHeadline.text = DataNews.contentHeadline[2]
            tvDateHeadline.text = DataNews.dateHeadline[2]
            tvAuthorHeadline.text = DataNews.authorHeadline[2]
        }*/
        bindNewsHeadline(binding.newsHeadline, 2)

        return binding.root
    }
}

