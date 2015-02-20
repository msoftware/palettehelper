package io.sweers.palettehelper

import com.mixpanel.android.mpmetrics.MixpanelAPI
import org.json.JSONObject

val ANALYTICS_NAV_SOURCE = "Navigation Source"
val ANALYTICS_NAV_ENTER = "Navigation Enter Event"
val ANALYTICS_NAV_DESTINATION = "Navigation Destination"
val ANALYTICS_NAV_MAIN = "Main Activity"
val ANALYTICS_NAV_DETAIL = "Detail Activity"
val ANALYTICS_NAV_SHARE = "External Share"
val ANALYTICS_NAV_INTERNAL = "Internal storage"
val ANALYTICS_NAV_CAMERA = "Camera"
val ANALYTICS_KEY_NUMCOLORS = "Number of colors"
val ANALYTICS_KEY_PLAY_REFERRER = "Google Play install referrer"

public fun MixpanelAPI.trackNav(src: String, dest: String) {
    val props: JSONObject = JSONObject();
    props.put(ANALYTICS_NAV_SOURCE, src);
    props.put(ANALYTICS_NAV_DESTINATION, dest);
    track("Navigation", props);
}

public fun MixpanelAPI.trackMisc(key: String, value: String) {
    val props: JSONObject = JSONObject();
    props.put(key, value);
    track("Misc", props);
}