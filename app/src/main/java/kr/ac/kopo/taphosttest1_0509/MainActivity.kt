package kr.ac.kopo.taphosttest1_0509

import android.app.TabActivity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost

        var tabSpec1 = tabHost.newTabSpec("first").setIndicator("첫 번째 탭")
        tabSpec1.setContent(R.id.shin1)
        tabHost.addTab(tabSpec1)

        var tabSpec2 = tabHost.newTabSpec("second").setIndicator("두 번째 탭")
        tabSpec2.setContent(R.id.shin2)
        tabHost.addTab(tabSpec2)

        var tabSpec3 = tabHost.newTabSpec("third").setIndicator("세 번째 탭")
        tabSpec3.setContent(R.id.shin3)
        tabHost.addTab(tabSpec3)

        tabHost.currentTab = 1
    }
}