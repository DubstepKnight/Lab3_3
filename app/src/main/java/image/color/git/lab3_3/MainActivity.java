package image.color.git.lab3_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;

import android.annotation.SuppressLint;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private MutableLiveData<String> animals = new MutableLiveData<>();

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animals.setValue("mammals");
        ImageView imgOne = findViewById(R.id.imageView);
        ImageView imgTwo = findViewById(R.id.imageView2);
        ImageView imgThree = findViewById(R.id.imageView3);
        ImageView imgFour = findViewById(R.id.imageView4);
        imgOne.setImageResource(R.raw.bear);
        imgTwo.setImageResource(R.raw.elephant);
        imgThree.setImageResource(R.raw.lamb);
        imgFour.setImageResource(R.raw.wolf);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if ( item.getItemId() == R.id.birds ) {
                animals.setValue("birds");
                ImageView imgOne = findViewById(R.id.imageView);
                ImageView imgTwo = findViewById(R.id.imageView2);
                ImageView imgThree = findViewById(R.id.imageView3);
                ImageView imgFour = findViewById(R.id.imageView4);
                imgOne.setImageResource(R.raw.huuhkaja);
                imgOne.setTag("huuhkaja");
                imgTwo.setImageResource(R.raw.punatulkku);
                imgTwo.setTag("punatulkku");
                imgThree.setImageResource(R.raw.peippo);
                imgThree.setTag("peippo");
                imgFour.setImageResource(R.raw.peukaloinen);
                imgFour.setTag("peukaloinen");
        }
        if (item.getItemId() == R.id.mammals) {
                animals.setValue("mammals");
                ImageView imgOne = findViewById(R.id.imageView);
                ImageView imgTwo = findViewById(R.id.imageView2);
                ImageView imgThree = findViewById(R.id.imageView3);
                ImageView imgFour = findViewById(R.id.imageView4);
                imgOne.setImageResource(R.raw.bear);
                imgOne.setTag("bear");
                imgTwo.setImageResource(R.raw.elephant);
                imgTwo.setTag("elephant");
                imgThree.setImageResource(R.raw.lamb);
                imgThree.setTag("lamb");
                imgFour.setImageResource(R.raw.wolf);
                imgFour.setTag("wolf");
        }
        return true;
    }

    public void imageClick(View img) {
        Log.d("imgClicker","image has been clicked" + img.getId());
        MediaPlayer mediaPlayer;
        if (animals.getValue() == "mammals") {
            if (img.getTag() == "bear" ) {
                mediaPlayer = MediaPlayer.create(this, R.raw.bear_audio);
                mediaPlayer.start();
            }
            if (img.getTag() == "lamb") {
                mediaPlayer = MediaPlayer.create(this, R.raw.lamb_audio);
                mediaPlayer.start();
            }
            if (img.getTag() == "wolf") {
                mediaPlayer = MediaPlayer.create(this, R.raw.wolf_audio);
                mediaPlayer.start();
            }
            if ( img.getTag() == "elephant") {
                mediaPlayer = MediaPlayer.create(this, R.raw.elephant_audio);
                mediaPlayer.start();
            }
        }
        if (animals.getValue() == "birds") {
            if (img.getTag() == "huuhkaja" ) {
                mediaPlayer = MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl);
                mediaPlayer.start();
            }
            if (img.getTag() == "punatulkku") {
                mediaPlayer = MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch);
                mediaPlayer.start();
            }
            if (img.getTag() == "peippo") {
                mediaPlayer = MediaPlayer.create(this, R.raw.peippo_chaffinch);
                mediaPlayer.start();
            }
            if ( img.getTag() == "peukaloinen") {
                mediaPlayer = MediaPlayer.create(this, R.raw.peukaloinen_wren);
                mediaPlayer.start();
            }
        }
    }



}
