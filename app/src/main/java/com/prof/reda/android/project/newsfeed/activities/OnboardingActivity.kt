package com.prof.reda.android.project.newsfeed.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.prof.reda.android.project.newsfeed.R
import com.prof.reda.android.project.newsfeed.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityOnboardingBinding>(this,
            R.layout.activity_onboarding
        )

        binding.continueBtn.setOnClickListener{
            startActivity(Intent(this, AuthActivity::class.java))
            finish()
        }
    }
}