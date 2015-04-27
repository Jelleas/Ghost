package nl.mprog.ghost.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import nl.mprog.ghost.R;
import nl.mprog.ghost.datastructure.Vocabulary;
import nl.mprog.ghost.enumeration.Language;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long z = System.currentTimeMillis();
        Vocabulary vocabulary = new Vocabulary(this, Language.ENGLISH);
        long x = System.currentTimeMillis();
        Log.w("Zyzzogeton? ", vocabulary.isWord("Zyzzogetonn") + "");
        Log.w("Zyzzogeto? ", vocabulary.isWord("Zyzzogeton") + "");
        Log.w("zygozoospore? ", vocabulary.isWord("zygozoospore") + "");
        Log.w("zygozospore? ", vocabulary.isWord("zygozospore") + "");
        Log.w("milliequivalent? ", vocabulary.isWord("milliequivalent") + "");
        Log.w("abalienation? ", vocabulary.isWord("abalienation") + "");
        Log.w("Hamamelidanthemum? ", vocabulary.isWord("Hamamelidanthemum") + "");
        Log.w("Hamamelidant? ", vocabulary.isWord("Hamamelidant") + "");

        long y = System.currentTimeMillis();
        Log.w("Time doing these: ", (y - z) + "");
        Log.w("Time doing these: ", (y - x) + "");

        try {
            long l = System.currentTimeMillis();
            String fileName = "test";
            FileOutputStream fos = this.openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(vocabulary);
            os.close();
            fos.close();
            long m = System.currentTimeMillis();

            FileInputStream fis = this.openFileInput(fileName);
            ObjectInputStream is = new ObjectInputStream(fis);
            Vocabulary dicky = (Vocabulary) is.readObject();
            is.close();
            fis.close();
            long n = System.currentTimeMillis();
            Log.w("Time doing these: ", (m - l) + "");
            Log.w("Time doing these: ", (n - m) + "");
            Log.w("Sexy beast? ", dicky.isWord("Sexy Beast") + "");
            Log.w("milliequivalent? ", vocabulary.isWord("milliequivalent") + "");
            Log.w("abalienation? ", vocabulary.isWord("abalienation") + "");
            Log.w("Hamamelidanthemum? ", vocabulary.isWord("Hamamelidanthemum") + "");
            Log.w("Hamamelidant? ", vocabulary.isWord("Hamamelidant") + "");
        } catch (Exception e) {
            Log.w("Oh shoot", "Damn");
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
