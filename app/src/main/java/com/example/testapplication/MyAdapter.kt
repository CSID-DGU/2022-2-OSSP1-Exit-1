import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.MatchingEnd
import com.example.testapplication.R
import com.example.testapplication.RoomData


class MyAdapter(
    private var recyclerViewItems: ArrayList<RoomData>
): RecyclerView.Adapter<MyAdapter.RecyclerViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_itemrecyclerciew, parent, false)
        return RecyclerViewViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        holder.bind(recyclerViewItems[position])

        holder.itemView.setOnClickListener {
            Log.d("클릭","클릭")
            val intent = Intent(holder.itemView?.context, MatchingEnd::class.java)
            ContextCompat.startActivity(holder.itemView.context, intent,null)
        }
    }

    override fun getItemCount(): Int {
        return recyclerViewItems.size
    }

    inner class RecyclerViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val title: TextView = itemView.findViewById(R.id.room_name)
        private val description: TextView = itemView.findViewById(R.id.room_description)
        private val hashtag: TextView = itemView.findViewById(R.id.room_hashtag)

        fun bind(recyclerViewItem: RoomData) {
            title.text = recyclerViewItem.room_title
            description.text = recyclerViewItem.room_des
            hashtag.text = recyclerViewItem.room_tag
        }
    }
}

