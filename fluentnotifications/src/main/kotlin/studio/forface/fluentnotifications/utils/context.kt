package studio.forface.fluentnotifications.utils

import android.app.NotificationManager
import android.content.Context
import androidx.core.content.getSystemService
import studio.forface.fluentnotifications.NotificationManagerNotFoundException

/**
 * @return an instance of [NotificationManager] service
 * @throws NotificationManagerNotFoundException if [NotificationManager] cannot be retrieved
 */
internal val Context.notificationManager get() =
    getSystemService<NotificationManager>() ?: throw NotificationManagerNotFoundException()

/** @return [Intent] created from [Context] with the given [T] type and the optional [flags] */
@PublishedApi
internal inline fun <reified T: Any> Context.createIntent( flags: Int? = null ) = Intent<T>( this, flags )