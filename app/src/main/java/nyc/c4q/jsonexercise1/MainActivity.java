package nyc.c4q.jsonexercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private JSONObject exercise1= null;
    private JSONArray messageArray;

    private List<String> messageList= new ArrayList <>();
    private String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setJSON();
        getJSONArray();

        for (int i = 0; i <  messageArray.length(); i++) {
            try {
                String oneMessage= String.valueOf(messageArray.get(i));
                messageList.add(oneMessage);
                Log.d("messageList", oneMessage + messageList);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        RecyclerView rv = findViewById(R.id.recycler_view);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this, 3);
//        rv.hasFixedSize(true);
        rv.setLayoutManager(gridLayoutManager);
        rv.setAdapter(new MessageAdapter(messageList));

    }




    private String[] getStringArrayFromJson(JSONObject jsonObject, String species2) throws JSONException {
        JSONArray speciesArray = jsonObject.getJSONArray(species2);
        String[] species = new String[speciesArray.length()];
        for (int i = 0; i < speciesArray.length(); i++) {
            species[i] = (String) speciesArray.get(i);

        }
        return species;
    }

    private String getStringValueFromJson(JSONObject jsonObject, String name) throws JSONException {
        return jsonObject.getString(name);
    }

    private void setJSON() {
        try {
            exercise1= new JSONObject("{\"status\":\"success\",\"message\":[\"affenpinscher\",\"african\",\"airedale\",\"akita\",\"appenzeller\",\"basenji\",\"beagle\",\"bluetick\",\"borzoi\",\"bouvier\",\"boxer\",\"brabancon\",\"briard\",\"bulldog\",\"bullterrier\",\"cairn\",\"chihuahua\",\"chow\",\"clumber\",\"collie\",\"coonhound\",\"corgi\",\"dachshund\",\"dane\",\"deerhound\",\"dhole\",\"dingo\",\"doberman\",\"elkhound\",\"entlebucher\",\"eskimo\",\"germanshepherd\",\"greyhound\",\"groenendael\",\"hound\",\"husky\",\"keeshond\",\"kelpie\",\"komondor\",\"kuvasz\",\"labrador\",\"leonberg\",\"lhasa\",\"malamute\",\"malinois\",\"maltese\",\"mastiff\",\"mexicanhairless\",\"mountain\",\"newfoundland\",\"otterhound\",\"papillon\",\"pekinese\",\"pembroke\",\"pinscher\",\"pointer\",\"pomeranian\",\"poodle\",\"pug\",\"pyrenees\",\"redbone\",\"retriever\",\"ridgeback\",\"rottweiler\",\"saluki\",\"samoyed\",\"schipperke\",\"schnauzer\",\"setter\",\"sheepdog\",\"shiba\",\"shihtzu\",\"spaniel\",\"springer\",\"stbernard\",\"terrier\",\"vizsla\",\"weimaraner\",\"whippet\",\"wolfhound\"]}");
            Log.d(TAG, "setJSON: "+exercise1.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void getJSONArray() {
        try {
            messageArray = exercise1.getJSONArray("message");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}

