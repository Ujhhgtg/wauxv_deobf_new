package p000;

import android.content.ComponentName;
import android.content.Intent;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0312 extends AbstractC2867 implements InterfaceC1602 {

    public static final C0312 f1549;

    public static final String f1550;

    public static final String f1551;

    public static final String f1552;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1549 = new C0312("AutoSelectOriginalPhotoHook");
        f1550 = "聊天";
        f1551 = "自动勾选原图";
        f1552 = "在发送图片和视频时自动勾选原图选项";
    }

    @Override // p000.InterfaceC1602
    public final void mo1407(C1563 c1563, Intent intent) {
        String[] strArr = AbstractC1574.f5469;
        if (mo3264()) {
            ComponentName component = intent.getComponent();
            String className = component != null ? component.getClassName() : null;
            if (className != null) {
                int iHashCode = className.hashCode();
                if (iHashCode != 812972616) {
                    if (iHashCode != 1600608476 || !className.equals("com.tencent.mm.plugin.gallery.ui.ImagePreviewUI")) {
                        return;
                    }
                } else if (!className.equals("com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI")) {
                    return;
                }
                intent.putExtra("send_raw_img", true);
            }
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1552;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1551;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1550;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
