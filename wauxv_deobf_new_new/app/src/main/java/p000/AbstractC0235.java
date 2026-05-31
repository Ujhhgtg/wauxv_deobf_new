package p000;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲇᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0235 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m1423(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0833 c0102;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0102 = new C0102(clipData, 3);
            } else {
                C0834 c0834 = new C0834();
                c0834.f3238 = clipData;
                c0834.f3239 = 3;
                c0102 = c0834;
            }
            AbstractC3638.m5179(textView, c0102.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m1424(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0833 c0102;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0102 = new C0102(clipData, 3);
        } else {
            C0834 c0834 = new C0834();
            c0834.f3238 = clipData;
            c0834.f3239 = 3;
            c0102 = c0834;
        }
        AbstractC3638.m5179(view, c0102.build());
        return true;
    }
}
