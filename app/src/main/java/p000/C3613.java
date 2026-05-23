package p000;

import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3613 extends AbstractC2867 implements InterfaceC1586 {

    public static final C3613 f11298;

    public static final String f11299;

    public static final String f11300;

    public static final String f11301;

    public static final String f11302;

    public static final C3424 f11303;

    static {
        String[] strArr = AbstractC1574.f5469;
        f11298 = new C3613("VnPreviewShareMenuCopyOrDownHook");
        C2873 c2873 = AbstractC2342.f7529;
        f11299 = AbstractC2342.m4330("Download", "VideoNumber");
        f11300 = "视频号";
        f11301 = "预览分享菜单复制下载";
        f11302 = "为视频号菜单添加复制链接或下载视频";
        f11303 = new C3424(28);
    }

    public final List m5219() {
        if (!mo3264()) {
            return C1189.f4329;
        }
        String[] strArr = AbstractC1574.f5469;
        return AbstractC0745.listOf(new C1334(R.id.MenuItem_VideoNumber_CopyLink, "复制链接", R.drawable.ic_menu_copy_24dp, new C1933(26)), new C1334(R.id.MenuItem_VideoNumber_Download, "下载视频", R.drawable.ic_menu_save_24dp, new C1933(27)));
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f11302;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f11301;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f11300;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f11303;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
