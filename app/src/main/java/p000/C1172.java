package p000;

import android.text.TextUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1172 implements InterfaceC1171 {

    public final /* synthetic */ int f4302;

    public final String f4303;

    public /* synthetic */ C1172(String str, int i) {
        this.f4302 = i;
        this.f4303 = str;
    }

    public String toString() {
        switch (this.f4302) {
            case 1:
                return AbstractC1194.m2786(new StringBuilder("<"), this.f4303, '>');
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC1171
    public boolean mo1880(CharSequence charSequence, int i, int i2, C3465 c3465) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f4303)) {
            return true;
        }
        c3465.f10951 = (c3465.f10951 & 3) | 4;
        return false;
    }

    @Override // p000.InterfaceC1171
    public Object getResult() {
        return this;
    }
}
