import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.R
import com.example.testapplication.RoomData
import com.example.testapplication.databinding.ActivityItemrecyclerciewBinding
import com.example.testapplication.databinding.ActivityRecommendListBinding

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

