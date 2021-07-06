package com.hhi.clone_flo.ui.splash

import android.content.Intent
import android.os.Bundle
import com.hhi.clone_flo.R
import com.hhi.clone_flo.base.BaseActivity
import com.hhi.clone_flo.databinding.ActivitySplashBinding
import com.hhi.clone_flo.ui.main.MainActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }
    }
}