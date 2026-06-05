package p000;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱfeyxiexzfᛱ能不能ᛴᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3323feyxiexzfUjhhgtg extends AbstractC3389Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10360Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final WeakReference f10361Ujhhgtgfeyxiexzf;

    public C3323feyxiexzfUjhhgtg(EditText editText) {
        this.f10361Ujhhgtgfeyxiexzf = new WeakReference(editText);
    }

    @Override // p000.AbstractC3389Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void mo4812Ujhhgtgfeyxiexzf() {
        switch (this.f10360Ujhhgtgfeyxiexzf) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f10361Ujhhgtgfeyxiexzf.get();
                if (switchCompat != null) {
                    switchCompat.m29Ujhhgtgfeyxiexzf();
                }
                break;
        }
    }

    @Override // p000.AbstractC3389Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo4784Ujhhgtgfeyxiexzf() {
        switch (this.f10360Ujhhgtgfeyxiexzf) {
            case 0:
                C3324feyxiexzfUjhhgtg.m4813Ujhhgtgfeyxiexzf((EditText) this.f10361Ujhhgtgfeyxiexzf.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f10361Ujhhgtgfeyxiexzf.get();
                if (switchCompat != null) {
                    switchCompat.m29Ujhhgtgfeyxiexzf();
                }
                break;
        }
    }

    public C3323feyxiexzfUjhhgtg(SwitchCompat switchCompat) {
        this.f10361Ujhhgtgfeyxiexzf = new WeakReference(switchCompat);
    }
}
