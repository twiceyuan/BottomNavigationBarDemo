package com.twiceyuan.demo.bottomnavigationbardemo

import android.support.v4.app.Fragment
import org.jetbrains.anko.bundleOf

/**
 * Created by twiceYuan on 2017/11/12.
 *
 * Global Utils
 */
inline fun <reified T : Fragment> instanceOf(vararg params: Pair<String, Any>)
        = T::class.java.newInstance().apply {
    arguments = bundleOf(*params)
}!!
