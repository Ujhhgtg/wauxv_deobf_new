package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p000.C0420Ujhhgtgfeyxiexzf;
import p000.ChoreographerFrameCallbackC0402Ujhhgtgfeyxiexzf;
import p000.InterfaceC0651Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0651Ujhhgtgfeyxiexzf {
    @Override // p000.InterfaceC0651Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final List mo92Ujhhgtgfeyxiexzf() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.InterfaceC0651Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo93Ujhhgtgfeyxiexzf(Context context) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC0402Ujhhgtgfeyxiexzf(this, context.getApplicationContext()));
        return new C0420Ujhhgtgfeyxiexzf(9);
    }
}
