package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p000.AbstractC3223feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final PorterDuff.Mode f245Ujhhgtgfeyxiexzf = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Object f247Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public String f255Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f246Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public byte[] f248Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Parcelable f249Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f250Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f251Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public ColorStateList f252Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public PorterDuff.Mode f253Ujhhgtgfeyxiexzf = f245Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public String f254Ujhhgtgfeyxiexzf = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.f246Ujhhgtgfeyxiexzf == -1) {
            return String.valueOf(this.f247Ujhhgtgfeyxiexzf);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f246Ujhhgtgfeyxiexzf) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f246Ujhhgtgfeyxiexzf) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f247Ujhhgtgfeyxiexzf).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f247Ujhhgtgfeyxiexzf).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f255Ujhhgtgfeyxiexzf);
                sb.append(" id=");
                int i = this.f246Ujhhgtgfeyxiexzf;
                if (i == -1) {
                    Object obj = this.f247Ujhhgtgfeyxiexzf;
                    if (Build.VERSION.SDK_INT >= 28) {
                        iIntValue = AbstractC3223feyxiexzfUjhhgtg.m4722Ujhhgtgfeyxiexzf(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon resource", e);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            iIntValue = 0;
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f250Ujhhgtgfeyxiexzf;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f250Ujhhgtgfeyxiexzf);
                if (this.f251Ujhhgtgfeyxiexzf != 0) {
                    sb.append(" off=");
                    sb.append(this.f251Ujhhgtgfeyxiexzf);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f247Ujhhgtgfeyxiexzf);
                break;
        }
        if (this.f252Ujhhgtgfeyxiexzf != null) {
            sb.append(" tint=");
            sb.append(this.f252Ujhhgtgfeyxiexzf);
        }
        if (this.f253Ujhhgtgfeyxiexzf != f245Ujhhgtgfeyxiexzf) {
            sb.append(" mode=");
            sb.append(this.f253Ujhhgtgfeyxiexzf);
        }
        sb.append(")");
        return sb.toString();
    }
}
