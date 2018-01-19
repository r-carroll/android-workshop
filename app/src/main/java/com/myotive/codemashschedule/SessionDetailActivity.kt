package com.myotive.codemashschedule

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.myotive.codemashschedule.api.entity.SessionData

/**
 * Created by carror6 on 1/10/2018.
 */
class SessionDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speaker_detail)
        val session : SessionData? = intent.getParcelableExtra(EXTRA_SESSION)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // handle arrow click here
        if (item.itemId == android.R.id.home) {
            finish() // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val EXTRA_SESSION = "extra session"
    }

}