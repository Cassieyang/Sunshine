package com.example.cassie.sunshine;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.text.SimpleDateFormat;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class ForecastFragment extends Fragment {

    public ForecastFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Add this line in order for this fragment to handle menu events.
               setHasOptionsMenu(true);
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.forecastfragment, menu);
        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_refresh) {
            return true;
               }
            return super.onOptionsItemSelected(item);
        }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] forecastArray ={
                "Today - Sunday - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Weds - Cloudy - 72/63",
                "Thurs - Asteroids - 75/65",
                "Fri - Heavy Rain - 75/65",
                "Sat - HELP TRAPPED IN WEATHERSTATION - 60/51",
                "Sun - Sunny - 80/68"
        };
        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray)
        );
        ArrayAdapter<String>mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);
        ListView listView = (ListView) rootView.findViewById(
                R.id.Listview_forecast);
        listView.setAdapter(mForecastAdapter);
       // HttpURLConnection urlConnection = null;
       // BufferedReader reader = null;
       // String forecastJsonStr = null;
      //  try{
         //   URL url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?q=9404043&mode=json&units=metric&cnt=7");
         //   urlConnection =(HttpURLConnection)url.openConnection();
         //   urlConnection.setRequestMethod("GET");
          //  urlConnection.connect();
          //  InputStream inputStream = urlConnection.getInputStream();
          //  StringBuffer buffer = new StringBuffer();
          //  if (inputStream == null){
           //     forecastJsonStr =  null;
          //  }
           // reader = new BufferedReader(new InputStreamReader(inputStream));
           // String line;
           // while ((line = reader.readLine()) !=null){
                //Since it's JSON,adding a newline isn't necessary(it won't affect parsing)
                //But it does make debugging a "lot" easier if you print out the completed
                //Buffer for debugging.
           //     buffer.append(line + "\n");
          //  }
          //  if (buffer.length() == 0){
                //Stream is empty.No point in parsing.
                //forecastJsonStr = null;
          //      return null;
         //   }
         //   forecastJsonStr = buffer.toString();
       // }catch(IOException e){
       //    Log.e("ForecastFragment","Error",e);
        //    return null;
       // }finally{
       //    if (urlConnection !=null){
        //        urlConnection.disconnect();
         //   }
         //   if(reader !=null){
          //      try{
         //           reader.close();
         //       }catch (final IOException e){
         //           Log.e("ForecastFragment","Error closing stream",e);
          //      }
          //  }
      //  }

        return rootView;
    }
    //public class FetchWeatherTask extends AsyncTask<Void, Void, Void> {
       // private final String LOG_TAG = FetchWeatherTask.class.getSimpleName();
        /* The date/time conversion code is going to be moved outside the asynctask later,
         * so for convenience we're breaking it out into its own method now.
         */
        //private String getReadableDateString(long time){
             // Because the API returns a unix timestamp (measured in seconds),
            // it must be converted to milliseconds in order to be converted to valid date.
            //SimpleDateFormat shortenedDateFormat = new SimpleDateFormat("EEE MMM dd");
            //return shortenedDateFormat.format(time);
       // }

        /**
         * Prepare the weather high/lows for presentation.
         */

}
