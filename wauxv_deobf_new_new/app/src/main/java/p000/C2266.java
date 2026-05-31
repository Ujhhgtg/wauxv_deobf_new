package p000;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤝᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2266 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7358;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f7359;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Notification f7360;

    public C2266(String str, String str2, Notification notification) {
        this.f7358 = str;
        this.f7359 = str2;
        this.f7360 = notification;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f7358);
        sb.append(", id:0, tag:");
        return AbstractC2844.m4786(sb, this.f7359, "]");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4274(InterfaceC1609 interfaceC1609) {
        String str = this.f7358;
        String str2 = this.f7359;
        Notification notification = this.f7360;
        C1607 c1607 = (C1607) interfaceC1609;
        c1607.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1609.f5508);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            parcelObtain.writeString(str2);
            parcelObtain.writeTypedObject(notification, 0);
            c1607.f5506.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
