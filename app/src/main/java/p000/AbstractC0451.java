package p000;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.os.VibratorManager;
import android.view.ContentInfo;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0451 {
    public static /* synthetic */ Font.Builder m1654(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ VibratorManager m1658(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder m1659(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo m1661(Object obj) {
        return (ContentInfo) obj;
    }
}
