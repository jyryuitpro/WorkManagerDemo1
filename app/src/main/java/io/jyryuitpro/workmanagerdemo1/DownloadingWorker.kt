package io.jyryuitpro.workmanagerdemo1

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class DownloadingWorker(context: Context, params: WorkerParameters) : Worker(context, params) {

    override fun doWork(): Result {
        try {
            for (i in 0 ..3000) {
                Log.i("MYTAG", "Downloading $i")
            }

            return Result.success()
        } catch (e: Exception) {
            return Result.failure()
        }
    }
}