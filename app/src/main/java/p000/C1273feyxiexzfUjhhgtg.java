package p000;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛲᛳᛱUjhhgtgᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1273feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f4648Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f4649Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Notification f4650Ujhhgtgfeyxiexzf;

    public C1273feyxiexzfUjhhgtg(String str, String str2, Notification notification) {
        this.f4648Ujhhgtgfeyxiexzf = str;
        this.f4649Ujhhgtgfeyxiexzf = str2;
        this.f4650Ujhhgtgfeyxiexzf = notification;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f4648Ujhhgtgfeyxiexzf);
        sb.append(", id:0, tag:");
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, this.f4649Ujhhgtgfeyxiexzf, "]");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2843Ujhhgtgfeyxiexzf(InterfaceC0740Ujhhgtgfeyxiexzf interfaceC0740Ujhhgtgfeyxiexzf) {
        String str = this.f4648Ujhhgtgfeyxiexzf;
        String str2 = this.f4649Ujhhgtgfeyxiexzf;
        Notification notification = this.f4650Ujhhgtgfeyxiexzf;
        C0609Ujhhgtgfeyxiexzf c0609Ujhhgtgfeyxiexzf = (C0609Ujhhgtgfeyxiexzf) interfaceC0740Ujhhgtgfeyxiexzf;
        c0609Ujhhgtgfeyxiexzf.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0740Ujhhgtgfeyxiexzf.f3016Ujhhgtgfeyxiexzf);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            parcelObtain.writeString(str2);
            parcelObtain.writeTypedObject(notification, 0);
            c0609Ujhhgtgfeyxiexzf.f2638Ujhhgtgfeyxiexzf.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
