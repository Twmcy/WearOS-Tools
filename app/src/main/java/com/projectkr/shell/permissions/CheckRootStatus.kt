package com.projectkr.shell.permissions

import android.content.Context
import android.os.Handler
import android.os.Looper
import kotlin.system.exitProcess

/**
 * 用于检查获取 root 权限的类
 * Created by helloklf on 2017/6/3.
 */
class CheckRootStatus(private val context: Context, private val next: Runnable? = null) {
    private val myHandler: Handler = Handler(Looper.getMainLooper())

    fun forceGetRoot() {
        // 如果需要在删除 Root 检测后执行某些操作，可以在这里添加相应的代码。
        // 如果有下一步操作 (next) 的话，可以在这里执行。
        next?.let {
            myHandler.post(it)
        }
    }
}