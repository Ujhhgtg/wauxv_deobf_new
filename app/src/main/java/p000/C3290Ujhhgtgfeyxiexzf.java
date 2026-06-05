package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3290Ujhhgtgfeyxiexzf implements InterfaceC3294Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10321Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f10322Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3290Ujhhgtgfeyxiexzf(String str, int i) {
        this.f10321Ujhhgtgfeyxiexzf = i;
        this.f10322Ujhhgtgfeyxiexzf = str;
    }

    public String toString() {
        switch (this.f10321Ujhhgtgfeyxiexzf) {
            case 1:
                return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(new StringBuilder("<"), this.f10322Ujhhgtgfeyxiexzf, '>');
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC3294Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public boolean mo3932Ujhhgtgfeyxiexzf(CharSequence charSequence, int i, int i2, C1776feyxiexzfUjhhgtg c1776feyxiexzfUjhhgtg) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f10322Ujhhgtgfeyxiexzf)) {
            return true;
        }
        c1776feyxiexzfUjhhgtg.f5955Ujhhgtgfeyxiexzf = (c1776feyxiexzfUjhhgtg.f5955Ujhhgtgfeyxiexzf & 3) | 4;
        return false;
    }

    @Override // p000.InterfaceC3294Ujhhgtgfeyxiexzf
    public Object getResult() {
        return this;
    }
}
