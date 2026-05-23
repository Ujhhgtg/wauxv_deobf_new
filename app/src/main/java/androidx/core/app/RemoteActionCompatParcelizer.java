package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.AbstractC3546;
import p000.C3547;
import p000.InterfaceC3548;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC3546 abstractC3546) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC3548 interfaceC3548M5139 = remoteActionCompat.f238;
        boolean z = true;
        if (abstractC3546.mo5137(1)) {
            interfaceC3548M5139 = abstractC3546.m5139();
        }
        remoteActionCompat.f238 = (IconCompat) interfaceC3548M5139;
        CharSequence charSequence = remoteActionCompat.f239;
        if (abstractC3546.mo5137(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3547) abstractC3546).f11141);
        }
        remoteActionCompat.f239 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f240;
        if (abstractC3546.mo5137(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3547) abstractC3546).f11141);
        }
        remoteActionCompat.f240 = charSequence2;
        remoteActionCompat.f241 = (PendingIntent) abstractC3546.m5138(remoteActionCompat.f241, 4);
        boolean z2 = remoteActionCompat.f242;
        if (abstractC3546.mo5137(5)) {
            z2 = ((C3547) abstractC3546).f11141.readInt() != 0;
        }
        remoteActionCompat.f242 = z2;
        boolean z3 = remoteActionCompat.f243;
        if (!abstractC3546.mo5137(6)) {
            z = z3;
        } else if (((C3547) abstractC3546).f11141.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f243 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC3546 abstractC3546) {
        
        IconCompat iconCompat = remoteActionCompat.f238;
        abstractC3546.mo5140(1);
        abstractC3546.m5141(iconCompat);
        CharSequence charSequence = remoteActionCompat.f239;
        abstractC3546.mo5140(2);
        Parcel parcel = ((C3547) abstractC3546).f11141;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f240;
        abstractC3546.mo5140(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f241;
        abstractC3546.mo5140(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f242;
        abstractC3546.mo5140(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f243;
        abstractC3546.mo5140(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
