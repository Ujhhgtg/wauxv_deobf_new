package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᲁᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1362 extends AbstractC2867 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C1362 f4862;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f4863;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final List f4864;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2873 f4865;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f4866;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String f4867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final String f4868;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C1338 f4869;

    static {
        AbstractC1574.m3300(-616061519002292L);
        AbstractC1574.m3300(-616104468675252L);
        AbstractC1574.m3300(-616147418348212L);
        AbstractC1574.m3300(-616190368021172L);
        String[] strArr = AbstractC1574.f5469;
        f4862 = new C1362("FloatActionButtonHook");
        C2873 c2873 = AbstractC2342.f7529;
        f4863 = AbstractC2342.m4330("Resource", "Fab");
        f4864 = AbstractC0745.m2212(new C1357(0, "设置", "ic_setting.png", "wauxv", "openSetting"), new C1357(1, "扫一扫", "ic_scan.png", "activity", "com.tencent.mm.plugin.scanner.ui.BaseScanUI"), new C1357(2, "朋友圈", "ic_timeline.png", "activity", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"), new C1357(3, "视频号", "ic_finder.png", "activity", "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"), new C1357(4, "收藏", "ic_favorite.png", "activity", "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI"), new C1357(5, "钱包", "ic_wallet.png", "activity", "com.tencent.mm.plugin.mall.ui.MallIndexUIv2"), new C1357(6, "清空未读", "ic_clear.png", "wauxv", "clearUnreadCount"));
        f4865 = new C2873(new C0104(29));
        f4866 = "界面";
        f4867 = "悬浮动作按钮";
        f4868 = "为主界面右下角添加一个悬浮动作按钮";
        f4869 = new C1338(6);
    }

    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo1691(Activity activity, ViewGroup viewGroup, Object obj) {
        if (mo3264()) {
            ViewParent parent = viewGroup.getParent();
            "null cannot be cast to non-null type android.view.ViewGroup";
            ViewGroup viewGroup2 = (ViewGroup) parent;
            f4862.getClass();
            C0542 c0542 = new C0542(viewGroup2, (List) f4865.getValue(), 11, false);
            Context context = viewGroup2.getContext();
            C1046 c1046 = new C1046(context);
            c1046.f2851 = true;
            c1046.f6517 = new C0373(26);
            c1046.f6518 = 40L;
            c1046.f6519 = 600L;
            c1046.f6520 = 600L;
            c1046.f6521 = -16777216;
            c1046.f6522 = -1;
            EnumC2381 enumC2381 = EnumC2381.f7636;
            c1046.f6526 = enumC2381;
            c1046.f6532 = new ArrayList();
            c1046.setupBaseViews(context);
            Resources.Theme theme = c1046.getContext().getTheme();
            int[] iArr = AbstractC2469.f7876;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
            try {
                c1046.f6518 = typedArrayObtainStyledAttributes.getInteger(3, 40);
                c1046.f6519 = typedArrayObtainStyledAttributes.getInteger(9, 600);
                c1046.f6520 = typedArrayObtainStyledAttributes.getInteger(1, 600);
                c1046.setOpenInterpolatorAnimator(AnimationUtils.loadInterpolator(c1046.getContext(), typedArrayObtainStyledAttributes.getResourceId(10, R.anim.default_menu_interpolator)));
                c1046.setCloseInterpolatorAnimator(AnimationUtils.loadInterpolator(c1046.getContext(), typedArrayObtainStyledAttributes.getResourceId(2, R.anim.default_menu_interpolator)));
                c1046.setMainButtonColor(typedArrayObtainStyledAttributes.getColor(5, -16777216));
                c1046.setMainButtonIconColor(typedArrayObtainStyledAttributes.getColor(7, -1));
                if (typedArrayObtainStyledAttributes.hasValue(6)) {
                    c1046.setMainButtonIcon(c1046.getResources().getDrawable(typedArrayObtainStyledAttributes.getResourceId(6, 0), null));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(11, 0);
                for (EnumC2381 enumC2382 : EnumC2381.values()) {
                    if (enumC2382.ordinal() == integer) {
                        enumC2381 = enumC2382;
                        break;
                    }
                }
                c1046.setPositionGravity(enumC2381);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = c1046.getContext().getTheme().obtainStyledAttributes(null, iArr, 0, 0);
                try {
                    int integer2 = typedArrayObtainStyledAttributes2.getInteger(4, 1);
                    EnumC1256 enumC1256 = EnumC1256.f4573;
                    if (integer2 != 0) {
                        enumC1256 = EnumC1256.f4574;
                    }
                    c1046.setExpandDirection(enumC1256);
                    c1046.f3815 = typedArrayObtainStyledAttributes2.getLayoutDimension(8, (int) c1046.getResources().getDimension(R.dimen.default_margin_between_menu_items));
                    typedArrayObtainStyledAttributes2.recycle();
                    c1046.setMainButtonColor(Color.parseColor((AbstractC3681.m5331(c1046.getContext()) ? C1358.f4858 : C1359.f4859).m2542()));
                    c1046.setMainButtonIcon(c1046.getContext().getDrawable(R.drawable.ic_float_button_icon_24dp));
                    c1046.setMainButtonIconColor(Color.parseColor((AbstractC3681.m5331(c1046.getContext()) ? C1360.f4860 : C1361.f4861).m2542()));
                    c1046.setDelayBetweenItemsAnimation(20L);
                    c1046.setOpenAnimationDuration(300L);
                    c1046.setCloseAnimationDuration(300L);
                    c1046.setMarginBetweenMenuItems((int) AbstractC3681.m5322(64, c1046.getContext()));
                    c1046.setPositionGravity(EnumC2381.f7640);
                    c1046.setAdapter(c0542);
                    c1046.setOnItemSelectedListener(new C1514(c1046, 1, c0542));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 8388693;
                    layoutParams.bottomMargin = (int) AbstractC3681.m5322(64, viewGroup2.getContext());
                    layoutParams.rightMargin = (int) AbstractC3681.m5322(8, viewGroup2.getContext());
                    viewGroup2.addView(c1046, layoutParams);
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f4868;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f4867;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f4866;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f4869;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
