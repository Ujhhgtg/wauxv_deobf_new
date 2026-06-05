package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱ要点脸ᛴᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2556feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8287Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2556feyxiexzfUjhhgtg(int i) {
        this.f8287Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v146 */
    /* JADX WARN: Type inference failed for: r1v22 */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        ?? r1;
        String strM4623Ujhhgtgfeyxiexzf;
        ImageView imageView;
        Bitmap bitmapM3830feyxiexzfUjhhgtg;
        int i = this.f8287Ujhhgtgfeyxiexzf;
        Class<Activity> cls = Activity.class;
        int i2 = 0;
        int i3 = 1;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2556feyxiexzfUjhhgtg(i3));
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928353884147025290L, strArr), MagicFactory.get(4928353901326894474L, strArr));
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_auto_login_win, null, false);
                int i4 = R.id.moduleDialogCbAutoLoginWinAutoLoginDevice;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbAutoLoginWinAutoLoginDevice);
                if (materialCheckBox != null) {
                    i4 = R.id.moduleDialogCbAutoLoginWinAutoSyncMsg;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbAutoLoginWinAutoSyncMsg);
                    if (materialCheckBox2 != null) {
                        i4 = R.id.moduleDialogCbAutoLoginWinShowLoginDevice;
                        MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbAutoLoginWinShowLoginDevice);
                        if (materialCheckBox3 != null) {
                            LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                            C0322Ujhhgtgfeyxiexzf c0322Ujhhgtgfeyxiexzf = new C0322Ujhhgtgfeyxiexzf(linearLayout, materialCheckBox, materialCheckBox2, materialCheckBox3, 0);
                            materialCheckBox2.setChecked(C2458feyxiexzfUjhhgtg.f7984Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                            materialCheckBox3.setChecked(C2459feyxiexzfUjhhgtg.f7985Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                            materialCheckBox.setChecked(C2457feyxiexzfUjhhgtg.f7983Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                            C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                            C2460feyxiexzfUjhhgtg.f7986Ujhhgtgfeyxiexzf.getClass();
                            c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C2460feyxiexzfUjhhgtg.f7988Ujhhgtgfeyxiexzf;
                            c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                            c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928902952766145930L, strArr2), new C2977Ujhhgtgfeyxiexzf(4, c0322Ujhhgtgfeyxiexzf));
                            AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                            return c1943Ujhhgtgfeyxiexzf;
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928820197336286602L, strArr2).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i4)));
            case 3:
                Object objM1849Ujhhgtgfeyxiexzf = ((C0578Ujhhgtgfeyxiexzf) obj).m1849Ujhhgtgfeyxiexzf();
                Activity activity = (Activity) (objM1849Ujhhgtgfeyxiexzf instanceof Activity ? objM1849Ujhhgtgfeyxiexzf : null);
                if (activity == null) {
                    Class<Activity> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Activity.class).getName()).toString());
                }
                boolean zM4617Ujhhgtgfeyxiexzf = C2458feyxiexzfUjhhgtg.f7984Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf();
                if (C2459feyxiexzfUjhhgtg.f7985Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
                    r1 = zM4617Ujhhgtgfeyxiexzf;
                    r1 = (zM4617Ujhhgtgfeyxiexzf ? 1 : 0) | 2;
                }
                r1 = zM4617Ujhhgtgfeyxiexzf;
                int i5 = r1;
                if (C2457feyxiexzfUjhhgtg.f7983Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
                    i5 = (r1 == true ? 1 : 0) | 4;
                }
                activity.getIntent().putExtra(MagicFactory.get(4928902939881244042L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf), i5);
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                int i6 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf((C0578Ujhhgtgfeyxiexzf) obj);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Button.class);
                ((Button) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).callOnClick();
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2556feyxiexzfUjhhgtg(7);
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2556feyxiexzfUjhhgtg(9);
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg);
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1659feyxiexzfUjhhgtg(MagicFactory.get(4928408726584427914L, strArr3));
                if (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7378Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7354Ujhhgtgfeyxiexzf)) {
                    c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928409061591877002L, strArr3));
                } else {
                    c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928409074476778890L, strArr3));
                }
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf((C0578Ujhhgtgfeyxiexzf) obj);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Button.class);
                Iterator it = c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf().iterator();
                while (it.hasNext()) {
                    Button button = (Button) ((C3438feyxiexzfUjhhgtg) it.next()).m4939Ujhhgtgfeyxiexzf();
                    if (button != null && button.getVisibility() == 0) {
                        String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        List listM4192Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(MagicFactory.get(4928408619210245514L, strArr4), MagicFactory.get(4928408597735409034L, strArr4), MagicFactory.get(4928408687929722250L, strArr4), MagicFactory.get(4928408662159918474L, strArr4));
                        if (!listM4192Ujhhgtgfeyxiexzf.isEmpty()) {
                            Iterator it2 = listM4192Ujhhgtgfeyxiexzf.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(button.getText(), (String) it2.next(), true)) {
                                    button.performClick();
                                }
                                break;
                            }
                        }
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg2);
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1659feyxiexzfUjhhgtg(MagicFactory.get(4928408133878941066L, strArr5));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928408331447436682L, strArr5));
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2556feyxiexzfUjhhgtg(11);
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2556feyxiexzfUjhhgtg(12));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = (C0394Ujhhgtgfeyxiexzf) obj;
                Class<ImageView> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(ImageView.class));
                Class cls2 = clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : ImageView.class;
                Class<String> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class));
                Class cls3 = clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : String.class;
                Class<Float> clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Float.class));
                Class cls4 = clsM5159Ujhhgtgfeyxiexzf4 != null ? clsM5159Ujhhgtgfeyxiexzf4 : Float.class;
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf5 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.class));
                c0394Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(cls2, cls3, cls4, clsM5159Ujhhgtgfeyxiexzf5 != null ? clsM5159Ujhhgtgfeyxiexzf5 : Boolean.class);
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928257599570183562L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2556feyxiexzfUjhhgtg(14);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928507532307072394L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                c3456feyxiexzfUjhhgtg.m4952Ujhhgtgfeyxiexzf(new C2556feyxiexzfUjhhgtg(15));
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = (C2812Ujhhgtgfeyxiexzf) obj;
                c2812Ujhhgtgfeyxiexzf.getClass();
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf2.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928507227364394378L, strArr6));
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928507274609034634L, strArr6));
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf.f8950Ujhhgtgfeyxiexzf;
                if (c0300Ujhhgtgfeyxiexzf == null) {
                    c0300Ujhhgtgfeyxiexzf = new C0300Ujhhgtgfeyxiexzf();
                }
                c2812Ujhhgtgfeyxiexzf.f8950Ujhhgtgfeyxiexzf = c0300Ujhhgtgfeyxiexzf;
                c0300Ujhhgtgfeyxiexzf.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf2);
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf3.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928507373393282442L, strArr6));
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928507433522824586L, strArr6));
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf2 = c2812Ujhhgtgfeyxiexzf.f8950Ujhhgtgfeyxiexzf;
                if (c0300Ujhhgtgfeyxiexzf2 == null) {
                    c0300Ujhhgtgfeyxiexzf2 = new C0300Ujhhgtgfeyxiexzf();
                }
                c2812Ujhhgtgfeyxiexzf.f8950Ujhhgtgfeyxiexzf = c0300Ujhhgtgfeyxiexzf2;
                c0300Ujhhgtgfeyxiexzf2.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf3);
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2556feyxiexzfUjhhgtg(17);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg2 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg2.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928494385412179338L, strArr7));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf2 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf2.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928490885013833098L, strArr7), MagicFactory.get(4928490923668538762L, strArr7));
                c3456feyxiexzfUjhhgtg2.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_bottom_tab_custom, null, false);
                int i8 = R.id.moduleDialogCbBottomTabViewHideTab;
                MaterialCheckBox materialCheckBox4 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogCbBottomTabViewHideTab);
                if (materialCheckBox4 != null) {
                    i8 = R.id.moduleDialogCbBottomTabViewHideTitle;
                    MaterialCheckBox materialCheckBox5 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogCbBottomTabViewHideTitle);
                    if (materialCheckBox5 != null) {
                        i8 = R.id.moduleDialogCbBottomTabViewModIcon;
                        MaterialCheckBox materialCheckBox6 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogCbBottomTabViewModIcon);
                        if (materialCheckBox6 != null) {
                            i8 = R.id.moduleDialogCbBottomTabViewModTitle;
                            MaterialCheckBox materialCheckBox7 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogCbBottomTabViewModTitle);
                            if (materialCheckBox7 != null) {
                                i8 = R.id.moduleDialogEdtBottomTabViewChats;
                                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtBottomTabViewChats);
                                if (textInputEditText != null) {
                                    i8 = R.id.moduleDialogEdtBottomTabViewContacts;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtBottomTabViewContacts);
                                    if (textInputEditText2 != null) {
                                        i8 = R.id.moduleDialogEdtBottomTabViewDiscover;
                                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtBottomTabViewDiscover);
                                        if (textInputEditText3 != null) {
                                            i8 = R.id.moduleDialogEdtBottomTabViewMe;
                                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtBottomTabViewMe);
                                            if (textInputEditText4 != null) {
                                                i8 = R.id.moduleDialogInputBottomTabViewChats;
                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputBottomTabViewChats)) != null) {
                                                    i8 = R.id.moduleDialogInputBottomTabViewContacts;
                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputBottomTabViewContacts)) != null) {
                                                        i8 = R.id.moduleDialogInputBottomTabViewDiscover;
                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputBottomTabViewDiscover)) != null) {
                                                            i8 = R.id.moduleDialogInputBottomTabViewMe;
                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputBottomTabViewMe)) != null) {
                                                                LinearLayout linearLayout2 = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf2;
                                                                C0329Ujhhgtgfeyxiexzf c0329Ujhhgtgfeyxiexzf = new C0329Ujhhgtgfeyxiexzf(linearLayout2, materialCheckBox4, materialCheckBox5, materialCheckBox6, materialCheckBox7, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4);
                                                                textInputEditText.setText(C2670feyxiexzfUjhhgtg.f8542Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText2.setText(C2671Ujhhgtgfeyxiexzf.f8543Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText3.setText(C2672Ujhhgtgfeyxiexzf.f8544Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText4.setText(C2675Ujhhgtgfeyxiexzf.f8547Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                materialCheckBox6.setChecked(C2676feyxiexzfUjhhgtg.f8548Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                                                materialCheckBox7.setChecked(C2575Ujhhgtgfeyxiexzf.f8326Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                                                materialCheckBox5.setChecked(C2674feyxiexzfUjhhgtg.f8546Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                                                materialCheckBox4.setChecked(C2673feyxiexzfUjhhgtg.f8545Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                                                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                                                                C2576Ujhhgtgfeyxiexzf.f8327Ujhhgtgfeyxiexzf.getClass();
                                                                c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C2576Ujhhgtgfeyxiexzf.f8335Ujhhgtgfeyxiexzf;
                                                                c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = linearLayout2;
                                                                c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928376471380034954L, strArr8), new C2977Ujhhgtgfeyxiexzf(5, c0329Ujhhgtgfeyxiexzf));
                                                                c0290Ujhhgtgfeyxiexzf2.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928376458495133066L, strArr8), new C2975feyxiexzfUjhhgtg(10));
                                                                C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                                                                c0290Ujhhgtgfeyxiexzf2.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                                                return c1943Ujhhgtgfeyxiexzf;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928820334775240074L, strArr8).concat(viewM2416Ujhhgtgfeyxiexzf2.getResources().getResourceName(i8)));
            case 19:
                C2576Ujhhgtgfeyxiexzf c2576Ujhhgtgfeyxiexzf = C2576Ujhhgtgfeyxiexzf.f8327Ujhhgtgfeyxiexzf;
                Object objM1849Ujhhgtgfeyxiexzf2 = ((C0578Ujhhgtgfeyxiexzf) obj).m1849Ujhhgtgfeyxiexzf();
                if (!(objM1849Ujhhgtgfeyxiexzf2 instanceof RelativeLayout)) {
                    objM1849Ujhhgtgfeyxiexzf2 = null;
                }
                RelativeLayout relativeLayout = (RelativeLayout) objM1849Ujhhgtgfeyxiexzf2;
                Class<RelativeLayout> cls5 = RelativeLayout.class;
                if (relativeLayout == null) {
                    Class<RelativeLayout> clsM5159Ujhhgtgfeyxiexzf6 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls5));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf6 != null ? clsM5159Ujhhgtgfeyxiexzf6 : RelativeLayout.class).getName()).toString());
                }
                if (C2673feyxiexzfUjhhgtg.f8545Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
                    int childCount = relativeLayout.getChildCount();
                    while (i2 < childCount) {
                        relativeLayout.getChildAt(i2).setVisibility(8);
                        i2++;
                    }
                } else {
                    int i9 = 0;
                    for (int i10 = 4; i9 < i10; i10 = 4) {
                        if (C2676feyxiexzfUjhhgtg.f8548Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf() && (imageView = (ImageView) AbstractC1896feyxiexzfUjhhgtg.m3232Ujhhgtgfeyxiexzf(relativeLayout, new int[]{0, i9, 0, 0, 0})) != null) {
                            imageView.setVisibility(i10);
                            ViewParent parent = imageView.getParent();
                            if (!(parent instanceof RelativeLayout)) {
                                parent = null;
                            }
                            RelativeLayout relativeLayout2 = (RelativeLayout) parent;
                            if (relativeLayout2 == null) {
                                Class<RelativeLayout> clsM5159Ujhhgtgfeyxiexzf7 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls5));
                                throw new IllegalStateException(("This view's parent is not a type of " + (clsM5159Ujhhgtgfeyxiexzf7 != null ? clsM5159Ujhhgtgfeyxiexzf7 : RelativeLayout.class) + " or is null.").toString());
                            }
                            ImageView imageView2 = new ImageView(relativeLayout2.getContext());
                            imageView2.setLayoutParams(imageView.getLayoutParams());
                            if (i9 == 0) {
                                c2576Ujhhgtgfeyxiexzf.getClass();
                                bitmapM3830feyxiexzfUjhhgtg = (Bitmap) C2576Ujhhgtgfeyxiexzf.f8330Ujhhgtgfeyxiexzf.getValue();
                            } else if (i9 == 1) {
                                c2576Ujhhgtgfeyxiexzf.getClass();
                                bitmapM3830feyxiexzfUjhhgtg = (Bitmap) C2576Ujhhgtgfeyxiexzf.f8331Ujhhgtgfeyxiexzf.getValue();
                            } else if (i9 == 2) {
                                c2576Ujhhgtgfeyxiexzf.getClass();
                                bitmapM3830feyxiexzfUjhhgtg = (Bitmap) C2576Ujhhgtgfeyxiexzf.f8332Ujhhgtgfeyxiexzf.getValue();
                            } else if (i9 != 3) {
                                c2576Ujhhgtgfeyxiexzf.getClass();
                                bitmapM3830feyxiexzfUjhhgtg = C2576Ujhhgtgfeyxiexzf.m3830feyxiexzfUjhhgtg();
                            } else {
                                c2576Ujhhgtgfeyxiexzf.getClass();
                                bitmapM3830feyxiexzfUjhhgtg = (Bitmap) C2576Ujhhgtgfeyxiexzf.f8333Ujhhgtgfeyxiexzf.getValue();
                            }
                            imageView2.setImageBitmap(bitmapM3830feyxiexzfUjhhgtg);
                            relativeLayout2.addView(imageView2, 0);
                        }
                        TextView textView = (TextView) AbstractC1896feyxiexzfUjhhgtg.m3232Ujhhgtgfeyxiexzf(relativeLayout, new int[]{0, i9, 0, 1});
                        if (textView != null) {
                            if (C2674feyxiexzfUjhhgtg.f8546Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
                                textView.setVisibility(8);
                            } else if (C2575Ujhhgtgfeyxiexzf.f8326Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
                                if (i9 == 0) {
                                    strM4623Ujhhgtgfeyxiexzf = C2670feyxiexzfUjhhgtg.f8542Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
                                } else if (i9 == 1) {
                                    strM4623Ujhhgtgfeyxiexzf = C2671Ujhhgtgfeyxiexzf.f8543Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
                                } else if (i9 != 2) {
                                    strM4623Ujhhgtgfeyxiexzf = i9 != 3 ? MagicFactory.get(4928376445610231178L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf) : C2675Ujhhgtgfeyxiexzf.f8547Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
                                } else {
                                    strM4623Ujhhgtgfeyxiexzf = C2672Ujhhgtgfeyxiexzf.f8544Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
                                }
                                textView.setText(strM4623Ujhhgtgfeyxiexzf);
                            }
                        }
                        i9++;
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf3 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_bottom_tab_material, null, false);
                int i11 = R.id.moduleDialogEdtBottomTabViewBottomDarkColor;
                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtBottomTabViewBottomDarkColor);
                if (textInputEditText5 != null) {
                    i11 = R.id.moduleDialogEdtBottomTabViewBottomLightColor;
                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtBottomTabViewBottomLightColor);
                    if (textInputEditText6 != null) {
                        i11 = R.id.moduleDialogEdtBottomTabViewIconDarkColor;
                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtBottomTabViewIconDarkColor);
                        if (textInputEditText7 != null) {
                            i11 = R.id.moduleDialogEdtBottomTabViewIconLightColor;
                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtBottomTabViewIconLightColor);
                            if (textInputEditText8 != null) {
                                i11 = R.id.moduleDialogEdtBottomTabViewSelectDarkColor;
                                TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtBottomTabViewSelectDarkColor);
                                if (textInputEditText9 != null) {
                                    i11 = R.id.moduleDialogEdtBottomTabViewSelectLightColor;
                                    TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtBottomTabViewSelectLightColor);
                                    if (textInputEditText10 != null) {
                                        i11 = R.id.moduleDialogInputBottomTabViewBottomDarkColor;
                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogInputBottomTabViewBottomDarkColor)) != null) {
                                            i11 = R.id.moduleDialogInputBottomTabViewBottomLightColor;
                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogInputBottomTabViewBottomLightColor)) != null) {
                                                i11 = R.id.moduleDialogInputBottomTabViewIconDarkColor;
                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogInputBottomTabViewIconDarkColor)) != null) {
                                                    i11 = R.id.moduleDialogInputBottomTabViewIconLightColor;
                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogInputBottomTabViewIconLightColor)) != null) {
                                                        i11 = R.id.moduleDialogInputBottomTabViewSelectDarkColor;
                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogInputBottomTabViewSelectDarkColor)) != null) {
                                                            i11 = R.id.moduleDialogInputBottomTabViewSelectLightColor;
                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogInputBottomTabViewSelectLightColor)) != null) {
                                                                LinearLayout linearLayout3 = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf3;
                                                                C0321Ujhhgtgfeyxiexzf c0321Ujhhgtgfeyxiexzf = new C0321Ujhhgtgfeyxiexzf(linearLayout3, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10);
                                                                textInputEditText6.setText(C2561Ujhhgtgfeyxiexzf.f8303Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText10.setText(C2560Ujhhgtgfeyxiexzf.f8302Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText8.setText(C2558Ujhhgtgfeyxiexzf.f8289Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText5.setText(C2580Ujhhgtgfeyxiexzf.f8347Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText9.setText(C2557Ujhhgtgfeyxiexzf.f8288Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText7.setText(C2562Ujhhgtgfeyxiexzf.f8304Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf3 = new C0290Ujhhgtgfeyxiexzf();
                                                                C2559Ujhhgtgfeyxiexzf.f8290Ujhhgtgfeyxiexzf.getClass();
                                                                c0290Ujhhgtgfeyxiexzf3.f1721Ujhhgtgfeyxiexzf = C2559Ujhhgtgfeyxiexzf.f8298Ujhhgtgfeyxiexzf;
                                                                c0290Ujhhgtgfeyxiexzf3.f1723Ujhhgtgfeyxiexzf = linearLayout3;
                                                                c0290Ujhhgtgfeyxiexzf3.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928364707464611210L, strArr9), new C2977Ujhhgtgfeyxiexzf(6, c0321Ujhhgtgfeyxiexzf));
                                                                c0290Ujhhgtgfeyxiexzf3.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928364694579709322L, strArr9), new C2975feyxiexzfUjhhgtg(16));
                                                                C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf3, null, 3);
                                                                c0290Ujhhgtgfeyxiexzf3.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                                                return c1943Ujhhgtgfeyxiexzf;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928819372702565770L, strArr9).concat(viewM2416Ujhhgtgfeyxiexzf3.getResources().getResourceName(i11)));
            case Opcodes.ILOAD /* 21 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2556feyxiexzfUjhhgtg(22);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2556feyxiexzfUjhhgtg(23));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = (C0394Ujhhgtgfeyxiexzf) obj;
                c0394Ujhhgtgfeyxiexzf4.m1655Ujhhgtgfeyxiexzf(1);
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf4.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928506072018191754L, strArr10), MagicFactory.get(4928506123557799306L, strArr10));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2556feyxiexzfUjhhgtg(25);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C2556feyxiexzfUjhhgtg(26));
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928506398435706250L, strArr11), MagicFactory.get(4928509847294444938L, strArr11), MagicFactory.get(4928509812934706570L, strArr11));
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(i3);
                return c1943Ujhhgtgfeyxiexzf;
            default:
                Object objM1849Ujhhgtgfeyxiexzf3 = ((C0578Ujhhgtgfeyxiexzf) obj).m1849Ujhhgtgfeyxiexzf();
                Activity activity2 = (Activity) (objM1849Ujhhgtgfeyxiexzf3 instanceof Activity ? objM1849Ujhhgtgfeyxiexzf3 : null);
                if (activity2 == null) {
                    Class<Activity> clsM5159Ujhhgtgfeyxiexzf8 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf8 != null ? clsM5159Ujhhgtgfeyxiexzf8 : Activity.class).getName()).toString());
                }
                Intent intent = activity2.getIntent();
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                intent.putExtra(MagicFactory.get(4928865917263152522L, strArr12), MagicFactory.get(4928864886471001482L, strArr12));
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
