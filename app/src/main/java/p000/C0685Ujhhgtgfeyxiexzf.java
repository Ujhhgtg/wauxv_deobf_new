package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲ能不能ᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0685Ujhhgtgfeyxiexzf extends C0400Ujhhgtgfeyxiexzf {
    @Override // p000.C0400Ujhhgtgfeyxiexzf, com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final String mo896Ujhhgtgfeyxiexzf() {
        return C0685Ujhhgtgfeyxiexzf.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // p000.C0400Ujhhgtgfeyxiexzf, com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public final void mo905feyxiexzfUjhhgtg() {
        EditText editText;
        if (m898Ujhhgtgfeyxiexzf() != null) {
            Ujhhgtgfeyxiexzf.m878Ujhhgtgfeyxiexzf(m898Ujhhgtgfeyxiexzf());
            this.f996Ujhhgtgfeyxiexzf = false;
        }
        RelativeLayout relativeLayout = this.f2179feyxiexzfUjhhgtg.f2155Ujhhgtgfeyxiexzf;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        int iM897Ujhhgtgfeyxiexzf = m897Ujhhgtgfeyxiexzf(m904Ujhhgtgfeyxiexzf()) != 0 ? m897Ujhhgtgfeyxiexzf(m904Ujhhgtgfeyxiexzf()) : this.f997Ujhhgtgfeyxiexzf.mo1386Ujhhgtgfeyxiexzf(m904Ujhhgtgfeyxiexzf());
        if (iM897Ujhhgtgfeyxiexzf == 0) {
            iM897Ujhhgtgfeyxiexzf = m904Ujhhgtgfeyxiexzf() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        C0399Ujhhgtgfeyxiexzf c0399Ujhhgtgfeyxiexzf = this.f2179feyxiexzfUjhhgtg;
        String string = (c0399Ujhhgtgfeyxiexzf == null || (editText = c0399Ujhhgtgfeyxiexzf.f2156Ujhhgtgfeyxiexzf) == null) ? this.f2174feyxiexzfUjhhgtg : editText.getText().toString();
        this.f999Ujhhgtgfeyxiexzf = 0L;
        View viewM894Ujhhgtgfeyxiexzf = m894Ujhhgtgfeyxiexzf(iM897Ujhhgtgfeyxiexzf);
        this.f2179feyxiexzfUjhhgtg = new C0399Ujhhgtgfeyxiexzf(this, viewM894Ujhhgtgfeyxiexzf);
        if (viewM894Ujhhgtgfeyxiexzf != null) {
            viewM894Ujhhgtgfeyxiexzf.setTag(this.f2166feyxiexzfUjhhgtg);
        }
        Ujhhgtgfeyxiexzf.m891feyxiexzfUjhhgtg(viewM894Ujhhgtgfeyxiexzf);
        this.f2174feyxiexzfUjhhgtg = string;
        m1680feyxiexzfUjhhgtg();
    }

    @Override // p000.C0400Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ */
    public final boolean mo1678feyxiexzfUjhhgtg() {
        return this.f995Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C0400Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final C0400Ujhhgtgfeyxiexzf mo1679feyxiexzfUjhhgtg(C2579Ujhhgtgfeyxiexzf c2579Ujhhgtgfeyxiexzf) {
        this.f992Ujhhgtgfeyxiexzf = c2579Ujhhgtgfeyxiexzf;
        if (this.f996Ujhhgtgfeyxiexzf) {
            c2579Ujhhgtgfeyxiexzf.m3831Ujhhgtgfeyxiexzf(this);
        }
        return this;
    }
}
