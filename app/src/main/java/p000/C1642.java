package p000;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲁᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1642 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0466 f5577;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642(InputConnection inputConnection, C0466 c0466) {
        super(inputConnection, false);
        this.f5577 = c0466;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C0094 c0094;
        Bundle bundle2;
        InterfaceC0834 c0095;
        if (inputContentInfo == null) {
            c0094 = null;
        } else {
            c0094 = new C0094(27, new C0094(26, inputContentInfo));
        }
        AbstractC0218 abstractC0218 = (AbstractC0218) this.f5577.f2057;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((C0094) c0094.f1049).f1049).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0094) c0094.f1049).f1049;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((C0094) c0094.f1049).f1049;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0095 = new C0094(clipData, 2);
        } else {
            C0835 c0835 = new C0835();
            c0835.f3231 = clipData;
            c0835.f3232 = 2;
            c0095 = c0835;
        }
        c0095.mo1103(inputContentInfo3.getLinkUri());
        c0095.setExtras(bundle2);
        if (AbstractC3578.m5173(abstractC0218, c0095.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
