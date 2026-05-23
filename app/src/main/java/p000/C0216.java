package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0216 {

    public static final PorterDuff.Mode f1336 = PorterDuff.Mode.SRC_IN;

    public static C0216 f1337;

    public C2577 f1338;

    public static synchronized PorterDuffColorFilter m1249(int i, PorterDuff.Mode mode) {
        return C2577.m4586(i, mode);
    }

    public static synchronized void m1250() {
        if (f1337 == null) {
            C0216 c0216 = new C0216();
            f1337 = c0216;
            c0216.f1338 = C2577.m4585();
            C2577 c2577 = f1337.f1338;
            C0215 c0215 = new C0215();
            c0215.f1330 = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
            c0215.f1331 = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            c0215.f1332 = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
            c0215.f1333 = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
            c0215.f1334 = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            c0215.f1335 = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (c2577) {
                c2577.f8178 = c0215;
            }
        }
    }

    public static void m1251(Drawable drawable, C3402 c3402, int[] iArr) {
        PorterDuff.Mode mode = C2577.f8171;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c3402.f10729;
        if (!z && !c3402.f10728) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM4586 = null;
        ColorStateList colorStateList = z ? c3402.f10726 : null;
        PorterDuff.Mode mode2 = c3402.f10728 ? c3402.f10727 : C2577.f8171;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM4586 = C2577.m4586(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM4586);
    }

    public final synchronized Drawable m1252(Context context, int i) {
        return this.f1338.m4588(context, i);
    }
}
