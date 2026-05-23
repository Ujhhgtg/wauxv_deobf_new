package p000;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0225 {
    public static boolean m1277(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0834 c0094;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0094 = new C0094(clipData, 3);
            } else {
                C0835 c0835 = new C0835();
                c0835.f3231 = clipData;
                c0835.f3232 = 3;
                c0094 = c0835;
            }
            AbstractC3578.m5173(textView, c0094.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean m1278(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0834 c0094;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0094 = new C0094(clipData, 3);
        } else {
            C0835 c0835 = new C0835();
            c0835.f3231 = clipData;
            c0835.f3232 = 3;
            c0094 = c0835;
        }
        AbstractC3578.m5173(view, c0094.build());
        return true;
    }
}
