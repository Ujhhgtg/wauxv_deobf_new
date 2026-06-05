package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛲᛱUjhhgtgᛱ能不能ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1390feyxiexzfUjhhgtg extends AbstractC3336feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f4888Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public EditText f4889Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final ViewOnClickListenerC2974feyxiexzfUjhhgtg f4890Ujhhgtgfeyxiexzf;

    public C1390feyxiexzfUjhhgtg(C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg, int i) {
        super(c3335feyxiexzfUjhhgtg);
        this.f4888Ujhhgtgfeyxiexzf = R.drawable.design_password_eye;
        this.f4890Ujhhgtgfeyxiexzf = new ViewOnClickListenerC2974feyxiexzfUjhhgtg(10, this);
        if (i != 0) {
            this.f4888Ujhhgtgfeyxiexzf = i;
        }
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo2878Ujhhgtgfeyxiexzf() {
        m4840Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int mo2879Ujhhgtgfeyxiexzf() {
        return R.string.password_toggle_content_description;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int mo2880Ujhhgtgfeyxiexzf() {
        return this.f4888Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final View.OnClickListener mo2881Ujhhgtgfeyxiexzf() {
        return this.f4890Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean mo2882Ujhhgtgfeyxiexzf() {
        return true;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean mo2883Ujhhgtgfeyxiexzf() {
        EditText editText = this.f4889Ujhhgtgfeyxiexzf;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo2884Ujhhgtgfeyxiexzf(EditText editText) {
        this.f4889Ujhhgtgfeyxiexzf = editText;
        m4840Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void mo2885Ujhhgtgfeyxiexzf() {
        EditText editText = this.f4889Ujhhgtgfeyxiexzf;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f4889Ujhhgtgfeyxiexzf.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo2886Ujhhgtgfeyxiexzf() {
        EditText editText = this.f4889Ujhhgtgfeyxiexzf;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
