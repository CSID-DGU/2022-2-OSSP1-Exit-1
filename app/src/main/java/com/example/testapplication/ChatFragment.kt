package com.example.testapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testapplication.databinding.FragmentChatBinding

class ChatFragment: Fragment() {
    private var _binding : FragmentChatBinding? = null
    private val binding : FragmentChatBinding
        get() = requireNotNull(_binding)

    private val mockRepoList = listOf<ChatlistData> (
        ChatlistData(
            chatlist_title ="즐기는자가 1류다,,,",
            chatlist_hashtag = "#방탈출 #홍대 #초보자_환영 #나도잡혔어"
        ),
        ChatlistData(
            chatlist_title ="공포 3단계 가보자고~",
            chatlist_hashtag = "#방탈출 #강남 #눈물각 #앞장서줘"
        ),
        ChatlistData(
            chatlist_title ="즐기는자가 1류다,,,",
            chatlist_hashtag = "#방탈출 #홍대 #초보자_환영 #나도잡혔어"
        ),
        ChatlistData(
            chatlist_title ="공포 3단계 가보자고~",
            chatlist_hashtag = "#방탈출 #강남 #눈물각 #앞장서줘"
        ),
        ChatlistData(
            chatlist_title ="즐기는자가 1류다,,,",
            chatlist_hashtag = "#방탈출 #홍대 #초보자_환영 #나도잡혔어"
        ),
        ChatlistData(
            chatlist_title ="공포 3단계 가보자고~",
            chatlist_hashtag = "#방탈출 #강남 #눈물각 #앞장서줘"
        ),
        ChatlistData(
            chatlist_title ="즐기는자가 1류다,,,",
            chatlist_hashtag = "#방탈출 #홍대 #초보자_환영 #나도잡혔어"
        ),
        ChatlistData(
            chatlist_title ="공포 3단계 가보자고~",
            chatlist_hashtag = "#방탈출 #강남 #눈물각 #앞장서줘"
        ),
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ChatlistAdapter(requireContext())
        binding.rvCategory.adapter = adapter
        adapter.setRepoList(mockRepoList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}