package com.example.acitivitylearning

import android.app.Activity

object ActivityCollector {
    private val activities: ArrayList<Activity> = ArrayList<Activity>()

    public fun addActivity(activity: Activity) {
        activities.add(activity)
    }

    public fun removeActivity(activity: Activity) {
        activities.remove(activity)
    }

    public fun closeAll() {
        for (activity in activities) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
        activities.clear()
    }
}