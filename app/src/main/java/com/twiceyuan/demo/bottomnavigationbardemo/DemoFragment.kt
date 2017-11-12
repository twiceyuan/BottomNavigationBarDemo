package com.twiceyuan.demo.bottomnavigationbardemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_demo.*

/**
 * Created by twiceYuan on 2017/11/12.
 *
 * Demo Fragment PlaceHolder
 */
class DemoFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_demo, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_content.text = arguments["name"]?.toString()
    }
}