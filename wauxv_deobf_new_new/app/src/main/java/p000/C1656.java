package p000;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲈᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1656 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f5612;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1656(InputConnection inputConnection, C0441 c0441) {
        super(inputConnection, false);
        this.f5612 = c0441;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0833 c0102;
        C0102 c0103 = inputContentInfo == null ? null : new C0102(new C0102(inputContentInfo, 27), 28);
        AbstractC0228 abstractC0228 = (AbstractC0228) this.f5612.f2029;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((C0102) c0103.f1117).f1117).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0102) c0103.f1117).f1117;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((C0102) c0103.f1117).f1117;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0102 = new C0102(clipData, 2);
        } else {
            C0834 c0834 = new C0834();
            c0834.f3238 = clipData;
            c0834.f3239 = 2;
            c0102 = c0834;
        }
        c0102.mo1249(inputContentInfo3.getLinkUri());
        c0102.setExtras(bundle2);
        if (AbstractC3638.m5179(abstractC0228, c0102.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
