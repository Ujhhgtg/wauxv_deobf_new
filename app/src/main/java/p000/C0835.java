package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0835 implements InterfaceC0834, InterfaceC0836 {

    public final /* synthetic */ int f3230 = 0;

    public ClipData f3231;

    public int f3232;

    public int f3233;

    public Uri f3234;

    public Bundle f3235;

    public /* synthetic */ C0835() {
    }

    @Override // p000.InterfaceC0834
    public C0837 build() {
        return new C0837(new C0835(this));
    }

    @Override // p000.InterfaceC0834
    public void setExtras(Bundle bundle) {
        this.f3235 = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (0) {
            case 1:
                Uri uri = this.f3234;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f3231.getDescription());
                sb.append(", source=");
                int i = this.f3232;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.f3233;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC2784.m4752(sb, this.f3235 != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0836
    public ClipData mo1098() {
        return this.f3231;
    }

    @Override // p000.InterfaceC0834
    public void mo1103(Uri uri) {
        this.f3234 = uri;
    }

    @Override // p000.InterfaceC0834
    public void mo1104(int i) {
        this.f3233 = i;
    }

    @Override // p000.InterfaceC0836
    public int mo1109() {
        return this.f3233;
    }

    @Override // p000.InterfaceC0836
    public ContentInfo mo1112() {
        return null;
    }

    @Override // p000.InterfaceC0836
    public int mo1116() {
        return this.f3232;
    }

    public C0835(C0835 c0835) {
        ClipData clipData = c0835.f3231;
        
        this.f3231 = clipData;
        int i = c0835.f3232;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f3232 = i;
        int i2 = c0835.f3233;
        if ((i2 & 1) == i2) {
            this.f3233 = i2;
            this.f3234 = c0835.f3234;
            this.f3235 = c0835.f3235;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
