package p000;

import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3611 extends AbstractC2867 implements InterfaceC1587 {

    public static final C3611 f11291;

    public static final String f11292;

    public static final String f11293;

    public static final String f11294;

    public static final String f11295;

    public static final C3424 f11296;

    static {
        String[] strArr = AbstractC1574.f5469;
        f11291 = new C3611("VnHomeShareMenuCopyOrDownHook");
        C2873 c2873 = AbstractC2342.f7529;
        f11292 = AbstractC2342.m4330("Download", "VideoNumber");
        f11293 = "视频号";
        f11294 = "主页分享菜单复制下载";
        f11295 = "为视频号菜单添加复制链接或下载视频";
        f11296 = new C3424(27);
    }

    public final List m5218() {
        if (!mo3264()) {
            return C1189.f4329;
        }
        String[] strArr = AbstractC1574.f5469;
        return AbstractC0745.listOf(new C1339(R.id.MenuItem_VideoNumber_CopyLink, "复制链接", R.drawable.ic_menu_copy_24dp, new C1933(24)), new C1339(R.id.MenuItem_VideoNumber_Download, "下载视频", R.drawable.ic_menu_save_24dp, new C1933(25)));
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f11295;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f11294;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f11293;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f11296;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
