package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.AbstractC1887feyxiexzfUjhhgtg;
import p000.C1886feyxiexzfUjhhgtg;
import p000.InterfaceC1869feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1887feyxiexzfUjhhgtg abstractC1887feyxiexzfUjhhgtg) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1869feyxiexzfUjhhgtg interfaceC1869feyxiexzfUjhhgtgM3215Ujhhgtgfeyxiexzf = remoteActionCompat.f239Ujhhgtgfeyxiexzf;
        boolean z = true;
        if (abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(1)) {
            interfaceC1869feyxiexzfUjhhgtgM3215Ujhhgtgfeyxiexzf = abstractC1887feyxiexzfUjhhgtg.m3215Ujhhgtgfeyxiexzf();
        }
        remoteActionCompat.f239Ujhhgtgfeyxiexzf = (IconCompat) interfaceC1869feyxiexzfUjhhgtgM3215Ujhhgtgfeyxiexzf;
        CharSequence charSequence = remoteActionCompat.f240Ujhhgtgfeyxiexzf;
        if (abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf);
        }
        remoteActionCompat.f240Ujhhgtgfeyxiexzf = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f241Ujhhgtgfeyxiexzf;
        if (abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf);
        }
        remoteActionCompat.f241Ujhhgtgfeyxiexzf = charSequence2;
        remoteActionCompat.f242Ujhhgtgfeyxiexzf = (PendingIntent) abstractC1887feyxiexzfUjhhgtg.m3214Ujhhgtgfeyxiexzf(remoteActionCompat.f242Ujhhgtgfeyxiexzf, 4);
        boolean z2 = remoteActionCompat.f243Ujhhgtgfeyxiexzf;
        if (abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(5)) {
            z2 = ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.readInt() != 0;
        }
        remoteActionCompat.f243Ujhhgtgfeyxiexzf = z2;
        boolean z3 = remoteActionCompat.f244Ujhhgtgfeyxiexzf;
        if (!abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(6)) {
            z = z3;
        } else if (((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f244Ujhhgtgfeyxiexzf = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1887feyxiexzfUjhhgtg abstractC1887feyxiexzfUjhhgtg) {
        abstractC1887feyxiexzfUjhhgtg.getClass();
        IconCompat iconCompat = remoteActionCompat.f239Ujhhgtgfeyxiexzf;
        abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(1);
        abstractC1887feyxiexzfUjhhgtg.m3216Ujhhgtgfeyxiexzf(iconCompat);
        CharSequence charSequence = remoteActionCompat.f240Ujhhgtgfeyxiexzf;
        abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(2);
        Parcel parcel = ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f241Ujhhgtgfeyxiexzf;
        abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f242Ujhhgtgfeyxiexzf;
        abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f243Ujhhgtgfeyxiexzf;
        abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f244Ujhhgtgfeyxiexzf;
        abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
