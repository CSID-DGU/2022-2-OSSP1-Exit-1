import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.*
import com.example.testapplication.databinding.ActivityItemrecyclerciewBinding


class MyAdapter(private var roomList:  List<getRoomRecommendationModel.recommendationRoomInfo>
): RecyclerView.Adapter<MyAdapter.RecyclerViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_itemrecyclerciew, parent, false)
        return RecyclerViewViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        holder.bind(roomList[position])

        holder.itemView.setOnClickListener {
            Log.d("클릭","클릭")
            val intent = Intent(holder.itemView?.context, MainActivity::class.java)
            ContextCompat.startActivity(holder.itemView.context, intent,null)
        }
    }

    override fun getItemCount(): Int {
        return roomList.size
    }

    class RecyclerViewViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.findViewById(R.id.room_name)
        private val Intro: TextView = itemView.findViewById(R.id.room_description)
            fun bind(recyclerViewItem: getRoomRecommendationModel.recommendationRoomInfo) {
                title.text = recyclerViewItem.title
                Intro.text= recyclerViewItem.roomIntro
            }
         }

    fun setRepoList(repoList: List<getRoomRecommendationModel.recommendationRoomInfo>){
        roomList = repoList.toList()
        notifyDataSetChanged()
    }

}





