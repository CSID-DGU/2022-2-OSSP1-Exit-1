package com.example.testapplication

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.databinding.LayoutChatlistBinding

class ChatlistAdapter(context : Context): RecyclerView.Adapter<ChatlistAdapter.ChatlistViewHolder>() {

    private val inflater by lazy { LayoutInflater.from(context)}
    private var categorylist: List<getRoomListModel.roomData> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatlistAdapter.ChatlistViewHolder {
        val binding = LayoutChatlistBinding.inflate(inflater, parent,false)
        return ChatlistViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatlistAdapter.ChatlistViewHolder, position: Int) {
        holder.bind(categorylist[position])

        holder.itemView.setOnClickListener {
            Log.d("클릭","클릭")
            val intent = Intent(holder.itemView?.context, ChatActivity::class.java)
            ContextCompat.startActivity(holder.itemView.context, intent,null)
            }
    }

    override fun getItemCount(): Int {
        return categorylist.size
    }

    class ChatlistViewHolder(
        private val binding: LayoutChatlistBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: getRoomListModel.roomData) {
            //binding.ivChatlistImg.setImageDrawable(binding.root.context.getDrawable(data.chatlist_img))
            binding.tvChatlistTitle.setText(data.title)

        }
    }

    fun setRepoList(repoList: List<getRoomListModel.roomData>){
        this.categorylist = repoList.toList()
        notifyDataSetChanged()
    }
}
