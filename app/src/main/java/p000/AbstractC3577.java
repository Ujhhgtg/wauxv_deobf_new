package p000;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3577 {
    public static String[] m5165(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0837 m5166(View view, C0837 c0837) {
        ContentInfo contentInfoMo1112 = c0837.f3236.mo1112();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo1112);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo1112 ? c0837 : new C0837(new C0094(contentInfoPerformReceiveContent));
    }
}
