package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3697Ujhhgtgfeyxiexzf implements InterfaceC3696feyxiexzfUjhhgtg, InterfaceC3698Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11727Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ClipData f11728Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f11729Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f11730Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Uri f11731Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public Bundle f11732Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3697Ujhhgtgfeyxiexzf() {
    }

    @Override // p000.InterfaceC3696feyxiexzfUjhhgtg
    public C3699feyxiexzfUjhhgtg build() {
        return new C3699feyxiexzfUjhhgtg(new C3697Ujhhgtgfeyxiexzf(this));
    }

    @Override // p000.InterfaceC3696feyxiexzfUjhhgtg
    public void setExtras(Bundle bundle) {
        this.f11732Ujhhgtgfeyxiexzf = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f11727Ujhhgtgfeyxiexzf) {
            case 1:
                Uri uri = this.f11731Ujhhgtgfeyxiexzf;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f11728Ujhhgtgfeyxiexzf.getDescription());
                sb.append(", source=");
                int i = this.f11729Ujhhgtgfeyxiexzf;
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
                int i2 = this.f11730Ujhhgtgfeyxiexzf;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, this.f11732Ujhhgtgfeyxiexzf != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC3698Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public ClipData mo4441Ujhhgtgfeyxiexzf() {
        return this.f11728Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3696feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public void mo4442Ujhhgtgfeyxiexzf(Uri uri) {
        this.f11731Ujhhgtgfeyxiexzf = uri;
    }

    @Override // p000.InterfaceC3696feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public void mo4443Ujhhgtgfeyxiexzf(int i) {
        this.f11730Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3698Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public int mo4444Ujhhgtgfeyxiexzf() {
        return this.f11730Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3698Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public ContentInfo mo4445Ujhhgtgfeyxiexzf() {
        return null;
    }

    @Override // p000.InterfaceC3698Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ */
    public int mo4446Ujhhgtgfeyxiexzf() {
        return this.f11729Ujhhgtgfeyxiexzf;
    }

    public C3697Ujhhgtgfeyxiexzf(C3697Ujhhgtgfeyxiexzf c3697Ujhhgtgfeyxiexzf) {
        ClipData clipData = c3697Ujhhgtgfeyxiexzf.f11728Ujhhgtgfeyxiexzf;
        clipData.getClass();
        this.f11728Ujhhgtgfeyxiexzf = clipData;
        int i = c3697Ujhhgtgfeyxiexzf.f11729Ujhhgtgfeyxiexzf;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f11729Ujhhgtgfeyxiexzf = i;
        int i2 = c3697Ujhhgtgfeyxiexzf.f11730Ujhhgtgfeyxiexzf;
        if ((i2 & 1) == i2) {
            this.f11730Ujhhgtgfeyxiexzf = i2;
            this.f11731Ujhhgtgfeyxiexzf = c3697Ujhhgtgfeyxiexzf.f11731Ujhhgtgfeyxiexzf;
            this.f11732Ujhhgtgfeyxiexzf = c3697Ujhhgtgfeyxiexzf.f11732Ujhhgtgfeyxiexzf;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
