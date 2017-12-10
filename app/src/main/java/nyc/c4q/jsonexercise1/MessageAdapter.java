package nyc.c4q.jsonexercise1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by yokilam on 12/10/17.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {

    List<String> listOfMessage;

    public MessageAdapter(List <String> listOfMessage) {
        this.listOfMessage = listOfMessage;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childview= LayoutInflater.from(parent.getContext()).inflate(R.layout.message_itemview, parent, false);
        return new MessageViewHolder(childview);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
//        holder.bind(listOfMessage.get(position));
        holder.bind(listOfMessage.get(position), position);

    }

    @Override
    public int getItemCount() {
        return listOfMessage.size();
    }
}
