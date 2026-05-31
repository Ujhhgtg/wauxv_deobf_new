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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲁᲇᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2135 implements InterfaceC1601, InterfaceC2333, InterfaceC2462, InterfaceC1263, InterfaceC2700, InterfaceC2028, InterfaceC3609 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C2135 f7054;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C2135 f7055;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7056;

    public /* synthetic */ C2135(int i) {
        this.f7056 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final void m4076(ViewGroup viewGroup) {
        int i = C2871.f9172;
        viewGroup.removeAllViews();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static RectF m4077(C2950 c2950, View view) {
        if (view == null) {
            return new RectF();
        }
        if (c2950.f9463 || !(view instanceof C2949)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        C2949 c2949 = (C2949) view;
        int contentWidth = c2949.getContentWidth();
        int contentHeight = c2949.getContentHeight();
        int iM3383 = (int) AbstractC1471.m3383(c2949.getContext(), 24);
        if (contentWidth < iM3383) {
            contentWidth = iM3383;
        }
        int right = (c2949.getRight() + c2949.getLeft()) / 2;
        int bottom = (c2949.getBottom() + c2949.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static Path m4078(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // p000.InterfaceC2462
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo3553() {
        switch (this.f7056) {
            case 7:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // p000.InterfaceC2462
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo3554(int i, Object obj) {
        String str;
        switch (this.f7056) {
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

    @Override // p000.InterfaceC3609
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void mo4081(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f7056) {
            case 27:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(new C3608((ByteBuffer) obj));
                break;
        }
    }

    @Override // p000.InterfaceC1263
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public Object mo1246() {
        try {
            return new C2682(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public InterfaceC1881 mo3502(String str) {
        return C2147.f7090;
    }

    @Override // p000.InterfaceC3609
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void mo4082(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f7056) {
            case 27:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(new C3608((ByteBuffer) obj));
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float mo4083(float f, float f2) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean mo4084(CharSequence charSequence) {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public void mo2875(C2950 c2950, View view, View view2, float f, Drawable drawable) {
        RectF rectFM4077 = m4077(c2950, view);
        RectF rectFM4078 = m4077(c2950, view2);
        drawable.setBounds(AbstractC0172.m1359((int) rectFM4077.left, (int) rectFM4078.left, f), drawable.getBounds().top, AbstractC0172.m1359((int) rectFM4077.right, (int) rectFM4078.right, f), drawable.getBounds().bottom);
    }

    @Override // p000.InterfaceC2028
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public InterfaceC2027 mo1261(C2136 c2136) {
        switch (this.f7056) {
            case 16:
                return new C2896(c2136.m4095(Uri.class, AssetFileDescriptor.class), 0);
            case Opcodes.SIPUSH /* 17 */:
                return new C2896(c2136.m4095(Uri.class, ParcelFileDescriptor.class), 0);
            case Opcodes.LDC /* 18 */:
                return new C2896(c2136.m4095(Uri.class, InputStream.class), 0);
            case Opcodes.FLOAD /* 23 */:
                return new C2896(c2136.m4095(C1479.class, InputStream.class), 1);
            default:
                return new C3574(c2136.m4095(C1479.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    private final void m4079() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    private final void m4080(int i, Object obj) {
    }

    @Override // p000.InterfaceC2333
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1900(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // p000.InterfaceC2700
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // p000.InterfaceC2700
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
