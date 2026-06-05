package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000.AbstractC1887feyxiexzfUjhhgtg;
import p000.C1886feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1887feyxiexzfUjhhgtg abstractC1887feyxiexzfUjhhgtg) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f246Ujhhgtgfeyxiexzf;
        if (abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(1)) {
            i = ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.readInt();
        }
        iconCompat.f246Ujhhgtgfeyxiexzf = i;
        byte[] bArr = iconCompat.f248Ujhhgtgfeyxiexzf;
        if (abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(2)) {
            Parcel parcel = ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f248Ujhhgtgfeyxiexzf = bArr;
        iconCompat.f249Ujhhgtgfeyxiexzf = abstractC1887feyxiexzfUjhhgtg.m3214Ujhhgtgfeyxiexzf(iconCompat.f249Ujhhgtgfeyxiexzf, 3);
        int i3 = iconCompat.f250Ujhhgtgfeyxiexzf;
        if (abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(4)) {
            i3 = ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.readInt();
        }
        iconCompat.f250Ujhhgtgfeyxiexzf = i3;
        int i4 = iconCompat.f251Ujhhgtgfeyxiexzf;
        if (abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(5)) {
            i4 = ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.readInt();
        }
        iconCompat.f251Ujhhgtgfeyxiexzf = i4;
        iconCompat.f252Ujhhgtgfeyxiexzf = (ColorStateList) abstractC1887feyxiexzfUjhhgtg.m3214Ujhhgtgfeyxiexzf(iconCompat.f252Ujhhgtgfeyxiexzf, 6);
        String string = iconCompat.f254Ujhhgtgfeyxiexzf;
        if (abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(7)) {
            string = ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.readString();
        }
        iconCompat.f254Ujhhgtgfeyxiexzf = string;
        String string2 = iconCompat.f255Ujhhgtgfeyxiexzf;
        if (abstractC1887feyxiexzfUjhhgtg.mo3209Ujhhgtgfeyxiexzf(8)) {
            string2 = ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.readString();
        }
        iconCompat.f255Ujhhgtgfeyxiexzf = string2;
        iconCompat.f253Ujhhgtgfeyxiexzf = PorterDuff.Mode.valueOf(iconCompat.f254Ujhhgtgfeyxiexzf);
        switch (iconCompat.f246Ujhhgtgfeyxiexzf) {
            case -1:
                Parcelable parcelable = iconCompat.f249Ujhhgtgfeyxiexzf;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f247Ujhhgtgfeyxiexzf = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f249Ujhhgtgfeyxiexzf;
                if (parcelable2 != null) {
                    iconCompat.f247Ujhhgtgfeyxiexzf = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f248Ujhhgtgfeyxiexzf;
                iconCompat.f247Ujhhgtgfeyxiexzf = bArr3;
                iconCompat.f246Ujhhgtgfeyxiexzf = 3;
                iconCompat.f250Ujhhgtgfeyxiexzf = 0;
                iconCompat.f251Ujhhgtgfeyxiexzf = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f248Ujhhgtgfeyxiexzf, Charset.forName("UTF-16"));
                iconCompat.f247Ujhhgtgfeyxiexzf = str;
                if (iconCompat.f246Ujhhgtgfeyxiexzf == 2 && iconCompat.f255Ujhhgtgfeyxiexzf == null) {
                    iconCompat.f255Ujhhgtgfeyxiexzf = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f247Ujhhgtgfeyxiexzf = iconCompat.f248Ujhhgtgfeyxiexzf;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1887feyxiexzfUjhhgtg abstractC1887feyxiexzfUjhhgtg) {
        abstractC1887feyxiexzfUjhhgtg.getClass();
        iconCompat.f254Ujhhgtgfeyxiexzf = iconCompat.f253Ujhhgtgfeyxiexzf.name();
        switch (iconCompat.f246Ujhhgtgfeyxiexzf) {
            case -1:
                iconCompat.f249Ujhhgtgfeyxiexzf = (Parcelable) iconCompat.f247Ujhhgtgfeyxiexzf;
                break;
            case 1:
            case 5:
                iconCompat.f249Ujhhgtgfeyxiexzf = (Parcelable) iconCompat.f247Ujhhgtgfeyxiexzf;
                break;
            case 2:
                iconCompat.f248Ujhhgtgfeyxiexzf = ((String) iconCompat.f247Ujhhgtgfeyxiexzf).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f248Ujhhgtgfeyxiexzf = (byte[]) iconCompat.f247Ujhhgtgfeyxiexzf;
                break;
            case 4:
            case 6:
                iconCompat.f248Ujhhgtgfeyxiexzf = iconCompat.f247Ujhhgtgfeyxiexzf.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f246Ujhhgtgfeyxiexzf;
        if (-1 != i) {
            abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(1);
            ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.writeInt(i);
        }
        byte[] bArr = iconCompat.f248Ujhhgtgfeyxiexzf;
        if (bArr != null) {
            abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(2);
            Parcel parcel = ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f249Ujhhgtgfeyxiexzf;
        if (parcelable != null) {
            abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(3);
            ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f250Ujhhgtgfeyxiexzf;
        if (i2 != 0) {
            abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(4);
            ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.writeInt(i2);
        }
        int i3 = iconCompat.f251Ujhhgtgfeyxiexzf;
        if (i3 != 0) {
            abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(5);
            ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f252Ujhhgtgfeyxiexzf;
        if (colorStateList != null) {
            abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(6);
            ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f254Ujhhgtgfeyxiexzf;
        if (str != null) {
            abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(7);
            ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.writeString(str);
        }
        String str2 = iconCompat.f255Ujhhgtgfeyxiexzf;
        if (str2 != null) {
            abstractC1887feyxiexzfUjhhgtg.mo3210Ujhhgtgfeyxiexzf(8);
            ((C1886feyxiexzfUjhhgtg) abstractC1887feyxiexzfUjhhgtg).f6311Ujhhgtgfeyxiexzf.writeString(str2);
        }
    }
}
