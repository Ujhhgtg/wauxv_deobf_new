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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲁᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2102 implements InterfaceC1589, InterfaceC2300, InterfaceC2409, InterfaceC1261, InterfaceC2639, InterfaceC1997, InterfaceC3551 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C2102 f6930;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static C2102 f6931;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6932;

    public /* synthetic */ C2102(int i) {
        this.f6932 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final void m3893(ViewGroup viewGroup) {
        int i = 0;
        viewGroup.removeAllViews();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static RectF m3894(C2891 c2891, View view) {
        if (view == null) {
            return new RectF();
        }
        if (c2891.f9296 || !(view instanceof C2890)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        C2890 c2890 = (C2890) view;
        int contentWidth = c2890.getContentWidth();
        int contentHeight = c2890.getContentHeight();
        int iM3180 = (int) AbstractC1459.m3180(c2890.getContext(), 24);
        if (contentWidth < iM3180) {
            contentWidth = iM3180;
        }
        int right = (c2890.getRight() + c2890.getLeft()) / 2;
        int bottom = (c2890.getBottom() + c2890.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static Path m3895(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // p000.InterfaceC1589
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public InterfaceC1855 mo3338() {
        return C2114.f6966;
    }

    @Override // p000.InterfaceC2409
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo3484() {
        switch (this.f6932) {
            case 7:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // p000.InterfaceC2409
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public void mo3485(int i, Object obj) {
        String str;
        switch (this.f6932) {
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

    @Override // p000.InterfaceC1261
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public Object mo1100() {
        try {
            return new C2621(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.InterfaceC3551
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void mo3898(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f6932) {
            case 27:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(new C3550((ByteBuffer) obj));
                break;
        }
    }

    @Override // p000.InterfaceC3551
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void mo3899(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f6932) {
            case 27:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(new C3550((ByteBuffer) obj));
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float mo3900(float f, float f2) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean mo3901(CharSequence charSequence) {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public void mo2732(C2891 c2891, View view, View view2, float f, Drawable drawable) {
        RectF rectFM3894 = m3894(c2891, view);
        RectF rectFM3895 = m3894(c2891, view2);
        drawable.setBounds(AbstractC0164.m1213((int) rectFM3894.left, (int) rectFM3895.left, f), drawable.getBounds().top, AbstractC0164.m1213((int) rectFM3894.right, (int) rectFM3895.right, f), drawable.getBounds().bottom);
    }

    @Override // p000.InterfaceC1997
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public InterfaceC1996 mo1115(C2103 c2103) {
        switch (this.f6932) {
            case 16:
                return new C2836(c2103.m3911(Uri.class, AssetFileDescriptor.class), 0);
            case 17 /* 17 */:
                return new C2836(c2103.m3911(Uri.class, ParcelFileDescriptor.class), 0);
            case 18 /* 18 */:
                return new C2836(c2103.m3911(Uri.class, InputStream.class), 0);
            case 23 /* 23 */:
                return new C2836(c2103.m3911(C1468.class, InputStream.class), 1);
            default:
                return new C3516(c2103.m3911(C1468.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    private final void m3896() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    private final void m3897(int i, Object obj) {
    }

    @Override // p000.InterfaceC2300
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1806(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // p000.InterfaceC2639
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // p000.InterfaceC2639
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
