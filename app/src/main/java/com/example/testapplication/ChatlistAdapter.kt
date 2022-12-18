package com.example.testapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.databinding.LayoutChatlistBinding

class ChatlistAdapter(context : Context): RecyclerView.Adapter<ChatlistAdapter.ChatlistViewHolder>() {

    private val inflater by lazy { LayoutInflater.from(context)}
    private var categorylist: List<ChatlistData> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatlistAdapter.ChatlistViewHolder {
        val binding = LayoutChatlistBinding.inflate(inflater, parent,false)
        return ChatlistViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatlistAdapter.ChatlistViewHolder, position: Int) {
        holder.bind(categorylist[position])

        //holder.itemView.setOnClickListener {
        //  Log.d("클릭","클릭")
        //val intent = Intent(holder.itemView?.context, MatchingEnd::class.java)
        //ContextCompat.startActivity(holder.itemView.context, intent,null)
        //}
    }

    override fun getItemCount(): Int {
        return categorylist.size
    }

    class ChatlistViewHolder(
        private val binding: LayoutChatlistBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ChatlistData) {
            binding.tvChatlistTitle.setText(data.chatlist_title)
            binding.tvLastmsg.setText(data.chatlist_hashtag)

        }
    }

    fun setRepoList(repoList: List<ChatlistData>){
        this.categorylist = repoList.toList()
        notifyDataSetChanged()
    }
}
