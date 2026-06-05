package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ能不能ᛴᛳ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0250Ujhhgtgfeyxiexzf implements TextWatcher {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1581Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ EditText f1582Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0250Ujhhgtgfeyxiexzf(EditText editText, int i) {
        this.f1581Ujhhgtgfeyxiexzf = i;
        this.f1582Ujhhgtgfeyxiexzf = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f1581Ujhhgtgfeyxiexzf) {
            case 0:
                this.f1582Ujhhgtgfeyxiexzf.addTextChangedListener(new C0249Ujhhgtgfeyxiexzf(0));
                break;
            default:
                this.f1582Ujhhgtgfeyxiexzf.addTextChangedListener(new C0249Ujhhgtgfeyxiexzf(1));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f1581Ujhhgtgfeyxiexzf;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f1581Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    private final void m1410Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    private final void m1411Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    private final void m1412Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    private final void m1413Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
    }
}
