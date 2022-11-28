package com.example.testapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testapplication.adapter.CategoryAdapter
import com.example.testapplication.databinding.FragmentCategoryBinding

class CategoryFragment: Fragment() {
    private var _binding : FragmentCategoryBinding? = null
    private val binding : FragmentCategoryBinding
        get() = requireNotNull(_binding)

    private val mockRepoList = listOf<CategoryData> (
        CategoryData(
            category_img = R.drawable.qmark,
            category_title ="퀘스천마크",
            category_genre = "장르: 기타",
            category_diff = "난이도: 어려움",
            category_area = "지역: 서울특별시 마포구 와우산로(홍대)"
        ),
        CategoryData(
            category_img = R.drawable.qmark,
            category_title ="퀘스천마크",
            category_genre = "장르: 기타",
            category_diff = "난이도: 어려움",
            category_area = "지역: 서울특별시 마포구 와우산로(홍대)"
        ),
        CategoryData(
            category_img = R.drawable.qmark,
            category_title ="퀘스천마크",
            category_genre = "장르: 기타",
            category_diff = "난이도: 어려움",
            category_area = "지역: 서울특별시 마포구 와우산로(홍대)"
        ),
        CategoryData(
            category_img = R.drawable.qmark,
            category_title ="퀘스천마크",
            category_genre = "장르: 기타",
            category_diff = "난이도: 어려움",
            category_area = "지역: 서울특별시 마포구 와우산로(홍대)"
        ),
        CategoryData(
            category_img = R.drawable.qmark,
            category_title ="퀘스천마크",
            category_genre = "장르: 기타",
            category_diff = "난이도: 어려움",
            category_area = "지역: 서울특별시 마포구 와우산로(홍대)"
        ),
        CategoryData(
            category_img = R.drawable.qmark,
            category_title ="퀘스천마크",
            category_genre = "장르: 기타",
            category_diff = "난이도: 어려움",
            category_area = "지역: 서울특별시 마포구 와우산로(홍대)"
        ),
        CategoryData(
            category_img = R.drawable.qmark,
            category_title ="퀘스천마크",
            category_genre = "장르: 기타",
            category_diff = "난이도: 어려움",
            category_area = "지역: 서울특별시 마포구 와우산로(홍대)"
        )

    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = CategoryAdapter(requireContext())
        binding.rvRepos.adapter = adapter
        adapter.setRepoList(mockRepoList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}