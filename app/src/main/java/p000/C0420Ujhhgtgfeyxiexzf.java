package p000;

import android.content.res.AssetFileDescriptor;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ能不能要点脸ᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0420Ujhhgtgfeyxiexzf implements InterfaceC0603Ujhhgtgfeyxiexzf, InterfaceC1468feyxiexzfUjhhgtg, InterfaceC0850feyxiexzfUjhhgtg, InterfaceC3507feyxiexzfUjhhgtg, InterfaceC1081feyxiexzfUjhhgtg, InterfaceC0288Ujhhgtgfeyxiexzf, InterfaceC1870feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C0420Ujhhgtgfeyxiexzf f2255Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static C0420Ujhhgtgfeyxiexzf f2256Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2257Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0420Ujhhgtgfeyxiexzf(int i) {
        this.f2257Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final void m1731Ujhhgtgfeyxiexzf(ViewGroup viewGroup) {
        int i = C1123feyxiexzfUjhhgtg.f4234Ujhhgtgfeyxiexzf;
        viewGroup.removeAllViews();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static RectF m1732Ujhhgtgfeyxiexzf(C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf, View view) {
        if (view == null) {
            return new RectF();
        }
        if (c1981Ujhhgtgfeyxiexzf.f6535feyxiexzfUjhhgtg || !(view instanceof C1980Ujhhgtgfeyxiexzf)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf = (C1980Ujhhgtgfeyxiexzf) view;
        int contentWidth = c1980Ujhhgtgfeyxiexzf.getContentWidth();
        int contentHeight = c1980Ujhhgtgfeyxiexzf.getContentHeight();
        int iM3278Ujhhgtgfeyxiexzf = (int) AbstractC1937feyxiexzfUjhhgtg.m3278Ujhhgtgfeyxiexzf(c1980Ujhhgtgfeyxiexzf.getContext(), 24);
        if (contentWidth < iM3278Ujhhgtgfeyxiexzf) {
            contentWidth = iM3278Ujhhgtgfeyxiexzf;
        }
        int right = (c1980Ujhhgtgfeyxiexzf.getRight() + c1980Ujhhgtgfeyxiexzf.getLeft()) / 2;
        int bottom = (c1980Ujhhgtgfeyxiexzf.getBottom() + c1980Ujhhgtgfeyxiexzf.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static Path m1733Ujhhgtgfeyxiexzf(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // p000.InterfaceC0850feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public void mo1737Ujhhgtgfeyxiexzf() {
        switch (this.f2257Ujhhgtgfeyxiexzf) {
            case 7:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // p000.InterfaceC0850feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void mo1738Ujhhgtgfeyxiexzf(int i, Object obj) {
        String str;
        switch (this.f2257Ujhhgtgfeyxiexzf) {
            case 7:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override // p000.InterfaceC1870feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public void mo1739Ujhhgtgfeyxiexzf(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f2257Ujhhgtgfeyxiexzf) {
            case 27:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(new C1871feyxiexzfUjhhgtg((ByteBuffer) obj));
                break;
        }
    }

    @Override // p000.InterfaceC3507feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object mo1740Ujhhgtgfeyxiexzf() {
        try {
            return new C0941feyxiexzfUjhhgtg(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.InterfaceC0603Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public InterfaceC0259Ujhhgtgfeyxiexzf mo1741Ujhhgtgfeyxiexzf(String str) {
        return C0405Ujhhgtgfeyxiexzf.f2186Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC1870feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public void mo1742Ujhhgtgfeyxiexzf(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f2257Ujhhgtgfeyxiexzf) {
            case 27:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(new C1871feyxiexzfUjhhgtg((ByteBuffer) obj));
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public float mo1688Ujhhgtgfeyxiexzf(float f, float f2) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean mo1743Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void mo1744Ujhhgtgfeyxiexzf(C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf, View view, View view2, float f, Drawable drawable) {
        RectF rectFM1732Ujhhgtgfeyxiexzf = m1732Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf, view);
        RectF rectFM1732Ujhhgtgfeyxiexzf2 = m1732Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf, view2);
        drawable.setBounds(AbstractC3036feyxiexzfUjhhgtg.m4511Ujhhgtgfeyxiexzf((int) rectFM1732Ujhhgtgfeyxiexzf.left, (int) rectFM1732Ujhhgtgfeyxiexzf2.left, f), drawable.getBounds().top, AbstractC3036feyxiexzfUjhhgtg.m4511Ujhhgtgfeyxiexzf((int) rectFM1732Ujhhgtgfeyxiexzf.right, (int) rectFM1732Ujhhgtgfeyxiexzf2.right, f), drawable.getBounds().bottom);
    }

    @Override // p000.InterfaceC0288Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public InterfaceC0285Ujhhgtgfeyxiexzf mo1497Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        switch (this.f2257Ujhhgtgfeyxiexzf) {
            case 16:
                return new C1147feyxiexzfUjhhgtg(c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(Uri.class, AssetFileDescriptor.class), 0);
            case Opcodes.SIPUSH /* 17 */:
                return new C1147feyxiexzfUjhhgtg(c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(Uri.class, ParcelFileDescriptor.class), 0);
            case Opcodes.LDC /* 18 */:
                return new C1147feyxiexzfUjhhgtg(c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(Uri.class, InputStream.class), 0);
            case Opcodes.FLOAD /* 23 */:
                return new C1147feyxiexzfUjhhgtg(c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(C3598feyxiexzfUjhhgtg.class, InputStream.class), 1);
            default:
                return new C1854Ujhhgtgfeyxiexzf(c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(C3598feyxiexzfUjhhgtg.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    private final void m1734Ujhhgtgfeyxiexzf() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    private final void m1735Ujhhgtgfeyxiexzf(int i, Object obj) {
    }

    @Override // p000.InterfaceC1468feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void mo1736Ujhhgtgfeyxiexzf(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // p000.InterfaceC1081feyxiexzfUjhhgtg
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // p000.InterfaceC1081feyxiexzfUjhhgtg
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
