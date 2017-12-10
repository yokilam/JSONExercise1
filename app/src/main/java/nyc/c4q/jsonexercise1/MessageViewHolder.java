package nyc.c4q.jsonexercise1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yokilam on 12/10/17.
 */

class MessageViewHolder extends RecyclerView.ViewHolder{

    private TextView textview;


    public MessageViewHolder(View itemView) {
        super(itemView);

        textview= itemView.findViewById(R.id.textView);
    }

    public void bind(String message) {

//        textview.setText(String.valueOf(position) + ": " + message);
        textview.setText(message);
    }
}
