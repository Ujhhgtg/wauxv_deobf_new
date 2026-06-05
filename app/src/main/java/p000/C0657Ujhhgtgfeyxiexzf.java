package p000;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛴᛳᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0657Ujhhgtgfeyxiexzf extends InputConnectionWrapper {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C2579Ujhhgtgfeyxiexzf f2767Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0657Ujhhgtgfeyxiexzf(InputConnection inputConnection, C2579Ujhhgtgfeyxiexzf c2579Ujhhgtgfeyxiexzf) {
        super(inputConnection, false);
        this.f2767Ujhhgtgfeyxiexzf = c2579Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf;
        Bundle bundle2;
        InterfaceC3696feyxiexzfUjhhgtg c2965Ujhhgtgfeyxiexzf2;
        if (inputContentInfo == null) {
            c2965Ujhhgtgfeyxiexzf = null;
        } else {
            c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(28, new C2965Ujhhgtgfeyxiexzf(27, inputContentInfo));
        }
        AbstractC2346Ujhhgtgfeyxiexzf abstractC2346Ujhhgtgfeyxiexzf = (AbstractC2346Ujhhgtgfeyxiexzf) this.f2767Ujhhgtgfeyxiexzf.f8346Ujhhgtgfeyxiexzf;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((C2965Ujhhgtgfeyxiexzf) c2965Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C2965Ujhhgtgfeyxiexzf) c2965Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((C2965Ujhhgtgfeyxiexzf) c2965Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c2965Ujhhgtgfeyxiexzf2 = new C2965Ujhhgtgfeyxiexzf(clipData, 2);
        } else {
            C3697Ujhhgtgfeyxiexzf c3697Ujhhgtgfeyxiexzf = new C3697Ujhhgtgfeyxiexzf();
            c3697Ujhhgtgfeyxiexzf.f11728Ujhhgtgfeyxiexzf = clipData;
            c3697Ujhhgtgfeyxiexzf.f11729Ujhhgtgfeyxiexzf = 2;
            c2965Ujhhgtgfeyxiexzf2 = c3697Ujhhgtgfeyxiexzf;
        }
        c2965Ujhhgtgfeyxiexzf2.mo4442Ujhhgtgfeyxiexzf(inputContentInfo3.getLinkUri());
        c2965Ujhhgtgfeyxiexzf2.setExtras(bundle2);
        if (AbstractC1901feyxiexzfUjhhgtg.m3261Ujhhgtgfeyxiexzf(abstractC2346Ujhhgtgfeyxiexzf, c2965Ujhhgtgfeyxiexzf2.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
