package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲇᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1174 implements InterfaceC1173 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4299;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f4300;

    public /* synthetic */ C1174(String str, int i) {
        this.f4299 = i;
        this.f4300 = str;
    }

    public String toString() {
        switch (this.f4299) {
            case 1:
                return AbstractC1095.m2801(new StringBuilder("<"), this.f4300, '>');
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC1173
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public boolean mo1974(CharSequence charSequence, int i, int i2, C3521 c3521) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f4300)) {
            return true;
        }
        c3521.f11107 = (c3521.f11107 & 3) | 4;
        return false;
    }

    @Override // p000.InterfaceC1173
    public Object getResult() {
        return this;
    }
}
