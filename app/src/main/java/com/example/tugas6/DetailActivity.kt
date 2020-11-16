package com.example.tugas6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.detail_activity.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var img = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskripsi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            gambar.setImageResource(img)
            tv_nama_detail.text =partId
            tv_deskripsi.text = deskripsi
        }
    }}