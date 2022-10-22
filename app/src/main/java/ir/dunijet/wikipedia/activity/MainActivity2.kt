package ir.dunijet.wikipedia.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import ir.dunijet.wikipedia.data.ItemPost
import ir.dunijet.wikipedia.databinding.ActivityMain2Binding
import ir.dunijet.wikipedia.fragments.SEND_DATA_TO_SECOND_ACTIVITY

class MainActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarAsli)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val dataPost = intent.getParcelableExtra<ItemPost>(SEND_DATA_TO_SECOND_ACTIVITY)
        if (dataPost != null) {
            showData(dataPost)
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return true
    }

    private fun showData(itemPost: ItemPost) {

        Glide
            .with(this)
            .load( itemPost.imgUrl )
            .into( binding.imgDetail )

        binding.txtDetailTitle.text = itemPost.txtTitle
        binding.txtDetailSubtitle.text = itemPost.txtSubtitle
        binding.txtDetailText.text = itemPost.txtDetail

        binding.fabDetailOpenWikipedia.setOnClickListener {

            // open wikipedia
            val url = "https://en.wikipedia.org/wiki/Main_Page"
            val intent = Intent( Intent.ACTION_VIEW , Uri.parse(url) )
            startActivity(intent)

        }
    }
}