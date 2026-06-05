package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲ要点脸ᛴᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2364Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final PorterDuff.Mode f7707Ujhhgtgfeyxiexzf = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C2364Ujhhgtgfeyxiexzf f7708Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C0883feyxiexzfUjhhgtg f7709Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m3586Ujhhgtgfeyxiexzf(int i, PorterDuff.Mode mode) {
        return C0883feyxiexzfUjhhgtg.m2356Ujhhgtgfeyxiexzf(i, mode);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static synchronized void m3587Ujhhgtgfeyxiexzf() {
        if (f7708Ujhhgtgfeyxiexzf == null) {
            C2364Ujhhgtgfeyxiexzf c2364Ujhhgtgfeyxiexzf = new C2364Ujhhgtgfeyxiexzf();
            f7708Ujhhgtgfeyxiexzf = c2364Ujhhgtgfeyxiexzf;
            c2364Ujhhgtgfeyxiexzf.f7709Ujhhgtgfeyxiexzf = C0883feyxiexzfUjhhgtg.m2355Ujhhgtgfeyxiexzf();
            C0883feyxiexzfUjhhgtg c0883feyxiexzfUjhhgtg = f7708Ujhhgtgfeyxiexzf.f7709Ujhhgtgfeyxiexzf;
            C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf = new C2363Ujhhgtgfeyxiexzf();
            c2363Ujhhgtgfeyxiexzf.f7701Ujhhgtgfeyxiexzf = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
            c2363Ujhhgtgfeyxiexzf.f7702Ujhhgtgfeyxiexzf = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            c2363Ujhhgtgfeyxiexzf.f7703Ujhhgtgfeyxiexzf = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
            c2363Ujhhgtgfeyxiexzf.f7704Ujhhgtgfeyxiexzf = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
            c2363Ujhhgtgfeyxiexzf.f7705Ujhhgtgfeyxiexzf = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            c2363Ujhhgtgfeyxiexzf.f7706Ujhhgtgfeyxiexzf = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (c0883feyxiexzfUjhhgtg) {
                c0883feyxiexzfUjhhgtg.f3422Ujhhgtgfeyxiexzf = c2363Ujhhgtgfeyxiexzf;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m3588Ujhhgtgfeyxiexzf(Drawable drawable, C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf, int[] iArr) {
        PorterDuff.Mode mode = C0883feyxiexzfUjhhgtg.f3415Ujhhgtgfeyxiexzf;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c1741Ujhhgtgfeyxiexzf.f5850Ujhhgtgfeyxiexzf;
        if (!z && !c1741Ujhhgtgfeyxiexzf.f5849Ujhhgtgfeyxiexzf) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM2356Ujhhgtgfeyxiexzf = null;
        ColorStateList colorStateList = z ? c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf : null;
        PorterDuff.Mode mode2 = c1741Ujhhgtgfeyxiexzf.f5849Ujhhgtgfeyxiexzf ? c1741Ujhhgtgfeyxiexzf.f5848Ujhhgtgfeyxiexzf : C0883feyxiexzfUjhhgtg.f3415Ujhhgtgfeyxiexzf;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM2356Ujhhgtgfeyxiexzf = C0883feyxiexzfUjhhgtg.m2356Ujhhgtgfeyxiexzf(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM2356Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final synchronized Drawable m3589Ujhhgtgfeyxiexzf(Context context, int i) {
        return this.f7709Ujhhgtgfeyxiexzf.m2358Ujhhgtgfeyxiexzf(context, i);
    }
}
