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

        private val name: TextView = itemView.findViewById(R.id.item_name)
        private val num: TextView = itemView.findViewById(R.id.item_num)

        fun bind(recyclerViewItem: RoomData) {
            name.text = recyclerViewItem.name
            num.text = recyclerViewItem.number
        }

    }
}

