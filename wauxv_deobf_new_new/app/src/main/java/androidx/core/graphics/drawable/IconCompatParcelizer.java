package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000.AbstractC3604;
import p000.C3605;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC3604 abstractC3604) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f245;
        if (abstractC3604.mo5143(1)) {
            i = ((C3605) abstractC3604).f11290.readInt();
        }
        iconCompat.f245 = i;
        byte[] bArr = iconCompat.f247;
        if (abstractC3604.mo5143(2)) {
            Parcel parcel = ((C3605) abstractC3604).f11290;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f247 = bArr;
        iconCompat.f248 = abstractC3604.m5144(iconCompat.f248, 3);
        int i3 = iconCompat.f249;
        if (abstractC3604.mo5143(4)) {
            i3 = ((C3605) abstractC3604).f11290.readInt();
        }
        iconCompat.f249 = i3;
        int i4 = iconCompat.f250;
        if (abstractC3604.mo5143(5)) {
            i4 = ((C3605) abstractC3604).f11290.readInt();
        }
        iconCompat.f250 = i4;
        iconCompat.f251 = (ColorStateList) abstractC3604.m5144(iconCompat.f251, 6);
        String string = iconCompat.f253;
        if (abstractC3604.mo5143(7)) {
            string = ((C3605) abstractC3604).f11290.readString();
        }
        iconCompat.f253 = string;
        String string2 = iconCompat.f254;
        if (abstractC3604.mo5143(8)) {
            string2 = ((C3605) abstractC3604).f11290.readString();
        }
        iconCompat.f254 = string2;
        iconCompat.f252 = PorterDuff.Mode.valueOf(iconCompat.f253);
        switch (iconCompat.f245) {
            case -1:
                Parcelable parcelable = iconCompat.f248;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f246 = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f248;
                if (parcelable2 != null) {
                    iconCompat.f246 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f247;
                iconCompat.f246 = bArr3;
                iconCompat.f245 = 3;
                iconCompat.f249 = 0;
                iconCompat.f250 = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f247, Charset.forName("UTF-16"));
                iconCompat.f246 = str;
                if (iconCompat.f245 == 2 && iconCompat.f254 == null) {
                    iconCompat.f254 = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f246 = iconCompat.f247;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC3604 abstractC3604) {
        abstractC3604.getClass();
        iconCompat.f253 = iconCompat.f252.name();
        switch (iconCompat.f245) {
            case -1:
                iconCompat.f248 = (Parcelable) iconCompat.f246;
                break;
            case 1:
            case 5:
                iconCompat.f248 = (Parcelable) iconCompat.f246;
                break;
            case 2:
                iconCompat.f247 = ((String) iconCompat.f246).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f247 = (byte[]) iconCompat.f246;
                break;
            case 4:
            case 6:
                iconCompat.f247 = iconCompat.f246.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f245;
        if (-1 != i) {
            abstractC3604.mo5146(1);
            ((C3605) abstractC3604).f11290.writeInt(i);
        }
        byte[] bArr = iconCompat.f247;
        if (bArr != null) {
            abstractC3604.mo5146(2);
            Parcel parcel = ((C3605) abstractC3604).f11290;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f248;
        if (parcelable != null) {
            abstractC3604.mo5146(3);
            ((C3605) abstractC3604).f11290.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f249;
        if (i2 != 0) {
            abstractC3604.mo5146(4);
            ((C3605) abstractC3604).f11290.writeInt(i2);
        }
        int i3 = iconCompat.f250;
        if (i3 != 0) {
            abstractC3604.mo5146(5);
            ((C3605) abstractC3604).f11290.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f251;
        if (colorStateList != null) {
            abstractC3604.mo5146(6);
            ((C3605) abstractC3604).f11290.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f253;
        if (str != null) {
            abstractC3604.mo5146(7);
            ((C3605) abstractC3604).f11290.writeString(str);
        }
        String str2 = iconCompat.f254;
        if (str2 != null) {
            abstractC3604.mo5146(8);
            ((C3605) abstractC3604).f11290.writeString(str2);
        }
    }
}
