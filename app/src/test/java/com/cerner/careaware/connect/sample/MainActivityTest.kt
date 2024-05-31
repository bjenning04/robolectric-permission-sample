package com.cerner.careaware.connect.sample

import android.os.Build
import androidx.test.core.app.ActivityScenario
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

  @Test
  @Config(sdk = [Build.VERSION_CODES.S_V2])
  fun testApi32AndLower() {
    with(ActivityScenario.launch(MainActivity::class.java)) {
      this.onActivity { println("Verify stuff in here") }
    }
  }

  @Test
  @Config(sdk = [Build.VERSION_CODES.TIRAMISU])
  fun testApi33AndHigher() {
    with(ActivityScenario.launch(MainActivity::class.java)) {
      this.onActivity { println("Verify stuff in here") }
    }
  }
}
