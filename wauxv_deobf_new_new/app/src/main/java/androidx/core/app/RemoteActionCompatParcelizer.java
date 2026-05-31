package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.AbstractC3604;
import p000.C3605;
import p000.InterfaceC3606;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC3604 abstractC3604) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC3606 interfaceC3606M5145 = remoteActionCompat.f238;
        boolean z = true;
        if (abstractC3604.mo5143(1)) {
            interfaceC3606M5145 = abstractC3604.m5145();
        }
        remoteActionCompat.f238 = (IconCompat) interfaceC3606M5145;
        CharSequence charSequence = remoteActionCompat.f239;
        if (abstractC3604.mo5143(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3605) abstractC3604).f11290);
        }
        remoteActionCompat.f239 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f240;
        if (abstractC3604.mo5143(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3605) abstractC3604).f11290);
        }
        remoteActionCompat.f240 = charSequence2;
        remoteActionCompat.f241 = (PendingIntent) abstractC3604.m5144(remoteActionCompat.f241, 4);
        boolean z2 = remoteActionCompat.f242;
        if (abstractC3604.mo5143(5)) {
            z2 = ((C3605) abstractC3604).f11290.readInt() != 0;
        }
        remoteActionCompat.f242 = z2;
        boolean z3 = remoteActionCompat.f243;
        if (!abstractC3604.mo5143(6)) {
            z = z3;
        } else if (((C3605) abstractC3604).f11290.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f243 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC3604 abstractC3604) {
        abstractC3604.getClass();
        IconCompat iconCompat = remoteActionCompat.f238;
        abstractC3604.mo5146(1);
        abstractC3604.m5147(iconCompat);
        CharSequence charSequence = remoteActionCompat.f239;
        abstractC3604.mo5146(2);
        Parcel parcel = ((C3605) abstractC3604).f11290;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f240;
        abstractC3604.mo5146(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f241;
        abstractC3604.mo5146(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f242;
        abstractC3604.mo5146(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f243;
        abstractC3604.mo5146(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
