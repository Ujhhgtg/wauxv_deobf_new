package p000;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2348Ujhhgtgfeyxiexzf {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static boolean m3554Ujhhgtgfeyxiexzf(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC3696feyxiexzfUjhhgtg c2965Ujhhgtgfeyxiexzf;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(clipData, 3);
            } else {
                C3697Ujhhgtgfeyxiexzf c3697Ujhhgtgfeyxiexzf = new C3697Ujhhgtgfeyxiexzf();
                c3697Ujhhgtgfeyxiexzf.f11728Ujhhgtgfeyxiexzf = clipData;
                c3697Ujhhgtgfeyxiexzf.f11729Ujhhgtgfeyxiexzf = 3;
                c2965Ujhhgtgfeyxiexzf = c3697Ujhhgtgfeyxiexzf;
            }
            AbstractC1901feyxiexzfUjhhgtg.m3261Ujhhgtgfeyxiexzf(textView, c2965Ujhhgtgfeyxiexzf.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static boolean m3555Ujhhgtgfeyxiexzf(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC3696feyxiexzfUjhhgtg c2965Ujhhgtgfeyxiexzf;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(clipData, 3);
        } else {
            C3697Ujhhgtgfeyxiexzf c3697Ujhhgtgfeyxiexzf = new C3697Ujhhgtgfeyxiexzf();
            c3697Ujhhgtgfeyxiexzf.f11728Ujhhgtgfeyxiexzf = clipData;
            c3697Ujhhgtgfeyxiexzf.f11729Ujhhgtgfeyxiexzf = 3;
            c2965Ujhhgtgfeyxiexzf = c3697Ujhhgtgfeyxiexzf;
        }
        AbstractC1901feyxiexzfUjhhgtg.m3261Ujhhgtgfeyxiexzf(view, c2965Ujhhgtgfeyxiexzf.build());
        return true;
    }
}
