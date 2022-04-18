package com.fivemintub.motionlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var motionLayout: MotionLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        motionLayout = findViewById(R.id.motion_layout)
        motionLayout.addTransitionListener(object: MotionLayout.TransitionListener {
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {
                Log.e("Transition Started", "Transition Started")
                Log.e("Started", when(startId) {
                    R.id.start -> {
                        "Start"
                    }
                    R.id.end -> {
                        "End"
                    }
                    else -> {
                        startId.toString()
                    }
                })
                Log.e("Ended", when(endId) {
                    R.id.start -> {
                        "Start"
                    }
                    R.id.end -> {
                        "End"
                    }
                    else -> {
                        endId.toString()
                    }
                })
                Log.e("End","====\n\n\n\n\n====")
            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {
                Log.e("Transition Change", progress.toString())
                Log.e("Started", when(startId) {
                    R.id.start -> {
                        "Start"
                    }
                    R.id.end -> {
                        "End"
                    }
                    else -> {
                        startId.toString()
                    }
                })
                Log.e("Ended", when(endId) {
                    R.id.start -> {
                        "Start"
                    }
                    R.id.end -> {
                        "End"
                    }
                    else -> {
                        endId.toString()
                    }
                })
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                Log.e("Transition Completed", "Transition Completed")
                Log.e("Current", when(currentId) {
                    R.id.start -> {
                        "Start"
                    }
                    R.id.end -> {
                        "End"
                    }
                    else -> {
                        currentId.toString()
                    }
                })
                Log.e("End","====\n\n\n\n\n====")
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {
                Log.e("Transition Change", progress.toString())
                Log.e("Positive", positive.toString())
                Log.e("Started", when(triggerId) {
                    R.id.start -> {
                        "Start"
                    }
                    R.id.end -> {
                        "End"
                    }
                    else -> {
                        triggerId.toString()
                    }
                })
            }
        })
    }
}