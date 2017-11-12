package com.twiceyuan.demo.bottomnavigationbardemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fragments = mapOf<Int, Fragment>(
            Pair(R.id.action_menu_home, provideFragment("Home")),
            Pair(R.id.action_menu_comments, provideFragment("Comments")),
            Pair(R.id.action_menu_profile, provideFragment("Profile"))
    )

    private fun provideFragment(name: String) = instanceOf<DemoFragment>(Pair("name", name))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 默认
        turnTo(R.id.action_menu_home)

        // 切换
        navigation.setOnNavigationItemSelectedListener { turnTo(it.itemId) }
    }

    // 根据 ID 切换
    private fun turnTo(actionId: Int): Boolean {
        val fragment = fragments[actionId] ?: return false
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit()
        return true
    }
}
