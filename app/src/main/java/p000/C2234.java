package p000;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2234 {

    public final String f7232;

    public CharSequence f7233;

    public final int f7234;

    public String f7235;

    public final Uri f7236 = Settings.System.DEFAULT_NOTIFICATION_URI;

    public final AudioAttributes f7237;

    public C2234(String str, int i) {
        
        this.f7232 = str;
        this.f7234 = i;
        this.f7237 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }
}
