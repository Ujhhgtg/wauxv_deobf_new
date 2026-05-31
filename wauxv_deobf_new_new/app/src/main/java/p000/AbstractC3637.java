package p000;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᛸᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3637 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String[] m5171(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C0836 m5172(View view, C0836 c0836) {
        ContentInfo contentInfoMo1258 = c0836.f3243.mo1258();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo1258);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo1258 ? c0836 : new C0836(new C0102(contentInfoPerformReceiveContent));
    }
}
