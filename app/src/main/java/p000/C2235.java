package p000;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᤝᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2235 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7238;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f7239;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Notification f7240;

    public C2235(String str, String str2, Notification notification) {
        this.f7238 = str;
        this.f7239 = str2;
        this.f7240 = notification;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f7238);
        sb.append(", id:0, tag:");
        return AbstractC2784.m4752(sb, this.f7239, "]");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4145(InterfaceC1597 interfaceC1597) {
        String str = this.f7238;
        String str2 = this.f7239;
        Notification notification = this.f7240;
        C1595 c1595 = (C1595) interfaceC1597;
        c1595.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1597.f5474);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            parcelObtain.writeString(str2);
            parcelObtain.writeTypedObject(notification, 0);
            c1595.f5472.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
